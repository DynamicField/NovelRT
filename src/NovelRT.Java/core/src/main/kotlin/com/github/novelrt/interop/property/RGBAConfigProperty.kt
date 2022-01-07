package com.github.novelrt.interop.property

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.makeOutputPointer

internal inline fun KotlinNativeObject.getNativeRGBAColour(getter: IndirectedNativeGetter): RGBAColour {
    return makeOutputPointer(RGBAColour::NativeStruct, false, DisposalMethod.MANUAL)
        .resultWith(getter)
        .use(RGBAColour.NativeStruct::createKotlin)
}

internal inline fun KotlinNativeObject.setNativeRGBAColour(value: RGBAColour, setter: HandleNativeSetter) {
    value.createNative(DisposalMethod.MANUAL).use { native ->
        setter(handle, native.handle).handleNrtResult()
    }
}
