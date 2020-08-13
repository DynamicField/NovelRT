#ifndef NOVELRT_CONTEXT_H
#define NOVELRT_CONTEXT_H

#include <jni/jni.hpp>

namespace NovelRT::Java {
  extern jni::JavaVM* CurrentJavaVM;
}

#endif //NOVELRT_CONTEXT_H
