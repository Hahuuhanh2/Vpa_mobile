package f6;

import c6.b;
import c6.e;
import c6.g;
import java.util.Set;

/* compiled from: TransportFactoryImpl */
public final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f10021a;

    /* renamed from: b  reason: collision with root package name */
    public final s f10022b;

    /* renamed from: c  reason: collision with root package name */
    public final v f10023c;

    public t(Set set, j jVar, v vVar) {
        this.f10021a = set;
        this.f10022b = jVar;
        this.f10023c = vVar;
    }

    public final u a(String str, b bVar, e eVar) {
        if (this.f10021a.contains(bVar)) {
            return new u(this.f10022b, str, bVar, eVar, this.f10023c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f10021a}));
    }
}
