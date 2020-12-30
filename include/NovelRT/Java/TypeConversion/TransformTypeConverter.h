#ifndef NOVELRT_TRANSFORMTYPECONVERTER_H
#define NOVELRT_TRANSFORMTYPECONVERTER_H

#include "TypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  using TransformConverter = TypeConverter<Transform, jni::Object<Types::Transform>>;

  template<>
  class TypeConverter<Transform, jni::Object<Types::Transform>> final :
    public TypeConverterBase<Transform, jni::Object<Types::Transform>> {
  public:
    jni::Local<jni::Object<Types::Transform>> fromNative(JNIEnv& env, const Transform& source) const override;

    Transform fromJava(JNIEnv& env, const jni::Object<Types::Transform>& source) const override;
  };
}

#endif //NOVELRT_TRANSFORMTYPECONVERTER_H
