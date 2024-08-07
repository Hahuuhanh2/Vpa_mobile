package com.google.android.material.search;

import android.view.View;
import com.google.android.material.search.SearchView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6690a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f6691b;

    public /* synthetic */ e(SearchView searchView, int i10) {
        this.f6690a = i10;
        this.f6691b = searchView;
    }

    public final void onClick(View view) {
        switch (this.f6690a) {
            case 0:
                SearchView searchView = this.f6691b;
                int i10 = SearchView.K;
                if (!searchView.I.equals(SearchView.b.HIDDEN) && !searchView.I.equals(SearchView.b.HIDING)) {
                    searchView.f6675v.j();
                    return;
                }
                return;
            default:
                SearchView searchView2 = this.f6691b;
                int i11 = SearchView.K;
                searchView2.k();
                return;
        }
    }
}
