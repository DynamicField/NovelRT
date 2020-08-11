#ifndef NOVELRT_CLASSES_H
#define NOVELRT_CLASSES_H

#include <jni/jni.hpp>
#include <iostream>
#include "Types.h"

namespace NovelRT::Java {
  class ClassesData {
  private:
    template<typename Type>
    const jni::Class<Type>& find(JNIEnv& env) {
      std::cout << "Trying to create class " << Type::Name() << std::endl;
      return jni::Class<Type>::Singleton(env);
    }
  public:
    const jni::Class<Types::HandleObject>& HandleObject;
    const jni::Class<Types::Transform>& Transform;
    const jni::Class<Types::NovelRunner>& NovelRunner;
    const jni::Class<Types::WorldObject>& WorldObject;
    const jni::Class<Types::Event>& Event;
    const jni::Class<Types::SceneConstructionRequestedEvent>& SceneConstructionRequestedEvent;
    const jni::Class<Types::SceneConstructionRequestedListener>& SceneConstructionRequestedListener;
    ClassesData(jni::JNIEnv& env);
  };

  extern const ClassesData* Classes;
}

#endif //NOVELRT_CLASSES_H
