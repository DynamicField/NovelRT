include(FindPackageHandleStandardArgs)

find_program(
  Maven_PROGRAM
  NAMES mvn
  HINTS ${Maven_ROOT_DIR}
  ENV ${Maven_INSTALL_DIR}
)

# The "mvn" file cannot be ran in Windows, unless with mvn.bat
if (WIN32 AND Maven_PROGRAM)
  string(APPEND Maven_PROGRAM ".cmd")
  
  if (NOT EXISTS "${Maven_PROGRAM}")
    message("Couldn't find maven.cmd.")
    unset(Maven_PROGRAM)
  endif()
endif()

if(Maven_PROGRAM)
  execute_process(
    COMMAND ${Maven_PROGRAM} --version
    OUTPUT_VARIABLE Maven_VERSION_OUTPUT
  )
  # Maven_VERSION_OUTPUT should be something something like 
  #   Apache Maven 3.6.3 (blahblahblah)
  #   Java version: 14.0.1, [some more stuff]
  #
  # We only need maven's version, so we match the "Apache Maven [version]" portion.
  # We don't need the full match so it goes in a "trash" variable.
  # Finally, we put the first group (the [version] part) in Maven_Version.
  string(REGEX MATCH "Apache Maven ([0-9.]+)" __UNUSED "${Maven_VERSION_OUTPUT}")
  set(Maven_VERSION "${CMAKE_MATCH_1}")
endif()

find_package_handle_standard_args(Maven
  REQUIRED_VARS Maven_PROGRAM
  VERSION_VAR Maven_VERSION
)