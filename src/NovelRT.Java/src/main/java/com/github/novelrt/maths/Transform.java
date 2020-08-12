package com.github.novelrt.maths;

import com.github.novelrt.internal.HandleDeleter;
import com.github.novelrt.internal.HandleObject;

public final class Transform extends HandleObject {
  public Transform(long handle) {
    super(handle, false, HandleDeleter.NONE);
  }

  public native Vector2 getPosition();

  public native void setPosition(Vector2 position);

  public native Vector2 getScale();

  public native void setScale(Vector2 scale);

  public native float getRotation();

  public native void setRotation(float rotation);

  @Override
  public String toString() {
    return "Transform{" +
           "position=" + getPosition() +
           ", scale=" + getScale() +
           ", rotation=" + getPosition() +
           '}';
  }
}
