package com.github.novelrt.logging

import java.lang.System.Logger

fun Logger.logError(message: String) {
    log(Logger.Level.ERROR, message)
}

fun Logger.logError(message: String, vararg args: Any?) {
    log(Logger.Level.ERROR, message, *args)
}

fun Logger.logWarning(message: String) {
    log(Logger.Level.WARNING, message)
}

fun Logger.logWarning(message: String, vararg args: Any?) {
    log(Logger.Level.WARNING, message,*args)
}

fun Logger.logInfo(message: String) {
    log(Logger.Level.INFO, message)
}

fun Logger.logInfo(message: String, vararg args: Any?) {
    log(Logger.Level.INFO, message, *args)
}

fun Logger.logDebug(message: String) {
    log(Logger.Level.DEBUG, message)
}

fun Logger.logDebug(message: String, vararg args: Any?) {
    log(Logger.Level.DEBUG, message, *args)
}
