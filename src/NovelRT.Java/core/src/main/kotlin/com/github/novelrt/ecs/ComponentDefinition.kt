package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.interop.ComponentUpdatePtr
import com.github.novelrt.nativedata.MemoryAllocator
import com.github.novelrt.nativedata.MemorySpan
import java.nio.ByteBuffer

// Natively, components are expressed as byte arrays (char*).
abstract class ComponentDefinition<T>(val size: Long) {
    abstract fun createEmpty(): T
    abstract val deleteState: T
    abstract fun serialize(component: T, buffer: ByteBuffer)
    abstract fun deserialize(component: T, buffer: ByteBuffer)
    abstract fun applyUpdate(rootComponent: T, updateComponent: T)

    fun deserialize(buffer: ByteBuffer): T {
        val component = createEmpty()
        deserialize(component, buffer)
        return component
    }

    private val deleteStateJavaBuffer = createDeleteStateJavaBuffer()
    internal val nativeDeleteState = deleteStateJavaBuffer.address
    internal val nativeUpdateApplier = createNativeUpdateApplier()

    private fun createDeleteStateJavaBuffer(): MemorySpan {
        val span = MemoryAllocator.allocate(size).memory
        serialize(deleteState, span.buffer)

        return span
    }

    private fun createNativeUpdateApplier(): FunctionPointer<ComponentUpdatePtr> {
        return FunctionPointer(
            ComponentUpdatePtr { rootComponentHandle, updateComponentHandle, size ->
                val retrieveBuffer = ByteBuffer.allocate((size * 2).toInt())
                retrieveUpdateComponentData(rootComponentHandle, updateComponentHandle, size, retrieveBuffer.array())

                val rootComponent = deserialize(retrieveBuffer)
                val updateComponent = deserialize(retrieveBuffer)

                applyUpdate(rootComponent, updateComponent)

                // Reuse the same buffer, we have enough room.
                val updateBuffer = retrieveBuffer.apply {
                    position(0)
                }
                serialize(rootComponent, updateBuffer)
                overwriteComponent(rootComponentHandle, size, updateBuffer.array())
            },
            DisposalMethod.GARBAGE_COLLECTED
        )
    }

    companion object {
        /**
         * Retrieves the data of the two given components of the given [size] into the [output] buffer.
         * * The [root] component is located first in the buffer, with an offset of 0.
         * * The [update] component is located second in the buffer, with an offset of [size].
         * * The [output] buffer must have a total size of `size * 2`
         */
        @JvmStatic
        private external fun retrieveUpdateComponentData(root: Long, update: Long, size: Long, output: ByteArray)
        @JvmStatic
        private external fun overwriteComponent(handle: Long, size: Long, newData: ByteArray)
    }
}
