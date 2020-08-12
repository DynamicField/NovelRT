#include "NovelRT/Java/Handles.h"

void NovelRT::Java::Handles::invalidate(JNIEnv& env, jni::jobject& object) {
  jni::Object<Types::OwnedHandleObject> handleObject(&object);
  handleObject.Call(env, Methods->OwnedHandleObject_invalidate);
  jni::CheckJavaException(env);
}
