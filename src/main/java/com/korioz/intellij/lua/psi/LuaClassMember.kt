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

package com.korioz.intellij.lua.psi

import com.intellij.psi.PsiNamedElement
import com.korioz.intellij.lua.search.SearchContext
import com.korioz.intellij.lua.ty.ITy
import com.korioz.intellij.lua.ty.ITyClass
import com.korioz.intellij.lua.ty.TyUnion

interface WorthElement {
    val worth: Int
}

/**
 * Class 成员
 * Created by Korioz on 2016/12/12.
 */
interface LuaClassMember : LuaTypeGuessable, PsiNamedElement, WorthElement {
    companion object {
        const val WORTH_DOC = 1000
        const val WORTH_METHOD_DEF = WORTH_DOC - 100
        const val WORTH_TABLE_FIELD = WORTH_DOC - 200
        const val WORTH_ASSIGN = 0
    }
    fun guessParentType(context: SearchContext): ITy
    val visibility: Visibility
    val isDeprecated: Boolean
}

fun LuaClassMember.guessClassType(context: SearchContext): ITyClass? {
    val ty = guessParentType(context)
    return TyUnion.getPerfectClass(ty)
}