#include "NovelRT/Java/Context.h"

namespace NovelRT::Java {
  jni::JavaVM* CurrentJavaVM = nullptr; // Initialized in JNInit.cpp
}
