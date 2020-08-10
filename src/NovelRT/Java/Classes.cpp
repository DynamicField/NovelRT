#include "NovelRT/Java/Classes.h"

namespace NovelRT::Java {
  const ClassesData* Classes = nullptr;

  ClassesData::ClassesData(JNIEnv& env) :
          HandleObject(createClass<Types::HandleObject>(env)),
          Transform(createClass<Types::Transform>(env)),
          NovelRunner(createClass<Types::NovelRunner>(env)),
          WorldObject(createClass<Types::WorldObject>(env)) {
  }
}
