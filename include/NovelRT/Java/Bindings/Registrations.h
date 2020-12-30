#ifndef NOVELRT_REGISTRATIONS_H
#define NOVELRT_REGISTRATIONS_H

#include <jni/jni.hpp>
#include <functional>

namespace NovelRT::Java::Bindings {
  void registerNovelRunnerBindings(jni::JNIEnv& env);

  void registerBridgeWorldObjectBindings(jni::JNIEnv& env);

  void registerBridgeRenderObjectBindings(jni::JNIEnv& env);

  void registerBridgeSceneConstructionRequestedEventBindings(jni::JNIEnv& env);

  void registerTransformBindings(jni::JNIEnv& env);

  void registerBridgeTextBindings(jni::JNIEnv& env);

  void registerBridgeGraphicsServiceBindings(jni::JNIEnv& env);

  static std::vector<void (*)(jni::JNIEnv&)> AllBindingRegisterers{
    &registerNovelRunnerBindings,
    &registerBridgeWorldObjectBindings,
    &registerBridgeRenderObjectBindings,
    &registerBridgeSceneConstructionRequestedEventBindings,
    &registerTransformBindings,
    &registerBridgeTextBindings,
    &registerBridgeGraphicsServiceBindings
  };
}

#endif //NOVELRT_REGISTRATIONS_H
