package com.github.novelrt.ecs

import com.github.novelrt.ExperimentalNovelRTApi
import com.github.novelrt.fumocement.builtin.IntPtrPointer
import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.fumocement.memory.NativeStack
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.nativedata.OptionalStructView
import com.github.novelrt.nativedata.StructPointer

class ComponentView<C : ComponentDefinition<C>> internal constructor(val definition: C, handle: Long) :
    KotlinNativeObject(handle, false, {}), Iterable<EntityComponentPair<C>> {

    fun tryGetComponent(entity: EntityId, outComponent: StructPointer<C>): Boolean {
        if (outComponent.address == 0L) {
            throw IllegalArgumentException("Cannot write a component to a null pointer.")
        }
        val component = getComponentHandle(handle, entity.toLong())
        return if (component != 0L) {
            NativeMemory.access().copyMemory(component, outComponent.address, definition.size)
            true
        } else {
            false
        }
    }

    fun peekComponent(entity: EntityId): OptionalStructView<C> {
        val component = getComponentHandle(handle, entity.toLong())
        return OptionalStructView(component)
    }

    fun pushComponentUpdateInstruction(entity: EntityId, component: StructPointer<C>) {
        NovelRT.Nrt_UnsafeComponentView_PushComponentUpdateInstruction(
            handle,
            entity.toLong(),
            component.address
        ).handleNrtResult()
    }

    @ExperimentalNovelRTApi
    override operator fun iterator(): ViewIterator {
        val stack = NativeStack.current()

        // Profiling has shown that this is much efficient, as IntPtrPointer.allocate()
        // adds work for the GC.

        // [beginId, beginComp, endId]
        val ptrArray = stack.allocateManual(3 * IntPtrPointer.SIZE)

        try {
            getComponentIterators(handle, ptrArray, ptrArray + 8, ptrArray + 16)

            val beginIdVal = NativeMemory.access().getAddress(ptrArray)
            val beginCompVal = NativeMemory.access().getAddress(ptrArray + 8)
            val endIdVal = NativeMemory.access().getAddress(ptrArray + 16)
            return ViewIterator(beginIdVal, beginCompVal, endIdVal)
        } finally {
            stack.freeManual(3 * IntPtrPointer.SIZE)
        }
    }

    @ExperimentalNovelRTApi
    inline fun forEach(itAction: (id: EntityId, component: StructPointer<C>) -> Unit) {
        val it = iterator()
        while (it.hasNext()) {
            it.nextFunc(itAction)
        }
    }

    fun begin(): UsualSparseSetIterator<C> = UsualSparseSetIterator(NovelRT.Nrt_UnsafeComponentView_begin(handle))
    fun end(): UsualSparseSetIterator<C> = UsualSparseSetIterator(NovelRT.Nrt_UnsafeComponentView_end(handle))

    @ExperimentalNovelRTApi
    inner class ViewIterator internal constructor(curEntity: Long, curComp: Long, endEntity: Long) :
        ExperimentalSparseSetIterator<C>(curEntity, curComp, endEntity, definition)

    companion object {
        @JvmStatic
        external fun getComponentHandle(viewHandle: Long, entityId: Long): Long

        // Where:
        // outBeginIds: size_t**
        // outBeginComps: COMPONENT_STRUCT**
        // outEndIds: size_t**
        @JvmStatic
        external fun getComponentIterators(
            viewHandle: Long,
            outBeginIds: Long,
            outBeginComps: Long,
            outEndIds: Long
        )
    }
}
