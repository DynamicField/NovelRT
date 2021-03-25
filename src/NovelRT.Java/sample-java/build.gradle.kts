plugins {
  id("com.github.novelrt.java-conventions-jlinked-application")
}

dependencies {
  implementation(project(":novelrt"))
}

description = "NovelRT for Java - Sample in Java"

application {
  mainModule.set("novelrt.sample.java")
  mainClass.set("com.github.novelrt.sample.java.Main")
}
