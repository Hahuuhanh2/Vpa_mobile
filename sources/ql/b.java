package ql;

import n0.l;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import rl.a;
import rl.e;
import rl.g;
import rl.h;
import rl.i;
import rl.k;

/* compiled from: DefaultInterfaceTemporalAccessor */
public abstract class b implements e {
    public int k(g gVar) {
        return m(gVar).a(c(gVar), gVar);
    }

    public k m(g gVar) {
        if (!(gVar instanceof a)) {
            return gVar.b(this);
        }
        if (n(gVar)) {
            return gVar.range();
        }
        throw new UnsupportedTemporalTypeException(l.j("Unsupported field: ", gVar));
    }

    public <R> R o(i<R> iVar) {
        if (iVar == h.f22839a || iVar == h.f22840b || iVar == h.f22841c) {
            return null;
        }
        return iVar.a(this);
    }
}
