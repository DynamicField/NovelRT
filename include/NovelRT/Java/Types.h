#ifndef NOVELRT_TYPES_H
#define NOVELRT_TYPES_H

#include <jni/jni.hpp>

namespace NovelRT::Java::Types {
  struct HandleObject {
    static constexpr auto Name() {
      return "com/github/novelrt/internal/HandleObject";
    }
  };

  struct Transform {
    static constexpr auto Name() { return "com/github/novelrt/maths/Transform"; }
  };

  struct NovelRunner : public HandleObject {
    static constexpr auto Name() { return "com/github/novelrt/NovelRunner"; }
  };

  struct WorldObject : public HandleObject {
    static constexpr auto Name() { return "com/github/novelrt/WorldObject"; }
  };

  struct Event : public HandleObject {
    static constexpr auto Name() { return "com/github/novelrt/event/Event"; }
  };

  struct SceneConstructionRequestedEvent : public Event {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedEvent"; }
  };

  struct SceneConstructionRequestedListener {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedListener"; }
  };

  struct EventListener {
    static constexpr auto Name() { return "java/util/EventListener"; }
  };
}

#undef NOVELRT_TYPE

#endif //NOVELRT_TYPES_H
