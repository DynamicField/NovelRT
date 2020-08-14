package com.github.novelrt.internal;

import java.lang.ref.Cleaner;

public final class NovelCleaner {
  private NovelCleaner() {
  }

  public static final Cleaner CLEANER = Cleaner.create();
}
