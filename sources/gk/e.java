package gk;

import gk.b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import sk.j;

/* compiled from: MapBuilder.kt */
public final class e<V> extends AbstractCollection<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final b<?, V> f20457a;

    public e(b<?, V> bVar) {
        j.f(bVar, "backing");
        this.f20457a = bVar;
    }

    public final boolean add(V v2) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f20457a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f20457a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f20457a.isEmpty();
    }

    public final Iterator<V> iterator() {
        b<?, V> bVar = this.f20457a;
        bVar.getClass();
        return new b.f(bVar);
    }

    public final boolean remove(Object obj) {
        int i10;
        b<?, V> bVar = this.f20457a;
        bVar.c();
        int i11 = bVar.f20443f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (bVar.f20440c[i11] >= 0) {
                V[] vArr = bVar.f20439b;
                j.c(vArr);
                if (j.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        bVar.j(i10);
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20457a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20457a.c();
        return super.retainAll(collection);
    }

    public final int size() {
        return this.f20457a.f20445o;
    }
}
