package io.spring.initializr.locorepo.language

import io.spring.initializr.locorepo.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeEditorMps(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="${context.language.editorModel.modelReference()}">
          <persistence version="9" />
          <languages>
            <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
            <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
          </languages>
          <imports />
          <registry />
        </model>
    """.trimIndent())
}
