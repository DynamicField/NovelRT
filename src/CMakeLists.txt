if(NOVELRT_INCLUDE_INK)
  add_subdirectory(NovelRT.DotNet)
endif()
if (NOVELRT_BUILD_INTEROP)
  add_subdirectory(NovelRT.Interop)
endif()
# TODO: NOVELRT_BUILD_JAVA
add_subdirectory(NovelRT)
add_subdirectory(NovelRT.Java)
add_subdirectory(NovelRT.JavaSupport)
add_subdirectory(NovelRT.JavaBootstrapper)

