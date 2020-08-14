package com.github.novelrt;

import com.github.novelrt.internal.OwnedHandleObject;
import com.github.novelrt.maths.Transform;

public class WorldObject extends OwnedHandleObject {
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
