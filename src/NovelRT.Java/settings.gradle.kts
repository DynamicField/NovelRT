@file:Suppress("UnstableApiUsage")

import java.util.Properties

rootProject.name = "novelrt-java-project"

val repositoriesProps = Properties()
val repositoriesFile = file("repositories.properties")
if (repositoriesFile.exists()) {
  repositoriesFile.inputStream().use(repositoriesProps::load)
} else {
  try {
    if (repositoriesFile.createNewFile()) {
      java.io.PrintWriter(repositoriesFile.outputStream()).use { writer ->
        writer.write("# novelrt.fumocement.path=\n")
        writer.write("# novelrt.plugin.path=\n")
      }
    }
  } catch (e: java.io.IOException) {
    // Let's not explode our build for that little incident.
  }
}

include("novelrt")
include("sample-kotlin")

val fumoCementPath = repositoriesProps["novelrt.fumocement.path"]
if (fumoCementPath != null) {
  includeBuild(file(fumoCementPath))
}

val pluginPath = repositoriesProps["novelrt.plugin.path"]
if (pluginPath != null) {
  includeBuild(file(pluginPath))
}

project(":novelrt").projectDir = file("core")

pluginManagement {
  plugins {
    id("org.beryx.jlink") version "2.22.3"
  }
}
