package com.github.novelrt.sample.kotlin

import com.github.novelrt.NovelRTLoader
import com.github.novelrt.NovelRunner
import com.github.novelrt.Transform
import com.github.novelrt.ecs.SparseSetKey
import com.github.novelrt.ecs.SparseSetMemoryContainer
import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.input.KeyCode
import com.github.novelrt.maths.GeoVector2F
import com.github.novelrt.nativedata.DataStructure
import com.github.novelrt.nativedata.DataStructureInfo
import com.github.novelrt.windowing.WindowMode
import java.nio.ByteBuffer
import kotlin.io.path.Path
import kotlin.math.pow

@DataStructureInfo(size = 16)
data class Struct(var helloWorld: Int = 0, var fumoWorld: Int = 0, var whatTheWorld: Long = 0) : DataStructure() {
    override fun writeTo(buffer: ByteBuffer) {
        buffer.putInt(helloWorld)
            .putInt(fumoWorld)
            .putLong(whatTheWorld)
    }

    override fun fillWith(buffer: ByteBuffer) {
        helloWorld = buffer.int
        fumoWorld = buffer.int
        whatTheWorld = buffer.long
    }
}

fun ByteArray.toHexString() = joinToString(" ") { (0xFF and it.toInt()).toString(16).padStart(2, '0') }

fun main() {
    NovelRTLoader.load()
    val set = SparseSetMemoryContainer(Struct::class.java, ::Struct)
    val key: SparseSetKey = 123u

    set.insert(key, Struct(147, 200, 143))
    println(set[key])
    // set.overwrite(key, Struct(147, 777, 143))
}

fun oldBenchmark() {
    val buffer = ByteBuffer.allocateDirect(720_000)
    val input = Struct(123, 456, 789)
    val output = Struct()

    fun runWriteBuffered(objectCount: Int) {
        val writeBuffer = ByteBuffer.allocate(input.size * objectCount)
        for (i in 1..objectCount) {
            input.writeTo(writeBuffer)
        }

        writeBuffer.position(0)
        buffer.position(0)
        buffer.put(writeBuffer)
    }

    for (i in 1..2500) {
        runWriteBuffered(16384)
    }

    for (objectCount in (1..14).map { 2.toDouble().pow(it).toInt() }) {
        benchmark("write buffered (${objectCount.toString().padEnd(4)})") {
            runWriteBuffered(objectCount)
        }
    }

    /*
    for (i in 1..10) {
        benchmark("write") {
            val writeBuffer = ByteBuffer.allocate(input.size)
            input.write(writeBuffer)

            writeBuffer.position(0)
            buffer.position(0)
            benchmark("  |-> put final buffer") {
                buffer.put(writeBuffer)
            }
        }
        benchmark("read") {
            buffer.position(0)
            output.fill(buffer)
        }
    }
    */
}

fun mainOld() {
    val runner = NovelRunner(
        windowTitle = "Nice NovelRT",
        windowMode = WindowMode.WINDOWED
    )

    val basicRect = runner.renderingService.createBasicFillRect(
        transform = Transform(
            position = GeoVector2F(750f, 500f),
            scale = GeoVector2F(500f, 450f)
        ),
        colourConfig = RGBAColour(200, 145, 80, 145),
        layer = 2
    )

    val imageRect = runner.renderingService.createImageRectWithFile(
        transform = Transform(
            position = GeoVector2F(421f, 720f),
            scale = GeoVector2F(900f, 700f)
        ),
        colourTint = RGBAColour(255, 255, 255),
        imagePath = Path("D:\\Users\\jeuxj\\Pictures\\c#\\Monica.png"),
        layer = 1
    )

    val textRect = runner.renderingService.createTextRect(
        transform = Transform(
            position = GeoVector2F(750f, 700f),
            scale = GeoVector2F(500f, 200f)
        ),
        colourConfig = RGBAColour(255, 255, 255),
        fontSize = 30f,
        fontPath = Path("C:\\Windows\\Fonts\\segoeui.ttf"),
        layer = 0
    ).apply { text = "Hello Kotlin! (ft. FumoCement & Monica)" }

    val interactionRect = runner.interactionService.createBasicInteractionRect(
        transform = Transform(
            position = GeoVector2F.ZERO,
            scale = GeoVector2F(1920f, 1080f)
        ),
        layer = -1
    ).apply {
        subscribedKey = KeyCode.F
        onInteracted += {
            println("hello interaction!!!")
        }
    }

    runner.onConstructionRequested += {
        basicRect.executeObjectBehaviour()
        imageRect.executeObjectBehaviour()
        textRect.executeObjectBehaviour()
        interactionRect.executeObjectBehaviour()
    }
    runner.onUpdate += {

    }
    runner.run()
}

inline fun benchmark(name: String, action: () -> Unit) {
    val time = System.nanoTime()
    action()
    val elapsed = System.nanoTime() - time;
    println(
        "[BENCHMARK: %s] Time elapsed: %.4fµs -> %.1fms"
            .format(name, elapsed.toFloat() / 1000f, elapsed.toFloat() / 1000f / 1000f)
    )
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
