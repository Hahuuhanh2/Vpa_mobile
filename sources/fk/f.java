package fk;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import m9.b;
import sk.a;
import sk.j;

/* compiled from: Collections.kt */
public final class f<T> implements Collection<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f20204a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20205b;

    public f(T[] tArr, boolean z10) {
        j.f(tArr, "values");
        this.f20204a = tArr;
        this.f20205b = z10;
    }

    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i10;
        T[] tArr = this.f20204a;
        j.f(tArr, "<this>");
        if (obj != null) {
            int length = tArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (j.a(obj, tArr[i11])) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            int length2 = tArr.length;
            i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                } else if (tArr[i10] == null) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f20204a.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator<T> iterator() {
        T[] tArr = this.f20204a;
        j.f(tArr, "array");
        return new a(tArr);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f20204a.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f20204a;
        boolean z10 = this.f20205b;
        Class<Object[]> cls = Object[].class;
        j.f(tArr, "<this>");
        if (z10 && j.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        j.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return b.b0(this, tArr);
    }
}
