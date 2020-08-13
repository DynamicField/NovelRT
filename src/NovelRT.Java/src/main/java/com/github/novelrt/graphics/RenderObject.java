package com.github.novelrt.graphics;

import com.github.novelrt.WorldObject;

public class RenderObject extends WorldObject {
  protected RenderObject(long handle, boolean isOwned) {
    super(handle, isOwned);
  }

  public void executeObjectBehaviour() {
    executeObjectBehaviourNative(getHandle());
  }

  private native void executeObjectBehaviourNative(long handle);
}
