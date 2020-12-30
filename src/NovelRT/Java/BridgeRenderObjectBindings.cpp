#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  void executeObjectBehaviourNative(jni::JNIEnv*, jni::jobject*, jni::jlong handle) {
    auto renderObject = reinterpret_cast<Graphics::RenderObject*>(handle);
    renderObject->executeObjectBehaviour();
  }

  void Bindings::registerBridgeRenderObjectBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::BridgeRenderObject::javaClass(),
                         jni::MakeNativeMethod<decltype(executeObjectBehaviourNative), &executeObjectBehaviourNative>(
                           "executeObjectBehaviourNative", "(J)V"));
  }
}
