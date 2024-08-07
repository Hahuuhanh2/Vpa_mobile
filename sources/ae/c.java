package ae;

import fk.j;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import p3.l0;
import vk.h;
import zd.e;
import zd.f;
import zd.g;

/* compiled from: WeekData.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final LocalDate f174a;

    /* renamed from: b  reason: collision with root package name */
    public final LocalDate f175b;

    /* renamed from: c  reason: collision with root package name */
    public final LocalDate f176c;

    /* renamed from: d  reason: collision with root package name */
    public final e f177d;

    public c(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        g gVar;
        this.f174a = localDate;
        this.f175b = localDate2;
        this.f176c = localDate3;
        h U0 = l0.U0(0, 7);
        ArrayList arrayList = new ArrayList(j.H0(U0));
        vk.g m10 = U0.iterator();
        while (m10.f23340c) {
            LocalDate plusDays = this.f174a.plusDays((long) m10.nextInt());
            if (plusDays.compareTo((ChronoLocalDate) this.f175b) < 0) {
                gVar = g.InDate;
            } else if (plusDays.compareTo((ChronoLocalDate) this.f176c) > 0) {
                gVar = g.OutDate;
            } else {
                gVar = g.RangeDate;
            }
            arrayList.add(new f(plusDays, gVar));
        }
        this.f177d = new e(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return sk.j.a(this.f174a, cVar.f174a) && sk.j.a(this.f175b, cVar.f175b) && sk.j.a(this.f176c, cVar.f176c);
    }

    public final int hashCode() {
        int hashCode = this.f175b.hashCode();
        return this.f176c.hashCode() + ((hashCode + (this.f174a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        LocalDate localDate = this.f174a;
        LocalDate localDate2 = this.f175b;
        LocalDate localDate3 = this.f176c;
        return "WeekData(firstDayInWeek=" + localDate + ", desiredStartDate=" + localDate2 + ", desiredEndDate=" + localDate3 + ")";
    }
}
