package io.spring.initializr.locorepo.language

import io.spring.initializr.generator.language.AbstractLanguage

class MpsModel(jvmVersion: String?) : AbstractLanguage(ID, jvmVersion, "mps") {

    companion object {
        /**
         * MPS Model identifier.
         */
        const val ID = "mps-model"
    }
}
