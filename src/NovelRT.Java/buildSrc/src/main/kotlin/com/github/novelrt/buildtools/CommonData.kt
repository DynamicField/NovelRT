package com.github.novelrt.buildtools

import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
import java.nio.file.Path

val Project.novelrtRootPath: Path
  get() {
    if (!rootProject.extra.has("novelrtRoot")) {
      val path = rootProject.projectDir.toPath().parent.parent
      this.rootProject.extra["novelrtRoot"] = path
      return path
    }
    return this.rootProject.extra["novelrtRoot"] as Path
  }
