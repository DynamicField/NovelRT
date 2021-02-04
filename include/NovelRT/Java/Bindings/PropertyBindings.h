#ifndef NOVELRT_PROPERTYBINDINGS_H
#define NOVELRT_PROPERTYBINDINGS_H

#include "NovelRT/Java/Types.h"
#include "NovelRT/Java/TypeConversion.h"

namespace NovelRT::Java::Bindings {
  using namespace TypeConversion;

  // Type utilities

#pragma region RemoveNoexcept
  // Removes noexcept from methods.
  // This is exists because, for some awkward reason, methods with a
  // signature containing noexcept do not work when passing them inside template
  // arguments.
  template<typename T>
  struct RemoveNoexcept {
    using type = T;
  };

  template<typename R, typename O, typename ...P>
  struct RemoveNoexcept<R(O::*)(P...) noexcept> {
    using type = R(O::*)(P...);
  };

  template<typename R, typename O, typename ...P>
  struct RemoveNoexcept<R(O::*)(P...) const noexcept> {
    using type = R(O::*)(P...) const;
  };

  template<typename T> using RemoveNoexceptType = typename RemoveNoexcept<T>::type;
#pragma endregion

#pragma region ObjectWrapped
  template<typename T, class Enabled = void>
  struct ObjectWrapped;

  template<typename T> inline constexpr bool WrappingNotNeeded =
    jni::IsPrimitive<T>::value || std::is_base_of_v<jni::jobject, T> ||
    std::is_base_of_v<jni::ObjectBase, T>;

  template<typename T>
  struct ObjectWrapped<T, std::enable_if_t<WrappingNotNeeded<T>>> {
    using Type = T;
  };

  template<typename T>
  struct ObjectWrapped<T, std::enable_if_t<!WrappingNotNeeded<T>>> {
    using Type = jni::Object<T>;
  };

  template<typename T> using ObjectWrappedType = typename ObjectWrapped<T>::Type;
#pragma endregion

  // Properties

  enum PropertyBody {
    None = 0,
    Getter = 1 << 0,
    Setter = 1 << 1,
    Full = Getter + Setter
  };

  template<typename H, typename T, bool Mutable>
  struct PropertyBase {
    using HolderType = H;
    using ReturnType = T;

    static constexpr bool IsMutable = Mutable;
    static constexpr PropertyBody DefaultBody = IsMutable ? Full : Getter;
  };


#pragma region Member type aliases
  // A member method is a method returning a mutable reference to the property value.
  //
  // Note: T may be a reference (Tval& for instance), in that case,
  // reference rules are applied and T& becomes TVal& (& + & = &).

  template<typename H, typename T> using MemberProperty = T& (H::*)();
  // Same thing but readonly, with const on both sides.
  template<typename H, typename T> using ReadonlyMemberProperty = const T& (H::*)() const;

  template<typename H, typename T> using MemberGetter = T(H::*)() const;
  template<typename H, typename T> using MemberSetterRef = void (H::*)(const T&);
  template<typename H, typename T> using MemberSetterVal = void (H::*)(T);

  template<typename H, typename T> using MemberField = T H::*;
  template<typename H, typename T> using ReadonlyMemberField = T H::* const;
#pragma endregion

#pragma region Property
  template<typename F, auto P>
  struct PropertyImpl;

  template<typename H, typename T, auto P>
  struct PropertyImpl<MemberProperty<H, T>, P> : public PropertyBase<H, T, true> {
    static constexpr auto Getter = [](H* holder) -> T& {
      return (holder->*P)();
    };
    static constexpr auto Setter = [](H* holder, const T& value) {
      (holder->*P)() = value;
    };
  };

  template<typename H, typename T, auto P>
  struct PropertyImpl<ReadonlyMemberProperty<H, T>, P> : public PropertyBase<H, T, false> {
    static constexpr auto Getter = [](const H* holder) -> const T& {
      return (holder->*P)();
    };
  };

  template<auto F> using Property = PropertyImpl<RemoveNoexceptType<decltype(F)>, F>;
#pragma endregion

#pragma region TraditionalProperty
  template<typename GT, auto GV, typename ST, auto SV>
  struct TraditionalPropertyImpl;

  template<typename H, typename T, auto GV, auto SV>
  struct TraditionalPropertyImplStandard : public PropertyBase<H, T, true> {
    static constexpr auto Getter = [](H* holder) -> T {
      return (holder->*GV)();
    };
    static constexpr auto Setter = [](H* holder, const T& value) {
      (holder->*SV)(value);
    };
  };

  template<typename H, typename T, auto GV, auto SV>
  struct TraditionalPropertyImpl<MemberGetter<H, T>, GV, MemberSetterRef<H, T>, SV>
    : public TraditionalPropertyImplStandard<H, T, GV, SV> {
  };

  template<typename H, typename T, auto GV, auto SV>
  struct TraditionalPropertyImpl<MemberGetter<H, T>, GV, MemberSetterVal<H, T>, SV>
    : public TraditionalPropertyImplStandard<H, T, GV, SV> {
  };

  template<auto G, auto S> using TraditionalProperty = TraditionalPropertyImpl<
    RemoveNoexceptType<decltype(G)>, G, RemoveNoexceptType<decltype(S)>, S>;
#pragma endregion

#pragma region FieldProperty
  template<typename FT, auto FV>
  struct FieldPropertyImpl;

  template<typename H, typename T, auto P>
  struct FieldPropertyImpl<MemberField<H, T>, P> : public PropertyBase<H, T, true> {
    static constexpr auto Getter = [](H* holder) -> T& {
      return holder->*P;
    };
    static constexpr auto Setter = [](H* holder, const T& value) {
      (holder->*P) = value;
    };
  };

  template<typename H, typename T, auto P>
  struct FieldPropertyImpl<ReadonlyMemberField<H, T>, P> : public PropertyBase<H, T, false> {
    static constexpr auto Getter = [](const H* holder) -> const T& {
      return (holder->*P)();
    };
  };

  template<auto F> using FieldProperty = FieldPropertyImpl<decltype(F), F>;
#pragma endregion

  template<typename H, typename T>
  constexpr inline auto modifiable(MemberProperty<H, T> thing) {
    return static_cast<MemberProperty<H, T>>(thing);
  }

  template<typename H, typename T>
  constexpr inline auto unmodifiable(ReadonlyMemberProperty<H, T> thing) {
    return static_cast<ReadonlyMemberProperty<H, T>>(thing);
  }

  template<
    typename JavaHolder, typename JavaType,
    typename Property,
    PropertyBody Body = Property::DefaultBody,
    typename NovelHolder = typename Property::HolderType,
    typename NovelType = typename Property::ReturnType
  >
  void bindProperty(jni::JNIEnv& env, const std::string& name) {
    if constexpr(Property::IsMutable) {
      bindPropertyGeneric<JavaHolder, JavaType, NovelHolder, NovelType, Property, Body>(env, name);
    } else {
      static_assert((Body & Setter) == 0, "A readonly property cannot bind a setter.");
      bindPropertyGeneric<JavaHolder, JavaType, NovelHolder, NovelType, Property, Getter>(env, name);
    }
  }

  template<
    typename JavaHolder, typename JavaType,
    auto PropertyValue,
    PropertyBody Body = Property<PropertyValue>::DefaultBody
  >
  void bindProperty(jni::JNIEnv& env, const std::string& name) {
    bindProperty<JavaHolder, JavaType, Property<PropertyValue>, Body>(env, name);
  }

  // Actual magic

  template<
    typename JavaHolder, typename JavaType,
    typename NovelHolder, typename NovelType,
    typename Property,
    PropertyBody Body
  >
  void bindPropertyGeneric(jni::JNIEnv& env, const std::string& name) {
    if constexpr((Body & Getter) != 0) {
      bindGetter<JavaHolder, JavaType, NovelHolder, NovelType>(env, name, Property::Getter);
    }
    if constexpr((Body & Setter) != 0 && Property::IsMutable) {
      bindSetter<JavaHolder, JavaType, NovelHolder, NovelType>(env, name, Property::Setter);
    }
  }

  // Accessors

  template<
    typename JavaHolder, typename JavaType,
    typename NovelHolder, typename NovelType,
    typename Getter
  >
  void bindGetter(jni::JNIEnv& env, const std::string& name,
                  Getter novelGetter,
                  const TypeConverter<NovelType, ObjectWrappedType<JavaType>>& typeConverter = {}) {
    std::string getterName = makeGetterName<JavaType>(name);
    const jni::Class<JavaHolder>& typeClass = JavaHolder::javaClass();

    auto getter = [novelGetter, typeConverter, name](jni::JNIEnv& getterEnv, jni::Object<JavaHolder>& self) {
      NovelHolder* holder = Handles::get<NovelHolder>(getterEnv, *self);
      auto&& value = novelGetter(holder);
      return typeConverter.fromNative(getterEnv, std::forward<NovelType>(value));
    };

    std::cout << "Registering getter " << getterName << " (JavaHolder: " << typeid(JavaHolder).name() << ")"
              << std::endl;
    jni::RegisterNatives(env, *typeClass,
                         jni::MakeNativeMethod(getterName.c_str(), getter));
  }

  template<
    typename JavaHolder, typename JavaType,
    typename NovelHolder, typename NovelType,
    typename Setter
  >
  void bindSetter(jni::JNIEnv& env, const std::string& name,
                  Setter novelSetter,
                  const TypeConverter<NovelType, ObjectWrappedType<JavaType>>& typeConverter = {}) {
    std::string setterName = makeSetterName(name);
    const jni::Class<JavaHolder>& typeClass = JavaHolder::javaClass();

    auto setter = [novelSetter, typeConverter, name]
      (jni::JNIEnv& setterEnv, jni::Object<JavaHolder>& self, ObjectWrappedType<JavaType>& value) {
      auto holder = Handles::get<NovelHolder>(setterEnv, *self);
      auto&& convertedValue = typeConverter.fromJava(setterEnv, value);
      novelSetter(holder, std::forward<NovelType>(convertedValue));
    };

    std::cout << "Registering setter " << setterName << " (JavaHolder: " << typeid(JavaHolder).name() << ")"
              << std::endl;
    jni::RegisterNatives(env, *typeClass,
                         jni::MakeNativeMethod(setterName.c_str(), setter));
  }

  template<typename JavaType>
  std::string makeGetterName(const std::string& name) {
    if (name.empty()) {
      throw std::invalid_argument("name is empty");
    }
    std::string getterName(name);
    getterName[0] = static_cast<char>(std::toupper(getterName[0]));

    if constexpr(std::is_same_v<JavaType, jni::jboolean>) {
      getterName = "is" + getterName;
    } else {
      getterName = "get" + getterName;
    }

    return getterName;
  }

  inline std::string makeSetterName(const std::string& name) {
    if (name.empty()) {
      throw std::invalid_argument("name is empty");
    }
    std::string setterName(name);
    setterName[0] = static_cast<char>(std::toupper(setterName[0]));
    setterName = "set" + setterName;

    return setterName;
  }
}

#endif //NOVELRT_PROPERTYBINDINGS_H

