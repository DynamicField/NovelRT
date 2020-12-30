#ifndef NOVELRT_BASICTYPECONVERTERS_H
#define NOVELRT_BASICTYPECONVERTERS_H

#include "TypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  template<typename N, typename J>
  class StaticCastingConverter : public TypeConverterBase<N, J> {
  public:
    WrapLocalType<J> fromNative(JNIEnv&, const N& source) const override {
      return static_cast<WrapLocalType<J>>(source);
    }

    N fromJava(JNIEnv&, const J& source) const override {
      return static_cast<N>(source);
    }
  };

  template<typename T>
  class TypeConverter<T, T> : public TypeConverterBase<T, T> {
  public:
    WrapLocalType<T> fromNative(JNIEnv&, const T& source) const override {
      return source;
    }

    T fromJava(JNIEnv&, const T& source) const override {
      return source;
    }
  };

  template<>
  class TypeConverter<int, jni::jint> : public StaticCastingConverter<int, jni::jint> {
  };

  template<>
  class TypeConverter<bool, jni::jboolean> : public StaticCastingConverter<bool, jni::jboolean> {
  };

  template<>
  class TypeConverter<std::string, jni::String> : public TypeConverterBase<std::string, jni::String> {
  public:
    jni::Local<jni::String> fromNative(JNIEnv& env, const std::string& source) const override {
      return jni::Make<jni::String>(env, source);
    }

    std::string fromJava(JNIEnv& env, const jni::String& source) const override {
      return jni::Make<std::string>(env, source);
    }
  };
}

#endif //NOVELRT_BASICTYPECONVERTERS_H
