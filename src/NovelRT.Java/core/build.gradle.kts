import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
  mavenCentral()
}

plugins {
  id("com.github.novelrt.java-conventions-library")
  kotlin("jvm")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
  // api includes the dependency transitively, which is necessary for resolving
  // NativeObject-derived types and other inline optimizations
  api("com.github.novelrt:fumo-cement:1.0-SNAPSHOT")
}

val moduleName by extra("novelrt")

// This is a workaround to make modular kotlin code work.
tasks {
  compileJava {
    inputs.property("moduleName", moduleName)
    options.compilerArgs = listOf(
      "--patch-module", "${moduleName}=${sourceSets.main.get().output.asPath}"
    )
  }
}

description = "NovelRT for Java - Core"
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = "17"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
  jvmTarget = "1.8"
}
