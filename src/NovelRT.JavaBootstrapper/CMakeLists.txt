find_package(JNI REQUIRED)

set(JAVA_BOOTSTRAPPER_SOURCES
  main.cpp ArgumentParser.cpp)

add_executable(JavaBootstrapper ${JAVA_BOOTSTRAPPER_SOURCES})
add_dependencies(JavaBootstrapper Engine Dotnet)

target_include_directories(JavaBootstrapper
  PRIVATE
  $<BUILD_INTERFACE:${CMAKE_SOURCE_DIR}/include>
  $<INSTALL_INTERFACE:include>
  ${JNI_SOURCE_DIRS})

target_link_libraries(JavaBootstrapper
  PRIVATE
    Engine
    ${JNI_LIBRARIES}
)

add_custom_command(
  TARGET JavaBootstrapper POST_BUILD
  COMMAND ${CMAKE_COMMAND} -E copy_directory
  $<TARGET_FILE_DIR:Engine>
  $<TARGET_FILE_DIR:JavaBootstrapper>
)

if (WIN32)
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
