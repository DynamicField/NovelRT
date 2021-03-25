find_package(JNI REQUIRED)

set(JAVA_BOOTSTRAPPER_SOURCES
  main.cpp ArgumentParser.cpp)

add_executable(JavaBootstrapper ${JAVA_BOOTSTRAPPER_SOURCES})
add_dependencies(JavaBootstrapper Engine Dotnet)

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
    JNI::JVM
)

add_custom_command(
  TARGET JavaBootstrapper POST_BUILD
  COMMAND ${CMAKE_COMMAND} -E copy_directory
  $<TARGET_FILE_DIR:Engine>
  $<TARGET_FILE_DIR:JavaBootstrapper>
)

if(WIN32)
  add_custom_command(
    TARGET JavaBootstrapper POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E copy_directory
    ${CMAKE_CURRENT_LIST_DIR}/windows
    $<TARGET_FILE_DIR:JavaBootstrapper>
  )
  # Temporary fix.
  add_custom_command(
    TARGET JavaBootstrapper POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E copy
    $<TARGET_FILE_DIR:Dotnet>/nethost.dll
    $<TARGET_FILE_DIR:JavaBootstrapper>/nethost.dll
  )
endif()
