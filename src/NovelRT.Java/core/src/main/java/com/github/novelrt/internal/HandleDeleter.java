package com.github.novelrt.internal;

public interface HandleDeleter {
  HandleDeleter NONE = handle -> {};

  void delete(long handle);
}
