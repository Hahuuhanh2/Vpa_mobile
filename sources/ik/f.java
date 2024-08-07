package ik;

import ik.e;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: CoroutineContext.kt */
public interface f {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* renamed from: ik.f$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        public static final class C0288a extends k implements p<f, b, f> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0288a f20652a = new C0288a();

            public C0288a() {
                super(2);
            }

            public final Object invoke(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                j.f(fVar, "acc");
                j.f(bVar, "element");
                f minusKey = fVar.minusKey(bVar.getKey());
                g gVar = g.f20653a;
                if (minusKey == gVar) {
                    return bVar;
                }
                int i10 = e.f20650k;
                e.a aVar = e.a.f20651a;
                e eVar = (e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new c(bVar, minusKey);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new c(eVar, bVar);
                    }
                    cVar = new c(eVar, new c(bVar, minusKey2));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            j.f(fVar2, "context");
            if (fVar2 == g.f20653a) {
                return fVar;
            }
            return (f) fVar2.fold(fVar, C0288a.f20652a);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends f {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <E extends b> E a(b bVar, c<E> cVar) {
                j.f(cVar, "key");
                if (j.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                j.f(cVar, "key");
                if (j.a(bVar.getKey(), cVar)) {
                    return g.f20653a;
                }
                return bVar;
            }
        }

        <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        f minusKey(c<?> cVar);
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
