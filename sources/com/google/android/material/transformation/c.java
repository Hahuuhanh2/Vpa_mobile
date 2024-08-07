package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;

/* compiled from: FabTransformationBehavior */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.c f7181a;

    public c(com.google.android.material.circularreveal.c cVar) {
        this.f7181a = cVar;
    }

    public final void onAnimationEnd(Animator animator) {
        c.d revealInfo = this.f7181a.getRevealInfo();
        revealInfo.f6073c = Float.MAX_VALUE;
        this.f7181a.setRevealInfo(revealInfo);
    }
}
