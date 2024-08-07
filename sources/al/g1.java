package al;

import ek.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rk.l;

/* compiled from: JobSupport.kt */
public final class g1 extends j1 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19034f = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e  reason: collision with root package name */
    public final l<Throwable, i> f19035e;

    public g1(l<? super Throwable, i> lVar) {
        this.f19035e = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return i.f20112a;
    }

    public final void m(Throwable th2) {
        if (f19034f.compareAndSet(this, 0, 1)) {
            this.f19035e.invoke(th2);
        }
    }
}
