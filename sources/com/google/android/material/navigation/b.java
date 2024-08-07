package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: DrawerLayoutUtils */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f6602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6603b;

    public b(DrawerLayout drawerLayout, View view) {
        this.f6602a = drawerLayout;
        this.f6603b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6602a.b(this.f6603b, false);
        this.f6602a.setScrimColor(-1728053248);
    }
}
