package o3;

import ek.i;
import java.util.concurrent.CancellationException;
import rk.l;
import sk.k;
import z3.c;

/* compiled from: ListenableFuture.kt */
public final class h extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i<Object> f13680a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i<Object> iVar) {
        super(1);
        this.f13680a = iVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 == null) {
            if (!this.f13680a.f13682b.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            this.f13680a.f13682b.cancel(true);
        } else {
            c<R> cVar = this.f13680a.f13682b;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            cVar.j(th2);
        }
        return i.f20112a;
    }
}
