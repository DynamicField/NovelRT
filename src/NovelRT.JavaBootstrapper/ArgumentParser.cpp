#include <stdexcept>
#include "NovelRT.JavaBoostrapper/ArgumentParser.h"

namespace NovelRT::JavaBootstrapper {
  ArgumentParsingResult ArgumentParser::parse(char** args, int argsCount) {
    _context = Context(args, argsCount);

    while (hasNext()) {
      consumeNextOption();
      if (_context.restMode) {
        // Fill the rest
        for (int i = _context.currentIndex; i < _context.argsCount; ++i) {
          _context.result.rest.push_back(std::string(_context.args[i]));
        }
        break;
      }
    }

    return _context.result;
  }

  bool ArgumentParser::hasNext() {
    return (_context.currentIndex + 1) < _context.argsCount;
  }

  std::string ArgumentParser::next() {
    if (!hasNext()) {
      throw std::runtime_error("Attempted to call next() with no more following arguments.");
    }

    _context.currentIndex += 1;
    return std::string(_context.args[_context.currentIndex]);
  }

  void ArgumentParser::consumeNextOption() {
    auto optionName = next();

    for (auto* optionCandidate : AllOptions) {
      for (auto& optionCandidateName : optionCandidate->names) {
        if (optionCandidateName == optionName) {
          parseOption(optionCandidate, optionCandidateName);
          return;
        }
      }
    }

    throw OptionParsingException("Unknown option: " + optionName);
  }

  void ArgumentParser::parseOption(const Option* option, const std::string& name) {
    switch (option->type) {
      case Toggle:
        _context.result.options[option] = "true";
        break;
      case AcceptsValue:
        if (!hasNext()) {
          throw OptionParsingException("The " + name + " option requires a value.");
        }
        _context.result.options[option] = next();
        break;
    }
    if (option->flags & DelimitsRest) {
      _context.restMode = true;
    }
  }

  ArgumentParser::Context::Context(char** args, int argsCount) : args(args), argsCount(argsCount) {}

  OptionParsingException::OptionParsingException(const std::string& message) : runtime_error(message) {}

  OptionParsingException::OptionParsingException(const char* message) : runtime_error(message) {}
}
