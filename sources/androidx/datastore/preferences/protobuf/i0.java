package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
public class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2276n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f2277a;

    /* renamed from: b  reason: collision with root package name */
    public List<i0<K, V>.b> f2278b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f2279c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2280d;

    /* renamed from: e  reason: collision with root package name */
    public volatile i0<K, V>.d f2281e;

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f2282f = Collections.emptyMap();

    /* compiled from: SmallSortedMap */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0020a f2283a = new C0020a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f2284b = new b();

        /* renamed from: androidx.datastore.preferences.protobuf.i0$a$a  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        public static class C0020a implements Iterator<Object>, j$.util.Iterator {
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap */
        public static class b implements Iterable<Object> {
            public final java.util.Iterator<Object> iterator() {
                return a.f2283a;
            }
        }
    }

    /* compiled from: SmallSortedMap */
    public class b implements Map.Entry<K, V>, Comparable<i0<K, V>.b> {

        /* renamed from: a  reason: collision with root package name */
        public final K f2285a;

        /* renamed from: b  reason: collision with root package name */
        public V f2286b;

        public b() {
            throw null;
        }

        public b(K k10, V v2) {
            this.f2285a = k10;
            this.f2286b = v2;
        }

        public final int compareTo(Object obj) {
            return this.f2285a.compareTo(((b) obj).f2285a);
        }

        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f2285a;
            Object key = entry.getKey();
            if (k10 != null) {
                z10 = k10.equals(key);
            } else if (key == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                V v2 = this.f2286b;
                Object value = entry.getValue();
                if (v2 != null) {
                    z11 = v2.equals(value);
                } else if (value == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f2285a;
        }

        public final V getValue() {
            return this.f2286b;
        }

        public final int hashCode() {
            int i10;
            K k10 = this.f2285a;
            int i11 = 0;
            if (k10 == null) {
                i10 = 0;
            } else {
                i10 = k10.hashCode();
            }
            V v2 = this.f2286b;
            if (v2 != null) {
                i11 = v2.hashCode();
            }
            return i10 ^ i11;
        }

        public final V setValue(V v2) {
            i0 i0Var = i0.this;
            int i10 = i0.f2276n;
            i0Var.c();
            V v10 = this.f2286b;
            this.f2286b = v2;
            return v10;
        }

        public final String toString() {
            return this.f2285a + "=" + this.f2286b;
        }
    }

    /* compiled from: SmallSortedMap */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public int f2288a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2289b;

        /* renamed from: c  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f2290c;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f2290c == null) {
                this.f2290c = i0.this.f2279c.entrySet().iterator();
            }
            return this.f2290c;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f2288a + 1 < i0.this.f2278b.size()) {
                return true;
            }
            if (i0.this.f2279c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public final Object next() {
            this.f2289b = true;
            int i10 = this.f2288a + 1;
            this.f2288a = i10;
            if (i10 < i0.this.f2278b.size()) {
                return i0.this.f2278b.get(this.f2288a);
            }
            return (Map.Entry) a().next();
        }

        public final void remove() {
            if (this.f2289b) {
                this.f2289b = false;
                i0 i0Var = i0.this;
                int i10 = i0.f2276n;
                i0Var.c();
                if (this.f2288a < i0.this.f2278b.size()) {
                    i0 i0Var2 = i0.this;
                    int i11 = this.f2288a;
                    this.f2288a = i11 - 1;
                    i0Var2.j(i11);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            i0.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return i0.this.size();
        }
    }

    public i0(int i10) {
        this.f2277a = i10;
    }

    public final int b(K k10) {
        int size = this.f2278b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f2278b.get(size).f2285a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f2278b.get(i11).f2285a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final void c() {
        if (this.f2280d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        if (!this.f2278b.isEmpty()) {
            this.f2278b.clear();
        }
        if (!this.f2279c.isEmpty()) {
            this.f2279c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (b(comparable) >= 0 || this.f2279c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f2278b.get(i10);
    }

    public final int e() {
        return this.f2278b.size();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2281e == null) {
            this.f2281e = new d();
        }
        return this.f2281e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != i0Var.e()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!d(i10).equals(i0Var.d(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f2279c.equals(i0Var.f2279c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        if (this.f2279c.isEmpty()) {
            return a.f2284b;
        }
        return this.f2279c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f2279c.isEmpty() && !(this.f2279c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2279c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f2282f = treeMap.descendingMap();
        }
        return (SortedMap) this.f2279c;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return this.f2278b.get(b10).f2286b;
        }
        return this.f2279c.get(comparable);
    }

    public void h() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f2280d) {
            if (this.f2279c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f2279c);
            }
            this.f2279c = map;
            if (this.f2282f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f2282f);
            }
            this.f2282f = map2;
            this.f2280d = true;
        }
    }

    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f2278b.get(i11).hashCode();
        }
        if (this.f2279c.size() > 0) {
            return i10 + this.f2279c.hashCode();
        }
        return i10;
    }

    /* renamed from: i */
    public final V put(K k10, V v2) {
        c();
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f2278b.get(b10).setValue(v2);
        }
        c();
        if (this.f2278b.isEmpty() && !(this.f2278b instanceof ArrayList)) {
            this.f2278b = new ArrayList(this.f2277a);
        }
        int i10 = -(b10 + 1);
        if (i10 >= this.f2277a) {
            return g().put(k10, v2);
        }
        int size = this.f2278b.size();
        int i11 = this.f2277a;
        if (size == i11) {
            b remove = this.f2278b.remove(i11 - 1);
            g().put(remove.f2285a, remove.f2286b);
        }
        this.f2278b.add(i10, new b(k10, v2));
        return null;
    }

    public final V j(int i10) {
        c();
        V v2 = this.f2278b.remove(i10).f2286b;
        if (!this.f2279c.isEmpty()) {
            java.util.Iterator it = g().entrySet().iterator();
            List<i0<K, V>.b> list = this.f2278b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v2;
    }

    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return j(b10);
        }
        if (this.f2279c.isEmpty()) {
            return null;
        }
        return this.f2279c.remove(comparable);
    }

    public final int size() {
        return this.f2279c.size() + this.f2278b.size();
    }
}
