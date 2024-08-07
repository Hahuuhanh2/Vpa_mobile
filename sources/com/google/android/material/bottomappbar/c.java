package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: BottomAppBar */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f5791b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5792c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f5793d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5794e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f5794e = bottomAppBar;
        this.f5791b = actionMenuView;
        this.f5792c = i10;
        this.f5793d = z10;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f5790a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f5790a) {
            BottomAppBar bottomAppBar = this.f5794e;
            int i10 = bottomAppBar.f5764t0;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0) {
                bottomAppBar.f5764t0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            this.f5794e.J(this.f5791b, this.f5792c, this.f5793d, z10);
        }
    }
}
