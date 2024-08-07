package com.kizitonwose.calendar.view.internal;

import be.a;
import sk.j;

/* compiled from: DayHolder.kt */
public final class b<Day> {

    /* renamed from: a  reason: collision with root package name */
    public final be.b f8054a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8055b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Day, m9.b> f8056c;

    public b(be.b bVar, int i10, a<Day, m9.b> aVar) {
        j.f(bVar, "daySize");
        this.f8054a = bVar;
        this.f8055b = i10;
        this.f8056c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8054a == bVar.f8054a && this.f8055b == bVar.f8055b && j.a(this.f8056c, bVar.f8056c);
    }

    public final int hashCode() {
        return this.f8056c.hashCode() + (((this.f8054a.hashCode() * 31) + this.f8055b) * 31);
    }

    public final String toString() {
        be.b bVar = this.f8054a;
        int i10 = this.f8055b;
        a<Day, m9.b> aVar = this.f8056c;
        return "DayConfig(daySize=" + bVar + ", dayViewRes=" + i10 + ", dayBinder=" + aVar + ")";
    }
}
