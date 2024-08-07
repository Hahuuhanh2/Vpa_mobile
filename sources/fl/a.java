package fl;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.b;

/* compiled from: Atomic.kt */
public abstract class a<T> extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20221a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile Object _consensus = b.f13210v;

    public final Object a(Object obj) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20221a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        u9.b bVar = b.f13210v;
        if (obj2 == bVar) {
            u9.b c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == bVar) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != bVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    obj2 = c10;
                } else {
                    obj2 = f20221a.get(this);
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract u9.b c(Object obj);
}
