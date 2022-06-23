// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocTagReturn extends LuaDocTag {

  @Nullable
  LuaDocCommentString getCommentString();

  @Nullable
  LuaDocTypeList getTypeList();

  @NotNull
  ITy resolveTypeAt(int index);

  @NotNull
  ITy getType();

}
