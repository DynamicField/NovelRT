#include "NovelRT/Java/Fields.h"
#include "NovelRT/Java/Classes.h"

namespace NovelRT::Java {
  const FieldsData* Fields = nullptr;

  FieldsData::FieldsData(JNIEnv& env) :
          HandleObject_handle(Classes->HandleObject.GetField<jni::jlong>(env, "handle")) {
  }
}
