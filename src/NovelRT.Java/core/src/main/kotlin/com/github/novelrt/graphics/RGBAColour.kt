package com.github.novelrt.graphics

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult

class RGBAColour(r: Int, g: Int, b: Int, a: Int = 255) {
    val r = r.clampByte()
    val g = g.clampByte()
    val b = b.clampByte()
    val a = a.clampByte()

    private fun Int.clampByte(): Int {
        return when {
            this < 0 -> 0
            this > 255 -> 255
            else -> this
        }
    }

    internal fun createNative(disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED): NativeStruct {
        return NativeStruct(r, g, b, a, disposalMethod)
    }

    override fun toString(): String {
        return "RGBAColour(r=$r, g=$g, b=$b, a=$a)"
    }

    internal class NativeStruct(
        handle: Long,
        owned: Boolean,
        disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
    ) : KotlinNativeObject(handle, owned, NovelRT::Nrt_RGBAColour_destroy, disposalMethod) {
        constructor(r: Int, g: Int, b: Int, a: Int, disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED) :
            this(NovelRT.Nrt_RGBAColour_Create(r, g, b, a), true, disposalMethod)

        var r: Int
            get() = NovelRT.Nrt_RGBAColour_getR(handle)
            set(value) {
                NovelRT.Nrt_RGBAColour_setR(handle, value).handleNrtResult()
            }

        var g: Int
            get() = NovelRT.Nrt_RGBAColour_getG(handle)
            set(value) {
                NovelRT.Nrt_RGBAColour_setG(handle, value).handleNrtResult()
            }

        var b: Int
            get() = NovelRT.Nrt_RGBAColour_getB(handle)
            set(value) {
                NovelRT.Nrt_RGBAColour_setB(handle, value).handleNrtResult()
            }

        var a: Int
            get() = NovelRT.Nrt_RGBAColour_getA(handle)
            set(value) {
                NovelRT.Nrt_RGBAColour_setA(handle, value).handleNrtResult()
            }

        fun createKotlin() = fromHandle(handle)
    }

    companion object {
        internal fun fromHandle(handle: Long): RGBAColour {
            val native = NativeStruct(handle, false)
            return RGBAColour(native.r, native.g, native.b, native.a)
        }
    }
}
