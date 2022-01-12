package com.github.novelrt.ecs

import com.github.novelrt.ecs.ComponentCache.Companion.makeTracked
import com.github.novelrt.ecs.EntityCache.Companion.makeTracked
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.interop.*
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.toObjectHandle
import com.github.novelrt.timing.Timestamp
import com.github.novelrt.timing.Timestamp.Companion.toTimestamp


class SystemScheduler(maximumThreadCount: UInt?) :
    KotlinNativeObject(createSystemScheduler(maximumThreadCount), true, NovelRT::Nrt_SystemScheduler_Destroy) {

    private val registeredSystemCallbacks =
        mutableListOf<FunctionPointer<SystemUpdatePtr>>()

    fun spinThreads() = NovelRT.Nrt_SystemScheduler_SpinThreads(handle)

    fun executeIteration(timestamp: Timestamp) =
        NovelRT.Nrt_SystemScheduler_ExecuteIteration(handle, timestamp.toNative()).handleNrtResult()

    val workerThreadCount: UInt
        get() = NovelRT.Nrt_SystemScheduler_GetWorkerThreadCount(handle).toUInt()

    val entityCache = NovelRT.Nrt_SystemScheduler_GetEntityCache(handle)
            .toObjectHandle<EntityCache>()
            .makeTracked()

    val componentCache = NovelRT.Nrt_SystemScheduler_GetComponentCache(handle)
            .toObjectHandle<ComponentCache>()
            .makeTracked()

    fun registerSystem(system: System) {
        val callback =
            FunctionPointer(SystemUpdatePtr { rawTimestamp, catalogueHandle ->
                system.run(rawTimestamp.toTimestamp(), Catalogue.getTracked(catalogueHandle))
            }, DisposalMethod.GARBAGE_COLLECTED)

        NovelRT.Nrt_SystemScheduler_RegisterSystem(handle, callback)
        registeredSystemCallbacks.add(callback)
    }

    companion object {
        private fun createSystemScheduler(maximumThreadCount: UInt?): Long {
            return if (maximumThreadCount == null) {
                NovelRT.Nrt_SystemScheduler_CreateWithDefaultThreadCount()
            } else {
                NovelRT.Nrt_SystemScheduler_Create(maximumThreadCount.toInt())
            }
        }
    }
}
