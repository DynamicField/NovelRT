import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
  java
}

java {
  modularity.inferModulePath.set(true)
}

repositories {
  mavenLocal()
  maven {
    url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
  }
  maven {
    url = uri("https://repo.maven.apache.org/maven2/")
  }
}

extra["novelrtRoot"] = rootProject.projectDir.toPath().parent.parent

group = "com.github.novelrt"
version = "0.1-SNAPSHOT"

val compileKotlin: KotlinCompile by tasks
val compileJava: JavaCompile by tasks

compileKotlin.kotlinOptions.useIR = true
compileKotlin.kotlinOptions.jvmTarget = "1.8"
compileKotlin.destinationDir = compileJava.destinationDir

tasks.withType<JavaCompile> {
  options.encoding = "UTF-8"
}
