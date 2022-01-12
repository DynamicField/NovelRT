package com.github.novelrt

import com.github.novelrt.event.Event
import com.github.novelrt.event.SceneConstructionRequestedListener
import com.github.novelrt.event.UpdateListener
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.fumocement.Pointer
import com.github.novelrt.fumocement.Pointers
import com.github.novelrt.graphics.RenderingService
import com.github.novelrt.input.InteractionService
import com.github.novelrt.interop.*
import com.github.novelrt.interop.makeOutputPointer
import com.github.novelrt.timing.Timestamp
import com.github.novelrt.windowing.WindowMode
import java.util.concurrent.atomic.AtomicInteger


/**
 * The main class for running a game.
 */
class NovelRunner(
    displayNumber: Int = nextDisplayNumber.getAndIncrement(),
    windowTitle: String = "NovelRT",
    windowMode: WindowMode = WindowMode.WINDOWED,
    targetFrameRate: Int = 0
) : KotlinNativeObject(
    createRunner(
        displayNumber = displayNumber,
        windowTitle = windowTitle,
        windowMode = windowMode,
        targetFrameRate = targetFrameRate,
    ),
    true,
    NovelRT::Nrt_NovelRunner_destroy
) {
    val onConstructionRequested = object : Event<SceneConstructionRequestedListener>() {
        val callback: FunctionPointer<SubscribeToSceneConstructionRequestedPtr> =
            FunctionPointer(
                SubscribeToSceneConstructionRequestedPtr {
                    fireEvent { it.listen() }
                },
                DisposalMethod.GARBAGE_COLLECTED
            )

        init {
            NovelRT.Nrt_NovelRunner_SubscribeToSceneConstructionRequested(handle, callback, Pointers.NULLPTR)
        }
    }

    val onUpdate = object : Event<UpdateListener>() {
        val callback: FunctionPointer<SubscribeToUpdatePtr> = FunctionPointer(
            SubscribeToUpdatePtr { timestamp ->
                fireEvent { it.listen(Timestamp(timestamp.toULong())) }
            },
            DisposalMethod.GARBAGE_COLLECTED
        )

        init {
            NovelRT.Nrt_NovelRunner_SubscribeToUpdate(handle, callback, Pointers.NULLPTR)
        }
    }

    val renderingService: RenderingService =
        makeOutputPointer(::RenderingService, false).resultWith(NovelRT::Nrt_NovelRunner_getRenderer)

    val interactionService: InteractionService =
        makeOutputPointer(::InteractionService).resultWith(NovelRT::Nrt_NovelRunner_getInteractionService)

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
            return NovelRT.Nrt_NovelRunner_createCustom(
                displayNumber,
                windowTitle,
                windowMode.nativeValue,
                targetFrameRate
            )
        }

        init {
            NovelRTLoader.load()
        }
    }
}
