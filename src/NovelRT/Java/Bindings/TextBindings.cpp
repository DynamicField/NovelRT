#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/TextBindings.h"

namespace NovelRT::Java {
  using namespace Graphics;

  using Self = Types::TextRect;

  void Bindings::registerTextBindings(jni::JNIEnv& env) {
    Bindings::bindProperty<Self, Types::RGBAColour,
      TraditionalProperty<&TextRect::getColourConfig, &TextRect::setColourConfig>>(env, "colour");

    Bindings::bindProperty<Self, jni::String,
      TraditionalProperty<&TextRect::getText, &TextRect::setText>>(env, "text");
  }
}
