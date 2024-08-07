package al;

import ik.f;
import rk.p;
import sk.j;

/* compiled from: CoroutineContext.kt */
public final class e2 implements f.b, f.c<e2> {

    /* renamed from: a  reason: collision with root package name */
    public static final e2 f19013a = new e2();

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return this;
    }

    public final f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f plus(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
