// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.comment.psi.LuaDocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.korioz.intellij.lua.comment.psi.*;
import com.intellij.psi.PsiReference;
import com.korioz.intellij.lua.ty.ITy;

public class LuaDocClassNameRefImpl extends ASTWrapperPsiElement implements LuaDocClassNameRef {

  public LuaDocClassNameRefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitClassNameRef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return notNullChild(findChildByType(ID));
  }

  @Override
  @NotNull
  public PsiReference getReference() {
    return LuaDocPsiImplUtilKt.getReference(this);
  }

  @Override
  @NotNull
  public ITy resolveType() {
    return LuaDocPsiImplUtilKt.resolveType(this);
  }

}
