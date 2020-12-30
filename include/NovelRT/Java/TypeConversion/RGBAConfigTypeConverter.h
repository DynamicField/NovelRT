#ifndef NOVELRT_RGBACONFIGTYPECONVERTER_H
#define NOVELRT_RGBACONFIGTYPECONVERTER_H

#include "TypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  using RGBAConfigConverter = TypeConverter<Graphics::RGBAConfig, jni::Object<Types::RGBAColour>>;

  template<>
  class TypeConverter<Graphics::RGBAConfig, jni::Object<Types::RGBAColour>> final :
    public TypeConverterBase<Graphics::RGBAConfig, jni::Object<Types::RGBAColour>> {
  public:
    Graphics::RGBAConfig fromRGBA(int rgba) const;

    jni::Local<jni::Object<Types::RGBAColour>>
    fromNative(JNIEnv& env, const Graphics::RGBAConfig& source) const override;

    Graphics::RGBAConfig fromJava(JNIEnv& env, const jni::Object<Types::RGBAColour>& source) const override;
  };
}

#endif //NOVELRT_RGBACONFIGTYPECONVERTER_H
