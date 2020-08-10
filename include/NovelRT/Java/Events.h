#ifndef NOVELRT_EVENTS_H
#define NOVELRT_EVENTS_H

#include <NovelRT.h>
#include <jni/jni.hpp>

namespace NovelRT::Java::Events {
  extern Utilities::Event<jni::JNIEnv&> OnLoad;
}

#endif //NOVELRT_EVENTS_H
