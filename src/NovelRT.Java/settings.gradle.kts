@file:Suppress("UnstableApiUsage")

rootProject.name = "novelrt-java-project"

include("novelrt")
include("sample-kotlin")
include("sample-java")
include("fumocement")
includeBuild(file("D:\\Users\\jeuxj\\Documents\\Source Projects Dev\\FumoCement"))

project(":novelrt").projectDir = file("core")

pluginManagement {
  plugins {
    id("org.beryx.jlink") version "2.22.3"
  }
}
