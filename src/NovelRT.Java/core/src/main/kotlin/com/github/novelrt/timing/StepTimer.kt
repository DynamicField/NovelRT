package com.github.novelrt.timing

import com.github.novelrt.event.TimerTickEvent
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.interop.*
import com.github.novelrt.timing.Timestamp.Companion.toTimestamp

class StepTimer(targetFrameRate: Int, maxSecondDelta: Double) :
    KotlinNativeObject(NovelRT.Nrt_StepTimer_create(targetFrameRate, maxSecondDelta), true, {
        // TODO! No Destroy function in C API
    }) {
    // XTicks functions won't be implemented because it's LITERALLY the same as the XTime functions
    val elapsedTime: Timestamp
        get() = Timestamp(NovelRT.Nrt_StepTimer_getElapsedTime(this.handle).toULong())

    val totalTime: Timestamp
        get() = Timestamp(NovelRT.Nrt_StepTimer_getTotalTime(this.handle).toULong())

    var targetElapsedTime: Timestamp
        get() = Timestamp(NovelRT.Nrt_StepTimer_getTargetElapsedTime(this.handle).toULong())
        set(value) = NovelRT.Nrt_StepTimer_setTargetElapsedTime(this.handle, value.ticks.toLong()).handleNrtResult()

    val frameCount: UInt get() = NovelRT.Nrt_StepTimer_getFrameCount(this.handle).toUInt()
    val framesPerSecond: UInt get() = NovelRT.Nrt_StepTimer_getFramesPerSecond(this.handle).toUInt()

    var isFixedTimeStep: Boolean
        get() = NovelRT.Nrt_StepTimer_getIsFixedTimeStep(this.handle).toBoolean()
        set(value) = NovelRT.Nrt_StepTimer_setIsFixedTimeStep(this.handle, value.toNrtBool()).handleNrtResult()

    fun resetElapsedTime() = NovelRT.Nrt_StepTimer_resetElapsedTime(this.handle).handleNrtResult()

    fun tick(event: TimerTickEvent) {
        tickEvent = event

        NovelRT.Nrt_StepTimer_tick(this.handle, nativeEvent.handle).handleNrtResult()
    }

    private var tickEvent: TimerTickEvent? = null
    private val nativeEvent = TimerNativeEvent()

    private fun runTickEvent(timestamp: Timestamp) = tickEvent?.fire(timestamp)

    // Use an internal event function pointer to avoid creating events every tick.
    // This class just wraps a NovelRT Utilities::Event<Timestamp> to call the Kotlin event.

    private inner class TimerNativeEvent : KotlinNativeObject(NovelRT.Nrt_EventWithTimestamp_Create(), true,
        NovelRT::Nrt_EventWithTimestamp_Destroy) {

        val funcPtr = FunctionPointer(NovelRT.Callback_Nrt_EventWithTimestamp_AddEventHandler_handler {
            runTickEvent(it.toTimestamp())
        }, DisposalMethod.GARBAGE_COLLECTED)

        init {
            NovelRT.Nrt_EventWithTimestamp_AddEventHandler(handle, funcPtr)
        }
    }
}
