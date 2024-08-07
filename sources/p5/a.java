package p5;

import android.util.Log;
import p5.d;

/* compiled from: FactoryPools */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0178a f14074a = new C0178a();

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* compiled from: FactoryPools */
    public class C0178a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    /* compiled from: FactoryPools */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools */
    public static final class c<T> implements v1.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f14075a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f14076b;

        /* renamed from: c  reason: collision with root package name */
        public final v1.d<T> f14077c;

        public c(v1.e eVar, b bVar, e eVar2) {
            this.f14077c = eVar;
            this.f14075a = bVar;
            this.f14076b = eVar2;
        }

        public final boolean a(T t10) {
            if (t10 instanceof d) {
                ((d) t10).j().f14078a = true;
            }
            this.f14076b.a(t10);
            return this.f14077c.a(t10);
        }

        public final T b() {
            T b10 = this.f14077c.b();
            if (b10 == null) {
                b10 = this.f14075a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b10.getClass().toString();
                }
            }
            if (b10 instanceof d) {
                ((d) b10).j().f14078a = false;
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools */
    public interface d {
        d.a j();
    }

    /* compiled from: FactoryPools */
    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i10, b bVar) {
        return new c(new v1.e(i10), bVar, f14074a);
    }
}
