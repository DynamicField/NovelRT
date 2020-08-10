#pragma once

// If you want to supply your own UTF-8 <-> UTF-16 conversion routines, create a header file
// that can be found at <jni/string_conversion.hpp> and will be found first in the lookup chain.

#include <string>

#ifdef WIN32
#include <Windows.h>
#endif

namespace jni {
  std::u16string convertUTF8ToUTF16(const std::string& string);
  std::string convertUTF16ToUTF8(const std::u16string& string);
}
