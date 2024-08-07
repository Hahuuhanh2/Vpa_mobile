package com.google.android.material.appbar;

import android.view.View;
import x1.j;

/* compiled from: AppBarLayout */
public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5668b;

    public e(AppBarLayout appBarLayout, boolean z10) {
        this.f5667a = appBarLayout;
        this.f5668b = z10;
    }

    public final boolean a(View view) {
        this.f5667a.setExpanded(this.f5668b);
        return true;
    }
}
