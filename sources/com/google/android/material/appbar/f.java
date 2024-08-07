package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* compiled from: CollapsingToolbarLayout */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f5669a;

    public f(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f5669a = collapsingToolbarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5669a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
