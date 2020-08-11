package com.github.novelrt.maths;

import java.util.Objects;

public final class Vector2 {
  private float x;
  private float y;

  public Vector2(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public Vector2() {
    this(0, 0);
  }

  public Vector2(float[] nativeValues, int offset) {
    this(nativeValues[offset], nativeValues[offset + 1]);
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public Vector2 add(Vector2 other) {
    return new Vector2(this.x + other.x, this.y + other.y);
  }

  public Vector2 add(int x, int y) {
    return new Vector2(this.x + x, this.y + y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vector2 vector2 = (Vector2) o;
    return Float.compare(vector2.x, x) == 0 &&
           Float.compare(vector2.y, y) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  float[] nativeValues() {
    return new float[] {x ,y};
  }

  @Override
  public String toString() {
    return "Vector2{" +
           "x=" + x +
           ", y=" + y +
           '}';
  }
}
