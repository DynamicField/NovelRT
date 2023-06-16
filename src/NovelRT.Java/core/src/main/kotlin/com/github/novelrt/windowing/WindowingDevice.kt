package com.github.novelrt.windowing

import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.toBoolean

class WindowingDevice internal constructor(handle: Long) : KotlinNativeObject(handle, true, NovelRT::Nrt_IWindowingDevice_Destroy) {
    val isVisible: Boolean get() = NovelRT.Nrt_IWindowingDevice_GetIsVisible(handle).toBoolean()
    val shouldClose: Boolean get() = NovelRT.Nrt_IWindowingDevice_GetShouldClose(handle).toBoolean()

    var windowTitle: String
        get() = NovelRT.Nrt_IWindowingDevice_GetWindowTitle(handle, StringDeletionBehaviour.DELETE)
        set(value) = NovelRT.Nrt_IWindowingDevice_SetWindowTitle(handle, value).handleNrtResult()

    fun processAllMessages() = NovelRT.Nrt_IWindowingDevice_ProcessAllMessages(handle).handleNrtResult()
}
