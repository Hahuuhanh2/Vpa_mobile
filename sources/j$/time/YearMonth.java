package j$.time;

import j$.time.chrono.C0337d;
import j$.time.chrono.C0338e;
import j$.time.chrono.v;
import j$.time.format.w;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

public final class YearMonth implements Temporal, k, Comparable<YearMonth>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f18029c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f18030a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18031b;

    static {
        w wVar = new w();
        wVar.n(a.YEAR, 4, 10, 5);
        wVar.e('-');
        wVar.m(a.MONTH_OF_YEAR, 2);
        wVar.v(Locale.getDefault());
    }

    private YearMonth(int i10, int i11) {
        this.f18030a = i10;
        this.f18031b = i11;
    }

    private long R() {
        return ((((long) this.f18030a) * 12) + ((long) this.f18031b)) - 1;
    }

    public static YearMonth U(int i10, int i11) {
        a.YEAR.V((long) i10);
        a.MONTH_OF_YEAR.V((long) i11);
        return new YearMonth(i10, i11);
    }

    private YearMonth X(int i10, int i11) {
        return (this.f18030a == i10 && this.f18031b == i11) ? this : new YearMonth(i10, i11);
    }

    public static YearMonth now() {
        LocalDate e02 = LocalDate.e0(d.d());
        return of(e02.getYear(), e02.getMonth());
    }

    public static YearMonth of(int i10, Month month) {
        if (month != null) {
            return U(i10, month.getValue());
        }
        throw new NullPointerException("month");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    public final Object K(p pVar) {
        return pVar == n.e() ? v.f18100d : pVar == n.j() ? ChronoUnit.MONTHS : n.c(this, pVar);
    }

    /* renamed from: V */
    public final YearMonth d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (YearMonth) qVar.m(this, j10);
        }
        switch (v.f18291b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return plusMonths(j10);
            case 2:
                return W(j10);
            case 3:
                return W(a.f(j10, (long) 10));
            case 4:
                return W(a.f(j10, (long) 100));
            case 5:
                return W(a.f(j10, (long) 1000));
            case 6:
                a aVar = a.ERA;
                return c(a.d(h(aVar), j10), aVar);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    public final YearMonth W(long j10) {
        return j10 == 0 ? this : X(a.YEAR.U(((long) this.f18030a) + j10), this.f18031b);
    }

    /* renamed from: Y */
    public final YearMonth c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (YearMonth) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        aVar.V(j10);
        int i10 = v.f18290a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            a.MONTH_OF_YEAR.V((long) i11);
            return X(this.f18030a, i11);
        } else if (i10 == 2) {
            return plusMonths(j10 - R());
        } else {
            if (i10 == 3) {
                if (this.f18030a < 1) {
                    j10 = 1 - j10;
                }
                int i12 = (int) j10;
                a.YEAR.V((long) i12);
                return X(i12, this.f18031b);
            } else if (i10 == 4) {
                int i13 = (int) j10;
                a.YEAR.V((long) i13);
                return X(i13, this.f18031b);
            } else if (i10 != 5) {
                throw new r(b.a("Unsupported field: ", oVar));
            } else if (h(a.ERA) == j10) {
                return this;
            } else {
                int i14 = 1 - this.f18030a;
                a.YEAR.V((long) i14);
                return X(i14, this.f18031b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void Z(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18030a);
        dataOutput.writeByte(this.f18031b);
    }

    public LocalDate atDay(int i10) {
        return LocalDate.f0(this.f18030a, this.f18031b, i10);
    }

    public int compareTo(YearMonth yearMonth) {
        int i10 = this.f18030a - yearMonth.f18030a;
        return i10 == 0 ? this.f18031b - yearMonth.f18031b : i10;
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.YEAR || oVar == a.MONTH_OF_YEAR || oVar == a.PROLEPTIC_MONTH || oVar == a.YEAR_OF_ERA || oVar == a.ERA : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.f18030a == yearMonth.f18030a && this.f18031b == yearMonth.f18031b;
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public Month getMonth() {
        return Month.W(this.f18031b);
    }

    public int getYear() {
        return this.f18030a;
    }

    public final long h(o oVar) {
        int i10;
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i11 = v.f18290a[((a) oVar).ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i10 = this.f18031b;
        } else if (i11 == 2) {
            return R();
        } else {
            if (i11 == 3) {
                int i13 = this.f18030a;
                if (i13 < 1) {
                    i13 = 1 - i13;
                }
                return (long) i13;
            } else if (i11 == 4) {
                i10 = this.f18030a;
            } else if (i11 == 5) {
                if (this.f18030a < 1) {
                    i12 = 0;
                }
                return (long) i12;
            } else {
                throw new r(b.a("Unsupported field: ", oVar));
            }
        }
        return (long) i10;
    }

    public int hashCode() {
        return this.f18030a ^ (this.f18031b << 27);
    }

    public final long i(Temporal temporal, q qVar) {
        YearMonth yearMonth;
        if (temporal instanceof YearMonth) {
            yearMonth = (YearMonth) temporal;
        } else if (temporal != null) {
            try {
                if (!v.f18100d.equals(C0338e.s(temporal))) {
                    temporal = LocalDate.V(temporal);
                }
                yearMonth = U(temporal.m(a.YEAR), temporal.m(a.MONTH_OF_YEAR));
            } catch (e e10) {
                throw new e("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        } else {
            throw new NullPointerException("temporal");
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, yearMonth);
        }
        long R = yearMonth.R() - R();
        switch (v.f18291b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return R;
            case 2:
                return R / 12;
            case 3:
                return R / 120;
            case 4:
                return R / 1200;
            case 5:
                return R / 12000;
            case 6:
                a aVar = a.ERA;
                return yearMonth.h(aVar) - h(aVar);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    public int lengthOfMonth() {
        return getMonth().U(v.f18100d.S((long) this.f18030a));
    }

    public final int m(o oVar) {
        return o(oVar).a(h(oVar), oVar);
    }

    public YearMonth minusMonths(long j10) {
        return j10 == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j10);
    }

    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) C0338e.a(localDate, this);
    }

    public final s o(o oVar) {
        if (oVar != a.YEAR_OF_ERA) {
            return n.d(this, oVar);
        }
        return s.j(1, getYear() <= 0 ? 1000000000 : 999999999);
    }

    public YearMonth plusMonths(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f18030a) * 12) + ((long) (this.f18031b - 1)) + j10;
        long j12 = (long) 12;
        return X(a.YEAR.U(a.g(j11, j12)), ((int) a.e(j11, j12)) + 1);
    }

    public final Temporal t(Temporal temporal) {
        if (((C0337d) C0338e.s(temporal)).equals(v.f18100d)) {
            return temporal.c(R(), a.PROLEPTIC_MONTH);
        }
        throw new e("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        int i10;
        int abs = Math.abs(this.f18030a);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            int i11 = this.f18030a;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            sb2.append(this.f18030a);
        }
        sb2.append(this.f18031b < 10 ? "-0" : "-");
        sb2.append(this.f18031b);
        return sb2.toString();
    }
}
