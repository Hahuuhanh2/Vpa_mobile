package ol;

import nl.e;
import nl.g;
import nl.k;
import ol.a;
import p3.l0;
import rl.d;
import rl.f;
import rl.h;
import rl.i;
import rl.j;

/* compiled from: ChronoLocalDateTime */
public abstract class b<D extends a> extends ql.a implements f, Comparable<b<?>> {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (compareTo((b) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return w().hashCode() ^ x().hashCode();
    }

    public d i(d dVar) {
        return dVar.b(w().toEpochDay(), rl.a.EPOCH_DAY).b(x().D(), rl.a.NANO_OF_DAY);
    }

    public <R> R o(i<R> iVar) {
        if (iVar == h.f22840b) {
            return w().t();
        }
        if (iVar == h.f22841c) {
            return rl.b.NANOS;
        }
        if (iVar == h.f22844f) {
            return e.G(w().toEpochDay());
        }
        if (iVar == h.f22845g) {
            return x();
        }
        if (iVar == h.f22842d || iVar == h.f22839a || iVar == h.f22843e) {
            return null;
        }
        return super.o(iVar);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ol.b, ol.b<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(ol.b<?> r3) {
        /*
            r2 = this;
            ol.a r0 = r2.w()
            ol.a r1 = r3.w()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0030
            nl.g r0 = r2.x()
            nl.g r1 = r3.x()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0030
            ol.a r0 = r2.w()
            ol.f r0 = r0.t()
            ol.a r3 = r3.w()
            ol.f r3 = r3.t()
            r0.compareTo(r3)
            r0 = 0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.b.compareTo(ol.b):int");
    }

    /* renamed from: t */
    public b p(long j10, rl.b bVar) {
        return w().t().j(super.p(j10, bVar));
    }

    public String toString() {
        return w().toString() + 'T' + x().toString();
    }

    /* renamed from: u */
    public abstract b<D> j(long j10, j jVar);

    public final long v(k kVar) {
        l0.y0(kVar, "offset");
        return ((w().toEpochDay() * 86400) + ((long) x().E())) - ((long) kVar.f21779b);
    }

    public abstract D w();

    public abstract g x();

    /* renamed from: y */
    public abstract b b(long j10, rl.g gVar);

    /* renamed from: z */
    public b q(e eVar) {
        return w().t().j(eVar.i(this));
    }
}
