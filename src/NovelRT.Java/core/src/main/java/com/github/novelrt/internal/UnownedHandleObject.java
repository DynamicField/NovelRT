package com.github.novelrt.internal;

public abstract class UnownedHandleObject extends HandleObject {
  private final long handle;

  protected UnownedHandleObject(long handle) {
    this.handle = handle;
  }

  @Override
  public final long getHandle() {
    return handle;
  }
}
