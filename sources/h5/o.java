package h5;

import h5.n;
import o5.l;

/* compiled from: SingletonConnectivityReceiver */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n.d.a f10597b;

    public o(n.d.a aVar, boolean z10) {
        this.f10597b = aVar;
        this.f10596a = z10;
    }

    public final void run() {
        n.d.a aVar = this.f10597b;
        boolean z10 = this.f10596a;
        aVar.getClass();
        l.a();
        n.d dVar = n.d.this;
        boolean z11 = dVar.f10585a;
        dVar.f10585a = z10;
        if (z11 != z10) {
            dVar.f10586b.a(z10);
        }
    }
}
