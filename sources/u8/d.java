package u8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList */
public abstract class d<E> extends c<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15312b = new a(j.f15374e, 0);

    /* compiled from: ImmutableList */
    public static class a<E> extends a<E> {

        /* renamed from: c  reason: collision with root package name */
        public final d<E> f15313c;

        public a(d<E> dVar, int i10) {
            super(dVar.size(), i10);
            this.f15313c = dVar;
        }
    }

    /* compiled from: ImmutableList */
    public class b extends d<E> {

        /* renamed from: c  reason: collision with root package name */
        public final transient int f15314c;

        /* renamed from: d  reason: collision with root package name */
        public final transient int f15315d;

        public b(int i10, int i11) {
            this.f15314c = i10;
            this.f15315d = i11;
        }

        public final E get(int i10) {
            m9.b.h(i10, this.f15315d);
            return d.this.get(i10 + this.f15314c);
        }

        public final Object[] i() {
            return d.this.i();
        }

        public final Iterator iterator() {
            return listIterator(0);
        }

        public final int l() {
            return d.this.m() + this.f15314c + this.f15315d;
        }

        public final ListIterator listIterator() {
            return listIterator(0);
        }

        public final int m() {
            return d.this.m() + this.f15314c;
        }

        /* renamed from: q */
        public final d<E> subList(int i10, int i11) {
            m9.b.l(i10, i11, this.f15315d);
            d dVar = d.this;
            int i12 = this.f15314c;
            return dVar.subList(i10 + i12, i11 + i12);
        }

        public final int size() {
            return this.f15315d;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public static j o(int i10, Object[] objArr) {
        if (i10 == 0) {
            return j.f15374e;
        }
        return new j(objArr, i10);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (list instanceof RandomAccess) {
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = get(i10);
                    Object obj3 = list.get(i10);
                    if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
            } else {
                Iterator it = list.iterator();
                for (Object next : this) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    Object next2 = it.next();
                    if (next == next2 || (next != null && next.equals(next2))) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                return !it.hasNext();
            }
        }
        return true;
    }

    public int g(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[0 + i10] = get(i10);
        }
        return 0 + size;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final n<E> n() {
        return listIterator(0);
    }

    /* renamed from: p */
    public final a listIterator(int i10) {
        m9.b.j(i10, size());
        if (isEmpty()) {
            return f15312b;
        }
        return new a(this, i10);
    }

    /* renamed from: q */
    public d<E> subList(int i10, int i11) {
        m9.b.l(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return j.f15374e;
        }
        return new b(i10, i12);
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
