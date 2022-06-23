// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.psi.LuaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.korioz.intellij.lua.psi.*;

public class LuaBinaryOpImpl extends ASTWrapperPsiElement implements LuaBinaryOp {

  public LuaBinaryOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitBinaryOp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

}
