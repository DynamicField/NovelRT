package com.github.novelrt.maths

import com.github.novelrt.nativedata.StructDefinition
import com.github.novelrt.nativedata.StructPointer

object GeoVector3FStruct : StructDefinition<GeoVector3FStruct>() {
    val x = floatField()
    val y = floatField()
    val z = floatField()

    override val size: Long = finalSize
    override fun zero(st: StructPointer<GeoVector3FStruct>) {
        st.x = 0f
        st.y = 0f
        st.z = 0f
    }
}

var StructPointer<GeoVector3FStruct>.x: Float
    get() = get(GeoVector3FStruct.x)
    set(value) = set(GeoVector3FStruct.x, value)

var StructPointer<GeoVector3FStruct>.y: Float
    get() = get(GeoVector3FStruct.y)
    set(value) = set(GeoVector3FStruct.y, value)

var StructPointer<GeoVector3FStruct>.z: Float
    get() = get(GeoVector3FStruct.z)
    set(value) = set(GeoVector3FStruct.z, value)

fun StructPointer<GeoVector3FStruct>.set(vector3F: GeoVector3F) {
    set(GeoVector3FStruct.x, vector3F.x)
    set(GeoVector3FStruct.y, vector3F.y)
    set(GeoVector3FStruct.z, vector3F.z)
}

fun StructPointer<GeoVector3FStruct>.set(x: Float, y: Float, z: Float) {
    set(GeoVector3FStruct.x, x)
    set(GeoVector3FStruct.y, y)
    set(GeoVector3FStruct.z, z)
}
