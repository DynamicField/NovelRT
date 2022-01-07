package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.interop.SingleTrackingContainer

class ComponentCache(
    handle: Long,
    owned: Boolean
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_ComponentCache_Destroy) {
    fun prepAllBuffersForNextFrame(entitiesToDelete: EntityIdVector) =
        NovelRT.Nrt_ComponentCache_PrepAllBuffersForNextFrame(handle, entitiesToDelete.handle)

    companion object : SingleTrackingContainer<ComponentCache>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<ComponentCache>): ComponentCache =
            ComponentCache(handle.value, false)
    }
}
