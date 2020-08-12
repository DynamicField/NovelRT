#include "NovelRT/Java/Constructors.h"

namespace NovelRT::Java {
  const ConstructorsData* Constructors = nullptr;

  ConstructorsData::ConstructorsData(JNIEnv& env) :
    Transform_main(Classes->Transform.GetConstructor<jni::jlong>(env)),
    WorldObject_main(Classes->WorldObject.GetConstructor<jni::jlong, jni::jboolean>(env)),
    SceneConstructionRequestedEvent_main(
                  Classes->SceneConstructionRequestedEvent.GetConstructor<jni::jlong>(env)
          ),
    Vector2_main(Classes->Vector2.GetConstructor<jni::jfloat, jni::jfloat>(env)) {
  }
}
