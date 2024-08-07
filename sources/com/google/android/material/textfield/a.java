package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7016a;

    public /* synthetic */ a(e eVar) {
        this.f7016a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        e eVar = this.f7016a;
        eVar.getClass();
        eVar.f7077d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
