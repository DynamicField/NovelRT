#include "NovelRT/Java/Constructors.h"

namespace NovelRT::Java {
  const ConstructorsData* Constructors = nullptr;

  ConstructorsData::ConstructorsData(JNIEnv& env) :
          Transform_native(Classes->Transform.GetConstructor<jni::Array<jni::jfloat>, jni::jint>(env)),
          WorldObject_main(Classes->WorldObject.GetConstructor<jni::jlong, jni::jboolean>(env)),
          SceneConstructionRequestedEvent_main(
                  Classes->SceneConstructionRequestedEvent.GetConstructor<jni::jlong>(env)
          ) {
  }
}
