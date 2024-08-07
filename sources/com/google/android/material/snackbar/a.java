package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* compiled from: BaseTransientBottomBar */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6851a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6851a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6851a.f6818i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
