#ifndef NOVELRT_HANDLEHELPER_H
#define NOVELRT_HANDLEHELPER_H

#include <jni/jni.hpp>
#include "Types.h"
#include "Fields.h"

namespace NovelRT::Java {
  template<typename Target>
  Target* getHandleAs(jni::JNIEnv& env, jni::jobject& object) {
    jni::Object<Types::HandleObject> jniObj(&object);
    return reinterpret_cast<Target*>(
            jniObj.Get(env, Fields->HandleObject_handle)
    );
  }
}

#endif //NOVELRT_HANDLEHELPER_H
