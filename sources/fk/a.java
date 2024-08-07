package fk;

import java.util.Collection;
import java.util.Iterator;
import m9.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AbstractCollection.kt */
public abstract class a<E> implements Collection<E> {

    /* renamed from: fk.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractCollection.kt */
    public static final class C0282a extends k implements l<E, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a<E> f20173a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0282a(a<? extends E> aVar) {
            super(1);
            this.f20173a = aVar;
        }

        public final Object invoke(Object obj) {
            if (obj == this.f20173a) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (j.a(a10, e10)) {
                return true;
            }
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

    public abstract int g();

    public final boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
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

    public final /* bridge */ int size() {
        return g();
    }

    public Object[] toArray() {
        return b.a0(this);
    }

    public final String toString() {
        return p.Q0(this, ", ", "[", "]", new C0282a(this), 24);
    }

    public <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return b.b0(this, tArr);
    }
}
