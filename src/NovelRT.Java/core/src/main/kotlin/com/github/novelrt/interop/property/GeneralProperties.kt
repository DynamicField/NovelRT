package com.github.novelrt.interop.property

import com.github.novelrt.fumocement.Pointer
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NrtResult
import com.github.novelrt.interop.handleNrtResult

typealias IndirectedNativeGetter = (myHandle: Long, outputHandle: Long) -> NrtResult
typealias NativeGetter<T> = (myHandle: Long) -> T

typealias HandleNativeSetter = (myHandle: Long, value: @Pointer Long) -> NrtResult
typealias NativeSetter<T> = (myHandle: Long, value: T) -> NrtResult

internal inline fun <T> KotlinNativeObject.getNative(getter: NativeGetter<T>): T = getter(handle)

internal inline fun <N, K> KotlinNativeObject.getNative(
    getter: NativeGetter<N>, conversion: N.() -> K
): K =
    getter(handle).run(conversion)


internal inline fun <T> KotlinNativeObject.setNative(value: T, setter: NativeSetter<T>) {
    setter(handle, value).handleNrtResult()
}

internal inline fun <N, K> KotlinNativeObject.setNative(
    value: K, setter: NativeSetter<N>, conversion: K.() -> N
) {
    setter(handle, value.run(conversion)).handleNrtResult()
}
