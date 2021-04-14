#ifndef NOVELRT_TYPECONVERTER_H
#define NOVELRT_TYPECONVERTER_H

#include "NovelRT/Java/Types.h"

namespace NovelRT::Java::TypeConversion {
  template<typename T>
  struct WrapLocal {
    using Type = T;
  };

  template<typename T>
  struct WrapLocal<jni::Object<T>> {
    using Type = jni::Local<jni::Object<T>>;
  };

  template<typename T> using WrapLocalType = typename WrapLocal<T>::Type;

  template<typename N, typename J>
  class TypeConverterBase {
  public:
    virtual ~TypeConverterBase() = default;

    virtual WrapLocalType<J> fromNative(jni::JNIEnv& env, const N& source) const = 0;

    virtual N fromJava(jni::JNIEnv& env, const J& source) const = 0;
  };

  template<typename N, typename J>
  class TypeConverter : public TypeConverterBase<N, J> {
    std::function<WrapLocalType<J>(jni::JNIEnv&, const N&)> _fromNative;
    std::function<N(jni::JNIEnv&, const J&)> _fromJava;

  public:
    TypeConverter(const std::function<WrapLocalType<J>(jni::JNIEnv&, const N&)>& fromNative,
                  const std::function<N(jni::JNIEnv&, const J&)>& fromJava) :
    _fromNative(fromNative), _fromJava(fromJava) {}

    WrapLocalType<J> fromNative(JNIEnv& env, const N& source) const override {
      return _fromNative(env, source);
    }

    N fromJava(JNIEnv& env, const J& source) const override {
      return _fromJava(env, source);
    }
  };

  template<typename N, typename J>
  WrapLocalType<J> convertToJava(jni::JNIEnv& env, const N& nativeObject) {
    return TypeConverter<N, J>().fromNative(env, nativeObject);
  }

  template<typename N, typename J>
  N convertToNative(jni::JNIEnv& env, const J& javaObject) {
    return TypeConverter<N, J>().fromJava(env, javaObject);
  }
}

#endif //NOVELRT_TYPECONVERTER_H
