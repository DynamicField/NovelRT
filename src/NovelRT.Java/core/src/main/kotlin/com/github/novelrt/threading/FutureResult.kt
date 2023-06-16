package com.github.novelrt.threading

import com.github.novelrt.ecs.graphics.TextureInfo
import com.github.novelrt.fumocement.HandleDeleter
import com.github.novelrt.fumocement.builtin.Int64Pointer
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.toBoolean
import com.github.novelrt.nativedata.stackScope

sealed class FutureResult<T>(
    handle: Long,
    deleter: HandleDeleter,
    protected val tryGetValue: (myHandle: Long, outHandle: Long) -> Int,
    protected val makeKotlinObject: (cObject: Long) -> T
) :
    KotlinNativeObject(handle, true, deleter) {

    val hasValue: Boolean get() {
        if (cachedResult != null) return true
        return value != null
    }

    val value: T?
        get() {
            if (cachedResult != null) return cachedResult

            stackScope {
                val out = Int64Pointer.allocate(this)
                if (tryGetValue(handle, out.address).toBoolean()) {
                    cachedResult = makeKotlinObject(out.value)
                }
            }

            return cachedResult
        }

    fun getValueOrThrow(): T {
        return value ?: throw IllegalStateException("FutureResult has no value!")
    }

    private var cachedResult: T? = null
}

internal class FutureResultOfTextureInfo(handle: Long) :
    FutureResult<TextureInfo>(
        handle,
        NovelRT::Nrt_FutureResultOfTextureInfo_Destroy,
        NovelRT::Nrt_FutureResultOfTextureInfo_TryGetValue,
        ::TextureInfo
    )
