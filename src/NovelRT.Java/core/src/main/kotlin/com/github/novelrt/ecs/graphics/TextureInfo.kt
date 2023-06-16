package com.github.novelrt.ecs.graphics

import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT

class TextureInfo internal constructor(handle: Long) :
    KotlinNativeObject(handle, true, NovelRT::Nrt_TextureInfo_Destroy) {
}
