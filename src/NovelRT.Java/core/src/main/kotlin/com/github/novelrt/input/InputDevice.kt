package com.github.novelrt.input

import com.github.novelrt.fumocement.memory.NativeStack
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.toBoolean
import com.github.novelrt.maths.GeoVector2F

class InputDevice internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_IInputDevice_Destroy) {
    fun isKeyPressed(key: String): Boolean = NovelRT.Nrt_IInputDevice_IsKeyPressed(handle, key).toBoolean()
    fun isKeyHeld(key: String): Boolean = NovelRT.Nrt_IInputDevice_IsKeyHeld(handle, key).toBoolean()
    fun isKeyReleased(key: String): Boolean = NovelRT.Nrt_IInputDevice_IsKeyReleased(handle, key).toBoolean()

    fun getKeyState(key: String): KeyState {
        val state = NovelRT.Nrt_IInputDevice_GetKeyState(handle, key)
        return KeyState.values()[state]
    }

    fun addInputAction(actionName: String, keyIdentifier: String): InputAction {
        val action = NovelRT.Nrt_IInputDevice_AddInputAction(handle, actionName, keyIdentifier)
        return InputAction.getTracked(action)
    }

    val mousePosition: GeoVector2F
        get() {
            val stack = NativeStack.current()
            try {
                val out = stack.allocateManual(NovelRT.NrtGeoVector2F.SIZE)

                val struct = NovelRT.Nrt_IInputDevice_GetMousePosition(handle, out)
                return GeoVector2F(struct.x, struct.y)
            } finally {
                stack.freeManual(NovelRT.NrtGeoVector2F.SIZE)
            }
        }

    fun getAvailableKey(requestedKey: String): NovelKey {
        val key = NovelRT.Nrt_IInputDevice_GetAvailableKey(handle, requestedKey)
        return NovelKey.getTracked(key)
    }
}
