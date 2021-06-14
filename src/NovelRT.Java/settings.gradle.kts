@file:Suppress("UnstableApiUsage")

rootProject.name = "novelrt-java-project"

include("novelrt")
include("sample-kotlin")
include("sample-java")
include("fumocement")

project(":novelrt").projectDir = file("core")
// TODO: don't do this lol
project(":fumocement").projectDir = file("D:\\Users\\jeuxj\\Documents\\Source Projects Dev\\FumoCement")

pluginManagement {
  plugins {
    id("org.beryx.jlink") version "2.22.3"
  }
}

