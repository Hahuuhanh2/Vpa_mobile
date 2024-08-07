package fl;

import fl.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p3.l0;
import sk.j;

/* compiled from: ConcurrentLinkedList.kt */
public abstract class c<N extends c<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20223a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20224b;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<c> cls2 = c.class;
        f20223a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f20224b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public c(N n10) {
        this._prev = n10;
    }

    public final void a() {
        f20224b.lazySet(this, (Object) null);
    }

    public final N b() {
        N n10 = f20223a.get(this);
        if (n10 == l0.f13951b) {
            return null;
        }
        return (c) n10;
    }

    public abstract boolean c();

    public final void d() {
        boolean z10;
        c cVar;
        boolean z11;
        boolean z12;
        c b10;
        if (b() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            while (true) {
                c cVar2 = (c) f20224b.get(this);
                while (cVar2 != null && cVar2.c()) {
                    cVar2 = (c) f20224b.get(cVar2);
                }
                c b11 = b();
                j.c(b11);
                while (b11.c() && (b10 = b11.b()) != null) {
                    b11 = b10;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20224b;
                do {
                    Object obj = atomicReferenceFieldUpdater.get(b11);
                    if (((c) obj) == null) {
                        cVar = null;
                    } else {
                        cVar = cVar2;
                    }
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(b11, obj, cVar)) {
                            if (atomicReferenceFieldUpdater.get(b11) != obj) {
                                z11 = false;
                                continue;
                                break;
                            }
                        } else {
                            z11 = true;
                            continue;
                            break;
                        }
                    }
                } while (!z11);
                if (cVar2 != null) {
                    f20223a.set(cVar2, b11);
                }
                if (b11.c()) {
                    if (b11.b() == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        continue;
                    }
                }
                if (cVar2 == null || !cVar2.c()) {
                    return;
                }
            }
        }
    }
}
