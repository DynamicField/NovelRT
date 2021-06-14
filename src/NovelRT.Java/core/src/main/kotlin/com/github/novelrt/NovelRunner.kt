package com.github.novelrt

import com.github.novelrt.event.Event
import com.github.novelrt.event.SceneConstructionRequestedListener
import com.github.novelrt.event.UpdateListener
import com.github.novelrt.fumocement.*
import com.github.novelrt.graphics.RenderingService
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.windowing.WindowMode
import java.util.concurrent.atomic.AtomicInteger

class NovelRunner(
  displayNumber: Int = nextDisplayNumber.getAndIncrement(),
  windowTitle: String = "NovelRT",
  windowMode: WindowMode = WindowMode.WINDOWED,
  targetFrameRate: Int = 0
) : NativeObject(
  createRunner(
    displayNumber = displayNumber,
    windowTitle = windowTitle,
    windowMode = windowMode,
    targetFrameRate = targetFrameRate,
  ),
  true,
  ::deleteRunner
) {
  val onConstructionRequested = object : Event<SceneConstructionRequestedListener>() {
    val callback: FunctionPointer<NovelRT.Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func> =
      FunctionPointer(
        NovelRT.Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func {
          fireEvent { it.listen() }
        },
        DisposalMethod.GARBAGE_COLLECTED
      )

    init {
      NovelRT.Nrt_NovelRunner_SubscribeToSceneConstructionRequested(handle, callback, Pointers.NULLPTR)
    }
  }

  val onUpdate = object : Event<UpdateListener>() {
    val callback: FunctionPointer<NovelRT.Callback_Nrt_NovelRunner_SubscribeToUpdate_func> = FunctionPointer(
      NovelRT.Callback_Nrt_NovelRunner_SubscribeToUpdate_func { timestamp ->
        fireEvent { it.listen(timestamp) }
      },
      DisposalMethod.GARBAGE_COLLECTED
    )

    init {
      NovelRT.Nrt_NovelRunner_SubscribeToUpdate(handle, callback, Pointers.NULLPTR)
    }
  }

  val renderingService: RenderingService = findRenderer()

  private fun findRenderer(): RenderingService {
    val output = IndirectedPointer({ RenderingService(it, false) }, DisposalMethod.MANUAL)
    output.use {
      NovelRT.Nrt_NovelRunner_getRenderer(handle, output.handle).handleNrtResult()
      return output.get()!!
    }
  }

  fun run() {
    NovelRT.Nrt_NovelRunner_runNovel(handle)
  }

  companion object {
    private val nextDisplayNumber = AtomicInteger()

    private fun createRunner(
      displayNumber: Int,
      windowTitle: String,
      windowMode: WindowMode,
      targetFrameRate: Int
    ): @Pointer("NrtNovelRunnerHandle") Long {
      return NovelRT.Nrt_NovelRunner_createCustom(displayNumber, windowTitle, windowMode.nativeValue, targetFrameRate)
    }

    private fun deleteRunner(handle: @Pointer("NrtNovelRunnerHandle") Long) {
      NovelRT.Nrt_NovelRunner_destroy(handle)
    }

    init {
      NovelRTLoader.load()
    }
  }

}
