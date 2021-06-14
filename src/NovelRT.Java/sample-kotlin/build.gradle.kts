plugins {
  id("com.github.novelrt.java-conventions-jlinked-application")
}

dependencies {
  implementation(project(":novelrt"))
  implementation(project(":fumocement"))
}

val moduleName by extra("novelrt.sample.kotlin")

application {
  mainModule.set("novelrt.sample.kotlin")
  mainClass.set("com.github.novelrt.sample.kotlin.MainKt")
}

tasks {
  prepareMergedJarsDir {
    outputs.upToDateWhen { false }
  }
}

description = "NovelRT for Java - Sample in Kotlin"
