#ifndef NOVELRT_INIT_H
#define NOVELRT_INIT_H

#include <jni/jni.hpp>

namespace NovelRT::Java {
  inline jni::JavaVM* CurrentJavaVM = nullptr;

  void initialise(JavaVM* vm);
}

#endif //NOVELRT_INIT_H
