package ik;

import ik.f;
import ik.f.b;
import rk.l;
import sk.j;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<f.b, E> f20645a;

    /* renamed from: b  reason: collision with root package name */
    public final f.c<?> f20646b;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        j.f(cVar, "baseKey");
        j.f(lVar, "safeCast");
        this.f20645a = lVar;
        this.f20646b = cVar instanceof b ? ((b) cVar).f20646b : cVar;
    }
}
