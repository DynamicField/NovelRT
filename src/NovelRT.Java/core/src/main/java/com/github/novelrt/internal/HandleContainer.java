package com.github.novelrt.internal;

public abstract class HandleContainer {
  private long handle;
  private final boolean isOwned;

  public HandleContainer(long handle, boolean isOwned) {
    this.handle = handle;
    this.isOwned = isOwned;
  }

  public static HandleContainer withDeleter(long handle, boolean isOwned, HandleDeleter handleDeleter) {
    return new HandleContainer(handle, isOwned) {
      @Override
      protected void delete() {
        handleDeleter.delete(getHandle());
      }
    };
  }

  public final boolean isOwned() {
    return isOwned;
  }

  public final boolean isValid() {
    return handle != 0;
  }

  public final long getHandle() {
    return handle;
  }

  public final void invalidate() {
    handle = 0;
  }

  protected abstract void delete();

  public Runnable getCleaner() {
    return () -> {
      if (isValid() && isOwned) {
        delete();
      }
    };
  }
}
