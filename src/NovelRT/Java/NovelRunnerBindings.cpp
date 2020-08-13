#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using Self = Types::NovelRunner;

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

    auto worldObject = Types::RenderObject::javaClass().New(env, Types::RenderObject::mainConstructor(),
                                                            jni::jlong(rectPtr), jni::jboolean(true));

    return worldObject;
  }

  jni::Local<jni::Object<Types::SceneConstructionRequestedEvent>>
  createSceneConstructionRequestedEvent(jni::JNIEnv& env, Self::Object& self) {
    using Event = Types::SceneConstructionRequestedEvent;

    auto* runner = Handles::get<NovelRunner>(env, *self);
    auto* event = &runner->SceneConstructionRequested;
    return Event::javaClass().New(env, Event::mainConstructor(), jni::jlong(event));
  }

  void Bindings::registerNovelRunnerBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::NovelRunner::javaClass(),
                         jni::MakeNativeMethod<decltype(createRunner), &createRunner>("createRunner"),
                         jni::MakeNativeMethod<decltype(deleteRunner), &deleteRunner>("deleteRunner"),
                         jni::MakeNativeMethod<decltype(runNovel), &runNovel>("runNovel"),
                         jni::MakeNativeMethod<decltype(createSomeRect), &createSomeRect>("createSomeRect"),
                         jni::MakeNativeMethod<decltype(createSceneConstructionRequestedEvent), &createSceneConstructionRequestedEvent>(
                           "createSceneConstructionRequestedEvent")
    );
  }
}
