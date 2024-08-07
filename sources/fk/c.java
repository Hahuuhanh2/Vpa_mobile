package fk;

import f0.b0;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sk.j;

/* compiled from: AbstractList.kt */
public abstract class c<E> extends a<E> implements List<E> {

    /* compiled from: AbstractList.kt */
    public static final class a {
        public static void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder u10 = b0.u("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
                u10.append(i12);
                throw new IndexOutOfBoundsException(u10.toString());
            } else if (i10 > i11) {
                throw new IllegalArgumentException(b0.p("fromIndex: ", i10, " > toIndex: ", i11));
            }
        }
    }

    /* compiled from: AbstractList.kt */
    public class b implements Iterator<E>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public int f20193a;

        public b() {
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f20193a < c.this.g()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f20193a;
                this.f20193a = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: fk.c$c  reason: collision with other inner class name */
    /* compiled from: AbstractList.kt */
    public class C0283c extends c<E>.b implements ListIterator<E> {
        public C0283c(int i10) {
            super();
            int g2 = c.this.g();
            if (i10 < 0 || i10 > g2) {
                throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", g2));
            }
            this.f20193a = i10;
        }

        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            if (this.f20193a > 0) {
                return true;
            }
            return false;
        }

        public final int nextIndex() {
            return this.f20193a;
        }

        public final E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                int i10 = this.f20193a - 1;
                this.f20193a = i10;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f20193a - 1;
        }

        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        public final c<E> f20196a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20197b;

        /* renamed from: c  reason: collision with root package name */
        public int f20198c;

        public d(c<? extends E> cVar, int i10, int i11) {
            j.f(cVar, "list");
            this.f20196a = cVar;
            this.f20197b = i10;
            a.a(i10, i11, cVar.g());
            this.f20198c = i11 - i10;
        }

        public final int g() {
            return this.f20198c;
        }

        public final E get(int i10) {
            int i11 = this.f20198c;
            if (i10 >= 0 && i10 < i11) {
                return this.f20196a.get(this.f20197b + i10);
            }
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        }
    }

    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        j.f(collection, "other");
        if (size() == collection.size()) {
            java.util.Iterator it = collection.iterator();
            for (Object a10 : this) {
                if (!j.a(a10, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i10);

    public final int hashCode() {
        int i10;
        int i11 = 1;
        for (Object next : this) {
            int i12 = i11 * 31;
            if (next != null) {
                i10 = next.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return i11;
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object a10 : this) {
            if (j.a(a10, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public java.util.Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (j.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C0283c(0);
    }

    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public final ListIterator<E> listIterator(int i10) {
        return new C0283c(i10);
    }
}
