package gk;

import fk.e;
import gk.b;
import java.util.Collection;
import java.util.Iterator;
import sk.j;

/* compiled from: MapBuilder.kt */
public final class d<E> extends e<E> {

    /* renamed from: a  reason: collision with root package name */
    public final b<E, ?> f20456a;

    public d(b<E, ?> bVar) {
        j.f(bVar, "backing");
        this.f20456a = bVar;
    }

    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f20456a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f20456a.containsKey(obj);
    }

    public final int g() {
        return this.f20456a.f20445o;
    }

    public final boolean isEmpty() {
        return this.f20456a.isEmpty();
    }

    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f20456a;
        bVar.getClass();
        return new b.e(bVar);
    }

    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f20456a;
        bVar.c();
        int g2 = bVar.g(obj);
        if (g2 < 0) {
            g2 = -1;
        } else {
            bVar.j(g2);
        }
        if (g2 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20456a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20456a.c();
        return super.retainAll(collection);
    }
}
