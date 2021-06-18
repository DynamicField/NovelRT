package com.github.novelrt.interop

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.NativeObject
import com.github.novelrt.fumocement.builtin.FloatPointer

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

    internal inline fun <T : NativeObject> IndirectedPointer<T>.resultWith(
        filler: (myHandle: Long, pointerHandle: Long) -> NrtResult
    ): T {
        this.use { output ->
            filler(this@KotlinNativeObject.handle, output.handle).handleNrtResult()
            return this.get()!!
        }
    }

    internal inline fun FloatPointer.resultWith(
        filler: (myHandle: Long, pointerHandle: Long) -> NrtResult
    ): Float {
        this.use { output ->
            filler(this@KotlinNativeObject.handle, output.handle).handleNrtResult()
            return this.value
        }
    }

    companion object {
        @Suppress("NOTHING_TO_INLINE")
        internal inline fun <T : KotlinNativeObject> T.getObjectHandle(): ObjectHandle<T> {
            return ObjectHandle(handle)
        }
    }
}
