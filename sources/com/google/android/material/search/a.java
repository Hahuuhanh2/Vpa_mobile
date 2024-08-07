package com.google.android.material.search;

import android.view.View;
import x1.c;

/* compiled from: SearchBar */
public final class a implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchBar f6687a;

    public a(SearchBar searchBar) {
        this.f6687a = searchBar;
    }

    public final void onViewAttachedToWindow(View view) {
        SearchBar searchBar = this.f6687a;
        c.a(searchBar.f6657r0, searchBar.f6658s0);
    }

    public final void onViewDetachedFromWindow(View view) {
        SearchBar searchBar = this.f6687a;
        c.b(searchBar.f6657r0, searchBar.f6658s0);
    }
}
