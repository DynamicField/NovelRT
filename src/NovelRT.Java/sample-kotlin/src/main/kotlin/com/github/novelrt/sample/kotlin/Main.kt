package com.github.novelrt.sample.kotlin

import com.github.novelrt.NovelRTLoader
import com.github.novelrt.ecs.*
import com.github.novelrt.ecs.graphics.DefaultRenderingSystem
import com.github.novelrt.ecs.input.InputEventComponentStruct
import com.github.novelrt.ecs.input.InputSystem
import com.github.novelrt.ecs.input.state
import com.github.novelrt.event.TimerTickEvent
import com.github.novelrt.input.KeyState
import com.github.novelrt.logging.logInfo
import com.github.novelrt.nativedata.StructAllocScope
import com.github.novelrt.nativedata.StructPointer
import com.github.novelrt.pluginmanagement.*
import com.github.novelrt.timing.StepTimer
import com.github.novelrt.timing.Timestamp
import java.lang.System.Logger

object Vector3 : ComponentDefinition<Vector3>() {
    val x = floatField()
    val y = floatField()
    val z = floatField()
    override val size: Long = finalSize

    override fun zero(st: StructPointer<Vector3>) {
        st.set(x, 0f)
        st.set(y, 0f)
        st.set(z, 0f)
    }
}

class MyCoolSystem(val sprite: EntityId, val spinId: EntityId) : EcsSystem {
    val logger: Logger = System.getLogger("MyGame")

    override fun StructAllocScope.run(timestamp: Timestamp, catalogue: Catalogue) {
        val transforms = catalogue.getDefaultComponentView(TransformComponentStruct)
        val inputs = catalogue.getDefaultComponentView(InputEventComponentStruct)

        val event = InputEventComponentStruct {}
        if (inputs.tryGetComponent(spinId, event) &&
            (event.state == KeyState.KeyDown || event.state == KeyState.KeyHeld)) {
            // Spin!!!!
            val struct = TransformComponentStruct {
                rotationInRadians = timestamp.getSecondsFloat() * 3.14f
            }
            transforms.pushComponentUpdateInstruction(sprite, struct)
        }
        logger.logInfo("State: ${event.state}")
    }
}

fun main() {
    NovelRTLoader.load()
    println("Hello, my pid is ${ProcessHandle.current().pid()}.")
    //waitDebugAttach()
// hello
    val logger = System.getLogger("MyGame")
    logger.logInfo("Hello, World! {0}", 42)

    val selector = DefaultPluginSelector()
    val graphics = selector.getDefaultPluginTypeOnCurrentPlatformFor<GraphicsPluginProvider>()
    val input = selector.getDefaultPluginTypeOnCurrentPlatformFor<InputPluginProvider>()
    val windowing = selector.getDefaultPluginTypeOnCurrentPlatformFor<WindowingPluginProvider>()
    val resourcesManagement = selector.getDefaultPluginTypeOnCurrentPlatformFor<ResourceManagementPluginProvider>()

    val resourceLoader = resourcesManagement.getResourceLoader(loadAssets = false)
    resourceLoader.resourcesRootDirectory = System.getProperty("novelrt.resources.path")
    resourceLoader.initAssetDatabase()

    val scheduler = Configurator()
        .withDefaultSystemsAndComponents()
        .withPluginProviders(graphics, input, windowing, resourcesManagement)
        .initialiseAndRegisterComponents()

    val renderingSystem = scheduler.getBuiltInSystem<DefaultRenderingSystem>()
    val textureFuture = renderingSystem.getOrLoadTexture("novel-chan")

    renderingSystem.forceVertexTextureFutureResolution()
    val texture = textureFuture.getValueOrThrow()

    val transformBuf = scheduler.componentCache.getDefaultComponentBuffer(TransformComponentStruct)

    val sprite = renderingSystem.createSpriteEntityOutsideOfSystem(texture, scheduler)

    val inputSys = scheduler.getBuiltInSystem<InputSystem>()
    inputSys.addMapping("Spin", "S")
    val mappingId = inputSys.getMappingId("Spin")

    val sys = MyCoolSystem(sprite, mappingId)
    scheduler.registerSystem(sys)

    scheduler.componentCache.prepAllBuffersForNextFrame()

    val timer = StepTimer(0, 0.1)

    val windowDevice = windowing.getWindowingDevice()
    windowDevice.windowTitle = "Hello from Kotlin!"

    val updateEvent = TimerTickEvent()
    updateEvent += {
        scheduler.executeIteration(it)
    }

    while (!windowDevice.shouldClose) {
        windowDevice.processAllMessages()
        timer.tick(updateEvent)
    }
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
