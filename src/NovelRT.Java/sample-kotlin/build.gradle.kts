

plugins {
    id("com.github.novelrt.java-conventions-jlinked-application")
}

dependencies {
    implementation(project(":novelrt"))
}

application {
  mainModule.set("novelrt.sample.kotlin")
  mainClass.set("com.github.novelrt.sample.kotlin.MainKt")
}

description = "NovelRT for Java - Sample in Kotlin"
