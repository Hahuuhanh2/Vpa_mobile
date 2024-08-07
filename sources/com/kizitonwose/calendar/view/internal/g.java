package com.kizitonwose.calendar.view.internal;

import android.widget.LinearLayout;
import be.b;
import j7.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sk.j;

/* compiled from: WeekHolder.kt */
public final class g<Day> {

    /* renamed from: a  reason: collision with root package name */
    public final b f8069a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c<Day>> f8070b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f8071c;

    public g(b bVar, ArrayList arrayList) {
        j.f(bVar, "daySize");
        this.f8069a = bVar;
        this.f8070b = arrayList;
    }

    public final void a(List<? extends Day> list) {
        int i10;
        j.f(list, "daysOfWeek");
        LinearLayout linearLayout = this.f8071c;
        if (linearLayout != null) {
            int i11 = 0;
            if (list.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            for (T next : list) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    this.f8070b.get(i11).a(next);
                    i11 = i12;
                } else {
                    a.x0();
                    throw null;
                }
            }
            return;
        }
        j.l("weekContainer");
        throw null;
    }

    public final boolean b(Serializable serializable) {
        boolean z10;
        List<c<Day>> list = this.f8070b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (c cVar : list) {
                if (j.a(serializable, cVar.f8060d)) {
                    cVar.a(serializable);
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }
}
