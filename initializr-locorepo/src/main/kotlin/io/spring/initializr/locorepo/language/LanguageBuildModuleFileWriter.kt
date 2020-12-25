package io.spring.initializr.locorepo.language

import io.spring.initializr.locorepo.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeLanguageBuildModule(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <solution name="${context.langBuildModule.name}" uuid="${context.langBuildModule.id}" moduleVersion="${context.langBuildModule.moduleVersion}" compileInMPS="true">
          <models>
            <modelRoot contentPath="${'$'}{module}" type="default">
              <sourceRoot location="models" />
            </modelRoot>
          </models>
          <facets>
            <facet languageLevel="JAVA_8" type="java">
              <classes generated="true" path="${'$'}{module}/classes_gen" />
            </facet>
          </facets>
          <sourcePath />
          <dependencies>
            <dependency reexport="false">422c2909-59d6-41a9-b318-40e6256b250f(jetbrains.mps.ide.build)</dependency>
          </dependencies>
          <languageVersions>
            <language slang="l:798100da-4f0a-421a-b991-71f8c50ce5d2:jetbrains.mps.build" version="0" />
            <language slang="l:0cf935df-4699-4e9c-a132-fa109541cba3:jetbrains.mps.build.mps" version="7" />
            <language slang="l:ceab5195-25ea-4f22-9b92-103b95ca8c0c:jetbrains.mps.lang.core" version="2" />
          </languageVersions>
          <dependencyVersions>
            <module reference="${context.langBuildModule.moduleReference()}" version="${context.langBuildModule.moduleVersion}" />
            <module reference="422c2909-59d6-41a9-b318-40e6256b250f(jetbrains.mps.ide.build)" version="0" />
          </dependencyVersions>
        </solution>
    """.trimIndent())
}
