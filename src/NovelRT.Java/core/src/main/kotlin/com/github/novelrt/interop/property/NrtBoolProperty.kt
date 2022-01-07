package com.github.novelrt.interop.property

import com.github.novelrt.interop.*

internal inline fun KotlinNativeObject.getNativeNrtBool(getter: NativeGetter<NrtBool>): Boolean =
    getter(handle).toBoolean()

internal inline fun KotlinNativeObject.setNativeNrtBool(value: Boolean, setter: NativeSetter<NrtBool>) {
    setter(handle, value.toNrtBool()).handleNrtResult()
}
