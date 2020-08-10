#ifndef NOVELRT_METHODS_H
#define NOVELRT_METHODS_H

#include "Classes.h"

namespace NovelRT::Java {
  class MethodsData {
  public:
    jni::Method<Types::Transform, jni::Array<jni::jfloat>()> Transform_nativeValues;
    MethodsData(jni::JNIEnv& env);
  };

  extern const MethodsData* Methods;
}

#endif //NOVELRT_METHODS_H
