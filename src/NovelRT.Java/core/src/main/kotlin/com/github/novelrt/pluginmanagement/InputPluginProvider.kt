package com.github.novelrt.pluginmanagement

import com.github.novelrt.input.InputDevice
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT

class InputPluginProvider internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_IInputPluginProvider_Destroy), PluginProvider {
    // This is a function to be consistent with other providers.
    fun getInputDevice(): InputDevice = cachedDevice

    private val cachedDevice: InputDevice by lazy {
        val resourceLoaderHandle =
            NovelRT.Nrt_IInputPluginProvider_GetInputDevice(this.handle)
        InputDevice(resourceLoaderHandle)
    }
}
