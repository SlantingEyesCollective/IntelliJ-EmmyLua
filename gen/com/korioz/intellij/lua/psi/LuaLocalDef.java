// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaPlaceholderStub;
import com.korioz.intellij.lua.comment.psi.api.LuaComment;

public interface LuaLocalDef extends LuaDeclaration, LuaStatement, LuaDeclarationScope, StubBasedPsiElement<LuaPlaceholderStub> {

  @Nullable
  LuaExprList getExprList();

  @Nullable
  LuaNameList getNameList();

  @Nullable
  LuaComment getComment();

  @Nullable
  PsiElement getAssign();

}
