package com.github.novelrt.maths;

public final class RGBAColour {
  private int r;
  private int g;
  private int b;
  private int a;

  public RGBAColour(int r, int g, int b, int a) {
    this.r = clamp(r);
    this.g = clamp(g);
    this.b = clamp(b);
    this.a = clamp(a);
  }

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = clamp(r);
  }

  public int getG() {
    return g;
  }

  public void setG(int g) {
    this.g = clamp(g);
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = clamp(b);
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = clamp(a);
  }

  private int clamp(int component) {
    return Math.max(0, Math.min(component, 255));
  }

  int asInt() {
    return (r << 6) + (g << 4) + (b << 2) + a;
  }
}
