#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using Self = Types::WorldObject;

  jni::Local<jni::Object<Types::Transform>> getTransform(jni::JNIEnv& env, Self::Object& self) {
    auto* worldObject = Handles::get<WorldObject>(env, *self);
    auto& transform = worldObject->transform();
    return Types::Transform::javaClass().New(env, Types::Transform::mainConstructor(),
                                             Handles::toJava(&transform));
  }

  jni::jint getLayer(jni::JNIEnv& env, Self::Object& self) {
    auto* worldObject = Handles::get<WorldObject>(env, *self);
    return worldObject->layer();
  }

  void setLayer(jni::JNIEnv& env, Self::Object& self, jni::jint layer) {
    auto* worldObject = Handles::get<WorldObject>(env, *self);
    worldObject->layer() = layer;
  }

  jni::jboolean isActive(jni::JNIEnv& env, Self::Object& self) {
    return Handles::get<WorldObject>(env, *self)->getActive();
  }

  void setActive(jni::JNIEnv& env, Self::Object& self, jni::jboolean active) {
    auto worldObject = Handles::get<WorldObject>(env, *self);
    worldObject->setActive(active);
  }

  void deleteWorldObject(jni::JNIEnv&, Self::Class&, jni::jlong handle) {
    delete reinterpret_cast<WorldObject*>(handle);
  }

  void Bindings::registerWorldObjectBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Types::WorldObject::javaClass(),
                         jni::MakeNativeMethod<decltype(getTransform), &getTransform>("getTransform"),
                         jni::MakeNativeMethod<decltype(getLayer), &getLayer>("getLayer"),
                         jni::MakeNativeMethod<decltype(setLayer), &setLayer>("setLayer"),
                         jni::MakeNativeMethod<decltype(isActive), &isActive>("isActive"),
                         jni::MakeNativeMethod<decltype(setActive), &setActive>("setActive"),
                         jni::MakeNativeMethod<decltype(deleteWorldObject), &deleteWorldObject>("deleteWorldObject"));
  }
}
