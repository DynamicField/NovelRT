package com.github.novelrt


object NovelRTLoader {
    private const val DEFAULT_LIBRARY_NAME = "NovelRT.JavaSupport"

    @JvmStatic
    private var hasBeenLoaded = false

    @Synchronized
    fun load(libraryName: String = DEFAULT_LIBRARY_NAME) {
        if (!hasBeenLoaded) {
            System.loadLibrary(libraryName)
            hasBeenLoaded = true
        }
    }
    fun loadOrRestart(libraryName: String = DEFAULT_LIBRARY_NAME) {
        try {
            load(libraryName)
        } catch (e: Exception) {
            if (System.getenv("NOVELRT_APP_RELAUNCHED") != null) {
                throw e
            }
            val currentProcess = ProcessHandle.current()
            val command =  currentProcess.info().command().orElse(null)
            val args = currentProcess.info().arguments().orElse(null)

            if (command == null || args == null) {
                println("Failed to retrieve the current executable path and command line arguments!")
                throw e
            }

            System.gc()
            val builder = ProcessBuilder()
                .command(command, *args)
                .inheritIO()

            builder.environment()["NOVELRT_APP_RELAUNCHED"] = "true" // Let's not do a fork bomb

            builder.start().waitFor()
        }
    }
}
