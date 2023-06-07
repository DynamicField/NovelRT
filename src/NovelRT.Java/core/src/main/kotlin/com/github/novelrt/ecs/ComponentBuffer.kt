package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.builtin.IntPtrPointer
import com.github.novelrt.fumocement.memory.NativeStack
import com.github.novelrt.interop.*
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.nativedata.CopiedStructView
import com.github.novelrt.nativedata.StructPointer

class ComponentBuffer<C : ComponentDefinition<C>> internal constructor(
    val definition: C,
    handle: Long,
    isOwned: Boolean
) : KotlinNativeObject(handle, isOwned, NovelRT::Nrt_ComponentBufferMemoryContainer_Destroy) {
    fun getComponent(entity: EntityId): CopiedStructView<C> {
        IntPtrPointer.allocate(NativeStack.current()).use { out ->
            NovelRT.Nrt_ComponentBufferMemoryContainer_GetComponent(handle, entity.toLong(), out.address)
                .handleNrtResult()
            return CopiedStructView(NovelRT.Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(out.address))
        }
    }

    fun getComponentUnsafe(entity: EntityId): CopiedStructView<C> {
        val address = getComponentHandleUnsafe(handle, entity.toLong())
        return CopiedStructView(address)
    }

    fun pushComponentUpdateInstruction(poolId: PoolId, entity: EntityId, component: StructPointer<C>) {
        NovelRT.Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(
            handle,
            poolId.toLong(),
            entity.toLong(),
            component.address
        ).handleNrtResult()
    }

    companion object {
        @JvmStatic
        external fun getComponentHandleUnsafe(bufferHandle: Long, entityId: Long): Long
    }
}
