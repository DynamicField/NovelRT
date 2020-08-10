#include "NovelRT/Java/Constructors.h"

namespace NovelRT::Java {
  const ConstructorsData* Constructors = nullptr;

  ConstructorsData::ConstructorsData(JNIEnv& env) :
          Transform_native(Classes->Transform.GetConstructor<jni::Array<jni::jfloat>, jni::jint>(env)) {
  }
}
