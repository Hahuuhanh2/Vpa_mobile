package com.google.android.material.datepicker;

import android.view.View;
import w1.q;
import w1.w0;

/* compiled from: MaterialDatePicker */
public final class s implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6208c;

    public s(int i10, View view, int i11) {
        this.f6206a = i10;
        this.f6207b = view;
        this.f6208c = i11;
    }

    public final w0 g(View view, w0 w0Var) {
        int i10 = w0Var.a(7).f13428b;
        if (this.f6206a >= 0) {
            this.f6207b.getLayoutParams().height = this.f6206a + i10;
            View view2 = this.f6207b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f6207b;
        view3.setPadding(view3.getPaddingLeft(), this.f6208c + i10, this.f6207b.getPaddingRight(), this.f6207b.getPaddingBottom());
        return w0Var;
    }
}
