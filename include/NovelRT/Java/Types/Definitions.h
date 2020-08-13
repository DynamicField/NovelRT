#ifndef NOVELRT_DEFINITIONS_H
#define NOVELRT_DEFINITIONS_H

#include "NovelRT/Java/EssentialIncludes.h"
#include "NovelRT/Java/Context.h"

namespace NovelRT::Java::Types {
  template<typename Container, typename T>
  class DefinitionBase {
  private:
    std::unique_ptr<T> _value = nullptr;
    std::function<const jni::Class<Container>&()> _containerClassFunction;

  protected:
    virtual T find(jni::JNIEnv& env) = 0;

    const jni::Class<Container>& containerClass() {
      return _containerClassFunction();
    }

  public:
    DefinitionBase() : _containerClassFunction(&Container::javaClass) {}

    virtual ~DefinitionBase() {}

    T& get() {
      if (_value == nullptr) {
        _value.reset(new T(find(*jni::GetAttachedEnv(*CurrentJavaVM))));
      }
      return *_value;
    }

    inline T operator()() {
      return get();
    }
  };

  template<typename Container, typename Signature>
  class MethodDefinition final : public DefinitionBase<Container, jni::Method<Container, Signature>> {
  private:
    std::string _name;

  protected:
    jni::Method<Container, Signature> find(JNIEnv& env) override {
      std::cout << "Finding method " << _name << jni::TypeSignature<Signature>()() << " in class " << Container::Name()
                << "..." << std::endl;
      return this->containerClass().template GetMethod<Signature>(env, _name.c_str());
    }

  public:
    MethodDefinition(const std::string& name) : _name(name) {}
  };

  template<typename Container, typename... Args>
  class ConstructorDefinition final : public DefinitionBase<Container, jni::Constructor<Container, Args...>> {
  protected:
    jni::Constructor<Container, Args...> find(JNIEnv& env) override {
      std::cout << "Finding constructor " << jni::TypeSignature<void(Args...)>()() << " in class " << Container::Name()
                << "..." << std::endl;
      return this->containerClass().template GetConstructor<Args...>(env);
    }
  };

  template<typename Container, typename Value>
  class FieldDefinition final : public DefinitionBase<Container, jni::Field<Container, Value>> {
  private:
    std::string _name;
  protected:
    jni::Field<Container, Value> find(JNIEnv& env) override {
      std::cout << "Finding field " << jni::TypeSignature<Value>()() << " " << _name
                << " in class " << Container::Name() << std::endl;
      return this->containerClass().template GetField<Value>(env, _name.c_str());
    }

  public:
    FieldDefinition(const std::string& name) : _name(name) {}
  };
}

#endif //NOVELRT_DEFINITIONS_H
