find_package(Maven 3.6.0 REQUIRED)

set(PROJECT ${CMAKE_CURRENT_LIST_DIR}/pom.xml)

set(OPTIONS
  -DnovelrtClassOutput=${CMAKE_CURRENT_BINARY_DIR}/classes
  -DnovelrtOutput=${CMAKE_CURRENT_BINARY_DIR}/target
  -DnovelrtRoot=${PROJECT_SOURCE_DIR}
  -T 1C
)

add_executable(Java IMPORTED GLOBAL)
add_dependencies(Java Java_Build)
add_custom_target(Java_Build
  COMMAND ${Maven_PROGRAM} clean package -f ${PROJECT} ${OPTIONS}
  DEPENDS ${CMAKE_CURRENT_BINARY_DIR}
)
