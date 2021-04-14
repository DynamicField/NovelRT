#include "NovelRT/Java/JavaSupport.h"
#include "NovelRT/Java/Bindings/RenderingServiceBindings.h"

namespace NovelRT::Java::Bindings {
  using Self = Types::RenderingService;

  auto createBasicRect(jni::JNIEnv& env, Self::Object& self, Types::Transform::Object& transform,
                       Types::RGBAColour::Object& rgba, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto rect = service->createBasicFillRect(TypeConversion::convertToNative<Transform>(env, transform),
                                             static_cast<int>(layer),
                                             TypeConversion::convertToNative<Graphics::RGBAConfig>(env, rgba));

    return Types::BasicRect::mainConstructor.invoke(env, Handles::toJava(rect.release()), jni::jni_true);
  }

  auto createTextRect(jni::JNIEnv& env, Self::Object& self, Types::Transform::Object& transform,
                      Types::RGBAColour::Object& rgba, jni::jfloat fontSize, Types::Path::Object& fontPath,
                      jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto fontPathString = jni::Make<std::string>(env, Types::NativeHelpers::toNativeString.invoke(env, fontPath));
    auto rect = service->createTextRect(TypeConversion::convertToNative<Transform>(env, transform),
                                        static_cast<int>(layer),
                                        TypeConversion::convertToNative<Graphics::RGBAConfig>(env, rgba),
                                        fontSize,
                                        fontPathString);

    return Types::TextRect::mainConstructor.invoke(env, Handles::toJava(rect.release()), jni::jni_true);
  }

  auto createImageRect(jni::JNIEnv& env, Self::Object& self,
                       Types::Transform::Object& transform, Types::Path::Object& imagePath,
                       Types::RGBAColour::Object& colourTint, jni::jint layer) {
    auto* service = Handles::get<Graphics::RenderingService>(env, *self);

    auto imagePathString = jni::Make<std::string>(env, Types::NativeHelpers::toNativeString.invoke(env, imagePath));
    auto rect = service->createImageRect(TypeConversion::convertToNative<Transform>(env, transform),
                                         layer,
                                         imagePathString,
                                         TypeConversion::convertToNative<Graphics::RGBAConfig>(env, colourTint));

    return Types::ImageRect::mainConstructor.invoke(env, Handles::toJava(rect.release()), jni::jni_true);
  }

  void registerGraphicsServiceBindings(jni::JNIEnv& env) {
    jni::RegisterNatives(env, *Self::javaClass(),
                         jni::MakeNativeMethod<decltype(createBasicRect), &createBasicRect>(
                           "createBasicRect"),
                         jni::MakeNativeMethod<decltype(createTextRect), &createTextRect>("createTextRect"),
                           jni::MakeNativeMethod<decltype(createImageRect), &createImageRect>("createImageRect"));
  }
}
