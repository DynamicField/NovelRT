// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.
#ifndef NOVELRT_PRECOMPILEDFUNCTIONS_H
#define NOVELRT_PRECOMPILEDFUNCTIONS_H

namespace NovelRT::JavaSupport
{
    using UpdateComponentFun = void (*)(void*, const void*, size_t, void*);

    template<size_t S> void updateComponent(void* target, const void* newComponent, size_t, void*)
    {
        std::memcpy(target, newComponent, S);
    }
    void updateComponent(void* target, const void* newComponent, size_t size, void*)
    {
        std::memcpy(target, newComponent, size);
    }

    // Memory-wise equality.
    NrtBool componentsEqual(const void* a, const void* b, void* sizePtr) {
        size_t& size = *static_cast<size_t*>(sizePtr);
        return std::memcmp(a, b, size) == 0;
    }

    // Same, but when we know the size
    template<size_t S> NrtBool componentsEqual(const void* a, const void* b, void*) {
        return std::memcmp(a, b, S) == 0;
    }


    // The reason behind this huge mess is for neat optimizations to happen.
    // When using memcpy with a variable argument, like in memcpy(destination, source, someVar),
    // the compiler generates a call to memcpy. While a call to the system's memcpy shines with large
    // blocks of memory, it has some overhead for smaller ones, especially since components aren't designed
    // to be large.
    //
    // However, when the size is known at compile time, the compiler generates some nice SIMD instructions
    // to do the copy, much faster! Take a look at https://godbolt.org/z/c1z9v3v4f for an example.
    // So, we have this large if-chain to give the most optimal memcpy function for common sizes.
    // You can think of it as a very bad JIT or something... or even a Just-In-Case compiler?
    UpdateComponentFun pickUpdateComponentFunc(size_t size)
    {
        if (size == 4)
        {
            return &updateComponent<4>;
        }
        if (size == 8)
        {
            return &updateComponent<8>;
        }
        if (size == 12)
        {
            return &updateComponent<12>;
        }
        if (size == 16)
        {
            return &updateComponent<16>;
        }
        if (size == 20)
        {
            return &updateComponent<20>;
        }
        if (size == 24)
        {
            return &updateComponent<24>;
        }
        if (size == 28)
        {
            return &updateComponent<28>;
        }
        if (size == 32)
        {
            return &updateComponent<32>;
        }
        if (size == 36)
        {
            return &updateComponent<36>;
        }
        if (size == 40)
        {
            return &updateComponent<40>;
        }
        if (size == 44)
        {
            return &updateComponent<44>;
        }
        if (size == 48)
        {
            return &updateComponent<48>;
        }
        if (size == 52)
        {
            return &updateComponent<52>;
        }
        if (size == 56)
        {
            return &updateComponent<56>;
        }
        if (size == 60)
        {
            return &updateComponent<60>;
        }
        if (size == 64)
        {
            return &updateComponent<64>;
        }
        if (size == 68)
        {
            return &updateComponent<68>;
        }
        if (size == 72)
        {
            return &updateComponent<72>;
        }
        if (size == 76)
        {
            return &updateComponent<76>;
        }
        if (size == 80)
        {
            return &updateComponent<80>;
        }
        if (size == 84)
        {
            return &updateComponent<84>;
        }
        if (size == 88)
        {
            return &updateComponent<88>;
        }
        if (size == 92)
        {
            return &updateComponent<92>;
        }
        if (size == 96)
        {
            return &updateComponent<96>;
        }
        if (size == 100)
        {
            return &updateComponent<100>;
        }
        if (size == 104)
        {
            return &updateComponent<104>;
        }
        if (size == 108)
        {
            return &updateComponent<108>;
        }
        if (size == 112)
        {
            return &updateComponent<112>;
        }
        if (size == 116)
        {
            return &updateComponent<116>;
        }
        if (size == 120)
        {
            return &updateComponent<120>;
        }
        if (size == 124)
        {
            return &updateComponent<124>;
        }
        if (size == 128)
        {
            return &updateComponent<128>;
        }
        return &updateComponent;
    }

    // For numbers in [0; 65536], returns a pointer that has the value of n.
    // Else, it just bursts into flames.
    size_t* getSizePtr(size_t n) {
        static size_t sizes[65537];
        static bool initialized = false;
        if (!initialized) {
            for (int i = 0; i < 65537; ++i)
            {
                sizes[i] = i;
            }
        }

        if (n < 65537) {
            return &sizes[n];
        } else {
            assert("Out of range number in getSizePtr. Probably coming from too large component struct.");
            return NULL;
        }
    }

    // Same thing, but for componentsEqual.
    // However, this one is... peculiar. Since the function doesn't have a size parameter,
    // We need to do some weird hacks to get it working for sizes outside the precomputed ones.
    // See getSizePtr.
    NrtComponentComparatorFnPtr pickComparatorFunc(size_t size) {
        if (size == 4)
        {
            return &componentsEqual<4>;
        }
        if (size == 8)
        {
            return &componentsEqual<8>;
        }
        if (size == 12)
        {
            return &componentsEqual<12>;
        }
        if (size == 16)
        {
            return &componentsEqual<16>;
        }
        if (size == 20)
        {
            return &componentsEqual<20>;
        }
        if (size == 24)
        {
            return &componentsEqual<24>;
        }
        if (size == 28)
        {
            return &componentsEqual<28>;
        }
        if (size == 32)
        {
            return &componentsEqual<32>;
        }
        if (size == 36)
        {
            return &componentsEqual<36>;
        }
        if (size == 40)
        {
            return &componentsEqual<40>;
        }
        if (size == 44)
        {
            return &componentsEqual<44>;
        }
        if (size == 48)
        {
            return &componentsEqual<48>;
        }
        if (size == 52)
        {
            return &componentsEqual<52>;
        }
        if (size == 56)
        {
            return &componentsEqual<56>;
        }
        if (size == 60)
        {
            return &componentsEqual<60>;
        }
        if (size == 64)
        {
            return &componentsEqual<64>;
        }
        if (size == 68)
        {
            return &componentsEqual<68>;
        }
        if (size == 72)
        {
            return &componentsEqual<72>;
        }
        if (size == 76)
        {
            return &componentsEqual<76>;
        }
        if (size == 80)
        {
            return &componentsEqual<80>;
        }
        if (size == 84)
        {
            return &componentsEqual<84>;
        }
        if (size == 88)
        {
            return &componentsEqual<88>;
        }
        if (size == 92)
        {
            return &componentsEqual<92>;
        }
        if (size == 96)
        {
            return &componentsEqual<96>;
        }
        if (size == 100)
        {
            return &componentsEqual<100>;
        }
        if (size == 104)
        {
            return &componentsEqual<104>;
        }
        if (size == 108)
        {
            return &componentsEqual<108>;
        }
        if (size == 112)
        {
            return &componentsEqual<112>;
        }
        if (size == 116)
        {
            return &componentsEqual<116>;
        }
        if (size == 120)
        {
            return &componentsEqual<120>;
        }
        if (size == 124)
        {
            return &componentsEqual<124>;
        }
        if (size == 128)
        {
            return &componentsEqual<128>;
        }
        return &componentsEqual;
    }
}

#endif // NOVELRT_PRECOMPILEDFUNCTIONS_H
