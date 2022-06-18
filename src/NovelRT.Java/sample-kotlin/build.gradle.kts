import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.ByteArrayOutputStream

plugins {
  id("com.github.novelrt.java-conventions-jlinked-application")
  kotlin("jvm")
}

dependencies {
  implementation(project(":novelrt"))
  implementation(project(":fumocement"))
  implementation(kotlin("stdlib-jdk8"))
}

val moduleName by extra("novelrt.sample.kotlin")

application {
  mainModule.set("novelrt.sample.kotlin")
  mainClass.set("com.github.novelrt.sample.kotlin.MainKt")
  applicationDefaultJvmArgs = listOf(
    "-XX:+UnlockDiagnosticVMOptions",
    "-XX:PrintAssemblyOptions=intel",
    "-Xbatch",
    "-XX:+LogCompilation",
    "-XX:+PrintAssembly",
    "-XX:LogFile=build/last_run.log"
     // "-XX:CompileCommand=print, *MainKt.main"
  )
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
