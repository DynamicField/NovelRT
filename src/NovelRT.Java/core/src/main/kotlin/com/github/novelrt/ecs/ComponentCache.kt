package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.builtin.UInt32Pointer
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.interop.SingleTrackingContainer

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

    fun <T> registerComponentType(definition: ComponentDefinition<T>): BufferIdentifier<T> {
        // todo: this shouldn't be int?
        val id = UInt32Pointer(DisposalMethod.MANUAL).resultWith { myHandle, pointerHandle ->
            NovelRT.Nrt_ComponentCache_RegisterComponentTypeUnsafe(
                myHandle,
                definition.size,
                definition.nativeDeleteState,
                definition.nativeUpdateApplier,
                pointerHandle
            )
        }
        return BufferIdentifier(definition, id.toULong())
    }

    fun <T> getComponentBufferById(identifier: BufferIdentifier<T>): ComponentBuffer<T> {
        val output = IndirectedPointer { handle -> ComponentBuffer(identifier.definition, handle, false) }
        return output.resultWith { myHandle, outputHandle ->
            NovelRT.Nrt_ComponentCache_GetComponentBufferById(myHandle, identifier.id.toInt(), outputHandle)
        }
    }

    data class BufferIdentifier<T>(val definition: ComponentDefinition<T>, val id: ComponentTypeId)

    companion object : SingleTrackingContainer<ComponentCache>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<ComponentCache>): ComponentCache =
            ComponentCache(handle.value, false)
    }
}
