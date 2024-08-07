package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f6221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f6222b;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6222b = xVar;
        this.f6221a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean z10;
        v a10 = this.f6221a.getAdapter();
        if (i10 < a10.b() || i10 > (a10.b() + a10.f6215a.f6101e) - 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            j.d dVar = this.f6222b.f6226n;
            long longValue = this.f6221a.getAdapter().getItem(i10).longValue();
            j.c cVar = (j.c) dVar;
            if (j.this.f6166h0.f6077c.j0(longValue)) {
                j.this.f6165g0.F0(longValue);
                Iterator<y<S>> it = j.this.f6230e0.iterator();
                while (it.hasNext()) {
                    it.next().b(j.this.f6165g0.v0());
                }
                j.this.f6172n0.getAdapter().f();
                RecyclerView recyclerView = j.this.f6171m0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f();
                }
            }
        }
    }
}
