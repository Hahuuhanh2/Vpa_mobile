package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.zone.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class ZoneOffset extends ZoneId implements j, k, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = e0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f18033d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f18034e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f18035f = e0(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f18036g = e0(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f18037b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f18038c;

    private ZoneOffset(int i10) {
        String str;
        this.f18037b = i10;
        if (i10 == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            String str2 = ":0";
            sb2.append(i12 < 10 ? str2 : ":");
            sb2.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb2.append(i13 >= 10 ? ":" : str2);
                sb2.append(i13);
            }
            str = sb2.toString();
        }
        this.f18038c = str;
    }

    public static ZoneOffset a0(j jVar) {
        if (jVar != null) {
            ZoneOffset zoneOffset = (ZoneOffset) jVar.K(n.i());
            if (zoneOffset != null) {
                return zoneOffset;
            }
            throw new e("Unable to obtain ZoneOffset from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j$.time.ZoneOffset c0(java.lang.String r7) {
        /*
            if (r7 == 0) goto L_0x00c0
            j$.util.concurrent.ConcurrentHashMap r0 = f18034e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006b
            r1 = 3
            if (r0 == r1) goto L_0x0087
            r4 = 5
            if (r0 == r4) goto L_0x0061
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0058
            r5 = 7
            if (r0 == r5) goto L_0x004b
            r1 = 9
            if (r0 != r1) goto L_0x0034
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r6, r2)
            int r2 = f0(r7, r5, r2)
            goto L_0x008d
        L_0x0034:
            j$.time.e r0 = new j$.time.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004b:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r1, r3)
            int r2 = f0(r7, r4, r3)
            goto L_0x008d
        L_0x0058:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r6, r2)
            goto L_0x0069
        L_0x0061:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r1, r3)
        L_0x0069:
            r2 = r3
            goto L_0x008d
        L_0x006b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0087:
            int r0 = f0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x008d:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b1
            if (r3 != r5) goto L_0x009a
            goto L_0x00b1
        L_0x009a:
            j$.time.e r0 = new j$.time.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b1:
            if (r3 != r5) goto L_0x00bb
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = d0(r7, r0, r1)
            return r7
        L_0x00bb:
            j$.time.ZoneOffset r7 = d0(r0, r1, r2)
            return r7
        L_0x00c0:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "offsetId"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.c0(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset d0(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new e("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new e("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new e("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new e("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new e("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        } else if (i12 < -59 || i12 > 59) {
            throw new e("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        } else if (Math.abs(i10) != 18 || (i11 | i12) == 0) {
            return e0((i11 * 60) + (i10 * 3600) + i12);
        } else {
            throw new e("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset e0(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new e("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i10 % 900 != 0) {
            return new ZoneOffset(i10);
        } else {
            Integer valueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f18033d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f18034e.putIfAbsent(zoneOffset2.f18038c, zoneOffset2);
            return zoneOffset2;
        }
    }

    private static int f0(CharSequence charSequence, int i10, boolean z10) {
        if (!z10 || charSequence.charAt(i10 - 1) == ':') {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence.charAt(i10 + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new e("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new e("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    static ZoneOffset g0(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? e0(dataInput.readInt()) : e0(readByte * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 8, this);
    }

    public final Object K(p pVar) {
        return (pVar == n.i() || pVar == n.k()) ? this : n.c(this, pVar);
    }

    public final e U() {
        return e.j(this);
    }

    /* access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        h0(dataOutput);
    }

    public final int Z(ZoneOffset zoneOffset) {
        return zoneOffset.f18037b - this.f18037b;
    }

    public final int b0() {
        return this.f18037b;
    }

    public final int compareTo(Object obj) {
        return ((ZoneOffset) obj).f18037b - this.f18037b;
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.OFFSET_SECONDS : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f18037b == ((ZoneOffset) obj).f18037b;
        }
        return false;
    }

    public final long h(o oVar) {
        if (oVar == a.OFFSET_SECONDS) {
            return (long) this.f18037b;
        }
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    /* access modifiers changed from: package-private */
    public final void h0(DataOutput dataOutput) {
        int i10 = this.f18037b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public final int hashCode() {
        return this.f18037b;
    }

    public final String l() {
        return this.f18038c;
    }

    public final int m(o oVar) {
        if (oVar == a.OFFSET_SECONDS) {
            return this.f18037b;
        }
        if (!(oVar instanceof a)) {
            return n.d(this, oVar).a(h(oVar), oVar);
        }
        throw new r(b.a("Unsupported field: ", oVar));
    }

    public final s o(o oVar) {
        return n.d(this, oVar);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c((long) this.f18037b, a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.f18038c;
    }
}
