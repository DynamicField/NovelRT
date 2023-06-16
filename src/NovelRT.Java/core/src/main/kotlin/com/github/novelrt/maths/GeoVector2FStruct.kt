package com.github.novelrt.maths

import com.github.novelrt.nativedata.StructDefinition
import com.github.novelrt.nativedata.StructPointer

object GeoVector2FStruct : StructDefinition<GeoVector2FStruct>() {
    val x = floatField()
    val y = floatField()

    override val size: Long = finalSize
    override fun zero(st: StructPointer<GeoVector2FStruct>) {
        st.x = 0f
        st.y = 0f
    }
}

var StructPointer<GeoVector2FStruct>.x: Float
    get() = get(GeoVector2FStruct.x)
    set(value) = set(GeoVector2FStruct.x, value)

var StructPointer<GeoVector2FStruct>.y: Float
    get() = get(GeoVector2FStruct.y)
    set(value) = set(GeoVector2FStruct.y, value)

fun StructPointer<GeoVector2FStruct>.set(vector2F: GeoVector2F) {
    set(GeoVector2FStruct.x, vector2F.x)
    set(GeoVector2FStruct.y, vector2F.y)
}

fun StructPointer<GeoVector2FStruct>.set(x: Float, y: Float) {
    set(GeoVector2FStruct.x, x)
    set(GeoVector2FStruct.y, y)
}
