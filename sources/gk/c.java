package gk;

import fk.e;
import gk.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import sk.j;

/* compiled from: MapBuilder.kt */
public final class c<K, V> extends e<Map.Entry<Object, Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final b<K, V> f20455a;

    public c(b<K, V> bVar) {
        j.f(bVar, "backing");
        this.f20455a = bVar;
    }

    public final boolean add(Object obj) {
        j.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f20455a.clear();
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        return this.f20455a.d(collection);
    }

    public final int g() {
        return this.f20455a.f20445o;
    }

    /* renamed from: i */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        return this.f20455a.e(entry);
    }

    public final boolean isEmpty() {
        return this.f20455a.isEmpty();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> bVar = this.f20455a;
        bVar.getClass();
        return new b.C0285b(bVar);
    }

    /* renamed from: l */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        b<K, V> bVar = this.f20455a;
        bVar.getClass();
        bVar.c();
        int g2 = bVar.g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        V[] vArr = bVar.f20439b;
        j.c(vArr);
        if (!j.a(vArr[g2], entry.getValue())) {
            return false;
        }
        bVar.j(g2);
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20455a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f20455a.c();
        return super.retainAll(collection);
    }
}
