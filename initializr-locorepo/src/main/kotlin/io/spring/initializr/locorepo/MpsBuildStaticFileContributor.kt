/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.spring.initializr.locorepo

import io.spring.initializr.generator.project.contributor.ProjectContributor
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

class MpsBuildStaticFileContributor : ProjectContributor {
    @Throws(IOException::class)
    override fun contribute(projectRoot: Path) {
        BufferedReader(
                InputStreamReader(MpsBuildStaticFileContributor::class.java.getResourceAsStream("/static-files.txt"))).use { reader ->
            val collect = reader.readLines()
            for (staticResourcePath in collect) {
                val resolvedName = if (staticResourcePath.endsWith(".rem"))
                    staticResourcePath.substring(0, staticResourcePath.length - ".rem".length)
                else
                    staticResourcePath
                val resolve = projectRoot.resolve(".$resolvedName")
                if (!resolve.parent.toFile().exists()) {
                    resolve.parent.toFile().mkdirs()
                }
                Files.copy(
                    MpsBuildStaticFileContributor::class.java.getResourceAsStream("/staticfiles$staticResourcePath"),
                        resolve, StandardCopyOption.REPLACE_EXISTING)
            }
        }
    }
}
