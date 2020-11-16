package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeBuildMps(context: ProjectGenerationContext) {
    //language=XML
    this.toFile().writeText("""<?xml version="1.0" encoding="UTF-8"?>
        <model ref="r:${context.buildModule.models[0].modelReference()}">
          <persistence version="9" />
          ${mpsBuildUsedLangs()}
          ${mpsBuildImports()}
          <registry>
            ${mpsBuildRegistryBuildLang()}
            ${mpsBuildRegistryCoreLang()}
            ${mpsBuildRegistryStartupLang()}
            ${mpsBuildRegistryBuildMpsLang()}
          </registry>
          ${buildMpsBoostrapNode(context)}
          ${buildMpsPluginNode(context)}
          ${buildMpsRCPNode(context)}
          ${buildMpsRCPDistributionNode(context)}
          ${buildMpsScriptsNode(context)}
          ${buildMpsRCPDistribWithJBRNode(context)}
        </model>
    """.trimIndent())
}
