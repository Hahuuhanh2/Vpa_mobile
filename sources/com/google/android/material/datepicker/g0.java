package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: YearGridAdapter */
public final class g0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h0 f6156b;

    public g0(h0 h0Var, int i10) {
        this.f6156b = h0Var;
        this.f6155a = i10;
    }

    public final void onClick(View view) {
        Month j10 = Month.j(this.f6155a, this.f6156b.f6159d.f6168j0.f6098b);
        CalendarConstraints calendarConstraints = this.f6156b.f6159d.f6166h0;
        if (j10.compareTo(calendarConstraints.f6075a) < 0) {
            j10 = calendarConstraints.f6075a;
        } else if (j10.compareTo(calendarConstraints.f6076b) > 0) {
            j10 = calendarConstraints.f6076b;
        }
        this.f6156b.f6159d.j0(j10);
        this.f6156b.f6159d.k0(1);
    }
}
