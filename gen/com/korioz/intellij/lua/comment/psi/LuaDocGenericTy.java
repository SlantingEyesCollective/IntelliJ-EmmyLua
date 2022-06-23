// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocGenericTy extends LuaDocTy {

  @NotNull
  List<LuaDocTy> getTyList();

  @NotNull
  ITy getType();

}
