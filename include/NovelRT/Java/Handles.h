#ifndef NOVELRT_HANDLES_H
#define NOVELRT_HANDLES_H

#include <jni/jni.hpp>
#include "Registries.h"


namespace NovelRT::Java::Handles {
  template<typename Target>
  Target* get(JNIEnv& env, jni::jobject& object) {
    return reinterpret_cast<Target*>(
      jni::CallMethod<jni::jlong>(env, &object, Types::HandleObject::getHandle())
    );
  }

  template<typename Target>
  Target* get(jni::jlong handle) {
    return reinterpret_cast<Target*>(handle);
  }

  void invalidate(JNIEnv& env, jni::jobject& object);

  template<typename T>
  jlong toJava(T* pointer) {
    return reinterpret_cast<jlong>(pointer);
  }
}

#endif //NOVELRT_HANDLES_H
