package com.github.novelrt.internal;

public abstract class HandleObject {
  private final HandleContainer handleContainer;

  protected HandleObject(long handle, boolean isOwned, HandleDeleter deleter) {
    this(new HandleContainer(handle, isOwned) {
      @Override
      protected void delete() {
        deleter.delete(this.getHandle());
      }
    });
  }

  protected HandleObject(HandleContainer container) {
    this.handleContainer = container;
    if (handleContainer.isOwned) {
      NovelCleaner.CLEANER.register(this, handleContainer.getCleaner());
    }
  }

  @UsedNatively
  private void invalidate() {
    if (handleContainer.isOwned) {
      throw new UnsupportedOperationException("Cannot invalidate a HandleObject that owns its handle.");
    }
    handleContainer.handle = 0;
    onInvalidation();
  }

  protected void onInvalidation() {}

  @UsedNatively
  protected final long getHandle() {
    return handleContainer.handle;
  }

  protected final boolean isOwned() {
    return handleContainer.isOwned;
  }

  protected static abstract class HandleContainer {
    private long handle;
    private final boolean isOwned;

    public HandleContainer(long handle, boolean isOwned) {
      this.handle = handle;
      this.isOwned = isOwned;
    }

    public final boolean isValid() {
      return handle != 0;
    }

    public final long getHandle() {
      return handle;
    }

    public final boolean isOwned() {
      return isOwned;
    }

    protected abstract void delete();

    private Runnable getCleaner() {
      return () -> {
        if (isValid() && isOwned) {
          delete();
        }
      };
    }
  }
}
