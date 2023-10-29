// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_INPUT_KEYSTATE_H
#define NOVELRT_INPUT_KEYSTATE_H

namespace NovelRT::Input
{
    /**
     * @brief A set of key states.
     */
    enum class KeyState : int32_t
    {
        Idle = -1,
        KeyUp = 0,
        KeyDown = 1,
        KeyDownHeld = 2
    };
}

#endif // !NOVELRT_INPUT_KEYSTATE_H
