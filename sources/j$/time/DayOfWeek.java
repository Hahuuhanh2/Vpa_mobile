package j$.time;

import j$.time.format.TextStyle;
import j$.time.format.w;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.util.Locale;

public enum DayOfWeek implements j, k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a  reason: collision with root package name */
    private static final DayOfWeek[] f18008a = null;

    static {
        f18008a = values();
    }

    public static DayOfWeek R(int i10) {
        if (i10 >= 1 && i10 <= 7) {
            return f18008a[i10 - 1];
        }
        throw new e("Invalid value for DayOfWeek: " + i10);
    }

    public final Object K(p pVar) {
        return pVar == n.j() ? ChronoUnit.DAYS : n.c(this, pVar);
    }

    public final DayOfWeek U(long j10) {
        return f18008a[((((int) (j10 % 7)) + 7) + ordinal()) % 7];
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.DAY_OF_WEEK : oVar != null && oVar.m(this);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        w wVar = new w();
        wVar.k(a.DAY_OF_WEEK, textStyle);
        return wVar.v(locale).a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public final long h(o oVar) {
        if (oVar == a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    public final int m(o oVar) {
        return oVar == a.DAY_OF_WEEK ? getValue() : n.a(this, oVar);
    }

    public final s o(o oVar) {
        return oVar == a.DAY_OF_WEEK ? oVar.o() : n.d(this, oVar);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c((long) getValue(), a.DAY_OF_WEEK);
    }
}
