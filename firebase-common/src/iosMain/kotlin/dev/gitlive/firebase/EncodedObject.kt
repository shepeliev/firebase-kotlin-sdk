/*
 * Copyright (c) 2020 GitLive Ltd.  Use of this source code is governed by the Apache 2.0 license.
 */

package dev.gitlive.firebase

actual interface EncodedObject : Map<Any?, Any?> {
    actual val raw: Map<String, Any?>
}
