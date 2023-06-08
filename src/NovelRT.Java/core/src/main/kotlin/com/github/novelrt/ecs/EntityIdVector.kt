package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.*
import com.github.novelrt.interop.handleNrtResult

class EntityIdVector internal constructor(
    handle: Long,
    owned: Boolean
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_EntityIdVector_Destroy) {
    fun insert(entity: EntityId) = NovelRT.Nrt_EntityIdVector_Insert(handle, entity.toLong()).handleNrtResult()
    fun remove(entity: EntityId) = NovelRT.Nrt_EntityIdVector_Remove(handle, entity.toLong()).handleNrtResult()

    companion object : TrackingContainer<EntityIdVector>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<EntityIdVector>): EntityIdVector =
            EntityIdVector(handle.value, false)
    }
}
