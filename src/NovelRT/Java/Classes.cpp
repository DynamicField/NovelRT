#include "NovelRT/Java/Classes.h"

namespace NovelRT::Java {
  const ClassesData* Classes = nullptr;

  ClassesData::ClassesData(JNIEnv& env) :
    HandleObject(find<Types::HandleObject>(env)),
    OwnedHandleObject(find<Types::OwnedHandleObject>(env)),
    UnownedHandleObject(find<Types::UnownedHandleObject>(env)),
    Transform(find<Types::Transform>(env)),
    NovelRunner(find<Types::NovelRunner>(env)),
    WorldObject(find<Types::WorldObject>(env)),
    RenderObject(find<Types::RenderObject>(env)),
    Event(find<Types::Event>(env)),
    SceneConstructionRequestedEvent(find<Types::SceneConstructionRequestedEvent>(env)),
    SceneConstructionRequestedListener(find<Types::SceneConstructionRequestedListener>(env)),
    Vector2(find<Types::Vector2>(env)) {
  }
}
