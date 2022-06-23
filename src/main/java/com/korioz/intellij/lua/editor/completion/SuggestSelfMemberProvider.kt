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

package com.korioz.intellij.lua.editor.completion

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.util.PsiTreeUtil
import com.korioz.intellij.lua.psi.LuaClassMember
import com.korioz.intellij.lua.psi.LuaClassMethodDef
import com.korioz.intellij.lua.psi.LuaPsiTreeUtil
import com.korioz.intellij.lua.psi.guessClassType
import com.korioz.intellij.lua.search.SearchContext
import com.korioz.intellij.lua.ty.ITy
import com.korioz.intellij.lua.ty.ITyFunction
import com.korioz.intellij.lua.ty.isVisibleInScope

/**
 * suggest self.xxx
 * Created by Korioz on 2017/4/11.
 */
class SuggestSelfMemberProvider : ClassMemberCompletionProvider() {
    override fun addCompletions(session: CompletionSession) {
        val completionParameters = session.parameters
        val completionResultSet = session.resultSet
        val position = completionParameters.position
        val methodDef = PsiTreeUtil.getParentOfType(position, LuaClassMethodDef::class.java)
        if (methodDef != null && !methodDef.isStatic) {
            val project = position.project
            val searchContext = SearchContext.get(project)
            methodDef.guessClassType(searchContext)?.let { type ->
                val contextTy = LuaPsiTreeUtil.findContextClass(position)
                type.processMembers(searchContext) { curType, member ->
                    if (curType.isVisibleInScope(project, contextTy, member.visibility)) {
                        addMember(completionResultSet,
                                member,
                                curType,
                                type,
                                MemberCompletionMode.Colon,
                                project,
                                object : HandlerProcessor() {
                                    override fun process(element: LuaLookupElement, member: LuaClassMember, memberTy: ITy?): LookupElement { return element }

                                    override fun processLookupString(lookupString: String, member: LuaClassMember, memberTy: ITy?): String {
                                        return if (memberTy is ITyFunction) "self:${member.name}" else "self.${member.name}"
                                    }
                                })
                    }
                }
            }
        }
    }
}