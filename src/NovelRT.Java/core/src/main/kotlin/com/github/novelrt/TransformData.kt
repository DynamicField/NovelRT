package com.github.novelrt

import com.github.novelrt.interop.NovelRT
import com.github.novelrt.maths.GeoVector2F

sealed interface TransformData {
  var position: GeoVector2F
  var scale: GeoVector2F
  var rotation: Float

  companion object {
    internal fun TransformData.toNative(): NovelRT.NrtTransform {
      return if (this is Transform) {
        this.toNative()
      } else {
        NovelRT.NrtTransform().also {
          it.position = position.createNative()
          it.scale = scale.createNative()
          it.rotation = rotation
        }
      }
    }

    fun create(
      position: GeoVector2F = GeoVector2F(),
      scale: GeoVector2F = GeoVector2F(),
      rotation: Float = 0.0f
    ): TransformData {
      return TransformValues(position, scale, rotation)
    }
  }
}
