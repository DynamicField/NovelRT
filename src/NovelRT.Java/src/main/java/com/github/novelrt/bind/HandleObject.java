package com.github.novelrt.bind;

import java.util.function.LongConsumer;

public abstract class HandleObject {
  protected final @NativeRead long handle;

  protected HandleObject(long handle, boolean isOwned, LongConsumer deleter) {
    this.handle = handle;
    if (isOwned) {
      NovelCleaner.registerHandle(this, handle, deleter);
    }
  }
}
