import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("com.github.novelrt.java-conventions-jlinked-application")
  kotlin("jvm")
}

dependencies {
  implementation(project(":novelrt"))
  implementation(project(":fumocement"))
  implementation(kotlin("stdlib-jdk8"))
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
repositories {
  mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
  jvmTarget = "1.8"
}
