#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/RenderObjectBindings.h"

namespace NovelRT::Java::Bindings {
  void executeObjectBehaviourNative(jni::JNIEnv*, jni::jobject*, jni::jlong handle) {
    auto renderObject = reinterpret_cast<Graphics::RenderObject*>(handle);
    renderObject->executeObjectBehaviour();
  }

  void registerRenderObjectBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::RenderObject::javaClass(),
                         jni::MakeNativeMethod<decltype(executeObjectBehaviourNative), &executeObjectBehaviourNative>(
                           "executeObjectBehaviourNative", "(J)V"));
  }
}
