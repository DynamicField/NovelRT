#ifndef NOVELRT_ALLTYPES_H
#define NOVELRT_ALLTYPES_H

#include "Type.h"

namespace NovelRT::Java::Types {
  struct HandleObject : public Type<HandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/internal/HandleObject"; }

    static inline MethodDef<jni::jlong()> getHandle{"getHandle"};
  };

  struct OwnedHandleObject : public Type<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/internal/OwnedHandleObject"; }

    static inline MethodDef<void()> invalidate{"invalidate"};
  };

  struct UnownedHandleObject : public Type<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/internal/UnownedHandleObject"; }
  };

  struct Transform : public Type<Transform>, Super<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/maths/Transform"; }

    static inline ConstructorDef <jni::jlong> mainConstructor{};
  };

  struct Vector2 : public Type<Vector2> {
    static constexpr auto Name() { return "com/github/novelrt/maths/Vector2"; }

    static inline ConstructorDef <jni::jfloat, jni::jfloat> mainConstructor{};

    static inline FieldDef <jni::jfloat> x{"x"};
    static inline FieldDef <jni::jfloat> y{"y"};
  };

  struct NovelRunner : public Type<NovelRunner>, Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/NovelRunner"; }
  };

  struct WorldObject : public Type<WorldObject>, Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/WorldObject"; }

    static inline ConstructorDef <jni::jlong, jni::jboolean> mainConstructor{};
  };

  struct RenderObject : public Type<RenderObject>, Super<WorldObject> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/RenderObject"; }

    static inline ConstructorDef <jni::jlong, jni::jboolean> mainConstructor{};
  };

  struct Event : public Type<Event>, Super<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/event/Event"; }
  };

  struct EventListener : public Type<EventListener> {
    static constexpr auto Name() { return "java/util/EventListener"; }
  };

  struct SceneConstructionRequestedEvent : public Type<SceneConstructionRequestedEvent>, Super<Event> {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedEvent"; }

    static inline ConstructorDef <jni::jlong> mainConstructor;
  };

  struct SceneConstructionRequestedListener : public Type<SceneConstructionRequestedListener>, Super<EventListener> {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedListener"; }

    static inline MethodDef<void()> listen{"listen"};
  };
}

#endif //NOVELRT_ALLTYPES_H
