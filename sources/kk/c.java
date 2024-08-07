package kk;

import ik.d;
import ik.e;
import ik.f;
import sk.j;

/* compiled from: ContinuationImpl.kt */
public abstract class c extends a {
    private final f _context;
    private transient d<Object> intercepted;

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this._context = fVar;
    }

    public f getContext() {
        f fVar = this._context;
        j.c(fVar);
        return fVar;
    }

    public final d<Object> intercepted() {
        d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.a.f20651a);
            if (eVar == null || (dVar = eVar.h(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    public void releaseIntercepted() {
        d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            f context = getContext();
            int i10 = e.f20650k;
            f.b bVar = context.get(e.a.f20651a);
            j.c(bVar);
            ((e) bVar).R(dVar);
        }
        this.intercepted = b.f20837a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
