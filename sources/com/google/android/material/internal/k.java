package com.google.android.material.internal;

import android.view.View;
import com.google.android.material.internal.j;
import w1.a;
import x1.f;

/* compiled from: NavigationMenuPresenter */
public final class k extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6473d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f6474e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j.c f6475f;

    public k(j.c cVar, int i10, boolean z10) {
        this.f6475f = cVar;
        this.f6473d = i10;
        this.f6474e = z10;
    }

    public final void d(View view, f fVar) {
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        j.c cVar = this.f6475f;
        int i10 = this.f6473d;
        int i11 = i10;
        for (int i12 = 0; i12 < i10; i12++) {
            if (j.this.f6448e.e(i12) == 2 || j.this.f6448e.e(i12) == 3) {
                i11--;
            }
        }
        cVar.getClass();
        fVar.j(f.g.a(i11, 1, 1, 1, this.f6474e, view.isSelected()));
    }
}
