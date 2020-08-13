#include "NovelRT/Java/Vector2Serialization.h"

namespace NovelRT::Java::Vector2Serialization {
  using Types::Vector2;

  Maths::GeoVector2<float> fromJava(JNIEnv& env, Vector2::Object& vector2Object) {
    auto x = vector2Object.Get(env, Vector2::x());
    auto y = vector2Object.Get(env, Vector2::y());

    return Maths::GeoVector2<float>(x, y);
  }

  auto fromNative(JNIEnv& env, const Maths::GeoVector2<float>& vector2)
  -> jni::Local<jni::Object<Types::Vector2>> {
    return Vector2::javaClass().New(env, Vector2::mainConstructor(), vector2.getX(), vector2.getY());
  }
}
