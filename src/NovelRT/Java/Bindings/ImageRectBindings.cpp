#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/Utilities.h"

#include "NovelRT/Java/Bindings/ImageRectBindings.h"

namespace NovelRT::Java::Bindings {
  using Self = Types::ImageRect;

  void registerImageRectBindings(jni::JNIEnv& env) {
    bindProperty<Self, Types::RGBAColour,
      modifiable(&Graphics::ImageRect::colourTint)>(env, "colourTint");
  }
}
