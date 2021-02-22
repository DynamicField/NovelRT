#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/GraphicsServiceBindings.h"

namespace NovelRT::Java {
  using Self = Types::RenderingService;
  using namespace TypeConversion;

  auto createBasicRect(jni::JNIEnv& env, Self::Object& self, Types::Transform::Object& transform,
                       Types::RGBAColour::Object& rgba, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto rect = service->createBasicFillRect(TransformConverter().fromJava(env, transform),
                                             static_cast<int>(layer),
                                             RGBAConfigConverter().fromJava(env, rgba));

    return Types::BasicRect::mainConstructor.invoke(env, Handles::toJava(rect.release()), jni::jni_true);
  }


  auto createTextRect(jni::JNIEnv& env, Self::Object& self, Types::Transform::Object& transform,
                      Types::RGBAColour::Object& rgba, jni::jfloat fontSize, Types::Path::Object& fontPath, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto fontPathString = jni::Make<std::string>(env, Types::NativeHelpers::toNativeString.invoke(env, fontPath));
    auto rect = service->createTextRect(TransformConverter().fromJava(env, transform),
                                        static_cast<int>(layer),
                                        RGBAConfigConverter().fromJava(env, rgba),
                                        fontSize,
                                        fontPathString);

    return Types::TextRect::mainConstructor.invoke(env, Handles::toJava(rect.release()), jni::jni_true);
  }


  void Bindings::registerGraphicsServiceBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Self::javaClass(),
                         jni::MakeNativeMethod<decltype(createBasicRect), &createBasicRect>(
                           "createBasicRect"),
                         jni::MakeNativeMethod<decltype(createTextRect), &createTextRect>("createTextRect"));
  }
}
