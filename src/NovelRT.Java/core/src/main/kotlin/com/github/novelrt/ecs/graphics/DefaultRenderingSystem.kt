package com.github.novelrt.ecs.graphics

import com.github.novelrt.ecs.BuiltInSystem
import com.github.novelrt.ecs.Catalogue
import com.github.novelrt.ecs.EntityId
import com.github.novelrt.ecs.SystemScheduler
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.threading.FutureResult
import com.github.novelrt.threading.FutureResultOfTextureInfo

class DefaultRenderingSystem internal constructor(handle: Long) : BuiltInSystem(handle) {
    fun forceVertexTextureFutureResolution() =
        NovelRT.Nrt_DefaultRenderingSystem_ForceVertexTextureFutureResolution(handle).handleNrtResult()

    fun getOrLoadTexture(textureName: String): FutureResult<TextureInfo> {
        val futureHandle = NovelRT.Nrt_DefaultRenderingSystem_GetOrLoadTexture(handle, textureName)
        return FutureResultOfTextureInfo(futureHandle)
    }

    fun createSpriteEntity(texture: TextureInfo, catalogue: Catalogue): EntityId {
        return NovelRT.Nrt_DefaultRenderingSystem_CreateSpriteEntity(handle, texture.handle, catalogue.handle).toULong()
    }

    fun createSpriteEntityOutsideOfSystem(texture: TextureInfo, scheduler: SystemScheduler): EntityId {
        val entity =
            NovelRT.Nrt_DefaultRenderingSystem_CreateSpriteEntityOutsideOfSystem(
                handle,
                texture.handle,
                scheduler.handle
            )
        return entity.toULong()
    }
}
