#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

jint JNI_OnLoad(JavaVM *vm, void *) {
  std::cout << "hi?" << std::endl;
  jni::JNIEnv& env = jni::GetEnv(*vm, jni::jni_version_1_6);

  // Deleting those objects isn't really important there,
  // as the library will be unloaded after the JVM dies. oof
  std::cout << "got the env i guess" << std::endl;
  Classes = new ClassesData(env);
  std::cout << "classes ok" << std::endl;
  Fields = new FieldsData(env);
  std::cout << "fields ok" << std::endl;
  Constructors = new ConstructorsData(env);
  std::cout << "constructors ok" << std::endl;
  Methods = new MethodsData(env);
  std::cout << "methods ok" << std::endl;

  for (auto& bindingRegisterer : Bindings::AllBindingRegisterers) {
    std::cout << "using binding registerer " << typeid(bindingRegisterer).name() << std::endl;
    bindingRegisterer(env);
  }

  return jni::Unwrap(jni::jni_version_1_6);
}
