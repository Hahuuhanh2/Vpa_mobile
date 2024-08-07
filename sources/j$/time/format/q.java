package j$.time.format;

import j$.time.LocalDate;
import j$.time.b;
import j$.time.chrono.C0338e;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.o;

final class q extends k {

    /* renamed from: i  reason: collision with root package name */
    static final LocalDate f18177i = LocalDate.f0(2000, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private final int f18178g;

    /* renamed from: h  reason: collision with root package name */
    private final ChronoLocalDate f18179h;

    private q(o oVar, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(oVar, i10, i11, 4, i13);
        this.f18178g = i12;
        this.f18179h = chronoLocalDate;
    }

    q(o oVar, LocalDate localDate) {
        this(oVar, 2, 2, 0, localDate, 0);
    }

    /* synthetic */ q(o oVar, LocalDate localDate, int i10) {
        this(oVar, 2, 2, 0, localDate, 0);
    }

    /* access modifiers changed from: package-private */
    public final long b(A a10, long j10) {
        long abs = Math.abs(j10);
        int i10 = this.f18178g;
        if (this.f18179h != null) {
            i10 = C0338e.s(a10.d()).G(this.f18179h).m(this.f18154a);
        }
        long j11 = (long) i10;
        if (j10 >= j11) {
            long j12 = k.f18153f[this.f18155b];
            if (j10 < j11 + j12) {
                return abs % j12;
            }
        }
        return abs % k.f18153f[this.f18156c];
    }

    /* access modifiers changed from: package-private */
    public final boolean c(x xVar) {
        if (!xVar.l()) {
            return false;
        }
        return super.c(xVar);
    }

    /* access modifiers changed from: package-private */
    public final int d(x xVar, long j10, int i10, int i11) {
        int i12 = this.f18178g;
        if (this.f18179h != null) {
            i12 = xVar.h().G(this.f18179h).m(this.f18154a);
            xVar.a(new p(this, xVar, j10, i10, i11));
        }
        int i13 = i11 - i10;
        int i14 = this.f18155b;
        if (i13 == i14 && j10 >= 0) {
            long j11 = k.f18153f[i14];
            long j12 = (long) i12;
            long j13 = j12 - (j12 % j11);
            j10 = i12 > 0 ? j13 + j10 : j13 - j10;
            if (j10 < j12) {
                j10 += j11;
            }
        }
        return xVar.o(this.f18154a, j10, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final k e() {
        return this.f18158e == -1 ? this : new q(this.f18154a, this.f18155b, this.f18156c, this.f18178g, this.f18179h, -1);
    }

    /* access modifiers changed from: package-private */
    public final k f(int i10) {
        return new q(this.f18154a, this.f18155b, this.f18156c, this.f18178g, this.f18179h, this.f18158e + i10);
    }

    public final String toString() {
        StringBuilder b10 = b.b("ReducedValue(");
        b10.append(this.f18154a);
        b10.append(",");
        b10.append(this.f18155b);
        b10.append(",");
        b10.append(this.f18156c);
        b10.append(",");
        Object obj = this.f18179h;
        if (obj == null) {
            obj = Integer.valueOf(this.f18178g);
        }
        b10.append(obj);
        b10.append(")");
        return b10.toString();
    }
}
