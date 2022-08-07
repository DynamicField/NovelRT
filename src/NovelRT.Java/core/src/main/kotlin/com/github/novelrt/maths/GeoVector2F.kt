package com.github.novelrt.maths

import com.github.novelrt.interop.NovelRT

data class GeoVector2F(val x: Float = 0f, val y: Float = 0f) {
    fun plus(x: Float, y: Float): GeoVector2F = GeoVector2F(this.x + x, this.y + y)
    operator fun plus(other: GeoVector2F): GeoVector2F = plus(other.x, other.y)

    fun minus(x: Float, y: Float): GeoVector2F = GeoVector2F(this.x - x, this.y - y)
    operator fun minus(other: GeoVector2F): GeoVector2F = minus(other.x, other.y)

    fun times(x: Float, y: Float): GeoVector2F = GeoVector2F(this.x * x, this.y * y)
    operator fun times(other: GeoVector2F): GeoVector2F = times(other.x, other.y)

    fun div(x: Float, y: Float): GeoVector2F = GeoVector2F(this.x / x, this.y / y)
    operator fun div(other: GeoVector2F): GeoVector2F = div(other.x, other.y)

    companion object {
        val ZERO = GeoVector2F(0f, 0f)

        internal fun NovelRT.NrtGeoVector2F.Pointer.createKotlin(): GeoVector2F = GeoVector2F(x, y)
    }
}
