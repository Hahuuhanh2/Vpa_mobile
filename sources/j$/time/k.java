package j$.time;

import j$.time.chrono.C0338e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class k implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final k f18219e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f18220f = new k(23, 59, 59, 999999999);

    /* renamed from: g  reason: collision with root package name */
    public static final k f18221g;

    /* renamed from: h  reason: collision with root package name */
    private static final k[] f18222h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f18223a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f18224b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f18225c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18226d;

    static {
        int i10 = 0;
        while (true) {
            k[] kVarArr = f18222h;
            if (i10 < kVarArr.length) {
                kVarArr[i10] = new k(i10, 0, 0, 0);
                i10++;
            } else {
                k kVar = kVarArr[0];
                f18221g = kVar;
                k kVar2 = kVarArr[12];
                f18219e = kVar;
                return;
            }
        }
    }

    private k(int i10, int i11, int i12, int i13) {
        this.f18223a = (byte) i10;
        this.f18224b = (byte) i11;
        this.f18225c = (byte) i12;
        this.f18226d = i13;
    }

    private static k U(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f18222h[i10] : new k(i10, i11, i12, i13);
    }

    public static k V(j jVar) {
        if (jVar != null) {
            k kVar = (k) jVar.K(n.g());
            if (kVar != null) {
                return kVar;
            }
            throw new e("Unable to obtain LocalTime from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    private int W(o oVar) {
        switch (j.f18217a[((a) oVar).ordinal()]) {
            case 1:
                return this.f18226d;
            case 2:
                throw new r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f18226d / 1000;
            case 4:
                throw new r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f18226d / 1000000;
            case 6:
                return (int) (k0() / 1000000);
            case 7:
                return this.f18225c;
            case 8:
                return l0();
            case 9:
                return this.f18224b;
            case 10:
                return (this.f18223a * 60) + this.f18224b;
            case 11:
                return this.f18223a % 12;
            case 12:
                int i10 = this.f18223a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f18223a;
            case 14:
                byte b10 = this.f18223a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f18223a / 12;
            default:
                throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    public static k a0(int i10) {
        a.HOUR_OF_DAY.V((long) i10);
        return f18222h[i10];
    }

    public static k b0(int i10, int i11, int i12, int i13) {
        a.HOUR_OF_DAY.V((long) i10);
        a.MINUTE_OF_HOUR.V((long) i11);
        a.SECOND_OF_MINUTE.V((long) i12);
        a.NANO_OF_SECOND.V((long) i13);
        return U(i10, i11, i12, i13);
    }

    public static k c0(long j10) {
        a.NANO_OF_DAY.V(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return U(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static k d0(long j10) {
        a.SECOND_OF_DAY.V(j10);
        int i10 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i10 * 3600));
        int i11 = (int) (j11 / 60);
        return U(i10, i11, (int) (j11 - ((long) (i11 * 60))), 0);
    }

    static k j0(DataInput dataInput) {
        int i10;
        int i11;
        int readByte = dataInput.readByte();
        int i12 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i10 = 0;
            i11 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i13 = ~readByte2;
                i11 = 0;
                i12 = i13;
                i10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i10 = ~readByte3;
                } else {
                    i12 = dataInput.readInt();
                    i10 = readByte3;
                }
                byte b10 = readByte2;
                i11 = i12;
                i12 = b10;
            }
        }
        return b0(readByte, i12, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    public final Object K(p pVar) {
        if (pVar == n.e() || pVar == n.l() || pVar == n.k() || pVar == n.i()) {
            return null;
        }
        if (pVar == n.g()) {
            return this;
        }
        if (pVar == n.f()) {
            return null;
        }
        return pVar == n.j() ? ChronoUnit.NANOS : pVar.h(this);
    }

    /* renamed from: R */
    public final int compareTo(k kVar) {
        int compare = Integer.compare(this.f18223a, kVar.f18223a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f18224b, kVar.f18224b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f18225c, kVar.f18225c);
        return compare3 == 0 ? Integer.compare(this.f18226d, kVar.f18226d) : compare3;
    }

    public final int X() {
        return this.f18223a;
    }

    public final int Y() {
        return this.f18226d;
    }

    public final int Z() {
        return this.f18225c;
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar.isTimeBased() : oVar != null && oVar.m(this);
    }

    /* renamed from: e0 */
    public final k d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (k) qVar.m(this, j10);
        }
        switch (j.f18218b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return h0(j10);
            case 2:
                return h0((j10 % 86400000000L) * 1000);
            case 3:
                return h0((j10 % 86400000) * 1000000);
            case 4:
                return i0(j10);
            case 5:
                return g0(j10);
            case 6:
                return f0(j10);
            case 7:
                return f0((j10 % 2) * 12);
            default:
                throw new r("Unsupported unit: " + qVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f18223a == kVar.f18223a && this.f18224b == kVar.f18224b && this.f18225c == kVar.f18225c && this.f18226d == kVar.f18226d;
    }

    public final k f0(long j10) {
        return j10 == 0 ? this : U(((((int) (j10 % 24)) + this.f18223a) + 24) % 24, this.f18224b, this.f18225c, this.f18226d);
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final k g0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f18223a * 60) + this.f18224b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : U(i11 / 60, i11 % 60, this.f18225c, this.f18226d);
    }

    public final long h(o oVar) {
        return oVar instanceof a ? oVar == a.NANO_OF_DAY ? k0() : oVar == a.MICRO_OF_DAY ? k0() / 1000 : (long) W(oVar) : oVar.K(this);
    }

    public final k h0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long k02 = k0();
        long j11 = (((j10 % 86400000000000L) + k02) + 86400000000000L) % 86400000000000L;
        return k02 == j11 ? this : U((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public final int hashCode() {
        long k02 = k0();
        return (int) (k02 ^ (k02 >>> 32));
    }

    public final long i(Temporal temporal, q qVar) {
        long j10;
        k V = V(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, V);
        }
        long k02 = V.k0() - k0();
        switch (j.f18218b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return k02;
            case 2:
                j10 = 1000;
                break;
            case 3:
                j10 = 1000000;
                break;
            case 4:
                j10 = 1000000000;
                break;
            case 5:
                j10 = 60000000000L;
                break;
            case 6:
                j10 = 3600000000000L;
                break;
            case 7:
                j10 = 43200000000000L;
                break;
            default:
                throw new r("Unsupported unit: " + qVar);
        }
        return k02 / j10;
    }

    public final k i0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f18224b * 60) + (this.f18223a * 3600) + this.f18225c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : U(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f18226d);
    }

    public final long k0() {
        return (((long) this.f18225c) * 1000000000) + (((long) this.f18224b) * 60000000000L) + (((long) this.f18223a) * 3600000000000L) + ((long) this.f18226d);
    }

    public final int l0() {
        return (this.f18224b * 60) + (this.f18223a * 3600) + this.f18225c;
    }

    public final int m(o oVar) {
        return oVar instanceof a ? W(oVar) : n.a(this, oVar);
    }

    /* renamed from: m0 */
    public final k c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (k) oVar.R(this, j10);
        }
        a aVar = (a) oVar;
        aVar.V(j10);
        switch (j.f18217a[aVar.ordinal()]) {
            case 1:
                return n0((int) j10);
            case 2:
                return c0(j10);
            case 3:
                return n0(((int) j10) * 1000);
            case 4:
                return c0(j10 * 1000);
            case 5:
                return n0(((int) j10) * 1000000);
            case 6:
                return c0(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f18225c == i10) {
                    return this;
                }
                a.SECOND_OF_MINUTE.V((long) i10);
                return U(this.f18223a, this.f18224b, i10, this.f18226d);
            case 8:
                return i0(j10 - ((long) l0()));
            case 9:
                int i11 = (int) j10;
                if (this.f18224b == i11) {
                    return this;
                }
                a.MINUTE_OF_HOUR.V((long) i11);
                return U(this.f18223a, i11, this.f18225c, this.f18226d);
            case 10:
                return g0(j10 - ((long) ((this.f18223a * 60) + this.f18224b)));
            case 11:
                return f0(j10 - ((long) (this.f18223a % 12)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return f0(j10 - ((long) (this.f18223a % 12)));
            case 13:
                int i12 = (int) j10;
                if (this.f18223a == i12) {
                    return this;
                }
                a.HOUR_OF_DAY.V((long) i12);
                return U(i12, this.f18224b, this.f18225c, this.f18226d);
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i13 = (int) j10;
                if (this.f18223a == i13) {
                    return this;
                }
                a.HOUR_OF_DAY.V((long) i13);
                return U(i13, this.f18224b, this.f18225c, this.f18226d);
            case 15:
                return f0((j10 - ((long) (this.f18223a / 12))) * 12);
            default:
                throw new r(b.a("Unsupported field: ", oVar));
        }
    }

    public final Temporal n(LocalDate localDate) {
        boolean z10 = localDate instanceof k;
        j jVar = localDate;
        if (!z10) {
            localDate.getClass();
            jVar = C0338e.a(localDate, this);
        }
        return (k) jVar;
    }

    public final k n0(int i10) {
        if (this.f18226d == i10) {
            return this;
        }
        a.NANO_OF_SECOND.V((long) i10);
        return U(this.f18223a, this.f18224b, this.f18225c, i10);
    }

    public final s o(o oVar) {
        return n.d(this, oVar);
    }

    /* access modifiers changed from: package-private */
    public final void o0(DataOutput dataOutput) {
        byte b10;
        if (this.f18226d == 0) {
            if (this.f18225c != 0) {
                dataOutput.writeByte(this.f18223a);
                dataOutput.writeByte(this.f18224b);
                b10 = this.f18225c;
            } else if (this.f18224b == 0) {
                b10 = this.f18223a;
            } else {
                dataOutput.writeByte(this.f18223a);
                b10 = this.f18224b;
            }
            dataOutput.writeByte(~b10);
            return;
        }
        dataOutput.writeByte(this.f18223a);
        dataOutput.writeByte(this.f18224b);
        dataOutput.writeByte(this.f18225c);
        dataOutput.writeInt(this.f18226d);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c(k0(), a.NANO_OF_DAY);
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f18223a;
        byte b11 = this.f18224b;
        byte b12 = this.f18225c;
        int i11 = this.f18226d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append(b10);
        String str = ":0";
        sb2.append(b11 < 10 ? str : ":");
        sb2.append(b11);
        if (b12 > 0 || i11 > 0) {
            if (b12 >= 10) {
                str = ":";
            }
            sb2.append(str);
            sb2.append(b12);
            if (i11 > 0) {
                sb2.append('.');
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = 1000000000;
                    }
                    i10 = i11 + i12;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
        }
        return sb2.toString();
    }
}
