package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* compiled from: NavigationBarItemView */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f6605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f6606b;

    public d(NavigationBarItemView navigationBarItemView, float f10) {
        this.f6606b = navigationBarItemView;
        this.f6605a = f10;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        NavigationBarItemView navigationBarItemView = this.f6606b;
        float f10 = this.f6605a;
        int[] iArr = NavigationBarItemView.N;
        navigationBarItemView.d(floatValue, f10);
    }
}
