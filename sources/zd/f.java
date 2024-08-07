package zd;

import j$.time.LocalDate;
import java.io.Serializable;
import sk.j;

/* compiled from: WeekDay.kt */
public final class f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final LocalDate f17989a;

    /* renamed from: b  reason: collision with root package name */
    public final g f17990b;

    public f(LocalDate localDate, g gVar) {
        this.f17989a = localDate;
        this.f17990b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f17989a, fVar.f17989a) && this.f17990b == fVar.f17990b;
    }

    public final int hashCode() {
        return this.f17990b.hashCode() + (this.f17989a.hashCode() * 31);
    }

    public final String toString() {
        LocalDate localDate = this.f17989a;
        g gVar = this.f17990b;
        return "WeekDay(date=" + localDate + ", position=" + gVar + ")";
    }
}
