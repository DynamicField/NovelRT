package com.github.novelrt

/**
 * Thrown when an exception occurs in the native NovelRT library.
 */
sealed class NovelRTException private constructor(message: String?, val errorCode: Int) : RuntimeException(message) {
    // TODO: FumoCement bug??? NrtResultKind enum isn't there!
    // Map all exceptions from this enum:
    /*
        NRT_FAILURE_UNKNOWN = -1,
        NRT_FAILURE_NULL_ARGUMENT_PROVIDED = -2,
        NRT_FAILURE_NOT_A_NUMBER = -3,
        NRT_FAILURE_DIVIDE_BY_ZERO = -4,
        NRT_FAILURE_ALREADY_DELETED_OR_REMOVED = -5,
        NRT_FAILURE_ARGUMENT_OUT_OF_RANGE = -6,
        NRT_FAILURE_FILE_NOT_FOUND = -7,
        NRT_FAILURE_NOT_SUPPORTED = -8,
        NRT_FAILURE_CHARACTER_NOT_FOUND = -9,
        NRT_FAILURE_INITIALISATION_FAILURE = -10,
        NRT_FAILURE_NOT_INITIALISED = -11,
        NRT_FAILURE_FUNCTION_NOT_FOUND = -12,
        NRT_FAILURE_INVALID_OPERATION = -13,
        NRT_FAILURE_DUPLICATE_KEY_PROVIDED = -14,
        NRT_FAILURE_KEY_NOT_FOUND = -15,
        NRT_FAILURE_OUT_OF_MEMORY = -16,
        NRT_FAILURE_COMPILATION_ERROR = -17,
        NRT_FAILURE_RUNTIME_NOT_FOUND = -18,
        NRT_FAILURE_NULL_INSTANCE_PROVIDED = -19,
        NRT_FAILURE_INVALID_DIRECTORY_PATH = -20
     */
    class Unknown(message: String?) : NovelRTException(message, -1)
    class NullArgument(message: String?) : NovelRTException(message, -2)
    class NotANumber(message: String?) : NovelRTException(message, -3)
    class DivideByZero(message: String?) : NovelRTException(message, -4)
    class AlreadyDeletedOrRemoved(message: String?) : NovelRTException(message, -5)
    class ArgumentOutOfRange(message: String?) : NovelRTException(message, -6)
    class FileNotFound(message: String?) : NovelRTException(message, -7)
    class NotSupported(message: String?) : NovelRTException(message, -8)
    class CharacterNotFound(message: String?) : NovelRTException(message, -9)
    class InitialisationFailure(message: String?) : NovelRTException(message, -10)
    class NotInitialised(message: String?) : NovelRTException(message, -11)
    class FunctionNotFound(message: String?) : NovelRTException(message, -12)
    class InvalidOperation(message: String?) : NovelRTException(message, -13)
    class DuplicateKeyProvided(message: String?) : NovelRTException(message, -14)
    class KeyNotFound(message: String?) : NovelRTException(message, -15)
    class OutOfMemory(message: String?) : NovelRTException(message, -16)
    class CompilationError(message: String?) : NovelRTException(message, -17)
    class RuntimeNotFound(message: String?) : NovelRTException(message, -18)
    class NullInstanceProvided(message: String?) : NovelRTException(message, -19)
    class InvalidDirectoryPath(message: String?) : NovelRTException(message, -20)

    companion object {
        fun adequateSubType(message: String?, errorCode: Int): NovelRTException {
            return when (errorCode) {
                -1 -> Unknown(message)
                -2 -> NullArgument(message)
                -3 -> NotANumber(message)
                -4 -> DivideByZero(message)
                -5 -> AlreadyDeletedOrRemoved(message)
                -6 -> ArgumentOutOfRange(message)
                -7 -> FileNotFound(message)
                -8 -> NotSupported(message)
                -9 -> CharacterNotFound(message)
                -10 -> InitialisationFailure(message)
                -11 -> NotInitialised(message)
                -12 -> FunctionNotFound(message)
                -13 -> InvalidOperation(message)
                -14 -> DuplicateKeyProvided(message)
                -15 -> KeyNotFound(message)
                -16 -> OutOfMemory(message)
                -17 -> CompilationError(message)
                -18 -> RuntimeNotFound(message)
                -19 -> NullInstanceProvided(message)
                -20 -> InvalidDirectoryPath(message)
                else -> Unknown(message)
            }
        }
    }
}
