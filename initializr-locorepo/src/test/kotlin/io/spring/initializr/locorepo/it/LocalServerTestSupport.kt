package io.spring.initializr.locorepo.it

import com.google.cloud.functions.invoker.runner.Invoker
import org.assertj.core.api.Assertions
import org.springframework.cloud.function.adapter.gcp.GcfJarLauncher
import java.io.*
import java.util.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.collections.HashMap

object LocalServerTestSupport {
    private val EXECUTOR = Executors.newCachedThreadPool()
    private const val SERVER_READY_STRING = "Started ServerConnector"
    private val nextPort = AtomicInteger(8080)
    @Throws(InterruptedException::class, IOException::class)
    fun startServer(springApplicationMainClass: Class<*>): ServerProcess {

        // Get the Java class path.
        val myClassPath = System.getProperty("java.class.path")
        Assertions.assertThat(myClassPath).isNotNull

        // Setup the Java Process command line string
        val command = Arrays.asList(javaCommand, "-classpath", myClassPath, Invoker::class.java.name)
        val processBuilder = ProcessBuilder().command(command).redirectErrorStream(true)

        // Set environment variables.
        val environment: MutableMap<String, String> = HashMap()
        environment["PORT"] = nextPort.getAndIncrement().toString()
        environment["K_SERVICE"] = "test-function"
        environment["FUNCTION_SIGNATURE_TYPE"] = "http"
        environment["FUNCTION_TARGET"] = GcfJarLauncher::class.java.canonicalName
        environment["MAIN_CLASS"] = springApplicationMainClass.canonicalName
        processBuilder.environment().putAll(environment)

        // Start the process and monitor the output logs in a separate thread.
        // Once the SERVER_READY_STRING is found in the logs, we know we are ready.
        val serverProcess = processBuilder.start()
        val ready = CountDownLatch(1)
        EXECUTOR.submit { monitorOutput(serverProcess.inputStream, ready) }
        val serverReady = ready.await(5, TimeUnit.MINUTES)
        if (!serverReady) {
            serverProcess.destroy()
            throw AssertionError("Server never became ready")
        }
        return ServerProcess(serverProcess)
    }

    private fun monitorOutput(processOutput: InputStream, ready: CountDownLatch) {
        try {
            BufferedReader(InputStreamReader(processOutput)).use { reader ->
                var line: String
                while (reader.readLine().also { line = it } != null) {
                    if (line.contains(SERVER_READY_STRING)) {
                        ready.countDown()
                    }
                    println(line)
                    if (line.contains("WARNING")) {
                        throw AssertionError("Found warning in server output:\n$line")
                    }
                }
            }
        } catch (e: IOException) {
            throw UncheckedIOException(e)
        }
    }

    /**
     * Returns the path to the java executable.
     */
    private val javaCommand: String
        private get() {
            val javaHome = File(System.getProperty("java.home"))
            Assertions.assertThat(javaHome.exists()).isTrue
            val javaBin = File(javaHome, "bin")
            val javaExecutable = if (System.getProperty("os.name").toString().toLowerCase().startsWith("win"))
                "java.exe"
            else
                "java"
            val javaCommand = File(javaBin, javaExecutable)
            Assertions.assertThat(javaCommand.exists()).isTrue
            return javaCommand.toString()
        }

    class ServerProcess(private val process: Process) : AutoCloseable {
        fun process(): Process {
            return process
        }

        override fun close() {
            process().destroy()
        }
    }
}
