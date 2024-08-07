package com.google.android.material.appbar;

import android.view.View;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ViewOffsetHelper */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final View f5670a;

    /* renamed from: b  reason: collision with root package name */
    public int f5671b;

    /* renamed from: c  reason: collision with root package name */
    public int f5672c;

    /* renamed from: d  reason: collision with root package name */
    public int f5673d;

    public g(View view) {
        this.f5670a = view;
    }

    public final void a() {
        View view = this.f5670a;
        int top = this.f5673d - (view.getTop() - this.f5671b);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        view.offsetTopAndBottom(top);
        View view2 = this.f5670a;
        view2.offsetLeftAndRight(0 - (view2.getLeft() - this.f5672c));
    }

    public final boolean b(int i10) {
        if (this.f5673d == i10) {
            return false;
        }
        this.f5673d = i10;
        a();
        return true;
    }
}
