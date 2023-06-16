package com.github.novelrt.ecs

import com.github.novelrt.ecs.ComponentCache.Companion.makeTracked
import com.github.novelrt.ecs.EntityCache.Companion.makeTracked
import com.github.novelrt.ecs.graphics.DefaultRenderingSystem
import com.github.novelrt.ecs.input.InputSystem
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.interop.*
import com.github.novelrt.timing.Timestamp
import com.github.novelrt.timing.Timestamp.Companion.toTimestamp
import kotlin.system.exitProcess


class SystemScheduler internal constructor(handle: Long, owned: Boolean = true) :
    KotlinNativeObject(handle, owned, NovelRT::Nrt_SystemScheduler_Destroy) {

    constructor(maximumThreadCount: UInt?) : this(createSystemScheduler(maximumThreadCount), true)

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

    fun registerSystem(system: EcsSystem) {
        val callback =
            FunctionPointer(SystemUpdatePtr { rawTimestamp, catalogueHandle ->
                try {
                    system.runScoped(rawTimestamp.toTimestamp(), Catalogue.getTracked(catalogueHandle))
                } catch (e: Throwable) {
                    // TODO: Fix the function pointer error handling? Currently, if something goes wrong,
                    //       then the program will just continue like nothing happened.
                    System.err.println("An error occurred in system ${system::class.qualifiedName}.")
                    e.printStackTrace()
                    exitProcess(1)
                }
            }, DisposalMethod.GARBAGE_COLLECTED)

        NovelRT.Nrt_SystemScheduler_RegisterSystem(handle, callback)
        registeredSystemCallbacks.add(callback) // Make sure GC works correctly
    }

    inline fun <reified T : BuiltInSystem> getBuiltInSystem(): T {
        return when (T::class) {
            DefaultRenderingSystem::class -> findRenderingSystem() as T
            InputSystem::class -> findInputSystem() as T
            else -> throw IllegalArgumentException("Unknown built-in system: ${T::class}")
        }
    }

    @PublishedApi
    internal fun findRenderingSystem() =
        DefaultRenderingSystem(NovelRT.Nrt_DefaultRenderingSystem_FindInScheduler(handle))

    @PublishedApi
    internal fun findInputSystem() =
        InputSystem(NovelRT.Nrt_InputSystem_FindInScheduler(handle))

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
