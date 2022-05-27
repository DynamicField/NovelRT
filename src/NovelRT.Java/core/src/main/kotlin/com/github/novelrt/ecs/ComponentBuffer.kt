package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.*
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.nativedata.MemoryAllocator
import java.nio.ByteBuffer

class ComponentBuffer<T> internal constructor(
    private val definition: ComponentDefinition<T>,
    handle: Long,
    isOwned: Boolean
) : KotlinNativeObject(handle, isOwned, NovelRT::Nrt_ComponentBufferMemoryContainer_Destroy) {
    fun getComponent(entity: EntityId): T {
        val output = ByteBuffer.allocate(definition.size.toInt())
        retrieveComponent(handle, entity.toLong(), definition.size.toInt(), output.array()).handleNrtResult()
        return definition.deserialize(output)
    }

    fun pushComponentUpdateInstruction(poolId: PoolId, entity: EntityId, component: T) {
        MemoryAllocator.allocate(definition.size).scope { memory ->
            definition.serialize(component, memory.buffer)

            NovelRT.Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(
                handle,
                poolId.toLong(),
                entity.toInt(),
                memory.address
            ).handleNrtResult()
        }
    }

    companion object {
        // A proper JNI method for this is essential for performance.
        // We can save a lot of JNI calls for that hot path.
        @JvmStatic
        private external fun retrieveComponent(handle: Long, entity: Long, size: Int, output: ByteArray): NrtResult
    }
}
