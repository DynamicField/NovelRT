#include "NovelRT/Java/JavaSupport.h"

using namespace NovelRT;
using namespace NovelRT::Java;

using Self = jni::Object<Types::Transform>;
using SelfClass = jni::Class<Types::Transform>;

jni::Local<jni::Object<Types::Vector2>> getPosition(jni::JNIEnv& env, Self& self) {
  auto transform = Handles::get<Transform>(env, *self);
  return Vector2Serialization::fromNative(env, transform->position());
}

void setPosition(jni::JNIEnv& env, Self& self, jni::Object<Types::Vector2>& position) {
  auto transform = Handles::get<Transform>(env, *self);
  transform->position() = Vector2Serialization::fromJava(env, position);
}

jni::Local<jni::Object<Types::Vector2>> getScale(jni::JNIEnv& env, Self& self) {
  auto transform = Handles::get<Transform>(env, *self);
  return Vector2Serialization::fromNative(env, transform->scale());
}

void setScale(jni::JNIEnv& env, Self& self, jni::Object<Types::Vector2>& scale) {
  auto transform = Handles::get<Transform>(env, *self);
  transform->scale() = Vector2Serialization::fromJava(env, scale);
}

jni::jfloat getRotation(jni::JNIEnv& env, Self& self) {
  auto transform = Handles::get<Transform>(env, *self);
  return transform->rotation();
}

void setRotation(jni::JNIEnv& env, Self& self, float rotation) {
  auto transform = Handles::get<Transform>(env, *self);
  transform->rotation() = rotation;
}

void Bindings::registerTransformBindings(jni::JNIEnv& env) {
  jni::RegisterNatives(env, *Types::Transform::javaClass(),
                       jni::MakeNativeMethod<decltype(getPosition), &getPosition>("getPosition"),
                       jni::MakeNativeMethod<decltype(setPosition), &setPosition>("setPosition"),
                       jni::MakeNativeMethod<decltype(getScale), &getScale>("getScale"),
                       jni::MakeNativeMethod<decltype(setScale), &setScale>("setScale"),
                       jni::MakeNativeMethod<decltype(getRotation), &getRotation>("getRotation"),
                       jni::MakeNativeMethod<decltype(setRotation), &setRotation>("setRotation"));
}
