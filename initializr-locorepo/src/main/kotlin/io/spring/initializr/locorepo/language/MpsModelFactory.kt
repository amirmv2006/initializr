package io.spring.initializr.locorepo.language

import io.spring.initializr.generator.language.Language
import io.spring.initializr.generator.language.LanguageFactory

class MpsModelFactory : LanguageFactory {
    override fun createLanguage(id: String, jvmVersion: String?): Language? =
            if (MpsModel.ID == id) {
                MpsModel(jvmVersion)
            } else null

}
