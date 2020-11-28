package io.spring.initializr.locorepo.contributors.lang

import io.spring.initializr.locorepo.contributors.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeBehaviorMps(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="r:${context.language.behaviorModel.modelReference()}">
          <persistence version="9" />
          <languages>
            <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="17" />
            <use id="af65afd8-f0dd-4942-87d9-63a55f2a9db1" name="jetbrains.mps.lang.behavior" version="2" />
            <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
          </languages>
          <imports />
          <registry />
        </model>
    """.trimIndent())
}
