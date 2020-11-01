package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeBuildBootstrapXml(context: ProjectGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <project name="${context.projectDescription.artifactId}_Bootstrap" default="build">
          <!-- Generated by MPS -->
          <property name="build.dir" location="build" />
          <property name="build.tmp" location="${'$'}{build.dir}/tmp/${context.projectDescription.artifactId}_Bootstrap" />
          <property name="build.layout" location="${'$'}{build.dir}/artifacts/${context.projectDescription.artifactId}_Bootstrap" />
          <property name="mps_home" location="${'$'}{basedir}/lib/MPS 2020.2" />
          <property name="artifacts.mps" location="${'$'}{mps_home}" />
          <property file="${'$'}{artifacts.mps}/build.properties" prefix="import.mps" />
          <property name="mps.build.number" value="${'$'}{import.mps.mps.build.number}" />
          <property name="mps.date" value="${'$'}{import.mps.mps.date}" />
          <property name="mps.build.vcs.number" value="${'$'}{import.mps.mps.build.vcs.number}" />
          <property name="mps.teamcity.buildConfName" value="${'$'}{import.mps.mps.teamcity.buildConfName}" />
          <property name="mps.idea.platform.build.number" value="${'$'}{import.mps.mps.idea.platform.build.number}" />
          <property name="mps.mps.build.counter" value="${'$'}{import.mps.mps.mps.build.counter}" />
          <property name="mpsBootstrapCore.version.major" value="${'$'}{import.mps.mpsBootstrapCore.version.major}" />
          <property name="mpsBootstrapCore.version.minor" value="${'$'}{import.mps.mpsBootstrapCore.version.minor}" />
          <property name="mpsBootstrapCore.version.bugfixNr" value="${'$'}{import.mps.mpsBootstrapCore.version.bugfixNr}" />
          <property name="mpsBootstrapCore.version.eap" value="${'$'}{import.mps.mpsBootstrapCore.version.eap}" />
          <property name="mpsBootstrapCore.version" value="${'$'}{import.mps.mpsBootstrapCore.version}" />
          <property name="mps.generator.skipUnmodifiedModels" value="false" />
          
          <path id="path.mps.ant.path">
            <pathelement location="${'$'}{mps_home}/lib/ant/lib/ant-mps.jar" />
            <pathelement location="${'$'}{mps_home}/lib/jdom.jar" />
            <pathelement location="${'$'}{mps_home}/lib/log4j.jar" />
          </path>
          
          <target name="assemble" depends="declare-mps-tasks">
            <mkdir dir="${'$'}{build.layout}" />
            <echo file="${'$'}{build.layout}/build.properties">mps.build.number=${'$'}{mps.build.number}${'$'}{line.separator}mps.date=${'$'}{mps.date}${'$'}{line.separator}mps.build.vcs.number=${'$'}{mps.build.vcs.number}${'$'}{line.separator}mps.teamcity.buildConfName=${'$'}{mps.teamcity.buildConfName}${'$'}{line.separator}mps.idea.platform.build.number=${'$'}{mps.idea.platform.build.number}${'$'}{line.separator}mps.mps.build.counter=${'$'}{mps.mps.build.counter}${'$'}{line.separator}mpsBootstrapCore.version.major=${'$'}{mpsBootstrapCore.version.major}${'$'}{line.separator}mpsBootstrapCore.version.minor=${'$'}{mpsBootstrapCore.version.minor}${'$'}{line.separator}mpsBootstrapCore.version.bugfixNr=${'$'}{mpsBootstrapCore.version.bugfixNr}${'$'}{line.separator}mpsBootstrapCore.version.eap=${'$'}{mpsBootstrapCore.version.eap}${'$'}{line.separator}mpsBootstrapCore.version=${'$'}{mpsBootstrapCore.version}</echo>
          </target>
          
          <target name="buildDependents" />
          
          <target name="fetchDependencies" />
          
          <target name="build" depends="assemble" />
          
          <target name="clean">
            <delete dir="${'$'}{build.tmp}" />
            <delete dir="${'$'}{build.layout}" />
          </target>
          
          <target name="generate" depends="declare-mps-tasks, fetchDependencies">
            <echo message="generating" />
            <generate strictMode="true" parallelMode="true" parallelThreads="8" useInplaceTransform="false" hideWarnings="false" createStaticRefs="true" fork="true" skipUnmodifiedModels="${'$'}{mps.generator.skipUnmodifiedModels}">
              <plugin path="${'$'}{artifacts.mps}/plugins/mps-build" />
              <plugin path="${'$'}{artifacts.mps}/plugins/mps-core" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/closures.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/collections.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.blTypes.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.classifiers.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.closures.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.collections.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.javadoc.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.jdk7.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.jdk8.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.references.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.regexp.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.regexp.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.scopes.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.tuples.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguage.tuples.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/baseLanguage/jetbrains.mps.baseLanguageInternal.jar" />
              <library file="${'$'}{artifacts.mps}/languages/editor/jetbrains.mps.editor.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/editor/jetbrains.mps.editorlang.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/editor/jetbrains.mps.ide.editor.jar" />
              <library file="${'$'}{artifacts.mps}/languages/editor/typesystemIntegration.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.baseLanguage.lightweightdsl.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.actions.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.behavior.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.checkedName.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.constraints.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.core.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.dataFlow.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.editor.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.findUsages.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.generator.generationContext.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.generator.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.intentions.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.migration.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.modelapi.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.pattern.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.plugin.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.project.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.quotation.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.refactoring.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.resources.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.scopes.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.script.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.sharedConcepts.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.smodel.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.smodel.query.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.structure.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.textGen.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.traceable.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.lang.typesystem.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.refactoring.participant.jar" />
              <library file="${'$'}{artifacts.mps}/languages/languageDesign/jetbrains.mps.typesystemEngine.jar" />
              <library file="${'$'}{artifacts.mps}/languages/make/jetbrains.mps.make.facets.jar" />
              <library file="${'$'}{artifacts.mps}/languages/make/jetbrains.mps.make.jar" />
              <library file="${'$'}{artifacts.mps}/languages/make/jetbrains.mps.make.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/make/jetbrains.mps.smodel.resources.jar" />
              <library file="${'$'}{artifacts.mps}/languages/mps-stubs.jar" />
              <library file="${'$'}{artifacts.mps}/languages/plaf/jetbrains.mps.baseLanguage.search.jar" />
              <library file="${'$'}{artifacts.mps}/languages/plaf/jetbrains.mps.baseLanguage.util.jar" />
              <library file="${'$'}{artifacts.mps}/languages/plaf/jetbrains.mps.ide.platform.jar" />
              <library file="${'$'}{artifacts.mps}/languages/plaf/jetbrains.mps.ide.refactoring.platform.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.analyzers.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.dataFlow.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.findUsages.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.lang.behavior.api.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.lang.feedback.context.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.lang.migration.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.lang.smodel.query.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/runtimes/jetbrains.mps.refactoring.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/text/jetbrains.mps.lang.text.jar" />
              <library file="${'$'}{artifacts.mps}/languages/tools/jetbrains.mps.core.tool.environment.jar" />
              <library file="${'$'}{artifacts.mps}/languages/tools/jetbrains.mps.tool.common.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.java.stub.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.kernel.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.lang.makeup.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.project.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.refactoring.jar" />
              <library file="${'$'}{artifacts.mps}/languages/util/jetbrains.mps.runtime.jar" />
              <library file="${'$'}{artifacts.mps}/languages/xml/jetbrains.mps.core.xml.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.build.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.build.mps.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.build.startup.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.build.workflow.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.build.workflow.preset.jar" />
              <library file="${'$'}{artifacts.mps}/plugins/mps-build/languages/build/jetbrains.mps.ide.build.jar" />
              <chunk>
                <module file="${'$'}{basedir}/code/buildscripts/solutions/${context.buildModule.name}/${context.buildModule.name}.msd" />
              </chunk>
              <jvmargs>
                <arg value="-ea" />
                <arg value="-Xmx512m" />
              </jvmargs>
              <macro name="mps_home" path="${'$'}{mps_home}" />
            </generate>
          </target>
          
          <target name="declare-mps-tasks">
            <taskdef resource="jetbrains/mps/build/ant/antlib.xml" classpathref="path.mps.ant.path" />
          </target>
          
          <target name="makeDependents" />
          
          <target name="java.compile.${context.buildModule.name}">
            <mkdir dir="${'$'}{basedir}/code/buildscripts/solutions/${context.buildModule.name}/source_gen" />
            <mkdir dir="${'$'}{build.tmp}/java/out/${context.buildModule.name}" />
            <javac destdir="${'$'}{build.tmp}/java/out/${context.buildModule.name}" fork="true" encoding="utf8" includeantruntime="false" debug="true">
              <compilerarg value="-Xlint:none" />
              <src>
                <path location="${'$'}{basedir}/code/buildscripts/solutions/${context.buildModule.name}/source_gen" />
              </src>
              <classpath />
            </javac>
          </target>
          
          <target name="cleanSources">
            <delete dir="${'$'}{basedir}/code/buildscripts/solutions/${context.buildModule.name}/source_gen" />
          </target>
        </project>
    """.trimIndent())
}
