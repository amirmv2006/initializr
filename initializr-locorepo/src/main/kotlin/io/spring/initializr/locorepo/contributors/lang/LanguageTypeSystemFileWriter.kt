package io.spring.initializr.locorepo.contributors.lang

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeTypeSystemMps(context: ProjectGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="r:${context.language.typesystemModel.modelReference()}">
          <persistence version="9" />
          <languages>
            <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
            <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
          </languages>
          <imports />
          <registry />
        </model>
    """.trimIndent())
}
