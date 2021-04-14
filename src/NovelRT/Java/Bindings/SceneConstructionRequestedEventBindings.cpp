#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/Utilities.h"
#include "NovelRT/Java/Bindings/SceneConstructionRequestedEventBindings.h"

namespace NovelRT::Java::Bindings {
  using Event = Types::SceneConstructionRequestedEvent;
  using Listener = Types::SceneConstructionRequestedListener;

  void registerSceneConstructionRequestedEventBindings(jni::JNIEnv& env) {
    Bindings::bindEvent<Listener, Utilities::Event<>, Event>(
      env, Event::javaClass(), [](jni::JNIEnv& env, Listener::Object& listener) {
        Listener::listen.invoke(env, listener);
      }
    );
  }
}
