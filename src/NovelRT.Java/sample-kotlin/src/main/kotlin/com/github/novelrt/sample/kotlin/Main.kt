package com.github.novelrt.sample.kotlin

import com.github.novelrt.NovelRunner
import com.github.novelrt.TransformData
import com.github.novelrt.graphics.RGBAConfig
import com.github.novelrt.maths.GeoVector2F
import com.github.novelrt.windowing.WindowMode
import kotlin.io.path.Path

fun main() {
    val runner = NovelRunner(
        windowTitle = "Nice NovelRT",
        windowMode = WindowMode.WINDOWED
    )
    val basicRect = runner.renderingService.createBasicFillRect(
        transform = TransformData.create(
            position = GeoVector2F(750f, 500f),
            scale = GeoVector2F(500f, 450f)
        ),
        colourConfig = RGBAConfig(200, 145, 80),
        layer = 2
    )
    val imageRect = runner.renderingService.createImageRectWithFile(
        transform = TransformData.create(
            position = GeoVector2F(421f, 720f),
            scale = GeoVector2F(900f, 700f)
        ),
        colourTint = RGBAConfig(255, 255, 255),
        imagePath = Path("D:\\Users\\jeuxj\\Pictures\\FUMOCEMENTTTT\\FUMOOO.png"),
        layer = 1
    )
    val textRect = runner.renderingService.createTextRect(
        transform = TransformData.create(
            position = GeoVector2F(750f, 700f),
            scale = GeoVector2F(500f, 200f)
        ),
        colourConfig = RGBAConfig(255, 255, 255),
        fontSize = 30f,
        fontPath = Path("C:\\Windows\\Fonts\\segoeui.ttf"),
        layer = 0
    ).apply { text = "Hello Kotlin! (ft. FumoCement)" }
    runner.onConstructionRequested.subscribe {
        basicRect.executeObjectBehaviour()
        imageRect.executeObjectBehaviour()
        textRect.executeObjectBehaviour()
    }
    runner.onUpdate.subscribe {
        for (i in 0..5000) {
            imageRect.transform.edit {
                position = position.plus(0.00001f, 0.00002f)
            }
        }
        val colour = basicRect.colourConfig
        val newR = (colour.r + 1) % 255
        val newColour = RGBAConfig(newR, colour.g, colour.b, colour.a)
        basicRect.colourConfig = newColour
    }
    runner.run()
}

inline fun benchmark(name: String, action: () -> Unit) {
    val time = System.nanoTime()
    action()
    val elapsed = System.nanoTime() - time;
    println("[BENCHMARK: %s] Time elapsed: %.1fµs".format(name, elapsed / 1000f))
}

/*
  val novelrt = NovelRunner()

  val rectangle = novelrt.rendering.createBasicRect(
    transform = Transform(Vector2(0f, 0f), Vector2(1080f, 720f), 0f),
    colour = RGBAColour(149, 163, 179),
    layer = 1
  )
  val textRect = novelrt.rendering.createTextRect(
    transform = Transform(Vector2(400f, 210f), Vector2(600f, 180f), 18f),
    colour = RGBAColour(70, 175, 50),
    fontSize = 46f,
    fontPath = Path.of("C:/Windows/Fonts/segoeui.ttf"),
    layer = 0
  ).apply { text = "QUALITY API" }
  val image = novelrt.rendering.createImageRect(
    transform = Transform(Vector2(400f, 500f), Vector2(600f, 300f), 0f),
    colourTint = RGBAColour.WHITE,
    imagePath = Path.of("D:/ruby_lol.png"),
    layer = 0
  )

  novelrt.onConstructionRequested.subscribe {
    rectangle.executeObjectBehaviour()
    textRect.executeObjectBehaviour()
    image.executeObjectBehaviour()
  }

  novelrt.run()
  */ // Old code
