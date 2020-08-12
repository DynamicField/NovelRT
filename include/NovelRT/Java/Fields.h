#ifndef NOVELRT_FIELDS_H
#define NOVELRT_FIELDS_H

#include "Types.h"

namespace NovelRT::Java {
  class FieldsData {
  public:
    jni::Field<Types::Vector2, jni::jfloat> Vector2_x;
    jni::Field<Types::Vector2, jni::jfloat> Vector2_y;

    FieldsData(jni::JNIEnv& env);
  };

  extern const FieldsData* Fields;
}


#endif //NOVELRT_FIELDS_H
