package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: SearchViewAnimationHelper */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f6707a;

    public n(o oVar) {
        this.f6707a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6707a.f6710c.setVisibility(8);
        if (!this.f6707a.f6708a.g()) {
            this.f6707a.f6708a.f();
        }
        this.f6707a.f6708a.setTransitionState(SearchView.b.HIDDEN);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6707a.f6708a.setTransitionState(SearchView.b.HIDING);
    }
}
