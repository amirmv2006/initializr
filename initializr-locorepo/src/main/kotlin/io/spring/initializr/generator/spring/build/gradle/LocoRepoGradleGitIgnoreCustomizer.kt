package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.spring.scm.git.GitIgnore
import io.spring.initializr.generator.spring.scm.git.GitIgnoreCustomizer

class LocoRepoGradleGitIgnoreCustomizer: GitIgnoreCustomizer {

    override fun customize(gitIgnore: GitIgnore) {
        gitIgnore.general.add(".gradle/")
        gitIgnore.general.add("build/")
        gitIgnore.general.add("/lib")
        gitIgnore.general.add("**/startup.properties")

        gitIgnore.general.add("**/.mps/workspace.xml")
        gitIgnore.general.add("**/.mps/shelf")

        gitIgnore.general.add("classes_gen")
        gitIgnore.general.add("source_gen")
        gitIgnore.general.add("source_gen.caches")
    }
}
