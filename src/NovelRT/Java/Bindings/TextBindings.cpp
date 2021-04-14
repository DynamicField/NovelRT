#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/Utilities.h"
#include "NovelRT/Java/Bindings/TextBindings.h"

namespace NovelRT::Java::Bindings {
  using namespace Graphics;

  using Self = Types::TextRect;

  void registerTextBindings(jni::JNIEnv& env) {
    bindProperty<Self, Types::RGBAColour,
      TraditionalProperty<&TextRect::getColourConfig, &TextRect::setColourConfig>>(env, "colour");

    bindProperty<Self, jni::String,
      TraditionalProperty<&TextRect::getText, &TextRect::setText>>(env, "text");
  }
}
