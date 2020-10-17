package io.spring.initializr.locorepo

import io.spring.initializr.metadata.InitializrMetadata
import java.nio.file.Path

fun Path.projectAsFile(metadata: InitializrMetadata, postfix: String): Path {
    return resolve("${metadata.groupId.content}.${metadata.artifactId.content}.$postfix")
}

fun Path.projectAsDir(metadata: InitializrMetadata): Path {
    val groupIdList = metadata.groupId.content.splitToSequence('.').toList()
    return resolveMulti(groupIdList).resolve(metadata.artifactId.content)
}

fun Path.resolveMulti(vararg multi: String): Path {
    return resolveMulti(multi.toList())
}

fun Path.resolveMulti(multi: List<String>): Path {
    var cnt = this
    for (g in multi) {
        cnt = cnt.resolve(g)
    }
    return cnt
}
