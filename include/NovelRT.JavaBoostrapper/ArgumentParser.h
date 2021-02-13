#ifndef NOVELRT_ARGUMENTPARSER_H
#define NOVELRT_ARGUMENTPARSER_H

#include <unordered_map>
#include "Options.h"

namespace NovelRT::JavaBootstrapper {
  struct ArgumentParsingResult {
    std::unordered_map<const Option*, std::string> options;
    std::vector<std::string> rest;
  };

  class ArgumentParser {
  private:
    struct Context {
      ArgumentParsingResult result;

      char** args;
      int argsCount;
      int currentIndex = 0; // next() will skip this one

      bool restMode;

      Context(char** args, int argsCount);

      Context() = default;
    };

    Context _context;

    bool hasNext();

    std::string next();

    void consumeNextOption();

    void parseOption(const Option* option, const std::string& name);

  public:
    ArgumentParsingResult parse(char** args, int argsCount);
  };

  class OptionParsingException : public std::runtime_error {
  public:
    OptionParsingException(const std::string& message);

    OptionParsingException(const char* message);
  };
}

#endif //NOVELRT_ARGUMENTPARSER_H
