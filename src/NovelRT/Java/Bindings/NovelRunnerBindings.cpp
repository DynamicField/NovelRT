#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/NovelRunnerBindings.h"

namespace NovelRT::Java {
  using Self = Types::NovelRunner;

  jni::jlong createRunner(jni::JNIEnv& env, Self::Class&, jni::jint displayNumber, jni::String& windowTitle,
                          jni::jint targetFrameRate, jni::jboolean transparency) {
    auto windowTitleString = std::string(std::get<0>(jni::GetStringUTFChars(env, *windowTitle)).get());

    auto* runner = new NovelRunner(
      int(displayNumber),
      windowTitleString,
      targetFrameRate,
      transparency
    );
    return Handles::toJava(runner);
  }

  void deleteRunner(jni::JNIEnv&, Self::Class&, jni::jlong handle) {
    delete Handles::get<NovelRunner>(handle);
  }

  jni::jint runNovel(jni::JNIEnv& env, Self::Object& self) {
    auto* runner = Handles::get<NovelRunner>(env, *self);
    return jni::jint(runner->runNovel());
  }

  auto createSceneConstructionRequestedEvent(jni::JNIEnv& env, Self::Object& self) {
    using Event = Types::SceneConstructionRequestedEvent;

    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto* event = &runner->SceneConstructionRequested;
    return Event::mainConstructor.invoke(env, jni::jlong(event));
  }

  auto createRenderingService(jni::JNIEnv& env, Self::Object& self) {
    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto* service = runner->getRenderer().get();
    return Types::RenderingService::mainConstructor.invoke(env, jni::jlong(service));
  }

  void Bindings::registerNovelRunnerBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::NovelRunner::javaClass(),
                         jni::MakeNativeMethod<decltype(createRunner), &createRunner>("createRunner"),
                         jni::MakeNativeMethod<decltype(deleteRunner), &deleteRunner>("deleteRunner"),
                         jni::MakeNativeMethod<decltype(runNovel), &runNovel>("runNovel"),
                         jni::MakeNativeMethod<decltype(createSceneConstructionRequestedEvent), &createSceneConstructionRequestedEvent>(
                           "createSceneConstructionRequestedEvent"),
                         jni::MakeNativeMethod<decltype(createRenderingService), &createRenderingService>(
                           "createRenderingService")
    );
  }
}
