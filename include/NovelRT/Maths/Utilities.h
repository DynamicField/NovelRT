// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

// AlignUp's implementation is inspired by the TerraFX library. Licensed under the MIT Licence (MIT).
// See LICENSE.md at https://github.com/terrafx/terrafx for more information.

// Log2DeBruijn, and by extension Log2, LeadingZeroCount32, LeadingZeroCount64 and PopCount were all inspired by the
// .NET Hardware Intrinsics namespace, which lives in the .NET Runtime, licensed under the MIT Licence (MIT). See
// LICENSE.TXT at https://github.com/dotnet/runtime for more information.

// The Log2DeBruijn table itself was taken from public domain at https://graphics.stanford.edu/~seander/bithacks.html
// See there for additional information.

#ifndef NOVELRT_MATHS_UTILITIES_H
#define NOVELRT_MATHS_UTILITIES_H

#ifndef NOVELRT_MATHS_H
#error NovelRT does not support including types explicitly by default. Please include Maths.h instead for the Maths namespace subset.
#endif

namespace NovelRT::Maths::Utilities
{
    [[nodiscard]] inline constexpr std::array<uint8_t, 32> Log2DeBruijn() noexcept
    {
        return std::array<uint8_t, 32>{0, 9,  1,  10, 13, 21, 2,  29, 11, 14, 16, 18, 22, 25, 3, 30,
                                       8, 12, 20, 28, 15, 17, 24, 7,  19, 27, 23, 6,  26, 5,  4, 31};
    }

    [[nodiscard]] inline bool IsPow2(size_t value) noexcept
    {
        return ((value & (value - 1ULL)) == 0ULL) && (value != 0ULL);
    }

    [[nodiscard]] inline size_t AlignUp(size_t address, size_t alignment)
    {
        if (!IsPow2(alignment))
        {
            throw Exceptions::InvalidOperationException("Alignment must be to a power of two.");
        }

        return (address + (alignment - 1ULL)) & ~(alignment - 1ULL);
    }

    [[nodiscard]] [[deprecated("This implementation of PopCount is superseeded by std::popcount in C++20. This "
                               "will be removed when the language version is updated.")]] inline int32_t
    PopCount(uint32_t value) noexcept
    {
        const uint32_t c1 = 0x55555555u;
        const uint32_t c2 = 0x33333333u;
        const uint32_t c3 = 0x0F0F0F0Fu;
        const uint32_t c4 = 0x01010101u;

        value -= (value >> 1) & c1;
        value = (value & c2) + ((value >> 2) & c2);
        value = (((value + (value >> 4)) & c3) * c4) >> 24;

        return static_cast<int32_t>(value);
    }

    [[nodiscard]] inline uint32_t Log2(uint32_t value) noexcept
    {
        value |= value >> 1;
        value |= value >> 2;
        value |= value >> 4;
        value |= value >> 8;
        value |= value >> 16;

        return Log2DeBruijn()[(value * 0x07C4ACDDu) >> 27];
    }

    [[nodiscard]] inline uint32_t LeadingZeroCount32(uint32_t value) noexcept
    {
        if (value == 0)
        {
            return 32;
        }
        else
        {
            return 31 ^ Log2(value);
        }
    }

    [[nodiscard]] inline uint64_t LeadingZeroCount64(uint64_t value) noexcept
    {
        uint32_t hi = static_cast<uint32_t>(value >> 32);

        if (hi == 0)
        {
            return 32 + LeadingZeroCount32(static_cast<uint32_t>(value));
        }
        else
        {
            return LeadingZeroCount32(hi);
        }
    }

    [[nodiscard]] inline float DegreesToRadians(float degrees) noexcept
    {
        return glm::radians(degrees);
    }

    [[nodiscard]] inline float RadiansToDegrees(float radians) noexcept
    {
        return glm::degrees(radians);
    }

    template<typename TFloatingPointType>[[nodiscard]] inline constexpr TFloatingPointType Tau() noexcept
    {
        _assert(std::is_same_v<TFloatingPointType, float> || std::is_same_v<TFloatingPointType, double>,
                "Type is unsupported for a Tau representation.");
    }

    template<>[[nodiscard]] inline constexpr float Tau<float>() noexcept
    {
        return 6.283185307f;
    }

    template<>[[nodiscard]] inline constexpr double Tau<double>() noexcept
    {
        return 6.283185307179586476925;
    }
}

#endif // NOVELRT_UTILITIES_H
