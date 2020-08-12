#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using Self = jni::Object<Types::NovelRunner>;
using SelfClass = jni::Class<Types::NovelRunner>;

jni::jlong createRunner(jni::JNIEnv& env, SelfClass&, jni::jint displayNumber, jni::String& windowTitle,
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

void deleteRunner(jni::JNIEnv&, SelfClass&, jni::jlong handle) {
  delete reinterpret_cast<NovelRunner*>(handle);
}

jni::jint runNovel(jni::JNIEnv& env, Self& self) {
  auto* runner = Handles::get<NovelRunner>(env, *self);
  return jni::jint(runner->runNovel());
}

jni::Local<jni::Object<Types::RenderObject>> createSomeRect(jni::JNIEnv& env, Self& self) {
  auto* runner = Handles::get<NovelRunner>(env, *self);
  auto rect = runner->getRenderer()->createBasicFillRect(
    Transform({240, 480}, 15, {420, 850}), 1,
    {142, 255, 74, 255});

  // Release it so Java can instead take care of deleting the object
  // using the GC.
  auto* rectPtr = rect.release();

  // Global so we're sure the rect isn't getting deleted.
  // Obviously we won't do that in real scenarios.
  auto worldObject = Classes->RenderObject.New(env, Constructors->RenderObject_main,
                                               jni::jlong(rectPtr), jni::jboolean(true));

  return worldObject;
}

jni::Local<jni::Object<Types::SceneConstructionRequestedEvent>>
createSceneConstructionRequestedEvent(jni::JNIEnv& env, Self& self) {
  auto* runner = Handles::get<NovelRunner>(env, *self);
  auto* event = &runner->SceneConstructionRequested;
  return Classes->SceneConstructionRequestedEvent.New(env, Constructors->SceneConstructionRequestedEvent_main,
                                                      jni::jlong(event));
}

void Bindings::registerNovelRunnerBindings(jni::JNIEnv& env) {
  jni::RegisterNatives(env, *Classes->NovelRunner,
                       jni::MakeNativeMethod<decltype(createRunner), &createRunner>("createRunner"),
                       jni::MakeNativeMethod<decltype(deleteRunner), &deleteRunner>("deleteRunner"),
                       jni::MakeNativeMethod<decltype(runNovel), &runNovel>("runNovel"),
                       jni::MakeNativeMethod<decltype(createSomeRect), &createSomeRect>("createSomeRect"),
                       jni::MakeNativeMethod<decltype(createSceneConstructionRequestedEvent), &createSceneConstructionRequestedEvent>(
                         "createSceneConstructionRequestedEvent")
  );
}
