package com.github.novelrt.maths;

public final class Transform {
  private Vector2 position;
  private Vector2 scale;
  private float rotation;

  public Transform(Vector2 position, Vector2 scale, float rotation) {
    this.position = position;
    this.scale = scale;
    this.rotation = rotation;
  }

  public Transform() {
    this(new Vector2(), new Vector2(), 0f);
  }

  Transform(float[] nativeValues, int offset) {
    position = new Vector2(nativeValues, offset);
    scale = new Vector2(nativeValues, offset + 2);
    rotation = nativeValues[offset + 4];
  }

  public Vector2 getPosition() {
    return position;
  }

  public void setPosition(Vector2 position) {
    this.position = position;
  }

  public Vector2 getScale() {
    return scale;
  }

  public void setScale(Vector2 scale) {
    this.scale = scale;
  }

  public float getRotation() {
    return rotation;
  }

  public void setRotation(float rotation) {
    this.rotation = rotation;
  }

  float[] nativeValues() {
    return new float[] {position.getX(), position.getY(), scale.getY(), scale.getY(), rotation};
  }

  @Override
  public String toString() {
    return "Transform{" +
           "position=" + position +
           ", scale=" + scale +
           ", rotation=" + rotation +
           '}';
  }
}
