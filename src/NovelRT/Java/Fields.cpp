#include "NovelRT/Java/Fields.h"
#include "NovelRT/Java/Classes.h"

namespace NovelRT::Java {
  const FieldsData* Fields = nullptr;

  FieldsData::FieldsData(JNIEnv& env) :
    Vector2_x(Classes->Vector2.GetField<jni::jfloat>(env, "x")),
    Vector2_y(Classes->Vector2.GetField<jni::jfloat>(env, "y")) {
  }
}
