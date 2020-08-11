#ifndef NOVELRT_FIELDS_H
#define NOVELRT_FIELDS_H

#include "Types.h"

namespace NovelRT::Java {
  class FieldsData {
  public:
    FieldsData(jni::JNIEnv& env);
  };

  extern const FieldsData* Fields;
}


#endif //NOVELRT_FIELDS_H
