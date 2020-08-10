package com.github.novelrt;

import com.github.novelrt.bind.HandleObject;
import com.github.novelrt.bind.NativeRead;
import com.github.novelrt.bind.NovelCleaner;

import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public final class NovelRunner extends HandleObject {
  private static final AtomicInteger nextDisplayNumber = new AtomicInteger();

  static {
    NovelRTLoader.load();
  }

  public NovelRunner() {
    super(
      createRunner(
        nextDisplayNumber.getAndIncrement(),
        "NovelRT",
        0,
        false,
        Paths.get("").resolve("Resources").toString()
      ),
      true, NovelRunner::deleteRunner
    );
  }

  private static native long createRunner(int displayNumber, String windowTitle, int targetFrameRate, boolean transparency,
                                          String resourcesDirectory);

  private static native void deleteRunner(long handle);

  public void run() {
    runNovel();
  }

  private native int runNovel();
}
