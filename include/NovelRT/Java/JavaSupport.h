#ifndef NOVELRT_JAVASUPPORT_H
#define NOVELRT_JAVASUPPORT_H

// Base stuff
#include "EssentialIncludes.h"

#include "Context.h"
#include "Types/AllTypes.h"

// Registries
#include "Registries.h"

// Binding stuff
#include "Bindings.h"
#include "EventBindings.h"
#include "Aliases.h"

// Utilities
#include "Handles.h"
#include "Vector2Serialization.h"

#define MAKE_NATIVE_METHOD(name) jni::MakeNativeMethod(#name, std::function(name))

#endif //NOVELRT_JAVASUPPORT_H
