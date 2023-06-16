package com.github.novelrt.ecs

import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.fumocement.memory.NativeStack
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.toBoolean
import com.github.novelrt.nativedata.StructPointer

class UsualSparseSetIterator<C : ComponentDefinition<C>> internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_SparseSetMemoryContainer_Iterator_Destroy) {

    private val stack = NativeStack.current() // Iterators cannot cross multiple threads.
    var current: EntityComponentPair<C> = EntityComponentPair(0U, StructPointer(0))

    fun moveNextUntil(until: UsualSparseSetIterator<C>): Boolean {
        val sizePtr = stack.allocateManual(8)
        val struct2Ptr = stack.allocateManual(8)

        val result =
            NovelRT.Nrt_SparseSetMemoryContainer_Iterator_MoveNextUntil(handle, until.handle, sizePtr, struct2Ptr);
        return if (result.toBoolean()) {
            val size = NativeMemory.access().getLong(sizePtr).toULong()
            val structPtr = NativeMemory.access().getAddress(struct2Ptr)
            stack.freeManual(16)

            current = EntityComponentPair(
                size,
                StructPointer(structPtr)
            )
            true
        } else {
            false
        }
    }
}
