package x2;

import c3.f;
import sk.j;

/* compiled from: EntityDeletionOrUpdateAdapter.kt */
public abstract class d extends r {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(n nVar, int i10) {
        super(nVar);
        if (i10 != 1) {
            j.f(nVar, "database");
            return;
        }
        j.f(nVar, "database");
        super(nVar);
    }

    public abstract void e(f fVar, Object obj);

    public final void f(Object obj) {
        f a10 = a();
        try {
            e(a10, obj);
            a10.L0();
        } finally {
            d(a10);
        }
    }
}
