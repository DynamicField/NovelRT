#ifndef NOVELRT_METHODS_H
#define NOVELRT_METHODS_H

#include "Classes.h"

namespace NovelRT::Java {
  class MethodsData {
  private:
    template <typename Method, typename Type>
    jni::Method<Type, Method> find(JNIEnv& env, const jni::Class<Type>& clazz, const char* name) {
      std::cout << "Trying to find method " << name << " in " << Type::Name() << std::endl;
      return clazz.template GetMethod<Method>(env, name);
    }
  public:
    jni::Method<Types::HandleObject, jni::jlong()> HandleObject_getHandle;
    jni::Method<Types::HandleObject, void()> HandleObject_invalidate;

    jni::Method<Types::Event, void(jni::Object<Types::EventListener>)> Event_onRemoval;

    jni::Method<Types::SceneConstructionRequestedListener, void()> SceneConstructionRequestedListener_listen;
    MethodsData(jni::JNIEnv& env);
  };

  extern const MethodsData* Methods;
}

#endif //NOVELRT_METHODS_H
