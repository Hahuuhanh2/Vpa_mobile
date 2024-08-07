package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v4.media.a;
import android.view.animation.LinearInterpolator;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import t7.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f6700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f6701b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f6702c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Rect f6703d;

    public /* synthetic */ j(o oVar, float f10, float f11, Rect rect) {
        this.f6700a = oVar;
        this.f6701b = f10;
        this.f6702c = f11;
        this.f6703d = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o oVar = this.f6700a;
        float f10 = this.f6701b;
        float f11 = this.f6702c;
        Rect rect = this.f6703d;
        oVar.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        LinearInterpolator linearInterpolator = b.f14885a;
        float e10 = a.e(f11, f10, animatedFraction, f10);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = oVar.f6710c;
        clippableRoundedCornerLayout.getClass();
        clippableRoundedCornerLayout.a((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom, e10);
    }
}
