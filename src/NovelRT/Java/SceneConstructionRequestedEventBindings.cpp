#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using Self = jni::Object<Types::SceneConstructionRequestedEvent>;
using SelfClass = jni::Class<Types::SceneConstructionRequestedEvent>;

using Listener = jni::Object<Types::SceneConstructionRequestedListener>;

auto globalRefs = std::unordered_map<Atom, jni::Global<Listener>>();

void addSubscription(jni::JNIEnv& env, Self& self, Listener& listener) {
  std::cout << "Trying to add subscription" << std::endl;
  auto* event = Handles::get<Utilities::Event<>>(env, *self);
  
  auto id = Atom::getNextEventHandlerId();
  globalRefs.insert(std::pair(id, jni::NewGlobal(env, listener)));

  *event += [&env, id]() {
    auto& thing = globalRefs.at(id);
    thing.Call(env, Methods->SceneConstructionRequestedListener_listen);
  };
}

void removeSubscription(jni::JNIEnv&, Self&, Listener&) {
  // idk.
}

void Bindings::registerSceneConstructionRequestedEventBindings(jni::JNIEnv& env) {
  jni::RegisterNatives(env, *Classes->SceneConstructionRequestedEvent,
                       jni::MakeNativeMethod<decltype(addSubscription), &addSubscription>("addSubscription"),
                       jni::MakeNativeMethod<decltype(removeSubscription), &removeSubscription>("removeSubscription"));
}
