package io.spring.initializr.locorepo.contributors.dotmps

import io.spring.initializr.locorepo.contributors.LanguageGenerationContext
import io.spring.initializr.locorepo.contributors.ModelGenerationContext
import java.nio.file.Path

fun Path.writeModulesXml(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <project version="4">
          <component name="MPSProject">
            <projectModules>
              <modulePath path="${'$'}PROJECT_DIR${'$'}/code/buildscripts/solutions/${context.buildModule.name}/${context.buildModule.name}.msd" folder="buildscripts" />
              <modulePath path="${'$'}PROJECT_DIR${'$'}/code/${context.projectDescription.artifactId}/languages/${context.language.name}/${context.language.name}.mpl" folder="langs" />
            </projectModules>
          </component>
        </project>
    """.trimIndent())
}

fun Path.writeModulesXml(context: ModelGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <project version="4">
          <component name="MPSProject">
            <projectModules>
              <modulePath path="${'$'}PROJECT_DIR${'$'}/solutions/${context.projectQualifiedName()}/${context.projectQualifiedName()}.msd" folder="" />
            </projectModules>
          </component>
        </project>
    """.trimIndent())
}
