
import org.gradle.jvm.tasks.Jar

description = "NovelRT for Java - Core"

plugins {
  id("com.github.novelrt.java-conventions-library")
}

novelrt {
  moduleName.set("novelrt")
}

tasks.withType<Jar> {
  duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

dependencies {
  // api includes the dependency transitively, which is necessary for
  // the library's public ABI
  api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.21")
  api("com.github.novelrt:fumo-cement:1.0-SNAPSHOT")
  implementation("org.jetbrains:annotations:24.0.1")
}
