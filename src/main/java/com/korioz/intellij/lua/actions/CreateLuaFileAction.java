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

package com.korioz.intellij.lua.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.korioz.intellij.lua.lang.LuaIcons;

/**
 *
 * Created by Korioz on 2016/12/24.
 */
public class CreateLuaFileAction extends CreateFileFromTemplateAction implements DumbAware {
    private static final String CREATE_LUA_FILE = "New Lua File";

    public CreateLuaFileAction() {
        super(CREATE_LUA_FILE, "", LuaIcons.FILE);
    }

    @Override
    protected void buildDialog(Project project, PsiDirectory psiDirectory, CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle(CREATE_LUA_FILE)
        .addKind("Source File", LuaIcons.FILE, "NewLua.lua");
    }

    @Override
    protected String getActionName(PsiDirectory psiDirectory, String s, String s1) {
        return CREATE_LUA_FILE;
    }
}
