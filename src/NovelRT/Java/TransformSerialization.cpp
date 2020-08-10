#include "NovelRT/Java/TransformSerialization.h"
#include "NovelRT/Java/Registries.h"

namespace NovelRT::Java {
  Transform TransformSerialization::fromJava(jni::JNIEnv& env, jni::jfloatArray& value) {
    auto array = std::get<0>(jni::GetArrayElements(env, value));
    auto representation = reinterpret_cast<Transform_Representation*>(array.get());

    const Transform& transform = Transform({representation->posX, representation->posY},
                                           representation->rotation,
                                           {representation->scaleX, representation->scaleY});

    return transform;
  }

  Transform TransformSerialization::fromJava(jni::JNIEnv& env, jni::jobject& transformObject) {
    jni::Object<Types::Transform> obj(&transformObject);
    return fromJava(env, obj);
  }

  Transform TransformSerialization::fromJava(jni::JNIEnv& env, jni::Object<Types::Transform>& transformObject) {
    return fromJava(env, *transformObject.Call(env, Methods->Transform_nativeValues));
  }

  auto TransformSerialization::fromNative(jni::JNIEnv& env, const NovelRT::Transform& transform) ->
  jni::Local<jni::Object<Types::Transform>> {
    constexpr int size = 5;

    auto array = jni::Array<jni::jfloat>::New(env, size);
    std::array<jni::jfloat, size> elements = {
            transform.position().getX(),
            transform.position().getY(),
            transform.scale().getX(),
            transform.scale().getY(),
            transform.rotation()
    };
    array.SetRegion(env, 0, elements);

    return Classes->Transform.New(env, Constructors->Transform_native, array, 0L);
  }
}
