#include "NovelRT/Java/Methods.h"

namespace NovelRT::Java {
  const MethodsData* Methods = nullptr;

  MethodsData::MethodsData(JNIEnv& env) :
    OwnedHandleObject_invalidate(find<void()>(env, Classes->OwnedHandleObject, "invalidate")),
    HandleObject_getHandle(find<jni::jlong()>(env, Classes->HandleObject, "getHandle")),
    Event_onRemoval(find<void(jni::Object<Types::EventListener>)>(env, Classes->Event, "onRemoval")),
    SceneConstructionRequestedListener_listen(
      find<void()>(env, Classes->SceneConstructionRequestedListener, "listen")
    ) {
  }
}

