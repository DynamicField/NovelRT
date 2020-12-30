#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using Event = Types::SceneConstructionRequestedBridgeEvent;
using Listener = Types::SceneConstructionRequestedListener;

void Bindings::registerBridgeSceneConstructionRequestedEventBindings(jni::JNIEnv& env) {
  Bindings::bindEvent<Listener, Utilities::Event<>, Event>(
    env, &Event::javaClass(), [](jni::JNIEnv& env, Listener::Object& listener) {
      listener.Call(env, Listener::listen());
    }
  );
}
