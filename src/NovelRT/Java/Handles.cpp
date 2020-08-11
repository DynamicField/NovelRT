#include "NovelRT/Java/Handles.h"

void NovelRT::Java::Handles::invalidate(JNIEnv& env, jni::jobject& object) {
  jni::Object<Types::HandleObject> handleObject(&object);
  handleObject.Call(env, Methods->HandleObject_invalidate);
  jni::CheckJavaException(env);
}
