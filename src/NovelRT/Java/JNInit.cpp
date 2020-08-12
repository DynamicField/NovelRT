#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

jint JNI_OnLoad(JavaVM *vm, void *) {
  std::cout << "Woah, I'm alive??" << std::endl;
  jni::JNIEnv& env = jni::GetEnv(*vm, jni::jni_version_1_6);

  // Deleting those objects isn't really important there,
  // as the library will be unloaded after the JVM dies. oof
  std::cout << "Got the env, that's a good start..." << std::endl;
  Classes = new ClassesData(env);
  std::cout << "Classes ok" << std::endl;
  Fields = new FieldsData(env);
  std::cout << "Fields ok" << std::endl;
  Constructors = new ConstructorsData(env);
  std::cout << "Constructors ok" << std::endl;
  Methods = new MethodsData(env);
  std::cout << "Methods ok" << std::endl;

  int i = 0;
  for (auto& bindingRegisterer : Bindings::AllBindingRegisterers) {
    std::cout << "Using binding registerer at index " << i << std::endl;
    bindingRegisterer(env);
    i++;
  }

  return jni::Unwrap(jni::jni_version_1_6);
}
