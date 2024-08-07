package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.b;
import j$.time.r;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class F extends C0340g {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a  reason: collision with root package name */
    private final transient LocalDate f18055a;

    F(LocalDate localDate) {
        if (localDate != null) {
            this.f18055a = localDate;
            return;
        }
        throw new NullPointerException("isoDate");
    }

    private int Y() {
        return this.f18055a.getYear() - 1911;
    }

    private F a0(LocalDate localDate) {
        return localDate.equals(this.f18055a) ? this : new F(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 7, this);
    }

    public final ChronoLocalDate C(r rVar) {
        return (F) super.C(rVar);
    }

    public final ChronoLocalDate E(k kVar) {
        return (F) super.n(kVar);
    }

    public final long I() {
        return this.f18055a.I();
    }

    public final C0341h J(j$.time.k kVar) {
        return C0343j.V(this, kVar);
    }

    public final p M() {
        return Y() >= 1 ? G.ROC : G.BEFORE_ROC;
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate V(long j10) {
        return a0(this.f18055a.plusDays(j10));
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate W(long j10) {
        return a0(this.f18055a.k0(j10));
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate X(long j10) {
        return a0(this.f18055a.l0(j10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 7) goto L_0x0064;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.chrono.F c(long r8, j$.time.temporal.o r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto L_0x00a5
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.h(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            return r7
        L_0x0010:
            int[] r1 = j$.time.chrono.E.f18054a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L_0x004d
            r6 = 5
            if (r2 == r6) goto L_0x0025
            if (r2 == r4) goto L_0x004d
            if (r2 == r3) goto L_0x004d
            goto L_0x0064
        L_0x0025:
            j$.time.chrono.D r10 = j$.time.chrono.D.f18053d
            j$.time.temporal.s r10 = r10.w(r0)
            r10.b(r8, r0)
            int r10 = r7.Y()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.f18055a
            int r10 = r10.Y()
            long r2 = (long) r10
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r10 = r7.f18055a
            j$.time.LocalDate r8 = r10.k0(r8)
            j$.time.chrono.F r8 = r7.a0(r8)
            return r8
        L_0x004d:
            j$.time.chrono.D r2 = j$.time.chrono.D.f18053d
            j$.time.temporal.s r2 = r2.w(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L_0x008e
            if (r0 == r4) goto L_0x0081
            if (r0 == r3) goto L_0x006f
        L_0x0064:
            j$.time.LocalDate r0 = r7.f18055a
            j$.time.LocalDate r8 = r0.c(r8, r10)
            j$.time.chrono.F r8 = r7.a0(r8)
            return r8
        L_0x006f:
            j$.time.LocalDate r8 = r7.f18055a
            int r9 = r7.Y()
            int r1 = r1 - r9
            int r1 = r1 + 1911
            j$.time.LocalDate r8 = r8.q0(r1)
            j$.time.chrono.F r8 = r7.a0(r8)
            return r8
        L_0x0081:
            j$.time.LocalDate r8 = r7.f18055a
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.q0(r2)
            j$.time.chrono.F r8 = r7.a0(r8)
            return r8
        L_0x008e:
            j$.time.LocalDate r8 = r7.f18055a
            int r9 = r7.Y()
            if (r9 < r1) goto L_0x0099
            int r2 = r2 + 1911
            goto L_0x009c
        L_0x0099:
            int r1 = r1 - r2
            int r2 = r1 + 1911
        L_0x009c:
            j$.time.LocalDate r8 = r8.q0(r2)
            j$.time.chrono.F r8 = r7.a0(r8)
            return r8
        L_0x00a5:
            j$.time.chrono.ChronoLocalDate r8 = super.c((long) r8, (j$.time.temporal.o) r10)
            j$.time.chrono.F r8 = (j$.time.chrono.F) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.F.c(long, j$.time.temporal.o):j$.time.chrono.F");
    }

    public final o a() {
        return D.f18053d;
    }

    public final ChronoLocalDate d(long j10, q qVar) {
        return (F) super.d(j10, qVar);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final Temporal m23d(long j10, q qVar) {
        return (F) super.d(j10, qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return this.f18055a.equals(((F) obj).f18055a);
        }
        return false;
    }

    public final ChronoLocalDate g(long j10, ChronoUnit chronoUnit) {
        return (F) super.g(j10, chronoUnit);
    }

    /* renamed from: g  reason: collision with other method in class */
    public final Temporal m24g(long j10, ChronoUnit chronoUnit) {
        return (F) super.g(j10, chronoUnit);
    }

    public final long h(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i10 = E.f18054a[((a) oVar).ordinal()];
        int i11 = 1;
        if (i10 == 4) {
            int Y = Y();
            if (Y < 1) {
                Y = 1 - Y;
            }
            return (long) Y;
        } else if (i10 == 5) {
            return ((((long) Y()) * 12) + ((long) this.f18055a.Y())) - 1;
        } else {
            if (i10 == 6) {
                return (long) Y();
            }
            if (i10 != 7) {
                return this.f18055a.h(oVar);
            }
            if (Y() < 1) {
                i11 = 0;
            }
            return (long) i11;
        }
    }

    public final int hashCode() {
        D.f18053d.getClass();
        return -1990173233 ^ this.f18055a.hashCode();
    }

    public final Temporal n(LocalDate localDate) {
        return (F) super.n(localDate);
    }

    public final s o(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.n(this);
        }
        if (C0338e.j(this, oVar)) {
            a aVar = (a) oVar;
            int i10 = E.f18054a[aVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return this.f18055a.o(oVar);
            }
            if (i10 != 4) {
                return D.f18053d.w(aVar);
            }
            s o10 = a.YEAR.o();
            return s.j(1, Y() <= 0 ? (-o10.e()) + 1 + 1911 : o10.d() - 1911);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
    }
}
