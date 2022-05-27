import com.github.novelrt.buildtools.novelrtRootPath

plugins {
  id("com.github.novelrt.java-conventions-application")
  id("org.beryx.jlink")
}

tasks.assemble {
  finalizedBy(tasks.jlink)
}

val copyNovelrtLauncher by tasks.registering(Copy::class) {
  from(novelrtRootPath.resolve("build/src/NovelRT.JavaBootstrapper/Debug"))
  exclude("CMakeFiles")
  exclude("cmake_install.cmake")
  into(jlink.imageDir)
}

tasks.jlink {
  finalizedBy(copyNovelrtLauncher)
}

jlink {
  addExtraDependencies("jdk.jfr")
}

tasks.register<Exec>("jlinkRun") {
  group = "application"
  dependsOn(tasks.jlink)

  val imageDir by jlink.imageDir

  commandLine(
    imageDir.file("RunBootstrapper.cmd"), "--launch",
    "${application.mainModule.get()}/${application.mainClass.get()}",
    "\"\\\"-Djava.io.tmpdir=${buildDir.resolve("temp")}\\\"\"",
    "\"\\\"-Dfile.encoding=UTF-8\\\"\"",
    "\"\\\"-Djava.rmi.server.hostname=localhost\\\"\""
  )
}
