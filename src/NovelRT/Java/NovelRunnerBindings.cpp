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
  auto* runner = getHandleAs<NovelRunner>(env, *self);
  return jni::jint(runner->runNovel());
}

void Bindings::registerNovelRunnerBindings(jni::JNIEnv& env) {
  jni::RegisterNatives(env, *Classes->NovelRunner,
                       jni::MakeNativeMethod<decltype(createRunner), &createRunner>("createRunner"),
                       jni::MakeNativeMethod<decltype(deleteRunner), &deleteRunner>("deleteRunner"),
                       jni::MakeNativeMethod<decltype(runNovel), &runNovel>("runNovel")
  );
}
