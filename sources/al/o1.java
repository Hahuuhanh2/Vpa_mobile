package al;

import dl.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rk.q;
import sk.i;

/* compiled from: JobSupport.kt */
public final /* synthetic */ class o1 extends i implements q<m1, Object, Object, Object> {

    /* renamed from: p  reason: collision with root package name */
    public static final o1 f19080p = new o1();

    public o1() {
        super(3, m1.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object d(f fVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f19054a;
        ((m1) fVar).getClass();
        if (!(obj2 instanceof u)) {
            return obj2;
        }
        throw ((u) obj2).f19094a;
    }
}
