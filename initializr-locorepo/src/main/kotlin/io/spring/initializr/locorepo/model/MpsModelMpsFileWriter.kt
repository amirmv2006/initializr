package io.spring.initializr.locorepo.model

import io.spring.initializr.locorepo.ModelGenerationContext
import java.nio.file.Path

fun Path.writeModelMps(context: ModelGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="${context.modelModule.models[0].modelReference()}">
          <persistence version="9" />
          <languages />
          <imports />
          <registry />
        </model>
    """.trimIndent())
}
