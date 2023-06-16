package com.github.novelrt.ecs

import com.github.novelrt.ExperimentalNovelRTApi
import com.github.novelrt.fumocement.Pointers
import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.nativedata.StructPointer

@ExperimentalNovelRTApi
abstract class ExperimentalSparseSetIterator<C : ComponentDefinition<C>> internal constructor(
    var curEntityPtr: Long, var curComponentPtr: Long,
    var maxEntityPtr: Long,
    val definition: C
) : Iterator<EntityComponentPair<C>> {

    override fun hasNext(): Boolean {
        return maxEntityPtr != curEntityPtr
    }

    override fun next(): EntityComponentPair<C> {
        return nextFunc { a, b -> EntityComponentPair(a, b) }
    }

    inline fun <T> nextFunc(itAction: (id: EntityId, component: StructPointer<C>) -> T): T {
        if (maxEntityPtr == curEntityPtr) {
            throw NoSuchElementException("Reached end of the iterator.")
        }

        val ret = itAction(
            NativeMemory.access().getLong(curEntityPtr).toULong(),
            StructPointer(curComponentPtr)
        )

        curEntityPtr += Pointers.UINTPTR_T_SIZE
        curComponentPtr += definition.size

        return ret
    }
}
