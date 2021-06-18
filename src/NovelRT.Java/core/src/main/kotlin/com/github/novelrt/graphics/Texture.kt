package com.github.novelrt.graphics

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.*
import com.github.novelrt.interop.property.getNative
import com.github.novelrt.maths.GeoVector2F
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.isDirectory

class Texture internal constructor(handle: Long) : KotlinNativeObject(handle, false, null) {
    val textureFile: Path
        get() = Path(getNative(NovelRT::Nrt_Texture_getTextureFile, StringDeletionBehaviour.NO_DELETE))

    val size: GeoVector2F
        get() = NovelRT.`Nrt_Texture_getSize$Raw`(handle)
            .toObjectHandle<NovelRT.NrtGeoVector2F>()
            .scope(NovelRT.NrtGeoVector2F::destroyStruct, GeoVector2F.Companion::fromHandle)

    fun loadPngAsTexture(file: Path) {
        if (file.isDirectory()) {
            throw IllegalArgumentException("The given path is a directory, expected a file.")
        }

        NovelRT.Nrt_Texture_loadPngAsTexture(handle, file.toNativeString()).handleNrtResult()
    }

    companion object : SingleTrackingContainer<Texture>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<Texture>): Texture = Texture(handle.value)
    }
}
