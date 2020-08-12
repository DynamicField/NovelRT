#include "NovelRT/Java/Vector2Serialization.h"

namespace NovelRT::Java::Vector2Serialization {
  Maths::GeoVector2<float> fromJava(JNIEnv& env, jni::Object<Types::Vector2>& vector2Object) {
    auto x = vector2Object.Get(env, Fields->Vector2_x);
    auto y = vector2Object.Get(env, Fields->Vector2_y);

    return Maths::GeoVector2<float>(x, y);
  }

  auto fromNative(JNIEnv& env, const Maths::GeoVector2<float>& vector2)
  -> jni::Local<jni::Object<Types::Vector2>> {
    return Classes->Vector2.New(env, Constructors->Vector2_main, vector2.getX(), vector2.getY());
  }
}
