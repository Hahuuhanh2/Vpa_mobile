package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.c;

/* compiled from: FabTransformationBehavior */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f7179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f7180b;

    public b(c cVar, Drawable drawable) {
        this.f7179a = cVar;
        this.f7180b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7179a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f7179a.setCircularRevealOverlayDrawable(this.f7180b);
    }
}
