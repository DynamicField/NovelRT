import com.github.novelrt.buildtools.novelrtRootPath

plugins {
  id("com.github.novelrt.java-conventions-application")
  id("org.beryx.jlink")
}

tasks.assemble {
  finalizedBy(tasks.jlink)
}

val copyNovelrtLauncher by tasks.registering(Copy::class) {
  from(novelrtRootPath.resolve("build/src/NovelRT.JavaBootstrapper"))
  exclude("CMakeFiles")
  into(jlink.imageDir)
}

tasks.jlink {
  finalizedBy(copyNovelrtLauncher)
}

tasks.register<Exec>("jlinkRun") {
  group = "application"
  dependsOn(tasks.jlink)

  val imageDir by jlink.imageDir

  commandLine(imageDir.file("RunBootstrapper.cmd"), "--launch",
    "${application.mainModule.get()}/${application.mainClass.get()}")
}
