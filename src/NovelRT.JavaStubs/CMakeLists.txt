set(SOURCES
  main.cpp)

add_library(JavaStubs SHARED ${SOURCES})
add_dependencies(JavaStubs Engine Interop)

set_property(TARGET Interop PROPERTY OUTPUT_NAME "NovelRT.JavaStubs")

target_compile_features(JavaStubs PUBLIC cxx_std_17)
target_include_directories(JavaStubs
  PUBLIC
  $<BUILD_INTERFACE:${CMAKE_SOURCE_DIR}/include>
  $<INSTALL_INTERFACE:include>
)

add_library(JNI::JVM UNKNOWN IMPORTED)
set_target_properties(JNI::JVM
  PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${JAVA_INCLUDE_PATH};${JAVA_INCLUDE_PATH2}"
  IMPORTED_LOCATION "${JAVA_JVM_LIBRARY}")

target_link_libraries(JavaStubs
  PUBLIC
  Engine
  Interop
  JNI::JVM)

if(MSVC)
  target_compile_options(JavaStubs
    PRIVATE
    /W4
    /WX
    /wd4611
    /MP
    )
  get_target_property(opts Interop COMPILE_OPTIONS)
elseif(CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
  target_compile_options(JavaStubs
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
  target_compile_options(JavaStubs
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
