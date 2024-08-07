package fk;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m9.b;
import sk.j;

/* compiled from: Sets.kt */
public final class t implements Set, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final t f20215a = new t();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        j.f((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        j.f(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return q.f20212a;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return b.a0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return b.b0(this, tArr);
    }

    public final String toString() {
        return "[]";
    }
}
