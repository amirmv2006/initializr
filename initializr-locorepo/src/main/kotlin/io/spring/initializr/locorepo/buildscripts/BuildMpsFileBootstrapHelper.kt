package io.spring.initializr.locorepo.buildscripts

import io.spring.initializr.locorepo.LanguageGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsBoostrapNode(context: LanguageGenerationContext): String = """
    <node concept="1l3spW" id="1LFOa1yjumL">
      <property role="TrG5h" value="${context.projectDescription.artifactId}_Bootstrap"/>
      <property role="2DA0ip" value="../"/>
      <property role="turDy" value="build-bootstrap.xml"/>
      <node concept="1E1JtA" id="2M3RW7Pnv3_" role="3989C9">
        <property role="BnDLt" value="true"/>
        <property role="TrG5h" value="${context.langBuildModule.name}"/>
        <property role="3LESm3" value="${context.langBuildModule.id}"/>
        <node concept="55IIr" id="2M3RW7Pnv3B" role="3LF7KH">
            <node concept="2Ry0Ak" id="2M3RW7Pnv3T" role="iGT6I">
                <property role="2Ry0Am" value="code"/>
                <node concept="2Ry0Ak" id="2M3RW7Pnv3Y" role="2Ry0An">
                    <property role="2Ry0Am" value="${context.projectDescription.artifactId}"/>
                    <node concept="2Ry0Ak" id="2M3RW7Pnv43" role="2Ry0An">
                        <property role="2Ry0Am" value="buildsolution"/>
                        <node concept="2Ry0Ak" id="2M3RW7Pnv48" role="2Ry0An">
                            <property role="2Ry0Am" value="${context.langBuildModule.name}.msd"/>
                        </node>
                    </node>
                </node>
            </node>
        </node>
        <node concept="1SiIV0" id="2M3RW7Pnv4a" role="3bR37C">
            <node concept="3bR9La" id="2M3RW7Pnv4b" role="1SiIV1">
                <ref role="3bR37D" to="ffeo:78GwwOvB3tw" resolve="jetbrains.mps.ide.build"/>
            </node>
        </node>
        <node concept="1BupzO" id="2M3RW7Pnv4h" role="3bR31x">
            <property role="3ZfqAx" value="models"/>
            <property role="1Hdu6h" value="true"/>
            <property role="1HemKv" value="true"/>
            <node concept="3LXTmp" id="2M3RW7Pnv4i" role="1HemKq">
                <node concept="55IIr" id="2M3RW7Pnv4c" role="3LXTmr">
                    <node concept="2Ry0Ak" id="2M3RW7Pnv4d" role="iGT6I">
                        <property role="2Ry0Am" value="code"/>
                        <node concept="2Ry0Ak" id="2M3RW7Pnv4e" role="2Ry0An">
                            <property role="2Ry0Am" value="${context.projectDescription.artifactId}"/>
                            <node concept="2Ry0Ak" id="2M3RW7Pnv4f" role="2Ry0An">
                                <property role="2Ry0Am" value="buildsolution"/>
                                <node concept="2Ry0Ak" id="2M3RW7Pnv4g" role="2Ry0An">
                                    <property role="2Ry0Am" value="models"/>
                                </node>
                            </node>
                        </node>
                    </node>
                </node>
                <node concept="3qWCbU" id="2M3RW7Pnv4j" role="3LXTna">
                    <property role="3qWCbO" value="**/*.mps, **/*.mpsr, **/.model"/>
                </node>
            </node>
        </node>
      </node>
      <node concept="1E1JtA" id="1LFOa1yjuoF" role="3989C9">
        <property role="TrG5h" value="${context.buildModule.name}"/>
        <property role="BnDLt" value="true"/>
        <property role="3LESm3" value="${context.buildModule.id}"/>
        <node concept="55IIr" id="1LFOa1yjuoH" role="3LF7KH">
          <node concept="2Ry0Ak" id="1LFOa1yjuoN" role="iGT6I">
            <property role="2Ry0Am" value="buildscripts"/>
            <node concept="2Ry0Ak" id="1LFOa1yjuoX" role="2Ry0An">
              <property role="2Ry0Am" value="${context.buildModule.name}.msd"/>
            </node>
          </node>
        </node>
        <node concept="1SiIV0" id="1LFOa1yj_re" role="3bR37C">
          <node concept="3bR9La" id="1LFOa1yj_rf" role="1SiIV1">
            <ref role="3bR37D" to="ffeo:78GwwOvB3tw" resolve="jetbrains.mps.ide.build"/>
          </node>
        </node>
        <node concept="1BupzO" id="1LFOa1yj_rm" role="3bR31x">
          <property role="3ZfqAx" value="models"/>
          <property role="1Hdu6h" value="true"/>
          <property role="1HemKv" value="true"/>
          <node concept="3LXTmp" id="1LFOa1yj_rn" role="1HemKq">
            <node concept="55IIr" id="1LFOa1yj_rg" role="3LXTmr">
              <node concept="2Ry0Ak" id="1LFOa1yj_rh" role="iGT6I">
                <property role="2Ry0Am" value="buildscripts"/>
                <node concept="2Ry0Ak" id="1LFOa1yj_rj" role="2Ry0An">
                    <property role="2Ry0Am" value="models"/>
                </node>
              </node>
            </node>
            <node concept="3qWCbU" id="1LFOa1yj_ro" role="3LXTna">
              <property role="3qWCbO" value="**/*.mps, **/*.mpsr, **/.model"/>
            </node>
          </node>
        </node>
        <node concept="1SiIV0" id="2M3RW7Pnv4N" role="3bR37C">
            <node concept="3bR9La" id="2M3RW7Pnv4O" role="1SiIV1">
              <ref role="3bR37D" node="2M3RW7Pnv3_" resolve="${context.langBuildModule.name}" />
            </node>
        </node>
      </node>
      <node concept="3b7kt6" id="1LFOa1yjumN" role="10PD9s"/>
      <node concept="398rNT" id="1LFOa1yjumO" role="1l3spd">
        <property role="TrG5h" value="mps_home"/>
        <node concept="55IIr" id="1LFOa1yjunO" role="398pKh">
          <node concept="2Ry0Ak" id="1LFOa1yjunR" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="1LFOa1yjunW" role="2Ry0An">
              <property role="2Ry0Am" value="MPS 2020.2"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjumP" role="1l3spa">
        <ref role="1l3spb" to="ffeo:3IKDaVZmzS6" resolve="mps"/>
        <node concept="398BVA" id="1LFOa1yjumQ" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjumO" resolve="mps_home"/>
        </node>
      </node>
      <node concept="1l3spV" id="1LFOa1yjunl" role="1l3spN"/>
    </node>
""".trimIndent()
