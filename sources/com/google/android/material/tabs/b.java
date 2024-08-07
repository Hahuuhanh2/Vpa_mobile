package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f6938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f6939b;

    public b(TabLayout.TabView tabView, View view) {
        this.f6939b = tabView;
        this.f6938a = view;
    }

    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f6938a.getVisibility() == 0) {
            TabLayout.TabView tabView = this.f6939b;
            View view2 = this.f6938a;
            int i18 = TabLayout.TabView.f6903s;
            tabView.c(view2);
        }
    }
}
