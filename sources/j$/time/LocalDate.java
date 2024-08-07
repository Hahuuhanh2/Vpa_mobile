package j$.time;

import j$.time.chrono.C0338e;
import j$.time.chrono.C0341h;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.v;
import j$.time.chrono.w;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
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

public final class LocalDate implements Temporal, k, ChronoLocalDate, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDate f18016d = f0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final LocalDate f18017e = f0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f18018a;

    /* renamed from: b  reason: collision with root package name */
    private final short f18019b;

    /* renamed from: c  reason: collision with root package name */
    private final short f18020c;

    private LocalDate(int i10, int i11, int i12) {
        this.f18018a = i10;
        this.f18019b = (short) i11;
        this.f18020c = (short) i12;
    }

    private static LocalDate U(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            int i14 = 31;
            if (i11 == 2) {
                if (v.f18100d.S((long) i10)) {
                    i13 = 29;
                }
                i14 = i13;
            } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i14 = 30;
            }
            if (i12 > i14) {
                if (i12 == 29) {
                    throw new e("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                StringBuilder b10 = b.b("Invalid date '");
                b10.append(Month.W(i11).name());
                b10.append(" ");
                b10.append(i12);
                b10.append("'");
                throw new e(b10.toString());
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate V(j jVar) {
        if (jVar != null) {
            LocalDate localDate = (LocalDate) jVar.K(n.f());
            if (localDate != null) {
                return localDate;
            }
            throw new e("Unable to obtain LocalDate from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    private int W(o oVar) {
        switch (g.f18214a[((a) oVar).ordinal()]) {
            case 1:
                return this.f18020c;
            case 2:
                return X();
            case 3:
                return ((this.f18020c - 1) / 7) + 1;
            case 4:
                int i10 = this.f18018a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f18020c - 1) % 7) + 1;
            case 7:
                return ((X() - 1) % 7) + 1;
            case 8:
                throw new r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((X() - 1) / 7) + 1;
            case 10:
                return this.f18019b;
            case 11:
                throw new r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f18018a;
            case 13:
                return this.f18018a >= 1 ? 1 : 0;
            default:
                throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    private long Z() {
        return ((((long) this.f18018a) * 12) + ((long) this.f18019b)) - 1;
    }

    private long d0(LocalDate localDate) {
        return (((localDate.Z() * 32) + ((long) localDate.getDayOfMonth())) - ((Z() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    public static LocalDate e0(d dVar) {
        Instant b10 = dVar.b();
        return h0(a.g(b10.W() + ((long) dVar.a().U().d(b10).b0()), (long) 86400));
    }

    public static LocalDate f0(int i10, int i11, int i12) {
        a.YEAR.V((long) i10);
        a.MONTH_OF_YEAR.V((long) i11);
        a.DAY_OF_MONTH.V((long) i12);
        return U(i10, i11, i12);
    }

    public static LocalDate g0(int i10, Month month, int i11) {
        a.YEAR.V((long) i10);
        if (month != null) {
            a.DAY_OF_MONTH.V((long) i11);
            return U(i10, month.getValue(), i11);
        }
        throw new NullPointerException("month");
    }

    public static LocalDate h0(long j10) {
        long j11;
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(a.YEAR.U(j14 + j11 + ((long) (i11 / 10))), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate i0(int i10, int i11) {
        long j10 = (long) i10;
        a.YEAR.V(j10);
        a.DAY_OF_YEAR.V((long) i11);
        boolean S = v.f18100d.S(j10);
        if (i11 != 366 || S) {
            Month W = Month.W(((i11 - 1) / 31) + 1);
            if (i11 > (W.U(S) + W.R(S)) - 1) {
                W = W.X();
            }
            return new LocalDate(i10, W.getValue(), (i11 - W.R(S)) + 1);
        }
        throw new e("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
    }

    private static LocalDate m0(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return new LocalDate(i10, i11, i12);
        }
        i13 = v.f18100d.S((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate now() {
        return e0(d.d());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    public final ChronoLocalDate C(r rVar) {
        if (rVar instanceof r) {
            return k0(rVar.e()).plusDays((long) rVar.b());
        }
        if (rVar != null) {
            return (LocalDate) rVar.a(this);
        }
        throw new NullPointerException("amountToAdd");
    }

    public final long I() {
        long j10;
        long j11 = (long) this.f18018a;
        long j12 = (long) this.f18019b;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / -400) + ((j11 / -4) - (j11 / -100)));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + ((long) (this.f18020c - 1));
        if (j12 > 2) {
            j14--;
            if (!v()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    public final C0341h J(k kVar) {
        return LocalDateTime.c0(this, kVar);
    }

    public final Object K(p pVar) {
        return pVar == n.f() ? this : C0338e.l(this, pVar);
    }

    public final j$.time.chrono.p M() {
        return getYear() >= 1 ? w.CE : w.BCE;
    }

    public final int Q() {
        return v() ? 366 : 365;
    }

    /* access modifiers changed from: package-private */
    public final int R(LocalDate localDate) {
        int i10 = this.f18018a - localDate.f18018a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f18019b - localDate.f18019b;
        return i11 == 0 ? this.f18020c - localDate.f18020c : i11;
    }

    public final int X() {
        return (getMonth().R(v()) + this.f18020c) - 1;
    }

    public final int Y() {
        return this.f18019b;
    }

    public final j$.time.chrono.o a() {
        return v.f18100d;
    }

    public final boolean a0(LocalDate localDate) {
        return localDate instanceof LocalDate ? R(localDate) < 0 : I() < localDate.I();
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.c0(this, k.f18221g);
    }

    public final int b0() {
        short s10 = this.f18019b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : v() ? 29 : 28;
    }

    /* renamed from: c0 */
    public final LocalDate g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? R((LocalDate) chronoLocalDate) : C0338e.d(this, chronoLocalDate);
    }

    public final boolean e(o oVar) {
        return C0338e.j(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            return R((LocalDate) obj) == 0;
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    public int getDayOfMonth() {
        return this.f18020c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.R(((int) a.e(I() + 3, (long) 7)) + 1);
    }

    public Month getMonth() {
        return Month.W(this.f18019b);
    }

    public int getYear() {
        return this.f18018a;
    }

    public final long h(o oVar) {
        return oVar instanceof a ? oVar == a.EPOCH_DAY ? I() : oVar == a.PROLEPTIC_MONTH ? Z() : (long) W(oVar) : oVar.K(this);
    }

    public int hashCode() {
        int i10 = this.f18018a;
        return (((i10 << 11) + (this.f18019b << 6)) + this.f18020c) ^ (i10 & -2048);
    }

    public final long i(Temporal temporal, q qVar) {
        long I;
        long j10;
        LocalDate V = V(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, V);
        }
        switch (g.f18215b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return V.I() - I();
            case 2:
                I = V.I() - I();
                j10 = 7;
                break;
            case 3:
                return d0(V);
            case 4:
                I = d0(V);
                j10 = 12;
                break;
            case 5:
                I = d0(V);
                j10 = 120;
                break;
            case 6:
                I = d0(V);
                j10 = 1200;
                break;
            case 7:
                I = d0(V);
                j10 = 12000;
                break;
            case 8:
                a aVar = a.ERA;
                return V.h(aVar) - h(aVar);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
        return I / j10;
    }

    /* renamed from: j0 */
    public final LocalDate d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDate) qVar.m(this, j10);
        }
        switch (g.f18215b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return plusDays(j10);
            case 2:
                return plusWeeks(j10);
            case 3:
                return k0(j10);
            case 4:
                return l0(j10);
            case 5:
                return l0(a.f(j10, (long) 10));
            case 6:
                return l0(a.f(j10, (long) 100));
            case 7:
                return l0(a.f(j10, (long) 1000));
            case 8:
                a aVar = a.ERA;
                return c(a.d(h(aVar), j10), aVar);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    public final LocalDate k0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f18018a) * 12) + ((long) (this.f18019b - 1)) + j10;
        long j12 = (long) 12;
        return m0(a.YEAR.U(a.g(j11, j12)), ((int) a.e(j11, j12)) + 1, this.f18020c);
    }

    public final LocalDate l0(long j10) {
        return j10 == 0 ? this : m0(a.YEAR.U(((long) this.f18018a) + j10), this.f18019b, this.f18020c);
    }

    public final int m(o oVar) {
        return oVar instanceof a ? W(oVar) : n.a(this, oVar);
    }

    public LocalDate minusDays(long j10) {
        return j10 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j10);
    }

    /* renamed from: n0 */
    public final LocalDate c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (LocalDate) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        aVar.V(j10);
        switch (g.f18214a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                return this.f18020c == i10 ? this : f0(this.f18018a, this.f18019b, i10);
            case 2:
                return p0((int) j10);
            case 3:
                return plusWeeks(j10 - h(a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f18018a < 1) {
                    j10 = 1 - j10;
                }
                return q0((int) j10);
            case 5:
                return plusDays(j10 - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j10 - h(a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j10 - h(a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return h0(j10);
            case 9:
                return plusWeeks(j10 - h(a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i11 = (int) j10;
                if (this.f18019b == i11) {
                    return this;
                }
                a.MONTH_OF_YEAR.V((long) i11);
                return m0(this.f18018a, i11, this.f18020c);
            case 11:
                return k0(j10 - Z());
            case 12:
                return q0((int) j10);
            case 13:
                return h(a.ERA) == j10 ? this : q0(1 - this.f18018a);
            default:
                throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    public final s o(o oVar) {
        int i10;
        if (!(oVar instanceof a)) {
            return oVar.n(this);
        }
        a aVar = (a) oVar;
        if (aVar.isDateBased()) {
            int i11 = g.f18214a[aVar.ordinal()];
            if (i11 == 1) {
                i10 = b0();
            } else if (i11 == 2) {
                i10 = Q();
            } else if (i11 == 3) {
                return s.j(1, (getMonth() != Month.FEBRUARY || v()) ? 5 : 4);
            } else if (i11 != 4) {
                return oVar.o();
            } else {
                return s.j(1, getYear() <= 0 ? 1000000000 : 999999999);
            }
            return s.j(1, (long) i10);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    /* renamed from: o0 */
    public final LocalDate n(k kVar) {
        return kVar instanceof LocalDate ? (LocalDate) kVar : (LocalDate) kVar.t(this);
    }

    public final LocalDate p0(int i10) {
        return X() == i10 ? this : i0(this.f18018a, i10);
    }

    public LocalDate plusDays(long j10) {
        return j10 == 0 ? this : h0(a.d(I(), j10));
    }

    public LocalDate plusWeeks(long j10) {
        return plusDays(a.f(j10, (long) 7));
    }

    public final LocalDate q0(int i10) {
        if (this.f18018a == i10) {
            return this;
        }
        a.YEAR.V((long) i10);
        return m0(i10, this.f18019b, this.f18020c);
    }

    /* access modifiers changed from: package-private */
    public final void r0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18018a);
        dataOutput.writeByte(this.f18019b);
        dataOutput.writeByte(this.f18020c);
    }

    public final Temporal t(Temporal temporal) {
        return C0338e.a(this, temporal);
    }

    public final String toString() {
        int i10;
        int i11 = this.f18018a;
        short s10 = this.f18019b;
        short s11 = this.f18020c;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + 10000);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        }
        String str = "-0";
        sb2.append(s10 < 10 ? str : "-");
        sb2.append(s10);
        if (s11 >= 10) {
            str = "-";
        }
        sb2.append(str);
        sb2.append(s11);
        return sb2.toString();
    }

    public final boolean v() {
        return v.f18100d.S((long) this.f18018a);
    }
}
