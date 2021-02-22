#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/SceneConstructionRequestedEventBindings.h"

namespace NovelRT::Java {
  using Event = Types::SceneConstructionRequestedEvent;
  using Listener = Types::SceneConstructionRequestedListener;

  void Bindings::registerSceneConstructionRequestedEventBindings(jni::JNIEnv& env) {
    Bindings::bindEvent<Listener, Utilities::Event<>, Event>(
      env, Event::javaClass(), [](jni::JNIEnv& env, Listener::Object& listener) {
        listener.Call(env, Listener::listen());
      }
    );
  }
}
