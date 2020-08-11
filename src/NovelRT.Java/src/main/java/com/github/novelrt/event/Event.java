package com.github.novelrt.event;

import com.github.novelrt.internal.HandleDeleter;
import com.github.novelrt.internal.HandleObject;
import com.github.novelrt.internal.UsedNatively;

import java.util.*;

public abstract class Event<T extends EventListener> extends HandleObject {
  private final Set<T> listeners = new LinkedHashSet<>();

  protected Event(long handle) {
    super(handle, false, HandleDeleter.NONE);
  }

  // TODO: Use Guava's ImmutableSet<T> because UGH unmodifiableSet...
  public Set<T> getListeners() {
    return Collections.unmodifiableSet(listeners);
  }

  public void subscribe(T listener) {
    if (listeners.contains(listener)) {
      return;
    }

    addSubscription(listener);
    listeners.add(listener);
  }

  public void unsubscribe(T listener) {
    if (!listeners.contains(listener)) {
      return;
    }

    removeSubscription(listener);
    listeners.remove(listener);
  }

  @UsedNatively
  private void onRemoval(T listener) {
    listeners.remove(listener);
  }

  protected abstract void addSubscription(T listener);
  protected abstract void removeSubscription(T listener);
}
