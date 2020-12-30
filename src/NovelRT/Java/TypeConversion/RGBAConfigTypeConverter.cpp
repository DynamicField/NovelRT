#include "NovelRT/Java/TypeConversion/RGBAConfigTypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  jni::Local<jni::Object<Types::RGBAColour>>
  RGBAConfigConverter::fromNative(JNIEnv& env, const Graphics::RGBAConfig& source) const {
    return Types::RGBAColour::javaClass().New(env, Types::RGBAColour::mainConstructor(),
                                              static_cast<jni::jint>(source.getR()),
                                              static_cast<jni::jint>(source.getG()),
                                              static_cast<jni::jint>(source.getB()),
                                              static_cast<jni::jint>(source.getA()));
  }

  Graphics::RGBAConfig RGBAConfigConverter::fromJava(JNIEnv& env, const jni::Object<Types::RGBAColour>& source) const {
    auto rgba = source.Call(env, Types::RGBAColour::asRGBA());

    return fromRGBA(rgba);
  }

  Graphics::RGBAConfig RGBAConfigConverter::fromRGBA(int rgba) const {
    int r = (rgba >> 24) & 0xFF;
    int g = (rgba >> 16) & 0xFF;
    int b = (rgba >> 8) & 0xFF;
    int a = rgba & 0xFF;

    return Graphics::RGBAConfig(r, g, b, a);
  }
}
