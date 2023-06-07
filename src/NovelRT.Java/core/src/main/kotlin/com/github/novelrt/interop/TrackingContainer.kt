package com.github.novelrt.interop

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.NativeObject
import com.github.novelrt.fumocement.NativeObjectTracker

abstract class TrackingContainer<T : NativeObject> internal constructor(target: NativeObjectTracker.Target) {
    private val tracker = NativeObjectTracker({ handle, _ -> makeObject(ObjectHandle(handle)) }, target)

    protected abstract fun makeObject(handle: ObjectHandle<T>): T

    internal fun getTracked(handle: ObjectHandle<T>): T {
        return tracker.getOrCreate(handle.value)
    }

    internal fun getTracked(handle: Long): T {
        return tracker.getOrCreate(handle)
    }

    internal fun makeTrackingOutputPointer(): IndirectedPointer<T> {
        return IndirectedPointer(tracker::getOrCreate, DisposalMethod.MANUAL)
    }

    internal fun ObjectHandle<T>.makeTracked(): T = getTracked(this)
}
