package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import x1.j;

/* compiled from: AppBarLayout */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f5662a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5663b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f5664c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5665d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5666e;

    public d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f5666e = baseBehavior;
        this.f5662a = coordinatorLayout;
        this.f5663b = appBarLayout;
        this.f5664c = view;
        this.f5665d = i10;
    }

    public final boolean a(View view) {
        this.f5666e.H(this.f5662a, this.f5663b, this.f5664c, this.f5665d, new int[]{0, 0});
        return true;
    }
}
