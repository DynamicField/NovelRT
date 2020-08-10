#ifndef NOVELRT_TYPES_H
#define NOVELRT_TYPES_H

#include <jni/jni.hpp>

namespace NovelRT::Java::Types {
  struct HandleObject {
    static constexpr auto Name() {
      return "com/github/novelrt/bind/HandleObject";
    }
  };

  struct Transform {
    static constexpr auto Name() { return "com/github/novelrt/maths/Transform"; }
  };

  struct NovelRunner {
    static constexpr auto Name() { return "com/github/novelrt/NovelRunner"; }
  };

  struct WorldObject {
    static constexpr auto Name() { return "com/github/novelrt/WorldObject"; }
  };
}

#undef NOVELRT_TYPE

#endif //NOVELRT_TYPES_H
