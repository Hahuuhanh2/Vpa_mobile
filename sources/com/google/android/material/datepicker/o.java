package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar */
public final class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f6185a;

    public o(j jVar) {
        this.f6185a = jVar;
    }

    public final void onClick(View view) {
        j jVar = this.f6185a;
        int i10 = jVar.f6169k0;
        if (i10 == 2) {
            jVar.k0(1);
        } else if (i10 == 1) {
            jVar.k0(2);
        }
    }
}
