package ik;

import ik.f;
import java.io.Serializable;
import rk.p;
import sk.j;

/* compiled from: CoroutineContextImpl.kt */
public final class g implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f20653a = new g();

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return r10;
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        j.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final f minusKey(f.c<?> cVar) {
        j.f(cVar, "key");
        return this;
    }

    public final f plus(f fVar) {
        j.f(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
