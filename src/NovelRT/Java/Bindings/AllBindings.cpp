#include "NovelRT/Java/Bindings/AllBindings.h"

#include "NovelRT/Java/Bindings/NovelRunnerBindings.h"
#include "NovelRT/Java/Bindings/WorldObjectBindings.h"
#include "NovelRT/Java/Bindings/RenderObjectBindings.h"
#include "NovelRT/Java/Bindings/SceneConstructionRequestedEventBindings.h"
#include "NovelRT/Java/Bindings/TransformBindings.h"
#include "NovelRT/Java/Bindings/TextBindings.h"
#include "NovelRT/Java/Bindings/GraphicsServiceBindings.h"

namespace NovelRT::Java::Bindings {
  std::vector<void (*)(jni::JNIEnv&)> AllBindingRegisterers{
    &registerNovelRunnerBindings,
    &registerWorldObjectBindings,
    &registerRenderObjectBindings,
    &registerSceneConstructionRequestedEventBindings,
    &registerTransformBindings,
    &registerTextBindings,
    &registerGraphicsServiceBindings
  };
}
