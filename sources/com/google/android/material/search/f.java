package com.google.android.material.search;

import android.view.View;
import android.view.ViewGroup;
import w1.q;
import w1.w0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f6692a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6693b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6694c;

    public /* synthetic */ f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        this.f6692a = marginLayoutParams;
        this.f6693b = i10;
        this.f6694c = i11;
    }

    public final w0 g(View view, w0 w0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f6692a;
        int i10 = this.f6693b;
        int i11 = this.f6694c;
        int i12 = SearchView.K;
        marginLayoutParams.leftMargin = w0Var.c() + i10;
        marginLayoutParams.rightMargin = w0Var.d() + i11;
        return w0Var;
    }
}
