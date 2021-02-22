#ifndef NOVELRT_ALLBINDINGS_H
#define NOVELRT_ALLBINDINGS_H

#include <jni/jni.hpp>
#include <functional>

namespace NovelRT::Java::Bindings {
  extern std::vector<void (*)(jni::JNIEnv&)> AllBindingRegisterers;
}

#endif //NOVELRT_ALLBINDINGS_H
