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
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiUtilCore
import com.korioz.intellij.lua.comment.LuaCommentUtil
import com.korioz.intellij.lua.lang.LuaFileType
import com.korioz.intellij.lua.lang.LuaLanguage
import com.korioz.intellij.lua.psi.LuaTypes

/**

 * Created by Korioz on 2017/2/11.
 */
class LuaCodeContextType : TemplateContextType("LUA_CODE", "Lua") {

    override fun isInContext(file: PsiFile, offset: Int): Boolean {
        if (PsiUtilCore.getLanguageAtOffset(file, offset).isKindOf(LuaLanguage.INSTANCE)) {
            val element = file.findElementAt(offset)
            if (element == null || element is PsiWhiteSpace || LuaCommentUtil.isComment(element)) {
                return false
            }
            if (element.node.elementType in arrayOf(LuaTypes.STRING, LuaTypes.NUMBER)) {
                return false
            }
        }
        return file.fileType === LuaFileType.INSTANCE
    }
}
