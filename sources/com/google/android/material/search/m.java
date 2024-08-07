package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: SearchViewAnimationHelper */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f6706a;

    public m(o oVar) {
        this.f6706a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6706a.f6708a.g()) {
            this.f6706a.f6708a.i();
        }
        this.f6706a.f6708a.setTransitionState(SearchView.b.SHOWN);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6706a.f6710c.setVisibility(0);
        this.f6706a.f6708a.setTransitionState(SearchView.b.SHOWING);
    }
}
