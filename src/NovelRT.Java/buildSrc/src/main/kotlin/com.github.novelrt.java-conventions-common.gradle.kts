import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  java
  kotlin("jvm")
}

java {
  modularity.inferModulePath.set(true)
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

compileKotlin.kotlinOptions.jvmTarget = "11"

tasks.withType<JavaCompile> {
  options.encoding = "UTF-8"
}
