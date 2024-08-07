package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5786a;

    public a(BottomAppBar bottomAppBar) {
        this.f5786a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f5786a;
        int i10 = BottomAppBar.C0;
        bottomAppBar.getClass();
        this.f5786a.f5751g0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f5786a;
        int i10 = BottomAppBar.C0;
        bottomAppBar.getClass();
    }
}
