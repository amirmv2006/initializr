package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.LanguageGenerationContext
import org.intellij.lang.annotations.Language

@Language("XML")
fun buildMpsRCPNode(context: LanguageGenerationContext): String = """
    <node concept="1l3spW" id="SSBTh98un7">
      <property role="TrG5h" value="${context.projectDescription.artifactId}_RCP"/>
      <property role="2DA0ip" value="../"/>
      <property role="turDy" value="build-rcp.xml"/>
      <node concept="10PD9b" id="SSBTh98un8" role="10PD9s"/>
      <node concept="3b7kt6" id="SSBTh98un9" role="10PD9s"/>
      <node concept="1zClus" id="SSBTh98unp" role="3989C9">
        <property role="2OjLBK" value="0"/>
        <property role="TrG5h" value="MPS"/>
        <property role="2OjLBL" value="1"/>
        <node concept="55IIr" id="SSBTh98unq" role="3vi${'$'}VU">
          <node concept="2Ry0Ak" id="SSBTh98unr" role="iGT6I">
            <property role="2Ry0Am" value="icons"/>
            <node concept="2Ry0Ak" id="SSBTh98uns" role="2Ry0An">
              <property role="2Ry0Am" value="logo.png"/>
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unt" role="2EteIg">
          <node concept="3Mxwey" id="SSBTh98unu" role="3MwsjC">
            <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
          </node>
        </node>
        <node concept="55IIr" id="SSBTh98unv" role="2EteIi">
          <node concept="2Ry0Ak" id="SSBTh98unw" role="iGT6I">
            <property role="2Ry0Am" value="icons"/>
            <node concept="2Ry0Ak" id="SSBTh98unx" role="2Ry0An">
              <property role="2Ry0Am" value="MPS16.png"/>
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98uny" role="2EtHGA">
          <node concept="3Mxwew" id="SSBTh98unz" role="3MwsjC">
            <property role="3MwjfP" value="${context.ideFileName()}"/>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98un${'$'}" role="2EtHGT">
          <node concept="3Mxwew" id="SSBTh98un_" role="3MwsjC">
            <property role="3MwjfP" value="${context.ideFileName()}"/>
          </node>
        </node>
        <node concept="55IIr" id="SSBTh98unA" role="2EteIj">
          <node concept="2Ry0Ak" id="SSBTh98unB" role="iGT6I">
            <property role="2Ry0Am" value="icons"/>
            <node concept="2Ry0Ak" id="SSBTh98unC" role="2Ry0An">
              <property role="2Ry0Am" value="MPS32.png"/>
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unD" role="R${'$'}TG_">
          <node concept="3Mxwey" id="SSBTh98unE" role="3MwsjC">
            <ref role="3Mxwex" node="SSBTh98una" resolve="date"/>
          </node>
        </node>
        <node concept="55IIr" id="SSBTh98unF" role="2EqU2t">
          <node concept="2Ry0Ak" id="SSBTh98unG" role="iGT6I">
            <property role="2Ry0Am" value="icons"/>
            <node concept="2Ry0Ak" id="SSBTh98unH" role="2Ry0An">
              <property role="2Ry0Am" value="splash.png"/>
            </node>
          </node>
        </node>
        <node concept="55IIr" id="SSBTh98unI" role="2EqU2s">
          <node concept="2Ry0Ak" id="SSBTh98unJ" role="iGT6I">
            <property role="2Ry0Am" value="icons"/>
            <node concept="2Ry0Ak" id="SSBTh98unK" role="2Ry0An">
              <property role="2Ry0Am" value="about.png"/>
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unL" role="2gvbiD">
          <node concept="3Mxwew" id="SSBTh98unM" role="3MwsjC">
            <property role="3MwjfP" value="${context.ideFileName()}"/>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unN" role="HFo83">
          <node concept="3Mxwew" id="SSBTh98unO" role="3MwsjC">
            <property role="3MwjfP" value="FFFFFF"/>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unP" role="3KTKoD">
          <node concept="3Mxwew" id="SSBTh98unQ" role="3MwsjC">
            <property role="3MwjfP" value="FFFFFF"/>
          </node>
        </node>
        <node concept="3_J27D" id="SSBTh98unR" role="3KTYbF">
          <node concept="3Mxwew" id="SSBTh98unS" role="3MwsjC">
            <property role="3MwjfP" value="FFFFFF"/>
          </node>
        </node>
        <node concept="NbPM2" id="SSBTh98unT" role="27hGoL">
          <node concept="3Mxwew" id="SSBTh98unU" role="3MwsjC">
            <property role="3MwjfP" value="FFFFFF"/>
          </node>
        </node>
      </node>
      <node concept="2kB4xC" id="SSBTh98una" role="1l3spd">
        <property role="TrG5h" value="date"/>
        <node concept="hHN3E" id="SSBTh98unb" role="aVJcv">
          <property role="hHN3Y" value="yyyyMMdd"/>
        </node>
      </node>
      <node concept="2kB4xC" id="SSBTh98unc" role="1l3spd">
        <property role="TrG5h" value="build.number"/>
        <node concept="aVJcg" id="SSBTh98und" role="aVJcv">
          <node concept="NbPM2" id="SSBTh98une" role="aVJcq">
            <node concept="3Mxwew" id="SSBTh98unf" role="3MwsjC">
              <property role="3MwjfP" value="202.SNAPSHOT"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="398rNT" id="SSBTh98ung" role="1l3spd">
        <property role="TrG5h" value="mps_home"/>
        <node concept="55IIr" id="SSBTh993fe" role="398pKh">
          <node concept="2Ry0Ak" id="SSBTh993fh" role="iGT6I">
            <property role="2Ry0Am" value="lib"/>
            <node concept="2Ry0Ak" id="SSBTh993fm" role="2Ry0An">
              <property role="2Ry0Am" value="MPS 2020.2"/>
            </node>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="6vUa8TkPb6v" role="1l3spa">
        <ref role="1l3spb" node="1LFOa1yjA${'$'}U"
          resolve="${context.projectDescription.artifactId}_Plugin"/>
      </node>
      <node concept="2sgV4H" id="SSBTh98unh" role="1l3spa">
        <ref role="1l3spb" to="ffeo:1diLdO26mQ6" resolve="mpsStandalone"/>
        <node concept="398BVA" id="SSBTh98uni" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
        </node>
      </node>
      <node concept="2sgV4H" id="SSBTh98unj" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5rNMDvYzelV" resolve="mpsMakePlugin"/>
        <node concept="398BVA" id="SSBTh98unk" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="SSBTh98unl" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="SSBTh98unm" role="1l3spa">
        <ref role="1l3spb" to="ffeo:1lMM4owFq4Y" resolve="mpsVcs"/>
        <node concept="398BVA" id="SSBTh98unn" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="SSBTh98uno" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="shLZJxUMtC" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5xa9wY2vh7j" resolve="mpsExecutionPlugin"/>
        <node concept="398BVA" id="shLZJxUMtO" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="shLZJxUMtT" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="shLZJxUMu9" role="1l3spa">
        <ref role="1l3spb" to="ffeo:ymnOULAEsd" resolve="mpsTesting"/>
        <node concept="398BVA" id="shLZJxUMuo" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="shLZJxUMut" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="shLZJxUMuK" role="1l3spa">
        <ref role="1l3spb" to="ffeo:7pdFgzxlDme" resolve="mpsBuild"/>
        <node concept="398BVA" id="shLZJxUMv2" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="shLZJxUMv7" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="2sgV4H" id="shLZJxUMvt" role="1l3spa">
        <ref role="1l3spb" to="ffeo:5mc7nVumjii" resolve="mpsDebuggerPlugin"/>
        <node concept="398BVA" id="shLZJxUMvM" role="2JcizS">
          <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
          <node concept="2Ry0Ak" id="shLZJxUMvR" role="iGT6I">
            <property role="2Ry0Am" value="plugins"/>
          </node>
        </node>
      </node>
      <node concept="3jsGME" id="SSBTh98uof" role="3989C9">
        <property role="TrG5h" value="mps-tips"/>
        <node concept="3jmSaf" id="SSBTh98uog" role="3jmSa1"/>
      </node>
      <node concept="1l3spV" id="SSBTh98uoh" role="1l3spN">
        <node concept="3_I8Xc" id="SSBTh98uop" role="39821P">
          <ref role="3_I8Xa" to="ffeo:1diLdO26H79" resolve="languages"/>
        </node>
        <node concept="3_I8Xc" id="SSBTh98uoq" role="39821P">
          <ref role="3_I8Xa" to="ffeo:1aRUp2KiMC${'$'}" resolve="license"/>
        </node>
        <node concept="398223" id="SSBTh98uor" role="39821P">
          <node concept="3_J27D" id="SSBTh98uos" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98uot" role="3MwsjC">
              <property role="3MwjfP" value="bin"/>
            </node>
          </node>
          <node concept="3ygNvl" id="SSBTh98uou" role="39821P">
            <ref role="3ygNvj" to="ffeo:3cxBkkDa4_O" resolve="bin"/>
            <node concept="3LWZYx" id="SSBTh98uov" role="1juEy9">
              <property role="3LWZYw" value="log.xml"/>
            </node>
          </node>
          <node concept="28jJK3" id="SSBTh98uow" role="39821P">
            <node concept="1688n2" id="SSBTh98uox" role="28jJR8">
              <property role="1688n6" value="g"/>
              <property role="1688n3" value="\.MPS(\w+)"/>
              <node concept="NbPM2" id="SSBTh98uoy" role="1688n0">
                <node concept="3Mxwew" id="SSBTh98uoz" role="3MwsjC">
                  <property role="3MwjfP" value="\."/>
                </node>
                <node concept="3Mxwey" id="SSBTh98uo${'$'}" role="3MwsjC">
                  <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
                </node>
              </node>
            </node>
            <node concept="398BVA" id="SSBTh98uol" role="28jJRO">
              <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
              <node concept="2Ry0Ak" id="SSBTh98uom" role="iGT6I">
                <property role="2Ry0Am" value="bin"/>
                <node concept="2Ry0Ak" id="SSBTh98uon" role="2Ry0An">
                  <property role="2Ry0Am" value="idea.properties"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="SSBTh98uo_" role="39821P">
          <node concept="3_J27D" id="SSBTh98uoA" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98uoB" role="3MwsjC">
              <property role="3MwjfP" value="lib"/>
            </node>
          </node>
          <node concept="3ygNvl" id="SSBTh98uoC" role="39821P">
            <ref role="3ygNvj" to="ffeo:1diLdO26H7f" resolve="lib"/>
            <node concept="3LWZYq" id="SSBTh98uoD" role="1juEy9">
              <property role="3LWZYl" value="MPS-src.zip"/>
            </node>
            <node concept="3LWZYq" id="SSBTh98uoE" role="1juEy9">
              <property role="3LWZYl" value="branding.jar"/>
            </node>
            <node concept="3LWZYq" id="SSBTh98uoF" role="1juEy9">
              <property role="3LWZYl" value="mps-tips.jar"/>
            </node>
          </node>
          <node concept="20sUq0" id="SSBTh98uoG" role="39821P">
            <property role="TrG5h" value="mps-tips.jar"/>
            <ref role="21GgXK" node="SSBTh98uof" resolve="mps-tips"/>
          </node>
          <node concept="3981dx" id="SSBTh98uoH" role="39821P">
            <node concept="3_J27D" id="SSBTh98uoI" role="Nbhlr">
              <node concept="3Mxwew" id="SSBTh98uoJ" role="3MwsjC">
                <property role="3MwjfP" value="branding.jar"/>
              </node>
            </node>
            <node concept="1zDrgl" id="SSBTh98uoK" role="39821P">
              <ref role="1zDrgn" node="SSBTh98unp" resolve="${context.ideFileName()} 1.0"/>
            </node>
          </node>
        </node>
        <node concept="398223" id="SSBTh98uoL" role="39821P">
          <node concept="28u9K_" id="6vUa8TkPb6O" role="39821P">
            <property role="28hIV_" value="${context.projectDescription.artifactId}"/>
          </node>
          <node concept="3_I8Xc" id="6vUa8TkPb7i" role="39821P">
            <ref role="3_I8Xa" node="3PswS${'$'}xWsqQ"
              resolve="${context.projectDescription.artifactId}"/>
          </node>
          <node concept="28u9K_" id="6vUa8TkPb72" role="39821P">
            <property role="28hIV_" value="mps"/>
          </node>
          <node concept="3_I8Xc" id="SSBTh98uoM" role="39821P">
            <ref role="3_I8Xa" to="ffeo:3nGzrDEfcNJ" resolve="svn4idea"/>
          </node>
          <node concept="3_I8Xc" id="SSBTh98uoN" role="39821P">
            <ref role="3_I8Xa" to="ffeo:I6XuqH2zYV" resolve="git4idea"/>
          </node>
          <node concept="3_I8Xc" id="SSBTh98uoO" role="39821P">
            <ref role="3_I8Xa" to="ffeo:4EdAnGErOtx" resolve="mps-core"/>
          </node>
          <node concept="3_I8Xc" id="SSBTh98uoP" role="39821P">
            <ref role="3_I8Xa" to="ffeo:1x6h9EwqP32" resolve="mps-make"/>
          </node>
          <node concept="3_I8Xc" id="shLZJxUMwY" role="39821P">
            <ref role="3_I8Xa" to="ffeo:5CFKsRWS5pU" resolve="mps-debugger-api"/>
          </node>
          <node concept="3_I8Xc" id="shLZJxUMxi" role="39821P">
            <ref role="3_I8Xa" to="ffeo:5CFKsRWS5yu" resolve="mps-debugger-java"/>
          </node>
          <node concept="3_I8Xc" id="shLZJxUMxC" role="39821P">
            <ref role="3_I8Xa" to="ffeo:5CFKsRWRsZ0" resolve="mps-execution-api"/>
          </node>
          <node concept="3_I8Xc" id="shLZJxUMy0" role="39821P">
            <ref role="3_I8Xa" to="ffeo:35y4BF72kxA" resolve="mps-execution-configurations"/>
          </node>
          <node concept="3_I8Xc" id="shLZJxUMyq" role="39821P">
            <ref role="3_I8Xa" to="ffeo:35y4BF72i${'$'}D" resolve="mps-execution-languages"/>
          </node>
          <node concept="398223" id="shLZJxUMyQ" role="39821P">
            <node concept="3ygNvl" id="shLZJxUMzc" role="39821P">
              <ref role="3ygNvj" to="ffeo:6b4RkXS7XdG" resolve="mps-build"/>
              <node concept="3LWZYq" id="shLZJxUMzf" role="1juEy9">
                <property role="3LWZYl" value="META-INF/plugin.xml"/>
              </node>
            </node>
            <node concept="398223" id="shLZJxUMzl" role="39821P">
              <node concept="3_J27D" id="shLZJxUMzn" role="Nbhlr">
                <node concept="3Mxwew" id="shLZJxUMzt" role="3MwsjC">
                  <property role="3MwjfP" value="META-INF"/>
                </node>
              </node>
              <node concept="28jJK3" id="1_Zi${'$'}Xmp3WU" role="39821P">
                <node concept="1688n2" id="1_Zi${'$'}Xmp3Xz" role="28jJR8">
                  <property role="1688n3"
                    value="&amp;lt;idea-version since-build=&amp;quot;.*&amp;quot; until-build=&amp;quot;.*&amp;quot;/&amp;gt;"/>
                  <node concept="NbPM2" id="1_Zi${'$'}Xmp3X_" role="1688n0"/>
                </node>
                <node concept="398BVA" id="1_Zi${'$'}Xmp3X2" role="28jJRO">
                  <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="1_Zi${'$'}Xmp3X6" role="iGT6I">
                    <property role="2Ry0Am" value="plugins"/>
                    <node concept="2Ry0Ak" id="1_Zi${'$'}Xmp3Xb" role="2Ry0An">
                      <property role="2Ry0Am" value="mps-build"/>
                      <node concept="2Ry0Ak" id="1_Zi${'$'}Xmp3Xg" role="2Ry0An">
                        <property role="2Ry0Am" value="META-INF"/>
                        <node concept="2Ry0Ak" id="1_Zi${'$'}Xmp3Xl" role="2Ry0An">
                          <property role="2Ry0Am" value="plugin.xml"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_J27D" id="shLZJxUMyS" role="Nbhlr">
              <node concept="3Mxwew" id="shLZJxUMz8" role="3MwsjC">
                <property role="3MwjfP" value="mps-build"/>
              </node>
            </node>
          </node>
          <node concept="398223" id="shLZJxUM${'$'}W" role="39821P">
            <node concept="3ygNvl" id="shLZJxUM_y" role="39821P">
              <ref role="3ygNvj" to="ffeo:ymnOULAZ8H" resolve="mps-testing"/>
              <node concept="3LWZYq" id="shLZJxUM__" role="1juEy9">
                <property role="3LWZYl" value="META-INF/plugin.xml"/>
              </node>
            </node>
            <node concept="398223" id="shLZJxUM_F" role="39821P">
              <node concept="28jJK3" id="6kvdbYu4akq" role="39821P">
                <node concept="1688n2" id="6kvdbYu4akr" role="28jJR8">
                  <property role="1688n3"
                    value="&amp;lt;idea-version since-build=&amp;quot;.*&amp;quot; until-build=&amp;quot;.*&amp;quot;/&amp;gt;"/>
                  <node concept="NbPM2" id="6kvdbYu4aks" role="1688n0"/>
                </node>
                <node concept="398BVA" id="6kvdbYu4akt" role="28jJRO">
                  <ref role="398BVh" node="SSBTh98ung" resolve="mps_home"/>
                  <node concept="2Ry0Ak" id="6kvdbYu4aku" role="iGT6I">
                    <property role="2Ry0Am" value="plugins"/>
                    <node concept="2Ry0Ak" id="6kvdbYu4akv" role="2Ry0An">
                      <property role="2Ry0Am" value="mps-testing"/>
                      <node concept="2Ry0Ak" id="6kvdbYu4akw" role="2Ry0An">
                        <property role="2Ry0Am" value="META-INF"/>
                        <node concept="2Ry0Ak" id="6kvdbYu4alw" role="2Ry0An">
                          <property role="2Ry0Am" value="plugin.xml"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3_J27D" id="shLZJxUM_H" role="Nbhlr">
                <node concept="3Mxwew" id="shLZJxUM_N" role="3MwsjC">
                  <property role="3MwjfP" value="META-INF"/>
                </node>
              </node>
            </node>
            <node concept="3_J27D" id="shLZJxUM${'$'}Y" role="Nbhlr">
              <node concept="3Mxwew" id="shLZJxUM_u" role="3MwsjC">
                <property role="3MwjfP" value="mps-testing"/>
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="SSBTh98uoS" role="Nbhlr">
            <node concept="3Mxwew" id="SSBTh98uoT" role="3MwsjC">
              <property role="3MwjfP" value="plugins"/>
            </node>
          </node>
        </node>
        <node concept="1TblL5" id="SSBTh98uoU" role="39821P">
          <node concept="3_J27D" id="SSBTh98uoV" role="1TblL3">
            <node concept="3Mxwew" id="SSBTh98uoW" role="3MwsjC">
              <property role="3MwjfP" value="build.number"/>
            </node>
          </node>
          <node concept="1TblLo" id="SSBTh98uoX" role="1TblLl">
            <property role="1TblLn" value="build.number"/>
            <node concept="NbPM2" id="SSBTh98uoY" role="1TblLm">
              <node concept="3Mxwey" id="SSBTh98uoZ" role="3MwsjC">
                <ref role="3Mxwex" node="SSBTh98unc" resolve="build.number"/>
              </node>
            </node>
          </node>
          <node concept="1TblLo" id="SSBTh98up0" role="1TblLl">
            <property role="1TblLn" value="date"/>
            <node concept="NbPM2" id="SSBTh98up1" role="1TblLm">
              <node concept="3Mxwey" id="SSBTh98up2" role="3MwsjC">
                <ref role="3Mxwex" node="SSBTh98una" resolve="date"/>
              </node>
            </node>
          </node>
          <node concept="1TblLo" id="SSBTh98up3" role="1TblLl">
            <property role="1TblLn" value="version"/>
            <node concept="NbPM2" id="SSBTh98up4" role="1TblLm">
              <node concept="3Mxwew" id="SSBTh98up5" role="3MwsjC">
                <property role="3MwjfP" value="1.0"/>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="55IIr" id="6yX_AXdi_tf" role="auvoZ">
        <node concept="2Ry0Ak" id="6yX_AXdi_ti" role="iGT6I">
          <property role="2Ry0Am" value="build"/>
        </node>
      </node>
    </node>
""".trimIndent()
