package com.google.android.material.navigation;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import f0.b0;

/* compiled from: NavigationBarMenu */
public final class e extends f {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f6607z;

    public e(Context context, Class<?> cls, int i10) {
        super(context);
        this.f6607z = cls;
        this.A = i10;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.A) {
            y();
            h a10 = super.a(i10, i11, i12, charSequence);
            a10.f(true);
            x();
            return a10;
        }
        String simpleName = this.f6607z.getSimpleName();
        StringBuilder w9 = b0.w("Maximum number of items supported by ", simpleName, " is ");
        w9.append(this.A);
        w9.append(". Limit can be checked with ");
        w9.append(simpleName);
        w9.append("#getMaxItemCount()");
        throw new IllegalArgumentException(w9.toString());
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f6607z.getSimpleName() + " does not support submenus");
    }
}
