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

import com.intellij.psi.stubs.IndexSink
import com.intellij.psi.stubs.StubElement
import com.intellij.psi.stubs.StubInputStream
import com.intellij.psi.stubs.StubOutputStream
import com.korioz.intellij.lua.psi.LuaClosureExpr
import com.korioz.intellij.lua.psi.LuaElementTypes
import com.korioz.intellij.lua.psi.LuaParamInfo
import com.korioz.intellij.lua.psi.impl.LuaClosureExprImpl
import com.korioz.intellij.lua.psi.overloads
import com.korioz.intellij.lua.ty.IFunSignature
import com.korioz.intellij.lua.ty.ITy
import com.korioz.intellij.lua.ty.TyParameter

class LuaClosureExprType : LuaStubElementType<LuaClosureExprStub, LuaClosureExpr>("CLOSURE_EXPR") {
    override fun indexStub(stub: LuaClosureExprStub, sink: IndexSink) {

    }

    override fun serialize(stub: LuaClosureExprStub, outputStream: StubOutputStream) {
        outputStream.writeParamInfoArray(stub.params)
        outputStream.writeSignatures(stub.overloads)
    }

    override fun createPsi(stub: LuaClosureExprStub): LuaClosureExpr {
        return LuaClosureExprImpl(stub, this)
    }

    override fun createStub(expr: LuaClosureExpr, parentStub: StubElement<*>?): LuaClosureExprStub {
        val varargTy = expr.varargType
        val params = expr.params
        val overloads = expr.overloads
        return LuaClosureExprStub(null, varargTy, params, overloads, parentStub)
    }

    override fun deserialize(inputStream: StubInputStream, parentStub: StubElement<*>?): LuaClosureExprStub {
        val params = inputStream.readParamInfoArray()
        val overloads = inputStream.readSignatures()
        return LuaClosureExprStub(null, null, params, overloads, parentStub)
    }
}

class LuaClosureExprStub(
        override val returnDocTy: ITy?,
        override val varargTy: ITy?,
        override val params: Array<LuaParamInfo>,
        override val overloads: Array<IFunSignature>,
        parent: StubElement<*>?
) : LuaStubBase<LuaClosureExpr>(parent, LuaElementTypes.CLOSURE_EXPR), LuaFuncBodyOwnerStub<LuaClosureExpr>, LuaExprStub<LuaClosureExpr> {
    override val tyParams: Array<TyParameter>
        get() = emptyArray()
}