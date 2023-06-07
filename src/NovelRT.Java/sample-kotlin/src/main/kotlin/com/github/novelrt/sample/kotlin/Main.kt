package com.github.novelrt.sample.kotlin

import com.github.novelrt.NovelRTLoader
import com.github.novelrt.ecs.ComponentDefinition
import com.github.novelrt.logging.logInfo
import com.github.novelrt.nativedata.AllocatedStruct
import com.github.novelrt.nativedata.StructArray
import com.github.novelrt.sample.kotlin.Vector3.forEach
import java.text.MessageFormat

object Vector3 : ComponentDefinition<Vector3>() {
    val x = floatField()
    val y = floatField()
    val z = floatField()
    override val size: Long = finalSize
    override val deleteState: AllocatedStruct<Vector3> = allocate()
}

fun main() {
    NovelRTLoader.load()

    val logger = System.getLogger("MyApp")
    logger.logInfo("Hello, World! {0}", 42)
    /*
    NovelRTLoader.load()
    val scheduler = SystemScheduler(4u)
    val componentCache = scheduler.componentCache
    val catalogue = Catalogue(0u, componentCache, scheduler.entityCache)

    val niceComponentTypeId = componentCache.registerComponentType(Vector3)
    val niceComponentBuffer = componentCache.getComponentBufferById(niceComponentTypeId)

    val niceEntity = catalogue.createEntity()
    val tempVector = Vector3.allocateTemp().mutate {
        set(Vector3.x, 7.2f)
        set(Vector3.y, 4.2f)
        set(Vector3.z, 8.2f)
    }
    niceComponentBuffer.pushComponentUpdateInstruction(0u, niceEntity, tempVector.move())

    scheduler.executeIteration(Timestamp.ZERO)
    print("let's a go?")
    for (i in 1..10) {
        benchmark("get it 20000 times safe") {
            var sum = 0.0f
            for (j in 1..20000) {
                niceComponentBuffer.getComponent(niceEntity)
            }
        }
    }
    print("----")
    for (i in 1..10) {
        benchmark("get it 20000 times unsafe") {
            var sum = 0.0f
            for (j in 1..20000) {
                niceComponentBuffer.getComponentUnsafe(niceEntity)
            }
        }
    }
    */
}

fun sumExperiments() {
    val array = Vector3.allocateArray(20000)
    for (struct in array) {
        struct.set(Vector3.x, 4f)
        struct.set(Vector3.y, 4f)
        struct.set(Vector3.z, 4f)
    }
    for (i in 1..100) {
        benchmark("sum it 20000 times (iterator)") {
            sumIterator(array)
        }
    }
    for (i in 1..100) {
        benchmark("sum it 20000 times (forEach)") {
            sumForEach(array)
        }
    }
}

// [BENCHMARK: sum it 20000 times (iterator)] Time elapsed: 23,1000µs -> 0,0ms
fun sumIterator(array: StructArray<Vector3>) {
    var sum = 0.0f
    for (struct in array) {
        sum += struct.get(Vector3.x) + struct.get(Vector3.y) + struct.get(Vector3.z)
    }
}

// [BENCHMARK: sum it 20000 times (forEach)] Time elapsed: 19,3000µs -> 0,0ms
fun sumForEach(array: StructArray<Vector3>) {
    var sum = 0.0f
    array.forEach {
        sum += it.get(Vector3.x) + it.get(Vector3.y) + it.get(Vector3.z)
    }
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
fun oldBenchmark() {
    val buffer = ByteBuffer.allocateDirect(720_000)
    val input = NiceComponent(123, 456, 789)
    val output = NiceComponent()

    fun runWriteBuffered(objectCount: Int) {
        val writeBuffer = ByteBuffer.allocate((NiceComponent.size * objectCount).toInt())
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
*/
