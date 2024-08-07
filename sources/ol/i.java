package ol;

import n0.l;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import rl.a;
import rl.b;
import rl.d;
import rl.g;
import rl.h;
import rl.k;

/* compiled from: IsoEra */
public enum i implements g {
    BCE,
    CE;

    public final long c(g gVar) {
        if (gVar == a.ERA) {
            return (long) ordinal();
        }
        if (!(gVar instanceof a)) {
            return gVar.j(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final d i(d dVar) {
        return dVar.b((long) ordinal(), a.ERA);
    }

    public final int k(g gVar) {
        if (gVar == a.ERA) {
            return ordinal();
        }
        return m(gVar).a(c(gVar), gVar);
    }

    public final k m(g gVar) {
        if (gVar == a.ERA) {
            return gVar.range();
        }
        if (!(gVar instanceof a)) {
            return gVar.b(this);
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public final boolean n(g gVar) {
        if (gVar instanceof a) {
            if (gVar == a.ERA) {
                return true;
            }
            return false;
        } else if (gVar == null || !gVar.c(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final <R> R o(rl.i<R> iVar) {
        if (iVar == h.f22841c) {
            return b.ERAS;
        }
        if (iVar == h.f22840b || iVar == h.f22842d || iVar == h.f22839a || iVar == h.f22843e || iVar == h.f22844f || iVar == h.f22845g) {
            return null;
        }
        return iVar.a(this);
    }
}
