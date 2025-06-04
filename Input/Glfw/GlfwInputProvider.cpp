// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#include <NovelRT/Exceptions/InitialisationFailureException.hpp>
#include <NovelRT/Exceptions/InvalidOperationException.hpp>
#include <NovelRT/Exceptions/KeyNotFoundException.hpp>
#include <NovelRT/Exceptions/NullPointerException.hpp>
#include <NovelRT/Input/Glfw/GlfwInputProvider.hpp>
#include <NovelRT/Logging/BuiltInLogSections.hpp>
#include <NovelRT/Windowing/Glfw/GlfwWindowProvider.hpp>

namespace NovelRT::Input
{
    using GlfwInputProvider = InputProvider<Glfw::GlfwInputBackend>;

    GlfwInputProvider::InputProvider(std::shared_ptr<Windowing::WindowProvider<Windowing::Glfw::GlfwWindowingBackend>> windowProvider)
        : _windowProvider(std::move(windowProvider)),
          _previousStates({}),
          _mappedActions({}),
          _availableKeys({}),
          _keyStates(DefaultBufferCount),
          _mousePos(NovelRT::Maths::GeoVector2F::Zero()),
          _rawMousePos(NovelRT::Maths::GeoVector2F::Zero()),
          _windowDimensions(_windowProvider->GetWidth(), _windowProvider->GetHeight()),
          _previousBufferIndex(0),
          _currentBufferIndex(1),
          _logger(NovelRT::Logging::CONSOLE_LOG_INPUT)
    {
        if (_windowProvider == nullptr)
        {
            throw Exceptions::NullPointerException(
                "Could not initialise GLFW input service - null pointer was provided for windowing device.");
        }

        _logger.logInfoLine("Initialising GLFW input service.");
        _windowProvider->KeyboardButtonChanged +=
            [this](auto eventArgs) { ProcessKeyInput(eventArgs.key, eventArgs.action); };
        _windowProvider->MouseButtonClicked +=
            [this](auto eventArgs) { ProcessKeyInput(eventArgs.key, eventArgs.action); };
        _windowProvider->CursorMoved += [this](auto eventArgs) {
            NovelRT::Maths::GeoVector2F nativePos = NovelRT::Maths::GeoVector2F(static_cast<float>(eventArgs.x), static_cast<float>(eventArgs.y));
            ProcessCursorMovement(nativePos);
        };

        MapAllGlfwKeysToNovelKeys();

        _logger.logInfo("GLFW input system initialised: window at {} x {}", _windowDimensions.x, _windowDimensions.y);
    }

    void GlfwInputProvider::Update(Timing::Timestamp::duration /*delta*/)
    {
        auto& currentBuffer = _keyStates.at(_currentBufferIndex);

        for (const auto& [key, log] : _keyStates.at(_previousBufferIndex))
        {
            auto findResultForCurrent = currentBuffer.find(key);
            if (findResultForCurrent != currentBuffer.end())
            {
                ProcessKeyState(findResultForCurrent->first, findResultForCurrent->second.GetCurrentState());
            }
            else
            {
                ProcessKeyState(key, log.GetCurrentState());
            }
        }
    }

    KeyState GlfwInputProvider::GetKeyState(const std::string& key) noexcept
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != key)
            {
                continue;
            }

            auto externalKeyCode = action.pairedKey.GetExternalKeyCode();

            auto& currentBuffer = _keyStates.at(_currentBufferIndex);
            for (const auto& [currentKey, currentLog] : currentBuffer)
            {
                if (currentKey == externalKeyCode)
                {
                    return currentLog.GetCurrentState();
                }
            }
        }

        return KeyState::Idle;
    }

    bool GlfwInputProvider::IsKeyPressed(const std::string& input) noexcept
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != input)
            {
                continue;
            }

            auto key = action.pairedKey.GetExternalKeyCode();
            auto& currentBuffer = _keyStates.at(_currentBufferIndex);
            for (auto& [currentKey, currentLog] : currentBuffer)
            {
                if (currentKey != key)
                {
                    continue;
                }

                return currentLog.GetCurrentState() == KeyState::KeyDown;
            }
        }

        _logger.logWarning("Requested action is not mapped: {}", input);
        return false;
    }

    bool GlfwInputProvider::IsKeyHeld(const std::string& input) noexcept
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != input)
            {
                continue;
            }

            auto key = action.pairedKey.GetExternalKeyCode();
            auto& currentBuffer = _keyStates.at(_currentBufferIndex);
            for (auto& [currentKey, currentLog] : currentBuffer)
            {
                if (currentKey != key)
                {
                    continue;
                }

                return currentLog.GetCurrentState() == KeyState::KeyDownHeld;
            }
        }

        _logger.logWarning("Requested action is not mapped: {}", input);
        return false;
    }

    bool GlfwInputProvider::IsKeyReleased(const std::string& input) noexcept
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != input)
            {
                continue;
            }

            auto key = action.pairedKey.GetExternalKeyCode();
            auto& currentBuffer = _keyStates.at(_currentBufferIndex);
            for (auto& [currentKey, currentLog] : currentBuffer)
            {
                if (currentKey != key)
                {
                    continue;
                }

                return currentLog.GetCurrentState() == KeyState::KeyUp;
            }
        }

        _logger.logWarning("Requested action is not mapped: {}", input);
        return false;
    }

    InputAction& GlfwInputProvider::AddInputAction(const std::string& actionName, const std::string& keyIdentifier)
    {
        bool nameExists = false;
        bool keyBoundAlready = false;
        NovelKey pairedKey = GetAvailableKey(keyIdentifier);

        for (auto existingAction : _mappedActions)
        {
            if (existingAction.actionName == actionName)
            {
                nameExists = true;
            }
            if (existingAction.pairedKey == pairedKey)
            {
                keyBoundAlready = true;
            }
        }

        if (nameExists)
        {
            throw Exceptions::InvalidOperationException("Cannot add InputAction as the name has already been mapped!");
        }
        else if (keyBoundAlready)
        {
            throw Exceptions::InvalidOperationException("Cannot add InputAction as key has already been bound!");
        }
        else
        {
            _mappedActions.emplace_back(InputAction{actionName, pairedKey});
            return _mappedActions.back();
        }
    }

    NovelKey& GlfwInputProvider::GetAvailableKey(const std::string& keyRequested)
    {
        if (keyRequested == "")
        {
            throw NovelRT::Exceptions::InvalidOperationException("Cannot request a key with no name.");
        }

        for (auto key : _availableKeys)
        {
            if (key.first == keyRequested)
            {
                return _availableKeys.at(key.first);
            }
        }

        _logger.logError("Key {} not available from this input service.", keyRequested);
        throw NovelRT::Exceptions::KeyNotFoundException("Unavailable input key requested from input service.");
    }

    NovelRT::Utilities::Span<InputAction> GlfwInputProvider::GetAllMappings() noexcept
    {
        return _mappedActions;
    }

    NovelRT::Maths::GeoVector2F GlfwInputProvider::GetMousePosition() noexcept
    {
        return _mousePos;
    }

    NovelRT::Maths::GeoVector2F GlfwInputProvider::GetRawMousePosition() noexcept
    {
        return _rawMousePos;
    }

    void GlfwInputProvider::ProcessKeyInput(int32_t key, int32_t state)
    {
        auto& map = _keyStates.at(_currentBufferIndex);

        for (auto& mapped : _mappedActions)
        {
            if (mapped.pairedKey.GetExternalKeyCode() != key)
            {
                continue;
            }

            KeyStateFrameChangeLog log{};
            bool mouseMod = false;
            for (auto& [currentKey, currentLog] : map)
            {
                if (currentKey != mapped.pairedKey.GetExternalKeyCode())
                {
                    continue;
                }
                log = currentLog;
                if (currentKey == GLFW_MOUSE_BUTTON_LEFT || currentKey == GLFW_MOUSE_BUTTON_MIDDLE ||
                    currentKey == GLFW_MOUSE_BUTTON_RIGHT)
                {
                    mouseMod = true;
                }
                break;
            }

            if (mouseMod)
            {
                auto currentState = log.GetCurrentState();
                if (state == (int32_t)KeyState::KeyDown &&
                    (currentState == KeyState::KeyDown || currentState == KeyState::KeyDownHeld))
                {
                    state = (int32_t)KeyState::KeyDownHeld;
                }
            }

            log.PushNewState(static_cast<KeyState>(state));
            map.insert_or_assign(key, log);
        }
    }

    void GlfwInputProvider::ProcessCursorMovement(NovelRT::Maths::GeoVector2F& pos)
    {
        _rawMousePos = pos;
        _mousePos = DetermineMouseScreenPosition(pos);
    }

    void GlfwInputProvider::ProcessKeyState(int32_t key, KeyState state)
    {
        auto& previousBuffer = _keyStates.at(_previousBufferIndex);
        auto& currentBuffer = _keyStates.at(_currentBufferIndex);

        KeyState previousStateResult = KeyState::Idle;

        for (auto& [previousKey, previousLog] : previousBuffer)
        {
            if (previousKey == key)
            {
                previousStateResult = previousLog.GetCurrentState();
                break;
            }
        }

        KeyStateFrameChangeLog changeLogObject = KeyStateFrameChangeLog();

        for (auto& [currentKey, currentLog] : currentBuffer)
        {
            if (currentKey == key)
            {
                changeLogObject = currentLog;
                break;
            }
        }

        switch (state)
        {
            case KeyState::KeyDown:
            {
                if (previousStateResult == KeyState::KeyDown)
                {
                    changeLogObject.PushNewState(KeyState::KeyDownHeld);
                }
                else if (previousStateResult != KeyState::KeyDownHeld)
                {
                    changeLogObject.PushNewState(KeyState::KeyDown);
                }
                break;
            }
            case KeyState::KeyDownHeld:
            case KeyState::KeyUp:
            {
                changeLogObject.PushNewState((previousStateResult == KeyState::KeyUp) ? KeyState::Idle : state);
                break;
            }
            case KeyState::Idle:
            default:
            {
                break;
            }
        }

        currentBuffer.insert_or_assign(key, changeLogObject);
    }

    NovelRT::Maths::GeoVector2F GlfwInputProvider::DetermineMouseScreenPosition(NovelRT::Maths::GeoVector2F& pos)
    {
        return NovelRT::Maths::GeoVector2F(static_cast<float>(pos.x - (_windowDimensions.x / 2)),
                                           static_cast<float>(-pos.y + (_windowDimensions.y / 2)));
    }

    KeyStateFrameChangeLog GlfwInputProvider::GetCurrentChangeLog(const std::string& key)
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != key)
            {
                continue;
            }

            auto stateList = _keyStates.at(_currentBufferIndex);
            if(stateList.size() > 0)
                return stateList.at(action.pairedKey.GetExternalKeyCode());
        }

        return KeyStateFrameChangeLog();
    }

    KeyStateFrameChangeLog GlfwInputProvider::GetPreviousChangeLog(const std::string& key)
    {
        for (auto& action : _mappedActions)
        {
            if (action.actionName != key)
            {
                continue;
            }

            return _keyStates.at(_previousBufferIndex).at(action.pairedKey.GetExternalKeyCode());
        }

        return KeyStateFrameChangeLog();
    }

    NovelRT::Utilities::Span<std::unordered_map<int32_t, KeyStateFrameChangeLog>> GlfwInputProvider::GetAllChangeLogs()
    {
        return _keyStates;
    }

    void GlfwInputProvider::MapAllGlfwKeysToNovelKeys()
    {
        _availableKeys.emplace("LeftMouseButton", NovelKey("LeftMouseButton", GLFW_MOUSE_BUTTON_LEFT));
        _availableKeys.emplace("RightMouseButton", NovelKey("RightMouseButton", GLFW_MOUSE_BUTTON_RIGHT));
        _availableKeys.emplace("MiddleMouseButton", NovelKey("MiddleMouseButton", GLFW_MOUSE_BUTTON_MIDDLE));

        _availableKeys.emplace("Backspace", NovelKey("Backspace", GLFW_KEY_BACKSPACE));
        _availableKeys.emplace("Tab", NovelKey("Tab", GLFW_KEY_TAB));
        _availableKeys.emplace("Enter", NovelKey("Enter", GLFW_KEY_ENTER));
        _availableKeys.emplace("Pause", NovelKey("Pause", GLFW_KEY_PAUSE));

        _availableKeys.emplace("Caps Lock", NovelKey("Caps Lock", GLFW_KEY_CAPS_LOCK));
        _availableKeys.emplace("Escape", NovelKey("Escape", GLFW_KEY_ESCAPE));
        _availableKeys.emplace("Space", NovelKey("Space", GLFW_KEY_SPACE));
        _availableKeys.emplace("Page Up", NovelKey("Page Up", GLFW_KEY_PAGE_UP));
        _availableKeys.emplace("Page Down", NovelKey("Page Down", GLFW_KEY_PAGE_DOWN));
        _availableKeys.emplace("End", NovelKey("End", GLFW_KEY_END));
        _availableKeys.emplace("Home", NovelKey("Home", GLFW_KEY_HOME));

        _availableKeys.emplace("Left", NovelKey("Left", GLFW_KEY_LEFT));
        _availableKeys.emplace("Up", NovelKey("Up", GLFW_KEY_UP));
        _availableKeys.emplace("Right", NovelKey("Right", GLFW_KEY_RIGHT));
        _availableKeys.emplace("Down", NovelKey("Down", GLFW_KEY_DOWN));

        _availableKeys.emplace("Insert", NovelKey("Insert", GLFW_KEY_INSERT));
        _availableKeys.emplace("Delete", NovelKey("Delete", GLFW_KEY_DELETE));

        _availableKeys.emplace("~", NovelKey("~", GLFW_KEY_GRAVE_ACCENT));
        _availableKeys.emplace("0", NovelKey("0", GLFW_KEY_0));
        _availableKeys.emplace("1", NovelKey("1", GLFW_KEY_1));
        _availableKeys.emplace("2", NovelKey("2", GLFW_KEY_2));
        _availableKeys.emplace("3", NovelKey("3", GLFW_KEY_3));
        _availableKeys.emplace("4", NovelKey("4", GLFW_KEY_4));
        _availableKeys.emplace("5", NovelKey("5", GLFW_KEY_5));
        _availableKeys.emplace("6", NovelKey("6", GLFW_KEY_6));
        _availableKeys.emplace("7", NovelKey("7", GLFW_KEY_7));
        _availableKeys.emplace("8", NovelKey("8", GLFW_KEY_8));
        _availableKeys.emplace("9", NovelKey("9", GLFW_KEY_9));

        _availableKeys.emplace("A", NovelKey("A", GLFW_KEY_A));
        _availableKeys.emplace("B", NovelKey("B", GLFW_KEY_B));
        _availableKeys.emplace("C", NovelKey("C", GLFW_KEY_C));
        _availableKeys.emplace("D", NovelKey("D", GLFW_KEY_D));
        _availableKeys.emplace("E", NovelKey("E", GLFW_KEY_E));
        _availableKeys.emplace("F", NovelKey("F", GLFW_KEY_F));
        _availableKeys.emplace("G", NovelKey("G", GLFW_KEY_G));
        _availableKeys.emplace("H", NovelKey("H", GLFW_KEY_H));
        _availableKeys.emplace("I", NovelKey("I", GLFW_KEY_I));
        _availableKeys.emplace("J", NovelKey("J", GLFW_KEY_J));
        _availableKeys.emplace("K", NovelKey("K", GLFW_KEY_K));
        _availableKeys.emplace("L", NovelKey("L", GLFW_KEY_L));
        _availableKeys.emplace("M", NovelKey("M", GLFW_KEY_M));
        _availableKeys.emplace("N", NovelKey("N", GLFW_KEY_N));
        _availableKeys.emplace("O", NovelKey("O", GLFW_KEY_O));
        _availableKeys.emplace("P", NovelKey("P", GLFW_KEY_P));
        _availableKeys.emplace("Q", NovelKey("Q", GLFW_KEY_Q));
        _availableKeys.emplace("R", NovelKey("R", GLFW_KEY_R));
        _availableKeys.emplace("S", NovelKey("S", GLFW_KEY_S));
        _availableKeys.emplace("T", NovelKey("T", GLFW_KEY_T));
        _availableKeys.emplace("U", NovelKey("U", GLFW_KEY_U));
        _availableKeys.emplace("V", NovelKey("V", GLFW_KEY_V));
        _availableKeys.emplace("W", NovelKey("W", GLFW_KEY_W));
        _availableKeys.emplace("X", NovelKey("X", GLFW_KEY_X));
        _availableKeys.emplace("Y", NovelKey("Y", GLFW_KEY_Y));
        _availableKeys.emplace("Z", NovelKey("Z", GLFW_KEY_Z));

        _availableKeys.emplace("Keypad 0", NovelKey("Keypad 0", GLFW_KEY_KP_0));
        _availableKeys.emplace("Keypad 1", NovelKey("Keypad 1", GLFW_KEY_KP_1));
        _availableKeys.emplace("Keypad 2", NovelKey("Keypad 2", GLFW_KEY_KP_2));
        _availableKeys.emplace("Keypad 3", NovelKey("Keypad 3", GLFW_KEY_KP_3));
        _availableKeys.emplace("Keypad 4", NovelKey("Keypad 4", GLFW_KEY_KP_4));
        _availableKeys.emplace("Keypad 5", NovelKey("Keypad 5", GLFW_KEY_KP_5));
        _availableKeys.emplace("Keypad 6", NovelKey("Keypad 6", GLFW_KEY_KP_6));
        _availableKeys.emplace("Keypad 7", NovelKey("Keypad 7", GLFW_KEY_KP_7));
        _availableKeys.emplace("Keypad 8", NovelKey("Keypad 8", GLFW_KEY_KP_8));
        _availableKeys.emplace("Keypad 9", NovelKey("Keypad 9", GLFW_KEY_KP_9));

        _availableKeys.emplace("Multiply", NovelKey("Multiply", GLFW_KEY_KP_MULTIPLY));
        _availableKeys.emplace("Add", NovelKey("Add", GLFW_KEY_KP_ADD));
        _availableKeys.emplace("Subtract", NovelKey("Subtract", GLFW_KEY_KP_SUBTRACT));
        _availableKeys.emplace("Decimal", NovelKey("Decimal", GLFW_KEY_KP_DECIMAL));
        _availableKeys.emplace("Divide", NovelKey("Divide", GLFW_KEY_KP_DIVIDE));

        _availableKeys.emplace("F1", NovelKey("F1", GLFW_KEY_F1));
        _availableKeys.emplace("F2", NovelKey("F2", GLFW_KEY_F2));
        _availableKeys.emplace("F3", NovelKey("F3", GLFW_KEY_F3));
        _availableKeys.emplace("F4", NovelKey("F4", GLFW_KEY_F4));
        _availableKeys.emplace("F5", NovelKey("F5", GLFW_KEY_F5));
        _availableKeys.emplace("F6", NovelKey("F6", GLFW_KEY_F6));
        _availableKeys.emplace("F7", NovelKey("F7", GLFW_KEY_F7));
        _availableKeys.emplace("F8", NovelKey("F8", GLFW_KEY_F8));
        _availableKeys.emplace("F9", NovelKey("F9", GLFW_KEY_F9));
        _availableKeys.emplace("F10", NovelKey("F10", GLFW_KEY_F10));
        _availableKeys.emplace("F11", NovelKey("F11", GLFW_KEY_F11));
        _availableKeys.emplace("F12", NovelKey("F12", GLFW_KEY_F12));

        _availableKeys.emplace("Num Lock", NovelKey("Num Lock", GLFW_KEY_NUM_LOCK));
        _availableKeys.emplace("Scroll Lock", NovelKey("Scroll Lock", GLFW_KEY_SCROLL_LOCK));

        _availableKeys.emplace("Left Shift", NovelKey("Left Shift", GLFW_KEY_LEFT_SHIFT));
        _availableKeys.emplace("Right Shift", NovelKey("Right Shift", GLFW_KEY_RIGHT_SHIFT));
        _availableKeys.emplace("Left Control", NovelKey("Left Control", GLFW_KEY_LEFT_CONTROL));
        _availableKeys.emplace("Right Control", NovelKey("Right Control", GLFW_KEY_RIGHT_CONTROL));
        _availableKeys.emplace("Left Alt", NovelKey("Left Alt", GLFW_KEY_LEFT_ALT));
        _availableKeys.emplace("Right Alt", NovelKey("Right Alt", GLFW_KEY_RIGHT_ALT));
        _availableKeys.emplace("Left Super", NovelKey("Left Super", GLFW_KEY_LEFT_SUPER));
        _availableKeys.emplace("Right Super", NovelKey("Right Super", GLFW_KEY_RIGHT_SUPER));

        _availableKeys.emplace("Semicolon", NovelKey("Semicolon", GLFW_KEY_SEMICOLON));
        _availableKeys.emplace("Equal", NovelKey("Equal", GLFW_KEY_EQUAL));
        _availableKeys.emplace("Comma", NovelKey("Comma", GLFW_KEY_COMMA));
        _availableKeys.emplace("Minus", NovelKey("Minus", GLFW_KEY_MINUS));
        _availableKeys.emplace("Period", NovelKey("Period", GLFW_KEY_PERIOD));
        _availableKeys.emplace("Slash", NovelKey("Slash", GLFW_KEY_SLASH));
        _availableKeys.emplace("Left Bracket", NovelKey("Left Bracket", GLFW_KEY_LEFT_BRACKET));
        _availableKeys.emplace("Backslash", NovelKey("Backslash", GLFW_KEY_BACKSLASH));
        _availableKeys.emplace("Right Bracket", NovelKey("Right Bracket", GLFW_KEY_RIGHT_BRACKET));
        _availableKeys.emplace("Apostrophe", NovelKey("Apostrophe", GLFW_KEY_APOSTROPHE));

        _availableKeys.emplace("Ampersand", NovelKey("Ampersand", GLFW_KEY_7, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Asterisk", NovelKey("Asterisk", GLFW_KEY_8, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Caret", NovelKey("Caret", GLFW_KEY_6, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Colon", NovelKey("Colon", GLFW_KEY_SEMICOLON, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Dollar", NovelKey("Dollar", GLFW_KEY_4, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Exclamation", NovelKey("Exclamation", GLFW_KEY_1, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Left Brace", NovelKey("Left Brace", GLFW_KEY_LEFT_BRACKET, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Right Brace", NovelKey("Right Brace", GLFW_KEY_RIGHT_BRACKET, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Quote", NovelKey("Quote", GLFW_KEY_APOSTROPHE, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Underscore", NovelKey("Underscore", GLFW_KEY_MINUS, GLFW_MOD_SHIFT));
        _availableKeys.emplace("Tilde", NovelKey("Tilde", GLFW_KEY_GRAVE_ACCENT, GLFW_MOD_SHIFT));
    }
}
