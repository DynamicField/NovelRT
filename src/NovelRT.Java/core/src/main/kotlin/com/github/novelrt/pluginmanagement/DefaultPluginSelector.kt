package com.github.novelrt.pluginmanagement

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import kotlin.reflect.KClass

class DefaultPluginSelector :
    KotlinNativeObject(NovelRT.Nrt_DefaultPluginSelector_Create(), true, NovelRT::Nrt_DefaultPluginSelector_Destroy) {
    // Instances of kotlin plugins must only be done once! Or else we would destroy the
    // plugin multiple times...
    inline fun <reified T : PluginProvider> getDefaultPluginTypeOnCurrentPlatformFor(): T {
        if (!pluginMap.contains(T::class)) {
            pluginMap[T::class] = when (T::class) {
                GraphicsPluginProvider::class -> getGraphicsPlugin()
                WindowingPluginProvider::class -> getWindowingPlugin()
                ResourceManagementPluginProvider::class -> getResourceManagementPlugin()
                InputPluginProvider::class -> getInputPlugin()
                else -> throw UnsupportedOperationException("Unknown plugin: ${T::class}")
            }
        }
        return pluginMap[T::class] as T
    }

    @PublishedApi
    internal fun getGraphicsPlugin(): GraphicsPluginProvider {
        val graphics = NovelRT.Nrt_DefaultPluginSelector_GetDefaultGraphicsPluginForCurrentPlatform(handle)
        return GraphicsPluginProvider(graphics)
    }

    @PublishedApi
    internal fun getWindowingPlugin(): WindowingPluginProvider {
        val win = NovelRT.Nrt_DefaultPluginSelector_GetDefaultWindowingPluginForCurrentPlatform(handle)
        return WindowingPluginProvider(win)
    }

    @PublishedApi
    internal fun getResourceManagementPlugin(): ResourceManagementPluginProvider {
        val res = NovelRT.Nrt_DefaultPluginSelector_GetDefaultResourceManagementPluginForCurrentPlatform(handle)
        return ResourceManagementPluginProvider(res)
    }

    @PublishedApi
    internal fun getInputPlugin(): InputPluginProvider {
        val input = NovelRT.Nrt_DefaultPluginSelector_GetDefaultInputPluginForCurrentPlatform(handle)
        return InputPluginProvider(input)
    }

    @PublishedApi
    internal var pluginMap: MutableMap<KClass<out PluginProvider>, PluginProvider> = mutableMapOf()
}
