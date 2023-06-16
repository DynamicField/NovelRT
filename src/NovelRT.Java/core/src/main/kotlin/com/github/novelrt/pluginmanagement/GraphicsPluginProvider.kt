package com.github.novelrt.pluginmanagement

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT

class GraphicsPluginProvider internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_IGraphicsPluginProvider_Destroy), PluginProvider {
}
