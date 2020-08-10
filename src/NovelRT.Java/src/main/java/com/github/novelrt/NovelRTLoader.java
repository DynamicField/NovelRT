package com.github.novelrt;

public final class NovelRTLoader {
  private NovelRTLoader() {}

  private static final String DEFAULT_LIBRARY_NAME = "Engine";
  private static volatile boolean hasBeenLoaded;

  public static void load() {
    load(DEFAULT_LIBRARY_NAME);
  }

  public static synchronized void load(String libraryName) {
    if (!hasBeenLoaded) {
      System.loadLibrary(libraryName);
      hasBeenLoaded = true;
    }
  }
}
