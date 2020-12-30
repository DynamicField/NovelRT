#include "NovelRT/Java/TypeConversion/TransformTypeConverter.h"
#include "NovelRT/Java/Handles.h"
namespace NovelRT::Java::TypeConversion {
  Transform TransformConverter::fromJava(JNIEnv& env, const jni::Object<Types::Transform>& source) const {
    return *Handles::get<Transform>(env, *source);
  }

  jni::Local<jni::Object<Types::Transform>> TransformConverter::fromNative(JNIEnv& env, const Transform& source) const {
    return Types::Transform::javaClass().New(env, Types::Transform::mainConstructor(), Handles::toJava(&source),
                                             static_cast<jni::jboolean>(false));
  }
}
