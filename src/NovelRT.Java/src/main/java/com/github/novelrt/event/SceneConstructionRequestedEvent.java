package com.github.novelrt.event;

public class SceneConstructionRequestedEvent extends Event<SceneConstructionRequestedListener> {
  public SceneConstructionRequestedEvent(long handle) {
    super(handle);
  }

  @Override
  protected native void addSubscription(SceneConstructionRequestedListener listener);

  @Override
  protected native void removeSubscription(SceneConstructionRequestedListener listener);
}
