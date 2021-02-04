#include "NovelRT/Java/TypeConversion/Vector2TypeConverter.h"

namespace NovelRT::Java::TypeConversion {
  jni::Local<jni::Object<Types::Vector2>> Vector2Converter::fromNative(
    jni::JNIEnv& env, const Maths::GeoVector2F& source) const {
    return Types::Vector2::javaClass().New(env, Types::Vector2::mainConstructor(), source.x, source.y);
  }

  Maths::GeoVector2F Vector2Converter::fromJava(
    jni::JNIEnv& env, const jni::Object<Types::Vector2>& source) const {
    auto x = source.Get(env, Types::Vector2::x());
    auto y = source.Get(env, Types::Vector2::y());

    return Maths::GeoVector2F(x, y);
  }
}
