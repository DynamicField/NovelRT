package com.github.novelrt.input

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.*

class NovelKey internal constructor(handle: Long) : KotlinNativeObject(handle, false, {}) {
    // TODO: Error handling when InputDevice has been GC'd but child NovelKey is still alive

    val name: String get() = NovelRT.Nrt_NovelKey_GetKeyName(handle, StringDeletionBehaviour.NO_DELETE)
    val externalKeyCode: Int get() = NovelRT.Nrt_NovelKey_GetExternalKeyCode(handle)
    val externalModifierCode: Int get() = NovelRT.Nrt_NovelKey_GetExternalModifierCode(handle)

    fun pairKey(externalKeyCode: Int) {
        NovelRT.Nrt_NovelKey_PairKey(handle, externalKeyCode)
    }

    fun unpairKey() {
        NovelRT.Nrt_NovelKey_UnpairKey(handle).handleNrtResult()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is NovelKey) return false
        return NovelRT.Nrt_NovelKey_equal(handle, other.handle).toBoolean()
    }

    companion object : TrackingContainer<NovelKey>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<NovelKey>): NovelKey {
            return NovelKey(handle.value)
        }
    }
}
