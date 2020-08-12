#ifndef NOVELRT_TYPES_H
#define NOVELRT_TYPES_H

#include <jni/jni.hpp>

namespace NovelRT::Java::Types {
  namespace {
    template<typename Tag>
    struct Super {
      using SuperTag = Tag;
    };
  }

  struct HandleObject {
    static constexpr auto Name() { return "com/github/novelrt/internal/HandleObject"; }
  };

  struct OwnedHandleObject {
    static constexpr auto Name() { return "com/github/novelrt/internal/OwnedHandleObject"; }
  };

  struct UnownedHandleObject {
    static constexpr auto Name() { return "com/github/novelrt/internal/UnownedHandleObject"; }
  };

  struct Transform : public Super<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/maths/Transform"; }
  };

  struct Vector2 {
    static constexpr auto Name() { return "com/github/novelrt/maths/Vector2"; }
  };

  struct NovelRunner : public Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/NovelRunner"; }
  };

  struct WorldObject : public Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/WorldObject"; }
  };

  struct RenderObject : public Super<WorldObject> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/RenderObject"; }
  };

  struct Event : public Super<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/event/Event"; }
  };

  struct EventListener {
    static constexpr auto Name() { return "java/util/EventListener"; }
  };

  struct SceneConstructionRequestedEvent : public Super<Event> {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedEvent"; }
  };

  struct SceneConstructionRequestedListener : public Super<EventListener> {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedListener"; }
  };
}

#undef NOVELRT_TYPE

#endif //NOVELRT_TYPES_H
