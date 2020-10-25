package io.spring.initializr.locorepo.contributors.dotmps

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path
import java.util.*

fun Path.writeWorkspaceXml(context: ProjectGenerationContext) {
    val changeListId = UUID.randomUUID()
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ChangeListManager">
    <list default="true" id="$changeListId" name="Default Changelist" comment="" />
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
            <model ref="b4ce6940-6db5-4be9-8298-1f1e64b327b9/r:8507c2e6-ef93-40c2-8692-b6963272ae31(TempModuleb4ce6940-6db5-4be9-8298-1f1e64b327b9/ConsoleModel_82532934890600)">
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
              <node concept="aymSD" id="RXj8sox7wB">
                <node concept="3balQm" id="RXj8sox7wC" role="aymYE" />
                <node concept="2Clz${'$'}F" id="RXj8sox7wD" role="aymYO" />
                <node concept="2_V_lH" id="RXj8sox7wE" role="1PhJh3">
                  <ref role="2_V_lI" node="RXj8sox7wD" resolve="CommandHolder" />
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
    </option>
  </component>
  <component name="ProjectView">
    <navigator currentView="ProjectPane" proportions="" version="1" />
    <panes>
      <pane id="ProjectPane">
        <subPane>
          <SELECTED>
            <PATH_ELEMENT>
              <option name="myItemId" value="Project" />
              <option name="myItemType" value="" />
            </PATH_ELEMENT>
          </SELECTED>
        </subPane>
      </pane>
      <pane id="FileSystem" />
    </panes>
  </component>
  <component name="ProjectViewState">
    <option name="hideEmptyMiddlePackages" value="true" />
    <option name="showLibraryContents" value="true" />
  </component>
  <component name="TaskManager">
    <task active="true" id="Default" summary="Default task">
      <changelist id="$changeListId" name="Default Changelist" comment="" />
      <created>1603615293456</created>
      <option name="number" value="Default" />
      <option name="presentableId" value="Default" />
      <updated>1603615293456</updated>
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
</project>
    """.trimIndent())
}
