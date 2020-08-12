#ifndef NOVELRT_VECTOR2SERIALIZATION_H
#define NOVELRT_VECTOR2SERIALIZATION_H

#include <NovelRT.h>
#include "Registries.h"

namespace NovelRT::Java::Vector2Serialization {
  Maths::GeoVector2<float> fromJava(jni::JNIEnv& env, jni::Object<Types::Vector2>& vector2Object);

  auto fromNative(jni::JNIEnv& env, const Maths::GeoVector2<float>& vector2)
  -> jni::Local<jni::Object<Types::Vector2>>;
}

#endif //NOVELRT_VECTOR2SERIALIZATION_H
