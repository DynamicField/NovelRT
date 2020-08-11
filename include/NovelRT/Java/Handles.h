#ifndef NOVELRT_HANDLES_H
#define NOVELRT_HANDLES_H

#include <jni/jni.hpp>
#include "Registries.h"

namespace NovelRT::Java::Handles {
  template<typename Target>
  Target* get(JNIEnv& env, jni::jobject& object) {
    jni::Object<Types::HandleObject> handleObject(&object);
    return reinterpret_cast<Target*>(
            handleObject.Call(env, Methods->HandleObject_getHandle)
    );
  }

  void invalidate(JNIEnv& env, jni::jobject& object);
}

#endif //NOVELRT_HANDLES_H
