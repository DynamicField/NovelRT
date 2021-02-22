find_package(Freetype 2.8.1 REQUIRED)
find_package(glad 0.1.30 REQUIRED
  COMPONENTS
    REPRODUCIBLE
    SPEC gl
    PROFILE core
    API gl=4.0,gles2=3.0
)
find_package(GLFW 3.2.1 REQUIRED)
find_package(OpenAL 1.19.1 REQUIRED)
find_package(PNG 1.6.34 REQUIRED)
find_package(Sndfile 1.0.28 REQUIRED)
find_package(spdlog 1.4.2 REQUIRED)
find_package(JNI REQUIRED)

add_library(OpenAL::OpenAL UNKNOWN IMPORTED)
set_target_properties(OpenAL::OpenAL
  PROPERTIES
    INTERFACE_INCLUDE_DIRECTORIES "${OPENAL_INCLUDE_DIR}"
    IMPORTED_LOCATION "${OPENAL_LIBRARY}"
)

set(ENGINE_SOURCES
  Animation/SpriteAnimator.cpp

  Audio/AudioService.cpp

  DebugService.cpp

  DotNet/RuntimeService.cpp

  Ecs/Catalogue.cpp
  Ecs/ComponentBufferMemoryContainer.cpp
  Ecs/ComponentCache.cpp
  Ecs/EntityCache.cpp
  Ecs/SparseSetMemoryContainer.cpp
  Ecs/SystemScheduler.cpp
  Ecs/UnsafeComponentView.cpp

  Graphics/BasicFillRect.cpp
  Graphics/Camera.cpp
  Graphics/FontSet.cpp
  Graphics/ImageRect.cpp
  Graphics/RenderingService.cpp
  Graphics/RenderObject.cpp
  Graphics/RGBAConfig.cpp
  Graphics/TextRect.cpp
  Graphics/Texture.cpp

  Ink/InkService.cpp
  Ink/Story.cpp

  Input/BasicInteractionRect.cpp
  Input/InteractionObject.cpp
  Input/InteractionService.cpp

  Java/Bindings/NovelRunnerBindings.cpp
  Java/Bindings/WorldObjectBindings.cpp
  Java/StringConversions.cpp
  Java/Handles.cpp
  Java/Bindings/SceneConstructionRequestedEventBindings.cpp
  Java/Bindings/TransformBindings.cpp
  Java/Bindings/TextBindings.cpp
  Java/Bindings/GraphicsServiceBindings.cpp
  Java/Bindings/RenderObjectBindings.cpp
  Java/Init.cpp
  Java/TypeConversion/Vector2TypeConverter.cpp
  Java/TypeConversion/TransformTypeConverter.cpp
  Java/TypeConversion/RGBAConfigTypeConverter.cpp

  LoggingService.cpp

  Maths/GeoBounds.cpp
  Maths/QuadTree.cpp

  NovelRunner.cpp

  Timing/StepTimer.cpp

  Transform.cpp

  Utilities/Misc.cpp

  Windowing/WindowingService.cpp

  WorldObject.cpp Java/Bindings/AllBindings.cpp)

add_library(Engine SHARED ${ENGINE_SOURCES})
add_dependencies(Engine Dotnet Java)
target_compile_features(Engine PUBLIC cxx_std_17)
target_include_directories(Engine
  PUBLIC
    $<BUILD_INTERFACE:${CMAKE_SOURCE_DIR}/include>
    $<INSTALL_INTERFACE:include>
    ${JNI_INCLUDE_DIRS}
)


if(MSVC)
  target_compile_options(Engine
    PRIVATE
      /W4
      /WX
      /wd4611
      /MP
  )
  get_target_property(opts Engine COMPILE_OPTIONS)
elseif(CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
  target_compile_options(Engine
    PRIVATE
      -pedantic
      -pedantic-errors
      -Wall
      -Wextra
      -Werror
      -Wno-float-equal
      -Wno-padded
  )
else()
  target_compile_options(Engine
    PRIVATE
      -pedantic
      -pedantic-errors
      -Wall
      -Wextra
      -Werror
      -Wno-c++98-compat
      -Wno-c++98-compat-pedantic
      -Wno-float-equal
      -Wno-padded
      -Wno-reserved-id-macro
  )
endif()

message(STATUS "Libraries: ${JNI_LIBRARIES} ; include dirs ${JNI_INCLUDE_DIRS}")

target_link_libraries(Engine
  PUBLIC
    CoreCLR::nethost
    Freetype::Freetype
    Glad::GLAD
    GLFW::GLFW3
    OpenAL::OpenAL
    PNG::PNG
    Sndfile::sndfile
    spdlog::spdlog
    #[[JNI::JVM]]
    ${JNI_LIBRARIES}
)
