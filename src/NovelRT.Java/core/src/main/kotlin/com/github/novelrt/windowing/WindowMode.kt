package com.github.novelrt.windowing

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

enum class WindowMode {
  Windowed,
  Borderless,
  FullScreen;

  @GenerateNativeType
  private val nativeValue: Int = ordinal
}
