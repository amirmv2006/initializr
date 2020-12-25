package io.spring.initializr.locorepo.buildscripts

import io.spring.initializr.locorepo.LanguageGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsRCPDistribWithJBRNode(context: LanguageGenerationContext): String = """
    <node concept="1l3spW" id="SSBTh99e4D">
      <property role="TrG5h" value="${context.projectDescription.artifactId}_RCPDistribWithJBR"/>
      <property role="turDy" value="build-rcpdistrib-jbr.xml"/>
      <property role="2DA0ip" value="../"/>
      <node concept="2sgV4H" id="SSBTh99e4E" role="1l3spa">
        <ref role="1l3spb" node="SSBTh98un7" resolve="${context.projectDescription.artifactId}_RCP"/>
      </node>
      <node concept="1l3spV" id="SSBTh99e4F" role="1l3spN">
        <node concept="1tmT9g" id="SSBTh99e4G" role="39821P">
          <property role="AB_bT" value="1HQQX4XU8${'$'}A/gzip"/>
          <node concept="3ygNvl" id="SSBTh99e4H" role="39821P">
            <ref role="3ygNvj" node="SSBTh98uoh"/>
          </node>
          <node concept="398223" id="SSBTh99epu" role="39821P">
            <node concept="yKbIv" id="SSBTh99eq${'$'}" role="39821P">
              <node concept="2HvfSZ" id="SSBTh99eqB" role="39821P">
                <node concept="398BVA" id="SSBTh99eqF" role="2HvfZ0">
                  <ref role="398BVh" node="1Y1nd8S4s${'$'}K" resolve="jbr_lnx_home"/>
                </node>
              </node>
            </node>
            <node concept="3_J27D" id="SSBTh99epw" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh99eqw" role="3MwsjC">
                <property role="3MwjfP" value="jbr"/>
              </node>
            </node>
          </node>
          <node concept="398223" id="SSBTh99e4I" role="39821P">
            <node concept="3_J27D" id="SSBTh99e4J" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh99e4K" role="3MwsjC">
                <property role="3MwjfP" value="bin"/>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e4L" role="39821P">
              <property role="28hIV_" value="Linux executable files and fsnotifier"/>
            </node>
            <node concept="yKbIv" id="SSBTh99e4M" role="39821P">
              <property role="yKbIr" value="755"/>
              <node concept="2HvfSZ" id="SSBTh99e4N" role="39821P">
                <node concept="398BVA" id="SSBTh99e4O" role="2HvfZ0">
                  <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="SSBTh99e4P" role="iGT6I">
                    <property role="2Ry0Am" value="bin"/>
                    <node concept="2Ry0Ak" id="1Y1nd8S4sA5" role="2Ry0An">
                      <property role="2Ry0Am" value="linux"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e4R" role="39821P">
              <property role="28hIV_" value="Startup options for 32 and 64 bit systems"/>
            </node>
            <node concept="28jJK3" id="SSBTh99e4S" role="39821P">
              <node concept="3co7Ac" id="SSBTh99e4T" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh99e4U" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e4V" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e4X" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e50" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}.vmoptions", "SSBTh99e51")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh99e58" role="39821P">
              <node concept="3co7Ac" id="SSBTh99e59" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh99e5a" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e5b" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e5d" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e5g" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh99e5h")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e5o" role="39821P">
              <property role="28hIV_" value="Linux startup script"/>
            </node>
            <node concept="28jJK3" id="SSBTh99e5p" role="39821P">
              <property role="28jJZ5" value="755"/>
              <node concept="3co7Ac" id="SSBTh99e5q" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                <property role="3cpA_W" value="true"/>
              </node>
              <node concept="55IIr" id="SSBTh99e5r" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e5s" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e5B" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e5${'$'}" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}.sh", "SSBTh99e5t")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="SSBTh99e5D" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh99e5E" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e5F" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh99e5G" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e5H" role="3MwsjC">
              <property role="3MwjfP" value=".tar.gz"/>
            </node>
          </node>
        </node>
        <node concept="3981dG" id="SSBTh99e5I" role="39821P">
          <node concept="3ygNvl" id="SSBTh99e5J" role="39821P">
            <ref role="3ygNvj" node="SSBTh98uoh"/>
          </node>
          <node concept="398223" id="SSBTh99et2" role="39821P">
            <node concept="3_J27D" id="SSBTh99et4" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh99euj" role="3MwsjC">
                <property role="3MwjfP" value="jbr"/>
              </node>
            </node>
            <node concept="yKbIv" id="SSBTh99eul" role="39821P">
              <node concept="2HvfSZ" id="SSBTh99eun" role="39821P">
                <node concept="398BVA" id="SSBTh99eur" role="2HvfZ0">
                  <ref role="398BVh" node="1Y1nd8S4s_g" resolve="jbr_win_home"/>
                </node>
              </node>
            </node>
          </node>
          <node concept="398223" id="SSBTh99e5K" role="39821P">
            <node concept="28u9K_" id="SSBTh99e5L" role="39821P">
              <property role="28hIV_" value="Startup options for 32 and 64 bit systems"/>
            </node>
            <node concept="3_J27D" id="SSBTh99e5M" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh99e5N" role="3MwsjC">
                <property role="3MwjfP" value="bin"/>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh99e5O" role="39821P">
              <node concept="2${'$'}gBol" id="SSBTh99e5P" role="28jJR8">
                <property role="2${'$'}htvj" value="*"/>
                <node concept="NbPM2" id="SSBTh99e5Q" role="2${'$'}htvi">
                  <node concept="3Mxwew" id="SSBTh99e5R" role="3MwsjC">
                    <property role="3MwjfP" value="${context.ideFileName()}.exe.vmoptions"/>
                  </node>
                </node>
              </node>
              <node concept="3co7Ac" id="SSBTh99e5S" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh99e5T" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e5U" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e5W" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e5Z" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}.vmoptions", "SSBTh99e60")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
            <node concept="28jJK3" id="SSBTh99e67" role="39821P">
              <node concept="2${'$'}gBol" id="SSBTh99e68" role="28jJR8">
                <property role="2${'$'}htvj" value="*"/>
                <node concept="NbPM2" id="SSBTh99e69" role="2${'$'}htvi">
                  <node concept="3Mxwew" id="SSBTh99e6a" role="3MwsjC">
                    <property role="3MwjfP" value="${context.ideFileName()}64.exe.vmoptions"/>
                  </node>
                </node>
              </node>
              <node concept="3co7Ac" id="SSBTh99e6b" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh99e6c" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e6d" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e6f" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e6i" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh99e6j")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e6q" role="39821P">
              <property role="28hIV_" value="Required files for execution"/>
            </node>
            <node concept="2HvfSZ" id="SSBTh99e6r" role="39821P">
              <node concept="3LWZYq" id="SSBTh99e6s" role="2HvfZ1">
                <property role="3LWZYl" value="**/*.exe"/>
              </node>
              <node concept="3LWZYq" id="SSBTh99e6t" role="2HvfZ1">
                <property role="3LWZYl" value="**/*.bat"/>
              </node>
              <node concept="398BVA" id="SSBTh99e6u" role="2HvfZ0">
                <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                <node concept="2Ry0Ak" id="SSBTh99e6v" role="iGT6I">
                  <property role="2Ry0Am" value="bin"/>
                  <node concept="2Ry0Ak" id="1Y1nd8S4sAh" role="2Ry0An">
                    <property role="2Ry0Am" value="win"/>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e6x" role="39821P">
              <property role="28hIV_" value="Windows executable files and fsnotifier"/>
            </node>
            <node concept="yKbIv" id="SSBTh99e6y" role="39821P">
              <property role="yKbIr" value="755"/>
              <node concept="2HvfSZ" id="SSBTh99e6z" role="39821P">
                <node concept="3LWZYx" id="SSBTh99e6${'$'}" role="2HvfZ1">
                  <property role="3LWZYw" value="**/*.exe"/>
                </node>
                <node concept="3LWZYx" id="SSBTh99e6_" role="2HvfZ1">
                  <property role="3LWZYw" value="**/append.bat"/>
                </node>
                <node concept="398BVA" id="SSBTh99e6A" role="2HvfZ0">
                  <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="SSBTh99e6B" role="iGT6I">
                    <property role="2Ry0Am" value="bin"/>
                    <node concept="2Ry0Ak" id="1Y1nd8S4sAj" role="2Ry0An">
                      <property role="2Ry0Am" value="win"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="28u9K_" id="SSBTh99e6D" role="39821P">
              <property role="28hIV_" value="Startup .bat file"/>
            </node>
            <node concept="28jJK3" id="SSBTh99e6E" role="39821P">
              <property role="28jJZ5" value="755"/>
              <node concept="3co7Ac" id="SSBTh99e6F" role="28jJR8">
                <property role="3co7Am" value="3D3G23Q8WAM/crlf"/>
              </node>
              <node concept="55IIr" id="SSBTh99e6G" role="28jJRO">
                <node concept="2Ry0Ak" id="SSBTh99e6H" role="iGT6I">
                    <property role="2Ry0Am" value="buildscripts"/>
                    <node concept="2Ry0Ak" id="SSBTh99e6J" role="2Ry0An">
                      <property role="2Ry0Am" value="source_gen"/>
                      <node concept="2Ry0Ak" id="SSBTh99e6M" role="2Ry0An">
                        ${buildModuleToOutputFolder(context, "${context.ideFileName()}.bat", "SSBTh99e6N")}
                      </node>
                    </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="SSBTh99e6U" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh99e6V" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e6W" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh99e6X" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e6Y" role="3MwsjC">
              <property role="3MwjfP" value=".win.zip"/>
            </node>
          </node>
        </node>
        <node concept="3981dG" id="SSBTh99e6Z" role="39821P">
          <node concept="3_J27D" id="SSBTh99e70" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh99e71" role="3MwsjC">
              <property role="3MwjfP" value="${context.ideFileName()}"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e72" role="3MwsjC">
              <property role="3MwjfP" value="-"/>
            </node>
            <node concept="3Mxwey" id="SSBTh99e73" role="3MwsjC">
              <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
            </node>
            <node concept="3Mxwew" id="SSBTh99e74" role="3MwsjC">
              <property role="3MwjfP" value=".macos.zip"/>
            </node>
          </node>
          <node concept="398223" id="SSBTh99e75" role="39821P">
            <node concept="398223" id="SSBTh99e76" role="39821P">
              <node concept="3ygNvl" id="SSBTh99e77" role="39821P">
                <ref role="3ygNvj" node="SSBTh98uoh"/>
              </node>
              <node concept="3_J27D" id="SSBTh99e78" role="Nbhlr">
                <node concept="3Mxwew" id="SSBTh99e79" role="3MwsjC">
                  <property role="3MwjfP" value="Contents"/>
                </node>
              </node>
              <node concept="398223" id="SSBTh99e7a" role="39821P">
                <node concept="3_J27D" id="SSBTh99e7b" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh99e7c" role="3MwsjC">
                    <property role="3MwjfP" value="Resources"/>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh99e7d" role="39821P">
                  <property role="28hIV_" value="TODO: replace with product icon"/>
                </node>
                <node concept="28jJK3" id="SSBTh99e7e" role="39821P">
                  <node concept="398BVA" id="SSBTh99e7f" role="28jJRO">
                    <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                    <node concept="2Ry0Ak" id="SSBTh99e7g" role="iGT6I">
                      <property role="2Ry0Am" value="bin"/>
                      <node concept="2Ry0Ak" id="SSBTh99e7h" role="2Ry0An">
                        <property role="2Ry0Am" value="mac"/>
                        <node concept="2Ry0Ak" id="SSBTh99e7i" role="2Ry0An">
                          <property role="2Ry0Am" value="Contents"/>
                          <node concept="2Ry0Ak" id="SSBTh99e7j" role="2Ry0An">
                            <property role="2Ry0Am" value="Resources"/>
                            <node concept="2Ry0Ak" id="1Y1nd8S4sAn" role="2Ry0An">
                              <property role="2Ry0Am" value="mps.icns"/>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="28u9K_" id="SSBTh99e7l" role="39821P">
                <property role="28hIV_" value="MacOSX executable to run application"/>
              </node>
              <node concept="398223" id="SSBTh99e7m" role="39821P">
                <node concept="28jJK3" id="SSBTh99e7n" role="39821P">
                  <property role="28jJZ5" value="755"/>
                  <node concept="398BVA" id="SSBTh99e7o" role="28jJRO">
                    <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                    <node concept="2Ry0Ak" id="SSBTh99e7p" role="iGT6I">
                      <property role="2Ry0Am" value="bin"/>
                      <node concept="2Ry0Ak" id="SSBTh99e7q" role="2Ry0An">
                        <property role="2Ry0Am" value="mac"/>
                        <node concept="2Ry0Ak" id="SSBTh99e7r" role="2Ry0An">
                          <property role="2Ry0Am" value="Contents"/>
                          <node concept="2Ry0Ak" id="SSBTh99e7s" role="2Ry0An">
                            <property role="2Ry0Am" value="MacOS"/>
                            <node concept="2Ry0Ak" id="1Y1nd8S4sAp" role="2Ry0An">
                              <property role="2Ry0Am" value="mps"/>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2${'$'}gBol" id="SSBTh99e7u" role="28jJR8">
                    <property role="2${'$'}htvj" value="*"/>
                    <node concept="NbPM2" id="SSBTh99e7v" role="2${'$'}htvi">
                      <node concept="3Mxwew" id="SSBTh99e7w" role="3MwsjC">
                        <property role="3MwjfP" value="${context.ideFileName()}"/>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3_J27D" id="SSBTh99e7x" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh99e7y" role="3MwsjC">
                    <property role="3MwjfP" value="MacOS"/>
                  </node>
                </node>
              </node>
              <node concept="28u9K_" id="SSBTh99e7z" role="39821P">
                <property role="28hIV_" value="Fill Info.plist with current build version and number"/>
              </node>
              <node concept="28jJK3" id="SSBTh99e7${'$'}" role="39821P">
                <node concept="55IIr" id="SSBTh99e7_" role="28jJRO">
                  <node concept="2Ry0Ak" id="SSBTh99e7A" role="iGT6I">
                      <property role="2Ry0Am" value="buildscripts"/>
                      <node concept="2Ry0Ak" id="SSBTh99e7C" role="2Ry0An">
                        <property role="2Ry0Am" value="source_gen"/>
                        <node concept="2Ry0Ak" id="SSBTh99e7F" role="2Ry0An">
                          ${buildModuleToOutputFolder(context, "Info.plist.xml", "SSBTh99e7G")}
                        </node>
                      </node>
                  </node>
                </node>
                <node concept="2${'$'}gBol" id="SSBTh99e7N" role="28jJR8">
                  <property role="2${'$'}htvj" value="*"/>
                  <node concept="NbPM2" id="SSBTh99e7O" role="2${'$'}htvi">
                    <node concept="3Mxwew" id="SSBTh99e7P" role="3MwsjC">
                      <property role="3MwjfP" value="Info.plist"/>
                    </node>
                  </node>
                </node>
                <node concept="1688n2" id="SSBTh99e7Q" role="28jJR8">
                  <property role="1688n3" value="\${'$'}version\${'$'}"/>
                  <node concept="NbPM2" id="SSBTh99e7R" role="1688n0">
                    <node concept="3Mxwey" id="SSBTh99e7S" role="3MwsjC">
                      <ref role="3Mxwex" node="SSBTh99e8L" resolve="version"/>
                    </node>
                  </node>
                </node>
                <node concept="1688n2" id="SSBTh99e7T" role="28jJR8">
                  <property role="1688n3" value="\${'$'}build\${'$'}"/>
                  <node concept="NbPM2" id="SSBTh99e7U" role="1688n0">
                    <node concept="3Mxwey" id="SSBTh99e7V" role="3MwsjC">
                      <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
                    </node>
                  </node>
                </node>
                <node concept="3co7Ac" id="SSBTh99e7W" role="28jJR8">
                  <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                  <property role="3cpA_W" value="true"/>
                </node>
              </node>
              <node concept="398223" id="SSBTh99ewD" role="39821P">
                <node concept="3_J27D" id="SSBTh99ewF" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh99eyf" role="3MwsjC">
                    <property role="3MwjfP" value="jbr"/>
                  </node>
                </node>
                <node concept="yKbIv" id="SSBTh99eyh" role="39821P">
                  <node concept="2HvfSZ" id="SSBTh99eyj" role="39821P">
                    <node concept="398BVA" id="SSBTh99eyn" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh99e8Z" resolve="jbr_mac_home"/>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="398223" id="SSBTh99e7X" role="39821P">
                <node concept="3_J27D" id="SSBTh99e7Y" role="Nbhlr">
                  <node concept="3Mxwew" id="SSBTh99e7Z" role="3MwsjC">
                    <property role="3MwjfP" value="bin"/>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh99e80" role="39821P">
                  <property role="28hIV_" value="Executable files and fsnotifier"/>
                </node>
                <node concept="yKbIv" id="SSBTh99e81" role="39821P">
                  <property role="yKbIr" value="755"/>
                  <node concept="2HvfSZ" id="SSBTh99e82" role="39821P">
                    <node concept="3LWZYq" id="SSBTh99e83" role="2HvfZ1">
                      <property role="3LWZYl" value="**/*.dylib"/>
                    </node>
                    <node concept="3LWZYq" id="SSBTh99e84" role="2HvfZ1">
                      <property role="3LWZYl" value="**/*.py"/>
                    </node>
                    <node concept="398BVA" id="SSBTh99e85" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh99e86" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="1Y1nd8S4sAt" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh99e88" role="39821P">
                  <property role="28hIV_" value="Python script with updated end of line"/>
                </node>
                <node concept="yKbIv" id="SSBTh99e89" role="39821P">
                  <property role="yKbIr" value="755"/>
                  <node concept="2HvfSZ" id="SSBTh99e8a" role="39821P">
                    <node concept="3LWZYx" id="SSBTh99e8b" role="2HvfZ1">
                      <property role="3LWZYw" value="**/*.py"/>
                    </node>
                    <node concept="3co7Ac" id="SSBTh99e8c" role="2HvfZ1">
                      <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                      <property role="3cpA_W" value="true"/>
                    </node>
                    <node concept="398BVA" id="SSBTh99e8d" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh99e8e" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="1Y1nd8S4sAv" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh99e8g" role="39821P">
                  <property role="28hIV_" value="Required libraries"/>
                </node>
                <node concept="yKbIv" id="SSBTh99e8h" role="39821P">
                  <node concept="2HvfSZ" id="SSBTh99e8i" role="39821P">
                    <node concept="3LWZYx" id="SSBTh99e8j" role="2HvfZ1">
                      <property role="3LWZYw" value="**/*.dylib"/>
                    </node>
                    <node concept="398BVA" id="SSBTh99e8k" role="2HvfZ0">
                      <ref role="398BVh" node="SSBTh99e8H" resolve="mps_home"/>
                      <node concept="2Ry0Ak" id="SSBTh99e8l" role="iGT6I">
                        <property role="2Ry0Am" value="bin"/>
                        <node concept="2Ry0Ak" id="1Y1nd8S4sAx" role="2Ry0An">
                          <property role="2Ry0Am" value="mac"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="28u9K_" id="SSBTh99e8n" role="39821P">
                  <property role="28hIV_"
                    value="MacOSX distribution should always use 64 bit startup options"/>
                </node>
                <node concept="28jJK3" id="SSBTh99e8o" role="39821P">
                  <node concept="3co7Ac" id="SSBTh99e8p" role="28jJR8">
                    <property role="3co7Am" value="3D3G23Q8WAL/lf"/>
                    <property role="3cpA_W" value="true"/>
                  </node>
                  <node concept="55IIr" id="SSBTh99e8q" role="28jJRO">
                    <node concept="2Ry0Ak" id="SSBTh99e8r" role="iGT6I">
                        <property role="2Ry0Am" value="buildscripts"/>
                        <node concept="2Ry0Ak" id="SSBTh99e8A" role="2Ry0An">
                          <property role="2Ry0Am" value="source_gen"/>
                          <node concept="2Ry0Ak" id="SSBTh99e8w" role="2Ry0An">
                            ${buildModuleToOutputFolder(context, "${context.ideFileName()}64.vmoptions", "SSBTh99e8s")}
                          </node>
                        </node>
                    </node>
                  </node>
                  <node concept="2${'$'}htT0" id="SSBTh99e8C" role="28jJR8">
                    <property role="2${'$'}htTZ" value="${context.ideFileName()}64.vmoptions"/>
                    <property role="2${'$'}htTY" value="${context.ideFileName()}.vmoptions"/>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_J27D" id="SSBTh99e8D" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh99e8E" role="3MwsjC">
                <property role="3MwjfP" value="${context.ideFileName()} "/>
              </node>
              <node concept="3Mxwey" id="SSBTh99e8F" role="3MwsjC">
                <ref role="3Mxwex" node="SSBTh99e8L" resolve="version"/>
              </node>
              <node concept="3Mxwew" id="SSBTh99e8G" role="3MwsjC">
                <property role="3MwjfP" value=".app"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="SSBTh99e8H" role="1l3spd">
        <property role="TrG5h" value="mps_home"/>
        <node concept="55IIr" id="SSBTh99e8I" role="398pKh">
          <node concept="2Ry0Ak" id="SSBTh99e8J" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="1Y1nd8S4sA_" role="2Ry0An">
              <property role="2Ry0Am" value="MPS 2020.2"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="SSBTh99e8Z" role="1l3spd">
        <property role="TrG5h" value="jbr_mac_home"/>
        <node concept="55IIr" id="SSBTh99e9a" role="398pKh">
          <node concept="2Ry0Ak" id="SSBTh99e9d" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="SSBTh99e9i" role="2Ry0An">
              <property role="2Ry0Am" value="jbr-osx"/>
              <node concept="2Ry0Ak" id="SSBTh99e9n" role="2Ry0An">
                <property role="2Ry0Am" value="jbrsdk"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="1Y1nd8S4s${'$'}K" role="1l3spd">
        <property role="TrG5h" value="jbr_lnx_home"/>
        <node concept="55IIr" id="1Y1nd8S4s_x" role="398pKh">
          <node concept="2Ry0Ak" id="1Y1nd8S4s_${'$'}" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="1Y1nd8S4s_R" role="2Ry0An">
              <property role="2Ry0Am" value="jbr-linux"/>
              <node concept="2Ry0Ak" id="1Y1nd8S4s_W" role="2Ry0An">
                <property role="2Ry0Am" value="jbrsdk"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="1Y1nd8S4s_g" role="1l3spd">
        <property role="TrG5h" value="jbr_win_home"/>
        <node concept="55IIr" id="1Y1nd8S4s_F" role="398pKh">
          <node concept="2Ry0Ak" id="1Y1nd8S4s_K" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="1Y1nd8S4s_Y" role="2Ry0An">
              <property role="2Ry0Am" value="jbr-windows"/>
              <node concept="2Ry0Ak" id="1Y1nd8S4sA3" role="2Ry0An">
                <property role="2Ry0Am" value="jbrsdk"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2kB4xC" id="SSBTh99e8L" role="1l3spd">
        <property role="TrG5h" value="version"/>
        <node concept="aVJcg" id="SSBTh99e8M" role="aVJcv">
          <node concept="NbPM2" id="SSBTh99e8N" role="aVJcq">
            <node concept="3Mxwew" id="SSBTh99e8O" role="3MwsjC">
              <property role="3MwjfP" value="1.0"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="55IIr" id="6yX_AXdi_tp" role="auvoZ">
        <node concept="2Ry0Ak" id="6yX_AXdi_ts" role="iGT6I">
          <property role="2Ry0Am" value="build"/>
        </node>
      </node>
    </node>
""".trimIndent()
