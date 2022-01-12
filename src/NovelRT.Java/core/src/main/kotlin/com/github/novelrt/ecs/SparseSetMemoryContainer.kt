package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.Pointer
import com.github.novelrt.interop.*
import com.github.novelrt.nativedata.MemoryAllocator
import java.nio.ByteBuffer

class SparseSetMemoryContainer<T>(private val definition: ComponentDefinition<T>) : KotlinNativeObject(
    NovelRT.Nrt_SparseSetMemoryContainer_Create(definition.size),
    true,
    NovelRT::Nrt_SparseSetMemoryContainer_Destroy
) {
    fun insert(key: SparseSetKey, value: T) {
        val output = ByteBuffer.allocate(definition.size)
        definition.serialize(value, output)

        insertBytes(handle, key.toInt(), output.array()).handleNrtResult()
    }

    fun tryInsert(key: SparseSetKey, value: T): Boolean {
        val output = ByteBuffer.allocate(definition.size)
        definition.serialize(value, output)

        return tryInsertBytes(handle, key.toInt(), output.array())
    }

    fun remove(key: SparseSetKey) = NovelRT.Nrt_SparseSetMemoryContainer_Remove(handle, key.toInt()).handleNrtResult()

    fun tryRemove(key: SparseSetKey) = NovelRT.Nrt_SparseSetMemoryContainer_TryRemove(handle, key.toInt()).toBoolean()

    fun clear() = NovelRT.Nrt_SparseSetMemoryContainer_Clear(handle)

    fun containsKey(key: SparseSetKey) =
        NovelRT.Nrt_SparseSetMemoryContainer_ContainsKey(handle, key.toInt()).toBoolean()

    operator fun get(key: SparseSetKey): T {
        val output = definition.createEmpty()

        val viewHandle = NovelRT.Nrt_SparseSetMemoryContainer_Indexer(handle, key.toInt())
        ByteIteratorView(viewHandle, false, DisposalMethod.MANUAL).use { view ->
            MemoryAllocator.allocate(definition.size).scope { span ->
                view.copyFromLocation(span.address)
                definition.deserialize(output, span.buffer)
            }
        }

        return output
    }

    fun overwrite(key: SparseSetKey, value: T) {
        if (!containsKey(key)) {
            throw IllegalArgumentException("Cannot overwrite the value attached to $key because it is not present.")
        }
        val viewHandle = NovelRT.Nrt_SparseSetMemoryContainer_Indexer(handle, key.toInt())
        ByteIteratorView(viewHandle, false, DisposalMethod.MANUAL).use { view ->
            MemoryAllocator.allocate(definition.size).scope { span ->
                definition.deserialize(value, span.buffer)
                view.writeToLocation(span.address)
            }
        }
    }

    val length: Int get() = NovelRT.Nrt_SparseSetMemoryContainer_Length(handle)

    internal class ByteIteratorView(
        handle: Long,
        owned: Boolean,
        disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
    ) : KotlinNativeObject(
        handle,
        owned,
        NovelRT::Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy,
        disposalMethod
    ) {
        val isValid: Boolean get() = NovelRT.Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(handle).toBoolean()
        fun copyFromLocation(output: @Pointer Long) {
            NovelRT.Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(handle, output)
        }

        fun writeToLocation(output: @Pointer Long) {
            NovelRT.Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(handle, output)
        }

        val dataHandle: @Pointer Long get() = NovelRT.Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(handle)
    }

    internal class ConstIterator(handle: Long, owned: Boolean) :
        KotlinNativeObject(handle, owned, NovelRT::Nrt_SparseSetMemoryContainer_ConstIterator_Destroy) {
        fun moveNext() {
            NovelRT.Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(handle)
        }

        override fun equals(other: Any?): Boolean {
            if (other !is ConstIterator) {
                return false
            }

            return NovelRT.Nrt_SparseSetMemoryContainer_ConstIterator_Equal(handle, other.handle).toBoolean()
        }

        override fun hashCode(): Int {
            return handle.toInt()
        }
    }

    internal class ConstByteIteratorView(handle: Long, owned: Boolean) :
        KotlinNativeObject(handle, owned, NovelRT::Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy) {
        fun isValid() = NovelRT.Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(handle).toBoolean()

        fun read(size: Int): ByteArray {
            val array = ByteArray(size)
            constByteIteratorViewRead(handle, array, size)
            return array
        }
    }

    companion object {
        @JvmStatic
        private external fun insertBytes(handle: Long, key: Int, bytes: ByteArray): NrtResult

        @JvmStatic
        private external fun tryInsertBytes(handle: Long, key: Int, bytes: ByteArray): Boolean

        @JvmStatic
        private external fun constByteIteratorViewRead(view: Long, outBytes: ByteArray, length: Int)
    }
}
