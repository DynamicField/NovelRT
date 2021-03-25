#ifndef NOVELRT_OPTIONS_H
#define NOVELRT_OPTIONS_H

#include <array>
#include <string>
#include <vector>
#include <regex>

namespace NovelRT::JavaBootstrapper {
  enum OptionType {
    Toggle,
    AcceptsValue
  };

  enum OptionFlags {
    None = 0,
    DelimitsRest = 1 << 1
  };

  struct Option {
    std::string id;
    std::regex pattern;
    OptionType type;
    OptionFlags flags;

    Option(std::string id, const std::regex& pattern,
           OptionType type, OptionFlags flags = None)
    : id(id), pattern(pattern), type(type), flags(flags) {}
  };

  inline const Option LaunchOption("Launch", std::regex("^--launch$"), AcceptsValue, DelimitsRest);

  inline const std::vector<const Option*> AllOptions{
    &LaunchOption
  };
}
#endif //NOVELRT_OPTIONS_H
