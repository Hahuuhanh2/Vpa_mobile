package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DropdownMenuEndIconDelegate */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f7033a;

    public j(k kVar) {
        this.f7033a = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7033a.q();
        this.f7033a.f7047r.start();
    }
}
