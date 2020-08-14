package com.github.novelrt.internal;

public abstract class OwnedHandleObject extends HandleObject {
  private final HandleContainer handleContainer;

  protected OwnedHandleObject(HandleContainer handlerContainer) {
    this.handleContainer = handlerContainer;
    if (handleContainer.isOwned()) {
      NovelCleaner.CLEANER.register(this, handleContainer.getCleaner());
    }
  }

  protected OwnedHandleObject(long handle, boolean isOwned, HandleDeleter deleter) {
    this(HandleContainer.withDeleter(handle, isOwned, deleter));
  }

  @UsedNatively
  private void invalidate() {
    if (handleContainer.isOwned()) {
      throw new UnsupportedOperationException("Cannot invalidate a OwnedHandleObject that owns its handle.");
    }
    handleContainer.invalidate();
    onInvalidation();
  }

  @Override
  protected @UsedNatively long getHandle() {
    if (!handleContainer.isValid()) {
      throw new IllegalStateException("This HandleObject has been invalidated.");
    }
    return handleContainer.getHandle();
  }

  protected void onInvalidation() {
  }
}
