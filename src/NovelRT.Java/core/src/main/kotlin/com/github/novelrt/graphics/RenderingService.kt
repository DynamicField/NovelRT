package com.github.novelrt.graphics

import com.github.novelrt.TransformData
import com.github.novelrt.TransformData.Companion.toNative
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.interop.*
import java.nio.file.Path

class RenderingService internal constructor(handle: Long, isOwned: Boolean) :
    KotlinNativeObject(handle, isOwned, NovelRT::Nrt_RenderingService_destroy) {

    fun createBasicFillRect(transform: TransformData, colourConfig: RGBAConfig, layer: Int): BasicFillRect {
        return makeOutputPointer(::BasicFillRect, true).resultWith { output ->
            colourConfig.createNative(DisposalMethod.MANUAL).use { nativeColourConfig ->
                NovelRT.Nrt_RenderingService_createBasicFillRect(
                    handle,
                    output,
                    transform.toNative(),
                    layer,
                    nativeColourConfig.handle
                )
            }
        }
    }

    fun createTextRect(
        transform: TransformData,
        colourConfig: RGBAConfig,
        fontSize: Float,
        fontPath: Path,
        layer: Int
    ): TextRect {
        return makeOutputPointer(::TextRect, true).resultWith { output ->
            colourConfig.createNative(DisposalMethod.MANUAL).use { nativeColourConfig ->
                NovelRT.Nrt_RenderingService_createTextRect(
                    handle,
                    output,
                    transform.toNative(),
                    layer,
                    nativeColourConfig.handle,
                    fontSize,
                    fontPath.toNativeString()
                )
            }
        }
    }

    fun getFontSet(fileTarget: Path, fontSize: Float): FontSet {
        return FontSet.makeTrackingOutputPointer().resultWith { output ->
            NovelRT.Nrt_RenderingService_getFontSet(
                handle,
                output,
                fileTarget.toNativeString(),
                fontSize
            )
        }
    }

    fun createImageRectWithNothing(
        transform: TransformData,
        colourTint: RGBAConfig,
        layer: Int
    ): ImageRect {
        return makeOutputPointer(::ImageRect, true).resultWith { output ->
            colourTint.createNative(DisposalMethod.MANUAL).use { nativeColourTint ->
                NovelRT.Nrt_RenderingService_createImageRectWithNothing(
                    handle,
                    output,
                    transform.toNative(),
                    layer,
                    nativeColourTint.handle
                )
            }
        }
    }

    fun beginFrame() = NovelRT.Nrt_RenderingService_beginFrame(handle)
    fun endFrame() = NovelRT.Nrt_RenderingService_endFrame(handle)

    fun createImageRectWithFile(
        transform: TransformData,
        imagePath: Path,
        colourTint: RGBAConfig,
        layer: Int
    ): ImageRect {
        return makeOutputPointer(::ImageRect, true).resultWith { output ->
            colourTint.createNative(DisposalMethod.MANUAL).use { nativeColourTint ->
                NovelRT.Nrt_RenderingService_createImageRectWithFile(
                    handle,
                    output,
                    transform.toNative(),
                    layer,
                    imagePath.toString(),
                    nativeColourTint.handle
                )
            }
        }
    }
}
