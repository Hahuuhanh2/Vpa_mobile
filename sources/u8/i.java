package u8;

import j$.util.Iterator;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import t8.a;
import u8.i.g;
import u8.i.l;

/* compiled from: MapMakerInternalMap */
public final class i<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f15331q = 0;

    /* renamed from: a  reason: collision with root package name */
    public final transient int f15332a;

    /* renamed from: b  reason: collision with root package name */
    public final transient int f15333b;

    /* renamed from: c  reason: collision with root package name */
    public final transient l<K, V, E, S>[] f15334c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15335d = Math.min(4, 65536);

    /* renamed from: e  reason: collision with root package name */
    public final t8.a<Object> f15336e;

    /* renamed from: f  reason: collision with root package name */
    public final transient h<K, V, E, S> f15337f;

    /* renamed from: n  reason: collision with root package name */
    public transient j f15338n;

    /* renamed from: o  reason: collision with root package name */
    public transient q f15339o;

    /* renamed from: p  reason: collision with root package name */
    public transient e f15340p;

    /* compiled from: MapMakerInternalMap */
    public class a {
    }

    /* compiled from: MapMakerInternalMap */
    public static abstract class b<K, V, E extends g<K, V, E>> implements g<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final K f15341a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15342b;

        /* renamed from: c  reason: collision with root package name */
        public final E f15343c;

        public b(K k10, int i10, E e10) {
            this.f15341a = k10;
            this.f15342b = i10;
            this.f15343c = e10;
        }

        public final E a() {
            return this.f15343c;
        }

        public final int b() {
            return this.f15342b;
        }

        public final K getKey() {
            return this.f15341a;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static abstract class c<K, V, E extends g<K, V, E>> extends WeakReference<K> implements g<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f15344a;

        /* renamed from: b  reason: collision with root package name */
        public final E f15345b;

        public c(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f15344a = i10;
            this.f15345b = e10;
        }

        public final E a() {
            return this.f15345b;
        }

        public final int b() {
            return this.f15344a;
        }

        public final K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class d extends i<K, V, E, S>.f<Map.Entry<K, V>> {
        public d(i iVar) {
            super();
        }

        public final Object next() {
            return c();
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class e extends k<Map.Entry<K, V>> {
        public e() {
        }

        public final void clear() {
            i.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                u8.i r2 = u8.i.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x002e
                u8.i r2 = u8.i.this
                u8.i$h<K, V, E, S> r2 = r2.f15337f
                u8.i$m r2 = r2.b()
                t8.a r2 = r2.b()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.c(r4, r0)
                if (r4 == 0) goto L_0x002e
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u8.i.e.contains(java.lang.Object):boolean");
        }

        public final boolean isEmpty() {
            return i.this.isEmpty();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d(i.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                u8.i r2 = u8.i.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u8.i.e.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return i.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap */
    public abstract class f<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public int f15347a;

        /* renamed from: b  reason: collision with root package name */
        public int f15348b = -1;

        /* renamed from: c  reason: collision with root package name */
        public l<K, V, E, S> f15349c;

        /* renamed from: d  reason: collision with root package name */
        public AtomicReferenceArray<E> f15350d;

        /* renamed from: e  reason: collision with root package name */
        public E f15351e;

        /* renamed from: f  reason: collision with root package name */
        public i<K, V, E, S>.t f15352f;

        /* renamed from: n  reason: collision with root package name */
        public i<K, V, E, S>.t f15353n;

        public f() {
            this.f15347a = i.this.f15334c.length - 1;
            a();
        }

        public final void a() {
            boolean z10;
            this.f15352f = null;
            E e10 = this.f15351e;
            if (e10 != null) {
                while (true) {
                    E a10 = e10.a();
                    this.f15351e = a10;
                    if (a10 == null) {
                        break;
                    } else if (b(a10)) {
                        z10 = true;
                        break;
                    } else {
                        e10 = this.f15351e;
                    }
                }
            }
            z10 = false;
            if (!z10 && !d()) {
                while (true) {
                    int i10 = this.f15347a;
                    if (i10 >= 0) {
                        l<K, V, E, S>[] lVarArr = i.this.f15334c;
                        this.f15347a = i10 - 1;
                        l<K, V, E, S> lVar = lVarArr[i10];
                        this.f15349c = lVar;
                        if (lVar.f15357b != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f15349c.f15360e;
                            this.f15350d = atomicReferenceArray;
                            this.f15348b = atomicReferenceArray.length() - 1;
                            if (d()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public final boolean b(E e10) {
            Object obj;
            boolean z10;
            try {
                Object key = e10.getKey();
                i.this.getClass();
                if (e10.getKey() == null) {
                    obj = null;
                } else {
                    obj = e10.getValue();
                }
                if (obj != null) {
                    this.f15352f = new t(key, obj);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f15349c.f();
            }
        }

        public final i<K, V, E, S>.t c() {
            i<K, V, E, S>.t tVar = this.f15352f;
            if (tVar != null) {
                this.f15353n = tVar;
                a();
                return this.f15353n;
            }
            throw new NoSuchElementException();
        }

        public final boolean d() {
            while (true) {
                int i10 = this.f15348b;
                boolean z10 = false;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f15350d;
                this.f15348b = i10 - 1;
                E e10 = (g) atomicReferenceArray.get(i10);
                this.f15351e = e10;
                if (e10 != null) {
                    if (b(e10)) {
                        break;
                    }
                    E e11 = this.f15351e;
                    if (e11 != null) {
                        while (true) {
                            E a10 = e11.a();
                            this.f15351e = a10;
                            if (a10 == null) {
                                break;
                            } else if (b(a10)) {
                                z10 = true;
                                break;
                            } else {
                                e11 = this.f15351e;
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            return true;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f15352f != null) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z10;
            i<K, V, E, S>.t tVar = this.f15353n;
            if (tVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i.this.remove(tVar.f15371a);
                this.f15353n = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* compiled from: MapMakerInternalMap */
    public interface g<K, V, E extends g<K, V, E>> {
        E a();

        int b();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap */
    public interface h<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> {
        l a(i iVar, int i10);

        m b();

        E c(S s10, E e10, E e11);

        void d(S s10, E e10, V v2);

        E e(S s10, K k10, int i10, E e10);
    }

    /* renamed from: u8.i$i  reason: collision with other inner class name */
    /* compiled from: MapMakerInternalMap */
    public final class C0206i extends i<K, V, E, S>.f<K> {
        public C0206i(i iVar) {
            super();
        }

        public final K next() {
            return c().f15371a;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class j extends k<K> {
        public j() {
        }

        public final void clear() {
            i.this.clear();
        }

        public final boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        public final boolean isEmpty() {
            return i.this.isEmpty();
        }

        public final java.util.Iterator<K> iterator() {
            return new C0206i(i.this);
        }

        public final boolean remove(Object obj) {
            if (i.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return i.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static abstract class k<E> extends AbstractSet<E> {
        public final Object[] toArray() {
            return i.b(this).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return i.b(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static abstract class l<K, V, E extends g<K, V, E>, S extends l<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a  reason: collision with root package name */
        public final i<K, V, E, S> f15356a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f15357b;

        /* renamed from: c  reason: collision with root package name */
        public int f15358c;

        /* renamed from: d  reason: collision with root package name */
        public int f15359d;

        /* renamed from: e  reason: collision with root package name */
        public volatile AtomicReferenceArray<E> f15360e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicInteger f15361f = new AtomicInteger();

        public l(i iVar, int i10) {
            this.f15356a = iVar;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i10);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f15359d = length;
            if (length == -1) {
                this.f15359d = length + 1;
            }
            this.f15360e = atomicReferenceArray;
        }

        /* JADX INFO: finally extract failed */
        public final void a(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    g gVar = (g) poll;
                    i<K, V, E, S> iVar = this.f15356a;
                    iVar.getClass();
                    int b10 = gVar.b();
                    l<K, V, E, S> d10 = iVar.d(b10);
                    d10.lock();
                    try {
                        AtomicReferenceArray<E> atomicReferenceArray = d10.f15360e;
                        int length = b10 & (atomicReferenceArray.length() - 1);
                        g gVar2 = (g) atomicReferenceArray.get(length);
                        g gVar3 = gVar2;
                        while (true) {
                            if (gVar3 == null) {
                                break;
                            } else if (gVar3 == gVar) {
                                d10.f15358c++;
                                atomicReferenceArray.set(length, d10.h(gVar2, gVar3));
                                d10.f15357b--;
                                break;
                            } else {
                                gVar3 = gVar3.a();
                            }
                        }
                        d10.unlock();
                        i10++;
                    } catch (Throwable th2) {
                        d10.unlock();
                        throw th2;
                    }
                } else {
                    return;
                }
            } while (i10 != 16);
        }

        public final void b() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f15360e;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i10 = this.f15357b;
                AtomicReferenceArray<E> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
                this.f15359d = (atomicReferenceArray2.length() * 3) / 4;
                int length2 = atomicReferenceArray2.length() - 1;
                for (int i11 = 0; i11 < length; i11++) {
                    g gVar = (g) atomicReferenceArray.get(i11);
                    if (gVar != null) {
                        g a10 = gVar.a();
                        int b10 = gVar.b() & length2;
                        if (a10 == null) {
                            atomicReferenceArray2.set(b10, gVar);
                        } else {
                            g gVar2 = gVar;
                            while (a10 != null) {
                                int b11 = a10.b() & length2;
                                if (b11 != b10) {
                                    gVar2 = a10;
                                    b10 = b11;
                                }
                                a10 = a10.a();
                            }
                            atomicReferenceArray2.set(b10, gVar2);
                            while (gVar != gVar2) {
                                int b12 = gVar.b() & length2;
                                E c10 = this.f15356a.f15337f.c(j(), gVar, (g) atomicReferenceArray2.get(b12));
                                if (c10 != null) {
                                    atomicReferenceArray2.set(b12, c10);
                                } else {
                                    i10--;
                                }
                                gVar = gVar.a();
                            }
                        }
                    }
                }
                this.f15360e = atomicReferenceArray2;
                this.f15357b = i10;
            }
        }

        public final g c(int i10, Object obj) {
            if (this.f15357b != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f15360e;
                for (g gVar = (g) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i10); gVar != null; gVar = gVar.a()) {
                    if (gVar.b() == i10) {
                        Object key = gVar.getKey();
                        if (key == null) {
                            l();
                        } else if (this.f15356a.f15336e.c(obj, key)) {
                            return gVar;
                        }
                    }
                }
            }
            return null;
        }

        public void d() {
        }

        public void e() {
        }

        public final void f() {
            if ((this.f15361f.incrementAndGet() & 63) == 0) {
                i();
            }
        }

        public final V g(K k10, int i10, V v2, boolean z10) {
            lock();
            try {
                i();
                int i11 = this.f15357b + 1;
                if (i11 > this.f15359d) {
                    b();
                    i11 = this.f15357b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f15360e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                g gVar = (g) atomicReferenceArray.get(length);
                g gVar2 = gVar;
                while (gVar2 != null) {
                    Object key = gVar2.getKey();
                    if (gVar2.b() != i10 || key == null || !this.f15356a.f15336e.c(k10, key)) {
                        gVar2 = gVar2.a();
                    } else {
                        V value = gVar2.getValue();
                        if (value == null) {
                            this.f15358c++;
                            k(gVar2, v2);
                            this.f15357b = this.f15357b;
                            return null;
                        } else if (z10) {
                            unlock();
                            return value;
                        } else {
                            this.f15358c++;
                            k(gVar2, v2);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f15358c++;
                E e10 = this.f15356a.f15337f.e(j(), k10, i10, gVar);
                k(e10, v2);
                atomicReferenceArray.set(length, e10);
                this.f15357b = i11;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        public final E h(E e10, E e11) {
            int i10 = this.f15357b;
            E a10 = e11.a();
            while (e10 != e11) {
                E c10 = this.f15356a.f15337f.c(j(), e10, a10);
                if (c10 != null) {
                    a10 = c10;
                } else {
                    i10--;
                }
                e10 = e10.a();
            }
            this.f15357b = i10;
            return a10;
        }

        public final void i() {
            if (tryLock()) {
                try {
                    e();
                    this.f15361f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S j();

        public final void k(E e10, V v2) {
            this.f15356a.f15337f.d(j(), e10, v2);
        }

        public final void l() {
            if (tryLock()) {
                try {
                    e();
                } finally {
                    unlock();
                }
            }
        }
    }

    /* compiled from: MapMakerInternalMap */
    public enum m {
        ;

        /* 'enum' modifier removed */
        /* compiled from: MapMakerInternalMap */
        public final class a extends m {
            public a() {
                super("STRONG", 0);
            }

            public final t8.a<Object> b() {
                return a.C0195a.f14904a;
            }
        }

        /* 'enum' modifier removed */
        /* compiled from: MapMakerInternalMap */
        public final class b extends m {
            public b() {
                super("WEAK", 1);
            }

            public final t8.a<Object> b() {
                return a.b.f14905a;
            }
        }

        /* access modifiers changed from: public */
        m() {
            throw null;
        }

        public abstract t8.a<Object> b();
    }

    /* compiled from: MapMakerInternalMap */
    public static final class n<K, V> extends b<K, V, n<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile V f15365d = null;

        /* compiled from: MapMakerInternalMap */
        public static final class a<K, V> implements h<K, V, n<K, V>, o<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f15366a = new a<>();

            public final l a(i iVar, int i10) {
                return new o(iVar, i10);
            }

            public final m b() {
                return m.f15362a;
            }

            public final g c(l lVar, g gVar, g gVar2) {
                o oVar = (o) lVar;
                n nVar = (n) gVar;
                n nVar2 = new n(nVar.f15341a, nVar.f15342b, (n) gVar2);
                nVar2.f15365d = nVar.f15365d;
                return nVar2;
            }

            public final void d(l lVar, g gVar, Object obj) {
                o oVar = (o) lVar;
                ((n) gVar).f15365d = obj;
            }

            public final g e(l lVar, Object obj, int i10, g gVar) {
                o oVar = (o) lVar;
                return new n(obj, i10, (n) gVar);
            }
        }

        public n(K k10, int i10, n<K, V> nVar) {
            super(k10, i10, nVar);
        }

        public final V getValue() {
            return this.f15365d;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static final class o<K, V> extends l<K, V, n<K, V>, o<K, V>> {
        public o(i iVar, int i10) {
            super(iVar, i10);
        }

        public final l j() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class p extends i<K, V, E, S>.f<V> {
        public p(i iVar) {
            super();
        }

        public final V next() {
            return c().f15372b;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class q extends AbstractCollection<V> {
        public q() {
        }

        public final void clear() {
            i.this.clear();
        }

        public final boolean contains(Object obj) {
            return i.this.containsValue(obj);
        }

        public final boolean isEmpty() {
            return i.this.isEmpty();
        }

        public final java.util.Iterator<V> iterator() {
            return new p(i.this);
        }

        public final int size() {
            return i.this.size();
        }

        public final Object[] toArray() {
            return i.b(this).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return i.b(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static final class r<K, V> extends c<K, V, r<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public volatile V f15368c = null;

        /* compiled from: MapMakerInternalMap */
        public static final class a<K, V> implements h<K, V, r<K, V>, s<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f15369a = new a<>();

            public final l a(i iVar, int i10) {
                return new s(iVar, i10);
            }

            public final m b() {
                return m.f15362a;
            }

            public final g c(l lVar, g gVar, g gVar2) {
                s sVar = (s) lVar;
                r rVar = (r) gVar;
                r rVar2 = (r) gVar2;
                if (rVar.get() == null) {
                    return null;
                }
                r rVar3 = new r(sVar.f15370n, rVar.get(), rVar.f15344a, rVar2);
                rVar3.f15368c = rVar.f15368c;
                return rVar3;
            }

            public final void d(l lVar, g gVar, Object obj) {
                s sVar = (s) lVar;
                ((r) gVar).f15368c = obj;
            }

            public final g e(l lVar, Object obj, int i10, g gVar) {
                return new r(((s) lVar).f15370n, obj, i10, (r) gVar);
            }
        }

        public r(ReferenceQueue<K> referenceQueue, K k10, int i10, r<K, V> rVar) {
            super(referenceQueue, k10, i10, rVar);
        }

        public final V getValue() {
            return this.f15368c;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public static final class s<K, V> extends l<K, V, r<K, V>, s<K, V>> {

        /* renamed from: n  reason: collision with root package name */
        public final ReferenceQueue<K> f15370n = new ReferenceQueue<>();

        public s(i iVar, int i10) {
            super(iVar, i10);
        }

        public final void d() {
            do {
            } while (this.f15370n.poll() != null);
        }

        public final void e() {
            a(this.f15370n);
        }

        public final l j() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap */
    public final class t extends b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f15371a;

        /* renamed from: b  reason: collision with root package name */
        public V f15372b;

        public t(K k10, V v2) {
            this.f15371a = k10;
            this.f15372b = v2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f15371a.equals(entry.getKey()) || !this.f15372b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public final K getKey() {
            return this.f15371a;
        }

        public final V getValue() {
            return this.f15372b;
        }

        public final int hashCode() {
            return this.f15371a.hashCode() ^ this.f15372b.hashCode();
        }

        public final V setValue(V v2) {
            V put = i.this.put(this.f15371a, v2);
            this.f15372b = v2;
            return put;
        }
    }

    static {
        new a();
    }

    public i(h hVar, h<K, V, E, S> hVar2) {
        t8.a<Object> b10 = hVar.a().b();
        if (b10 != null) {
            this.f15336e = b10;
            this.f15337f = hVar2;
            int min = Math.min(16, 1073741824);
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            int i13 = 1;
            while (i13 < this.f15335d) {
                i12++;
                i13 <<= 1;
            }
            this.f15333b = 32 - i12;
            this.f15332a = i13 - 1;
            this.f15334c = new l[i13];
            int i14 = min / i13;
            while (i11 < (i13 * i14 < min ? i14 + 1 : i14)) {
                i11 <<= 1;
            }
            while (true) {
                l<K, V, E, S>[] lVarArr = this.f15334c;
                if (i10 < lVarArr.length) {
                    lVarArr[i10] = this.f15337f.a(this, i11);
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new NullPointerException("Both parameters are null");
        }
    }

    public static ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final int c(Object obj) {
        int i10;
        t8.a<Object> aVar = this.f15336e;
        if (obj == null) {
            aVar.getClass();
            i10 = 0;
        } else {
            i10 = aVar.b(obj);
        }
        int i11 = i10 + ((i10 << 15) ^ -12931);
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = (i14 << 2) + (i14 << 14) + i14;
        return (i15 >>> 16) ^ i15;
    }

    public final void clear() {
        l<K, V, E, S>[] lVarArr = this.f15334c;
        int length = lVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            l<K, V, E, S> lVar = lVarArr[i10];
            if (lVar.f15357b != 0) {
                lVar.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = lVar.f15360e;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, (Object) null);
                    }
                    lVar.d();
                    lVar.f15361f.set(0);
                    lVar.f15358c++;
                    lVar.f15357b = 0;
                } finally {
                    lVar.unlock();
                }
            }
        }
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final boolean containsKey(Object obj) {
        g c10;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int c11 = c(obj);
        l d10 = d(c11);
        d10.getClass();
        try {
            if (!(d10.f15357b == 0 || (c10 = d10.c(c11, obj)) == null || c10.getValue() == null)) {
                z10 = true;
            }
            return z10;
        } finally {
            d10.f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[LOOP:3: B:12:0x0029->B:24:0x0056, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0054 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsValue(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            u8.i$l<K, V, E, S>[] r3 = r0.f15334c
            r4 = -1
            r6 = r2
        L_0x000d:
            r7 = 3
            if (r6 >= r7) goto L_0x0073
            r7 = 0
            int r9 = r3.length
            r10 = r2
        L_0x0014:
            if (r10 >= r9) goto L_0x0068
            r11 = r3[r10]
            int r12 = r11.f15357b
            java.util.concurrent.atomic.AtomicReferenceArray<E> r12 = r11.f15360e
            r13 = r2
        L_0x001d:
            int r14 = r12.length()
            if (r13 >= r14) goto L_0x0060
            java.lang.Object r14 = r12.get(r13)
            u8.i$g r14 = (u8.i.g) r14
        L_0x0029:
            if (r14 == 0) goto L_0x005c
            java.lang.Object r15 = r14.getKey()
            r16 = 0
            if (r15 != 0) goto L_0x0037
            r11.l()
            goto L_0x0040
        L_0x0037:
            java.lang.Object r15 = r14.getValue()
            if (r15 != 0) goto L_0x0042
            r11.l()
        L_0x0040:
            r15 = r16
        L_0x0042:
            if (r15 == 0) goto L_0x0056
            u8.i$h<K, V, E, S> r2 = r0.f15337f
            u8.i$m r2 = r2.b()
            t8.a r2 = r2.b()
            boolean r2 = r2.c(r1, r15)
            if (r2 == 0) goto L_0x0056
            r1 = 1
            return r1
        L_0x0056:
            u8.i$g r14 = r14.a()
            r2 = 0
            goto L_0x0029
        L_0x005c:
            int r13 = r13 + 1
            r2 = 0
            goto L_0x001d
        L_0x0060:
            int r2 = r11.f15358c
            long r11 = (long) r2
            long r7 = r7 + r11
            int r10 = r10 + 1
            r2 = 0
            goto L_0x0014
        L_0x0068:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x006e
            r1 = 0
            goto L_0x0074
        L_0x006e:
            int r6 = r6 + 1
            r4 = r7
            r2 = 0
            goto L_0x000d
        L_0x0073:
            r1 = r2
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.containsValue(java.lang.Object):boolean");
    }

    public final l<K, V, E, S> d(int i10) {
        return this.f15334c[(i10 >>> this.f15333b) & this.f15332a];
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f15340p;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f15340p = eVar2;
        return eVar2;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final V get(Object obj) {
        V v2 = null;
        if (obj == null) {
            return null;
        }
        int c10 = c(obj);
        l d10 = d(c10);
        d10.getClass();
        try {
            g c11 = d10.c(c10, obj);
            if (c11 != null) {
                v2 = c11.getValue();
                if (v2 == null) {
                    d10.l();
                }
            }
            return v2;
        } finally {
            d10.f();
        }
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final boolean isEmpty() {
        l<K, V, E, S>[] lVarArr = this.f15334c;
        long j10 = 0;
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            if (lVarArr[i10].f15357b != 0) {
                return false;
            }
            j10 += (long) lVarArr[i10].f15358c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < lVarArr.length; i11++) {
            if (lVarArr[i11].f15357b != 0) {
                return false;
            }
            j10 -= (long) lVarArr[i11].f15358c;
        }
        if (j10 == 0) {
            return true;
        }
        return false;
    }

    public final Set<K> keySet() {
        j jVar = this.f15338n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j();
        this.f15338n = jVar2;
        return jVar2;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final V put(K k10, V v2) {
        k10.getClass();
        v2.getClass();
        int c10 = c(k10);
        return d(c10).g(k10, c10, v2, false);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final V putIfAbsent(K k10, V v2) {
        k10.getClass();
        v2.getClass();
        int c10 = c(k10);
        return d(c10).g(k10, c10, v2, true);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if ((r7.getValue() == null) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r10.c(r11)
            u8.i$l r2 = r10.d(r1)
            r2.lock()
            r2.i()     // Catch:{ all -> 0x006b }
            java.util.concurrent.atomic.AtomicReferenceArray<E> r3 = r2.f15360e     // Catch:{ all -> 0x006b }
            int r4 = r3.length()     // Catch:{ all -> 0x006b }
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch:{ all -> 0x006b }
            u8.i$g r6 = (u8.i.g) r6     // Catch:{ all -> 0x006b }
            r7 = r6
        L_0x0022:
            if (r7 == 0) goto L_0x0067
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x006b }
            int r9 = r7.b()     // Catch:{ all -> 0x006b }
            if (r9 != r1) goto L_0x0062
            if (r8 == 0) goto L_0x0062
            u8.i<K, V, E, S> r9 = r2.f15356a     // Catch:{ all -> 0x006b }
            t8.a<java.lang.Object> r9 = r9.f15336e     // Catch:{ all -> 0x006b }
            boolean r8 = r9.c(r11, r8)     // Catch:{ all -> 0x006b }
            if (r8 == 0) goto L_0x0062
            java.lang.Object r11 = r7.getValue()     // Catch:{ all -> 0x006b }
            if (r11 == 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0049
            r1 = r5
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0067
        L_0x004c:
            int r0 = r2.f15358c     // Catch:{ all -> 0x006b }
            int r0 = r0 + r5
            r2.f15358c = r0     // Catch:{ all -> 0x006b }
            u8.i$g r0 = r2.h(r6, r7)     // Catch:{ all -> 0x006b }
            int r1 = r2.f15357b     // Catch:{ all -> 0x006b }
            int r1 = r1 - r5
            r3.set(r4, r0)     // Catch:{ all -> 0x006b }
            r2.f15357b = r1     // Catch:{ all -> 0x006b }
            r2.unlock()
            r0 = r11
            goto L_0x006a
        L_0x0062:
            u8.i$g r7 = r7.a()     // Catch:{ all -> 0x006b }
            goto L_0x0022
        L_0x0067:
            r2.unlock()
        L_0x006a:
            return r0
        L_0x006b:
            r11 = move-exception
            r2.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.remove(java.lang.Object):java.lang.Object");
    }

    public final V replace(K k10, V v2) {
        k10.getClass();
        v2.getClass();
        int c10 = c(k10);
        l d10 = d(c10);
        d10.lock();
        try {
            d10.i();
            AtomicReferenceArray<E> atomicReferenceArray = d10.f15360e;
            int length = (atomicReferenceArray.length() - 1) & c10;
            g gVar = (g) atomicReferenceArray.get(length);
            g gVar2 = gVar;
            while (true) {
                if (gVar2 == null) {
                    break;
                }
                Object key = gVar2.getKey();
                if (gVar2.b() != c10 || key == null || !d10.f15356a.f15336e.c(k10, key)) {
                    gVar2 = gVar2.a();
                } else {
                    V value = gVar2.getValue();
                    if (value == null) {
                        if (gVar2.getValue() == null) {
                            d10.f15358c++;
                            atomicReferenceArray.set(length, d10.h(gVar, gVar2));
                            d10.f15357b--;
                        }
                    } else {
                        d10.f15358c++;
                        d10.k(gVar2, v2);
                        d10.unlock();
                        return value;
                    }
                }
            }
            return null;
        } finally {
            d10.unlock();
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final int size() {
        l<K, V, E, S>[] lVarArr = this.f15334c;
        long j10 = 0;
        for (l<K, V, E, S> lVar : lVarArr) {
            j10 += (long) lVar.f15357b;
        }
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public final Collection<V> values() {
        q qVar = this.f15339o;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q();
        this.f15339o = qVar2;
        return qVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if ((r7.getValue() == null) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0080
            if (r12 != 0) goto L_0x0007
            goto L_0x0080
        L_0x0007:
            int r1 = r10.c(r11)
            u8.i$l r2 = r10.d(r1)
            r2.lock()
            r2.i()     // Catch:{ all -> 0x007b }
            java.util.concurrent.atomic.AtomicReferenceArray<E> r3 = r2.f15360e     // Catch:{ all -> 0x007b }
            int r4 = r3.length()     // Catch:{ all -> 0x007b }
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch:{ all -> 0x007b }
            u8.i$g r6 = (u8.i.g) r6     // Catch:{ all -> 0x007b }
            r7 = r6
        L_0x0025:
            if (r7 == 0) goto L_0x0077
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x007b }
            int r9 = r7.b()     // Catch:{ all -> 0x007b }
            if (r9 != r1) goto L_0x0072
            if (r8 == 0) goto L_0x0072
            u8.i<K, V, E, S> r9 = r2.f15356a     // Catch:{ all -> 0x007b }
            t8.a<java.lang.Object> r9 = r9.f15336e     // Catch:{ all -> 0x007b }
            boolean r8 = r9.c(r11, r8)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0072
            java.lang.Object r11 = r7.getValue()     // Catch:{ all -> 0x007b }
            u8.i<K, V, E, S> r1 = r2.f15356a     // Catch:{ all -> 0x007b }
            u8.i$h<K, V, E, S> r1 = r1.f15337f     // Catch:{ all -> 0x007b }
            u8.i$m r1 = r1.b()     // Catch:{ all -> 0x007b }
            t8.a r1 = r1.b()     // Catch:{ all -> 0x007b }
            boolean r11 = r1.c(r12, r11)     // Catch:{ all -> 0x007b }
            if (r11 == 0) goto L_0x0055
            r0 = r5
            goto L_0x0060
        L_0x0055:
            java.lang.Object r11 = r7.getValue()     // Catch:{ all -> 0x007b }
            if (r11 != 0) goto L_0x005d
            r11 = r5
            goto L_0x005e
        L_0x005d:
            r11 = r0
        L_0x005e:
            if (r11 == 0) goto L_0x0077
        L_0x0060:
            int r11 = r2.f15358c     // Catch:{ all -> 0x007b }
            int r11 = r11 + r5
            r2.f15358c = r11     // Catch:{ all -> 0x007b }
            u8.i$g r11 = r2.h(r6, r7)     // Catch:{ all -> 0x007b }
            int r12 = r2.f15357b     // Catch:{ all -> 0x007b }
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch:{ all -> 0x007b }
            r2.f15357b = r12     // Catch:{ all -> 0x007b }
            goto L_0x0077
        L_0x0072:
            u8.i$g r7 = r7.a()     // Catch:{ all -> 0x007b }
            goto L_0x0025
        L_0x0077:
            r2.unlock()
            return r0
        L_0x007b:
            r11 = move-exception
            r2.unlock()
            throw r11
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean replace(K k10, V v2, V v10) {
        k10.getClass();
        v10.getClass();
        if (v2 == null) {
            return false;
        }
        int c10 = c(k10);
        l d10 = d(c10);
        d10.lock();
        try {
            d10.i();
            AtomicReferenceArray<E> atomicReferenceArray = d10.f15360e;
            int length = (atomicReferenceArray.length() - 1) & c10;
            g gVar = (g) atomicReferenceArray.get(length);
            g gVar2 = gVar;
            while (true) {
                if (gVar2 == null) {
                    break;
                }
                Object key = gVar2.getKey();
                if (gVar2.b() != c10 || key == null || !d10.f15356a.f15336e.c(k10, key)) {
                    gVar2 = gVar2.a();
                } else {
                    Object value = gVar2.getValue();
                    if (value == null) {
                        if (gVar2.getValue() == null) {
                            d10.f15358c++;
                            atomicReferenceArray.set(length, d10.h(gVar, gVar2));
                            d10.f15357b--;
                        }
                    } else if (d10.f15356a.f15337f.b().b().c(v2, value)) {
                        d10.f15358c++;
                        d10.k(gVar2, v10);
                        d10.unlock();
                        return true;
                    }
                }
            }
            return false;
        } finally {
            d10.unlock();
        }
    }
}
