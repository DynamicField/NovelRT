package com.github.novelrt.interop

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter
import com.github.novelrt.fumocement.NativeObject

abstract class KotlinNativeObject internal constructor(
    handle: Long,
    owned: Boolean,
    handleDeleter: HandleDeleter?,
    disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
) : NativeObject(handle, owned, disposalMethod, handleDeleter) {
    @get:JvmName("getHandleKotlin")
    @get:JvmSynthetic
    internal val handle: Long
        inline get() = super.getHandle()

    companion object {
        @Suppress("NOTHING_TO_INLINE")
        internal inline fun <T : KotlinNativeObject> T.getObjectHandle(): ObjectHandle<T> {
            return ObjectHandle(handle)
        }
    }
}
