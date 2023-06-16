package com.github.novelrt.ecs

import com.github.novelrt.interop.NovelRT
import com.github.novelrt.maths.GeoVector2FStruct
import com.github.novelrt.maths.GeoVector2FStruct.zero
import com.github.novelrt.maths.GeoVector3FStruct
import com.github.novelrt.maths.GeoVector3FStruct.zero
import com.github.novelrt.nativedata.StructPointer

object TransformComponentStruct : DefaultComponentDefinition<TransformComponentStruct>() {
    val positionAndLayer = structField(GeoVector3FStruct)
    val scale = structField(GeoVector2FStruct)
    val rotationInRadians = floatField()

    override val size: Long = finalSize
    override val componentId = NovelRT.Nrt_Components_GetTransformComponentTypeId().toULong()

    override fun zero(st: StructPointer<TransformComponentStruct>) {
        st.positionAndLayer.zero()
        st.scale.zero()
        st.rotationInRadians = 0f
    }
}

val StructPointer<TransformComponentStruct>.positionAndLayer: StructPointer<GeoVector3FStruct>
    get() = get(TransformComponentStruct.positionAndLayer)

val StructPointer<TransformComponentStruct>.scale: StructPointer<GeoVector2FStruct>
    get() = get(TransformComponentStruct.scale)

var StructPointer<TransformComponentStruct>.rotationInRadians: Float
    get() = get(TransformComponentStruct.rotationInRadians)
    set(value) = set(TransformComponentStruct.rotationInRadians, value)
