package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f13600a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f13601b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f13602c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f13603d = 0;

    /* compiled from: SafeIterableMap */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f13607d;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f13606c;
        }
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    public static class C0165b<K, V> extends e<K, V> {
        public C0165b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f13606c;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f13607d;
        }
    }

    /* compiled from: SafeIterableMap */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f13604a;

        /* renamed from: b  reason: collision with root package name */
        public final V f13605b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f13606c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f13607d;

        public c(K k10, V v2) {
            this.f13604a = k10;
            this.f13605b = v2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f13604a.equals(cVar.f13604a) || !this.f13605b.equals(cVar.f13605b)) {
                return false;
            }
            return true;
        }

        public final K getKey() {
            return this.f13604a;
        }

        public final V getValue() {
            return this.f13605b;
        }

        public final int hashCode() {
            return this.f13604a.hashCode() ^ this.f13605b.hashCode();
        }

        public final V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f13604a + "=" + this.f13605b;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f13608a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13609b = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            boolean z10;
            c<K, V> cVar2 = this.f13608a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f13607d;
                this.f13608a = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13609b = z10;
            }
        }

        public final boolean hasNext() {
            if (!this.f13609b) {
                c<K, V> cVar = this.f13608a;
                if (cVar == null || cVar.f13606c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f13600a != null) {
                return true;
            } else {
                return false;
            }
        }

        public final Object next() {
            c<K, V> cVar;
            if (this.f13609b) {
                this.f13609b = false;
                this.f13608a = b.this.f13600a;
            } else {
                c<K, V> cVar2 = this.f13608a;
                if (cVar2 != null) {
                    cVar = cVar2.f13606c;
                } else {
                    cVar = null;
                }
                this.f13608a = cVar;
            }
            return this.f13608a;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f13611a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f13612b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f13611a = cVar2;
            this.f13612b = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f13611a == cVar && cVar == this.f13612b) {
                this.f13612b = null;
                this.f13611a = null;
            }
            c<K, V> cVar3 = this.f13611a;
            if (cVar3 == cVar) {
                this.f13611a = b(cVar3);
            }
            c<K, V> cVar4 = this.f13612b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f13611a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f13612b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            if (this.f13612b != null) {
                return true;
            }
            return false;
        }

        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f13612b;
            c<K, V> cVar3 = this.f13611a;
            if (cVar2 == cVar3 || cVar3 == null) {
                cVar = null;
            } else {
                cVar = c(cVar2);
            }
            this.f13612b = cVar;
            return cVar2;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((o.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof o.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            o.b r7 = (o.b) r7
            int r1 = r6.f13603d
            int r3 = r7.f13603d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            o.b$e r3 = (o.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            o.b$e r4 = (o.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            o.b$e r7 = (o.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.equals(java.lang.Object):boolean");
    }

    public c<K, V> g(K k10) {
        c<K, V> cVar = this.f13600a;
        while (cVar != null && !cVar.f13604a.equals(k10)) {
            cVar = cVar.f13606c;
        }
        return cVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public V i(K k10, V v2) {
        c g2 = g(k10);
        if (g2 != null) {
            return g2.f13605b;
        }
        c<K, V> cVar = new c<>(k10, v2);
        this.f13603d++;
        c<K, V> cVar2 = this.f13601b;
        if (cVar2 == null) {
            this.f13600a = cVar;
            this.f13601b = cVar;
            return null;
        }
        cVar2.f13606c = cVar;
        cVar.f13607d = cVar2;
        this.f13601b = cVar;
        return null;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f13600a, this.f13601b);
        this.f13602c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V l(K k10) {
        c g2 = g(k10);
        if (g2 == null) {
            return null;
        }
        this.f13603d--;
        if (!this.f13602c.isEmpty()) {
            for (f<K, V> a10 : this.f13602c.keySet()) {
                a10.a(g2);
            }
        }
        c<K, V> cVar = g2.f13607d;
        if (cVar != null) {
            cVar.f13606c = g2.f13606c;
        } else {
            this.f13600a = g2.f13606c;
        }
        c<K, V> cVar2 = g2.f13606c;
        if (cVar2 != null) {
            cVar2.f13607d = cVar;
        } else {
            this.f13601b = cVar;
        }
        g2.f13606c = null;
        g2.f13607d = null;
        return g2.f13605b;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                q10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    q10.append(", ");
                }
            } else {
                q10.append("]");
                return q10.toString();
            }
        }
    }
}
