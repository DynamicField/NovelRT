package com.github.novelrt

import com.github.novelrt.bridge.event.SceneConstructionRequestedBridgeEvent
import com.github.novelrt.bridge.handle.Handle
import com.github.novelrt.bridge.handle.OwnedHandleObject
import com.github.novelrt.bridge.graphics.BridgeRenderingService
import com.github.novelrt.event.Event
import com.github.novelrt.event.SceneConstructionRequestedListener
import com.github.novelrt.graphics.RenderingService
import com.github.novelrt.graphics.RenderObject
import java.nio.file.Paths
import java.util.concurrent.atomic.AtomicInteger

class NovelRunner : OwnedHandleObject(
  createRunner(
    displayNumber = nextDisplayNumber.getAndIncrement(),
    windowTitle = "NovelRT",
    targetFrameRate = 0,
    transparency = false,
    resourcesDirectory = Paths.get("").resolve("Resources").toString()
  ), ::deleteRunner) {

  companion object {
    private val nextDisplayNumber = AtomicInteger()

    @JvmStatic
    private external fun createRunner(displayNumber: Int, windowTitle: String,
                                      targetFrameRate: Int, transparency: Boolean,
                                      resourcesDirectory: String): Handle

    @JvmStatic
    private external fun deleteRunner(handle: Handle)

    init {
      NovelRTLoader.load()
    }
  }

  val onConstructionRequested: Event<SceneConstructionRequestedListener> = createSceneConstructionRequestedEvent()
  val rendering: RenderingService = createRenderingService()

  fun run() {
    runNovel()
  }

  private external fun runNovel(): Int
  private external fun createSceneConstructionRequestedEvent(): SceneConstructionRequestedBridgeEvent
  private external fun createRenderingService(): BridgeRenderingService
}
