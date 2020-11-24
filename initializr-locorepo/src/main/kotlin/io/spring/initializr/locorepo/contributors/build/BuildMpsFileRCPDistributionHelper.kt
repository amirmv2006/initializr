package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsRCPDistributionNode(context: ProjectGenerationContext): String = """
    <node concept="1l3spW" id="SSBTh98upq">
      <property role="TrG5h" value="${context.projectDescription.artifactId}_RCPDistrib"/>
      <property role="turDy" value="build-rcpdistrib.xml"/>
      <property role="2DA0ip" value="../../../.."/>
      <node concept="2sgV4H" id="SSBTh98upr" role="1l3spa">
        <ref role="1l3spb" node="SSBTh98un7" resolve="${context.projectDescription.artifactId}_RCP"/>
      </node>
      <node concept="1l3spV" id="SSBTh98ups" role="1l3spN">
        <node concept="1tmT9g" id="SSBTh98uqO" role="39821P">
          <property role="AB_bT" value="1HQQX4XU8${'$'}A/gzip"/>
          <node concept="3ygNvl" id="SSBTh98uqP" role="39821P">
            <ref role="3ygNvj" node="SSBTh98uoh"/>
          </node>
          <node concept="398223" id="SSBTh98uqQ" role="39821P">
            <node concept="3_J27D" id="SSBTh98uqR" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh98uqS" role="3MwsjC">
                <property role="3MwjfP" value="bin"/>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98uqT" role="39821P">
              <property role="28hIV_" value="Linux executable files and fsnotifier"/>
            </node>
            <node concept="yKbIv" id="SSBTh98uqU" role="39821P">
              <property role="yKbIr" value="755"/>
              <node concept="2HvfSZ" id="SSBTh98uqV" role="39821P">
                <node concept="398BVA" id="SSBTh98uqL" role="2HvfZ0">
                  <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="SSBTh98uqM" role="iGT6I">
                    <property role="2Ry0Am" value="bin"/>
                    <node concept="2Ry0Ak" id="SSBTh98uqN" role="2Ry0An">
                      <property role="2Ry0Am" value="linux"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98uqW" role="39821P">
              <property role="28hIV_" value="Startup options for 32 and 64 bit systems"/>
            </node>
            <node concept="28jJK3" id="SSBTh98uqX" role="39821P">
              <node concept="3co7Ac" id="SSBTh98uqY" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh98uqZ" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98upH" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98upI" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98upJ" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98upK" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98upL" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98upM" role="2Ry0An">
                            <property role="2Ry0Am" value="ir"/>
                            <node concept="2Ry0Ak" id="SSBTh98upN" role="2Ry0An">
                              <property role="2Ry0Am" value="amv"/>
                              <node concept="2Ry0Ak" id="SSBTh98upO" role="2Ry0An">
                                <property role="2Ry0Am" value="os"/>
                                <node concept="2Ry0Ak" id="SSBTh98upP" role="2Ry0An">
                                  <property role="2Ry0Am" value="snippets"/>
                                  <node concept="2Ry0Ak" id="SSBTh98upQ" role="2Ry0An">
                                    <property role="2Ry0Am"
                                      value="${context.projectDescription.artifactId}"/>
                                    <node concept="2Ry0Ak" id="SSBTh98upR" role="2Ry0An">
                                      <property role="2Ry0Am" value="ide"/>
                                      <node concept="2Ry0Ak" id="SSBTh98upS" role="2Ry0An">
                                        <property role="2Ry0Am" value="build"/>
                                        <node concept="2Ry0Ak" id="SSBTh98upT" role="2Ry0An">
                                          <property role="2Ry0Am" value="${context.ideFileName()}.vmoptions"/>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh98ur0" role="39821P">
              <node concept="3co7Ac" id="SSBTh98ur1" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh98ur2" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98upU" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98upV" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98upW" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98upX" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98upY" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98upZ" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh98uq0")}
                          </node> <!-- end of SSBTh98upZ -->
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98ur3" role="39821P">
              <property role="28hIV_" value="Linux startup script"/>
            </node>
            <node concept="28jJK3" id="SSBTh98ur4" role="39821P">
              <property role="28jJZ5" value="755"/>
              <node concept="3co7Ac" id="SSBTh98ur5" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh98ur6" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98uq7" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98uq8" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98uq9" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98uqa" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98uqb" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98uqc" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh98uqd")}
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="SSBTh98ur7" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98ur8" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98ur9" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh98ura" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98urb" role="3MwsjC">
              <property role="3MwjfP" value=".tar.gz"/>
            </node>
          </node>
        </node>
        <node concept="3981dG" id="SSBTh98uro" role="39821P">
          <node concept="3ygNvl" id="SSBTh98urp" role="39821P">
            <ref role="3ygNvj" node="SSBTh98uoh"/>
          </node>
          <node concept="398223" id="SSBTh98urq" role="39821P">
            <node concept="28u9K_" id="SSBTh98urr" role="39821P">
              <property role="28hIV_" value="Startup options for 32 and 64 bit systems"/>
            </node>
            <node concept="3_J27D" id="SSBTh98urs" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh98urt" role="3MwsjC">
                <property role="3MwjfP" value="bin"/>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh98uru" role="39821P">
              <node concept="2${'$'}gBol" id="SSBTh98urv" role="28jJR8">
                <property role="2${'$'}htvj" value="*"/>
                <node concept="NbPM2" id="SSBTh98urw" role="2${'$'}htvi">
                  <node concept="3Mxwew" id="SSBTh98urx" role="3MwsjC">
                    <property role="3MwjfP" value="${context.ideFileName()}.exe.vmoptions"/>
                  </node>
                </node>
              </node>
              <node concept="3co7Ac" id="SSBTh98ury" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh98urz" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98ur${'$'}" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98ur_" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98urA" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98urB" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98urC" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98urD" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}.vmoptions", "SSBTh98urE")}
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh98urL" role="39821P">
              <node concept="2${'$'}gBol" id="SSBTh98urM" role="28jJR8">
                <property role="2${'$'}htvj" value="*"/>
                <node concept="NbPM2" id="SSBTh98urN" role="2${'$'}htvi">
                  <node concept="3Mxwew" id="SSBTh98urO" role="3MwsjC">
                    <property role="3MwjfP" value="${context.ideFileName()}64.exe.vmoptions"/>
                  </node>
                </node>
              </node>
              <node concept="3co7Ac" id="SSBTh98urP" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh98urQ" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98urR" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98urS" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98urT" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98urU" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98urV" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98urW" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh98us0")}
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98urX" role="39821P">
              <property role="28hIV_" value="Required files for execution"/>
            </node>
            <node concept="2HvfSZ" id="SSBTh98urY" role="39821P">
              <node concept="3LWZYq" id="SSBTh98urZ" role="2HvfZ1">
                <property role="3LWZYl" value="**/*.exe"/>
              </node>
              <node concept="3LWZYq" id="SSBTh98us7" role="2HvfZ1">
                <property role="3LWZYl" value="**/*.bat"/>
              </node>
              <node concept="398BVA" id="SSBTh98urf" role="2HvfZ0">
                <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                <node concept="2Ry0Ak" id="SSBTh98urg" role="iGT6I">
                  <property role="2Ry0Am" value="bin"/>
                  <node concept="2Ry0Ak" id="SSBTh98urh" role="2Ry0An">
                    <property role="2Ry0Am" value="win"/>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98us8" role="39821P">
              <property role="28hIV_" value="Windows executable files and fsnotifier"/>
            </node>
            <node concept="yKbIv" id="SSBTh98us9" role="39821P">
              <property role="yKbIr" value="755"/>
              <node concept="2HvfSZ" id="SSBTh98usa" role="39821P">
                <node concept="3LWZYx" id="SSBTh98usb" role="2HvfZ1">
                  <property role="3LWZYw" value="**/*.exe"/>
                </node>
                <node concept="3LWZYx" id="SSBTh98usc" role="2HvfZ1">
                  <property role="3LWZYw" value="**/append.bat"/>
                </node>
                <node concept="398BVA" id="SSBTh98url" role="2HvfZ0">
                  <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="SSBTh98urm" role="iGT6I">
                    <property role="2Ry0Am" value="bin"/>
                    <node concept="2Ry0Ak" id="SSBTh98urn" role="2Ry0An">
                      <property role="2Ry0Am" value="win"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh98usd" role="39821P">
              <property role="28hIV_" value="Startup .bat file"/>
            </node>
            <node concept="28jJK3" id="SSBTh98use" role="39821P">
              <property role="28jJZ5" value="755"/>
              <node concept="3co7Ac" id="SSBTh98usf" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh98usg" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh98uqk" role="iGT6I">
                  <property role="2Ry0Am" value="code"/>
                  <node concept="2Ry0Ak" id="SSBTh98uql" role="2Ry0An">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh98uqm" role="2Ry0An">
                      <property role="2Ry0Am" value="solutions"/>
                      <node concept="2Ry0Ak" id="SSBTh98uqn" role="2Ry0An">
                        <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                        <node concept="2Ry0Ak" id="SSBTh98uqo" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh98uqp" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}.bat", "SSBTh98uqq")}
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="SSBTh98ush" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98usi" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98usj" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh98usk" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98usl" role="3MwsjC">
              <property role="3MwjfP" value=".win.zip"/>
            </node>
          </node>
        </node>
        <node concept="3981dG" id="SSBTh98ut0" role="39821P">
          <node concept="3_J27D" id="SSBTh98ut1" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98ut2" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98ut3" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh98ut4" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh98ut5" role="3MwsjC">
              <property role="3MwjfP" value=".macos.zip"/>
            </node>
          </node>
          <node concept="398223" id="SSBTh98ut6" role="39821P">
            <node concept="398223" id="SSBTh98ut7" role="39821P">
              <node concept="3ygNvl" id="SSBTh98ut8" role="39821P">
                <ref role="3ygNvj" node="SSBTh98uoh"/>
              </node>
              <node concept="3_J27D" id="SSBTh98ut9" role="Nbhlr">
                <node concept="3Mxwew" id="SSBTh98uta" role="3MwsjC">
                  <property role="3MwjfP" value="Contents"/>
                </node>
              </node>
              <node concept="398223" id="SSBTh98utb" role="39821P">
                <node concept="3_J27D" id="SSBTh98utc" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh98utd" role="3MwsjC">
                    <property role="3MwjfP" value="Resources"/>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh98ute" role="39821P">
                  <property role="28hIV_" value="TODO: replace with product icon"/>
                </node>
                <node concept="28jJK3" id="SSBTh98utf" role="39821P">
                  <node concept="398BVA" id="SSBTh98uss" role="28jJRO">
                    <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                    <node concept="2Ry0Ak" id="SSBTh98ust" role="iGT6I">
                      <property role="2Ry0Am" value="bin"/>
                      <node concept="2Ry0Ak" id="SSBTh98usu" role="2Ry0An">
                        <property role="2Ry0Am" value="mac"/>
                        <node concept="2Ry0Ak" id="SSBTh98usv" role="2Ry0An">
                          <property role="2Ry0Am" value="Contents"/>
                          <node concept="2Ry0Ak" id="SSBTh98usw" role="2Ry0An">
                            <property role="2Ry0Am" value="Resources"/>
                            <node concept="2Ry0Ak" id="SSBTh98usx" role="2Ry0An">
                              <property role="2Ry0Am" value="mps.icns"/>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="28u9K_" id="SSBTh98utg" role="39821P">
                <property role="28hIV_" value="MacOSX executable to run application"/>
              </node>
              <node concept="398223" id="SSBTh98uth" role="39821P">
                <node concept="28jJK3" id="SSBTh98uti" role="39821P">
                  <property role="28jJZ5" value="755"/>
                  <node concept="398BVA" id="SSBTh98usC" role="28jJRO">
                    <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                    <node concept="2Ry0Ak" id="SSBTh98usD" role="iGT6I">
                      <property role="2Ry0Am" value="bin"/>
                      <node concept="2Ry0Ak" id="SSBTh98usE" role="2Ry0An">
                        <property role="2Ry0Am" value="mac"/>
                        <node concept="2Ry0Ak" id="SSBTh98usF" role="2Ry0An">
                          <property role="2Ry0Am" value="Contents"/>
                          <node concept="2Ry0Ak" id="SSBTh98usG" role="2Ry0An">
                            <property role="2Ry0Am" value="MacOS"/>
                            <node concept="2Ry0Ak" id="SSBTh98usH" role="2Ry0An">
                              <property role="2Ry0Am" value="mps"/>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2${'$'}gBol" id="SSBTh98utj" role="28jJR8">
                    <property role="2${'$'}htvj" value="*"/>
                    <node concept="NbPM2" id="SSBTh98utk" role="2${'$'}htvi">
                      <node concept="3Mxwew" id="SSBTh98utl" role="3MwsjC">
                        <property role="3MwjfP" value="${context.ideFileName()}"/>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3_J27D" id="SSBTh98utm" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh98utn" role="3MwsjC">
                    <property role="3MwjfP" value="MacOS"/>
                  </node>
                </node>
              </node>
              <node concept="28u9K_" id="SSBTh98uto" role="39821P">
                <property role="28hIV_" value="Fill Info.plist with current build version and number"/>
              </node>
              <node concept="28jJK3" id="SSBTh98utp" role="39821P">
                <node concept="55IIr" id="SSBTh98utq" role="28jJRO">
                  <node concept="2Ry0Ak" id="SSBTh98uqx" role="iGT6I">
                    <property role="2Ry0Am" value="code"/>
                    <node concept="2Ry0Ak" id="SSBTh98uqy" role="2Ry0An">
                      <property role="2Ry0Am" value="buildscripts"/>
                      <node concept="2Ry0Ak" id="SSBTh98uqz" role="2Ry0An">
                        <property role="2Ry0Am" value="solutions"/>
                        <node concept="2Ry0Ak" id="SSBTh98uq${'$'}" role="2Ry0An">
                          <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                          <node concept="2Ry0Ak" id="SSBTh98uq_" role="2Ry0An">
                            <property role="2Ry0Am" value="source_gen"/>
                            <node concept="2Ry0Ak" id="SSBTh98uqA" role="2Ry0An">
                              ${buildModuleToOutputFolder(context, "Info.plist.xml", "SSBTh98uqB")}
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2${'$'}gBol" id="SSBTh98utr" role="28jJR8">
                  <property role="2${'$'}htvj" value="*"/>
                  <node concept="NbPM2" id="SSBTh98uts" role="2${'$'}htvi">
                    <node concept="3Mxwew" id="SSBTh98utt" role="3MwsjC">
                      <property role="3MwjfP" value="Info.plist"/>
                    </node>
                  </node>
                </node>
                <node concept="1688n2" id="SSBTh98utu" role="28jJR8">
                  <property role="1688n3" value="\${'$'}version\${'$'}"/>
                  <node concept="NbPM2" id="SSBTh98utv" role="1688n0">
                    <node concept="3Mxwey" id="SSBTh98utw" role="3MwsjC">
                      <ref role="3Mxwex" node="SSBTh98upu" resolve="version"/>
                    </node>
                  </node>
                </node>
                <node concept="1688n2" id="SSBTh98utx" role="28jJR8">
                  <property role="1688n3" value="\${'$'}build\${'$'}"/>
                  <node concept="NbPM2" id="SSBTh98uty" role="1688n0">
                    <node concept="3Mxwey" id="SSBTh98utz" role="3MwsjC">
                      <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
                    </node>
                  </node>
                </node>
                <node concept="3co7Ac" id="SSBTh98ut${'$'}" role="28jJR8">
                  <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                  <property role="3cpA_W" value="true"/>
                </node>
              </node>
              <node concept="398223" id="SSBTh98ut_" role="39821P">
                <node concept="3_J27D" id="SSBTh98utA" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh98utB" role="3MwsjC">
                    <property role="3MwjfP" value="bin"/>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh98utC" role="39821P">
                  <property role="28hIV_" value="Executable files and fsnotifier"/>
                </node>
                <node concept="yKbIv" id="SSBTh98utD" role="39821P">
                  <property role="yKbIr" value="755"/>
                  <node concept="2HvfSZ" id="SSBTh98utE" role="39821P">
                    <node concept="3LWZYq" id="SSBTh98utF" role="2HvfZ1">
                      <property role="3LWZYl" value="**/*.dylib"/>
                    </node>
                    <node concept="3LWZYq" id="SSBTh98utG" role="2HvfZ1">
                      <property role="3LWZYl" value="**/*.py"/>
                    </node>
                    <node concept="398BVA" id="SSBTh98usL" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh98usM" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="SSBTh98usN" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh98utH" role="39821P">
                  <property role="28hIV_" value="Python script with updated end of line"/>
                </node>
                <node concept="yKbIv" id="SSBTh98utI" role="39821P">
                  <property role="yKbIr" value="755"/>
                  <node concept="2HvfSZ" id="SSBTh98utJ" role="39821P">
                    <node concept="3LWZYx" id="SSBTh98utK" role="2HvfZ1">
                      <property role="3LWZYw" value="**/*.py"/>
                    </node>
                    <node concept="3co7Ac" id="SSBTh98utL" role="2HvfZ1">
                      <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                      <property role="3cpA_W" value="true"/>
                    </node>
                    <node concept="398BVA" id="SSBTh98usR" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh98usS" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="SSBTh98usT" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh98utM" role="39821P">
                  <property role="28hIV_" value="Required libraries"/>
                </node>
                <node concept="yKbIv" id="SSBTh98utN" role="39821P">
                  <node concept="2HvfSZ" id="SSBTh98utO" role="39821P">
                    <node concept="3LWZYx" id="SSBTh98utP" role="2HvfZ1">
                      <property role="3LWZYw" value="**/*.dylib"/>
                    </node>
                    <node concept="398BVA" id="SSBTh98usX" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh98upt" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh98usY" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="SSBTh98usZ" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh98utQ" role="39821P">
                  <property role="28hIV_"
                    value="MacOSX distribution should always use 64 bit startup options"/>
                </node>
                <node concept="28jJK3" id="SSBTh98utR" role="39821P">
                  <node concept="3co7Ac" id="SSBTh98utS" role="28jJR8">
                    <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                    <property role="3cpA_W" value="true"/>
                  </node>
                  <node concept="55IIr" id="SSBTh98utT" role="28jJRO">
                    <node concept="2Ry0Ak" id="SSBTh98utU" role="iGT6I">
                      <property role="2Ry0Am" value="code"/>
                      <node concept="2Ry0Ak" id="SSBTh98utV" role="2Ry0An">
                        <property role="2Ry0Am" value="buildscripts"/>
                        <node concept="2Ry0Ak" id="SSBTh98utW" role="2Ry0An">
                          <property role="2Ry0Am" value="solutions"/>
                          <node concept="2Ry0Ak" id="SSBTh98utX" role="2Ry0An">
                            <property role="2Ry0Am" value="${context.buildModule.models[0].name}"/>
                            <node concept="2Ry0Ak" id="SSBTh98utY" role="2Ry0An">
                              <property role="2Ry0Am" value="source_gen"/>
                              <node concept="2Ry0Ak" id="SSBTh98utZ" role="2Ry0An">
                                ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh98uu0")}
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2${'$'}htT0" id="SSBTh98uu7" role="28jJR8">
                    <property role="2${'$'}htTZ" value="${context.ideFileName()}64.vmoptions"/>
                    <property role="2${'$'}htTY" value="${context.ideFileName()}.vmoptions"/>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_J27D" id="SSBTh98uu8" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh98uu9" role="3MwsjC">
                <property role="3MwjfP" value="${context.ideFileName()} "/>
              </node>
              <node concept="3Mxwey" id="SSBTh98uua" role="3MwsjC">
                <ref role="3Mxwex" node="SSBTh98upu" resolve="version"/>
              </node>
              <node concept="3Mxwew" id="SSBTh98uub" role="3MwsjC">
                <property role="3MwjfP" value=".app"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="SSBTh98upt" role="1l3spd">
        <property role="TrG5h" value="mps_home"/>
        <node concept="55IIr" id="SSBTh98uvl" role="398pKh">
          <node concept="2Ry0Ak" id="SSBTh98uvq" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="SSBTh98uvv" role="2Ry0An">
              <property role="2Ry0Am" value="MPS 2020.2"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="2kB4xC" id="SSBTh98upu" role="1l3spd">
        <property role="TrG5h" value="version"/>
        <node concept="aVJcg" id="SSBTh98upv" role="aVJcv">
          <node concept="NbPM2" id="SSBTh98upw" role="aVJcq">
            <node concept="3Mxwew" id="SSBTh98upx" role="3MwsjC">
              <property role="3MwjfP" value="1.0"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="55IIr" id="6yX_AXdi_tk" role="auvoZ">
        <node concept="2Ry0Ak" id="6yX_AXdi_tn" role="iGT6I">
          <property role="2Ry0Am" value="build"/>
        </node>
      </node>
    </node>
""".trimIndent()
