package com.github.novelrt.graphics

import com.github.novelrt.bridge.UsedNatively
import kotlin.reflect.KProperty


class RGBAColour @JvmOverloads constructor(r: Int, g: Int, b: Int, a: Int = 255) {
  @UsedNatively
  constructor(rgba: Int) : this((rgba shr 24) and 0xFF, (rgba shr 16) and 0xFF, (rgba shr 8) and 0xFF, rgba and 0xFF)

  var r: Int by ClampingDelegate(r)
  var g: Int by ClampingDelegate(g)
  var b: Int by ClampingDelegate(b)
  var a: Int by ClampingDelegate(a)

  fun asRGBA(): Int {
    return (r shl 24) or (g shl 16) or (b shl 8) or a
  }

  private class ClampingDelegate(private var value: Int = 0) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
      return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
      this.value = clamp(value)
    }

    private fun clamp(component: Int): Int {
      return component.coerceIn(0..255)
    }

    init {
      value = clamp(value)
    }
  }

  companion object {
    @JvmField
    val WHITE = RGBAColour(255, 255, 255, 255)
  }
}
