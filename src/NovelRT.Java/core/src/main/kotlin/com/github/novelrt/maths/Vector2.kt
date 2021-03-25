package com.github.novelrt.maths

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

data class Vector2 @GenerateNativeType constructor(
    @field:GenerateNativeType val x: Float = 0f,
    @field:GenerateNativeType val y: Float = 0f
) {
  fun plus(x: Float, y: Float): Vector2 {
    return Vector2(this.x + x, this.y + y)
  }

  operator fun plus(other: Vector2): Vector2 {
    return plus(other.x, other.y)
  }

  fun minus(x: Float, y: Float): Vector2 {
    return Vector2(this.x - x, this.y - y)
  }

  operator fun minus(other: Vector2): Vector2 {
    return minus(other.x, other.y)
  }

  fun times(x: Float, y: Float): Vector2 {
    return Vector2(this.x * x, this.y * y)
  }

  operator fun times(other: Vector2): Vector2 {
    return times(other.x, other.y)
  }

  fun div(x: Float, y: Float): Vector2 {
    return Vector2(this.x / x, this.y / y)
  }

  operator fun div(other: Vector2): Vector2 {
    return div(other.x, other.y)
  }
}
