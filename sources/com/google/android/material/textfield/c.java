package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7019a;

    public c(e eVar) {
        this.f7019a = eVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f7019a.f7075b.h(true);
    }
}
