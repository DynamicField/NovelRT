#define NOVELRT_C_API 1
#define NOVELRT_INK 1
#define JNI_TEMPORARY_REMOVAL 1
#include <NovelRT.h>
#include <iostream>
#include "jni.h"
#include "jni/jni.hpp"
#include "NovelRT.JavaSupport/JNIBindings.h"
#include "NovelRT.JavaSupport/CustomBindings.h"
#include "NovelRT.JavaBootstrapper/ArgumentParser.h"

using namespace NovelRT::JavaBootstrapper;

int main(int argc, char* argv[]) {
  for (int i = 0; i < argc; ++i) {
    std::cout << "arg found: " << argv[i] << std::endl;
  }

  ArgumentParsingResult parsedArgs;
  try {
    parsedArgs = ArgumentParser().parse(argv, argc);
  } catch (OptionParsingException& ex) {
    std::cout << ex.what() << std::endl;
    return 1;
  } catch (std::runtime_error& ex) {
    std::cout << "Unexpected error: " << ex.what() << std::endl;
    return 1;
  }

  std::cout << "oh hey world" << std::endl;
  std::cout << "may I create a JVM please?" << std::endl;

  std::string launchOptionValue = parsedArgs.options[&LaunchOption];
  auto slashPosition = launchOptionValue.find('/');
  if (slashPosition == std::string::npos) {
    std::cout << "Invalid --launch value. It must be formatted as 'module/class'." << std::endl;
    return 1;
  }

  auto launchModule = launchOptionValue.substr(0, slashPosition);
  auto launchClassName = launchOptionValue.substr(slashPosition + 1, std::string::npos);
  // Replace dots with slashes because that's how JNI works with packages.
  std::replace(launchClassName.begin(), launchClassName.end(), '.', '/');

  std::string mainModuleOption = "-Djdk.module.main=" + launchModule;

  auto jvmOptions = std::vector{
    JavaVMOption{
      const_cast<char*>(mainModuleOption.c_str())
    }
  };

  std::vector<std::string> mainMethodArgs;

  for (auto& restArg : parsedArgs.rest) {
    // Starts with -X or _ : JVM-specific option
    // Starts with -D : system property
    // Starts with -verbose : verbose option
    // see https://docs.oracle.com/javase/7/docs/technotes/guides/jni/spec/invocation.html
    if (restArg.rfind("-X", 0) == 0 || restArg.rfind('_', 0) == 0 ||
        restArg.rfind("-D") == 0 ||
        restArg.rfind("-verbose", 0) == 0) {
      jvmOptions.push_back(JavaVMOption{
        const_cast<char*>(restArg.c_str())
      });
    } else {
      mainMethodArgs.push_back(restArg);
    }
  }

  JavaVMInitArgs args;
  args.version = JNI_VERSION_10;
  args.nOptions = jvmOptions.size();
  args.options = jvmOptions.data();
  args.ignoreUnrecognized = true;

  JNIEnv* env;
  JavaVM* vm;

  jint vmSuccess = JNI_CreateJavaVM(&vm, reinterpret_cast<void**>(&env), static_cast<void*>(&args));
  if (vmSuccess != 0) {
    std::cout << "VM launch failed! That's sad." << std::endl;
    return 1;
  }

  jni::jclass* launchClass;
  try {
    launchClass = &jni::FindClass(*env, launchClassName.c_str());
  } catch (jni::PendingJavaException&) {
    std::cout << "Failed to find class " << launchClassName << std::endl;
    return 1;
  }

  jni::jmethodID* launchMethod;
  try {
    launchMethod = &jni::GetStaticMethodID(*env, *launchClass, "main", "([Ljava/lang/String;)V");
  } catch (jni::PendingJavaException&) {
    std::cout << "Failed to find main method in class " << launchClassName << std::endl;
    return 1;
  }

  auto& mainArgumentsJava = jni::NewObjectArray(*env, mainMethodArgs.size(),
                                                *jni::Class<jni::StringTag>::Singleton(*env));

  for (int i = 0; i < mainMethodArgs.size(); ++i) {
    std::string rawArg = parsedArgs.rest[i];
    // We release the local ref because the newly created string will be hold in an array.
    jni::SetObjectArrayElement(*env, mainArgumentsJava, i, jni::Make<jni::String>(*env, rawArg).release());
  }

  try {
    jni::CallStaticMethod<void, jni::jobjectArray&>(*env, *launchClass, *launchMethod, mainArgumentsJava);
  } catch (jni::PendingJavaException&) {
    // The JVM will handle this exception by itself.
  }


  return 0;
}
