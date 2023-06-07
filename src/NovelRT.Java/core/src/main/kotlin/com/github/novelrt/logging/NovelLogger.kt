package com.github.novelrt.logging

import com.github.novelrt.interop.NovelRT
import java.io.PrintWriter
import java.io.StringWriter
import java.lang.System.Logger.Level
import java.text.MessageFormat
import java.util.*

class NovelLogger internal constructor(private val title: String) : System.Logger {
    // TODO: Destroy it
    private val loggerHandle = NovelRT.Nrt_LoggingService_createCustomTitle(title)

    override fun getName(): String {
        return title
    }

    override fun isLoggable(level: Level?): Boolean {
        return true
    }

    override fun log(level: Level, bundle: ResourceBundle?, msg: String, thrown: Throwable) {
        val sw = StringWriter()
        sw.append(msg)
        sw.append(System.lineSeparator())
        PrintWriter(sw).use { pw ->
            // For some reason I can't use printStackTrace on Throwable,
            // https://youtrack.jetbrains.com/issue/KTIJ-11485
            // This workaround should do the job.
            (thrown as? Exception)?.printStackTrace(pw)
            (thrown as? Error)?.printStackTrace(pw)
        }

        logMessage(level, sw.toString())
    }

    override fun log(level: Level, bundle: ResourceBundle?, format: String, params: Array<Any>?) {
        val formatted = if (params != null) MessageFormat.format(format, *params) else format

        logMessage(level, formatted)
    }

    private fun logMessage(level: Level, message: String?) {
        when (level) {
            Level.ERROR -> {
                NovelRT.Nrt_LoggingService_logErrorLine(loggerHandle, message)
            }

            Level.WARNING -> {
                NovelRT.Nrt_LoggingService_logWarningLine(loggerHandle, message)
            }

            Level.INFO -> {
                NovelRT.Nrt_LoggingService_logInfoLine(loggerHandle, message)
            }

            Level.DEBUG, Level.TRACE -> {
                NovelRT.Nrt_LoggingService_logDebugLine(loggerHandle, message)
            }

            else -> {
                throw IllegalArgumentException("Invalid level.")
            }
        }
    }
}
