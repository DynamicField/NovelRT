package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.builtin.UInt32Pointer
import com.github.novelrt.interop.*

class ComponentCache internal constructor(
    handle: Long,
    owned: Boolean
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_ComponentCache_Destroy) {
    /**
     * Prepares all ComponentBuffer instances for the next update cycle.
     *
     * This method is not thread safe. It should also not be explicitly called by the end user in a regular ECS
     * setup.
     *
     * @param entitiesToDelete All entities that were explicitly pushed for deletion in the last update cycle.
     */
    fun prepAllBuffersForNextFrame(entitiesToDelete: EntityIdVector) =
        NovelRT.Nrt_ComponentCache_PrepAllBuffersForNextFrame(handle, entitiesToDelete.handle)

    fun <C : ComponentDefinition<C>> registerComponentType(definition: C): BufferIdentifier<C> {
        val id = UInt32Pointer(DisposalMethod.MANUAL).resultWith { myHandle, pointerHandle ->
            registerComponentType(
                myHandle,
                definition.size,
                definition.deleteState.pointer.address,
                pointerHandle
            )
        }
        return BufferIdentifier(definition, id.toULong())
    }

    fun <C : ComponentDefinition<C>> getComponentBufferById(identifier: BufferIdentifier<C>): ComponentBuffer<C> {
        val output = IndirectedPointer { handle -> ComponentBuffer(identifier.definition, handle, false) }
        return output.resultWith { myHandle, outputHandle ->
            NovelRT.Nrt_ComponentCache_GetComponentBufferById(myHandle, identifier.id.toLong(), outputHandle)
        }
    }

    data class BufferIdentifier<C : ComponentDefinition<C>>(val definition: C, val id: ComponentTypeId)

    companion object : SingleTrackingContainer<ComponentCache>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<ComponentCache>): ComponentCache =
            ComponentCache(handle.value, false)

        @JvmStatic
        private external fun registerComponentType(
            cacheHandle: Long,
            size: Long,
            deleteState: Long,
            resultOut: Long
        ): NrtResult
    }
}
