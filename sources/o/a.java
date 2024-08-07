package o;

import java.util.HashMap;
import o.b;

/* compiled from: FastSafeIterableMap */
public final class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f13599e = new HashMap<>();

    public final b.c<K, V> g(K k10) {
        return this.f13599e.get(k10);
    }

    public final V i(K k10, V v2) {
        b.c g2 = g(k10);
        if (g2 != null) {
            return g2.f13605b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f13599e;
        b.c<K, V> cVar = new b.c<>(k10, v2);
        this.f13603d++;
        b.c<K, V> cVar2 = this.f13601b;
        if (cVar2 == null) {
            this.f13600a = cVar;
            this.f13601b = cVar;
        } else {
            cVar2.f13606c = cVar;
            cVar.f13607d = cVar2;
            this.f13601b = cVar;
        }
        hashMap.put(k10, cVar);
        return null;
    }

    public final V l(K k10) {
        V l10 = super.l(k10);
        this.f13599e.remove(k10);
        return l10;
    }
}
