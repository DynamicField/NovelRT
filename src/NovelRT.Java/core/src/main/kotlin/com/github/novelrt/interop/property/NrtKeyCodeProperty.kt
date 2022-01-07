package com.github.novelrt.interop.property

import com.github.novelrt.input.KeyCode
import com.github.novelrt.input.KeyCode.Companion.toKotlinKeyCode
import com.github.novelrt.input.NrtKeyCode
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.handleNrtResult

internal inline fun KotlinNativeObject.getNativeNrtKeyCode(getter: NativeGetter<NrtKeyCode>): KeyCode =
    getter(handle).toKotlinKeyCode()

internal inline fun KotlinNativeObject.setNativeNrtKeyCode(value: KeyCode, setter: NativeSetter<NrtKeyCode>) {
    setter(handle, value.nativeValue).handleNrtResult()
}
