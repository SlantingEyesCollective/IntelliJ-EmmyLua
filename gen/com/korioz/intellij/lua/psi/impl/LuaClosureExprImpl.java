// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.psi.LuaTypes.*;
import com.korioz.intellij.lua.psi.*;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;
import com.korioz.intellij.lua.stubs.LuaClosureExprStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import com.korioz.intellij.lua.stubs.LuaExprStub;

public class LuaClosureExprImpl extends LuaClosureExprMixin implements LuaClosureExpr {

  public LuaClosureExprImpl(@NotNull LuaClosureExprStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaClosureExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaClosureExprImpl(@NotNull LuaClosureExprStub stub, @NotNull IElementType type, @NotNull ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitClosureExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaFuncBody getFuncBody() {
    return PsiTreeUtil.getStubChildOfType(this, LuaFuncBody.class);
  }

  @Override
  @NotNull
  public List<LuaParamNameDef> getParamNameDefList() {
    return LuaPsiImplUtilKt.getParamNameDefList(this);
  }

  @Override
  @NotNull
  public ITy guessReturnType(@NotNull SearchContext searchContext) {
    return LuaPsiImplUtilKt.guessReturnType(this, searchContext);
  }

  @Override
  @NotNull
  public LuaParamInfo[] getParams() {
    return LuaPsiImplUtilKt.getParams(this);
  }

}
