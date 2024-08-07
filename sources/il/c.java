package il;

import ek.i;
import il.d;
import rk.l;
import sk.k;

/* compiled from: Mutex.kt */
public final class c extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.a f20657b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, d.a aVar) {
        super(1);
        this.f20656a = dVar;
        this.f20657b = aVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        d.f20658h.set(this.f20656a, this.f20657b.f20660b);
        this.f20656a.b(this.f20657b.f20660b);
        return i.f20112a;
    }
}
