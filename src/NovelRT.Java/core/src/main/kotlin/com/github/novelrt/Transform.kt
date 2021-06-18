package com.github.novelrt

import com.github.novelrt.fumocement.Pointers
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.maths.GeoVector2F
import java.util.*

abstract class Transform internal constructor() : TransformData {
    override var position: GeoVector2F
        get() {
            return nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                val positionHandle = NovelRT.NrtTransform.getPositionRaw(handle)
                GeoVector2F.fromHandle(positionHandle)
            }
        }
        set(value) {
            nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                val positionHandle = NovelRT.NrtTransform.getPositionRaw(handle)
                value.overwriteNative(positionHandle)
                nativeTransform = ObjectHandle(handle)
            }
        }

    override var scale: GeoVector2F
        get() {
            return nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                val positionHandle = NovelRT.NrtTransform.getScaleRaw(handle)
                GeoVector2F.fromHandle(positionHandle)
            }
        }
        set(value) {
            nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                val positionHandle = NovelRT.NrtTransform.getScaleRaw(handle)
                value.overwriteNative(positionHandle)
                nativeTransform = ObjectHandle(handle)
            }
        }

    override var rotation: Float
        get() {
            return nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                NovelRT.NrtTransform.getRotationRaw(handle)
            }
        }
        set(value) {
            nativeTransform.scope(NovelRT.NrtTransform::destroyStruct) { handle ->
                NovelRT.NrtTransform.setRotationRaw(handle, value)
                nativeTransform = ObjectHandle(handle)
            }
        }

    abstract var nativeTransform: ObjectHandle<NovelRT.NrtTransform>
    private var editScope = EditScope(ObjectHandle(Pointers.NULLPTR))

    fun edit(action: EditScopeAction) {
        val transform = nativeTransform
        transform.scope(NovelRT.NrtTransform::destroyStruct) {
            try {
                editScope.prepare(transform)
                action.run { editScope.invoke() }
                editScope.applyChanges()
            } finally {
                editScope.clear()
            }
            nativeTransform = transform
        }
    }

    fun interface EditScopeAction
    {
        operator fun TransformData.invoke()
    }

    fun toNative(): NovelRT.NrtTransform = nativeTransform.make(NovelRT::NrtTransform, true)

    class EditScope(private var transform: ObjectHandle<NovelRT.NrtTransform>) : TransformData {
        private var currentPositionX: Float = Float.NaN
        private var currentPositionY: Float = Float.NaN
        private var currentScaleX: Float = Float.NaN
        private var currentScaleY: Float = Float.NaN
        private var currentRotation: Float = Float.NaN

        override var position: GeoVector2F
            get() {
                if (currentPositionX.isNaN() || currentPositionY.isNaN()) {
                    val position = NovelRT.NrtTransform.getPositionRaw(transform.value)
                    currentPositionX = NovelRT.NrtGeoVector2F.getXRaw(position)
                    currentPositionY = NovelRT.NrtGeoVector2F.getYRaw(position)
                }
                return GeoVector2F(currentPositionX, currentPositionY)
            }
            set(value) {
                // TODO: checks
                currentPositionX = value.x
                currentPositionY = value.y
            }
        override var scale: GeoVector2F
            get() {
                if (currentScaleX.isNaN() || currentScaleY.isNaN()) {
                    val scale = NovelRT.NrtTransform.getScaleRaw(transform.value)
                    currentScaleX = NovelRT.NrtGeoVector2F.getXRaw(scale)
                    currentScaleY = NovelRT.NrtGeoVector2F.getYRaw(scale)
                }
                return GeoVector2F(currentScaleX, currentScaleY)
            }
            set(value) { // TODO: checks
                currentScaleX = value.x
                currentScaleY = value.y
            }
        override var rotation: Float
            get() {
                return if (currentRotation.isNaN()) {
                    val rotation = NovelRT.NrtTransform.getRotationRaw(transform.value)
                    currentRotation = rotation
                    rotation
                } else {
                    currentRotation
                }
            }
            set(value) {
                if (value.isNaN()) {
                    throw IllegalArgumentException("The given rotation is NaN.")
                }
                currentRotation = value
            }

        fun applyChanges() {
            val rotation = currentRotation
            if (!currentPositionX.isNaN()) {
                val positionHandle = NovelRT.NrtTransform.getPositionRaw(transform.value)
                NovelRT.NrtGeoVector2F.setXRaw(positionHandle, currentPositionX)
                NovelRT.NrtGeoVector2F.setYRaw(positionHandle, currentPositionY)
            }
            if (!currentScaleX.isNaN()) {
                val scaleHandle = NovelRT.NrtTransform.getScaleRaw(transform.value)
                NovelRT.NrtGeoVector2F.setXRaw(scaleHandle, currentScaleX)
                NovelRT.NrtGeoVector2F.setYRaw(scaleHandle, currentScaleX)
            }
            if (!rotation.isNaN()) {
                NovelRT.NrtTransform.setRotationRaw(transform.value, rotation)
            }
        }

        fun prepare(handle: ObjectHandle<NovelRT.NrtTransform>) {
            if (!transform.isNullPtr()) {
                throw IllegalStateException("This transform scope is already in use.")
            }
            transform = handle
            clearCurrentValues()
        }

        fun clear() {
            clearCurrentValues()
            transform = ObjectHandle(Pointers.NULLPTR)
        }

        private fun clearCurrentValues() {
            currentPositionX = Float.NaN
            currentPositionY = Float.NaN
            currentScaleX = Float.NaN
            currentScaleY = Float.NaN
            currentRotation = Float.NaN
        }
    }
}
