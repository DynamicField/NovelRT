import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("com.github.novelrt.java-conventions-library")
  kotlin("jvm")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0-RC")
  implementation(project(":fumocement"))
}

val moduleName by extra("novelrt")

tasks {
  compileJava {
    inputs.property("moduleName", moduleName)
    options.compilerArgs = listOf(
      "--patch-module", "${moduleName}=${sourceSets.main.get().output.asPath}"
    )
  }
}

description = "NovelRT for Java - Core"
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
