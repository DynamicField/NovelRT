#ifndef NOVELRT_ALLTYPES_H
#define NOVELRT_ALLTYPES_H

#include "Type.h"

namespace NovelRT::Java::Types {
  // Handles

  struct HandleObject : public Type<HandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/handle/HandleObject"; }

    static inline MethodDef<jlong()> getHandle{"getHandle"};
  };

  struct OwnedHandleObject : public Type<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/handle/OwnedHandleObject"; }

    static inline MethodDef<void()> invalidate{"invalidate"};
  };

  struct UnownedHandleObject : public Type<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/handle/UnownedHandleObject"; }
  };

  // Root stuff

  struct WorldObject : public Type<WorldObject> {
    static constexpr auto Name() { return "com/github/novelrt/WorldObject"; }
  };

  struct BridgeWorldObject : public Type<BridgeWorldObject>, Super<Types::OwnedHandleObject>, Super<WorldObject> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/BridgeWorldObject"; }

    static inline ConstructorDef <jlong, jboolean> mainConstructor{};
  };

  struct NovelRunner : public Type<NovelRunner>, Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/NovelRunner"; }
  };

  // Events

  struct Event : public Type<Event> {
    static constexpr auto Name() { return "com/github/novelrt/event/Event"; }
  };

  struct EventListener : public Type<EventListener> {
    static constexpr auto Name() { return "java/util/EventListener"; }
  };

  struct SceneConstructionRequestedListener : public Type<SceneConstructionRequestedListener>, Super<EventListener> {
    static constexpr auto Name() { return "com/github/novelrt/event/SceneConstructionRequestedListener"; }

    static inline MethodDef<void()> listen{"listen"};
  };

  struct BridgeEvent : public Type<BridgeEvent>, Super<UnownedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/event/Event"; }
  };

  struct SceneConstructionRequestedBridgeEvent : public Type<SceneConstructionRequestedBridgeEvent>, Super<BridgeEvent> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/event/SceneConstructionRequestedBridgeEvent"; }

    static inline ConstructorDef <jlong> mainConstructor;
  };

  // Graphics

  struct RenderObject : public Type<RenderObject> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/RenderObject"; }
  };

  struct BridgeRenderObject : public Type<BridgeRenderObject>, Super<BridgeWorldObject>, Super<RenderObject> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/graphics/BridgeRenderObject"; }

    static inline ConstructorDef <jlong, jboolean> mainConstructor{};
  };

  struct TextRect : public Type<TextRect> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/TextRect"; }
  };

  struct BridgeTextRect : public Type<BridgeTextRect>, Super<BridgeRenderObject>, Super<TextRect> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/graphics/BridgeTextRect"; }
  };

  struct RenderingService : public Type<RenderingService> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/RenderingService"; }
  };

  struct BridgeRenderingService : public Type<BridgeRenderingService>, Super<RenderingService> {
    static constexpr auto Name() { return "com/github/novelrt/bridge/graphics/BridgeRenderingService"; }

    static inline ConstructorDef <jlong> mainConstructor{};
  };

  struct RGBAColour : public Type<RGBAColour> {
    static constexpr auto Name() { return "com/github/novelrt/graphics/RGBAColour"; }

    static inline ConstructorDef<jni::jint, jni::jint, jni::jint, jni::jint> mainConstructor{};
    static inline ConstructorDef<jni::jint> rgbaConstructor{};
    static inline MethodDef<jni::jint()> asRGBA{"asRGBA"};
  };

  // Maths

  struct Transform : public Type<Transform>, Super<OwnedHandleObject> {
    static constexpr auto Name() { return "com/github/novelrt/maths/Transform"; }

    static inline ConstructorDef <jlong, jboolean> mainConstructor{};
  };

  struct Vector2 : public Type<Vector2> {
    static constexpr auto Name() { return "com/github/novelrt/maths/Vector2"; }

    static inline ConstructorDef <jfloat, jfloat> mainConstructor{};

    static inline FieldDef <jfloat> x{"x"};
    static inline FieldDef <jfloat> y{"y"};
  };
}

#endif //NOVELRT_ALLTYPES_H
