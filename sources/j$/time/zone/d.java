package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.format.G;
import j$.time.k;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final Month f18302a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f18303b;

    /* renamed from: c  reason: collision with root package name */
    private final DayOfWeek f18304c;

    /* renamed from: d  reason: collision with root package name */
    private final k f18305d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18306e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18307f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneOffset f18308g;

    /* renamed from: h  reason: collision with root package name */
    private final ZoneOffset f18309h;

    /* renamed from: i  reason: collision with root package name */
    private final ZoneOffset f18310i;

    d(Month month, int i10, DayOfWeek dayOfWeek, k kVar, boolean z10, int i11, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f18302a = month;
        this.f18303b = (byte) i10;
        this.f18304c = dayOfWeek;
        this.f18305d = kVar;
        this.f18306e = z10;
        this.f18307f = i11;
        this.f18308g = zoneOffset;
        this.f18309h = zoneOffset2;
        this.f18310i = zoneOffset3;
    }

    static d b(DataInput dataInput) {
        int readInt = dataInput.readInt();
        Month W = Month.W(readInt >>> 28);
        int i10 = ((264241152 & readInt) >>> 22) - 32;
        int i11 = (3670016 & readInt) >>> 19;
        DayOfWeek R = i11 == 0 ? null : DayOfWeek.R(i11);
        int i12 = (507904 & readInt) >>> 14;
        int i13 = G.c(3)[(readInt & 12288) >>> 12];
        int i14 = (readInt & 4080) >>> 4;
        int i15 = (readInt & 12) >>> 2;
        int i16 = readInt & 3;
        k d02 = i12 == 31 ? k.d0((long) dataInput.readInt()) : k.a0(i12 % 24);
        ZoneOffset e02 = ZoneOffset.e0(i14 == 255 ? dataInput.readInt() : (i14 - 128) * 900);
        ZoneOffset e03 = i15 == 3 ? ZoneOffset.e0(dataInput.readInt()) : ZoneOffset.e0((i15 * 1800) + e02.b0());
        ZoneOffset e04 = i16 == 3 ? ZoneOffset.e0(dataInput.readInt()) : ZoneOffset.e0((i16 * 1800) + e02.b0());
        boolean z10 = i12 == 24;
        if (W == null) {
            throw new NullPointerException("month");
        } else if (d02 == null) {
            throw new NullPointerException("time");
        } else if (i13 == 0) {
            throw new NullPointerException("timeDefnition");
        } else if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (!z10 || d02.equals(k.f18221g)) {
            return new d(W, i10, R, d02, z10, i13, e02, e03, e04);
        } else {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.zone.b a(int r6) {
        /*
            r5 = this;
            byte r0 = r5.f18303b
            r1 = 1
            if (r0 >= 0) goto L_0x0028
            j$.time.Month r0 = r5.f18302a
            j$.time.chrono.v r2 = j$.time.chrono.v.f18100d
            long r3 = (long) r6
            boolean r2 = r2.S(r3)
            int r2 = r0.U(r2)
            int r2 = r2 + r1
            byte r3 = r5.f18303b
            int r2 = r2 + r3
            j$.time.LocalDate r6 = j$.time.LocalDate.g0(r6, r0, r2)
            j$.time.DayOfWeek r0 = r5.f18304c
            if (r0 == 0) goto L_0x0040
            int r0 = r0.getValue()
            j$.time.temporal.l r2 = new j$.time.temporal.l
            r2.<init>(r0, r1)
            goto L_0x003c
        L_0x0028:
            j$.time.Month r2 = r5.f18302a
            j$.time.LocalDate r6 = j$.time.LocalDate.g0(r6, r2, r0)
            j$.time.DayOfWeek r0 = r5.f18304c
            if (r0 == 0) goto L_0x0040
            int r0 = r0.getValue()
            j$.time.temporal.l r2 = new j$.time.temporal.l
            r3 = 0
            r2.<init>(r0, r3)
        L_0x003c:
            j$.time.LocalDate r6 = r6.n(r2)
        L_0x0040:
            boolean r0 = r5.f18306e
            if (r0 == 0) goto L_0x004a
            r2 = 1
            j$.time.LocalDate r6 = r6.plusDays(r2)
        L_0x004a:
            j$.time.k r0 = r5.f18305d
            j$.time.LocalDateTime r6 = j$.time.LocalDateTime.c0(r6, r0)
            int r0 = r5.f18307f
            j$.time.ZoneOffset r2 = r5.f18308g
            j$.time.ZoneOffset r3 = r5.f18309h
            if (r0 == 0) goto L_0x0089
            int[] r4 = j$.time.zone.c.f18301a
            int r0 = j$.time.format.G.a(r0)
            r0 = r4[r0]
            if (r0 == r1) goto L_0x006f
            r1 = 2
            if (r0 == r1) goto L_0x0066
            goto L_0x007f
        L_0x0066:
            int r0 = r3.b0()
            int r1 = r2.b0()
            goto L_0x0079
        L_0x006f:
            int r0 = r3.b0()
            j$.time.ZoneOffset r1 = j$.time.ZoneOffset.UTC
            int r1 = r1.b0()
        L_0x0079:
            int r0 = r0 - r1
            long r0 = (long) r0
            j$.time.LocalDateTime r6 = r6.g0(r0)
        L_0x007f:
            j$.time.zone.b r0 = new j$.time.zone.b
            j$.time.ZoneOffset r1 = r5.f18309h
            j$.time.ZoneOffset r2 = r5.f18310i
            r0.<init>((j$.time.LocalDateTime) r6, (j$.time.ZoneOffset) r1, (j$.time.ZoneOffset) r2)
            return r0
        L_0x0089:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.d.a(int):j$.time.zone.b");
    }

    /* access modifiers changed from: package-private */
    public final void c(DataOutput dataOutput) {
        int l02 = this.f18306e ? 86400 : this.f18305d.l0();
        int b02 = this.f18308g.b0();
        int b03 = this.f18309h.b0() - b02;
        int b04 = this.f18310i.b0() - b02;
        int X = l02 % 3600 == 0 ? this.f18306e ? 24 : this.f18305d.X() : 31;
        int i10 = b02 % 900 == 0 ? (b02 / 900) + 128 : 255;
        int i11 = (b03 == 0 || b03 == 1800 || b03 == 3600) ? b03 / 1800 : 3;
        int i12 = (b04 == 0 || b04 == 1800 || b04 == 3600) ? b04 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f18304c;
        dataOutput.writeInt((this.f18302a.getValue() << 28) + ((this.f18303b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (X << 14) + (G.a(this.f18307f) << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (X == 31) {
            dataOutput.writeInt(l02);
        }
        if (i10 == 255) {
            dataOutput.writeInt(b02);
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.f18309h.b0());
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.f18310i.b0());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18302a == dVar.f18302a && this.f18303b == dVar.f18303b && this.f18304c == dVar.f18304c && this.f18307f == dVar.f18307f && this.f18305d.equals(dVar.f18305d) && this.f18306e == dVar.f18306e && this.f18308g.equals(dVar.f18308g) && this.f18309h.equals(dVar.f18309h) && this.f18310i.equals(dVar.f18310i);
    }

    public final int hashCode() {
        int l02 = ((this.f18305d.l0() + (this.f18306e ? 1 : 0)) << 15) + (this.f18302a.ordinal() << 11) + ((this.f18303b + 32) << 5);
        DayOfWeek dayOfWeek = this.f18304c;
        return ((this.f18308g.hashCode() ^ (G.a(this.f18307f) + (l02 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f18309h.hashCode()) ^ this.f18310i.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.String r0 = "TransitionRule["
            java.lang.StringBuilder r0 = j$.time.b.b(r0)
            j$.time.ZoneOffset r1 = r5.f18309h
            j$.time.ZoneOffset r2 = r5.f18310i
            int r1 = r1.Z(r2)
            if (r1 <= 0) goto L_0x0013
            java.lang.String r1 = "Gap "
            goto L_0x0015
        L_0x0013:
            java.lang.String r1 = "Overlap "
        L_0x0015:
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.f18309h
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.f18310i
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            j$.time.DayOfWeek r1 = r5.f18304c
            r2 = 32
            if (r1 == 0) goto L_0x0063
            byte r3 = r5.f18303b
            r4 = -1
            java.lang.String r1 = r1.name()
            r0.append(r1)
            if (r3 != r4) goto L_0x0041
            java.lang.String r1 = " on or before last day of "
            goto L_0x0051
        L_0x0041:
            if (r3 >= 0) goto L_0x005e
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r5.f18303b
            int r1 = -r1
            int r1 = r1 + r4
            r0.append(r1)
            java.lang.String r1 = " of "
        L_0x0051:
            r0.append(r1)
            j$.time.Month r1 = r5.f18302a
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L_0x0074
        L_0x005e:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L_0x0063:
            j$.time.Month r1 = r5.f18302a
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.append(r2)
            byte r1 = r5.f18303b
            r0.append(r1)
        L_0x0074:
            java.lang.String r1 = " at "
            r0.append(r1)
            boolean r1 = r5.f18306e
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = "24:00"
            goto L_0x0086
        L_0x0080:
            j$.time.k r1 = r5.f18305d
            java.lang.String r1 = r1.toString()
        L_0x0086:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r1 = r5.f18307f
            java.lang.String r1 = j$.time.b.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.f18308g
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.d.toString():java.lang.String");
    }
}
