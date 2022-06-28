import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  java
  kotlin("jvm")
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

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions.jvmTarget = "17"

tasks.withType<JavaCompile> {
  options.encoding = "UTF-8"
}
