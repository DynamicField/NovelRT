import com.github.novelrt.buildtools.novelrtRootPath

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

tasks.named<JavaExec>("run") {
  // Add the -Pnovelrt.jitasm=true arg to get
  // interesting logs about JIT compilation and assembly code (C2 forced).
  // hsdis is required for having readable assembly.

  if (project.hasProperty("novelrt.jitasm") && project.property("novelrt.jitasm") == "true") {
    jvmArgs(
      "-XX:+UnlockDiagnosticVMOptions",
      "-XX:+LogCompilation", "-XX:LogFile=build/cool_log.log", "-XX:+DebugNonSafepoints",
      "-XX:PrintAssemblyOptions=intel",
      "-XX:CompileCommand=print,com.github.novelrt.*::*"
    )
  }

  // Add the -Pnovelrt.forcec2=true atg to force C2 compilation (Tiered is the default).
  // Be warned that this does *NOT* produce the most optimal code compared
  // to tiered compilation. It is however useful to get an approximation
  // for profiling without having to guess if it's C1 or C2 compilation.

  if (project.hasProperty("novelrt.forcec2") && project.property("novelrt.forcec2") == "true") {
    jvmArgs(
      "-XX:-TieredCompilation", "-Xbatch", "-Xcomp",
    )
  }

  // Enable assertions so invalid memory access doesn't blow up.
  enableAssertions = true
}

description = "NovelRT for Java - Sample in Kotlin"
repositories {
  mavenCentral()
}
