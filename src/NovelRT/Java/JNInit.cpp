#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

jint JNI_OnLoad(JavaVM *vm, void *) {
  jni::JNIEnv& env = jni::GetEnv(*vm, jni::jni_version_1_6);

  // Deleting those objects isn't really important there,
  // as the library will be unloaded after the JVM dies. oof
  Classes = new ClassesData(env);
  Fields = new FieldsData(env);
  Constructors = new ConstructorsData(env);
  Methods = new MethodsData(env);

  for (auto& bindingRegisterer : Bindings::AllBindingRegisterers) {
    bindingRegisterer(env);
  }

  return jni::Unwrap(jni::jni_version_1_6);
}
