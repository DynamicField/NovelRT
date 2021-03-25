@file:Suppress("UnstableApiUsage")

rootProject.name = "novelrt-java-project"

include("novelrt")
include("sample-kotlin")
include("sample-java")
include("code-generation-annotations")
include("code-generation")

project(":novelrt").projectDir = file("core")

pluginManagement {
  plugins {
    id("org.beryx.jlink") version "2.22.3"
  }
}

