import com.github.novelrt.buildtools.novelrtRootPath
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.ByteArrayOutputStream

plugins {
  id("com.github.novelrt.java-conventions-jlinked-application")
  id("dev.novelrt.novelrt-plugin")
  kotlin("jvm")
}

novelrt {
  sdk {
    binariesDir.set(novelrtRootPath.resolve("build/src/NovelRT.JavaSupport").toFile())
    engineResourcesDir.set(novelrtRootPath.resolve("resources").toFile())
  }
  moduleName.set("novelrt.sample.kotlin")
}

dependencies {
  implementation(project(":novelrt"))
  implementation(kotlin("stdlib-jdk8"))
}

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
