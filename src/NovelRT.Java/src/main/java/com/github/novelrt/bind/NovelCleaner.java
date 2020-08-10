package com.github.novelrt.bind;

import java.lang.ref.Cleaner;
import java.util.function.LongConsumer;

public final class NovelCleaner {
  private NovelCleaner() {
  }

  public static final Cleaner CLEANER = Cleaner.create();
  public static void registerHandle(Object obj, long handle, LongConsumer deleter) {
    CLEANER.register(obj, () -> deleter.accept(handle));
  }
}
