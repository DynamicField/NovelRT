#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using namespace Graphics;

  using Self = Types::BridgeTextRect;

  void Bindings::registerBridgeTextBindings(jni::JNIEnv& env) {
    Bindings::bindProperty<Self, Types::RGBAColour,
      TraditionalProperty<&TextRect::getColourConfig, &TextRect::setColourConfig>>(env, "colour");

    Bindings::bindProperty<Self, jni::String,
      TraditionalProperty<&TextRect::getText, &TextRect::setText>>(env, "text");
  }
}
