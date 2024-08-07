package dc;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
public final class p<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: p  reason: collision with root package name */
    public static final a f8912p = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<? super K> f8913a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8914b;

    /* renamed from: c  reason: collision with root package name */
    public e<K, V> f8915c;

    /* renamed from: d  reason: collision with root package name */
    public int f8916d;

    /* renamed from: e  reason: collision with root package name */
    public int f8917e;

    /* renamed from: f  reason: collision with root package name */
    public final e<K, V> f8918f;

    /* renamed from: n  reason: collision with root package name */
    public p<K, V>.b f8919n;

    /* renamed from: o  reason: collision with root package name */
    public p<K, V>.c f8920o;

    /* compiled from: LinkedTreeMap */
    public class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* compiled from: LinkedTreeMap */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap */
        public class a extends p<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        public final void clear() {
            p.this.clear();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || p.this.c((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = p.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            p.this.e(c10, true);
            return true;
        }

        public final int size() {
            return p.this.f8916d;
        }
    }

    /* compiled from: LinkedTreeMap */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap */
        public class a extends p<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public final K next() {
                return a().f8932f;
            }
        }

        public c() {
        }

        public final void clear() {
            p.this.clear();
        }

        public final boolean contains(Object obj) {
            return p.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            p pVar = p.this;
            pVar.getClass();
            e eVar = null;
            if (obj != null) {
                try {
                    eVar = pVar.b(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                pVar.e(eVar, true);
            }
            if (eVar != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return p.this.f8916d;
        }
    }

    /* compiled from: LinkedTreeMap */
    public abstract class d<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f8923a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f8924b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f8925c;

        public d() {
            this.f8923a = p.this.f8918f.f8930d;
            this.f8925c = p.this.f8917e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f8923a;
            p pVar = p.this;
            if (eVar == pVar.f8918f) {
                throw new NoSuchElementException();
            } else if (pVar.f8917e == this.f8925c) {
                this.f8923a = eVar.f8930d;
                this.f8924b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f8923a != p.this.f8918f) {
                return true;
            }
            return false;
        }

        public final void remove() {
            e<K, V> eVar = this.f8924b;
            if (eVar != null) {
                p.this.e(eVar, true);
                this.f8924b = null;
                this.f8925c = p.this.f8917e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<p> cls = p.class;
    }

    public p(boolean z10) {
        a aVar = f8912p;
        this.f8916d = 0;
        this.f8917e = 0;
        this.f8913a = aVar;
        this.f8914b = z10;
        this.f8918f = new e<>(z10);
    }

    public final e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        Comparator<? super K> comparator = this.f8913a;
        e<K, V> eVar3 = this.f8915c;
        if (eVar3 != null) {
            if (comparator == f8912p) {
                comparable = (Comparable) k10;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar3.f8932f);
                } else {
                    i10 = comparator.compare(k10, eVar3.f8932f);
                }
                if (i10 == 0) {
                    return eVar3;
                }
                if (i10 < 0) {
                    eVar2 = eVar3.f8928b;
                } else {
                    eVar2 = eVar3.f8929c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f8918f;
        if (eVar3 != null) {
            eVar = new e<>(this.f8914b, eVar3, k10, eVar4, eVar4.f8931e);
            if (i10 < 0) {
                eVar3.f8928b = eVar;
            } else {
                eVar3.f8929c = eVar;
            }
            d(eVar3, true);
        } else if (comparator != f8912p || (k10 instanceof Comparable)) {
            eVar = new e<>(this.f8914b, eVar3, k10, eVar4, eVar4.f8931e);
            this.f8915c = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f8916d++;
        this.f8917e++;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dc.p.e<K, V> c(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            dc.p$e r0 = r4.b(r0, r1)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            if (r0 == 0) goto L_0x001d
            V r3 = r0.f8934o
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            r2 = r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.p.c(java.util.Map$Entry):dc.p$e");
    }

    public final void clear() {
        this.f8915c = null;
        this.f8916d = 0;
        this.f8917e++;
        e<K, V> eVar = this.f8918f;
        eVar.f8931e = eVar;
        eVar.f8930d = eVar;
    }

    public final boolean containsKey(Object obj) {
        e eVar = null;
        if (obj != null) {
            try {
                eVar = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (eVar != null) {
            return true;
        }
        return false;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f8928b;
            e<K, V> eVar3 = eVar.f8929c;
            int i14 = 0;
            if (eVar2 != null) {
                i10 = eVar2.f8935p;
            } else {
                i10 = 0;
            }
            if (eVar3 != null) {
                i11 = eVar3.f8935p;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                e<K, V> eVar4 = eVar3.f8928b;
                e<K, V> eVar5 = eVar3.f8929c;
                if (eVar5 != null) {
                    i13 = eVar5.f8935p;
                } else {
                    i13 = 0;
                }
                if (eVar4 != null) {
                    i14 = eVar4.f8935p;
                }
                int i16 = i14 - i13;
                if (i16 == -1 || (i16 == 0 && !z10)) {
                    g(eVar);
                } else {
                    h(eVar3);
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                e<K, V> eVar6 = eVar2.f8928b;
                e<K, V> eVar7 = eVar2.f8929c;
                if (eVar7 != null) {
                    i12 = eVar7.f8935p;
                } else {
                    i12 = 0;
                }
                if (eVar6 != null) {
                    i14 = eVar6.f8935p;
                }
                int i17 = i14 - i12;
                if (i17 == 1 || (i17 == 0 && !z10)) {
                    h(eVar);
                } else {
                    g(eVar2);
                    h(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                eVar.f8935p = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f8935p = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f8927a;
        }
    }

    public final void e(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        int i10;
        e<K, V> eVar3;
        if (z10) {
            e<K, V> eVar4 = eVar.f8931e;
            eVar4.f8930d = eVar.f8930d;
            eVar.f8930d.f8931e = eVar4;
        }
        e<K, V> eVar5 = eVar.f8928b;
        e<K, V> eVar6 = eVar.f8929c;
        e<K, V> eVar7 = eVar.f8927a;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f8928b = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f8929c = null;
            } else {
                f(eVar, (e<K, V>) null);
            }
            d(eVar7, false);
            this.f8916d--;
            this.f8917e++;
            return;
        }
        if (eVar5.f8935p > eVar6.f8935p) {
            e<K, V> eVar8 = eVar5.f8929c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f8929c;
            }
        } else {
            e<K, V> eVar10 = eVar6.f8928b;
            while (true) {
                e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f8928b;
            }
            eVar2 = eVar3;
        }
        e(eVar2, false);
        e<K, V> eVar12 = eVar.f8928b;
        if (eVar12 != null) {
            i10 = eVar12.f8935p;
            eVar2.f8928b = eVar12;
            eVar12.f8927a = eVar2;
            eVar.f8928b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar13 = eVar.f8929c;
        if (eVar13 != null) {
            i11 = eVar13.f8935p;
            eVar2.f8929c = eVar13;
            eVar13.f8927a = eVar2;
            eVar.f8929c = null;
        }
        eVar2.f8935p = Math.max(i10, i11) + 1;
        f(eVar, eVar2);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        p<K, V>.b bVar = this.f8919n;
        if (bVar != null) {
            return bVar;
        }
        p<K, V>.b bVar2 = new b();
        this.f8919n = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f8927a;
        eVar.f8927a = null;
        if (eVar2 != null) {
            eVar2.f8927a = eVar3;
        }
        if (eVar3 == null) {
            this.f8915c = eVar2;
        } else if (eVar3.f8928b == eVar) {
            eVar3.f8928b = eVar2;
        } else {
            eVar3.f8929c = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f8928b;
        e<K, V> eVar3 = eVar.f8929c;
        e<K, V> eVar4 = eVar3.f8928b;
        e<K, V> eVar5 = eVar3.f8929c;
        eVar.f8929c = eVar4;
        if (eVar4 != null) {
            eVar4.f8927a = eVar;
        }
        f(eVar, eVar3);
        eVar3.f8928b = eVar;
        eVar.f8927a = eVar3;
        int i12 = 0;
        if (eVar2 != null) {
            i10 = eVar2.f8935p;
        } else {
            i10 = 0;
        }
        if (eVar4 != null) {
            i11 = eVar4.f8935p;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f8935p = max;
        if (eVar5 != null) {
            i12 = eVar5.f8935p;
        }
        eVar3.f8935p = Math.max(max, i12) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            dc.p$e r3 = r2.b(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.f8934o
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.p.get(java.lang.Object):java.lang.Object");
    }

    public final void h(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f8928b;
        e<K, V> eVar3 = eVar.f8929c;
        e<K, V> eVar4 = eVar2.f8928b;
        e<K, V> eVar5 = eVar2.f8929c;
        eVar.f8928b = eVar5;
        if (eVar5 != null) {
            eVar5.f8927a = eVar;
        }
        f(eVar, eVar2);
        eVar2.f8929c = eVar;
        eVar.f8927a = eVar2;
        int i12 = 0;
        if (eVar3 != null) {
            i10 = eVar3.f8935p;
        } else {
            i10 = 0;
        }
        if (eVar5 != null) {
            i11 = eVar5.f8935p;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f8935p = max;
        if (eVar4 != null) {
            i12 = eVar4.f8935p;
        }
        eVar2.f8935p = Math.max(max, i12) + 1;
    }

    public final Set<K> keySet() {
        p<K, V>.c cVar = this.f8920o;
        if (cVar != null) {
            return cVar;
        }
        p<K, V>.c cVar2 = new c();
        this.f8920o = cVar2;
        return cVar2;
    }

    public final V put(K k10, V v2) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        } else if (v2 != null || this.f8914b) {
            e b10 = b(k10, true);
            V v10 = b10.f8934o;
            b10.f8934o = v2;
            return v10;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            dc.p$e r3 = r2.b(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.e(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            V r0 = r3.f8934o
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.p.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f8916d;
    }

    /* compiled from: LinkedTreeMap */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f8927a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f8928b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f8929c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f8930d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f8931e;

        /* renamed from: f  reason: collision with root package name */
        public final K f8932f;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f8933n;

        /* renamed from: o  reason: collision with root package name */
        public V f8934o;

        /* renamed from: p  reason: collision with root package name */
        public int f8935p;

        public e(boolean z10) {
            this.f8932f = null;
            this.f8933n = z10;
            this.f8931e = this;
            this.f8930d = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f8932f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f8934o
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.p.e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f8932f;
        }

        public final V getValue() {
            return this.f8934o;
        }

        public final int hashCode() {
            int i10;
            K k10 = this.f8932f;
            int i11 = 0;
            if (k10 == null) {
                i10 = 0;
            } else {
                i10 = k10.hashCode();
            }
            V v2 = this.f8934o;
            if (v2 != null) {
                i11 = v2.hashCode();
            }
            return i10 ^ i11;
        }

        public final V setValue(V v2) {
            if (v2 != null || this.f8933n) {
                V v10 = this.f8934o;
                this.f8934o = v2;
                return v10;
            }
            throw new NullPointerException("value == null");
        }

        public final String toString() {
            return this.f8932f + "=" + this.f8934o;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f8927a = eVar;
            this.f8932f = k10;
            this.f8933n = z10;
            this.f8935p = 1;
            this.f8930d = eVar2;
            this.f8931e = eVar3;
            eVar3.f8930d = this;
            eVar2.f8931e = this;
        }
    }

    public p() {
        this(true);
    }
}
