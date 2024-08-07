package ik;

import ik.f;
import rk.p;
import sk.j;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    public final f.c<?> f20644a;

    public a(f.c<?> cVar) {
        this.f20644a = cVar;
    }

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return this.f20644a;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f plus(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }
}
