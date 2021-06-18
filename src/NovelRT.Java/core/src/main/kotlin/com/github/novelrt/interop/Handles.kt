package com.github.novelrt.interop

import com.github.novelrt.fumocement.*

@Suppress("NOTHING_TO_INLINE")
internal inline fun <T : NativeObject> Long.toObjectHandle(): ObjectHandle<T> {
    return ObjectHandle(this)
}

internal inline fun <T : NativeObject> IndirectedPointer<T>.resultWith(
    filler: (pointerHandle: Long) -> NrtResult
): T {
    this.use { output ->
        filler(output.handle).handleNrtResult()
        return this.get()!!
    }
}

internal fun <T : NativeObject> makeOutputPointer(
    provider: NativeObjectProvider<T>
): IndirectedPointer<T> {
    return IndirectedPointer(provider, DisposalMethod.MANUAL)
}

internal fun <T : NativeObject> makeOutputPointer(
    factory: NativeObjectFactory<T>,
    owned: Boolean
): IndirectedPointer<T> {
    return IndirectedPointer({ factory.createInstance(it, owned) }, DisposalMethod.MANUAL)
}

internal fun <T : NativeObject> makeOutputPointer(
    factory: (handle: Long, owned: Boolean, disposalMethod: DisposalMethod) -> T,
    owned: Boolean,
    disposalMethod: DisposalMethod
): IndirectedPointer<T> {
    return IndirectedPointer({ factory(it, owned, disposalMethod) }, DisposalMethod.MANUAL)
}
