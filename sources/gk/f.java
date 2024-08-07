package gk;

import fk.e;
import gk.b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import sk.j;

/* compiled from: SetBuilder.kt */
public final class f<E> extends e<E> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final f f20458b = new f(b.f20437t);

    /* renamed from: a  reason: collision with root package name */
    public final b<E, ?> f20459a;

    static {
        b bVar = b.f20437t;
    }

    public f(b<E, ?> bVar) {
        j.f(bVar, "backing");
        this.f20459a = bVar;
    }

    public final boolean add(E e10) {
        if (this.f20459a.b(e10) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        this.f20459a.c();
        return super.addAll(collection);
    }

    public final void clear() {
        this.f20459a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f20459a.containsKey(obj);
    }

    public final int g() {
        return this.f20459a.f20445o;
    }

    public final boolean isEmpty() {
        return this.f20459a.isEmpty();
    }

    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f20459a;
        bVar.getClass();
        return new b.e(bVar);
    }

    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f20459a;
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
        this.f20459a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20459a.c();
        return super.retainAll(collection);
    }

    public f() {
        this(new b());
    }
}
