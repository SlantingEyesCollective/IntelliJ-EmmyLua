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

package com.korioz.intellij.lua.debugger;

/**
 *
 * Created by Korioz on 2017/5/7.
 */
public enum DebuggerType {
    Attach(1, "Attach Debugger(Not available)"), Mob(2, "Remote Debugger(Mobdebug)");
    private int v;
    private String desc;
    DebuggerType(int v, String desc) {
        this.v = v;
        this.desc = desc;
    }
    public static DebuggerType valueOf(int v) {
        switch (v) {
            case 1: return Attach;
            case 2: return Mob;
            default: return null;
        }
    }
    public int value() { return v; }
    public String toString() { return desc; }
}
