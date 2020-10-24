package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.spring.scm.git.GitIgnore
import io.spring.initializr.generator.spring.scm.git.GitIgnoreCustomizer

class LocoRepoGradleGitIgnoreCustomizer: GitIgnoreCustomizer {

    override fun customize(gitIgnore: GitIgnore) {
        gitIgnore.general.add(".gradle/")
        gitIgnore.general.add("build/")
    }
}
