#ifndef NOVELRT_EVENTBINDINGS_H
#define NOVELRT_EVENTBINDINGS_H

#include <NovelRT.h>
#include "NovelRT/Java/Registries.h"
#include "NovelRT/Java/Handles.h"

namespace NovelRT::Java::Bindings {
  template<typename Event>
  struct ExtractEventHandlerFunction;

  template<typename... Args>
  struct ExtractEventHandlerFunction<NovelRT::Utilities::Event<Args...>> {
    using Value = void(Args...);
  };

  template<typename Function, typename... Params>
  struct PrependFunctionParameters;

  template<typename R, typename... CurrentParams, typename... PrependedParams>
  struct PrependFunctionParameters<R(CurrentParams...), PrependedParams...> {
    using Value = R(PrependedParams..., CurrentParams...);
  };

  // Example:
  // EventHandlerProxy<SomeListener, Event<int>> results in
  // void(jni::JNIEnv&, jni::Object<Listener>&, int)
  template<typename Listener, typename NovelEvent>
  using EventHandlerProxy = std::function<
    typename PrependFunctionParameters<
      typename ExtractEventHandlerFunction<NovelEvent>::Value,
      jni::JNIEnv&,
      jni::Object<Listener>&
    >::Value
  >;

  template<typename Listener, typename NovelEvent, typename JavaEvent>
  void bindEvent(jni::JNIEnv& env, const jni::Class<JavaEvent>* eventClass,
                 const EventHandlerProxy<Listener, NovelEvent>& proxy) {
    auto&& addSubscription = [proxy]
      (jni::JNIEnv& env, jni::Object<JavaEvent>& self, jni::Object<Listener>& listener) {
      auto* event = Handles::get<NovelEvent>(env, *self);

      *event += createEventHandler<Listener, NovelEvent>(env, listener, proxy, *event);
    };

    jni::RegisterNatives(env, **eventClass,
                         jni::MakeNativeMethod("addSubscription", std::function(addSubscription))
      //, TODO: jni::MakeNativeMethod("removeSubscription", std::function(removeSubscription))
    );
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
