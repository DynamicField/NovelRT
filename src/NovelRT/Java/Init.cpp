#include "NovelRT/Java/Init.h"
#include "NovelRT/Java/Bindings.h"

namespace NovelRT::Java {
  void initialiseInternal(JavaVM* vm, bool fromOnLoad) {
    CurrentJavaVM = vm;

    std::cout << "Woah, I'm alive??" << std::endl;
    jni::JNIEnv& env = jni::GetEnv(*vm, jni::jni_version_1_6);

    // Deleting those objects isn't really important there,
    // as the library will be unloaded after the JVM dies. oof
    std::cout << "Got the env, that's a good start..." << std::endl;

    if (!fromOnLoad) {
      Types::NovelRTLoader::hasBeenLoaded.setValue(env, jni::jni_true);
    }

    int i = 0;
    for (auto& bindingRegisterer : Bindings::AllBindingRegisterers) {
      std::cout << "Using binding registerer at index " << i << std::endl;
      bindingRegisterer(env);
      i++;
    }
  }

  void initialise(JavaVM* vm) {
    return initialiseInternal(vm, false);
  }
}

jint JNI_OnLoad(JavaVM *vm, void *) {
  NovelRT::Java::initialiseInternal(vm, true);
  return JNI_VERSION_10;
}
