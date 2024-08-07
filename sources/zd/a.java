package zd;

import j$.time.LocalDate;
import java.io.Serializable;
import sk.j;

/* compiled from: CalendarDay.kt */
public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final LocalDate f17978a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17979b;

    public a(LocalDate localDate, c cVar) {
        this.f17978a = localDate;
        this.f17979b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f17978a, aVar.f17978a) && this.f17979b == aVar.f17979b;
    }

    public final int hashCode() {
        return this.f17979b.hashCode() + (this.f17978a.hashCode() * 31);
    }

    public final String toString() {
        LocalDate localDate = this.f17978a;
        c cVar = this.f17979b;
        return "CalendarDay(date=" + localDate + ", position=" + cVar + ")";
    }
}
