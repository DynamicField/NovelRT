#ifndef NOVELRT_VECTOR2TYPECONVERTER_H
#define NOVELRT_VECTOR2TYPECONVERTER_H

#include "TypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  using Vector2Converter = TypeConverter<Maths::GeoVector2<float>, jni::Object<Types::Vector2>>;

  template<> class TypeConverter<Maths::GeoVector2<float>, jni::Object<Types::Vector2>> final :
    public TypeConverterBase<Maths::GeoVector2<float>, jni::Object<Types::Vector2>> {
  public:
    jni::Local<jni::Object<Types::Vector2>>
    fromNative(jni::JNIEnv& env, const Maths::GeoVector2<float>& source) const override;

    Maths::GeoVector2<float>
    fromJava(jni::JNIEnv& env, const jni::Object<Types::Vector2>& source) const override;
  };
}

#endif //NOVELRT_VECTOR2TYPECONVERTER_H
