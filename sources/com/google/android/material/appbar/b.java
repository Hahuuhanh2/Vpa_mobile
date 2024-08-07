package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import l8.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f5658b;

    public /* synthetic */ b(AppBarLayout appBarLayout, h hVar) {
        this.f5657a = appBarLayout;
        this.f5658b = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout appBarLayout = this.f5657a;
        h hVar = this.f5658b;
        int i10 = AppBarLayout.G;
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.m(floatValue);
        Drawable drawable = appBarLayout.C;
        if (drawable instanceof h) {
            ((h) drawable).m(floatValue);
        }
        Iterator it = appBarLayout.f5586y.iterator();
        while (it.hasNext()) {
            ((AppBarLayout.e) it.next()).a();
        }
    }
}
