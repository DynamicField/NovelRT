plugins {
  id("com.github.novelrt.java-conventions-library")
  // kotlin("kapt")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.10")
  implementation(project(":fumocement"))
  // kapt(project(":code-generation"))
}

val moduleName by extra("novelrt")

tasks {
  compileJava {
    inputs.property("moduleName", moduleName)
    options.compilerArgs = listOf(
      "--patch-module", "${moduleName}=${sourceSets.main.get().output.asPath}"
    )
  }
}

/* kapt {
  javacOptions {
    option("--module-path", sourceSets["main"].compileClasspath.asPath)
  }

  arguments {
    arg("novelrt.codegeneration.outputFile",
      novelrtRootPath.resolve("include/NovelRT/Java/Types/AllTypes_generated.h"))
    arg("novelrt.codegeneration.includeDirectives", "Type.h")
  }

  annotationProcessor("com.github.novelrt.codegeneration.CodeGenAnnotationProcessor")
}
*/

description = "NovelRT for Java - Core"
