package com.github.novelrt.bridge.handle

import com.github.novelrt.bridge.UsedNatively

abstract class OwnedHandleObject(handle: Handle, deleter: (Handle) -> Unit, isOwned: Boolean = true) : HandleObject() {
  private val handleContainer = HandleContainer(handle, deleter, isOwned)

  private fun invalidate() {
    check(handleContainer.isOwned) { "Cannot invalidate a OwnedHandleObject that owns its handle." }
    handleContainer.invalidate()
    onInvalidation()
  }

  @UsedNatively
  override val handle: Long
    get() {
      check(handleContainer.isValid) { "This HandleObject has been invalidated." }
      return handleContainer.handle
    }

  protected open fun onInvalidation() {}

  init {
    if (handleContainer.isOwned) {
      novelCleaner.register(this, handleContainer.cleaner)
    }
  }

  private class HandleContainer(var handle: Handle, private val deleter: (Handle) -> Unit, val isOwned: Boolean) {
    val isValid: Boolean get() = handle != 0L

    fun invalidate() {
      handle = 0
    }

    private fun delete() {
      if (handle != 0L) {
        deleter(handle)
      }
    }

    private fun clean() {
      if (isValid && isOwned) {
        delete()
      }
    }

    val cleaner: () -> Unit = ::clean
  }
}
