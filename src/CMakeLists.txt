add_subdirectory(NovelRT)
if (NOVELRT_BUILD_INTEROP)
  message(STATUS "Building NovelRT with Interop Support")
  add_subdirectory(NovelRT.Interop)
endif()
# TODO: NOVELRT_BUILD_JAVA
add_subdirectory(NovelRT.Java)
add_subdirectory(NovelRT.JavaSupport)
add_subdirectory(NovelRT.JavaBootstrapper)

