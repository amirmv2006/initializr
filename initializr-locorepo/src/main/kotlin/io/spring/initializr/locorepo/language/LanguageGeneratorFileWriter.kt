package io.spring.initializr.locorepo.language

import io.spring.initializr.locorepo.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeGeneratorMps(context: LanguageGenerationContext) {
    //language=XML
    this.toFile().writeText("""
        <?xml version="1.0" encoding="UTF-8"?>
        <model ref="r:${context.language.generator.id}(main@generator)">
          <persistence version="9" />
          <languages>
            <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
          </languages>
          <imports>
            <import index="7nmm" ref="${context.language.structureModel.modelReference()}" />
          </imports>
          <registry>
            <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
              <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia" />
            </language>
            <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
              <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
                <property id="1169194664001" name="name" index="TrG5h" />
              </concept>
            </language>
          </registry>
          <node concept="bUwia" id="4g_GzHxyk63">
            <property role="TrG5h" value="main" />
          </node>
        </model>
    """.trimIndent())
}
