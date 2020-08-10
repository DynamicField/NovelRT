#ifndef NOVELRT_TRANSFORMSERIALIZATION_H
#define NOVELRT_TRANSFORMSERIALIZATION_H

#include <NovelRT.h>
#include "Types.h"

namespace NovelRT::Java::TransformSerialization {
  namespace {
    struct Transform_Representation {
      float posX;
      float posY;
      float scaleX;
      float scaleY;
      float rotation;
    };
  }

  Transform fromJava(jni::JNIEnv& env, jni::jfloatArray& value);
  Transform fromJava(jni::JNIEnv& env, jni::jobject& transformObject);
  Transform fromJava(jni::JNIEnv& env, jni::Object<Types::Transform>& transformObject);

  auto fromNative(jni::JNIEnv& env, const Transform& transform) ->
    jni::Local<jni::Object<Types::Transform>>;
}

#endif //NOVELRT_TRANSFORMSERIALIZATION_H
