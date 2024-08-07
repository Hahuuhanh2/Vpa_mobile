package j$.time;

import j$.time.chrono.C0338e;
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

public final class Instant implements Temporal, k, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f18013c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f18014a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18015b;

    static {
        Z(-31557014167219200L, 0);
        Z(31556889864403199L, 999999999);
    }

    private Instant(long j10, int i10) {
        this.f18014a = j10;
        this.f18015b = i10;
    }

    private static Instant U(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f18013c;
        }
        if (j10 >= -31557014167219200L && j10 <= 31556889864403199L) {
            return new Instant(j10, i10);
        }
        throw new e("Instant exceeds minimum or maximum instant");
    }

    public static Instant V(j jVar) {
        if (jVar instanceof Instant) {
            return (Instant) jVar;
        }
        if (jVar != null) {
            try {
                return Z(jVar.h(a.INSTANT_SECONDS), (long) jVar.m(a.NANO_OF_SECOND));
            } catch (e e10) {
                throw new e("Unable to obtain Instant from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName(), e10);
            }
        } else {
            throw new NullPointerException("temporal");
        }
    }

    public static Instant Y(long j10) {
        return U(j10, 0);
    }

    public static Instant Z(long j10, long j11) {
        return U(a.d(j10, a.g(j11, 1000000000)), (int) a.e(j11, 1000000000));
    }

    private Instant a0(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return Z(a.d(a.d(this.f18014a, j10), j11 / 1000000000), ((long) this.f18015b) + (j11 % 1000000000));
    }

    private long c0(Instant instant) {
        long h10 = a.h(instant.f18014a, this.f18014a);
        long j10 = (long) (instant.f18015b - this.f18015b);
        int i10 = (h10 > 0 ? 1 : (h10 == 0 ? 0 : -1));
        return (i10 <= 0 || j10 >= 0) ? (i10 >= 0 || j10 <= 0) ? h10 : h10 + 1 : h10 - 1;
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = (long) 1000;
        return U(a.g(j10, j11), ((int) a.e(j10, j11)) * 1000000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    public final Object K(p pVar) {
        if (pVar == n.j()) {
            return ChronoUnit.NANOS;
        }
        if (pVar == n.e() || pVar == n.l() || pVar == n.k() || pVar == n.i() || pVar == n.f() || pVar == n.g()) {
            return null;
        }
        return pVar.h(this);
    }

    /* renamed from: R */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f18014a, instant.f18014a);
        return compare != 0 ? compare : this.f18015b - instant.f18015b;
    }

    public final long W() {
        return this.f18014a;
    }

    public final int X() {
        return this.f18015b;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.U(this, zoneOffset);
    }

    /* renamed from: b0 */
    public final Instant d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (Instant) qVar.m(this, j10);
        }
        switch (f.f18106b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return a0(0, j10);
            case 2:
                return a0(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return a0(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return a0(j10, 0);
            case 5:
                return a0(a.f(j10, (long) 60), 0);
            case 6:
                return a0(a.f(j10, (long) 3600), 0);
            case 7:
                return a0(a.f(j10, (long) 43200), 0);
            case 8:
                return a0(a.f(j10, (long) 86400), 0);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r3 != r2.f18015b) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r3 != r2.f18015b) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.temporal.Temporal c(long r3, j$.time.temporal.o r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof j$.time.temporal.a
            if (r0 == 0) goto L_0x0060
            r0 = r5
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.V(r3)
            int[] r1 = j$.time.f.f18105a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x004f
            r1 = 2
            if (r0 == r1) goto L_0x0041
            r1 = 3
            if (r0 == r1) goto L_0x0037
            r1 = 4
            if (r0 != r1) goto L_0x002b
            long r0 = r2.f18014a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x005e
            int r5 = r2.f18015b
            j$.time.Instant r3 = U(r3, r5)
            goto L_0x0066
        L_0x002b:
            j$.time.temporal.r r3 = new j$.time.temporal.r
            java.lang.String r4 = "Unsupported field: "
            java.lang.String r4 = j$.time.b.a(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x0037:
            int r3 = (int) r3
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f18015b
            if (r3 == r4) goto L_0x005e
            goto L_0x0048
        L_0x0041:
            int r3 = (int) r3
            int r3 = r3 * 1000
            int r4 = r2.f18015b
            if (r3 == r4) goto L_0x005e
        L_0x0048:
            long r4 = r2.f18014a
            j$.time.Instant r3 = U(r4, r3)
            goto L_0x0066
        L_0x004f:
            int r5 = r2.f18015b
            long r0 = (long) r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x005e
            long r0 = r2.f18014a
            int r3 = (int) r3
            j$.time.Instant r3 = U(r0, r3)
            goto L_0x0066
        L_0x005e:
            r3 = r2
            goto L_0x0066
        L_0x0060:
            j$.time.temporal.Temporal r3 = r5.R(r2, r3)
            j$.time.Instant r3 = (j$.time.Instant) r3
        L_0x0066:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.c(long, j$.time.temporal.o):j$.time.temporal.Temporal");
    }

    /* access modifiers changed from: package-private */
    public final void d0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f18014a);
        dataOutput.writeInt(this.f18015b);
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.INSTANT_SECONDS || oVar == a.NANO_OF_SECOND || oVar == a.MICRO_OF_SECOND || oVar == a.MILLI_OF_SECOND : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f18014a == instant.f18014a && this.f18015b == instant.f18015b;
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final long h(o oVar) {
        int i10;
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i11 = f.f18105a[((a) oVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f18015b;
        } else if (i11 == 2) {
            i10 = this.f18015b / 1000;
        } else if (i11 == 3) {
            i10 = this.f18015b / 1000000;
        } else if (i11 == 4) {
            return this.f18014a;
        } else {
            throw new r(b.a("Unsupported field: ", oVar));
        }
        return (long) i10;
    }

    public final int hashCode() {
        long j10 = this.f18014a;
        return (this.f18015b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final long i(Temporal temporal, q qVar) {
        Instant V = V(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, V);
        }
        switch (f.f18106b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return a.d(a.f(a.h(V.f18014a, this.f18014a), 1000000000), (long) (V.f18015b - this.f18015b));
            case 2:
                return a.d(a.f(a.h(V.f18014a, this.f18014a), 1000000000), (long) (V.f18015b - this.f18015b)) / 1000;
            case 3:
                return a.h(V.toEpochMilli(), toEpochMilli());
            case 4:
                return c0(V);
            case 5:
                return c0(V) / 60;
            case 6:
                return c0(V) / 3600;
            case 7:
                return c0(V) / 43200;
            case 8:
                return c0(V) / 86400;
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    public final int m(o oVar) {
        if (!(oVar instanceof a)) {
            return n.d(this, oVar).a(oVar.K(this), oVar);
        }
        int i10 = f.f18105a[((a) oVar).ordinal()];
        if (i10 == 1) {
            return this.f18015b;
        }
        if (i10 == 2) {
            return this.f18015b / 1000;
        }
        if (i10 == 3) {
            return this.f18015b / 1000000;
        }
        if (i10 == 4) {
            a.INSTANT_SECONDS.U(this.f18014a);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (Instant) C0338e.a(localDate, this);
    }

    public final s o(o oVar) {
        return n.d(this, oVar);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c(this.f18014a, a.INSTANT_SECONDS).c((long) this.f18015b, a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long f10;
        int i10;
        long j10 = this.f18014a;
        if (j10 >= 0 || this.f18015b <= 0) {
            f10 = a.f(j10, (long) 1000);
            i10 = this.f18015b / 1000000;
        } else {
            f10 = a.f(j10 + 1, (long) 1000);
            i10 = (this.f18015b / 1000000) - 1000;
        }
        return a.d(f10, (long) i10);
    }

    public final String toString() {
        return DateTimeFormatter.f18116h.a(this);
    }
}
