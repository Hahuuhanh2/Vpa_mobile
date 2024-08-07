package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7020a;

    public d(e eVar) {
        this.f7020a = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7020a.f7075b.h(false);
    }
}
