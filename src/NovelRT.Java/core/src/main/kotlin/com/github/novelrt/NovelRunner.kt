package com.github.novelrt

import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import com.github.novelrt.event.Event
import com.github.novelrt.event.SceneConstructionRequestedEvent
import com.github.novelrt.event.SceneConstructionRequestedListener
import com.github.novelrt.graphics.RenderingService
import com.github.novelrt.internal.handle.Handle
import com.github.novelrt.internal.handle.OwnedHandleObject
import com.github.novelrt.windowing.WindowMode
import java.util.concurrent.atomic.AtomicInteger

@GenerateNativeType
class NovelRunner(
  displayNumber: Int = nextDisplayNumber.getAndIncrement(),
  windowTitle: String = "NovelRT",
  windowMode: WindowMode = WindowMode.Windowed,
  targetFrameRate: Int = 0,
  transparency: Boolean = false
) : OwnedHandleObject(
  handle = createRunner(
    displayNumber = displayNumber,
    windowTitle = windowTitle,
    windowMode = windowMode,
    targetFrameRate = targetFrameRate,
    transparency = transparency
  ),
  deleter = ::deleteRunner
) {

  companion object {
    private val nextDisplayNumber = AtomicInteger()

    @JvmStatic
    private external fun createRunner(
      displayNumber: Int, windowTitle: String, windowMode: WindowMode,
      targetFrameRate: Int, transparency: Boolean
    ): Handle

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

fun testFunction() {}
