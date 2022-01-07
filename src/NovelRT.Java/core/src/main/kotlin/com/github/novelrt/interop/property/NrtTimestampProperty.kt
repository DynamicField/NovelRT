package com.github.novelrt.interop.property

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.timing.NrtTimestamp
import com.github.novelrt.timing.Timestamp
import com.github.novelrt.timing.Timestamp.Companion.toTimestamp

internal inline fun KotlinNativeObject.getNativeNrtTimestamp(getter: NativeGetter<NrtTimestamp>): Timestamp =
    getter(handle).toTimestamp()

internal inline fun KotlinNativeObject.setNativeNrtTimestamp(value: Timestamp, setter: NativeSetter<NrtTimestamp>) {
    setter(handle, value.toNative()).handleNrtResult()
}
