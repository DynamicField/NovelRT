#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/Utilities.h"
#include "NovelRT/Java/Bindings/WorldObjectBindings.h"

namespace NovelRT::Java::Bindings {
  using Self = Types::WorldObject;

  void deleteWorldObject(jni::JNIEnv&, Self::Class&, jni::jlong handle) {
    delete reinterpret_cast<WorldObject*>(handle);
  }

  void registerWorldObjectBindings(jni::JNIEnv& env) {
    // We use "modifiable" here because we need to use the non-const version of WorldObject::transform.
    bindProperty<Self, Types::Transform, modifiable(&WorldObject::transform), Getter>(env, "transform");

    bindProperty<Self, jni::jint, modifiable(&WorldObject::layer)>(env, "layer");

    bindProperty<Self, jni::jboolean,
      TraditionalProperty<&WorldObject::getActive, &WorldObject::setActive>>(env, "active");

    jni::RegisterNatives(env, *Self::javaClass(),
                         jni::MakeNativeMethod<decltype(deleteWorldObject), &deleteWorldObject>("deleteWorldObject"));
  }
}
