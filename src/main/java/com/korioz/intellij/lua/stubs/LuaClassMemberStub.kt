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

package com.korioz.intellij.lua.stubs

import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.StubElement
import com.korioz.intellij.lua.psi.Visibility

interface LuaClassMemberStub<T : PsiElement> : StubElement<T>, LuaDocTyStub {
    val visibility: Visibility
    val isDeprecated: Boolean
}