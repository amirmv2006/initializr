package io.spring.initializr.locorepo.buildscripts

import io.spring.initializr.locorepo.LanguageGenerationContext
import org.intellij.lang.annotations.Language

fun buildModuleToOutputFolder(context: LanguageGenerationContext, mostNestedValue: String, id: String): String {
    val lastChar = id[id.length - 1]
    return treeNameToNestedTags(
            treeName = context.buildModule.models[0].name,
            theMostNested = """<property role="2Ry0Am" value="$mostNestedValue"/>""",
            closingTag = "</node>",
            indexedConsumer = { index, s -> """
                <property role="2Ry0Am" value="$s"/>
                <node concept="2Ry0Ak" id="${id.substring(0, id.length - 1) + lastChar.plus(index)}" role="2Ry0An">
            """.trimIndent() }
    )
}

fun treeNameToNestedTags(treeName: String, theMostNested: String, closingTag: String, indexedConsumer: (index: Int, String) -> String): String {
    return treeName.splitToSequence('.')
            .mapIndexed(indexedConsumer)
            .joinToString("") { it } +
            theMostNested +
            treeName.splitToSequence('.')
                    .map { closingTag }
                    .joinToString("") { it }
}

@Language("XML")
fun mpsBuildUsedLangs(): String = """
  <languages>
    <use id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build" version="0" />
    <use id="0cf935df-4699-4e9c-a132-fa109541cba3" name="jetbrains.mps.build.mps" version="7" />
    <use id="d5033cee-f632-44b6-b308-89d4fbde34ff" name="jetbrains.mps.build.startup" version="0" />
  </languages>
""".trimIndent()

@Language("XML")
fun mpsBuildImports(context: LanguageGenerationContext): String = """
  <imports>
    <import index="ffeo" ref="r:874d959d-e3b4-4d04-b931-ca849af130dd(jetbrains.mps.ide.build)" />
    <import index="lbv1" ref="${context.langBuildModule.models[0].modelReference()}" />
  </imports>
""".trimIndent()

@Language("XML")
fun mpsBuildRegistryBuildLang(): String = """
    <language id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build">
      <concept id="5481553824944787378"
        name="jetbrains.mps.build.structure.BuildSourceProjectRelativePath" flags="ng" index="55IIr"/>
      <concept id="9126048691955220717" name="jetbrains.mps.build.structure.BuildLayout_File" flags="ng"
        index="28jJK3">
        <property id="9126048691955221291" name="filemode" index="28jJZ5"/>
        <child id="9126048691955220774" name="parameters" index="28jJR8"/>
        <child id="9126048691955220762" name="path" index="28jJRO"/>
      </concept>
      <concept id="9126048691954557131" name="jetbrains.mps.build.structure.BuildLayout_Comment"
        flags="ng" index="28u9K_">
        <property id="9126048691954700811" name="text" index="28hIV_"/>
      </concept>
      <concept id="2755237150521975431"
        name="jetbrains.mps.build.structure.BuildVariableMacroInitWithString" flags="ng" index="aVJcg">
        <child id="2755237150521975437" name="value" index="aVJcq"/>
      </concept>
      <concept id="244868996532454372"
        name="jetbrains.mps.build.structure.BuildVariableMacroInitWithDate" flags="ng" index="hHN3E">
        <property id="244868996532454384" name="pattern" index="hHN3Y"/>
      </concept>
      <concept id="7321017245476976379" name="jetbrains.mps.build.structure.BuildRelativePath"
        flags="ng" index="iG8Mu">
        <child id="7321017245477039051" name="compositePart" index="iGT6I"/>
      </concept>
      <concept id="3767587139141066978" name="jetbrains.mps.build.structure.BuildVariableMacro"
        flags="ng" index="2kB4xC">
        <child id="2755237150521975432" name="initialValue" index="aVJcv"/>
      </concept>
      <concept id="4993211115183325728" name="jetbrains.mps.build.structure.BuildProjectDependency"
        flags="ng" index="2sgV4H">
        <reference id="5617550519002745380" name="script" index="1l3spb"/>
        <child id="4129895186893471026" name="artifacts" index="2JcizS"/>
      </concept>
      <concept id="7801138212747054656" name="jetbrains.mps.build.structure.BuildLayout_Filemode"
        flags="ng" index="yKbIv">
        <property id="7801138212747054660" name="filemode" index="yKbIr"/>
      </concept>
      <concept id="3970102152660702410" name="jetbrains.mps.build.structure.BuildLayout_CopyGlobMapper"
        flags="ng" index="2${'$'}gBol">
        <property id="3970102152660874508" name="from" index="2${'$'}htvj"/>
        <child id="3970102152660874509" name="to" index="2${'$'}htvi"/>
      </concept>
      <concept id="3970102152660876447" name="jetbrains.mps.build.structure.BuildLayout_CopyRegexMapper"
        flags="ng" index="2${'$'}htT0">
        <property id="3970102152660876449" name="replace" index="2${'$'}htTY"/>
        <property id="3970102152660876448" name="pattern" index="2${'$'}htTZ"/>
      </concept>
      <concept id="2750015747481074431" name="jetbrains.mps.build.structure.BuildLayout_Files"
        flags="ng" index="2HvfSZ">
        <child id="2750015747481074432" name="path" index="2HvfZ0"/>
        <child id="2750015747481074433" name="parameters" index="2HvfZ1"/>
      </concept>
      <concept id="4380385936562003279" name="jetbrains.mps.build.structure.BuildString" flags="ng"
        index="NbPM2">
        <child id="4903714810883783243" name="parts" index="3MwsjC"/>
      </concept>
      <concept id="8618885170173601777" name="jetbrains.mps.build.structure.BuildCompositePath"
        flags="nn" index="2Ry0Ak">
        <property id="8618885170173601779" name="head" index="2Ry0Am"/>
        <child id="8618885170173601778" name="tail" index="2Ry0An"/>
      </concept>
      <concept id="6647099934206700647" name="jetbrains.mps.build.structure.BuildJavaPlugin" flags="ng"
        index="10PD9b"/>
      <concept id="9184644532457106504"
        name="jetbrains.mps.build.structure.BuildLayout_CopyFilterReplaceRegex" flags="ng"
        index="1688n2">
        <property id="9184644532457106505" name="pattern" index="1688n3"/>
        <property id="9184644532457106508" name="flags" index="1688n6"/>
        <child id="9184644532457106506" name="value" index="1688n0"/>
      </concept>
      <concept id="7389400916848050074" name="jetbrains.mps.build.structure.BuildLayout_Jar" flags="ng"
        index="3981dx"/>
      <concept id="7389400916848050071" name="jetbrains.mps.build.structure.BuildLayout_Zip" flags="ng"
        index="3981dG"/>
      <concept id="7389400916848050060" name="jetbrains.mps.build.structure.BuildLayout_NamedContainer"
        flags="ng" index="3981dR">
        <child id="4380385936562148502" name="containerName" index="Nbhlr"/>
      </concept>
      <concept id="7389400916848036984" name="jetbrains.mps.build.structure.BuildLayout_Folder"
        flags="ng" index="398223"/>
      <concept id="7389400916848136194" name="jetbrains.mps.build.structure.BuildFolderMacro" flags="ng"
        index="398rNT">
        <child id="7389400916848144618" name="defaultPath" index="398pKh"/>
      </concept>
      <concept id="7389400916848153117"
        name="jetbrains.mps.build.structure.BuildSourceMacroRelativePath" flags="ng" index="398BVA">
        <reference id="7389400916848153130" name="macro" index="398BVh"/>
      </concept>
      <concept id="4198392933254416812"
        name="jetbrains.mps.build.structure.BuildLayout_CopyFilterFixCRLF" flags="ng" index="3co7Ac">
        <property id="4198392933254416822" name="eol" index="3co7Am"/>
        <property id="4198392933254551900" name="removeEOF" index="3cpA_W"/>
      </concept>
      <concept id="5617550519002745364" name="jetbrains.mps.build.structure.BuildLayout" flags="ng"
        index="1l3spV"/>
      <concept id="5617550519002745363" name="jetbrains.mps.build.structure.BuildProject" flags="ng"
        index="1l3spW">
        <property id="4915877860348071612" name="fileName" index="turDy"/>
        <property id="5204048710541015587" name="internalBaseDirectory" index="2DA0ip"/>
        <child id="4796668409958418110" name="scriptsDir" index="auvoZ"/>
        <child id="6647099934206700656" name="plugins" index="10PD9s"/>
        <child id="7389400916848080626" name="parts" index="3989C9"/>
        <child id="5617550519002745381" name="dependencies" index="1l3spa"/>
        <child id="5617550519002745378" name="macros" index="1l3spd"/>
        <child id="5617550519002745372" name="layout" index="1l3spN"/>
      </concept>
      <concept id="8654221991637384182" name="jetbrains.mps.build.structure.BuildFileIncludesSelector"
        flags="ng" index="3qWCbU">
        <property id="8654221991637384184" name="pattern" index="3qWCbO"/>
      </concept>
      <concept id="8577651205286814211" name="jetbrains.mps.build.structure.BuildLayout_Tar" flags="ng"
        index="1tmT9g">
        <property id="1979010778009209128" name="compression" index="AB_bT"/>
      </concept>
      <concept id="4701820937132344003" name="jetbrains.mps.build.structure.BuildLayout_Container"
        flags="ng" index="1y1bJS">
        <child id="7389400916848037006" name="children" index="39821P"/>
      </concept>
      <concept id="5610619299013057363" name="jetbrains.mps.build.structure.BuildLayout_ImportContent"
        flags="ng" index="3ygNvl">
        <reference id="5610619299013057365" name="target" index="3ygNvj"/>
        <child id="6789562173791401562" name="selectors" index="1juEy9"/>
      </concept>
      <concept id="7753544965996647428" name="jetbrains.mps.build.structure.BuildLayout_FilesOf"
        flags="ng" index="1zDrgl">
        <reference id="7753544965996647430" name="element" index="1zDrgn"/>
      </concept>
      <concept id="841011766565753074" name="jetbrains.mps.build.structure.BuildLayout_Import"
        flags="ng" index="3_I8Xc">
        <reference id="841011766565753076" name="target" index="3_I8Xa"/>
      </concept>
      <concept id="841011766566059607" name="jetbrains.mps.build.structure.BuildStringNotEmpty"
        flags="ng" index="3_J27D"/>
      <concept id="5248329904288051111" name="jetbrains.mps.build.structure.BuildFileExcludeSelector"
        flags="ng" index="3LWZYq">
        <property id="5248329904288051112" name="pattern" index="3LWZYl"/>
      </concept>
      <concept id="5248329904288051100" name="jetbrains.mps.build.structure.BuildFileIncludeSelector"
        flags="ng" index="3LWZYx">
        <property id="5248329904288051101" name="pattern" index="3LWZYw"/>
      </concept>
      <concept id="5248329904287794596" name="jetbrains.mps.build.structure.BuildInputFiles" flags="ng"
        index="3LXTmp">
        <child id="5248329904287794598" name="dir" index="3LXTmr"/>
        <child id="5248329904287794679" name="selectors" index="3LXTna"/>
      </concept>
      <concept id="4903714810883702019" name="jetbrains.mps.build.structure.BuildTextStringPart"
        flags="ng" index="3Mxwew">
        <property id="4903714810883755350" name="text" index="3MwjfP"/>
      </concept>
      <concept id="4903714810883702017" name="jetbrains.mps.build.structure.BuildVarRefStringPart"
        flags="ng" index="3Mxwey">
        <reference id="4903714810883702018" name="macro" index="3Mxwex"/>
      </concept>
      <concept id="202934866059043946" name="jetbrains.mps.build.structure.BuildLayout_EchoProperties"
        flags="ng" index="1TblL5">
        <child id="202934866059043948" name="fileName" index="1TblL3"/>
        <child id="202934866059043962" name="entries" index="1TblLl"/>
      </concept>
      <concept id="202934866059043959"
        name="jetbrains.mps.build.structure.BuildLayout_EchoPropertyEntry" flags="ng" index="1TblLo">
        <property id="202934866059043960" name="key" index="1TblLn"/>
        <child id="202934866059043961" name="value" index="1TblLm"/>
      </concept>
    </language>
""".trimIndent()

@Language("XML")
fun mpsBuildRegistryCoreLang(): String = """
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
""".trimIndent()

@Language("XML")
fun mpsBuildRegistryStartupLang(): String = """
    <language id="d5033cee-f632-44b6-b308-89d4fbde34ff" name="jetbrains.mps.build.startup">
      <concept id="3885435385580582153" name="jetbrains.mps.build.startup.structure.ClassPathItem" flags="ng" index="26EafG">
        <property id="3885435385580582154" name="path" index="26EafJ" />
      </concept>
      <concept id="3885435385580582152" name="jetbrains.mps.build.startup.structure.MpsStartupScript" flags="ng" index="26EafH">
        <property id="3885435385580582155" name="startupFolder" index="26EafI" />
        <property id="3885435385580631186" name="startupClass" index="26FY9R" />
        <reference id="3505522814897007561" name="branding" index="1_kbm${'$'}" />
        <child id="3885435385580582696" name="bootClasspath" index="26Ea7d" />
      </concept>
    </language>
""".trimIndent()

@Language("XML")
fun mpsBuildRegistryBuildMpsLang(): String = """
    <language id="0cf935df-4699-4e9c-a132-fa109541cba3" name="jetbrains.mps.build.mps">
      <concept id="6818892319992984815" name="jetbrains.mps.build.mps.structure.BuildMps_TipsPackage" flags="ng" index="20sUq0">
          <reference id="7323166234190549907" name="tips" index="21GgXK" />
      </concept>
      <concept id="6592112598314498932" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin" flags="ng" index="m${'$'}_wf">
        <property id="6592112598314498927" name="id" index="m${'$'}_wk" />
        <child id="6592112598314498931" name="version" index="m${'$'}_w8" />
        <child id="6592112598314499050" name="content" index="m${'$'}_yh" />
        <child id="6592112598314499028" name="dependencies" index="m${'$'}_yJ" />
        <child id="6592112598314499021" name="name" index="m${'$'}_yQ" />
        <child id="6592112598314855574" name="containerName" index="m_cZH" />
      </concept>
      <concept id="6592112598314498926" name="jetbrains.mps.build.mps.structure.BuildMpsLayout_Plugin" flags="ng" index="m${'$'}_wl">
        <reference id="6592112598314801433" name="plugin" index="m_rDy" />
        <child id="3570488090019868128" name="packagingType" index="pUk7w" />
      </concept>
      <concept id="6592112598314499036" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginModule" flags="ng" index="m${'$'}_yB">
        <reference id="6592112598314499037" name="target" index="m${'$'}_yA" />
      </concept>
      <concept id="6592112598314499027" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginDependency" flags="ng" index="m${'$'}_yC">
        <reference id="6592112598314499066" name="target" index="m${'$'}_y1" />
      </concept>
      <concept id="3570488090019868065" name="jetbrains.mps.build.mps.structure.BuildMpsLayout_AutoPluginLayoutType" flags="ng" index="pUk6x" />
      <concept id="1500819558095907805" name="jetbrains.mps.build.mps.structure.BuildMps_Group" flags="ng" index="2G${'$'}12M">
        <child id="1500819558095907806" name="modules" index="2G${'$'}12L" />
      </concept>
      <concept id="868032131020265945" name="jetbrains.mps.build.mps.structure.BuildMPSPlugin" flags="ng" index="3b7kt6" />
      <concept id="5253498789149381388" name="jetbrains.mps.build.mps.structure.BuildMps_Module" flags="ng" index="3bQrTs">
        <child id="5253498789149547825" name="sources" index="3bR31x" />
        <child id="5253498789149547704" name="dependencies" index="3bR37C" />
      </concept>
      <concept id="5253498789149585690" name="jetbrains.mps.build.mps.structure.BuildMps_ModuleDependencyOnModule" flags="ng" index="3bR9La">
        <reference id="5253498789149547705" name="module" index="3bR37D" />
      </concept>
      <concept id="8174907532631382425" name="jetbrains.mps.build.mps.structure.BuildMps_TipsMps" flags="ng" index="3jmSaf" />
      <concept id="8174907532628842428" name="jetbrains.mps.build.mps.structure.BuildMps_Tips" flags="ng" index="3jsGME">
          <child id="8174907532631382423" name="imports" index="3jmSa1" />
      </concept>
      <concept id="7753544965996377997" name="jetbrains.mps.build.mps.structure.BuildMps_Branding" flags="ng" index="1zClus">
          <property id="3497141547781541445" name="minor" index="2OjLBK" />
          <property id="3497141547781541444" name="major" index="2OjLBL" />
          <child id="6845119683729294884" name="progressColor" index="27hGoL" />
          <child id="922958177840117051" name="script" index="2gvbiD" />
          <child id="6108265972537182997" name="aboutScreen" index="2EqU2s" />
          <child id="6108265972537182996" name="splashScreen" index="2EqU2t" />
          <child id="6108265972537229337" name="buildNumber" index="2EteIg" />
          <child id="6108265972537229339" name="icon16" index="2EteIi" />
          <child id="6108265972537229338" name="icon32" index="2EteIj" />
          <child id="6108265972537372847" name="product" index="2EtHGA" />
          <child id="6108265972537372848" name="fullName" index="2EtHGT" />
          <child id="8795525031433238889" name="textColor" index="HFo83" />
          <child id="1462305029084462472" name="buildDate" index="R${'$'}TG_" />
          <child id="772379520210716142" name="welcomeLogo" index="3vi${'$'}VU" />
          <child id="1084163669516664629" name="copyrightForeground" index="3KTKoD" />
          <child id="1084163669516639223" name="foreground" index="3KTYbF" />
      </concept>
      <concept id="4278635856200817744" name="jetbrains.mps.build.mps.structure.BuildMps_ModuleModelRoot" flags="ng" index="1BupzO">
        <property id="8137134783396907368" name="convert2binary" index="1Hdu6h" />
        <property id="8137134783396676838" name="extracted" index="1HemKv" />
        <property id="2889113830911481881" name="deployFolderName" index="3ZfqAx" />
        <child id="8137134783396676835" name="location" index="1HemKq" />
      </concept>
      <concept id="3189788309731840247" name="jetbrains.mps.build.mps.structure.BuildMps_Solution" flags="ng" index="1E1JtA" />
      <concept id="322010710375871467" name="jetbrains.mps.build.mps.structure.BuildMps_AbstractModule" flags="ng" index="3LEN3z">
        <property id="8369506495128725901" name="compact" index="BnDLt" />
        <property id="322010710375892619" name="uuid" index="3LESm3" />
        <child id="322010710375956261" name="path" index="3LF7KH" />
      </concept>
      <concept id="7259033139236285166" name="jetbrains.mps.build.mps.structure.BuildMps_ExtractedModuleDependency" flags="nn" index="1SiIV0">
        <child id="7259033139236285167" name="dependency" index="1SiIV1" />
      </concept>
    </language>
""".trimIndent()

