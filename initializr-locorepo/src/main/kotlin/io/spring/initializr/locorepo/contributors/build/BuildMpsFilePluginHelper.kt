package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsPluginNode(context: ProjectGenerationContext): String = """
    <node concept="1l3spW" id="1LFOa1yjA${'$'}U">
      <property role="2DA0ip" value="../../../../"/>
      <property role="TrG5h" value="${context.projectDescription.artifactId}_Plugin"/>
      <property role="turDy" value="build-plugin.xml"/>
      <node concept="2sgV4H" id="1LFOa1yjAAu" role="1l3spa">
        <ref role="1l3spb" to="ffeo:3IKDaVZmzS6" resolve="mps"/>
        <node concept="398BVA" id="1LFOa1yjAAx" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjAAB" role="1l3spa">
        <ref role="1l3spb" to="ffeo:1diLdO26mQ6" resolve="mpsStandalone"/>
        <node concept="398BVA" id="1LFOa1yjAAG" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjAAO" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5rNMDvYzelV" resolve="mpsMakePlugin"/>
        <node concept="398BVA" id="1LFOa1yjAAV" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="1LFOa1yjAB0" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjABb" role="1l3spa">
        <ref role="1l3spb" to="ffeo:1lMM4owFq4Y" resolve="mpsVcs"/>
        <node concept="398BVA" id="1LFOa1yjABl" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="1LFOa1yjABq" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjABC" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5yMuYWFN8P1" resolve="mpsPlugins"/>
        <node concept="398BVA" id="1LFOa1yjABP" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="1LFOa1yjABU" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="1LFOa1yjACb" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5xa9wY2vh7j" resolve="mpsExecutionPlugin"/>
        <node concept="398BVA" id="1LFOa1yjACr" role="2JcizS">
          <ref role="398BVh" node="1LFOa1yjAA5" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="1LFOa1yjACw" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="10PD9b" id="1LFOa1yjA${'$'}Z" role="10PD9s"/>
      <node concept="3b7kt6" id="1LFOa1yjA_5" role="10PD9s"/>
      <node concept="55IIr" id="1LFOa1yjA${'$'}V" role="auvoZ">
        <node concept="2Ry0Ak" id="6yX_AXdi_td" role="iGT6I">
          <property role="2Ry0Am" value="build"/>
        </node>
      </node>
      <node concept="1l3spV" id="1LFOa1yjA${'$'}W" role="1l3spN">
        <node concept="3981dG" id="3PswS${'$'}xW29D" role="39821P">
          <node concept="3_J27D" id="3PswS${'$'}xW29E" role="Nbhlr">
            <node concept="3Mxwew" id="3PswS${'$'}xW29H" role="3MwsjC">
              <property role="3MwjfP" value="${context.language.name}.zip"/>
            </node>
          </node>
          <node concept="m${'$'}_wl" id="3PswS${'$'}xWsqQ" role="39821P">
            <ref role="m_rDy" node="3PswS${'$'}xWhcN" resolve="${context.language.name}"/>
            <node concept="pUk6x" id="3PswS${'$'}xWsqU" role="pUk7w"/>
          </node>
        </node>
      </node>
      <node concept="2kB4xC" id="1LFOa1yjA_f" role="1l3spd">
        <property role="TrG5h" value="date"/>
        <node concept="hHN3E" id="1LFOa1yjA_h" role="aVJcv">
          <property role="hHN3Y" value="yyyyMMdd"/>
        </node>
      </node>
      <node concept="2kB4xC" id="1LFOa1yjA_n" role="1l3spd">
        <property role="TrG5h" value="build.number"/>
        <node concept="aVJcg" id="1LFOa1yjA_u" role="aVJcv">
          <node concept="NbPM2" id="1LFOa1yjA_t" role="aVJcq">
            <node concept="3Mxwew" id="1LFOa1yjA_s" role="3MwsjC">
              <property role="3MwjfP" value="1-SNAPSHOT"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="2kB4xC" id="1LFOa1yjA_E" role="1l3spd">
        <property role="TrG5h" value="ide-version"/>
        <node concept="aVJcg" id="1LFOa1yjA_P" role="aVJcv">
          <node concept="NbPM2" id="1LFOa1yjA_O" role="aVJcq">
            <node concept="3Mxwew" id="1LFOa1yjA_N" role="3MwsjC">
              <property role="3MwjfP" value="0.1"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="1LFOa1yjAA5" role="1l3spd">
        <property role="TrG5h" value="mps_home"/>
        <node concept="55IIr" id="1LFOa1yjAAi" role="398pKh">
          <node concept="2Ry0Ak" id="1LFOa1yjAAl" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="62CzOEt12oU" role="2Ry0An">
              <property role="2Ry0Am" value="MPS 2020.2"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="m${'$'}_wf" id="3PswS${'$'}xWhcN" role="3989C9">
        <property role="m${'$'}_wk" value="${context.language.name}"/>
        <node concept="3_J27D" id="3PswS${'$'}xWhcP" role="m${'$'}_yQ">
          <node concept="3Mxwew" id="3PswS${'$'}xWhdr" role="3MwsjC">
            <property role="3MwjfP" value="${context.language.name}"/>
          </node>
        </node>
        <node concept="3_J27D" id="3PswS${'$'}xWhcR" role="m_cZH">
          <node concept="3Mxwew" id="3PswS${'$'}xWhdt" role="3MwsjC">
            <property role="3MwjfP" value="${context.projectDescription.artifactId}"/>
          </node>
        </node>
        <node concept="3_J27D" id="3PswS${'$'}xWhcT" role="m${'$'}_w8">
          <node concept="3Mxwew" id="3PswS${'$'}xWhdv" role="3MwsjC">
            <property role="3MwjfP" value="1.0"/>
          </node>
        </node>
        <node concept="m${'$'}_yB" id="3PswS${'$'}xWtY7" role="m${'$'}_yh">
          <ref role="m${'$'}_yA" node="3PswS${'$'}xWtWg" resolve="${context.language.name}"/>
        </node>
        <node concept="m${'$'}_yC" id="3PswS${'$'}xWtY9" role="m${'$'}_yJ">
          <ref role="m${'$'}_y1" to="ffeo:4k71ibbKLe8" resolve="jetbrains.mps.core"/>
        </node>
      </node>
      <node concept="2G${'$'}12M" id="3PswS${'$'}xWtW6" role="3989C9">
        <property role="TrG5h" value="${context.projectDescription.artifactId}-plugin"/>
        <node concept="1E1JtD" id="3PswS${'$'}xWtWg" role="2G${'$'}12L">
          <property role="BnDLt" value="true"/>
          <property role="TrG5h" value="${context.language.name}"/>
          <property role="3LESm3" value="${context.language.id}"/>
          <node concept="55IIr" id="3PswS${'$'}xWtWh" role="3LF7KH">
            <node concept="2Ry0Ak" id="3PswS${'$'}xWtWv" role="iGT6I">
              <property role="2Ry0Am" value="code"/>
              <node concept="2Ry0Ak" id="3PswS${'$'}xWtW${'$'}" role="2Ry0An">
                <property role="2Ry0Am" value="${context.projectDescription.artifactId}"/>
                <node concept="2Ry0Ak" id="3PswS${'$'}xWtWD" role="2Ry0An">
                  <property role="2Ry0Am" value="languages"/>
                  <node concept="2Ry0Ak" id="3PswS${'$'}xWtWI" role="2Ry0An">
                    <property role="2Ry0Am" value="${context.language.name}"/>
                    <node concept="2Ry0Ak" id="3PswS${'$'}xWtWN" role="2Ry0An">
                      <property role="2Ry0Am" value="${context.language.name}.mpl"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1BupzO" id="3PswS${'$'}xWtWV" role="3bR31x">
            <property role="3ZfqAx" value="models"/>
            <property role="1Hdu6h" value="true"/>
            <property role="1HemKv" value="true"/>
            <node concept="3LXTmp" id="3PswS${'$'}xWtWW" role="1HemKq">
              <node concept="55IIr" id="3PswS${'$'}xWtWP" role="3LXTmr">
                <node concept="2Ry0Ak" id="3PswS${'$'}xWtWQ" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="3PswS${'$'}xWtWR" role="2Ry0An">
                    <property role="2Ry0Am" value="${context.projectDescription.artifactId}"/>
                    <node concept="2Ry0Ak" id="3PswS${'$'}xWtWS" role="2Ry0An">
                      <property role="2Ry0Am" value="languages"/>
                      <node concept="2Ry0Ak" id="3PswS${'$'}xWtWT" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.language.name}"/>
                        <node concept="2Ry0Ak" id="3PswS${'$'}xWtWU" role="2Ry0An">
                          <property role="2Ry0Am" value="models"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3qWCbU" id="3PswS${'$'}xWtWX" role="3LXTna">
                <property role="3qWCbO" value="**/*.mps, **/*.mpsr, **/.model"/>
              </node>
            </node>
          </node>
          <node concept="1yeLz9" id="3PswS${'$'}xWtWY" role="1TViLv">
            <property role="TrG5h" value="${context.language.generator.name}"/>
            <property role="3LESm3" value="${context.language.generator.id}"/>
            <node concept="1BupzO" id="3PswS${'$'}xWtX6" role="3bR31x">
              <property role="3ZfqAx" value="generator/templates"/>
              <property role="1Hdu6h" value="true"/>
              <property role="1HemKv" value="true"/>
              <node concept="3LXTmp" id="3PswS${'$'}xWtX7" role="1HemKq">
                <node concept="55IIr" id="3PswS${'$'}xWtWZ" role="3LXTmr">
                  <node concept="2Ry0Ak" id="3PswS${'$'}xWtX0" role="iGT6I">
                    <property role="2Ry0Am" value="code"/>
                    <node concept="2Ry0Ak" id="3PswS${'$'}xWtX1" role="2Ry0An">
                      <property role="2Ry0Am" value="${context.projectDescription.artifactId}"/>
                      <node concept="2Ry0Ak" id="3PswS${'$'}xWtX2" role="2Ry0An">
                        <property role="2Ry0Am" value="languages"/>
                        <node concept="2Ry0Ak" id="3PswS${'$'}xWtX3" role="2Ry0An">
                          <property role="2Ry0Am" value="${context.language.name}"/>
                          <node concept="2Ry0Ak" id="3PswS${'$'}xWtX4" role="2Ry0An">
                            <property role="2Ry0Am" value="generator"/>
                            <node concept="2Ry0Ak" id="3PswS${'$'}xWtX5" role="2Ry0An">
                              <property role="2Ry0Am" value="templates"/>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3qWCbU" id="3PswS${'$'}xWtX8" role="3LXTna">
                  <property role="3qWCbO" value="**/*.mps, **/*.mpsr, **/.model"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
""".trimIndent()
