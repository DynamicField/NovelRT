import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

description = "NovelRT for Java - Core"

plugins {
  id("com.github.novelrt.java-conventions-library")
}

dependencies {
  // api includes the dependency transitively, which is necessary for
  // the library's public ABI
  api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.0")
  api("com.github.novelrt:fumo-cement:1.0-SNAPSHOT")
}
