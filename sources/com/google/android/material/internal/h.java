package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import v.g0;

/* compiled from: MultiViewUpdateListener */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f6442a;

    /* renamed from: b  reason: collision with root package name */
    public final View[] f6443b;

    /* compiled from: MultiViewUpdateListener */
    public interface a {
        void e(ValueAnimator valueAnimator, View view);
    }

    @SuppressLint({"LambdaLast"})
    public h(a aVar, View... viewArr) {
        this.f6442a = aVar;
        this.f6443b = viewArr;
    }

    public static h a(View... viewArr) {
        return new h(new g0(6), viewArr);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View e10 : this.f6443b) {
            this.f6442a.e(valueAnimator, e10);
        }
    }
}
