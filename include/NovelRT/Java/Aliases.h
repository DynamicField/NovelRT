#ifndef NOVELRT_ALIASES_H
#define NOVELRT_ALIASES_H

#include <jni/jni.hpp>

namespace NovelRT::Java {
  template <typename Tag>
  struct TagTypes {
    using Object = jni::Object<Tag>;
    using Class = jni::Class<Tag>;
    using Type = Tag;
  };
}

#endif //NOVELRT_ALIASES_H
