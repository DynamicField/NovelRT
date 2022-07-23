// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_INPUT_KEYSTATE_H
#define NOVELRT_INPUT_KEYSTATE_H

#ifndef NOVELRT_INPUT_H
#error NovelRT does not support including types explicitly by default. Please include Input.h instead for the Input namespace subset.
#endif

namespace NovelRT::Input
{
    /**
     * @brief A set of key states.
     */
    enum class KeyState : int32_t
    {
        Idle = 0,
        KeyUp = 1,
        KeyDown = 2,
        KeyDownHeld = 3
    };
}

#endif // !NOVELRT_INPUT_KEYSTATE_H
