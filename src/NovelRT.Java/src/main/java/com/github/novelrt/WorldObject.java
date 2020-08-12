package com.github.novelrt;

import com.github.novelrt.internal.HandleObject;
import com.github.novelrt.maths.Transform;

public class WorldObject extends HandleObject {
  protected WorldObject(long handle, boolean isOwned) {
    super(handle, isOwned, WorldObject::deleteWorldObject);
  }

  public static native void deleteWorldObject(long handle);

  public native Transform getTransform();

  public native int getLayer();
  public native void setLayer(int layer);

  public native boolean isActive();
  public native void setActive(boolean active);
}
