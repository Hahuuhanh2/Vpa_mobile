package ik;

import ik.f;
import java.io.Serializable;
import n0.l;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: CoroutineContextImpl.kt */
public final class c implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f20647a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b f20648b;

    /* compiled from: CoroutineContextImpl.kt */
    public static final class a extends k implements p<String, f.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20649a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            boolean z10;
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            j.f(str, "acc");
            j.f(bVar, "element");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f.b bVar, f fVar) {
        j.f(fVar, "left");
        j.f(bVar, "element");
        this.f20647a = fVar;
        this.f20648b = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                f fVar = cVar2.f20647a;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f20647a;
                if (fVar2 instanceof c) {
                    cVar3 = (c) fVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f20648b;
                if (j.a(cVar.get(bVar.getKey()), bVar)) {
                    f fVar3 = cVar4.f20647a;
                    if (!(fVar3 instanceof c)) {
                        j.d(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar3;
                        z10 = j.a(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(this.f20647a.fold(r10, pVar), this.f20648b);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        j.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = cVar2.f20648b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f20647a;
            if (!(fVar instanceof c)) {
                return fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f20648b.hashCode() + this.f20647a.hashCode();
    }

    public final f minusKey(f.c<?> cVar) {
        j.f(cVar, "key");
        if (this.f20648b.get(cVar) != null) {
            return this.f20647a;
        }
        f minusKey = this.f20647a.minusKey(cVar);
        if (minusKey == this.f20647a) {
            return this;
        }
        if (minusKey == g.f20653a) {
            return this.f20648b;
        }
        return new c(this.f20648b, minusKey);
    }

    public final f plus(f fVar) {
        return f.a.a(this, fVar);
    }

    public final String toString() {
        return l.k(android.support.v4.media.a.p('['), (String) fold("", a.f20649a), ']');
    }
}
