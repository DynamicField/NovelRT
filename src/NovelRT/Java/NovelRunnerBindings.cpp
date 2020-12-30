#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using Self = Types::NovelRunner;
  using JBridgeRenderObject = Types::BridgeRenderObject;

  jni::jlong createRunner(jni::JNIEnv& env, Self::Class&, jni::jint displayNumber, jni::String& windowTitle,
                          jni::jint targetFrameRate, jni::jboolean transparency, jni::String& resourcesDirectory) {
    auto resourcesDirectoryPath = std::filesystem::path(
      std::string(std::get<0>(jni::GetStringUTFChars(env, *resourcesDirectory)).get())
    );
    auto windowTitleString = std::string(std::get<0>(jni::GetStringUTFChars(env, *windowTitle)).get());

    auto* runner = new NovelRunner(
      int(displayNumber),
      windowTitleString,
      targetFrameRate,
      transparency,
      resourcesDirectoryPath
    );
    return reinterpret_cast<jlong>(runner);
  }

  void deleteRunner(jni::JNIEnv&, Self::Class&, jni::jlong handle) {
    delete reinterpret_cast<NovelRunner*>(handle);
  }

  jni::jint runNovel(jni::JNIEnv& env, Self::Object& self) {
    auto* runner = Handles::get<NovelRunner>(env, *self);
    return jni::jint(runner->runNovel());
  }

  jni::Local<jni::Object<Types::RenderObject>> createSomeRect(jni::JNIEnv& env, Self::Object& self) {
    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto rect = runner->getRenderer()->createBasicFillRect(
      Transform({240, 480}, 15, {420, 850}), 1,
      {142, 255, 74, 255});

    // Release it so Java can instead take care of deleting the object
    // using the GC.
    auto* rectPtr = rect.release();

    auto worldObject = JBridgeRenderObject::javaClass().New(env, JBridgeRenderObject::mainConstructor(),
                                                            jni::jlong(rectPtr), jni::jboolean(true));

    return jni::Cast(env, Types::RenderObject::javaClass(), worldObject);
  }

  auto createSceneConstructionRequestedEvent(jni::JNIEnv& env, Self::Object& self) {
    using Event = Types::SceneConstructionRequestedBridgeEvent;

    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto* event = &runner->SceneConstructionRequested;
    return Event::javaClass().New(env, Event::mainConstructor(), jni::jlong(event));
  }

  auto createRenderingService(jni::JNIEnv& env, Self::Object& self) {
    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto* service = runner->getRenderer().get();
    return Types::BridgeRenderingService::javaClass().New(env, Types::BridgeRenderingService::mainConstructor(),
                                                          jni::jlong(service));
  }

  void Bindings::registerNovelRunnerBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::NovelRunner::javaClass(),
                         jni::MakeNativeMethod<decltype(createRunner), &createRunner>("createRunner"),
                         jni::MakeNativeMethod<decltype(deleteRunner), &deleteRunner>("deleteRunner"),
                         jni::MakeNativeMethod<decltype(runNovel), &runNovel>("runNovel"),
                         jni::MakeNativeMethod<decltype(createSomeRect), &createSomeRect>("createSomeRect"),
                         jni::MakeNativeMethod<decltype(createSceneConstructionRequestedEvent), &createSceneConstructionRequestedEvent>(
                           "createSceneConstructionRequestedEvent"),
                         jni::MakeNativeMethod<decltype(createRenderingService), &createRenderingService>(
                           "createRenderingService")
    );
  }
}
