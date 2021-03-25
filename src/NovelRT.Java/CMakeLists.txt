set(GRADLE_OPTIONS "")

if(WIN32)
  set(GRADLE_WRAPPER gradlew.bat)
else()
  set(GRADLE_WRAPPER gradlew)
endif()

add_executable(Java IMPORTED GLOBAL)
add_dependencies(Java Java_Build)
add_custom_target(Java_Build
  COMMAND ${GRADLE_WRAPPER} build ${GRADLE_OPTIONS}
  DEPENDS ${CMAKE_CURRENT_BINARY_DIR}
  WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR})

add_custom_target(Java_CodeGen
  COMMAND ${GRADLE_WRAPPER} :novelrt:kaptKotlin ${GRADLE_OPTIONS}
  DEPENDS ${CMAKE_CURRENT_BINARY_DIR}
  WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR})
