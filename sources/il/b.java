package il;

import ek.i;
import il.d;
import rk.l;
import sk.k;

/* compiled from: Mutex.kt */
public final class b extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20654a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.a f20655b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, d.a aVar) {
        super(1);
        this.f20654a = dVar;
        this.f20655b = aVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f20654a.b(this.f20655b.f20660b);
        return i.f20112a;
    }
}
