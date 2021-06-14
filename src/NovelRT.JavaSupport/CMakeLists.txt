set(SOURCES
  main.cpp)

add_library(JavaSupport SHARED ${SOURCES})
add_dependencies(JavaSupport Engine Interop)

set_property(TARGET JavaSupport PROPERTY OUTPUT_NAME "NovelRT.JavaSupport")

target_compile_features(JavaSupport PUBLIC cxx_std_17)
target_include_directories(JavaSupport
  PUBLIC
  $<BUILD_INTERFACE:${CMAKE_SOURCE_DIR}/include>
  $<INSTALL_INTERFACE:include>
)

add_library(JNI::JVM UNKNOWN IMPORTED)
set_target_properties(JNI::JVM
  PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${JAVA_INCLUDE_PATH};${JAVA_INCLUDE_PATH2}"
  IMPORTED_LOCATION "${JAVA_JVM_LIBRARY}")

target_link_libraries(JavaSupport
  PUBLIC
    Engine
    Interop
    JNI::JVM)

if(MSVC)
  target_compile_options(JavaSupport
    PRIVATE
    /W4
    /WX
    /wd4611
    /MP
    )
  get_target_property(opts Interop COMPILE_OPTIONS)
elseif(CMAKE_CXX_COMPILER_ID STREQUAL "GNU")
  target_compile_options(JavaSupport
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
  target_compile_options(JavaSupport
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
