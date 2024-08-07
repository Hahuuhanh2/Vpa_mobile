package al;

import ek.i;
import fl.f;
import ik.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sk.j;
import u9.b;

/* compiled from: JobSupport.kt */
public final class n extends j1 {

    /* renamed from: e  reason: collision with root package name */
    public final l<?> f19077e;

    public n(l<?> lVar) {
        this.f19077e = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return i.f20112a;
    }

    public final void m(Throwable th2) {
        boolean z10;
        l<?> lVar = this.f19077e;
        Throwable r10 = lVar.r(n());
        boolean z11 = false;
        if (lVar.x()) {
            d<T> dVar = lVar.f19050d;
            j.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            f fVar = (f) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f20227o;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                b bVar = g0.f19023f;
                boolean z12 = true;
                if (j.a(obj, bVar)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f.f20227o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(fVar, bVar, r10)) {
                            if (atomicReferenceFieldUpdater2.get(fVar) != bVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    break;
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f.f20227o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(fVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater3.get(fVar) != obj) {
                                z12 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z12) {
                        break;
                    }
                }
            }
            z11 = true;
        }
        if (!z11) {
            lVar.cancel(r10);
            if (!lVar.x()) {
                lVar.p();
            }
        }
    }
}
