import com.github.novelrt.buildtools.novelrtRootPath

plugins {
  id("com.github.novelrt.java-conventions-library")
  kotlin("kapt")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.30")
  compileOnly(project(":code-generation-annotations"))
  kapt(project(":code-generation"))
}

kapt {
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

description = "NovelRT for Java - Core"
