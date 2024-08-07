package v0;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f15986a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f15987b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f15988c;

    /* compiled from: MapCollections */
    public final class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public final int f15989a;

        /* renamed from: b  reason: collision with root package name */
        public int f15990b;

        /* renamed from: c  reason: collision with root package name */
        public int f15991c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15992d = false;

        public a(int i10) {
            this.f15989a = i10;
            this.f15990b = g.this.d();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f15991c < this.f15990b) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (hasNext()) {
                T b10 = g.this.b(this.f15991c, this.f15989a);
                this.f15991c++;
                this.f15992d = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f15992d) {
                int i10 = this.f15991c - 1;
                this.f15991c = i10;
                this.f15990b--;
                this.f15992d = false;
                g.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = g.this.d();
            for (Map.Entry entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            if (d10 != g.this.d()) {
                return true;
            }
            return false;
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = g.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            Object b10 = g.this.b(e10, 1);
            Object value = entry.getValue();
            if (b10 == value || (b10 != null && b10.equals(value))) {
                return true;
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public final int hashCode() {
            int i10;
            int i11;
            int i12 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                Object b11 = g.this.b(d10, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 == null) {
                    i11 = 0;
                } else {
                    i11 = b11.hashCode();
                }
                i12 += i10 ^ i11;
            }
            return i12;
        }

        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    public final class d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, j$.util.Iterator, Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        public int f15996a;

        /* renamed from: b  reason: collision with root package name */
        public int f15997b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15998c = false;

        public d() {
            this.f15996a = g.this.d() - 1;
            this.f15997b = -1;
        }

        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (!this.f15998c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b10 = g.this.b(this.f15997b, 0);
                if (key == b10 || (key != null && key.equals(b10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                Object value = entry.getValue();
                Object b11 = g.this.b(this.f15997b, 1);
                if (value == b11 || (value != null && value.equals(b11))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
                return false;
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final K getKey() {
            if (this.f15998c) {
                return g.this.b(this.f15997b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f15998c) {
                return g.this.b(this.f15997b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            if (this.f15997b < this.f15996a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            if (this.f15998c) {
                int i11 = 0;
                Object b10 = g.this.b(this.f15997b, 0);
                Object b11 = g.this.b(this.f15997b, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return i10 ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f15997b++;
                this.f15998c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f15998c) {
                g.this.h(this.f15997b);
                this.f15997b--;
                this.f15996a--;
                this.f15998c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v2) {
            if (this.f15998c) {
                return g.this.i(this.f15997b, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean k(Collection collection, java.util.Map map) {
        int size = map.size();
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract java.util.Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v2);

    public abstract void h(int i10);

    public abstract V i(int i10, V v2);

    public final Object[] l(int i10, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }

    /* compiled from: MapCollections */
    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            if (g.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            java.util.Map c10 = g.this.c();
            for (Object containsKey : collection) {
                if (!c10.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public final int hashCode() {
            int i10;
            int i11 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                i11 += i10;
            }
            return i11;
        }

        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        public final java.util.Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int e10 = g.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            g.this.h(e10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            java.util.Map c10 = g.this.c();
            int size = c10.size();
            for (Object remove : collection) {
                c10.remove(remove);
            }
            if (size != c10.size()) {
                return true;
            }
            return false;
        }

        public final boolean retainAll(Collection<?> collection) {
            return g.k(collection, g.this.c());
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return g.this.l(0, tArr);
        }
    }

    /* compiled from: MapCollections */
    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            g.this.a();
        }

        public final boolean contains(Object obj) {
            if (g.this.f(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            if (g.this.d() == 0) {
                return true;
            }
            return false;
        }

        public final java.util.Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int f10 = g.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            g.this.h(f10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public final boolean retainAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public final int size() {
            return g.this.d();
        }

        public final Object[] toArray() {
            g gVar = g.this;
            int d10 = gVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = gVar.b(i10, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return g.this.l(1, tArr);
        }
    }
}
