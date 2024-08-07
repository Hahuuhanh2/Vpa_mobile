package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.a;
import j$.time.b;
import j$.time.chrono.C0338e;
import j$.time.d;
import j$.util.C0407m;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

public final class e implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f18311i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final d[] f18312j = new d[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f18313k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f18314l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f18315a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f18316b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f18317c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f18318d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f18319e;

    /* renamed from: f  reason: collision with root package name */
    private final d[] f18320f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f18321g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f18322h = new ConcurrentHashMap();

    private e(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f18316b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f18311i;
        this.f18315a = jArr;
        this.f18317c = jArr;
        this.f18318d = f18313k;
        this.f18319e = zoneOffsetArr;
        this.f18320f = f18312j;
        this.f18321g = null;
    }

    e(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f18316b = zoneOffsetArr;
        zoneOffsetArr[0] = k(timeZone.getRawOffset());
        long[] jArr = f18311i;
        this.f18315a = jArr;
        this.f18317c = jArr;
        this.f18318d = f18313k;
        this.f18319e = zoneOffsetArr;
        this.f18320f = f18312j;
        this.f18321g = timeZone;
    }

    private e(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        LocalDateTime localDateTime;
        this.f18315a = jArr;
        this.f18316b = zoneOffsetArr;
        this.f18317c = jArr2;
        this.f18319e = zoneOffsetArr2;
        this.f18320f = dVarArr;
        if (jArr2.length == 0) {
            this.f18318d = f18313k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.U()) {
                    arrayList.add(bVar.n());
                    localDateTime = bVar.m();
                } else {
                    arrayList.add(bVar.m());
                    localDateTime = bVar.n();
                }
                arrayList.add(localDateTime);
                i10 = i11;
            }
            this.f18318d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f18321g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime n10 = bVar.n();
        boolean U = bVar.U();
        boolean Z = localDateTime.Z(n10);
        return U ? Z ? bVar.K() : localDateTime.Z(bVar.m()) ? bVar : bVar.t() : !Z ? bVar.t() : localDateTime.Z(bVar.m()) ? bVar.K() : bVar;
    }

    private b[] b(int i10) {
        long j10;
        int i11 = i10;
        Integer valueOf = Integer.valueOf(i10);
        b[] bVarArr = (b[]) this.f18322h.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        if (this.f18321g == null) {
            d[] dVarArr = this.f18320f;
            b[] bVarArr2 = new b[dVarArr.length];
            for (int i12 = 0; i12 < dVarArr.length; i12++) {
                bVarArr2[i12] = dVarArr[i12].a(i11);
            }
            if (i11 < 2100) {
                this.f18322h.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        } else if (i11 < 1800) {
            return f18314l;
        } else {
            long p10 = C0338e.p(LocalDateTime.a0(i11 - 1), this.f18316b[0]);
            int offset = this.f18321g.getOffset(p10 * 1000);
            long j11 = 31968000 + p10;
            b[] bVarArr3 = f18314l;
            while (p10 < j11) {
                long j12 = 7776000 + p10;
                long j13 = p10;
                if (offset != this.f18321g.getOffset(j12 * 1000)) {
                    p10 = j13;
                    while (j12 - p10 > 1) {
                        long g2 = a.g(j12 + p10, 2);
                        long j14 = j11;
                        int i13 = offset;
                        if (this.f18321g.getOffset(g2 * 1000) == i13) {
                            p10 = g2;
                        } else {
                            j12 = g2;
                        }
                        offset = i13;
                        j11 = j14;
                    }
                    j10 = j11;
                    int i14 = offset;
                    if (this.f18321g.getOffset(p10 * 1000) == i14) {
                        p10 = j12;
                    }
                    ZoneOffset k10 = k(i14);
                    offset = this.f18321g.getOffset(p10 * 1000);
                    ZoneOffset k11 = k(offset);
                    if (c(p10, k11) == i11) {
                        b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new b(p10, k10, k11);
                        bVarArr3 = bVarArr4;
                    }
                } else {
                    j10 = j11;
                    int i15 = offset;
                    p10 = j12;
                }
                j11 = j10;
            }
            if (1916 <= i11 && i11 < 2100) {
                this.f18322h.putIfAbsent(valueOf, bVarArr3);
            }
            return bVarArr3;
        }
    }

    private static int c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.h0(a.g(j10 + ((long) zoneOffset.b0()), (long) 86400)).getYear();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i10 = 0;
        if (this.f18321g != null) {
            b[] b10 = b(localDateTime.X());
            if (b10.length == 0) {
                return k(this.f18321g.getOffset(C0338e.p(localDateTime, this.f18316b[0]) * 1000));
            }
            int length = b10.length;
            while (i10 < length) {
                b bVar = b10[i10];
                Object a10 = a(localDateTime, bVar);
                if ((a10 instanceof b) || a10.equals(bVar.K())) {
                    return a10;
                }
                i10++;
                obj = a10;
            }
            return obj;
        } else if (this.f18317c.length == 0) {
            return this.f18316b[0];
        } else {
            if (this.f18320f.length > 0) {
                LocalDateTime[] localDateTimeArr = this.f18318d;
                if (localDateTime.Y(localDateTimeArr[localDateTimeArr.length - 1])) {
                    b[] b11 = b(localDateTime.X());
                    int length2 = b11.length;
                    while (i10 < length2) {
                        b bVar2 = b11[i10];
                        Object a11 = a(localDateTime, bVar2);
                        if ((a11 instanceof b) || a11.equals(bVar2.K())) {
                            return a11;
                        }
                        i10++;
                        obj = a11;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f18318d, localDateTime);
            if (binarySearch == -1) {
                return this.f18319e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f18318d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i11 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i11])) {
                        binarySearch = i11;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.f18319e[(binarySearch / 2) + 1];
            }
            LocalDateTime[] localDateTimeArr3 = this.f18318d;
            LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f18319e;
            int i12 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i12];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i12 + 1];
            return zoneOffset2.b0() > zoneOffset.b0() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    public static e j(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new e(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    private static ZoneOffset k(int i10) {
        return ZoneOffset.e0(i10 / 1000);
    }

    static e l(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = readInt == 0 ? f18311i : new long[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            jArr[i10] = a.a(dataInput);
        }
        int i11 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr[i12] = a.b(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = readInt2 == 0 ? f18311i : new long[readInt2];
        for (int i13 = 0; i13 < readInt2; i13++) {
            jArr2[i13] = a.a(dataInput);
        }
        int i14 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            zoneOffsetArr2[i15] = a.b(dataInput);
        }
        int readByte = dataInput.readByte();
        d[] dVarArr = readByte == 0 ? f18312j : new d[readByte];
        for (int i16 = 0; i16 < readByte; i16++) {
            dVarArr[i16] = d.b(dataInput);
        }
        return new e(jArr, zoneOffsetArr, jArr2, zoneOffsetArr2, dVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f18321g != null ? (byte) 100 : 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f18321g;
        if (timeZone != null) {
            return k(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f18317c.length == 0) {
            return this.f18316b[0];
        }
        long W = instant.W();
        if (this.f18320f.length > 0) {
            long[] jArr = this.f18317c;
            if (W > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f18319e;
                b[] b10 = b(c(W, zoneOffsetArr[zoneOffsetArr.length - 1]));
                b bVar = null;
                for (int i10 = 0; i10 < b10.length; i10++) {
                    bVar = b10[i10];
                    if (W < bVar.T()) {
                        return bVar.K();
                    }
                }
                return bVar.t();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f18317c, W);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f18319e[binarySearch + 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C0407m.p(this.f18321g, eVar.f18321g) && Arrays.equals(this.f18315a, eVar.f18315a) && Arrays.equals(this.f18316b, eVar.f18316b) && Arrays.equals(this.f18317c, eVar.f18317c) && Arrays.equals(this.f18319e, eVar.f18319e) && Arrays.equals(this.f18320f, eVar.f18320f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        if (e10 instanceof b) {
            return (b) e10;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof b ? ((b) e10).R() : Collections.singletonList((ZoneOffset) e10);
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f18321g;
        if (timeZone != null) {
            zoneOffset = k(timeZone.getRawOffset());
        } else if (this.f18317c.length == 0) {
            zoneOffset = this.f18316b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f18315a, instant.W());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f18316b[binarySearch + 1];
        }
        return !zoneOffset.equals(d(instant));
    }

    public final int hashCode() {
        TimeZone timeZone = this.f18321g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f18315a)) ^ Arrays.hashCode(this.f18316b)) ^ Arrays.hashCode(this.f18317c)) ^ Arrays.hashCode(this.f18319e)) ^ Arrays.hashCode(this.f18320f);
    }

    public final boolean i() {
        TimeZone timeZone = this.f18321g;
        if (timeZone == null) {
            return this.f18317c.length == 0;
        }
        if (!timeZone.useDaylightTime() && this.f18321g.getDSTSavings() == 0) {
            Instant instant = Instant.f18013c;
            Instant b10 = d.e().b();
            b bVar = null;
            if (this.f18321g != null) {
                long W = b10.W();
                if (b10.X() > 0 && W < Long.MAX_VALUE) {
                    W++;
                }
                int c10 = c(W, d(b10));
                b[] b11 = b(c10);
                int length = b11.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (W > b11[length].T()) {
                            bVar = b11[length];
                            break;
                        }
                        length--;
                    } else if (c10 > 1800) {
                        b[] b12 = b(c10 - 1);
                        int length2 = b12.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(W - 31104000, (d.e().c() / 1000) + 31968000);
                                int offset = this.f18321g.getOffset((W - 1) * 1000);
                                long I = LocalDate.f0(1800, 1, 1).I() * 86400;
                                while (true) {
                                    if (I > min) {
                                        break;
                                    }
                                    int offset2 = this.f18321g.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c11 = c(min, k(offset2));
                                        b[] b13 = b(c11 + 1);
                                        int length3 = b13.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] b14 = b(c11);
                                                bVar = b14[b14.length - 1];
                                                break;
                                            } else if (W > b13[length3].T()) {
                                                bVar = b13[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (W > b12[length2].T()) {
                                bVar = b12[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.f18317c.length != 0) {
                long W2 = b10.W();
                if (b10.X() > 0 && W2 < Long.MAX_VALUE) {
                    W2++;
                }
                long[] jArr = this.f18317c;
                long j10 = jArr[jArr.length - 1];
                if (this.f18320f.length > 0 && W2 > j10) {
                    ZoneOffset[] zoneOffsetArr = this.f18319e;
                    ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int c12 = c(W2, zoneOffset);
                    b[] b15 = b(c12);
                    int length4 = b15.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i10 = c12 - 1;
                            if (i10 > c(j10, zoneOffset)) {
                                b[] b16 = b(i10);
                                bVar = b16[b16.length - 1];
                            }
                        } else if (W2 > b15[length4].T()) {
                            bVar = b15[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.f18317c, W2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i11 = binarySearch - 1;
                    long j11 = this.f18317c[i11];
                    ZoneOffset[] zoneOffsetArr2 = this.f18319e;
                    bVar = new b(j11, zoneOffsetArr2[i11], zoneOffsetArr2[binarySearch]);
                }
            }
            if (bVar == null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void m(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18315a.length);
        for (long c10 : this.f18315a) {
            a.c(c10, dataOutput);
        }
        for (ZoneOffset d10 : this.f18316b) {
            a.d(d10, dataOutput);
        }
        dataOutput.writeInt(this.f18317c.length);
        for (long c11 : this.f18317c) {
            a.c(c11, dataOutput);
        }
        for (ZoneOffset d11 : this.f18319e) {
            a.d(d11, dataOutput);
        }
        dataOutput.writeByte(this.f18320f.length);
        for (d c12 : this.f18320f) {
            c12.c(dataOutput);
        }
    }

    /* access modifiers changed from: package-private */
    public final void n(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f18321g.getID());
    }

    public final String toString() {
        StringBuilder sb2;
        if (this.f18321g != null) {
            sb2 = b.b("ZoneRules[timeZone=");
            sb2.append(this.f18321g.getID());
        } else {
            sb2 = b.b("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f18316b;
            sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
