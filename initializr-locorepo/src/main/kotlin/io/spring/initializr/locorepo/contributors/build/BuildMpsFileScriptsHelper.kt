package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsScriptsNode(context: ProjectGenerationContext): String = """
    <node concept="26EafH" id="SSBTh98uuc">
      <property role="26EafI" value="-"/>
      <property role="26FY9R" value="jetbrains.mps.Launcher"/>
      <property role="TrG5h" value="${context.projectDescription.artifactId}_Scripts"/>
      <ref role="1_kbm${'$'}" node="SSBTh98unp" resolve="${context.ideFileName()} 1.0"/>
      <node concept="26EafG" id="SSBTh98uud" role="26Ea7d">
        <property role="26EafJ" value="lib/branding.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uue" role="26Ea7d">
        <property role="26EafJ" value="lib/mps-boot.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uuf" role="26Ea7d">
        <property role="26EafJ" value="lib/mps-boot-util.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uug" role="26Ea7d">
        <property role="26EafJ" value="lib/bootstrap.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uuh" role="26Ea7d">
        <property role="26EafJ" value="lib/extensions.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uui" role="26Ea7d">
        <property role="26EafJ" value="lib/util.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uuj" role="26Ea7d">
        <property role="26EafJ" value="lib/jdom.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uuk" role="26Ea7d">
        <property role="26EafJ" value="lib/log4j.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uul" role="26Ea7d">
        <property role="26EafJ" value="lib/trove4j.jar"/>
      </node>
      <node concept="26EafG" id="SSBTh98uum" role="26Ea7d">
        <property role="26EafJ" value="lib/jna.jar"/>
      </node>
    </node>
""".trimIndent()
