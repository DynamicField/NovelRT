package com.github.novelrt.sample

import com.github.novelrt.NovelRunner
import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.maths.Transform
import com.github.novelrt.maths.Vector2
import java.nio.file.Path

fun main() {
  println("pls enter")
  println("btw my pid is ${ProcessHandle.current().pid()}")
  readLine()

  val novelrt = NovelRunner()

  val rectangle = novelrt.rendering.createBasicRect(
    transform = Transform(Vector2(0f, 0f), Vector2(1080f, 720f), 0f),
    colour = RGBAColour(0, 255, 50),
    layer = 1
  )
  val textRect = novelrt.rendering.createTextRect(
    transform = Transform(Vector2(400f, 210f), Vector2(600f, 180f), 18f),
    colour = RGBAColour(70, 175, 50),
    fontSize = 46f,
    fontPath = Path.of("C:/Windows/Fonts/segoeui.ttf"),
    layer = 0
  ).apply { text = "QUALITY API" }

  novelrt.onConstructionRequested.subscribe {
    rectangle.executeObjectBehaviour()
    textRect.executeObjectBehaviour()
  }

  novelrt.run()
}
