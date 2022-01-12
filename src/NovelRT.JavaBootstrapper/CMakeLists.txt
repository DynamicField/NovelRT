include(CopyBuildProducts)
find_package(JNI REQUIRED)

set(JAVA_BOOTSTRAPPER_SOURCES
  main.cpp ArgumentParser.cpp StringConversions.cpp)

add_executable(JavaBootstrapper ${JAVA_BOOTSTRAPPER_SOURCES})
add_dependencies(JavaBootstrapper Engine JavaSupport Interop Resources)
target_include_directories(JavaBootstrapper
  PRIVATE
  $<BUILD_INTERFACE:${CMAKE_SOURCE_DIR}/include>
  $<INSTALL_INTERFACE:include>)

add_library(JNI::JVM UNKNOWN IMPORTED)
set_target_properties(JNI::JVM
  PROPERTIES
    INTERFACE_INCLUDE_DIRECTORIES "${JAVA_INCLUDE_PATH};${JAVA_INCLUDE_PATH2}"
    IMPORTED_LOCATION "${JAVA_JVM_LIBRARY}")

target_link_libraries(JavaBootstrapper
  PRIVATE
    Engine
    JavaSupport
    JNI::JVM
)

copy_build_products(JavaBootstrapper
  DEPENDENCY Resources
  TARGET_LOCATION $<TARGET_FILE_DIR:JavaBootstrapper>/Resources

  DEPENDENCY Engine
  TARGET_LOCATION $<TARGET_FILE_DIR:JavaBootstrapper>

  DEPENDENCY Interop
  TARGET_LOCATION $<TARGET_FILE_DIR:JavaBootstrapper>

  DEPENDENCY JavaSupport
  TARGET_LOCATION $<TARGET_FILE_DIR:JavaBootstrapper>

  DEPENDENCY Dotnet
  DEPENDENCY_FILES nethost.dll
  TARGET_LOCATION $<TARGET_FILE_DIR:JavaBootstrapper>
  CONDITION NOVELRT_INCLUDE_INK AND WIN32)

#add_custom_command(
#  TARGET JavaBootstrapper POST_BUILD
#  COMMAND ${CMAKE_COMMAND} -E copy_directory
#  $<TARGET_FILE_DIR:Engine>
#  $<TARGET_FILE_DIR:JavaBootstrapper>
#)
#
#add_custom_command(
#  TARGET JavaBootstrapper POST_BUILD
#  COMMAND ${CMAKE_COMMAND} -E copy_directory
#  $<TARGET_FILE_DIR:Resources>
#  $<TARGET_FILE_DIR:JavaBootstrapper>/Resources
#)
#
#add_custom_command(
#  TARGET JavaBootstrapper POST_BUILD
#  COMMAND ${CMAKE_COMMAND} -E copy_directory
#  $<TARGET_FILE_DIR:Interop>
#  $<TARGET_FILE_DIR:JavaBootstrapper>
#)
#
#add_custom_command(
#  TARGET JavaBootstrapper POST_BUILD
#  COMMAND ${CMAKE_COMMAND} -E copy_directory
#  $<TARGET_FILE_DIR:JavaSupport>
#  $<TARGET_FILE_DIR:JavaBootstrapper>
#)

if(WIN32)
  add_custom_command(
    TARGET JavaBootstrapper POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E copy_directory
    ${CMAKE_CURRENT_LIST_DIR}/windows
    $<TARGET_FILE_DIR:JavaBootstrapper>
  )
#  # Temporary fix.
#  add_custom_command(
#    TARGET JavaBootstrapper POST_BUILD
#    COMMAND ${CMAKE_COMMAND} -E copy
#    $<TARGET_FILE_DIR:Dotnet>/nethost.dll
#    $<TARGET_FILE_DIR:JavaBootstrapper>/nethost.dll
#  )
endif()
