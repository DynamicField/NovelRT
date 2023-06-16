package com.github.novelrt.maths

import com.github.novelrt.interop.NovelRT

data class GeoVector3F(val x: Float = 0f, val y: Float = 0f, val z: Float = 0f) {
    fun plus(x: Float, y: Float, z: Float): GeoVector3F = GeoVector3F(this.x + x, this.y + y, this.z + z)
    operator fun plus(other: GeoVector3F): GeoVector3F = plus(other.x, other.y, other.z)

    fun minus(x: Float, y: Float, z: Float): GeoVector3F = GeoVector3F(this.x - x, this.y - y, this.z - z)
    operator fun minus(other: GeoVector3F): GeoVector3F = minus(other.x, other.y, other.z)

    fun times(x: Float, y: Float, z: Float): GeoVector3F = GeoVector3F(this.x * x, this.y * y, this.z * z)
    operator fun times(other: GeoVector3F): GeoVector3F = times(other.x, other.y, other.z)

    fun div(x: Float, y: Float, z: Float): GeoVector3F = GeoVector3F(this.x / x, this.y / y, this.z / z)
    operator fun div(other: GeoVector3F): GeoVector3F = div(other.x, other.y, other.z)

    companion object {
        val ZERO = GeoVector3F(0f, 0f, 0f)

        internal fun NovelRT.NrtGeoVector2F.Pointer.createKotlin(): GeoVector3F = GeoVector3F(x, y)
    }
}
