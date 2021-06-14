package com.github.novelrt

import com.github.novelrt.fumocement.Pointers
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.RawHandle
import com.github.novelrt.maths.GeoVector2F

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
        nativeTransform = RawHandle(handle)
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
        nativeTransform = RawHandle(handle)
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
        nativeTransform = RawHandle(handle)
      }
    }

  abstract var nativeTransform: RawHandle<NovelRT.NrtTransform>
  private var editScope = EditScope(RawHandle(Pointers.NULLPTR))

  fun edit(action: TransformData.() -> Unit) {
    val transform = nativeTransform
    transform.scope(NovelRT.NrtTransform::destroyStruct) {
      try {
        editScope.prepare(transform)
        action(editScope)
        editScope.applyChanges()
      } finally {
        editScope.clear()
      }
      nativeTransform = transform
    }
  }

  fun toNative(): NovelRT.NrtTransform = nativeTransform.make(NovelRT::NrtTransform, true)

  class EditScope(private var transform: RawHandle<NovelRT.NrtTransform>) : TransformData {
    private var currentPosition: GeoVector2F? = null
    private var currentScale: GeoVector2F? = null
    private var currentRotation: Float = Float.NaN

    override var position: GeoVector2F
      get() {
        return if (currentPosition == null) {
          val pos = GeoVector2F.fromHandle(NovelRT.NrtTransform.getPositionRaw(transform.value))
          currentScale = pos
          pos
        } else {
          currentScale!!
        }
      }
      set(value) {
        currentPosition = value
      }
    override var scale: GeoVector2F
      get() {
        return if (currentScale == null) {
          val pos = GeoVector2F.fromHandle(NovelRT.NrtTransform.getScaleRaw(transform.value))
          currentScale = pos
          pos
        } else {
          currentScale!!
        }
      }
      set(value) {
        currentScale = value
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
      val position = currentPosition
      val scale = currentScale
      val rotation = currentRotation
      if (position != null) {
        val positionHandle = NovelRT.NrtTransform.getPositionRaw(transform.value)
        position.overwriteNative(positionHandle)
      }
      if (scale != null) {
        val scaleHandle = NovelRT.NrtTransform.getScaleRaw(transform.value)
        scale.overwriteNative(scaleHandle)
      }
      if (!rotation.isNaN()) {
        NovelRT.NrtTransform.setRotationRaw(transform.value, rotation)
      }
    }

    fun prepare(handle: RawHandle<NovelRT.NrtTransform>) {
      if (!transform.isNullPtr()) {
        throw IllegalStateException("This transform scope is already in use.")
      }
      transform = handle
      clearCurrentValues()
    }

    fun clear() {
      clearCurrentValues()
      transform = RawHandle(Pointers.NULLPTR)
    }

    private fun clearCurrentValues() {
      currentPosition = null
      currentScale = null
      currentRotation = Float.NaN
    }
  }
}
