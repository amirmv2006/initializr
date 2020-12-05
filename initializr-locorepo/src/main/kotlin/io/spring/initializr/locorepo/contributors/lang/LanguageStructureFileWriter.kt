package io.spring.initializr.locorepo.contributors.lang

import io.spring.initializr.locorepo.contributors.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeStructureMps(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="${context.language.structureModel.modelReference()}">
          <persistence version="9" />
          <languages>
            <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
            <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
          </languages>
          <imports />
          <registry />
        </model>
    """.trimIndent())
}
