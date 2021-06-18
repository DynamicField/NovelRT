package com.github.novelrt.interop.property

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.graphics.FontSet
import com.github.novelrt.graphics.RGBAConfig
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.makeOutputPointer

internal inline fun KotlinNativeObject.getNativeFontSet(getter: IndirectedNativeGetter): FontSet {
    return FontSet.makeTrackingOutputPointer().resultWith(getter)
}

internal inline fun KotlinNativeObject.setNativeFontSet(value: FontSet, setter: HandleNativeSetter) {
    setter(handle, value.handle).handleNrtResult()
}
