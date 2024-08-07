package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.a;
import j$.time.b;
import j$.time.e;
import j$.time.r;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public final class t extends C0340g {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient r f18095a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f18096b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f18097c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f18098d;

    private t(r rVar, int i10, int i11, int i12) {
        rVar.a0(i10, i11, i12);
        this.f18095a = rVar;
        this.f18096b = i10;
        this.f18097c = i11;
        this.f18098d = i12;
    }

    private t(r rVar, long j10) {
        int[] b02 = rVar.b0((int) j10);
        this.f18095a = rVar;
        this.f18096b = b02[0];
        this.f18097c = b02[1];
        this.f18098d = b02[2];
    }

    private int Y() {
        return ((int) a.e(I() + 3, (long) 7)) + 1;
    }

    private int Z() {
        return this.f18095a.Z(this.f18096b, this.f18097c) + this.f18098d;
    }

    static t a0(r rVar, int i10, int i11, int i12) {
        return new t(rVar, i10, i11, i12);
    }

    static t b0(r rVar, long j10) {
        return new t(rVar, j10);
    }

    private t e0(int i10, int i11, int i12) {
        int e02 = this.f18095a.e0(i10, i11);
        if (i12 > e02) {
            i12 = e02;
        }
        return new t(this.f18095a, i10, i11, i12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 6, this);
    }

    public final ChronoLocalDate C(r rVar) {
        return (t) super.C(rVar);
    }

    public final ChronoLocalDate E(k kVar) {
        return (t) super.n(kVar);
    }

    public final long I() {
        return this.f18095a.a0(this.f18096b, this.f18097c, this.f18098d);
    }

    public final C0341h J(j$.time.k kVar) {
        return C0343j.V(this, kVar);
    }

    public final p M() {
        return u.AH;
    }

    public final int Q() {
        return this.f18095a.f0(this.f18096b);
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate X(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f18096b) + ((long) ((int) j10));
        int i10 = (int) j11;
        if (j11 == ((long) i10)) {
            return e0(i10, this.f18097c, this.f18098d);
        }
        throw new ArithmeticException();
    }

    public final o a() {
        return this.f18095a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final t V(long j10) {
        return new t(this.f18095a, I() + j10);
    }

    public final ChronoLocalDate d(long j10, q qVar) {
        return (t) super.d(j10, qVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final Temporal m27d(long j10, q qVar) {
        return (t) super.d(j10, qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final t W(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f18096b) * 12) + ((long) (this.f18097c - 1)) + j10;
        r rVar = this.f18095a;
        long g2 = a.g(j11, 12);
        if (g2 >= ((long) rVar.d0()) && g2 <= ((long) rVar.c0())) {
            return e0((int) g2, ((int) a.e(j11, 12)) + 1, this.f18098d);
        }
        throw new e("Invalid Hijrah year: " + g2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f18096b == tVar.f18096b && this.f18097c == tVar.f18097c && this.f18098d == tVar.f18098d && this.f18095a.equals(tVar.f18095a);
    }

    /* renamed from: f0 */
    public final t c(long j10, o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (t) super.c(j10, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        this.f18095a.w(aVar).b(j10, aVar);
        int i10 = (int) j10;
        switch (s.f18094a[aVar.ordinal()]) {
            case 1:
                return e0(this.f18096b, this.f18097c, i10);
            case 2:
                return V((long) (Math.min(i10, Q()) - Z()));
            case 3:
                return V((j10 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return V(j10 - ((long) Y()));
            case 5:
                return V(j10 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return V(j10 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new t(this.f18095a, j10);
            case 8:
                return V((j10 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return e0(this.f18096b, i10, this.f18098d);
            case 10:
                return W(j10 - (((((long) this.f18096b) * 12) + ((long) this.f18097c)) - 1));
            case 11:
                if (this.f18096b < 1) {
                    i10 = 1 - i10;
                }
                return e0(i10, this.f18097c, this.f18098d);
            case 12:
                return e0(i10, this.f18097c, this.f18098d);
            case 13:
                return e0(1 - this.f18096b, this.f18097c, this.f18098d);
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
        }
    }

    public final ChronoLocalDate g(long j10, ChronoUnit chronoUnit) {
        return (t) super.g(j10, chronoUnit);
    }

    /* renamed from: g  reason: collision with other method in class */
    public final Temporal m28g(long j10, ChronoUnit chronoUnit) {
        return (t) super.g(j10, chronoUnit);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5 = (r5 - 1) % 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r5 = (r5 - 1) / 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        return (long) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h(j$.time.temporal.o r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j$.time.temporal.a
            if (r0 == 0) goto L_0x0067
            int[] r0 = j$.time.chrono.s.f18094a
            r1 = r5
            j$.time.temporal.a r1 = (j$.time.temporal.a) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L_0x0063;
                case 2: goto L_0x005e;
                case 3: goto L_0x0057;
                case 4: goto L_0x0052;
                case 5: goto L_0x004a;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x003b;
                case 9: goto L_0x0038;
                case 10: goto L_0x002a;
                case 11: goto L_0x0027;
                case 12: goto L_0x0027;
                case 13: goto L_0x001f;
                default: goto L_0x0013;
            }
        L_0x0013:
            j$.time.temporal.r r0 = new j$.time.temporal.r
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r5 = j$.time.b.a(r1, r5)
            r0.<init>(r5)
            throw r0
        L_0x001f:
            int r5 = r4.f18096b
            if (r5 <= r1) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            long r0 = (long) r1
            return r0
        L_0x0027:
            int r5 = r4.f18096b
            goto L_0x0065
        L_0x002a:
            int r5 = r4.f18096b
            long r0 = (long) r5
            r2 = 12
            long r0 = r0 * r2
            int r5 = r4.f18097c
            long r2 = (long) r5
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            return r0
        L_0x0038:
            int r5 = r4.f18097c
            goto L_0x0065
        L_0x003b:
            int r5 = r4.Z()
            goto L_0x0059
        L_0x0040:
            long r0 = r4.I()
            return r0
        L_0x0045:
            int r5 = r4.Z()
            goto L_0x004e
        L_0x004a:
            int r5 = r4.Y()
        L_0x004e:
            int r5 = r5 - r1
            int r5 = r5 % 7
            goto L_0x005c
        L_0x0052:
            int r5 = r4.Y()
            goto L_0x0065
        L_0x0057:
            int r5 = r4.f18098d
        L_0x0059:
            int r5 = r5 - r1
            int r5 = r5 / 7
        L_0x005c:
            int r5 = r5 + r1
            goto L_0x0065
        L_0x005e:
            int r5 = r4.Z()
            goto L_0x0065
        L_0x0063:
            int r5 = r4.f18098d
        L_0x0065:
            long r0 = (long) r5
            return r0
        L_0x0067:
            long r0 = r5.K(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.t.h(j$.time.temporal.o):long");
    }

    public final int hashCode() {
        int i10 = this.f18096b;
        int i11 = this.f18097c;
        return (((i10 << 11) + (i11 << 6)) + this.f18098d) ^ (this.f18095a.l().hashCode() ^ (i10 & -2048));
    }

    public final Temporal n(LocalDate localDate) {
        return (t) super.n(localDate);
    }

    public final s o(o oVar) {
        long j10;
        int i10;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.n(this);
        }
        if (C0338e.j(this, oVar)) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i11 = s.f18094a[aVar.ordinal()];
            if (i11 == 1) {
                i10 = this.f18095a.e0(this.f18096b, this.f18097c);
            } else if (i11 == 2) {
                i10 = Q();
            } else if (i11 != 3) {
                return this.f18095a.w(aVar);
            } else {
                j10 = 5;
                return s.j(1, j10);
            }
            j10 = (long) i10;
            return s.j(1, j10);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
    }

    public final boolean v() {
        return this.f18095a.S((long) this.f18096b);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f18095a);
        objectOutput.writeInt(n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
