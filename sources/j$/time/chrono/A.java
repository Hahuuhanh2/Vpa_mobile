package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.b;
import j$.time.e;
import j$.time.k;
import j$.time.r;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class A extends C0340g {

    /* renamed from: d  reason: collision with root package name */
    static final LocalDate f18043d = LocalDate.f0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient LocalDate f18044a;

    /* renamed from: b  reason: collision with root package name */
    private transient B f18045b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f18046c;

    A(LocalDate localDate) {
        if (!localDate.a0(f18043d)) {
            this.f18045b = B.k(localDate);
            this.f18046c = (localDate.getYear() - this.f18045b.p().getYear()) + 1;
            this.f18044a = localDate;
            return;
        }
        throw new e("JapaneseDate before Meiji 6 is not supported");
    }

    A(B b10, int i10, LocalDate localDate) {
        if (!localDate.a0(f18043d)) {
            this.f18045b = b10;
            this.f18046c = i10;
            this.f18044a = localDate;
            return;
        }
        throw new e("JapaneseDate before Meiji 6 is not supported");
    }

    private A b0(LocalDate localDate) {
        return localDate.equals(this.f18044a) ? this : new A(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 4, this);
    }

    public final ChronoLocalDate C(r rVar) {
        return (A) super.C(rVar);
    }

    public final long I() {
        return this.f18044a.I();
    }

    public final C0341h J(k kVar) {
        return C0343j.V(this, kVar);
    }

    public final p M() {
        return this.f18045b;
    }

    public final int Q() {
        B q10 = this.f18045b.q();
        int Q = (q10 == null || q10.p().getYear() != this.f18044a.getYear()) ? this.f18044a.Q() : q10.p().X() - 1;
        return this.f18046c == 1 ? Q - (this.f18045b.p().X() - 1) : Q;
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate V(long j10) {
        return b0(this.f18044a.plusDays(j10));
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate W(long j10) {
        return b0(this.f18044a.k0(j10));
    }

    /* access modifiers changed from: package-private */
    public final ChronoLocalDate X(long j10) {
        return b0(this.f18044a.l0(j10));
    }

    public final B Y() {
        return this.f18045b;
    }

    /* renamed from: Z */
    public final A d(long j10, q qVar) {
        return (A) super.d(j10, qVar);
    }

    public final o a() {
        return y.f18103d;
    }

    /* renamed from: a0 */
    public final A c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return (A) super.c(j10, oVar);
        }
        a aVar = (a) oVar;
        if (h(aVar) == j10) {
            return this;
        }
        int[] iArr = z.f18104a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 3 || i10 == 8 || i10 == 9) {
            y yVar = y.f18103d;
            int a10 = yVar.w(aVar).a(j10, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 3) {
                return b0(this.f18044a.q0(yVar.B(this.f18045b, a10)));
            } else if (i11 == 8) {
                return b0(this.f18044a.q0(yVar.B(B.r(a10), this.f18046c)));
            } else if (i11 == 9) {
                return b0(this.f18044a.q0(a10));
            }
        }
        return b0(this.f18044a.c(j10, oVar));
    }

    /* renamed from: c0 */
    public final A n(j$.time.temporal.k kVar) {
        return (A) super.n(kVar);
    }

    public final boolean e(o oVar) {
        if (oVar == a.ALIGNED_DAY_OF_WEEK_IN_MONTH || oVar == a.ALIGNED_DAY_OF_WEEK_IN_YEAR || oVar == a.ALIGNED_WEEK_OF_MONTH || oVar == a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return oVar instanceof a ? oVar.isDateBased() : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f18044a.equals(((A) obj).f18044a);
        }
        return false;
    }

    public final ChronoLocalDate g(long j10, ChronoUnit chronoUnit) {
        return (A) super.g(j10, chronoUnit);
    }

    /* renamed from: g  reason: collision with other method in class */
    public final Temporal m22g(long j10, ChronoUnit chronoUnit) {
        return (A) super.g(j10, chronoUnit);
    }

    public final long h(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        switch (z.f18104a[((a) oVar).ordinal()]) {
            case 2:
                return this.f18046c == 1 ? (long) ((this.f18044a.X() - this.f18045b.p().X()) + 1) : (long) this.f18044a.X();
            case 3:
                return (long) this.f18046c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
            case 8:
                return (long) this.f18045b.getValue();
            default:
                return this.f18044a.h(oVar);
        }
    }

    public final int hashCode() {
        y.f18103d.getClass();
        return -688086063 ^ this.f18044a.hashCode();
    }

    public final s o(o oVar) {
        long j10;
        int i10;
        if (!(oVar instanceof a)) {
            return oVar.n(this);
        }
        if (e(oVar)) {
            a aVar = (a) oVar;
            int i11 = z.f18104a[aVar.ordinal()];
            if (i11 == 1) {
                i10 = this.f18044a.b0();
            } else if (i11 == 2) {
                i10 = Q();
            } else if (i11 != 3) {
                return y.f18103d.w(aVar);
            } else {
                int year = this.f18045b.p().getYear();
                B q10 = this.f18045b.q();
                j10 = (long) (q10 != null ? (q10.p().getYear() - year) + 1 : 999999999 - year);
                return s.j(1, j10);
            }
            j10 = (long) i10;
            return s.j(1, j10);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", oVar));
    }
}
