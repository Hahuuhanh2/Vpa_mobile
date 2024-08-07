package j$.time;

import j$.time.chrono.C0338e;
import j$.time.chrono.C0341h;
import j$.time.chrono.o;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class LocalDateTime implements Temporal, k, C0341h, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f18021c = c0(LocalDate.f18016d, k.f18219e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f18022d = c0(LocalDate.f18017e, k.f18220f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDate f18023a;

    /* renamed from: b  reason: collision with root package name */
    private final k f18024b;

    private LocalDateTime(LocalDate localDate, k kVar) {
        this.f18023a = localDate;
        this.f18024b = kVar;
    }

    private int R(LocalDateTime localDateTime) {
        int R = this.f18023a.R(localDateTime.f());
        return R == 0 ? this.f18024b.compareTo(localDateTime.f18024b) : R;
    }

    public static LocalDateTime U(j jVar) {
        if (jVar instanceof LocalDateTime) {
            return (LocalDateTime) jVar;
        }
        if (jVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) jVar).Z();
        }
        if (jVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) jVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.V(jVar), k.V(jVar));
        } catch (e e10) {
            throw new e("Unable to obtain LocalDateTime from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName(), e10);
        }
    }

    public static LocalDateTime a0(int i10) {
        return new LocalDateTime(LocalDate.f0(i10, 12, 31), k.a0(0));
    }

    public static LocalDateTime b0(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new LocalDateTime(LocalDate.f0(i10, i11, i12), k.b0(i13, i14, i15, 0));
    }

    public static LocalDateTime c0(LocalDate localDate, k kVar) {
        if (localDate == null) {
            throw new NullPointerException("date");
        } else if (kVar != null) {
            return new LocalDateTime(localDate, kVar);
        } else {
            throw new NullPointerException("time");
        }
    }

    public static LocalDateTime d0(long j10, int i10, ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            long j11 = (long) i10;
            a.NANO_OF_SECOND.V(j11);
            long b02 = j10 + ((long) zoneOffset.b0());
            long j12 = (long) 86400;
            return new LocalDateTime(LocalDate.h0(a.g(b02, j12)), k.c0((((long) ((int) a.e(b02, j12))) * 1000000000) + j11));
        }
        throw new NullPointerException("offset");
    }

    private LocalDateTime h0(LocalDate localDate, long j10, long j11, long j12, long j13) {
        LocalDate localDate2;
        k kVar;
        if ((j10 | j11 | j12 | j13) == 0) {
            kVar = this.f18024b;
            localDate2 = localDate;
        } else {
            long j14 = j10 / 24;
            long j15 = j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
            long j16 = (long) 1;
            long j17 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
            long k02 = this.f18024b.k0();
            long j18 = (j17 * j16) + k02;
            long g2 = a.g(j18, 86400000000000L) + (j15 * j16);
            long e10 = a.e(j18, 86400000000000L);
            kVar = e10 == k02 ? this.f18024b : k.c0(e10);
            localDate2 = localDate.plusDays(g2);
        }
        return k0(localDate2, kVar);
    }

    private LocalDateTime k0(LocalDate localDate, k kVar) {
        return (this.f18023a == localDate && this.f18024b == kVar) ? this : new LocalDateTime(localDate, kVar);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        if (instant == null) {
            throw new NullPointerException("instant");
        } else if (zoneId != null) {
            return d0(instant.W(), instant.X(), zoneId.U().d(instant));
        } else {
            throw new NullPointerException("zone");
        }
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return (LocalDateTime) dateTimeFormatter.f(charSequence, new h());
        }
        throw new NullPointerException("formatter");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    public final Object K(p pVar) {
        return pVar == n.f() ? this.f18023a : C0338e.m(this, pVar);
    }

    /* renamed from: N */
    public final int compareTo(C0341h hVar) {
        return hVar instanceof LocalDateTime ? R((LocalDateTime) hVar) : C0338e.e(this, hVar);
    }

    public final int V() {
        return this.f18024b.Y();
    }

    public final int W() {
        return this.f18024b.Z();
    }

    public final int X() {
        return this.f18023a.getYear();
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) > 0;
        }
        int i10 = (f().I() > localDateTime.f().I() ? 1 : (f().I() == localDateTime.f().I() ? 0 : -1));
        return i10 > 0 || (i10 == 0 && this.f18024b.k0() > localDateTime.f18024b.k0());
    }

    public final boolean Z(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) < 0;
        }
        int i10 = (f().I() > localDateTime.f().I() ? 1 : (f().I() == localDateTime.f().I() ? 0 : -1));
        return i10 < 0 || (i10 == 0 && this.f18024b.k0() < localDateTime.f18024b.k0());
    }

    public final o a() {
        return ((LocalDate) f()).a();
    }

    /* renamed from: atZone */
    public ZonedDateTime F(ZoneId zoneId) {
        return ZonedDateTime.V(this, zoneId, (ZoneOffset) null);
    }

    public final k b() {
        return this.f18024b;
    }

    public final boolean e(j$.time.temporal.o oVar) {
        if (!(oVar instanceof a)) {
            return oVar != null && oVar.m(this);
        }
        a aVar = (a) oVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    /* renamed from: e0 */
    public final LocalDateTime d(long j10, q qVar) {
        long j11 = j10;
        q qVar2 = qVar;
        if (!(qVar2 instanceof ChronoUnit)) {
            return (LocalDateTime) qVar2.m(this, j11);
        }
        switch (i.f18216a[((ChronoUnit) qVar2).ordinal()]) {
            case 1:
                return h0(this.f18023a, 0, 0, 0, j10);
            case 2:
                LocalDateTime f02 = f0(j11 / 86400000000L);
                return f02.h0(f02.f18023a, 0, 0, 0, (j11 % 86400000000L) * 1000);
            case 3:
                LocalDateTime f03 = f0(j11 / 86400000);
                return f03.h0(f03.f18023a, 0, 0, 0, (j11 % 86400000) * 1000000);
            case 4:
                return g0(j10);
            case 5:
                return h0(this.f18023a, 0, j10, 0, 0);
            case 6:
                return h0(this.f18023a, j10, 0, 0, 0);
            case 7:
                LocalDateTime f04 = f0(j11 / 256);
                return f04.h0(f04.f18023a, (j11 % 256) * 12, 0, 0, 0);
            default:
                return k0(this.f18023a.d(j11, qVar2), this.f18024b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f18023a.equals(localDateTime.f18023a) && this.f18024b.equals(localDateTime.f18024b);
    }

    public final LocalDateTime f0(long j10) {
        return k0(this.f18023a.plusDays(j10), this.f18024b);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final LocalDateTime g0(long j10) {
        return h0(this.f18023a, 0, 0, j10, 0);
    }

    public final long h(j$.time.temporal.o oVar) {
        return oVar instanceof a ? ((a) oVar).isTimeBased() ? this.f18024b.h(oVar) : this.f18023a.h(oVar) : oVar.K(this);
    }

    public final int hashCode() {
        return this.f18023a.hashCode() ^ this.f18024b.hashCode();
    }

    public final long i(Temporal temporal, q qVar) {
        long j10;
        long j11;
        long j12;
        long j13;
        LocalDateTime U = U(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, U);
        }
        if (qVar.isTimeBased()) {
            LocalDate localDate = this.f18023a;
            LocalDate localDate2 = U.f18023a;
            localDate.getClass();
            long I = localDate2.I() - localDate.I();
            int i10 = (I > 0 ? 1 : (I == 0 ? 0 : -1));
            if (i10 == 0) {
                return this.f18024b.i(U.f18024b, qVar);
            }
            long k02 = U.f18024b.k0() - this.f18024b.k0();
            if (i10 > 0) {
                j11 = I - 1;
                j10 = k02 + 86400000000000L;
            } else {
                j11 = I + 1;
                j10 = k02 - 86400000000000L;
            }
            switch (i.f18216a[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    j11 = a.f(j11, 86400000000000L);
                    break;
                case 2:
                    j12 = a.f(j11, 86400000000L);
                    j13 = 1000;
                    break;
                case 3:
                    j12 = a.f(j11, 86400000);
                    j13 = 1000000;
                    break;
                case 4:
                    j12 = a.f(j11, (long) 86400);
                    j13 = 1000000000;
                    break;
                case 5:
                    j12 = a.f(j11, (long) 1440);
                    j13 = 60000000000L;
                    break;
                case 6:
                    j12 = a.f(j11, (long) 24);
                    j13 = 3600000000000L;
                    break;
                case 7:
                    j12 = a.f(j11, (long) 2);
                    j13 = 43200000000000L;
                    break;
            }
            j11 = j12;
            j10 /= j13;
            return a.d(j11, j10);
        }
        LocalDate localDate3 = U.f18023a;
        LocalDate localDate4 = this.f18023a;
        localDate3.getClass();
        boolean z10 = true;
        if (!(localDate4 instanceof LocalDate) ? localDate3.I() > localDate4.I() : localDate3.R(localDate4) > 0) {
            if (U.f18024b.compareTo(this.f18024b) < 0) {
                localDate3 = localDate3.minusDays(1);
                return this.f18023a.i(localDate3, qVar);
            }
        }
        if (localDate3.a0(this.f18023a)) {
            if (U.f18024b.compareTo(this.f18024b) <= 0) {
                z10 = false;
            }
            if (z10) {
                localDate3 = localDate3.plusDays(1);
            }
        }
        return this.f18023a.i(localDate3, qVar);
    }

    /* renamed from: i0 */
    public final LocalDateTime c(long j10, j$.time.temporal.o oVar) {
        return oVar instanceof a ? ((a) oVar).isTimeBased() ? k0(this.f18023a, this.f18024b.c(j10, oVar)) : k0(this.f18023a.c(j10, oVar), this.f18024b) : (LocalDateTime) oVar.R(this, j10);
    }

    /* renamed from: j0 */
    public final LocalDateTime n(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return k0(localDate, this.f18024b);
        }
        if (localDate instanceof k) {
            return k0(this.f18023a, (k) localDate);
        }
        if (localDate instanceof LocalDateTime) {
            return (LocalDateTime) localDate;
        }
        localDate.getClass();
        return (LocalDateTime) C0338e.a(localDate, this);
    }

    /* access modifiers changed from: package-private */
    public final void l0(DataOutput dataOutput) {
        this.f18023a.r0(dataOutput);
        this.f18024b.o0(dataOutput);
    }

    public final int m(j$.time.temporal.o oVar) {
        return oVar instanceof a ? ((a) oVar).isTimeBased() ? this.f18024b.m(oVar) : this.f18023a.m(oVar) : n.a(this, oVar);
    }

    public final s o(j$.time.temporal.o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.n(this);
        }
        if (!((a) oVar).isTimeBased()) {
            return this.f18023a.o(oVar);
        }
        k kVar = this.f18024b;
        kVar.getClass();
        return n.d(kVar, oVar);
    }

    public final /* synthetic */ long s(ZoneOffset zoneOffset) {
        return C0338e.p(this, zoneOffset);
    }

    public final Temporal t(Temporal temporal) {
        return C0338e.b(this, temporal);
    }

    /* renamed from: toLocalDate */
    public LocalDate f() {
        return this.f18023a;
    }

    public final String toString() {
        return this.f18023a.toString() + 'T' + this.f18024b.toString();
    }
}
