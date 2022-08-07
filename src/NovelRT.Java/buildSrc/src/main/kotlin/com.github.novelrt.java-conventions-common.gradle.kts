import org.jetbrains.kotlin.gradle.dsl.KotlinTopLevelExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  java
  kotlin("jvm")
  id("dev.novelrt.novelrt-plugin")
}

repositories {
  mavenCentral()
  mavenLocal()
  maven {
    url = uri("https://repo.maven.apache.org/maven2/")
  }
}

extra["novelrtRoot"] = rootProject.projectDir.toPath().parent.parent

group = "com.github.novelrt"
version = "0.1-SNAPSHOT"

kotlin {
  jvmToolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

tasks.withType<JavaCompile> {
  options.encoding = "UTF-8"
}
