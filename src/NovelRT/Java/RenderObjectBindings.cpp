#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using Self = TagTypes<Types::RenderObject>;

  void executeObjectBehaviour(jni::JNIEnv& env, Self::Object& self) {
    auto renderObject = Handles::get<Graphics::RenderObject>(env, *self);
    renderObject->executeObjectBehaviour();
  }

  void Bindings::registerRenderObjectBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Classes->RenderObject,
                         jni::MakeNativeMethod<decltype(executeObjectBehaviour), &executeObjectBehaviour>("executeObjectBehaviour"));
  }
}
