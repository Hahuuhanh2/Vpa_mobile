package zd;

import fk.p;
import j$.time.YearMonth;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: CalendarMonth.kt */
public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final YearMonth f17980a;

    /* renamed from: b  reason: collision with root package name */
    public final List<List<a>> f17981b;

    public b(YearMonth yearMonth, ArrayList arrayList) {
        this.f17980a = yearMonth;
        this.f17981b = arrayList;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<b> cls2 = b.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(cls2, cls)) {
            return false;
        }
        j.d(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.CalendarMonth");
        b bVar = (b) obj;
        if (j.a(this.f17980a, bVar.f17980a) && j.a(p.M0((List) p.M0(this.f17981b)), p.M0((List) p.M0(bVar.f17981b))) && j.a(p.R0((List) p.R0(this.f17981b)), p.R0((List) p.R0(bVar.f17981b)))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((a) p.M0((List) p.M0(this.f17981b))).hashCode();
        return ((a) p.R0((List) p.R0(this.f17981b))).hashCode() + ((hashCode + (this.f17980a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Object M0 = p.M0((List) p.M0(this.f17981b));
        Object R0 = p.R0((List) p.R0(this.f17981b));
        return "CalendarMonth { first = " + M0 + ", last = " + R0 + " } ";
    }
}
