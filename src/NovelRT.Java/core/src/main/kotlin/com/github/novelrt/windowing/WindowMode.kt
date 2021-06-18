package com.github.novelrt.windowing

import com.github.novelrt.interop.NovelRT

enum class WindowMode(val nativeValue: Int) {
    WINDOWED(NovelRT.NrtWindowModeKind.NRT_WINDOW_MODE_WINDOWED),
    BORDERLESS(NovelRT.NrtWindowModeKind.NRT_WINDOW_MODE_BORDERLESS),
    FULLSCREEN(NovelRT.NrtWindowModeKind.NRT_WINDOW_MODE_FULLSCREEN);
}
