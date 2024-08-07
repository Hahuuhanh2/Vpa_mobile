package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5795a;

    public d(BottomAppBar bottomAppBar) {
        this.f5795a = bottomAppBar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f5795a.A0.onAnimationStart(animator);
        FloatingActionButton A = this.f5795a.A();
        if (A != null) {
            A.setTranslationX(this.f5795a.getFabTranslationX());
        }
    }
}
