package com.github.novelrt.graphics

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult

class RGBAConfig(r: Int, g: Int, b: Int, a: Int = 255) {
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
        return "RGBAConfig(r=$r, g=$g, b=$b, a=$a)"
    }

    internal class NativeStruct(
        handle: Long,
        owned: Boolean,
        disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
    ) : KotlinNativeObject(handle, owned, NovelRT::Nrt_RGBAConfig_destroy, disposalMethod) {
        constructor(r: Int, g: Int, b: Int, a: Int, disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED) :
            this(NovelRT.Nrt_RGBAConfig_Create(r, g, b, a), true, disposalMethod)

        var r: Int
            get() = NovelRT.Nrt_RGBAConfig_getR(handle)
            set(value) {
                NovelRT.Nrt_RGBAConfig_setR(handle, value).handleNrtResult()
            }

        var g: Int
            get() = NovelRT.Nrt_RGBAConfig_getG(handle)
            set(value) {
                NovelRT.Nrt_RGBAConfig_setG(handle, value).handleNrtResult()
            }

        var b: Int
            get() = NovelRT.Nrt_RGBAConfig_getB(handle)
            set(value) {
                NovelRT.Nrt_RGBAConfig_setB(handle, value).handleNrtResult()
            }

        var a: Int
            get() = NovelRT.Nrt_RGBAConfig_getA(handle)
            set(value) {
                NovelRT.Nrt_RGBAConfig_setA(handle, value).handleNrtResult()
            }

        fun createKotlin() = fromHandle(handle)
    }

    companion object {
        internal fun fromHandle(handle: Long): RGBAConfig {
            val native = NativeStruct(handle, false)
            return RGBAConfig(native.r, native.g, native.b, native.a)
        }
    }
}
