package com.github.novelrt.pluginmanagement

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.windowing.WindowingDevice

class WindowingPluginProvider internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_IWindowingPluginProvider_Destroy), PluginProvider {

    // This is a function to be consistent with other providers.
    fun getWindowingDevice(): WindowingDevice = cachedDevice

    private val cachedDevice: WindowingDevice by lazy {
        val resourceLoaderHandle =
            NovelRT.Nrt_IWindowingPluginProvider_GetWindowingDevice(this.handle)
        WindowingDevice(resourceLoaderHandle)
    }
}
