package gk;

import al.g0;
import f0.b0;
import fk.c;
import fk.d;
import fk.h;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p3.l0;
import sk.j;

/* compiled from: ListBuilder.kt */
public final class a<E> extends d<E> implements RandomAccess, Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final a f20427n;

    /* renamed from: a  reason: collision with root package name */
    public E[] f20428a;

    /* renamed from: b  reason: collision with root package name */
    public int f20429b;

    /* renamed from: c  reason: collision with root package name */
    public int f20430c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20431d;

    /* renamed from: e  reason: collision with root package name */
    public final a<E> f20432e;

    /* renamed from: f  reason: collision with root package name */
    public final a<E> f20433f;

    /* renamed from: gk.a$a  reason: collision with other inner class name */
    /* compiled from: ListBuilder.kt */
    public static final class C0284a<E> implements ListIterator<E>, Iterator {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f20434a;

        /* renamed from: b  reason: collision with root package name */
        public int f20435b;

        /* renamed from: c  reason: collision with root package name */
        public int f20436c = -1;

        public C0284a(a<E> aVar, int i10) {
            j.f(aVar, "list");
            this.f20434a = aVar;
            this.f20435b = i10;
        }

        public final void add(E e10) {
            a<E> aVar = this.f20434a;
            int i10 = this.f20435b;
            this.f20435b = i10 + 1;
            aVar.add(i10, e10);
            this.f20436c = -1;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f20435b < this.f20434a.f20430c) {
                return true;
            }
            return false;
        }

        public final boolean hasPrevious() {
            if (this.f20435b > 0) {
                return true;
            }
            return false;
        }

        public final E next() {
            int i10 = this.f20435b;
            a<E> aVar = this.f20434a;
            if (i10 < aVar.f20430c) {
                this.f20435b = i10 + 1;
                this.f20436c = i10;
                return aVar.f20428a[aVar.f20429b + i10];
            }
            throw new NoSuchElementException();
        }

        public final int nextIndex() {
            return this.f20435b;
        }

        public final E previous() {
            int i10 = this.f20435b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f20435b = i11;
                this.f20436c = i11;
                a<E> aVar = this.f20434a;
                return aVar.f20428a[aVar.f20429b + i11];
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f20435b - 1;
        }

        public final void remove() {
            boolean z10;
            int i10 = this.f20436c;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20434a.i(i10);
                this.f20435b = this.f20436c;
                this.f20436c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public final void set(E e10) {
            boolean z10;
            int i10 = this.f20436c;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20434a.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        a aVar = new a(0);
        aVar.f20431d = true;
        f20427n = aVar;
    }

    public a(E[] eArr, int i10, int i11, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f20428a = eArr;
        this.f20429b = i10;
        this.f20430c = i11;
        this.f20431d = z10;
        this.f20432e = aVar;
        this.f20433f = aVar2;
    }

    public final boolean add(E e10) {
        n();
        m(this.f20429b + this.f20430c, e10);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        n();
        int size = collection.size();
        l(this.f20429b + this.f20430c, collection, size);
        return size > 0;
    }

    public final void clear() {
        n();
        q(this.f20429b, this.f20430c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L_0x0030
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L_0x0031
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.f20428a
            int r3 = r8.f20429b
            int r4 = r8.f20430c
            int r5 = r9.size()
            if (r4 == r5) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            r5 = r0
        L_0x0018:
            if (r5 >= r4) goto L_0x002d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = sk.j.a(r6, r7)
            if (r6 != 0) goto L_0x002a
        L_0x0028:
            r9 = r0
            goto L_0x002e
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            r9 = r1
        L_0x002e:
            if (r9 == 0) goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.a.equals(java.lang.Object):boolean");
    }

    public final int g() {
        return this.f20430c;
    }

    public final E get(int i10) {
        int i11 = this.f20430c;
        if (i10 >= 0 && i10 < i11) {
            return this.f20428a[this.f20429b + i10];
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
    }

    public final int hashCode() {
        int i10;
        E[] eArr = this.f20428a;
        int i11 = this.f20429b;
        int i12 = this.f20430c;
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            E e10 = eArr[i11 + i14];
            int i15 = i13 * 31;
            if (e10 != null) {
                i10 = e10.hashCode();
            } else {
                i10 = 0;
            }
            i13 = i15 + i10;
        }
        return i13;
    }

    public final E i(int i10) {
        n();
        int i11 = this.f20430c;
        if (i10 >= 0 && i10 < i11) {
            return p(this.f20429b + i10);
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
    }

    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f20430c; i10++) {
            if (j.a(this.f20428a[this.f20429b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.f20430c == 0) {
            return true;
        }
        return false;
    }

    public final java.util.Iterator<E> iterator() {
        return new C0284a(this, 0);
    }

    public final void l(int i10, Collection<? extends E> collection, int i11) {
        a<E> aVar = this.f20432e;
        if (aVar != null) {
            aVar.l(i10, collection, i11);
            this.f20428a = this.f20432e.f20428a;
            this.f20430c += i11;
            return;
        }
        o(i10, i11);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f20428a[i10 + i12] = it.next();
        }
    }

    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f20430c - 1; i10 >= 0; i10--) {
            if (j.a(this.f20428a[this.f20429b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C0284a(this, 0);
    }

    public final void m(int i10, E e10) {
        a<E> aVar = this.f20432e;
        if (aVar != null) {
            aVar.m(i10, e10);
            this.f20428a = this.f20432e.f20428a;
            this.f20430c++;
            return;
        }
        o(i10, 1);
        this.f20428a[i10] = e10;
    }

    public final void n() {
        boolean z10;
        a<E> aVar;
        if (this.f20431d || ((aVar = this.f20433f) != null && aVar.f20431d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(int i10, int i11) {
        int i12 = this.f20430c + i11;
        if (this.f20432e != null) {
            throw new IllegalStateException();
        } else if (i12 >= 0) {
            E[] eArr = this.f20428a;
            if (i12 > eArr.length) {
                int length = eArr.length;
                int i13 = length + (length >> 1);
                if (i13 - i12 < 0) {
                    i13 = i12;
                }
                if (i13 - 2147483639 > 0) {
                    if (i12 > 2147483639) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = 2147483639;
                    }
                }
                E[] copyOf = Arrays.copyOf(eArr, i13);
                j.e(copyOf, "copyOf(this, newSize)");
                this.f20428a = copyOf;
            }
            E[] eArr2 = this.f20428a;
            h.m0(i10 + i11, i10, this.f20429b + this.f20430c, eArr2, eArr2);
            this.f20430c += i11;
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final E p(int i10) {
        a<E> aVar = this.f20432e;
        if (aVar != null) {
            this.f20430c--;
            return aVar.p(i10);
        }
        E[] eArr = this.f20428a;
        E e10 = eArr[i10];
        h.m0(i10, i10 + 1, this.f20429b + this.f20430c, eArr, eArr);
        E[] eArr2 = this.f20428a;
        j.f(eArr2, "<this>");
        eArr2[(this.f20429b + this.f20430c) - 1] = null;
        this.f20430c--;
        return e10;
    }

    public final void q(int i10, int i11) {
        a<E> aVar = this.f20432e;
        if (aVar != null) {
            aVar.q(i10, i11);
        } else {
            E[] eArr = this.f20428a;
            h.m0(i10, i10 + i11, this.f20430c, eArr, eArr);
            E[] eArr2 = this.f20428a;
            int i12 = this.f20430c;
            l0.z0(eArr2, i12 - i11, i12);
        }
        this.f20430c -= i11;
    }

    public final int r(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        a<E> aVar = this.f20432e;
        if (aVar != null) {
            int r10 = aVar.r(i10, i11, collection, z10);
            this.f20430c -= r10;
            return r10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f20428a[i14]) == z10) {
                E[] eArr = this.f20428a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f20428a;
        h.m0(i10 + i13, i11 + i10, this.f20430c, eArr2, eArr2);
        E[] eArr3 = this.f20428a;
        int i16 = this.f20430c;
        l0.z0(eArr3, i16 - i15, i16);
        this.f20430c -= i15;
        return i15;
    }

    public final boolean remove(Object obj) {
        n();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        n();
        if (r(this.f20429b, this.f20430c, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        n();
        if (r(this.f20429b, this.f20430c, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public final E set(int i10, E e10) {
        n();
        int i11 = this.f20430c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        }
        E[] eArr = this.f20428a;
        int i12 = this.f20429b;
        E e11 = eArr[i12 + i10];
        eArr[i12 + i10] = e10;
        return e11;
    }

    public final List<E> subList(int i10, int i11) {
        a<E> aVar;
        c.a.a(i10, i11, this.f20430c);
        E[] eArr = this.f20428a;
        int i12 = this.f20429b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f20431d;
        a<E> aVar2 = this.f20433f;
        if (aVar2 == null) {
            aVar = this;
        } else {
            aVar = aVar2;
        }
        return new a(eArr, i12, i13, z10, this, aVar);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f20430c;
        if (length < i10) {
            E[] eArr = this.f20428a;
            int i11 = this.f20429b;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            j.e(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.f20428a;
        int i12 = this.f20429b;
        h.m0(0, i12, i10 + i12, eArr2, tArr);
        int length2 = tArr.length;
        int i13 = this.f20430c;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    public final String toString() {
        E[] eArr = this.f20428a;
        int i10 = this.f20429b;
        int i11 = this.f20430c;
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(eArr[i10 + i12]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }

    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f20430c;
        if (i10 >= 0 && i10 <= i11) {
            return new C0284a(this, i10);
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
    }

    public final void add(int i10, E e10) {
        n();
        int i11 = this.f20430c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        }
        m(this.f20429b + i10, e10);
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        j.f(collection, "elements");
        n();
        int i11 = this.f20430c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        }
        int size = collection.size();
        l(this.f20429b + i10, collection, size);
        return size > 0;
    }

    public final Object[] toArray() {
        E[] eArr = this.f20428a;
        int i10 = this.f20429b;
        int i11 = this.f20430c + i10;
        j.f(eArr, "<this>");
        g0.J(i11, eArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(eArr, i10, i11);
        j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public a() {
        this(10);
    }

    public a(int i10) {
        this(l0.g(i10), 0, 0, false, (a) null, (a) null);
    }
}
