#ifndef NOVELRT_CONSTRUCTORS_H
#define NOVELRT_CONSTRUCTORS_H

#include "Classes.h"

namespace NovelRT::Java {
  class ConstructorsData {
  public:
    jni::Constructor<Types::Transform, jni::jlong> Transform_main;
    jni::Constructor<Types::WorldObject, jni::jlong, jni::jboolean> WorldObject_main;
    jni::Constructor<Types::SceneConstructionRequestedEvent, jni::jlong> SceneConstructionRequestedEvent_main;
    jni::Constructor<Types::Vector2, jni::jfloat, jni::jfloat> Vector2_main;

    ConstructorsData(jni::JNIEnv& env);
  };

  extern const ConstructorsData* Constructors;
}

#endif //NOVELRT_CONSTRUCTORS_H
