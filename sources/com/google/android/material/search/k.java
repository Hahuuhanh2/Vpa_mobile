package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchView;
import t7.a;

/* compiled from: SearchViewAnimationHelper */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f6704a;

    public k(o oVar) {
        this.f6704a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6704a.f6708a.g()) {
            this.f6704a.f6708a.i();
        }
        this.f6704a.f6708a.setTransitionState(SearchView.b.SHOWN);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6704a.f6710c.setVisibility(0);
        SearchBar searchBar = this.f6704a.f6722o;
        searchBar.f6647h0.getClass();
        View centerView = searchBar.getCenterView();
        if (centerView instanceof a) {
            ((a) centerView).a();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
