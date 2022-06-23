// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaClassMethodStub;
import com.intellij.navigation.ItemPresentation;
import com.korioz.intellij.lua.comment.psi.api.LuaComment;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaClassMethodDef extends LuaClassMethod, LuaDeclaration, LuaStatement, StubBasedPsiElement<LuaClassMethodStub> {

  @NotNull
  LuaClassMethodName getClassMethodName();

  @Nullable
  LuaFuncBody getFuncBody();

  @Nullable
  LuaComment getComment();

  @NotNull
  ITy guessParentType(@NotNull SearchContext context);

  @NotNull
  Visibility getVisibility();

  int getWorth();

  boolean isDeprecated();

  @NotNull
  List<LuaParamNameDef> getParamNameDefList();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  PsiElement setName(@NotNull String name);

  @Nullable
  String getName();

  int getTextOffset();

  @NotNull
  ITy guessReturnType(@NotNull SearchContext searchContext);

  @NotNull
  LuaParamInfo[] getParams();

  boolean isStatic();

  @NotNull
  ItemPresentation getPresentation();

}
