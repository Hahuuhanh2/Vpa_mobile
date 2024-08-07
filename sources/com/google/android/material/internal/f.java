package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: FadeThroughUpdateListener */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f6439a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6440b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f6441c = new float[2];

    public f(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f6439a = actionMenuView;
        this.f6440b = actionMenuView2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f6441c;
        if (floatValue <= 0.5f) {
            fArr[0] = 1.0f - (floatValue * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (floatValue * 2.0f) - 1.0f;
        }
        View view = this.f6439a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f6440b;
        if (view2 != null) {
            view2.setAlpha(this.f6441c[1]);
        }
    }
}
