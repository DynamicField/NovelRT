#ifndef NOVELRT_JAVAEVENTHANDLER_H
#define NOVELRT_JAVAEVENTHANDLER_H

#include <NovelRT.h>
#include <jni/jni.hpp>
#include "Handles.h"

namespace NovelRT::Java {
  template<typename Listener, typename... Args> using ListenerCaller =
  std::function<void(jni::Object<Listener>& listener, Args...)>;
/*
  namespace {
    template<typename Listener, typename... Args>
    class ListenerCallerHandler {
    private:
      jni::JNIEnv& _env;
      jni::Global<const jni::Object<Listener>> _listener;
      jni::Global<const jni::Object<Types::Event>> _event;
      const ListenerCaller<Listener, Args...> _listenerCaller;
      bool _owns = false;
    public:
      ListenerCallerHandler(jni::JNIEnv& env,
                            const jni::Object<Listener>& listener,
                            const jni::Object<Types::Event>& event,
                            const ListenerCaller<Listener, Args...>& listenerCaller) :
              _env(env),
              _listener(jni::NewGlobal(env, listener)),
              _event(jni::NewGlobal(env, event)),
              _listenerCaller(listenerCaller) {
      }

      ListenerCallerHandler(const ListenerCallerHandler& other) noexcept :
      _env(other._env), _listener(other._listener), _event(other._event),
      _listenerCaller(other._listenerCaller) {
        other._owns = false;
      };
      ListenerCallerHandler& operator=(const ListenerCallerHandler& other) noexcept {
        if (&other == this) {
          return *this;
        }

        _env = other._env;
        _listener = other._listener;
        _event = other._event;
        _listenerCaller = other._listenerCaller;

        other._owns = false;

        return *this;
      }

      ListenerCallerHandler(ListenerCallerHandler&& other) noexcept :
              _env(other._env),
              _listener(std::move(other._listener)), _event(std::move(other._event)),
              _listenerCaller(std::move(other._listenerCaller)) {
        other._owns = true;
      }

      ListenerCallerHandler& operator=(ListenerCallerHandler&& other) noexcept {
        if (&other == this) {
          return *this;
        }

        _env = std::move(other._env);
        _listener = std::move(other._listener);
        _event = std::move(other._event);
        _listenerCaller = std::move(other._listenerCaller);

        other._owns = true;

        return *this;
      }

      ~ListenerCallerHandler() {
        if (!_owns) {
          _event.Call(_env, Methods->Event_onRemoval, jni::Object<>{_listener.get()});
        }
      }

      void operator()(Args... args) {
        _listenerCaller(_listener, args...);
      }
    };
  }

  template<typename Listener, typename... Args>
  Utilities::EventHandler<Args...> createJavaEventHandler(jni::JNIEnv& env,
                                                          const jni::Object<Listener>& listener,
                                                          const jni::Object<Types::Event>& event,
                                                          const ListenerCaller<Listener, Args...>& listenerCaller) {
    ListenerCallerHandler eventHandler(env, listener, event, listenerCaller);
    return Utilities::EventHandler<Args...>(std::move(eventHandler));
  }
  */
}

#endif //NOVELRT_JAVAEVENTHANDLER_H
