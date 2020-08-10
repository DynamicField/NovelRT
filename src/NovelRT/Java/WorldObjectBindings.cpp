#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using Self = jni::Object<Types::WorldObject>;
using SelfClass = jni::Class<Types::WorldObject>;

jni::Local<jni::Object<Types::Transform>> getTransform(jni::JNIEnv& env, Self& self) {
  auto worldObject = getHandleAs<WorldObject>(env, *self);
  return TransformSerialization::fromNative(env, worldObject->transform());
}

void setTransform(jni::JNIEnv& env, Self& self, jni::Object<Types::Transform>& transform) {
  auto worldObject = getHandleAs<WorldObject>(env, *self);
  worldObject->transform() = TransformSerialization::fromJava(env, transform);
}

jni::jint getLayer(jni::JNIEnv& env, Self& self) {
  auto worldObject = getHandleAs<WorldObject>(env, *self);
  return worldObject->layer();
}

void setLayer(jni::JNIEnv& env, Self& self, jni::jint layer) {
  auto worldObject = getHandleAs<WorldObject>(env, *self);
  worldObject->layer() = layer;
}

jni::jboolean isActive(jni::JNIEnv& env, Self& self) {
  return getHandleAs<WorldObject>(env, *self)->getActive();
}

void setActive(jni::JNIEnv& env, Self& self, jni::jboolean active) {
  auto worldObject = getHandleAs<WorldObject>(env, *self);
  worldObject->setActive(active);
}

void deleteWorldObject(jni::JNIEnv&, SelfClass&, jni::jlong handle) {
  delete reinterpret_cast<WorldObject*>(handle);
}

void Bindings::registerWorldObjectBindings(jni::JNIEnv& env) {
  jni::RegisterNatives(env, *Classes->WorldObject,
                       jni::MakeNativeMethod<decltype(getTransform), &getTransform>("getTransform"),
                       jni::MakeNativeMethod<decltype(setTransform), &setTransform>("setTransform"),
                       jni::MakeNativeMethod<decltype(getLayer), &getLayer>("getLayer"),
                       jni::MakeNativeMethod<decltype(setLayer), &setLayer>("setLayer"),
                       jni::MakeNativeMethod<decltype(isActive), &isActive>("isActive"),
                       jni::MakeNativeMethod<decltype(setActive), &setActive>("setActive"),
                       jni::MakeNativeMethod<decltype(deleteWorldObject), &deleteWorldObject>("deleteWorldObject"));
}
