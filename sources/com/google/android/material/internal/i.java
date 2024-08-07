package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/* compiled from: NavigationMenu */
public final class i extends f {
    public i(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        l lVar = new l(this.f615a, this, a10);
        a10.f656o = lVar;
        lVar.setHeaderTitle(a10.f646e);
        return lVar;
    }
}
