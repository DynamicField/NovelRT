#ifndef NOVELRT_OPTIONS_H
#define NOVELRT_OPTIONS_H

#include <array>
#include <string>
#include <vector>

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
    std::vector<std::string> names;
    OptionType type;
    OptionFlags flags;

    Option(std::string id, const std::initializer_list<std::string>& names,
           OptionType type, OptionFlags flags = None)
    : id(id), names(names), type(type), flags(flags) {}
  };

  inline const Option LaunchOption("Launch", {"--launch"}, AcceptsValue, DelimitsRest);

  inline const std::vector<const Option*> AllOptions{
    &LaunchOption
  };
}
#endif //NOVELRT_OPTIONS_H
