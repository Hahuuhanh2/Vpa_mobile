package nl;

import java.io.Serializable;
import ol.b;
import org.threeten.bp.DateTimeException;
import p3.l0;
import rl.a;
import rl.d;
import rl.e;
import rl.g;
import rl.h;
import rl.i;
import rl.j;
import rl.k;

/* compiled from: LocalDateTime */
public final class f extends b<e> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final f f21757c = D(e.f21752d, g.f21761e);

    /* renamed from: d  reason: collision with root package name */
    public static final f f21758d = D(e.f21753e, g.f21762f);

    /* renamed from: a  reason: collision with root package name */
    public final e f21759a;

    /* renamed from: b  reason: collision with root package name */
    public final g f21760b;

    public f(e eVar, g gVar) {
        this.f21759a = eVar;
        this.f21760b = gVar;
    }

    public static f B(e eVar) {
        if (eVar instanceof f) {
            return (f) eVar;
        }
        if (eVar instanceof m) {
            return ((m) eVar).f21784a;
        }
        try {
            return new f(e.B(eVar), g.u(eVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static f D(e eVar, g gVar) {
        l0.y0(eVar, "date");
        l0.y0(gVar, "time");
        return new f(eVar, gVar);
    }

    public static f E(long j10, int i10, k kVar) {
        l0.y0(kVar, "offset");
        long j11 = j10 + ((long) kVar.f21779b);
        long j12 = (long) 86400;
        return new f(e.G(l0.T(j11, 86400)), g.x(i10, (long) ((int) (((j11 % j12) + j12) % j12))));
    }

    public final int A(f fVar) {
        int z10 = this.f21759a.z(fVar.f21759a);
        if (z10 == 0) {
            return this.f21760b.compareTo(fVar.f21760b);
        }
        return z10;
    }

    public final boolean C(f fVar) {
        if (!(fVar instanceof f)) {
            int i10 = (this.f21759a.toEpochDay() > fVar.f21759a.toEpochDay() ? 1 : (this.f21759a.toEpochDay() == fVar.f21759a.toEpochDay() ? 0 : -1));
            if (i10 < 0 || (i10 == 0 && this.f21760b.D() < fVar.f21760b.D())) {
                return true;
            }
            return false;
        } else if (A(fVar) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: F */
    public final f u(long j10, j jVar) {
        long j11 = j10;
        j jVar2 = jVar;
        if (!(jVar2 instanceof rl.b)) {
            return (f) jVar2.b(this, j11);
        }
        switch (((rl.b) jVar2).ordinal()) {
            case 0:
                return H(this.f21759a, 0, 0, 0, j10);
            case 1:
                f K = K(this.f21759a.I(j11 / 86400000000L), this.f21760b);
                return K.H(K.f21759a, 0, 0, 0, (j11 % 86400000000L) * 1000);
            case 2:
                f K2 = K(this.f21759a.I(j11 / 86400000), this.f21760b);
                return K2.H(K2.f21759a, 0, 0, 0, (j11 % 86400000) * 1000000);
            case 3:
                return G(j10);
            case 4:
                return H(this.f21759a, 0, j10, 0, 0);
            case 5:
                return H(this.f21759a, j10, 0, 0, 0);
            case 6:
                f K3 = K(this.f21759a.I(j11 / 256), this.f21760b);
                return K3.H(K3.f21759a, (j11 % 256) * 12, 0, 0, 0);
            default:
                return K(this.f21759a.w(j11, jVar2), this.f21760b);
        }
    }

    public final f G(long j10) {
        return H(this.f21759a, 0, 0, j10, 0);
    }

    public final f H(e eVar, long j10, long j11, long j12, long j13) {
        g gVar;
        e eVar2 = eVar;
        if ((j10 | j11 | j12 | j13) == 0) {
            return K(eVar2, this.f21760b);
        }
        long j14 = j11 / 1440;
        long j15 = j10 / 24;
        long j16 = j15 + j14 + (j12 / 86400) + (j13 / 86400000000000L);
        long j17 = (long) 1;
        long j18 = (j11 % 1440) * 60000000000L;
        long j19 = ((j10 % 24) * 3600000000000L) + j18 + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long D = this.f21760b.D();
        long j20 = (j19 * j17) + D;
        long T = l0.T(j20, 86400000000000L) + (j16 * j17);
        long j21 = ((j20 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j21 == D) {
            gVar = this.f21760b;
        } else {
            gVar = g.w(j21);
        }
        return K(eVar2.I(T), gVar);
    }

    /* renamed from: I */
    public final f y(long j10, g gVar) {
        if (!(gVar instanceof a)) {
            return (f) gVar.i(this, j10);
        }
        if (gVar.isTimeBased()) {
            return K(this.f21759a, this.f21760b.b(j10, gVar));
        }
        return K(this.f21759a.y(j10, gVar), this.f21760b);
    }

    /* renamed from: J */
    public final f z(e eVar) {
        return K(eVar, this.f21760b);
    }

    public final f K(e eVar, g gVar) {
        if (this.f21759a == eVar && this.f21760b == gVar) {
            return this;
        }
        return new f(eVar, gVar);
    }

    public final long c(g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.j(this);
        }
        if (gVar.isTimeBased()) {
            return this.f21760b.c(gVar);
        }
        return this.f21759a.c(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f21759a.equals(fVar.f21759a) || !this.f21760b.equals(fVar.f21760b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21759a.hashCode() ^ this.f21760b.hashCode();
    }

    public final d i(d dVar) {
        return super.i(dVar);
    }

    public final int k(g gVar) {
        if (!(gVar instanceof a)) {
            return super.k(gVar);
        }
        if (gVar.isTimeBased()) {
            return this.f21760b.k(gVar);
        }
        return this.f21759a.k(gVar);
    }

    public final k m(g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.b(this);
        }
        if (gVar.isTimeBased()) {
            return this.f21760b.m(gVar);
        }
        return this.f21759a.m(gVar);
    }

    public final boolean n(g gVar) {
        if (gVar instanceof a) {
            if (gVar.isDateBased() || gVar.isTimeBased()) {
                return true;
            }
            return false;
        } else if (gVar == null || !gVar.c(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22844f) {
            return this.f21759a;
        }
        return super.o(iVar);
    }

    public final d p(long j10, rl.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return u(Long.MAX_VALUE, bVar).u(1, bVar);
        }
        return u(-j10, bVar);
    }

    /* renamed from: s */
    public final int compareTo(b<?> bVar) {
        if (bVar instanceof f) {
            return A((f) bVar);
        }
        return super.compareTo(bVar);
    }

    public final b t(long j10, rl.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return u(Long.MAX_VALUE, bVar).u(1, bVar);
        }
        return u(-j10, bVar);
    }

    public final String toString() {
        return this.f21759a.toString() + 'T' + this.f21760b.toString();
    }

    public final ol.a w() {
        return this.f21759a;
    }

    public final g x() {
        return this.f21760b;
    }
}
