package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.j;
import com.google.android.material.internal.z;

/* compiled from: NavigationView */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f6608a;

    public f(NavigationView navigationView) {
        this.f6608a = navigationView;
    }

    public final void onGlobalLayout() {
        boolean z10;
        boolean z11;
        boolean z12;
        Activity activity;
        boolean z13;
        boolean z14;
        boolean z15;
        NavigationView navigationView = this.f6608a;
        navigationView.getLocationOnScreen(navigationView.f6588r);
        NavigationView navigationView2 = this.f6608a;
        boolean z16 = true;
        if (navigationView2.f6588r[1] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j jVar = navigationView2.f6586p;
        if (jVar.E != z10) {
            jVar.E = z10;
            jVar.a();
        }
        NavigationView navigationView3 = this.f6608a;
        if (!z10 || !navigationView3.f6591u) {
            z11 = false;
        } else {
            z11 = true;
        }
        navigationView3.setDrawTopInsetForeground(z11);
        NavigationView navigationView4 = this.f6608a;
        int i10 = navigationView4.f6588r[0];
        if (i10 == 0 || navigationView4.getWidth() + i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f6608a.setDrawLeftInsetForeground(z12);
        Context context = this.f6608a.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Rect a10 = z.a(activity);
            if (a10.height() - this.f6608a.getHeight() == this.f6608a.f6588r[1]) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            NavigationView navigationView5 = this.f6608a;
            if (!z13 || !z14 || !navigationView5.f6592v) {
                z15 = false;
            } else {
                z15 = true;
            }
            navigationView5.setDrawBottomInsetForeground(z15);
            if (!(a10.width() == this.f6608a.f6588r[0] || a10.width() - this.f6608a.getWidth() == this.f6608a.f6588r[0])) {
                z16 = false;
            }
            this.f6608a.setDrawRightInsetForeground(z16);
        }
    }
}
