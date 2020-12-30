#include "NovelRT/Java/JavaSupport.h"

namespace NovelRT::Java {
  using Self = Types::BridgeRenderingService;
  using namespace TypeConversion;

  jni::jlong createBasicRectNative(jni::JNIEnv& env, Self::Object& self, jni::Object<Types::Transform>& transform,
                                   jni::jint rgba, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto rect = service->createBasicFillRect(TransformConverter().fromJava(env, transform),
                                             static_cast<int>(layer),
                                             RGBAConfigConverter().fromRGBA(static_cast<int>(rgba)));

    return Handles::toJava(rect.release());
  }


  jni::jlong createTextRectNative(jni::JNIEnv& env, Self::Object& self, jni::Object<Types::Transform>& transform,
                              jni::jint rgba, jni::jfloat fontSize, jni::String& fontPath, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto rect = service->createTextRect(TransformConverter().fromJava(env, transform),
                                        static_cast<int>(layer),
                                        RGBAConfigConverter().fromRGBA(static_cast<int>(rgba)),
                                        fontSize,
                                        jni::Make<std::string>(env, fontPath));

    return Handles::toJava(rect.release());
  }


  void Bindings::registerBridgeGraphicsServiceBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Self::javaClass(),
                         jni::MakeNativeMethod<decltype(createBasicRectNative), &createBasicRectNative>(
                           "createBasicRectNative"),
                           jni::MakeNativeMethod<decltype(createTextRectNative), &createTextRectNative>("createTextRectNative"));
  }
}
