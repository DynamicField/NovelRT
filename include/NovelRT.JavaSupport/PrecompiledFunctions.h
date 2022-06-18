// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.
#ifndef NOVELRT_PRECOMPILEDFUNCTIONS_H
#define NOVELRT_PRECOMPILEDFUNCTIONS_H

namespace NovelRT::JavaSupport {
    void updateComponent(void* target, const void* newComponent, size_t size, void*) {
        std::memcpy(target, newComponent, size);
    }
}

#endif // NOVELRT_PRECOMPILEDFUNCTIONS_H
