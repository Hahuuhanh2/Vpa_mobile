package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* compiled from: ReversableAnimatedValueInterpolator */
public final class n implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public final TimeInterpolator f6477a;

    public n(Interpolator interpolator) {
        this.f6477a = interpolator;
    }

    public static TimeInterpolator a(boolean z10, Interpolator interpolator) {
        if (z10) {
            return interpolator;
        }
        return new n(interpolator);
    }

    public final float getInterpolation(float f10) {
        return 1.0f - this.f6477a.getInterpolation(f10);
    }
}
