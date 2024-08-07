package al;

import fl.r;
import ik.d;
import ik.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p3.l0;
import rk.l;

/* compiled from: Builders.common.kt */
public final class o0<T> extends r<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19079e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
    private volatile int _decision;

    public o0(d dVar, f fVar) {
        super(dVar, fVar);
    }

    public final void h0(Object obj) {
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19079e;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            z10 = false;
            if (i10 == 0) {
                if (f19079e.compareAndSet(this, 0, 2)) {
                    z10 = true;
                    break;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z10) {
            g0.g0(g0.b0(this.f20259d), l0.x0(obj), (l) null);
        }
    }

    public final void p(Object obj) {
        h0(obj);
    }
}
