package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar */
public final class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f6187b;

    public p(j jVar, x xVar) {
        this.f6187b = jVar;
        this.f6186a = xVar;
    }

    public final void onClick(View view) {
        int Z0 = ((LinearLayoutManager) this.f6187b.f6172n0.getLayoutManager()).Z0() + 1;
        if (Z0 < this.f6187b.f6172n0.getAdapter().c()) {
            j jVar = this.f6187b;
            Calendar d10 = f0.d(this.f6186a.f6223d.f6075a.f6097a);
            d10.add(2, Z0);
            jVar.j0(new Month(d10));
        }
    }
}
