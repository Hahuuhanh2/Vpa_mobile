package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar */
public final class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f6158b;

    public h(j jVar, x xVar) {
        this.f6158b = jVar;
        this.f6157a = xVar;
    }

    public final void onClick(View view) {
        int a12 = ((LinearLayoutManager) this.f6158b.f6172n0.getLayoutManager()).a1() - 1;
        if (a12 >= 0) {
            j jVar = this.f6158b;
            Calendar d10 = f0.d(this.f6157a.f6223d.f6075a.f6097a);
            d10.add(2, a12);
            jVar.j0(new Month(d10));
        }
    }
}
