package com.github.novelrt

import com.github.novelrt.maths.GeoVector2F

internal data class TransformValues(
  override var position: GeoVector2F = GeoVector2F(),
  override var scale: GeoVector2F = GeoVector2F(),
  override var rotation: Float = 0.0f
) : TransformData
