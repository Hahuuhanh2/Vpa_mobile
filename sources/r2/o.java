package r2;

import androidx.lifecycle.p;
import java.util.Iterator;
import java.util.Map;
import o.b;
import v.w;

/* compiled from: MediatorLiveData */
public class o<T> extends p<T> {

    /* renamed from: l  reason: collision with root package name */
    public b<p<?>, a<?>> f14484l = new b<>();

    /* compiled from: MediatorLiveData */
    public static class a<V> implements q<V> {

        /* renamed from: a  reason: collision with root package name */
        public final p<V> f14485a;

        /* renamed from: b  reason: collision with root package name */
        public final q<? super V> f14486b;

        /* renamed from: c  reason: collision with root package name */
        public int f14487c = -1;

        public a(p pVar, w wVar) {
            this.f14485a = pVar;
            this.f14486b = wVar;
        }

        public final void a() {
            this.f14485a.f(this);
        }

        public final void b(V v2) {
            int i10 = this.f14487c;
            int i11 = this.f14485a.f2801g;
            if (i10 != i11) {
                this.f14487c = i11;
                this.f14486b.b(v2);
            }
        }
    }

    public final void g() {
        Iterator<Map.Entry<p<?>, a<?>>> it = this.f14484l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                ((a) ((Map.Entry) eVar.next()).getValue()).a();
            } else {
                return;
            }
        }
    }

    public final void h() {
        Iterator<Map.Entry<p<?>, a<?>>> it = this.f14484l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f14485a.i(aVar);
            } else {
                return;
            }
        }
    }
}
