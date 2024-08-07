package fk;

import java.util.Iterator;
import rk.a;

/* compiled from: Iterables.kt */
public final class v<T> implements Iterable<u<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Iterator<T>> f20218a;

    public v(o oVar) {
        this.f20218a = oVar;
    }

    public final Iterator<u<T>> iterator() {
        return new w(this.f20218a.invoke());
    }
}
