package e9;

import java.security.GeneralSecurityException;
import java.util.List;
import w8.n;
import w8.o;

/* compiled from: ChunkedMacWrapper */
public final class f implements o<e, e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9287a = new f();

    /* compiled from: ChunkedMacWrapper */
    public static class a implements e {
        public a(int i10) {
        }
    }

    public final Class<e> a() {
        return e.class;
    }

    public final Class<e> b() {
        return e.class;
    }

    public final Object c(n nVar) {
        if (nVar.f16730b != null) {
            for (List<n.b<P>> it : nVar.f16729a.values()) {
                for (n.b bVar : it) {
                    e eVar = (e) bVar.f16736a;
                }
            }
            return new a(0);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
