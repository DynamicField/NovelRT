package com.github.novelrt.logging

import java.util.concurrent.ConcurrentHashMap

class NovelLoggerFinder : System.LoggerFinder() {
    private val loggerMap = ConcurrentHashMap<String, NovelLogger>()

    override fun getLogger(name: String, module: Module): System.Logger {
        return loggerMap.computeIfAbsent(name) { NovelLogger(name) }
    }
}
