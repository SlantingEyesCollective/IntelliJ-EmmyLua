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

package com.korioz.intellij.lua.debugger.remote.value

import com.intellij.xdebugger.frame.XValueNode
import com.intellij.xdebugger.frame.XValuePlace
import com.intellij.xdebugger.frame.presentation.XValuePresentation
import com.korioz.intellij.lua.debugger.LuaXNumberPresentation
import com.korioz.intellij.lua.debugger.LuaXStringPresentation
import com.korioz.intellij.lua.debugger.LuaXValuePresentation
import com.korioz.intellij.lua.highlighting.LuaHighlightingData
import org.luaj.vm2.*

/**
 *
 * Created by Korioz on 2017/4/16.
 */
class LuaRPrimitive(name: String) : LuaRValue(name) {
    private var type: String? = null
    private lateinit var data: String
    private var valuePresentation: XValuePresentation? = null

    override fun parse(data: LuaValue, desc: String) {
        this.data = data.toString()
        when (data) {
            is LuaString -> {
                type = "string"
                valuePresentation = LuaXStringPresentation(this.data)
            }
            is LuaNumber -> {
                type = "number"
                valuePresentation = LuaXNumberPresentation(this.data)
            }
            is LuaBoolean -> {
                type = "boolean"
                valuePresentation = LuaXValuePresentation(type!!, this.data, LuaHighlightingData.PRIMITIVE_TYPE)
            }
            is LuaFunction -> type = "function"
        }
    }

    override fun computePresentation(xValueNode: XValueNode, xValuePlace: XValuePlace) {
        if (valuePresentation == null) {
            xValueNode.setPresentation(null, type, data, false)
        } else {
            xValueNode.setPresentation(null, valuePresentation!!, false)
        }
    }
}
