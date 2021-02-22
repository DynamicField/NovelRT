#include "NovelRT/Java/JavaSupport.h"


namespace NovelRT::Java {
  using Self = Types::WorldObject;

  void deleteWorldObject(jni::JNIEnv&, Self::Class&, jni::jlong handle) {
    delete reinterpret_cast<WorldObject*>(handle);
  }

  void Bindings::registerBridgeWorldObjectBindings(jni::JNIEnv& env) {
    // We use mutableProperty here because we need to use the non-const version of WorldObject::transform.
    Bindings::bindProperty<Self, Types::Transform, modifiable(&WorldObject::transform), Getter>(env, "transform");

    Bindings::bindProperty<Self, jni::jint, modifiable(&WorldObject::layer)>(env, "layer");

    Bindings::bindProperty<Self, jni::jboolean,
      TraditionalProperty<&WorldObject::getActive, &WorldObject::setActive>>(env, "active");

    jni::RegisterNatives(env, *Self::javaClass(),
                         jni::MakeNativeMethod<decltype(deleteWorldObject), &deleteWorldObject>("deleteWorldObject"));
  }
}
