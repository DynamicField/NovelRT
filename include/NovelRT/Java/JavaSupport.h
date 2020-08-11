#ifndef NOVELRT_JAVASUPPORT_H
#define NOVELRT_JAVASUPPORT_H

// Base stuff
#include <NovelRT.h>
#include <jni/jni.hpp>

// Registries
#include "Registries.h"

// Binding stuff
#include "Bindings.h"

// Utilities
#include "Handles.h"
#include "TransformSerialization.h"
#include "JavaEventHandler.h"

#define MAKE_NATIVE_METHOD(name) jni::MakeNativeMethod(#name, std::function(name))

#endif //NOVELRT_JAVASUPPORT_H
