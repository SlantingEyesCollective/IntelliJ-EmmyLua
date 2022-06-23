// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocClassNameRef extends LuaDocPsiElement {

  @NotNull
  PsiElement getId();

  @NotNull
  PsiReference getReference();

  @NotNull
  ITy resolveType();

}
