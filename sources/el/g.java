package el;

import ik.f;
import rk.p;

/* compiled from: SafeCollector.kt */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f20148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f20149b;

    public g(f fVar, Throwable th2) {
        this.f20148a = th2;
        this.f20149b = fVar;
    }

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return this.f20149b.fold(r10, pVar);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return this.f20149b.get(cVar);
    }

    public final f minusKey(f.c<?> cVar) {
        return this.f20149b.minusKey(cVar);
    }

    public final f plus(f fVar) {
        return this.f20149b.plus(fVar);
    }
}
