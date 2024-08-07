package xk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<e<T>> f23482a;

    public a(j jVar) {
        this.f23482a = new AtomicReference<>(jVar);
    }

    public final Iterator<T> iterator() {
        e andSet = this.f23482a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
