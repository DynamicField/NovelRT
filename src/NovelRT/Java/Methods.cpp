#include "NovelRT/Java/Methods.h"

namespace NovelRT::Java {
  const MethodsData* Methods = nullptr;

  MethodsData::MethodsData(JNIEnv& env) :
          Transform_nativeValues(Classes->Transform.GetMethod<jni::Array<jni::jfloat>()>(env, "nativeValues")){
  }
}

