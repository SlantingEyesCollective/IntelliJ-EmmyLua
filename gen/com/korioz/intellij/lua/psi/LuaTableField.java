// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaTableFieldStub;
import com.intellij.navigation.ItemPresentation;
import com.korioz.intellij.lua.comment.psi.api.LuaComment;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaTableField extends LuaClassField, PsiNameIdentifierOwner, LuaCommentOwner, StubBasedPsiElement<LuaTableFieldStub> {

  @NotNull
  List<LuaExpr> getExprList();

  @Nullable
  PsiElement getId();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  PsiElement setName(@NotNull String name);

  @Nullable
  String getName();

  int getTextOffset();

  @Nullable
  String getFieldName();

  @NotNull
  ItemPresentation getPresentation();

  @NotNull
  ITy guessParentType(@NotNull SearchContext context);

  @NotNull
  Visibility getVisibility();

  int getWorth();

  boolean isDeprecated();

  @Nullable
  LuaComment getComment();

  @Nullable
  LuaExpr getIdExpr();

  @Nullable
  PsiElement getLbrack();

}
