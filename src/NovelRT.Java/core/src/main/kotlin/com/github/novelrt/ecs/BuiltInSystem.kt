package com.github.novelrt.ecs

import com.github.novelrt.interop.KotlinNativeObject

/**
 * A system that is provided by NovelRT.
 */
abstract class BuiltInSystem internal constructor(handle: Long) : KotlinNativeObject(handle, false, {})
