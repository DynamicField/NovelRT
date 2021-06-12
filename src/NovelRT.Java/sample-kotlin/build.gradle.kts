

plugins {
    id("com.github.novelrt.java-conventions-jlinked-application")
}

dependencies {
    implementation(project(":novelrt"))
    implementation(project(":fumocement"))
}

application {
  mainModule.set("novelrt.sample.kotlin")
  mainClass.set("com.github.novelrt.sample.kotlin.MainKt")
}

description = "NovelRT for Java - Sample in Kotlin"
