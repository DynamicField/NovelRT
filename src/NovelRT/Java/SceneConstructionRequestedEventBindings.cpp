#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using EventType = Types::SceneConstructionRequestedEvent;
using Event = jni::Object<EventType>;

using ListenerType = Types::SceneConstructionRequestedListener;
using Listener = jni::Object<ListenerType>;

void Bindings::registerSceneConstructionRequestedEventBindings(jni::JNIEnv& env) {
  Bindings::bindEvent<ListenerType, Utilities::Event<>, EventType>(
    env, &Classes->SceneConstructionRequestedEvent, [](jni::JNIEnv& env, Listener& listener) {
      listener.Call(env, Methods->SceneConstructionRequestedListener_listen);
    }
  );
}
