#ifndef NOVELRT_BINDINGS_H
#define NOVELRT_BINDINGS_H

#include <jni/jni.hpp>
#include <functional>

namespace NovelRT::Java::Bindings {
  void registerNovelRunnerBindings(jni::JNIEnv& env);

  void registerWorldObjectBindings(jni::JNIEnv& env);

  void registerRenderObjectBindings(jni::JNIEnv& env);

  void registerSceneConstructionRequestedEventBindings(jni::JNIEnv& env);

  void registerTransformBindings(jni::JNIEnv& env);

  static std::vector<std::function<void(jni::JNIEnv&)>> AllBindingRegisterers{
    &registerNovelRunnerBindings,
    &registerWorldObjectBindings,
    &registerRenderObjectBindings,
    &registerSceneConstructionRequestedEventBindings,
    &registerTransformBindings,
  };
}

#endif //NOVELRT_BINDINGS_H
