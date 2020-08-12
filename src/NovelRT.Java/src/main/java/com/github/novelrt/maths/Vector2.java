package com.github.novelrt.maths;

import java.util.Objects;

public final class Vector2 {
  private final float x;
  private final float y;

  public Vector2(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public Vector2() {
    this(0, 0);
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public Vector2 add(float x, float y) {
    return new Vector2(this.x + x, this.y + y);
  }

  public Vector2 add(Vector2 other) {
    return add(other.x, other.y);
  }

  public Vector2 subtract(float x, float y) {
    return new Vector2(this.x - x, this.y - y);
  }

  public Vector2 subtract(Vector2 other) {
    return subtract(other.x, other.y);
  }

  public Vector2 multiply(float x, float y) {
    return new Vector2(this.x * x, this.y * y);
  }

  public Vector2 multiply(Vector2 other) {
    return multiply(other.x, other.y);
  }

  public Vector2 divide(float x, float y) {
    return new Vector2(this.x / x, this.y / y);
  }

  public Vector2 divide(Vector2 other) {
    return divide(other.x, other.y);
  }

  public Vector2 copy() {
    return new Vector2(x, y);
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

  @Override
  public String toString() {
    return "Vector2{" +
           "x=" + x +
           ", y=" + y +
           '}';
  }
}
