#include "NovelRT/Java/Classes.h"

namespace NovelRT::Java {
  const ClassesData* Classes = nullptr;

  ClassesData::ClassesData(JNIEnv& env) :
          HandleObject(find<Types::HandleObject>(env)),
          Transform(find<Types::Transform>(env)),
          NovelRunner(find<Types::NovelRunner>(env)),
          WorldObject(find<Types::WorldObject>(env)),
          Event(find<Types::Event>(env)),
          SceneConstructionRequestedEvent(find<Types::SceneConstructionRequestedEvent>(env)),
          SceneConstructionRequestedListener(find<Types::SceneConstructionRequestedListener>(env)){
  }
}
