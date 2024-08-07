package com.google.android.material.search;

import com.google.android.material.internal.x;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6695a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f6696b;

    public /* synthetic */ g(SearchView searchView, int i10) {
        this.f6695a = i10;
        this.f6696b = searchView;
    }

    public final void run() {
        switch (this.f6695a) {
            case 0:
                this.f6696b.k();
                return;
            case 1:
                SearchView searchView = this.f6696b;
                searchView.f6670q.clearFocus();
                SearchBar searchBar = searchView.A;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                x.f(searchView.f6670q, searchView.G);
                return;
            default:
                this.f6696b.i();
                return;
        }
    }
}
