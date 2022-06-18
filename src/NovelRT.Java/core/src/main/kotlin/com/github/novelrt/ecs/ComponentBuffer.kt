package com.github.novelrt.ecs

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.builtin.UIntPtrPointer
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
        val address = UIntPtrPointer(DisposalMethod.MANUAL).resultWith { myHandle, pointerHandle ->
            NovelRT.Nrt_ComponentBufferMemoryContainer_GetComponent(myHandle, entity.toLong(), pointerHandle)
        }
        return CopiedStructView(NovelRT.Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(address))
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
