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

package com.korioz.intellij.lua.codeInsight.template.context

import com.intellij.codeInsight.template.TemplateContextType
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import com.korioz.intellij.lua.psi.LuaFuncBody

class LuaFunContextType : TemplateContextType("LUA_FUNCTION", "function", LuaCodeContextType::class.java) {

    override fun isInContext(psiFile: PsiFile, i: Int): Boolean {
        return PsiTreeUtil.findElementOfClassAtOffset(psiFile, i, LuaFuncBody::class.java, false) != null
    }
}