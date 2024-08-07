package bl;

import ek.i;
import rk.l;
import sk.k;

/* compiled from: HandlerDispatcher.kt */
public final class e extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f19170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f19171b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(1);
        this.f19170a = fVar;
        this.f19171b = dVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f19170a.f19172c.removeCallbacks(this.f19171b);
        return i.f20112a;
    }
}
