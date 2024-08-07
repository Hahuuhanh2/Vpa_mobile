package ol;

import n0.l;
import nl.e;
import nl.j;
import ol.a;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import rl.b;
import rl.f;
import rl.g;
import rl.h;
import rl.i;
import rl.k;

/* compiled from: ChronoZonedDateTime */
public abstract class d<D extends a> extends ql.a implements Comparable<d<?>> {
    /* renamed from: A */
    public abstract d b(long j10, g gVar);

    /* renamed from: B */
    public d<D> q(f fVar) {
        return x().t().k(fVar.i(this));
    }

    public long c(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.j(this);
        }
        int ordinal = ((rl.a) gVar).ordinal();
        if (ordinal == 28) {
            return toEpochSecond();
        }
        if (ordinal != 29) {
            return y().c(gVar);
        }
        return (long) t().f21779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (compareTo((d) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (y().hashCode() ^ t().f21779b) ^ Integer.rotateLeft(u().hashCode(), 3);
    }

    public int k(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return super.k(gVar);
        }
        int ordinal = ((rl.a) gVar).ordinal();
        if (ordinal == 28) {
            throw new UnsupportedTemporalTypeException(l.j("Field too large for an int: ", gVar));
        } else if (ordinal != 29) {
            return y().k(gVar);
        } else {
            return t().f21779b;
        }
    }

    public k m(g gVar) {
        if (!(gVar instanceof rl.a)) {
            return gVar.b(this);
        }
        if (gVar == rl.a.INSTANT_SECONDS || gVar == rl.a.OFFSET_SECONDS) {
            return gVar.range();
        }
        return y().m(gVar);
    }

    public <R> R o(i<R> iVar) {
        if (iVar == h.f22839a || iVar == h.f22842d) {
            return u();
        }
        if (iVar == h.f22840b) {
            return x().t();
        }
        if (iVar == h.f22841c) {
            return b.NANOS;
        }
        if (iVar == h.f22843e) {
            return t();
        }
        if (iVar == h.f22844f) {
            return e.G(x().toEpochDay());
        }
        if (iVar == h.f22845g) {
            return z();
        }
        return super.o(iVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [ol.d, ol.d<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(ol.d<?> r5) {
        /*
            r4 = this;
            long r0 = r4.toEpochSecond()
            long r2 = r5.toEpochSecond()
            int r0 = p3.l0.x(r0, r2)
            if (r0 != 0) goto L_0x0055
            nl.g r0 = r4.z()
            int r0 = r0.f21767d
            nl.g r1 = r5.z()
            int r1 = r1.f21767d
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0055
            ol.b r0 = r4.y()
            ol.b r1 = r5.y()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0055
            nl.j r0 = r4.u()
            java.lang.String r0 = r0.getId()
            nl.j r1 = r5.u()
            java.lang.String r1 = r1.getId()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0055
            ol.a r0 = r4.x()
            ol.f r0 = r0.t()
            ol.a r5 = r5.x()
            ol.f r5 = r5.t()
            int r0 = r0.compareTo(r5)
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.d.compareTo(ol.d):int");
    }

    public abstract nl.k t();

    public final long toEpochSecond() {
        return ((x().toEpochDay() * 86400) + ((long) z().E())) - ((long) t().f21779b);
    }

    public String toString() {
        String str = y().toString() + t().f21780c;
        if (t() == u()) {
            return str;
        }
        return str + '[' + u().toString() + ']';
    }

    public abstract j u();

    /* renamed from: v */
    public d p(long j10, b bVar) {
        return x().t().k(super.p(j10, bVar));
    }

    /* renamed from: w */
    public abstract d<D> j(long j10, rl.j jVar);

    public D x() {
        return y().w();
    }

    public abstract b<D> y();

    public nl.g z() {
        return y().x();
    }
}
