package nl;

import java.io.Serializable;
import n0.l;
import nl.a;
import org.threeten.bp.DateTimeException;
import p3.l0;
import ql.a;
import rl.b;
import rl.d;
import rl.f;
import rl.g;
import rl.h;
import rl.j;
import rl.k;
import sl.f;

/* compiled from: OffsetDateTime */
public final class i extends a implements f, Comparable<i>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f21771a;

    /* renamed from: b  reason: collision with root package name */
    public final k f21772b;

    static {
        f fVar = f.f21757c;
        k kVar = k.f21778o;
        fVar.getClass();
        new i(fVar, kVar);
        f fVar2 = f.f21758d;
        k kVar2 = k.f21777n;
        fVar2.getClass();
        new i(fVar2, kVar2);
    }

    public i(f fVar, k kVar) {
        l0.y0(fVar, "dateTime");
        this.f21771a = fVar;
        l0.y0(kVar, "offset");
        this.f21772b = kVar;
    }

    public static i s() {
        a.C0293a aVar = new a.C0293a(j.t());
        long currentTimeMillis = System.currentTimeMillis();
        d dVar = d.f21749c;
        long j10 = (long) 1000;
        d s10 = d.s(((int) (((currentTimeMillis % j10) + j10) % j10)) * 1000000, l0.T(currentTimeMillis, 1000));
        return t(s10, aVar.f21741a.s().a(s10));
    }

    public static i t(d dVar, k kVar) {
        l0.y0(dVar, "instant");
        l0.y0(kVar, "zone");
        k kVar2 = new f.a(kVar).f22960a;
        return new i(f.E(dVar.f21750a, dVar.f21751b, kVar2), kVar2);
    }

    public final d b(long j10, g gVar) {
        if (!(gVar instanceof rl.a)) {
            return (i) gVar.i(this, j10);
        }
        rl.a aVar = (rl.a) gVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 28) {
            return t(d.u(j10, (long) this.f21771a.f21760b.f21767d), this.f21772b);
        }
        if (ordinal != 29) {
            return v(this.f21771a.y(j10, gVar), this.f21772b);
        }
        return v(this.f21771a, k.w(aVar.k(j10)));
    }

    public final long c(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        int ordinal = ((rl.a) gVar).ordinal();
        if (ordinal == 28) {
            return this.f21771a.v(this.f21772b);
        }
        if (ordinal != 29) {
            return this.f21771a.c(gVar);
        }
        return (long) this.f21772b.f21779b;
    }

    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        if (this.f21772b.equals(iVar.f21772b)) {
            return this.f21771a.compareTo(iVar.f21771a);
        }
        int x10 = l0.x(this.f21771a.v(this.f21772b), iVar.f21771a.v(iVar.f21772b));
        if (x10 != 0) {
            return x10;
        }
        f fVar = this.f21771a;
        int i10 = fVar.f21760b.f21767d;
        f fVar2 = iVar.f21771a;
        int i11 = i10 - fVar2.f21760b.f21767d;
        if (i11 == 0) {
            return fVar.compareTo(fVar2);
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f21771a.equals(iVar.f21771a) || !this.f21772b.equals(iVar.f21772b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21771a.hashCode() ^ this.f21772b.f21779b;
    }

    public final d i(d dVar) {
        return dVar.b(this.f21771a.f21759a.toEpochDay(), rl.a.EPOCH_DAY).b(this.f21771a.f21760b.D(), rl.a.NANO_OF_DAY).b((long) this.f21772b.f21779b, rl.a.OFFSET_SECONDS);
    }

    public final int k(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return super.k(gVar);
        }
        int ordinal = ((rl.a) gVar).ordinal();
        if (ordinal == 28) {
            throw new DateTimeException(l.j("Field too large for an int: ", gVar));
        } else if (ordinal != 29) {
            return this.f21771a.k(gVar);
        } else {
            return this.f21772b.f21779b;
        }
    }

    public final k m(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        if (gVar == rl.a.INSTANT_SECONDS || gVar == rl.a.OFFSET_SECONDS) {
            return gVar.range();
        }
        return this.f21771a.m(gVar);
    }

    public final boolean n(g gVar) {
        if ((gVar instanceof rl.a) || (gVar != null && gVar.c(this))) {
            return true;
        }
        return false;
    }

    public final <R> R o(rl.i<R> iVar) {
        if (iVar == h.f22840b) {
            return ol.h.f22637a;
        }
        if (iVar == h.f22841c) {
            return b.NANOS;
        }
        if (iVar == h.f22843e || iVar == h.f22842d) {
            return this.f21772b;
        }
        if (iVar == h.f22844f) {
            return this.f21771a.f21759a;
        }
        if (iVar == h.f22845g) {
            return this.f21771a.f21760b;
        }
        if (iVar == h.f22839a) {
            return null;
        }
        return super.o(iVar);
    }

    public final d p(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return j(Long.MAX_VALUE, bVar).j(1, bVar);
        }
        return j(-j10, bVar);
    }

    public final d q(e eVar) {
        return v(this.f21771a.z(eVar), this.f21772b);
    }

    public final String toString() {
        return this.f21771a.toString() + this.f21772b.f21780c;
    }

    /* renamed from: u */
    public final i j(long j10, j jVar) {
        if (jVar instanceof b) {
            return v(this.f21771a.u(j10, jVar), this.f21772b);
        }
        return (i) jVar.b(this, j10);
    }

    public final i v(f fVar, k kVar) {
        if (this.f21771a != fVar || !this.f21772b.equals(kVar)) {
            return new i(fVar, kVar);
        }
        return this;
    }
}
