package com.github.novelrt.pluginmanagement

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.toNrtBool
import com.github.novelrt.resourcemanagement.ResourceLoader

class ResourceManagementPluginProvider internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_IResourceManagementPluginProvider_Destroy), PluginProvider {

    fun getResourceLoader(loadAssets: Boolean): ResourceLoader {
        if (cachedLoader == null) {
            val resourceLoaderHandle =
                NovelRT.Nrt_IResourceManagementPluginProvider_GetResourceLoader(this.handle, loadAssets.toNrtBool())
            cachedLoader = ResourceLoader(resourceLoaderHandle)
        }

        return cachedLoader!!
    }

    private var cachedLoader: ResourceLoader? = null
}
