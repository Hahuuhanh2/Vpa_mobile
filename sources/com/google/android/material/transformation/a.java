package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FabTransformationBehavior */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f7178a;

    public a(View view) {
        this.f7178a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7178a.invalidate();
    }
}
