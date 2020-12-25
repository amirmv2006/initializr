package io.spring.initializr.locorepo

import io.spring.initializr.generator.io.IndentingWriter

fun IndentingWriter.block(blockName: String, runnable: Runnable) {
    println("$blockName {")
    indented { runnable.run() }
    println("}")
}
