package com.github.novelrt.ecs

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult

class UnsafeComponentView internal constructor(handle: Long, owned: Boolean) :
    KotlinNativeObject(handle, owned, NovelRT::Nrt_UnsafeComponentView_Destroy) {
    // PushComponentUpdate - requires JNI, TODO

    fun removeComponent(entity: EntityId) =
        NovelRT.Nrt_UnsafeComponentView_RemoveComponent(handle, entity.toInt()).handleNrtResult()
}
