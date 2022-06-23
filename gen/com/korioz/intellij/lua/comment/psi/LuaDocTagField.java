// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.psi.LuaClassField;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaDocTagFieldStub;
import com.intellij.navigation.ItemPresentation;
import com.korioz.intellij.lua.psi.Visibility;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocTagField extends LuaClassField, LuaDocPsiElement, PsiNameIdentifierOwner, LuaDocTag, StubBasedPsiElement<LuaDocTagFieldStub> {

  @Nullable
  LuaDocAccessModifier getAccessModifier();

  @Nullable
  LuaDocClassNameRef getClassNameRef();

  @Nullable
  LuaDocCommentString getCommentString();

  @Nullable
  LuaDocTy getTy();

  @Nullable
  PsiElement getId();

  @NotNull
  ITy guessParentType(@NotNull SearchContext context);

  @NotNull
  Visibility getVisibility();

  int getWorth();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @Nullable
  String getName();

  int getTextOffset();

  @Nullable
  String getFieldName();

  @NotNull
  ItemPresentation getPresentation();

  boolean isDeprecated();

}
