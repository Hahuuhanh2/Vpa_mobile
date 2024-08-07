package j$.time;

import j$.time.chrono.C0337d;
import j$.time.chrono.C0338e;
import j$.time.chrono.v;
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

public enum Month implements j, k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a  reason: collision with root package name */
    private static final Month[] f18025a = null;

    static {
        f18025a = values();
    }

    public static Month W(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return f18025a[i10 - 1];
        }
        throw new e("Invalid value for MonthOfYear: " + i10);
    }

    public final Object K(p pVar) {
        return pVar == n.e() ? v.f18100d : pVar == n.j() ? ChronoUnit.MONTHS : n.c(this, pVar);
    }

    public final int R(boolean z10) {
        switch (l.f18227a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + true;
            case 3:
                return z10 + true;
            case 4:
                return z10 + true;
            case 5:
                return z10 + true;
            case 6:
                return 1;
            case 7:
                return z10 + true;
            case 8:
                return z10 + true;
            case 9:
                return z10 + true;
            case 10:
                return z10 + true;
            case 11:
                return z10 + true;
            default:
                return z10 + true;
        }
    }

    public final int U(boolean z10) {
        int i10 = l.f18227a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int V() {
        int i10 = l.f18227a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final Month X() {
        return f18025a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.MONTH_OF_YEAR : oVar != null && oVar.m(this);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        w wVar = new w();
        wVar.k(a.MONTH_OF_YEAR, textStyle);
        return wVar.v(locale).a(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public final long h(o oVar) {
        if (oVar == a.MONTH_OF_YEAR) {
            return (long) getValue();
        }
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    public final int m(o oVar) {
        return oVar == a.MONTH_OF_YEAR ? getValue() : n.a(this, oVar);
    }

    public final s o(o oVar) {
        return oVar == a.MONTH_OF_YEAR ? oVar.o() : n.d(this, oVar);
    }

    public final Temporal t(Temporal temporal) {
        if (((C0337d) C0338e.s(temporal)).equals(v.f18100d)) {
            return temporal.c((long) getValue(), a.MONTH_OF_YEAR);
        }
        throw new e("Adjustment only supported on ISO date-time");
    }
}
