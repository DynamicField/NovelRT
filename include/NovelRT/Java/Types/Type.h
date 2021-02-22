#ifndef NOVELRT_TYPE_H
#define NOVELRT_TYPE_H

#include "Definitions.h"

namespace NovelRT::Java::Types {
  template<typename Tag>
  struct Super {
    using SuperTag = Tag;
  };

  template<typename Self>
  struct Type {
    using Class = jni::Class<Self>;
    using Object = jni::Object<Self>;
    template<typename... Args> using Constructor = jni::Constructor<Self, Args...>;
    template<typename Signature> using Method = jni::Method<Self, Signature>;
    template<typename Signature> using StaticMethod = jni::StaticMethod<Self, Signature>;
    template<typename Value> using Field = jni::Field<Self, Value>;
    template<typename Value> using StaticField = jni::StaticField<Self, Value>;

    template<typename Signature> using MethodDef = MethodDefinition<Self, Signature>;
    template<typename Signature> using StaticMethodDef = StaticMethodDefinition<Self, Signature>;
    template<typename... Args> using ConstructorDef = ConstructorDefinition<Self, Args...>;
    template<typename Value> using FieldDef = FieldDefinition<Self, Value>;
    template<typename Value> using StaticFieldDef = StaticFieldDefinition<Self, Value>;

    static const Class& javaClass() {
      static const Class& instance = findClass();
      return instance;
    }

  protected:
    template<typename... Args>
    static const inline Constructor<Args...> findConstructor() {
      std::cout << "Finding constructor in " << Self::Name() << " with signature "
                << jni::TypeSignature<void(Args...)>()() << "..." << std::endl;
      auto env = jni::GetAttachedEnv(*CurrentJavaVM);
      return javaClass().template GetConstructor<Args...>(*env);
    }

  private:
    Type() {}

    static const inline Class& findClass() {
      std::cout << "Finding class " << Self::Name() << "..." << std::endl;
      auto env = jni::GetAttachedEnv(*CurrentJavaVM);
      return jni::Class<Self>::Singleton(*env);
    }
  };
}
#endif //NOVELRT_TYPE_H
