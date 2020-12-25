package io.spring.initializr.locorepo.buildscripts

import io.spring.initializr.locorepo.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeBuildMps(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""<?xml version="1.0" encoding="UTF-8"?>
        <model ref="${context.buildModule.models[0].modelReference()}">
          <persistence version="9" />
          ${mpsBuildUsedLangs()}
          ${mpsBuildImports(context)}
          <registry>
            ${mpsBuildRegistryBuildLang()}
            ${mpsBuildRegistryCoreLang()}
            ${mpsBuildRegistryStartupLang()}
            ${mpsBuildRegistryBuildMpsLang()}
          </registry>
          ${buildMpsBoostrapNode(context)}
          ${buildMpsRCPNode(context)}
          ${buildMpsRCPDistributionNode(context)}
          ${buildMpsScriptsNode(context)}
          ${buildMpsRCPDistribWithJBRNode(context)}
        </model>
    """.trimIndent())
}
