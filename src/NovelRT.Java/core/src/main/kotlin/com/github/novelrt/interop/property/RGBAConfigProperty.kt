package com.github.novelrt.interop.property

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.graphics.RGBAConfig
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NrtResult
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.makeOutputPointer

internal inline fun KotlinNativeObject.getNativeRGBAConfig(getter: IndirectedNativeGetter): RGBAConfig {
    return makeOutputPointer(RGBAConfig::NativeStruct, false, DisposalMethod.MANUAL)
        .resultWith(getter)
        .use(RGBAConfig.NativeStruct::createKotlin)
}

internal inline fun KotlinNativeObject.setNativeRGBAConfig(value: RGBAConfig, setter: HandleNativeSetter) {
    value.createNative(DisposalMethod.MANUAL).use { native ->
        setter(handle, native.handle).handleNrtResult()
    }
}
