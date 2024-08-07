package nl;

import java.io.Serializable;
import java.util.List;
import n0.l;
import ol.d;
import org.threeten.bp.DateTimeException;
import p3.l0;
import rl.a;
import rl.b;
import rl.g;
import rl.h;
import rl.i;
import rl.j;
import rl.k;
import sl.f;

/* compiled from: ZonedDateTime */
public final class m extends d<e> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f21784a;

    /* renamed from: b  reason: collision with root package name */
    public final k f21785b;

    /* renamed from: c  reason: collision with root package name */
    public final j f21786c;

    public m(f fVar, j jVar, k kVar) {
        this.f21784a = fVar;
        this.f21785b = kVar;
        this.f21786c = jVar;
    }

    public static m C(long j10, int i10, j jVar) {
        k a10 = jVar.s().a(d.u(j10, (long) i10));
        return new m(f.E(j10, i10, a10), jVar, a10);
    }

    public static m D(f fVar, j jVar, k kVar) {
        l0.y0(fVar, "localDateTime");
        l0.y0(jVar, "zone");
        if (jVar instanceof k) {
            return new m(fVar, jVar, (k) jVar);
        }
        f s10 = jVar.s();
        List<k> c10 = s10.c(fVar);
        if (c10.size() == 1) {
            kVar = c10.get(0);
        } else if (c10.size() == 0) {
            sl.d b10 = s10.b(fVar);
            fVar = fVar.G(c.b(0, (long) (b10.f22950c.f21779b - b10.f22949b.f21779b)).f21747a);
            kVar = b10.f22950c;
        } else if (kVar == null || !c10.contains(kVar)) {
            k kVar2 = c10.get(0);
            l0.y0(kVar2, "offset");
            kVar = kVar2;
        }
        return new m(fVar, jVar, kVar);
    }

    /* renamed from: E */
    public final m w(long j10, j jVar) {
        if (!(jVar instanceof b)) {
            return (m) jVar.b(this, j10);
        }
        if (jVar.isDateBased()) {
            return D(this.f21784a.u(j10, jVar), this.f21786c, this.f21785b);
        }
        f F = this.f21784a.u(j10, jVar);
        k kVar = this.f21785b;
        j jVar2 = this.f21786c;
        l0.y0(F, "localDateTime");
        l0.y0(kVar, "offset");
        l0.y0(jVar2, "zone");
        return C(F.v(kVar), F.f21760b.f21767d, jVar2);
    }

    public final m F(k kVar) {
        if (kVar.equals(this.f21785b) || !this.f21786c.s().e(this.f21784a, kVar)) {
            return this;
        }
        return new m(this.f21784a, this.f21786c, kVar);
    }

    /* renamed from: G */
    public final m b(long j10, g gVar) {
        if (!(gVar instanceof a)) {
            return (m) gVar.i(this, j10);
        }
        a aVar = (a) gVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 28) {
            return C(j10, this.f21784a.f21760b.f21767d, this.f21786c);
        }
        if (ordinal != 29) {
            return D(this.f21784a.y(j10, gVar), this.f21786c, this.f21785b);
        }
        return F(k.w(aVar.k(j10)));
    }

    /* renamed from: H */
    public final m q(e eVar) {
        return D(f.D(eVar, this.f21784a.f21760b), this.f21786c, this.f21785b);
    }

    public final long c(g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.j(this);
        }
        int ordinal = ((a) gVar).ordinal();
        if (ordinal == 28) {
            return toEpochSecond();
        }
        if (ordinal != 29) {
            return this.f21784a.c(gVar);
        }
        return (long) this.f21785b.f21779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f21784a.equals(mVar.f21784a) || !this.f21785b.equals(mVar.f21785b) || !this.f21786c.equals(mVar.f21786c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f21784a.hashCode() ^ this.f21785b.f21779b) ^ Integer.rotateLeft(this.f21786c.hashCode(), 3);
    }

    public final int k(g gVar) {
        if (!(gVar instanceof a)) {
            return super.k(gVar);
        }
        int ordinal = ((a) gVar).ordinal();
        if (ordinal == 28) {
            throw new DateTimeException(l.j("Field too large for an int: ", gVar));
        } else if (ordinal != 29) {
            return this.f21784a.k(gVar);
        } else {
            return this.f21785b.f21779b;
        }
    }

    public final k m(g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.b(this);
        }
        if (gVar == a.INSTANT_SECONDS || gVar == a.OFFSET_SECONDS) {
            return gVar.range();
        }
        return this.f21784a.m(gVar);
    }

    public final boolean n(g gVar) {
        if ((gVar instanceof a) || (gVar != null && gVar.c(this))) {
            return true;
        }
        return false;
    }

    public final <R> R o(i<R> iVar) {
        if (iVar == h.f22844f) {
            return this.f21784a.f21759a;
        }
        return super.o(iVar);
    }

    public final rl.d p(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return w(Long.MAX_VALUE, bVar).w(1, bVar);
        }
        return w(-j10, bVar);
    }

    public final k t() {
        return this.f21785b;
    }

    public final String toString() {
        String str = this.f21784a.toString() + this.f21785b.f21780c;
        if (this.f21785b == this.f21786c) {
            return str;
        }
        return str + '[' + this.f21786c.toString() + ']';
    }

    public final j u() {
        return this.f21786c;
    }

    public final d v(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return w(Long.MAX_VALUE, bVar).w(1, bVar);
        }
        return w(-j10, bVar);
    }

    public final ol.a x() {
        return this.f21784a.f21759a;
    }

    public final ol.b y() {
        return this.f21784a;
    }

    public final g z() {
        return this.f21784a.f21760b;
    }
}
