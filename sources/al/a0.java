package al;

import ik.b;
import ik.d;
import ik.e;
import ik.f;
import ik.g;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: CoroutineDispatcher.kt */
public abstract class a0 extends ik.a implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18987b = new a();

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<e, a0> {

        /* renamed from: al.a0$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineDispatcher.kt */
        public static final class C0255a extends k implements l<f.b, a0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0255a f18988a = new C0255a();

            public C0255a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                f.b bVar = (f.b) obj;
                if (bVar instanceof a0) {
                    return (a0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f20651a, C0255a.f18988a);
        }
    }

    public a0() {
        super(e.a.f20651a);
    }

    public final void R(d<?> dVar) {
        l lVar;
        fl.f fVar = (fl.f) dVar;
        do {
        } while (fl.f.f20227o.get(fVar) == g0.f19023f);
        Object obj = fl.f.f20227o.get(fVar);
        if (obj instanceof l) {
            lVar = (l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.p();
        }
    }

    public void U(f fVar, Runnable runnable) {
        s(fVar, runnable);
    }

    public boolean W(f fVar) {
        return !(this instanceof c2);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        boolean z10;
        j.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f20644a;
            j.f(cVar2, "key");
            if (cVar2 == bVar || bVar.f20646b == cVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                E e10 = (f.b) bVar.f20645a.invoke(this);
                if (e10 instanceof f.b) {
                    return e10;
                }
            }
        } else if (e.a.f20651a == cVar) {
            return this;
        }
        return null;
    }

    public final fl.f h(d dVar) {
        return new fl.f(this, dVar);
    }

    public final f minusKey(f.c<?> cVar) {
        boolean z10;
        j.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f20644a;
            j.f(cVar2, "key");
            if (cVar2 == bVar || bVar.f20646b == cVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && ((f.b) bVar.f20645a.invoke(this)) != null) {
                return g.f20653a;
            }
        } else if (e.a.f20651a == cVar) {
            return g.f20653a;
        }
        return this;
    }

    public abstract void s(f fVar, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.T(this);
    }
}
