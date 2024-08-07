package com.kizitonwose.calendar.view.internal;

import android.view.View;
import be.a;
import f0.b0;
import j$.time.LocalDate;
import m9.b;
import sk.j;
import zd.f;

/* compiled from: DayHolder.kt */
public final class c<Day> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Day> f8057a;

    /* renamed from: b  reason: collision with root package name */
    public View f8058b;

    /* renamed from: c  reason: collision with root package name */
    public b f8059c;

    /* renamed from: d  reason: collision with root package name */
    public Day f8060d;

    public c(b<Day> bVar) {
        this.f8057a = bVar;
    }

    public final void a(Day day) {
        LocalDate localDate;
        this.f8060d = day;
        if (this.f8059c == null) {
            a<Day, b> aVar = this.f8057a.f8056c;
            View view = this.f8058b;
            if (view != null) {
                this.f8059c = aVar.b(view);
            } else {
                j.l("dayView");
                throw null;
            }
        }
        if (day instanceof zd.a) {
            localDate = ((zd.a) day).f17978a;
        } else if (day instanceof f) {
            localDate = ((f) day).f17989a;
        } else {
            throw new IllegalArgumentException(b0.q("Invalid day type: ", day));
        }
        j.f(localDate, "date");
        int hashCode = localDate.hashCode();
        View view2 = this.f8058b;
        if (view2 != null) {
            if (!j.a(view2.getTag(), Integer.valueOf(hashCode))) {
                View view3 = this.f8058b;
                if (view3 != null) {
                    view3.setTag(Integer.valueOf(hashCode));
                } else {
                    j.l("dayView");
                    throw null;
                }
            }
            a<Day, b> aVar2 = this.f8057a.f8056c;
            b bVar = this.f8059c;
            if (bVar != null) {
                aVar2.a(bVar, day);
            } else {
                j.l("viewContainer");
                throw null;
            }
        } else {
            j.l("dayView");
            throw null;
        }
    }
}
