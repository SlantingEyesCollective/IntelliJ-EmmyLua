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

package com.korioz.intellij.lua.codeInsight.intention

import com.intellij.codeInsight.intention.impl.BaseIntentionAction
import com.intellij.codeInsight.template.impl.MacroCallNode
import com.intellij.codeInsight.template.impl.TextExpression
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.korioz.intellij.lua.codeInsight.template.macro.SuggestTypeMacro
import com.korioz.intellij.lua.comment.LuaCommentUtil
import com.korioz.intellij.lua.psi.LuaLocalDef
import com.korioz.intellij.lua.psi.LuaPsiTreeUtil

/**
 *
 * Created by Korioz on 2016/12/16.
 */
class CreateTypeAnnotationIntention : BaseIntentionAction() {

    override fun getFamilyName(): String {
        return text
    }

    override fun getText(): String {
        return "Create type annotation"
    }

    override fun isAvailable(project: Project, editor: Editor, psiFile: PsiFile): Boolean {
        val localDef = LuaPsiTreeUtil.findElementOfClassAtOffset(psiFile, editor.caretModel.offset, LuaLocalDef::class.java, false)
        if (localDef != null) {
            val comment = localDef.comment
            return comment?.tagType == null
        }
        return false
    }

    override fun invoke(project: Project, editor: Editor, psiFile: PsiFile) {
        val localDef = LuaPsiTreeUtil.findElementOfClassAtOffset(psiFile, editor.caretModel.offset, LuaLocalDef::class.java, false)
        if (localDef != null) {
            LuaCommentUtil.insertTemplate(localDef, editor) { _, template ->
                template.addTextSegment("---@type ")
                val name = MacroCallNode(SuggestTypeMacro())
                template.addVariable("type", name, TextExpression("table"), true)
                template.addEndVariable()
            }
        }
    }
}