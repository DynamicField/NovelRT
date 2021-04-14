#ifndef NOVELRT_EVENTBINDINGS_H
#define NOVELRT_EVENTBINDINGS_H

#include <NovelRT.h>
#include "NovelRT/Java/Types.h"
#include "NovelRT/Java/Handles.h"

namespace NovelRT::Java::Bindings {
  template<typename T>
  struct EventToEventHandler;

  template<typename... Args>
  struct EventToEventHandler<Utilities::Event<Args...>> {
    using Type = Utilities::EventHandler<Args...>;
  };

  template<typename T> using EventToEventHandlerType = typename EventToEventHandler<T>::Type;

  template<typename Event>
  struct ExtractEventHandlerFunction;

  template<typename... Args>
  struct ExtractEventHandlerFunction<Utilities::Event<Args...>> {
    using Type = void(Args...);
  };

  template<typename Function, typename... Params>
  struct PrependFunctionParameters;

  template<typename R, typename... CurrentParams, typename... PrependedParams>
  struct PrependFunctionParameters<R(CurrentParams...), PrependedParams...> {
    using Type = R(PrependedParams..., CurrentParams...);
  };

  // Example:
  // EventHandlerProxy<SomeListener, Event<int>> results in
  // void(jni::JNIEnv&, jni::Object<Listener>&, int)
  template<typename Listener, typename NovelEvent>
  using EventHandlerProxy = std::function<
    typename PrependFunctionParameters<
      typename ExtractEventHandlerFunction<NovelEvent>::Type,
      jni::JNIEnv&,
      jni::Object<Listener>&
    >::Type
  >;

  template<typename Listener, typename NovelEvent, typename JavaEvent>
  void bindEvent(jni::JNIEnv& env, const jni::Class<JavaEvent>& eventClass,
                 const EventHandlerProxy<Listener, NovelEvent>& proxy) {
    using AssociatedEventHandler = EventToEventHandlerType<NovelEvent>; // The NovelRT Utilities::EventHandler<>

    static std::unordered_map<jni::jint, AssociatedEventHandler> hashToEventHandler;

    auto&& addSubscription = [proxy]
      (jni::JNIEnv& env, jni::Object<JavaEvent>& self, jni::Object<Listener>& listener, jni::jint listenerHash) {
      auto* event = Handles::get<NovelEvent>(env, *self);

      auto eventHandler = createEventHandler<Listener, NovelEvent>(env, listener, proxy, *event);
      *event += eventHandler;
      hashToEventHandler[listenerHash] = eventHandler;
    };

    auto&& removeSubscription = [proxy]
      (jni::JNIEnv& env, jni::Object<JavaEvent>& self, jni::Object<Listener>&, jni::jint listenerHash) {
      auto* event = Handles::get<NovelEvent>(env, *self);

      auto eventHandler = hashToEventHandler[listenerHash];
      *event -= eventHandler;
      hashToEventHandler.erase(listenerHash);
    };

    jni::RegisterNatives(env, *eventClass,
                         jni::MakeNativeMethod("addSubscription", addSubscription),
                         jni::MakeNativeMethod("removeSubscription", removeSubscription));
  }

  // The Event argument is used to deduct the Args parameter pack.
  template<typename Listener, typename NovelEvent, typename... Args>
  auto createEventHandler(jni::JNIEnv& env,
                          jni::Object<Listener>& listener,
                          const EventHandlerProxy<Listener, NovelEvent>& proxy,
                          Utilities::Event<Args...>)
  -> Utilities::EventHandler<Args...> {
    std::shared_ptr<jni::jobject> sharedRef = jni::NewGlobalRef(env, listener.get());

    return Utilities::EventHandler<Args...>([&env, sharedRef, proxy](Args... args) {
      auto listenerObject = jni::Object<Listener>(sharedRef.get());
      proxy(env, listenerObject, args...);
    });
  }
}

#endif //NOVELRT_EVENTBINDINGS_H
