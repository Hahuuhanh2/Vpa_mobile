package ae;

import fk.p;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.l0;
import sk.j;
import v.v;
import vk.h;
import zd.a;
import zd.c;

/* compiled from: MonthData.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final YearMonth f167a;

    /* renamed from: b  reason: collision with root package name */
    public final int f168b;

    /* renamed from: c  reason: collision with root package name */
    public final int f169c;

    /* renamed from: d  reason: collision with root package name */
    public final LocalDate f170d;

    /* renamed from: e  reason: collision with root package name */
    public final YearMonth f171e;

    /* renamed from: f  reason: collision with root package name */
    public final YearMonth f172f;

    /* renamed from: g  reason: collision with root package name */
    public final zd.b f173g;

    public b(YearMonth yearMonth, int i10, int i11) {
        c cVar;
        this.f167a = yearMonth;
        this.f168b = i10;
        this.f169c = i11;
        int lengthOfMonth = yearMonth.lengthOfMonth() + i10 + i11;
        LocalDate atDay = yearMonth.atDay(1);
        j.e(atDay, "atDay(...)");
        this.f170d = atDay.minusDays((long) i10);
        h U0 = l0.U0(0, lengthOfMonth);
        j.f(U0, "<this>");
        ArrayList e12 = p.e1(U0, 7, 7);
        YearMonth minusMonths = yearMonth.minusMonths(1);
        j.e(minusMonths, "minusMonths(...)");
        this.f171e = minusMonths;
        YearMonth plusMonths = yearMonth.plusMonths(1);
        j.e(plusMonths, "plusMonths(...)");
        this.f172f = plusMonths;
        ArrayList arrayList = new ArrayList(fk.j.H0(e12));
        Iterator it = e12.iterator();
        while (it.hasNext()) {
            List<Number> list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(fk.j.H0(list));
            for (Number intValue : list) {
                LocalDate plusDays = this.f170d.plusDays((long) intValue.intValue());
                j.c(plusDays);
                YearMonth of2 = YearMonth.of(plusDays.getYear(), plusDays.getMonth());
                j.e(of2, "of(...)");
                if (j.a(of2, this.f167a)) {
                    cVar = c.MonthDate;
                } else if (j.a(of2, this.f171e)) {
                    cVar = c.InDate;
                } else if (j.a(of2, this.f172f)) {
                    cVar = c.OutDate;
                } else {
                    YearMonth yearMonth2 = this.f167a;
                    throw new IllegalArgumentException("Invalid date: " + plusDays + " in month: " + yearMonth2);
                }
                arrayList2.add(new a(plusDays, cVar));
            }
            arrayList.add(arrayList2);
        }
        this.f173g = new zd.b(yearMonth, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f167a, bVar.f167a) && this.f168b == bVar.f168b && this.f169c == bVar.f169c;
    }

    public final int hashCode() {
        return (((this.f167a.hashCode() * 31) + this.f168b) * 31) + this.f169c;
    }

    public final String toString() {
        YearMonth yearMonth = this.f167a;
        int i10 = this.f168b;
        int i11 = this.f169c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MonthData(month=");
        sb2.append(yearMonth);
        sb2.append(", inDays=");
        sb2.append(i10);
        sb2.append(", outDays=");
        return v.e(sb2, i11, ")");
    }
}
