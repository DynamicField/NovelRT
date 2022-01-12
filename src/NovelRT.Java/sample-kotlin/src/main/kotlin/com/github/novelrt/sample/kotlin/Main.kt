package com.github.novelrt.sample.kotlin

import com.github.novelrt.NovelRTLoader
import com.github.novelrt.NovelRunner
import com.github.novelrt.Transform
import com.github.novelrt.ecs.Catalogue
import com.github.novelrt.ecs.ComponentDefinition
import com.github.novelrt.ecs.SystemScheduler
import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.input.KeyCode
import com.github.novelrt.maths.GeoVector2F
import com.github.novelrt.timing.Timestamp
import com.github.novelrt.windowing.WindowMode
import java.nio.ByteBuffer
import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.math.pow

data class NiceComponent(var helloWorld: Int = 0, var fumoWorld: Int = 0, var whatTheWorld: Long = 0) {
    companion object : ComponentDefinition<NiceComponent>(size = 16) {
        override fun createEmpty(): NiceComponent = NiceComponent()
        override val deleteState: NiceComponent get() = NiceComponent(-1, -1, -1)

        override fun serialize(component: NiceComponent, buffer: ByteBuffer) {
            buffer.putInt(component.helloWorld)
                .putInt(component.fumoWorld)
                .putLong(component.whatTheWorld)
        }

        override fun deserialize(component: NiceComponent, buffer: ByteBuffer) {
            component.helloWorld = buffer.int
            component.fumoWorld = buffer.int
            component.whatTheWorld = buffer.long
        }

        override fun applyUpdate(rootComponent: NiceComponent, updateComponent: NiceComponent) {
            rootComponent.helloWorld = updateComponent.helloWorld
            rootComponent.fumoWorld = updateComponent.fumoWorld
            rootComponent.whatTheWorld = updateComponent.whatTheWorld
        }
    }
}

fun main() {
    NovelRTLoader.load()
    val scheduler = SystemScheduler(4u)
    val componentCache = scheduler.componentCache
    val catalogue = Catalogue(0u, componentCache, scheduler.entityCache)

    val niceComponentTypeId = componentCache.registerComponentType(NiceComponent)
    val niceComponentBuffer = componentCache.getComponentBufferById(niceComponentTypeId)

    val niceEntity = catalogue.createEntity()
    niceComponentBuffer.pushComponentUpdateInstruction(0u, niceEntity, NiceComponent(1, 2, 3))

    scheduler.executeIteration(Timestamp.ZERO)

    for (i in 1..10) {
        benchmark("get it 1000 times") {
            for (i in 1..1000) {
                niceComponentBuffer.getComponent(niceEntity)
            }
        }
    }
}

fun oldBenchmark() {
    val buffer = ByteBuffer.allocateDirect(720_000)
    val input = NiceComponent(123, 456, 789)
    val output = NiceComponent()

    fun runWriteBuffered(objectCount: Int) {
        val writeBuffer = ByteBuffer.allocate(NiceComponent.size * objectCount)
        for (i in 1..objectCount) {
            NiceComponent.serialize(input, writeBuffer)
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
