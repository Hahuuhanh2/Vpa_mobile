package ol;

import java.io.Serializable;
import java.util.List;
import nl.c;
import nl.d;
import nl.f;
import nl.j;
import nl.k;
import ol.a;
import p3.l0;
import rl.b;
import rl.g;

/* compiled from: ChronoZonedDateTimeImpl */
public final class e<D extends a> extends d<D> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final c<D> f22634a;

    /* renamed from: b  reason: collision with root package name */
    public final k f22635b;

    /* renamed from: c  reason: collision with root package name */
    public final j f22636c;

    public e(j jVar, k kVar, c cVar) {
        l0.y0(cVar, "dateTime");
        this.f22634a = cVar;
        this.f22635b = kVar;
        l0.y0(jVar, "zone");
        this.f22636c = jVar;
    }

    public static <R extends a> e<R> C(f fVar, d dVar, j jVar) {
        k a10 = jVar.s().a(dVar);
        l0.y0(a10, "offset");
        return new e<>(jVar, a10, (c) fVar.p(f.E(dVar.f21750a, dVar.f21751b, a10)));
    }

    /* renamed from: A */
    public final d b(long j10, g gVar) {
        if (!(gVar instanceof rl.a)) {
            return x().t().k(gVar.i(this, j10));
        }
        rl.a aVar = (rl.a) gVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 28) {
            return j(j10 - toEpochSecond(), b.SECONDS);
        }
        if (ordinal != 29) {
            c C = this.f22634a.y(j10, gVar);
            j jVar = this.f22636c;
            k kVar = this.f22635b;
            l0.y0(jVar, "zone");
            if (jVar instanceof k) {
                return new e(jVar, (k) jVar, C);
            }
            sl.f s10 = jVar.s();
            f B = f.B(C);
            List<k> c10 = s10.c(B);
            if (c10.size() == 1) {
                kVar = c10.get(0);
            } else if (c10.size() == 0) {
                sl.d b10 = s10.b(B);
                C = C.B(C.f22632a, 0, 0, c.b(0, (long) (b10.f22950c.f21779b - b10.f22949b.f21779b)).f21747a, 0);
                kVar = b10.f22950c;
            } else if (kVar == null || !c10.contains(kVar)) {
                kVar = c10.get(0);
            }
            l0.y0(kVar, "offset");
            return new e(jVar, kVar, C);
        }
        k w9 = k.w(aVar.k(j10));
        c<D> cVar = this.f22634a;
        return C(x().t(), d.u(cVar.v(w9), (long) cVar.x().f21767d), this.f22636c);
    }

    public final boolean equals(Object obj) {
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

    public final int hashCode() {
        return (this.f22634a.hashCode() ^ this.f22635b.f21779b) ^ Integer.rotateLeft(this.f22636c.hashCode(), 3);
    }

    public final boolean n(g gVar) {
        if ((gVar instanceof rl.a) || (gVar != null && gVar.c(this))) {
            return true;
        }
        return false;
    }

    public final k t() {
        return this.f22635b;
    }

    public final String toString() {
        String str = this.f22634a.toString() + this.f22635b.f21780c;
        if (this.f22635b == this.f22636c) {
            return str;
        }
        return str + '[' + this.f22636c.toString() + ']';
    }

    public final j u() {
        return this.f22636c;
    }

    /* renamed from: w */
    public final d<D> j(long j10, rl.j jVar) {
        if (jVar instanceof b) {
            return q(this.f22634a.u(j10, jVar));
        }
        return x().t().k(jVar.b(this, j10));
    }

    public final b<D> y() {
        return this.f22634a;
    }
}
