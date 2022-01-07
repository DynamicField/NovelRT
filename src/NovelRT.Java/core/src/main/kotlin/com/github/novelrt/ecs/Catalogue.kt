package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.*
import com.github.novelrt.interop.handleNrtResult

class Catalogue internal constructor(
    handle: Long,
    owned: Boolean,
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_Catalogue_Destroy) {
    fun createEntity(): EntityId = NovelRT.Nrt_catalogue_CreateEntity(handle).toUInt()
    fun deleteEntity(entity: EntityId) = NovelRT.Nrt_Catalogue_DeleteEntity(handle, entity.toInt()).handleNrtResult()

    companion object : SingleTrackingContainer<Catalogue>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<Catalogue>): Catalogue = Catalogue(handle.value, false)
    }
}
