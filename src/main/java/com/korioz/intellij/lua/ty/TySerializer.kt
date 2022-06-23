/*
 * Copyright (c) 2022. Korioz(45950144+Korioz@users.noreply.github.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.korioz.intellij.lua.ty

import com.intellij.psi.stubs.StubInputStream
import com.intellij.psi.stubs.StubOutputStream

interface ITySerializer {
    fun serialize(ty: ITy, stream: StubOutputStream)
    fun deserialize(flags: Int, stream: StubInputStream): ITy
}

abstract class TySerializer<T : ITy> : ITySerializer {
    override fun serialize(ty: ITy, stream: StubOutputStream) {
        @Suppress("UNCHECKED_CAST")
        val t = ty as T
        serializeTy(t, stream)
    }

    override fun deserialize(flags: Int, stream: StubInputStream): ITy {
        return deserializeTy(flags, stream)
    }

    abstract fun deserializeTy(flags: Int, stream: StubInputStream): T

    protected abstract fun serializeTy(ty: T, stream: StubOutputStream)
}