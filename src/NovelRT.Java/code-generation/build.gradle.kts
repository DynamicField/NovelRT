

plugins {
  id("com.github.novelrt.java-conventions-library")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.30")
  implementation(project(":code-generation-annotations"))
  implementation("com.google.guava:guava:29.0-jre")
}

description = "NovelRT for Java - Code generation"
