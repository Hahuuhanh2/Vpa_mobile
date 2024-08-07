package com.google.protobuf;

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
public class b0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f7870n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f7871a;

    /* renamed from: b  reason: collision with root package name */
    public List<b0<K, V>.b> f7872b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f7873c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f7874d;

    /* renamed from: e  reason: collision with root package name */
    public volatile b0<K, V>.d f7875e;

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f7876f = Collections.emptyMap();

    /* compiled from: SmallSortedMap */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0075a f7877a = new C0075a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f7878b = new b();

        /* renamed from: com.google.protobuf.b0$a$a  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        public class C0075a implements Iterator<Object>, j$.util.Iterator {
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
        public class b implements Iterable<Object> {
            public final java.util.Iterator<Object> iterator() {
                return a.f7877a;
            }
        }
    }

    /* compiled from: SmallSortedMap */
    public class b implements Map.Entry<K, V>, Comparable<b0<K, V>.b> {

        /* renamed from: a  reason: collision with root package name */
        public final K f7879a;

        /* renamed from: b  reason: collision with root package name */
        public V f7880b;

        public b() {
            throw null;
        }

        public b(K k10, V v2) {
            this.f7879a = k10;
            this.f7880b = v2;
        }

        public final int compareTo(Object obj) {
            return this.f7879a.compareTo(((b) obj).f7879a);
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
            K k10 = this.f7879a;
            Object key = entry.getKey();
            if (k10 != null) {
                z10 = k10.equals(key);
            } else if (key == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                V v2 = this.f7880b;
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
            return this.f7879a;
        }

        public final V getValue() {
            return this.f7880b;
        }

        public final int hashCode() {
            int i10;
            K k10 = this.f7879a;
            int i11 = 0;
            if (k10 == null) {
                i10 = 0;
            } else {
                i10 = k10.hashCode();
            }
            V v2 = this.f7880b;
            if (v2 != null) {
                i11 = v2.hashCode();
            }
            return i10 ^ i11;
        }

        public final V setValue(V v2) {
            b0 b0Var = b0.this;
            int i10 = b0.f7870n;
            b0Var.c();
            V v10 = this.f7880b;
            this.f7880b = v2;
            return v10;
        }

        public final String toString() {
            return this.f7879a + "=" + this.f7880b;
        }
    }

    /* compiled from: SmallSortedMap */
    public class c implements java.util.Iterator<Map.Entry<K, V>>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public int f7882a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7883b;

        /* renamed from: c  reason: collision with root package name */
        public java.util.Iterator<Map.Entry<K, V>> f7884c;

        public c() {
        }

        public final java.util.Iterator<Map.Entry<K, V>> a() {
            if (this.f7884c == null) {
                this.f7884c = b0.this.f7873c.entrySet().iterator();
            }
            return this.f7884c;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f7882a + 1 < b0.this.f7872b.size()) {
                return true;
            }
            if (b0.this.f7873c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public final Object next() {
            this.f7883b = true;
            int i10 = this.f7882a + 1;
            this.f7882a = i10;
            if (i10 < b0.this.f7872b.size()) {
                return b0.this.f7872b.get(this.f7882a);
            }
            return (Map.Entry) a().next();
        }

        public final void remove() {
            if (this.f7883b) {
                this.f7883b = false;
                b0 b0Var = b0.this;
                int i10 = b0.f7870n;
                b0Var.c();
                if (this.f7882a < b0.this.f7872b.size()) {
                    b0 b0Var2 = b0.this;
                    int i11 = this.f7882a;
                    this.f7882a = i11 - 1;
                    b0Var2.j(i11);
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
            b0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            b0.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
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
            b0.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return b0.this.size();
        }
    }

    public b0(int i10) {
        this.f7871a = i10;
    }

    public final int b(K k10) {
        int size = this.f7872b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f7872b.get(size).f7879a);
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
            int compareTo2 = k10.compareTo(this.f7872b.get(i11).f7879a);
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
        if (this.f7874d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        if (!this.f7872b.isEmpty()) {
            this.f7872b.clear();
        }
        if (!this.f7873c.isEmpty()) {
            this.f7873c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (b(comparable) >= 0 || this.f7873c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f7872b.get(i10);
    }

    public final int e() {
        return this.f7872b.size();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7875e == null) {
            this.f7875e = new d();
        }
        return this.f7875e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != b0Var.e()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!d(i10).equals(b0Var.d(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f7873c.equals(b0Var.f7873c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        if (this.f7873c.isEmpty()) {
            return a.f7878b;
        }
        return this.f7873c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f7873c.isEmpty() && !(this.f7873c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7873c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f7876f = treeMap.descendingMap();
        }
        return (SortedMap) this.f7873c;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return this.f7872b.get(b10).f7880b;
        }
        return this.f7873c.get(comparable);
    }

    public void h() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f7874d) {
            if (this.f7873c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f7873c);
            }
            this.f7873c = map;
            if (this.f7876f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f7876f);
            }
            this.f7876f = map2;
            this.f7874d = true;
        }
    }

    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f7872b.get(i11).hashCode();
        }
        if (this.f7873c.size() > 0) {
            return i10 + this.f7873c.hashCode();
        }
        return i10;
    }

    /* renamed from: i */
    public final V put(K k10, V v2) {
        c();
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f7872b.get(b10).setValue(v2);
        }
        c();
        if (this.f7872b.isEmpty() && !(this.f7872b instanceof ArrayList)) {
            this.f7872b = new ArrayList(this.f7871a);
        }
        int i10 = -(b10 + 1);
        if (i10 >= this.f7871a) {
            return g().put(k10, v2);
        }
        int size = this.f7872b.size();
        int i11 = this.f7871a;
        if (size == i11) {
            b remove = this.f7872b.remove(i11 - 1);
            g().put(remove.f7879a, remove.f7880b);
        }
        this.f7872b.add(i10, new b(k10, v2));
        return null;
    }

    public final V j(int i10) {
        c();
        V v2 = this.f7872b.remove(i10).f7880b;
        if (!this.f7873c.isEmpty()) {
            java.util.Iterator it = g().entrySet().iterator();
            List<b0<K, V>.b> list = this.f7872b;
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
        if (this.f7873c.isEmpty()) {
            return null;
        }
        return this.f7873c.remove(comparable);
    }

    public final int size() {
        return this.f7873c.size() + this.f7872b.size();
    }
}
