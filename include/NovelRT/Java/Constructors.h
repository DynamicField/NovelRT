#ifndef NOVELRT_CONSTRUCTORS_H
#define NOVELRT_CONSTRUCTORS_H

#include "Classes.h"

namespace NovelRT::Java {
  class ConstructorsData {
  public:
    jni::Constructor<Types::Transform, jni::Array<jni::jfloat>, jni::jint> Transform_native;
    ConstructorsData(jni::JNIEnv& env);
  };

  extern const ConstructorsData* Constructors;
}

#endif //NOVELRT_CONSTRUCTORS_H
