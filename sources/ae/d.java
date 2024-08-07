package ae;

import j$.time.LocalDate;
import sk.j;

/* compiled from: WeekData.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final LocalDate f178a;

    /* renamed from: b  reason: collision with root package name */
    public final LocalDate f179b;

    public d(LocalDate localDate, LocalDate localDate2) {
        this.f178a = localDate;
        this.f179b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f178a, dVar.f178a) && j.a(this.f179b, dVar.f179b);
    }

    public final int hashCode() {
        return this.f179b.hashCode() + (this.f178a.hashCode() * 31);
    }

    public final String toString() {
        LocalDate localDate = this.f178a;
        LocalDate localDate2 = this.f179b;
        return "WeekDateRange(startDateAdjusted=" + localDate + ", endDateAdjusted=" + localDate2 + ")";
    }
}
