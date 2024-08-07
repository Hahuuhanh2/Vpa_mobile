package dl;

import el.a;
import el.b;
import ik.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p3.l0;

/* compiled from: StateFlow.kt */
public final class a0 extends b<z<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19955a = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_state");
    private volatile Object _state;

    public final boolean a(a aVar) {
        z zVar = (z) aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19955a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, m9.b.f13207s);
        return true;
    }

    public final d[] b(a aVar) {
        z zVar = (z) aVar;
        f19955a.set(this, (Object) null);
        return l0.f13950a;
    }
}
