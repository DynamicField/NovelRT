package com.github.novelrt.input

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.interop.TrackingContainer

class InputAction internal constructor(handle: Long) : KotlinNativeObject(handle, false, {}) {
    // TODO: Error handling when InputDevice has been GC'd but child InputAction is still alive

    val actionName: String get() = NovelRT.Nrt_InputAction_GetActionName(handle, StringDeletionBehaviour.NO_DELETE)
    val pairedKey: NovelKey get() = NovelKey.getTracked(NovelRT.Nrt_InputAction_GetPairedKey(handle))

    val state: KeyState get() = KeyState.values()[NovelRT.Nrt_InputAction_GetState(handle)]

    companion object : TrackingContainer<InputAction>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<InputAction>): InputAction {
            return InputAction(handle.value)
        }
    }
}
