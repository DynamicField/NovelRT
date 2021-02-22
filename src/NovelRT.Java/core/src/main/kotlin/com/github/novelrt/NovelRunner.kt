package com.github.novelrt

import com.github.novelrt.event.SceneConstructionRequestedEvent
import com.github.novelrt.internal.handle.Handle
import com.github.novelrt.internal.handle.OwnedHandleObject
import com.github.novelrt.codegeneration.annotations.GenerateNative
import com.github.novelrt.event.Event
import com.github.novelrt.event.SceneConstructionRequestedListener
import com.github.novelrt.graphics.RenderingService
import java.util.concurrent.atomic.AtomicInteger

@GenerateNative
class NovelRunner : OwnedHandleObject(
  createRunner(
    displayNumber = nextDisplayNumber.getAndIncrement(),
    windowTitle = "NovelRT",
    targetFrameRate = 0,
    transparency = false
  ), ::deleteRunner) {

  companion object {
    private val nextDisplayNumber = AtomicInteger()

    @JvmStatic
    private external fun createRunner(displayNumber: Int, windowTitle: String,
                                      targetFrameRate: Int, transparency: Boolean): Handle

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
  private external fun createSceneConstructionRequestedEvent(): SceneConstructionRequestedEvent
  private external fun createRenderingService(): RenderingService
}
