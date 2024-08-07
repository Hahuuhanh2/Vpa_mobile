package z3;

import z3.a;

/* compiled from: SettableFuture */
public final class c<V> extends a<V> {
    public final boolean i(V v2) {
        if (v2 == null) {
            v2 = a.f17840n;
        }
        if (!a.f17839f.b(this, (Object) null, v2)) {
            return false;
        }
        a.c(this);
        return true;
    }

    public final boolean j(Throwable th2) {
        th2.getClass();
        if (!a.f17839f.b(this, (Object) null, new a.c(th2))) {
            return false;
        }
        a.c(this);
        return true;
    }

    public final boolean k(v8.a<? extends V> aVar) {
        a.f fVar;
        a.c cVar;
        aVar.getClass();
        Object obj = this.f17841a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!a.f17839f.b(this, (Object) null, a.f(aVar))) {
                    return false;
                }
                a.c(this);
            } else {
                fVar = new a.f(this, aVar);
                if (a.f17839f.b(this, (Object) null, fVar)) {
                    try {
                        aVar.b(fVar, b.f17864a);
                    } catch (Throwable unused) {
                        cVar = a.c.f17848b;
                    }
                } else {
                    obj = this.f17841a;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        aVar.cancel(((a.b) obj).f17846a);
        return false;
        a.f17839f.b(this, fVar, cVar);
        return true;
    }
}
