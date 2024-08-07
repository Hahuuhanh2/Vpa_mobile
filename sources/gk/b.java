package gk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p3.l0;
import sk.j;
import vk.g;
import vk.h;

/* compiled from: MapBuilder.kt */
public final class b<K, V> implements Map<K, V>, Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final b f20437t;

    /* renamed from: a  reason: collision with root package name */
    public K[] f20438a;

    /* renamed from: b  reason: collision with root package name */
    public V[] f20439b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f20440c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f20441d;

    /* renamed from: e  reason: collision with root package name */
    public int f20442e;

    /* renamed from: f  reason: collision with root package name */
    public int f20443f;

    /* renamed from: n  reason: collision with root package name */
    public int f20444n;

    /* renamed from: o  reason: collision with root package name */
    public int f20445o;

    /* renamed from: p  reason: collision with root package name */
    public d<K> f20446p;

    /* renamed from: q  reason: collision with root package name */
    public e<V> f20447q;

    /* renamed from: r  reason: collision with root package name */
    public c<K, V> f20448r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f20449s;

    /* compiled from: MapBuilder.kt */
    public static final class a {
    }

    /* renamed from: gk.b$b  reason: collision with other inner class name */
    /* compiled from: MapBuilder.kt */
    public static final class C0285b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0285b(b<K, V> bVar) {
            super(bVar);
            j.f(bVar, "map");
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Object next() {
            int i10 = this.f20453b;
            b<K, V> bVar = this.f20452a;
            if (i10 < bVar.f20443f) {
                this.f20453b = i10 + 1;
                this.f20454c = i10;
                c cVar = new c(bVar, i10);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final b<K, V> f20450a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20451b;

        public c(b<K, V> bVar, int i10) {
            j.f(bVar, "map");
            this.f20450a = bVar;
            this.f20451b = i10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!j.a(entry.getKey(), getKey()) || !j.a(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final K getKey() {
            return this.f20450a.f20438a[this.f20451b];
        }

        public final V getValue() {
            V[] vArr = this.f20450a.f20439b;
            j.c(vArr);
            return vArr[this.f20451b];
        }

        public final int hashCode() {
            int i10;
            Object key = getKey();
            int i11 = 0;
            if (key != null) {
                i10 = key.hashCode();
            } else {
                i10 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i11 = value.hashCode();
            }
            return i10 ^ i11;
        }

        public final V setValue(V v2) {
            this.f20450a.c();
            b<K, V> bVar = this.f20450a;
            V[] vArr = bVar.f20439b;
            if (vArr == null) {
                vArr = l0.g(bVar.f20438a.length);
                bVar.f20439b = vArr;
            }
            int i10 = this.f20451b;
            V v10 = vArr[i10];
            vArr[i10] = v2;
            return v10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final b<K, V> f20452a;

        /* renamed from: b  reason: collision with root package name */
        public int f20453b;

        /* renamed from: c  reason: collision with root package name */
        public int f20454c = -1;

        public d(b<K, V> bVar) {
            j.f(bVar, "map");
            this.f20452a = bVar;
            a();
        }

        public final void a() {
            while (true) {
                int i10 = this.f20453b;
                b<K, V> bVar = this.f20452a;
                if (i10 < bVar.f20443f && bVar.f20440c[i10] < 0) {
                    this.f20453b = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.f20453b < this.f20452a.f20443f) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z10;
            if (this.f20454c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20452a.c();
                this.f20452a.j(this.f20454c);
                this.f20454c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements java.util.Iterator<K>, j$.util.Iterator {
        public e(b<K, V> bVar) {
            super(bVar);
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final K next() {
            int i10 = this.f20453b;
            b<K, V> bVar = this.f20452a;
            if (i10 < bVar.f20443f) {
                this.f20453b = i10 + 1;
                this.f20454c = i10;
                K k10 = bVar.f20438a[i10];
                a();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements java.util.Iterator<V>, j$.util.Iterator {
        public f(b<K, V> bVar) {
            super(bVar);
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final V next() {
            int i10 = this.f20453b;
            b<K, V> bVar = this.f20452a;
            if (i10 < bVar.f20443f) {
                this.f20453b = i10 + 1;
                this.f20454c = i10;
                V[] vArr = bVar.f20439b;
                j.c(vArr);
                V v2 = vArr[this.f20454c];
                a();
                return v2;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
        b bVar = new b(0);
        bVar.f20449s = true;
        f20437t = bVar;
    }

    public b() {
        this(8);
    }

    public final int b(K k10) {
        c();
        while (true) {
            int h10 = h(k10);
            int i10 = this.f20442e * 2;
            int length = this.f20441d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f20441d;
                int i12 = iArr[h10];
                if (i12 <= 0) {
                    int i13 = this.f20443f;
                    K[] kArr = this.f20438a;
                    if (i13 >= kArr.length) {
                        f(1);
                    } else {
                        int i14 = i13 + 1;
                        this.f20443f = i14;
                        kArr[i13] = k10;
                        this.f20440c[i13] = h10;
                        iArr[h10] = i14;
                        this.f20445o++;
                        if (i11 > this.f20442e) {
                            this.f20442e = i11;
                        }
                        return i13;
                    }
                } else if (j.a(this.f20438a[i12 - 1], k10)) {
                    return -i12;
                } else {
                    i11++;
                    if (i11 > i10) {
                        i(this.f20441d.length * 2);
                        break;
                    }
                    int i15 = h10 - 1;
                    if (h10 == 0) {
                        h10 = this.f20441d.length - 1;
                    } else {
                        h10 = i15;
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f20449s) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        g m10 = new h(0, this.f20443f - 1).iterator();
        while (m10.f23340c) {
            int nextInt = m10.nextInt();
            int[] iArr = this.f20440c;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.f20441d[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        l0.z0(this.f20438a, 0, this.f20443f);
        V[] vArr = this.f20439b;
        if (vArr != null) {
            l0.z0(vArr, 0, this.f20443f);
        }
        this.f20445o = 0;
        this.f20443f = 0;
    }

    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        int i10;
        int i11 = this.f20443f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (this.f20440c[i11] >= 0) {
                V[] vArr = this.f20439b;
                j.c(vArr);
                if (j.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection<?> collection) {
        j.f(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!e((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry<? extends K, ? extends V> entry) {
        j.f(entry, "entry");
        int g2 = g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        V[] vArr = this.f20439b;
        j.c(vArr);
        return j.a(vArr[g2], entry.getValue());
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        c<K, V> cVar = this.f20448r;
        if (cVar != null) {
            return cVar;
        }
        c<K, V> cVar2 = new c<>(this);
        this.f20448r = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (this.f20445o != map.size() || !d(map.entrySet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        boolean z10;
        V[] vArr;
        K[] kArr = this.f20438a;
        int length = kArr.length;
        int i11 = this.f20443f;
        int i12 = length - i11;
        int i13 = i11 - this.f20445o;
        int i14 = 1;
        if (i12 >= i10 || i12 + i13 < i10 || i13 < kArr.length / 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i(this.f20441d.length);
            return;
        }
        int i15 = i11 + i10;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        } else if (i15 > kArr.length) {
            int length2 = (kArr.length * 3) / 2;
            if (i15 <= length2) {
                i15 = length2;
            }
            K[] copyOf = Arrays.copyOf(kArr, i15);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f20438a = copyOf;
            V[] vArr2 = this.f20439b;
            if (vArr2 != null) {
                vArr = Arrays.copyOf(vArr2, i15);
                j.e(vArr, "copyOf(this, newSize)");
            } else {
                vArr = null;
            }
            this.f20439b = vArr;
            int[] copyOf2 = Arrays.copyOf(this.f20440c, i15);
            j.e(copyOf2, "copyOf(this, newSize)");
            this.f20440c = copyOf2;
            if (i15 >= 1) {
                i14 = i15;
            }
            int highestOneBit = Integer.highestOneBit(i14 * 3);
            if (highestOneBit > this.f20441d.length) {
                i(highestOneBit);
            }
        }
    }

    public final int g(K k10) {
        int h10 = h(k10);
        int i10 = this.f20442e;
        while (true) {
            int i11 = this.f20441d[h10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (j.a(this.f20438a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = h10 - 1;
            if (h10 == 0) {
                h10 = this.f20441d.length - 1;
            } else {
                h10 = i13;
            }
        }
    }

    public final V get(Object obj) {
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        V[] vArr = this.f20439b;
        j.c(vArr);
        return vArr[g2];
    }

    public final int h(K k10) {
        int i10;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * -1640531527) >>> this.f20444n;
    }

    public final int hashCode() {
        int i10;
        int i11;
        C0285b bVar = new C0285b(this);
        int i12 = 0;
        while (bVar.hasNext()) {
            int i13 = bVar.f20453b;
            b<K, V> bVar2 = bVar.f20452a;
            if (i13 < bVar2.f20443f) {
                bVar.f20453b = i13 + 1;
                bVar.f20454c = i13;
                K k10 = bVar2.f20438a[i13];
                if (k10 != null) {
                    i10 = k10.hashCode();
                } else {
                    i10 = 0;
                }
                V[] vArr = bVar.f20452a.f20439b;
                j.c(vArr);
                V v2 = vArr[bVar.f20454c];
                if (v2 != null) {
                    i11 = v2.hashCode();
                } else {
                    i11 = 0;
                }
                bVar.a();
                i12 += i10 ^ i11;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i12;
    }

    public final void i(int i10) {
        boolean z10;
        int i11;
        if (this.f20443f > this.f20445o) {
            V[] vArr = this.f20439b;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i11 = this.f20443f;
                if (i12 >= i11) {
                    break;
                }
                if (this.f20440c[i12] >= 0) {
                    K[] kArr = this.f20438a;
                    kArr[i13] = kArr[i12];
                    if (vArr != null) {
                        vArr[i13] = vArr[i12];
                    }
                    i13++;
                }
                i12++;
            }
            l0.z0(this.f20438a, i13, i11);
            if (vArr != null) {
                l0.z0(vArr, i13, this.f20443f);
            }
            this.f20443f = i13;
        }
        int[] iArr = this.f20441d;
        if (i10 != iArr.length) {
            this.f20441d = new int[i10];
            this.f20444n = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            int length = iArr.length;
            j.f(iArr, "<this>");
            Arrays.fill(iArr, 0, length, 0);
        }
        int i14 = 0;
        while (i14 < this.f20443f) {
            int i15 = i14 + 1;
            int h10 = h(this.f20438a[i14]);
            int i16 = this.f20442e;
            while (true) {
                int[] iArr2 = this.f20441d;
                if (iArr2[h10] == 0) {
                    iArr2[h10] = i15;
                    this.f20440c[i14] = h10;
                    z10 = true;
                    break;
                }
                i16--;
                if (i16 < 0) {
                    z10 = false;
                    break;
                }
                int i17 = h10 - 1;
                if (h10 == 0) {
                    h10 = iArr2.length - 1;
                } else {
                    h10 = i17;
                }
            }
            if (z10) {
                i14 = i15;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f20445o == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f20438a
            java.lang.String r1 = "<this>"
            sk.j.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f20440c
            r0 = r0[r12]
            int r1 = r11.f20442e
            int r1 = r1 * 2
            int[] r2 = r11.f20441d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x001e:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0028
            int[] r0 = r11.f20441d
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            int r4 = r4 + 1
            int r5 = r11.f20442e
            if (r4 <= r5) goto L_0x0034
            int[] r0 = r11.f20441d
            r0[r1] = r2
            goto L_0x0063
        L_0x0034:
            int[] r5 = r11.f20441d
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003d
            r5[r1] = r2
            goto L_0x0063
        L_0x003d:
            if (r7 >= 0) goto L_0x0042
            r5[r1] = r6
            goto L_0x005a
        L_0x0042:
            K[] r5 = r11.f20438a
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f20441d
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x005c
            r9[r1] = r7
            int[] r4 = r11.f20440c
            r4[r8] = r1
        L_0x005a:
            r1 = r0
            r4 = r2
        L_0x005c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001e
            int[] r0 = r11.f20441d
            r0[r1] = r6
        L_0x0063:
            int[] r0 = r11.f20440c
            r0[r12] = r6
            int r12 = r11.f20445o
            int r12 = r12 + r6
            r11.f20445o = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.b.j(int):void");
    }

    public final Set<K> keySet() {
        d<K> dVar = this.f20446p;
        if (dVar != null) {
            return dVar;
        }
        d<K> dVar2 = new d<>(this);
        this.f20446p = dVar2;
        return dVar2;
    }

    public final V put(K k10, V v2) {
        c();
        int b10 = b(k10);
        V[] vArr = this.f20439b;
        if (vArr == null) {
            vArr = l0.g(this.f20438a.length);
            this.f20439b = vArr;
        }
        if (b10 < 0) {
            int i10 = (-b10) - 1;
            V v10 = vArr[i10];
            vArr[i10] = v2;
            return v10;
        }
        vArr[b10] = v2;
        return null;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        j.f(map, "from");
        c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry next : entrySet) {
                int b10 = b(next.getKey());
                V[] vArr = this.f20439b;
                if (vArr == null) {
                    vArr = l0.g(this.f20438a.length);
                    this.f20439b = vArr;
                }
                if (b10 >= 0) {
                    vArr[b10] = next.getValue();
                } else {
                    int i10 = (-b10) - 1;
                    if (!j.a(next.getValue(), vArr[i10])) {
                        vArr[i10] = next.getValue();
                    }
                }
            }
        }
    }

    public final V remove(Object obj) {
        c();
        int g2 = g(obj);
        if (g2 < 0) {
            g2 = -1;
        } else {
            j(g2);
        }
        if (g2 < 0) {
            return null;
        }
        V[] vArr = this.f20439b;
        j.c(vArr);
        V v2 = vArr[g2];
        vArr[g2] = null;
        return v2;
    }

    public final int size() {
        return this.f20445o;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f20445o * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        C0285b bVar = new C0285b(this);
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = bVar.f20453b;
            b<K, V> bVar2 = bVar.f20452a;
            if (i11 < bVar2.f20443f) {
                bVar.f20453b = i11 + 1;
                bVar.f20454c = i11;
                K k10 = bVar2.f20438a[i11];
                if (j.a(k10, bVar2)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(k10);
                }
                sb2.append('=');
                V[] vArr = bVar.f20452a.f20439b;
                j.c(vArr);
                V v2 = vArr[bVar.f20454c];
                if (j.a(v2, bVar.f20452a)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(v2);
                }
                bVar.a();
                i10++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }

    public final Collection<V> values() {
        e<V> eVar = this.f20447q;
        if (eVar != null) {
            return eVar;
        }
        e<V> eVar2 = new e<>(this);
        this.f20447q = eVar2;
        return eVar2;
    }

    public b(int i10) {
        K[] g2 = l0.g(i10);
        int[] iArr = new int[i10];
        int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f20438a = g2;
        this.f20439b = null;
        this.f20440c = iArr;
        this.f20441d = new int[highestOneBit];
        this.f20442e = 2;
        this.f20443f = 0;
        this.f20444n = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
