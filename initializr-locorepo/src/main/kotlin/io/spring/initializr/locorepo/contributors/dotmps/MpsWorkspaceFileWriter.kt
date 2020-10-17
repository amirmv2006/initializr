package io.spring.initializr.locorepo.contributors.dotmps

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeWorkspaceXml(context: ProjectGenerationContext) {
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <project version="4">
          <component name="ChangeListManager">
            <list default="true" id="76e73bbb-3107-498f-a62a-39766aa98f75" name="Default Changelist" comment="add build solution">
              <change beforePath="${'$'}PROJECT_DIR${'$'}/code/buildscripts/solutions/${context.buildModule.name}/models/${context.buildModule.models[0].name}.mps" beforeDir="false" afterPath="${'$'}PROJECT_DIR${'$'}/code/buildscripts/solutions/${context.buildModule.name}/models/${context.buildModule.models[0].name}.mps" afterDir="false" />
            </list>
            <option name="SHOW_DIALOG" value="false" />
            <option name="HIGHLIGHT_CONFLICTS" value="true" />
            <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
            <option name="LAST_RESOLUTION" value="IGNORE" />
          </component>
          <component name="ConsoleHistory">
            <option name="tabs">
              <list>
                <TabState>
                  <option name="title" value="Console" />
                  <tab>
                    <model ref="319fb06f-f342-459d-a2fc-d69f58e04204/r:e073bccd-5c62-4885-b2a9-5e07cb33aa62(TempModule319fb06f-f342-459d-a2fc-d69f58e04204/ConsoleModel_141045523046800)">
                      <persistence version="9" />
                      <languages>
                        <devkit ref="70d3d6da-af63-483d-a75f-9c8acf8de332(jetbrains.mps.console.devkit)" />
                      </languages>
                      <imports />
                      <registry>
                        <language id="de1ad86d-6e50-4a02-b306-d4d17f64c375" name="jetbrains.mps.console.base">
                          <concept id="1583916890557930028" name="jetbrains.mps.console.base.structure.ConsoleRoot" flags="ng" index="aymSD">
                            <child id="1583916890557930415" name="history" index="aymYE" />
                            <child id="1583916890557930417" name="commandHolder" index="aymYO" />
                            <child id="9025248442620242919" name="cursor" index="1PhJh3" />
                          </concept>
                          <concept id="5758176878586720817" name="jetbrains.mps.console.base.structure.CommandHolderRef" flags="ng" index="2_V_lH">
                            <reference id="5758176878586720818" name="target" index="2_V_lI" />
                          </concept>
                          <concept id="351968380916615243" name="jetbrains.mps.console.base.structure.CommandHolder" flags="ng" index="2Clz${'$'}F" />
                          <concept id="757553790980850366" name="jetbrains.mps.console.base.structure.History" flags="ng" index="3balQm" />
                        </language>
                      </registry>
                      <node concept="aymSD" id="6GDap4jTile">
                        <node concept="3balQm" id="6GDap4jTilf" role="aymYE" />
                        <node concept="2Clz${'$'}F" id="6GDap4jTilg" role="aymYO" />
                        <node concept="2_V_lH" id="6GDap4jTilh" role="1PhJh3">
                          <ref role="2_V_lI" node="6GDap4jTilg" resolve="CommandHolder" />
                        </node>
                      </node>
                    </model>
                  </tab>
                </TabState>
              </list>
            </option>
          </component>
          <component name="DefaultSearchOptions3">
            <search_options>
              <finders>
                <finders />
              </finders>
              <scope>
                <scope_type scope_type="PROJECT" module="&lt;default&gt;" model="&lt;default&gt;" />
              </scope>
              <view>
                <flags show_one_result="true" new_tab="false" />
              </view>
            </search_options>
          </component>
          <component name="Git.Settings">
            <option name="RECENT_BRANCH_BY_REPOSITORY">
              <map>
                <entry key="${'$'}PROJECT_DIR${'$'}" value="master" />
              </map>
            </option>
            <option name="RECENT_GIT_ROOT_PATH" value="${'$'}PROJECT_DIR${'$'}" />
          </component>
          <component name="MPSBookmarkManager">
            <option name="myBookmarkInfos">
              <array>
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
                <BookmarkInfo />
              </array>
            </option>
          </component>
          <component name="MessagesViewTool">
            <option name="defaultListState">
              <MessageListState>
                <option name="autoscrollToSource" value="true" />
                <option name="info" value="true" />
                <option name="warnings" value="true" />
              </MessageListState>
            </option>
          </component>
          <component name="ProjectId" id="1ij9BLe6jzdEZk08OF8QX5IjE8E" />
          <component name="ProjectLevelVcsManager" settingsEditedManually="true" />
          <component name="ProjectPluginManager">
            <option name="pluginsState">
              <option name="jetbrains.mps.baseLanguage.lightweightdsl.pluginSolution.plugin.PluginSolution_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.editor.contextActionsTool.pluginSolution.plugin.PluginSolution_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.execution.configurations.implementation.plugin.plugin.Plugin_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.execution.configurations.pluginSolution.plugin.PluginSolution_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.ide.actions.Ide_ProjectPlugin">
                <value>
                  <PluginState>
                    <option name="myComponentsState">
                      <list>
                        <ComponentState>
                          <option name="first" value="jetbrains.mps.ide.actions.BehaviorDialogsPersistentOptions_PreferencesComponent" />
                          <params>
                            <option name="addReturnsOnImplement" value="false" />
                            <option name="sortAlphabetically" value="false" />
                            <option name="removeAttributes" value="true" />
                          </params>
                        </ComponentState>
                      </list>
                    </option>
                  </PluginState>
                </value>
              </option>
              <option name="jetbrains.mps.ide.devkit.actions.Mpsdevkit_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.ide.make.actions.Make_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.lang.editor.tooltips.runtime.plugin.Runtime_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="jetbrains.mps.vcs.mergehints.plugin.plugin.Plugin_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="org.fbme.ide.integration.fordiac.Fordiac_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="org.fbme.ide.platform.Platform_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
              <option name="org.fbme.ide.richediting.plugin.Richediting_ProjectPlugin">
                <value>
                  <PluginState>
                    <option name="myComponentsState">
                      <list>
                        <ComponentState>
                          <option name="first" value="org.fbme.ide.richediting.plugin.NetworkPresentationSetting_PreferencesComponent" />
                          <params>
                            <option name="scale" value="2.0" />
                          </params>
                        </ComponentState>
                      </list>
                    </option>
                  </PluginState>
                </value>
              </option>
              <option name="org.fbme.scenes.plugin.Scenes_ProjectPlugin">
                <value>
                  <PluginState />
                </value>
              </option>
            </option>
          </component>
          <component name="ProjectView">
            <navigator currentView="ProjectPane" proportions="" version="1" />
            <panes>
              <pane id="FileSystem">
                <subPane>
                  <expand>
                    <path>
                      <item name="" type="" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                      <item name="" type="" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                      <item name="" type="" />
                      <item name="" type="" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                      <item name="" type="" />
                      <item name="" type="" />
                      <item name="" type="" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                      <item name="" type="" />
                      <item name="" type="" />
                      <item name="" type="" />
                      <item name="" type="" />
                    </path>
                    <path>
                      <item name="" type="" />
                      <item name="langs" type="cbb8eebc:String" user="langs" />
                      <item name="" type="" />
                      <item name="" type="" />
                      <item name="" type="" />
                    </path>
                  </expand>
                  <select />
                </subPane>
              </pane>
              <pane id="ProjectPane">
                <subPane>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:93cddfb0-2f91-4e44-8dd7-918d4ac0664e(${context.language.name}.typesystem) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/models/${context.language.name}.typesystem.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:b80610d6-8815-4026-ac21-cad151a726c7(${context.language.name}.structure) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/models/${context.language.name}.structure.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.name}#01" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:e1aa9742-2b15-490e-aaab-fa81191a1d61(main@generator) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/generator/templates/main@generator.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="a46bd4c1-13c4-48fa-b701-509704571bf5" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="ir" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:${context.buildModule.id}(${context.buildModule.name}) in IdeaFile[path: C:/ws/os/mps-reference/code/buildscripts/solutions/${context.buildModule.name}/models/${context.buildModule.models[0].name}.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="2047959842832639409" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="a46bd4c1-13c4-48fa-b701-509704571bf5" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="ir" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="a46bd4c1-13c4-48fa-b701-509704571bf5" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.name}#01" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:71bc55fa-cf8d-4a62-9915-a60215b7a7a7(${context.language.name}.behavior) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/models/${context.language.name}.behavior.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:aebcb736-1676-438a-b623-a01f8512e40a(${context.language.name}.constraints) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/models/${context.language.name}.constraints.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="${context.language.id}(${context.language.name})" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:ca7676b2-c150-4239-b376-8c9bb271c1f3(${context.language.name}.editor) in IdeaFile[path: C:/ws/os/mps-reference/code/${context.metadata.artifactId.content}/languages/${context.language.name}/models/${context.language.name}.editor.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="langs" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <PATH>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="a46bd4c1-13c4-48fa-b701-509704571bf5" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="ir" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:${context.buildModule.id}(${context.buildModule.name}) in IdeaFile[path: C:/ws/os/mps-reference/code/buildscripts/solutions/${context.buildModule.name}/models/${context.buildModule.models[0].name}.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </PATH>
                  <SELECTED>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="Project" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="buildscripts" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="a46bd4c1-13c4-48fa-b701-509704571bf5" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="ir" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="r:${context.buildModule.id}(${context.buildModule.name}) in IdeaFile[path: C:/ws/os/mps-reference/code/buildscripts/solutions/${context.buildModule.name}/models/${context.buildModule.models[0].name}.mps]" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                    <PATH_ELEMENT>
                      <option name="myItemId" value="2047959842832673082" />
                      <option name="myItemType" value="" />
                    </PATH_ELEMENT>
                  </SELECTED>
                </subPane>
              </pane>
            </panes>
          </component>
          <component name="ProjectViewState">
            <option name="hideEmptyMiddlePackages" value="true" />
            <option name="showLibraryContents" value="true" />
          </component>
          <component name="PropertiesComponent">
            <property name="RunOnceActivity.OpenProjectViewOnStart" value="true" />
            <property name="last_opened_file_path" value="${'$'}PROJECT_DIR${'$'}/../fbme" />
            <property name="settings.editor.selected.configurable" value="preferences.pluginManager" />
          </component>
          <component name="RunManager" selected="MPS.Run">
            <configuration name="build plugin" type="Build Script" factoryName="Build Script">
              <myNodePointer>
                <MyState>
                  <option name="myNodePointer" value="r:${context.buildModule.id}(${context.buildModule.name})/2047959842832673082" />
                  <option name="myNodeText" value="${context.buildModule.name}_Plugin" />
                </MyState>
              </myNodePointer>
              <mySettings>
                <MyState>
                  <option name="myUseOtherAntLocation" value="false" />
                  <option name="myOtherAntLocation" value="" />
                  <option name="myAntOptions" value="" />
                </MyState>
              </mySettings>
              <method v="2">
                <option name="jetbrains.mps.execution.configurations.pluginSolution.plugin.MakeNodePointers_BeforeTask" enabled="true" />
              </method>
            </configuration>
            <configuration name="mps-reference" type="Build Script" factoryName="Build Script" temporary="true">
              <myNodePointer>
                <MyState>
                  <option name="myNodePointer" value="r:${context.buildModule.id}(${context.buildModule.name})/1024744374457722311" />
                  <option name="myNodeText" value="${context.buildModule.name}" />
                </MyState>
              </myNodePointer>
              <mySettings>
                <MyState>
                  <option name="myUseOtherAntLocation" value="false" />
                  <option name="myOtherAntLocation" />
                  <option name="myAntOptions" />
                </MyState>
              </mySettings>
              <method v="2">
                <option name="jetbrains.mps.execution.configurations.pluginSolution.plugin.MakeNodePointers_BeforeTask" enabled="true" />
              </method>
            </configuration>
            <configuration name="Run" type="MPS" factoryName="MPS Instance">
              <myMpsSettings>
                <MyState>
                  <option name="myVmOptions" value="" />
                  <option name="myJrePath" value="${'$'}PROJECT_DIR${'$'}/../../../tools/jdk-11.0.8" />
                  <option name="mySettingsPath" value="${'$'}USER_HOME${'$'}/AppData/Roaming/JetBrains/MPSInstanceRC" />
                </MyState>
              </myMpsSettings>
              <myPluginsSettings>
                <MyState>
                  <option name="myPluginsToDeploy">
                    <list>
                      <option value="r:${context.buildModule.id}"("${context.buildModule.name}")/4421553559174235830" />
                    </list>
                  </option>
                </MyState>
              </myPluginsSettings>
              <method v="2">
                <option name="jetbrains.mps.execution.configurations.implementation.plugin.plugin.AssemblePluginsBeforeTask_BeforeTask" enabled="true" />
              </method>
            </configuration>
            <list>
              <item itemvalue="Build Script.build plugin" />
              <item itemvalue="Build Script.mps-reference" />
              <item itemvalue="MPS.Run" />
            </list>
            <recent_temporary>
              <list>
                <item itemvalue="Build Script.mps-reference" />
              </list>
            </recent_temporary>
          </component>
          <component name="SpellCheckerSettings" RuntimeDictionaries="0" Folders="0" CustomDictionaries="0" DefaultDictionary="application-level" UseSingleDictionary="true" transferred="true" />
          <component name="SvnConfiguration">
            <configuration>C:\Users\avosough\AppData\Roaming\Subversion</configuration>
          </component>
          <component name="TaskManager">
            <task active="true" id="Default" summary="Default task">
              <changelist id="76e73bbb-3107-498f-a62a-39766aa98f75" name="Default Changelist" comment="" />
              <created>1602409998043</created>
              <option name="number" value="Default" />
              <option name="presentableId" value="Default" />
              <updated>1602409998043</updated>
            </task>
            <servers />
          </component>
          <component name="UsagesViewTool">
            <version id="1" />
            <tabs />
            <default_view_options>
              <options category_option="false" module_option="true" model_option="true" root_option="true" path_option="false" count_option="true" info_option="true" view_searched_nodes_option="true" group_searched_nodes_option="true" autoscroll_option="false" />
            </default_view_options>
          </component>
          <component name="WindowStateProjectService">
            <state x="2469" y="188" width="950" height="545" key="#MPSPropertiesConfigurable" timestamp="1602529519632">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="412" y="139" key="#MPSPropertiesConfigurable/0.0.1536.824/1920.0.2048.1112@0.0.1536.824" timestamp="1602415952356" />
            <state x="2469" y="188" width="950" height="545" key="#MPSPropertiesConfigurable/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602529519632" />
            <state x="2399" y="211" width="1089" height="778" key="#com.intellij.execution.impl.EditConfigurationsDialog" timestamp="1602855796770">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2399" y="211" width="1089" height="778" key="#com.intellij.execution.impl.EditConfigurationsDialog/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855796770" />
            <state x="2519" y="225" key="#jetbrains.mps.ide.migration.MigrationAssistantWizard" timestamp="1602529398351">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="449" y="167" key="#jetbrains.mps.ide.migration.MigrationAssistantWizard/0.0.1536.824/1920.0.2048.1112@0.0.1536.824" timestamp="1602415218566" />
            <state x="2519" y="225" key="#jetbrains.mps.ide.migration.MigrationAssistantWizard/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602529398351" />
            <state x="449" y="167" key="#jetbrains.mps.ide.migration.MigrationAssistantWizard/0.0.1536.824@0.0.1536.824" timestamp="1602448267015" />
            <state x="591" y="330" key="#jetbrains.mps.vcs.mergedriver.MergeDriverOptionDialog" timestamp="1602410060625">
              <screen x="0" y="0" width="1536" height="824" />
            </state>
            <state x="591" y="330" key="#jetbrains.mps.vcs.mergedriver.MergeDriverOptionDialog/0.0.1536.824/1920.0.2048.1112@0.0.1536.824" timestamp="1602410060625" />
            <state x="2675" y="311" key="#jetbrains.mps.workbench.dialogs.project.utildialogs.addmodelimport.AddRequiredModelImportsDialog2" timestamp="1602849148989">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2675" y="311" key="#jetbrains.mps.workbench.dialogs.project.utildialogs.addmodelimport.AddRequiredModelImportsDialog2/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602849148989" />
            <state x="2447" y="0" key="CommitChangelistDialog2" timestamp="1602586872778">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="395" y="0" key="CommitChangelistDialog2/0.0.1536.824/1920.0.2048.1112@0.0.1536.824" timestamp="1602414851615" />
            <state x="2447" y="0" key="CommitChangelistDialog2/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602586872778" />
            <state x="2323" y="208" width="1228" height="687" key="DiffContextDialog" timestamp="1603218706683">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2323" y="208" width="1228" height="687" key="DiffContextDialog/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1603218706683" />
            <state x="2748" y="469" key="EditParametersPopupWindow" timestamp="1602854678449">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2748" y="469" key="EditParametersPopupWindow/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602854678449" />
            <state x="2652" y="225" key="FileChooserDialogImpl" timestamp="1602855794344">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="549" y="167" key="FileChooserDialogImpl/0.0.1536.824/1920.0.2048.1112@0.0.1536.824" timestamp="1602523323205" />
            <state x="2652" y="225" key="FileChooserDialogImpl/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855794344" />
            <state width="2005" height="507" key="GridCell.Tab.0.bottom" timestamp="1602855847423">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state width="2005" height="507" key="GridCell.Tab.0.bottom/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855847423" />
            <state width="1493" height="354" key="GridCell.Tab.0.bottom/0.0.1536.824@0.0.1536.824" timestamp="1602448322200" />
            <state width="2005" height="507" key="GridCell.Tab.0.center" timestamp="1602855847423">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state width="2005" height="507" key="GridCell.Tab.0.center/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855847423" />
            <state width="1493" height="354" key="GridCell.Tab.0.center/0.0.1536.824@0.0.1536.824" timestamp="1602448322199" />
            <state width="2005" height="507" key="GridCell.Tab.0.left" timestamp="1602855847423">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state width="2005" height="507" key="GridCell.Tab.0.left/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855847423" />
            <state width="1493" height="354" key="GridCell.Tab.0.left/0.0.1536.824@0.0.1536.824" timestamp="1602448322199" />
            <state width="2005" height="507" key="GridCell.Tab.0.right" timestamp="1602855847423">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state width="2005" height="507" key="GridCell.Tab.0.right/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602855847423" />
            <state width="1493" height="354" key="GridCell.Tab.0.right/0.0.1536.824@0.0.1536.824" timestamp="1602448322199" />
            <state x="2525" y="299" key="IDE.errors.dialog" timestamp="1602446887958">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2525" y="299" key="IDE.errors.dialog/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602446887958" />
            <state x="2675" y="276" key="RollbackChangesDialog" timestamp="1602524420090">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2675" y="276" key="RollbackChangesDialog/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602524420090" />
            <state x="2453" y="201" key="SettingsEditor" timestamp="1602529777142">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2453" y="201" key="SettingsEditor/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602529777142" />
            <state x="2607" y="243" width="672" height="678" key="search.everywhere.popup" timestamp="1602524349635">
              <screen x="1920" y="0" width="2048" height="1112" />
            </state>
            <state x="2607" y="243" width="672" height="678" key="search.everywhere.popup/0.0.1536.824/1920.0.2048.1112@1920.0.2048.1112" timestamp="1602524349635" />
          </component>
        </project>
    """.trimIndent())
}
