package com.github.novelrt;

import com.github.novelrt.event.SceneConstructionRequestedEvent;
import com.github.novelrt.graphics.RenderObject;
import com.github.novelrt.internal.OwnedHandleObject;

import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public final class NovelRunner extends OwnedHandleObject {
  private static final AtomicInteger nextDisplayNumber = new AtomicInteger();

  static {
    NovelRTLoader.load();
  }

  private final SceneConstructionRequestedEvent sceneConstructionRequestedEvent;

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
    this.sceneConstructionRequestedEvent = createSceneConstructionRequestedEvent();
  }

  public void run() {
    runNovel();
  }

  public SceneConstructionRequestedEvent onSceneConstructionRequested() {
    return sceneConstructionRequestedEvent;
  }

  public native RenderObject createSomeRect();

  private native int runNovel();

  private static native long createRunner(int displayNumber, String windowTitle, int targetFrameRate, boolean transparency,
                                          String resourcesDirectory);

  private static native void deleteRunner(long handle);

  private native SceneConstructionRequestedEvent createSceneConstructionRequestedEvent();
}
