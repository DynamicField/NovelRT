package com.github.novelrt.ecs

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.pluginmanagement.*

class Configurator : KotlinNativeObject(NovelRT.Nrt_Configurator_Create(), true, NovelRT::Nrt_Configurator_Destroy) {
    fun withDefaultSystemsAndComponents(): Configurator {
        NovelRT.Nrt_Configurator_AddDefaultSystemsAndComponents(this.handle)
        return this
    }

    fun withPluginProvider(provider: PluginProvider): Configurator {
        when (provider) {
            is GraphicsPluginProvider ->
                NovelRT.Nrt_Configurator_AddGraphicsPluginProvider(this.handle, provider.handle)

            is WindowingPluginProvider ->
                NovelRT.Nrt_Configurator_AddWindowingPluginProvider(this.handle, provider.handle)

            is ResourceManagementPluginProvider ->
                NovelRT.Nrt_Configurator_AddResourceManagementPluginProvider(this.handle, provider.handle)

            is InputPluginProvider ->
                NovelRT.Nrt_Configurator_AddInputPluginProvider(this.handle, provider.handle)
        }
        return this
    }

    fun withPluginProviders(vararg provider: PluginProvider): Configurator {
        for (p in provider) {
            withPluginProvider(p)
        }
        return this
    }

    fun initialiseAndRegisterComponents(): SystemScheduler {
        return SystemScheduler(NovelRT.Nrt_Configurator_InitialiseAndRegisterComponents(this.handle), false)
    }
}
