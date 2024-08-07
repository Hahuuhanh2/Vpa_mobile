package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* compiled from: MaterialCalendar */
public final class n extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6182a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f6183b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f6184c;

    public n(j jVar, x xVar, MaterialButton materialButton) {
        this.f6184c = jVar;
        this.f6182a = xVar;
        this.f6183b = materialButton;
    }

    public final void a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f6183b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        if (i10 < 0) {
            i12 = ((LinearLayoutManager) this.f6184c.f6172n0.getLayoutManager()).Z0();
        } else {
            i12 = ((LinearLayoutManager) this.f6184c.f6172n0.getLayoutManager()).a1();
        }
        j jVar = this.f6184c;
        Calendar d10 = f0.d(this.f6182a.f6223d.f6075a.f6097a);
        d10.add(2, i12);
        jVar.f6168j0 = new Month(d10);
        MaterialButton materialButton = this.f6183b;
        Calendar d11 = f0.d(this.f6182a.f6223d.f6075a.f6097a);
        d11.add(2, i12);
        materialButton.setText(new Month(d11).m());
    }
}
