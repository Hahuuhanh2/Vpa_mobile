package v0;

import j7.a;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class h<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f16001d;

    /* renamed from: e  reason: collision with root package name */
    public static int f16002e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f16003f;

    /* renamed from: n  reason: collision with root package name */
    public static int f16004n;

    /* renamed from: a  reason: collision with root package name */
    public int[] f16005a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f16006b;

    /* renamed from: c  reason: collision with root package name */
    public int f16007c;

    public h() {
        this.f16005a = a.A;
        this.f16006b = a.C;
        this.f16007c = 0;
    }

    private void b(int i10) {
        Class<h> cls = h.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = f16003f;
                if (objArr != null) {
                    this.f16006b = objArr;
                    f16003f = (Object[]) objArr[0];
                    this.f16005a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16004n--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f16001d;
                if (objArr2 != null) {
                    this.f16006b = objArr2;
                    f16001d = (Object[]) objArr2[0];
                    this.f16005a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16002e--;
                    return;
                }
            }
        }
        this.f16005a = new int[i10];
        this.f16006b = new Object[(i10 << 1)];
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f16004n < 10) {
                    objArr[0] = f16003f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f16003f = objArr;
                    f16004n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f16002e < 10) {
                    objArr[0] = f16001d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f16001d = objArr;
                    f16002e++;
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f16007c;
        int[] iArr = this.f16005a;
        if (iArr.length < i10) {
            Object[] objArr = this.f16006b;
            b(i10);
            if (this.f16007c > 0) {
                System.arraycopy(iArr, 0, this.f16005a, 0, i11);
                System.arraycopy(objArr, 0, this.f16006b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f16007c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f16007c;
        if (i10 > 0) {
            int[] iArr = this.f16005a;
            Object[] objArr = this.f16006b;
            this.f16005a = a.A;
            this.f16006b = a.C;
            this.f16007c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f16007c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int e(int i10, Object obj) {
        int i11 = this.f16007c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int g2 = a.g(i11, i10, this.f16005a);
            if (g2 < 0 || obj.equals(this.f16006b[g2 << 1])) {
                return g2;
            }
            int i12 = g2 + 1;
            while (i12 < i11 && this.f16005a[i12] == i10) {
                if (obj.equals(this.f16006b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            int i13 = g2 - 1;
            while (i13 >= 0 && this.f16005a[i13] == i10) {
                if (obj.equals(this.f16006b[i13 << 1])) {
                    return i13;
                }
                i13--;
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f16007c != hVar.f16007c) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f16007c) {
                try {
                    Object i11 = i(i10);
                    Object m10 = m(i10);
                    Object orDefault = hVar.getOrDefault(i11, (Object) null);
                    if (m10 == null) {
                        if (orDefault != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m10.equals(orDefault)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f16007c != map.size()) {
                return false;
            }
            int i12 = 0;
            while (i12 < this.f16007c) {
                try {
                    Object i13 = i(i12);
                    Object m11 = m(i12);
                    Object obj2 = map.get(i13);
                    if (m11 == null) {
                        if (obj2 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m11.equals(obj2)) {
                        return false;
                    }
                    i12++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        if (obj == null) {
            return g();
        }
        return e(obj.hashCode(), obj);
    }

    public final int g() {
        int i10 = this.f16007c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int g2 = a.g(i10, 0, this.f16005a);
            if (g2 < 0 || this.f16006b[g2 << 1] == null) {
                return g2;
            }
            int i11 = g2 + 1;
            while (i11 < i10 && this.f16005a[i11] == 0) {
                if (this.f16006b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            int i12 = g2 - 1;
            while (i12 >= 0 && this.f16005a[i12] == 0) {
                if (this.f16006b[i12 << 1] == null) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return this.f16006b[(f10 << 1) + 1];
        }
        return v2;
    }

    /* access modifiers changed from: package-private */
    public final int h(Object obj) {
        int i10 = this.f16007c * 2;
        Object[] objArr = this.f16006b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i10;
        int[] iArr = this.f16005a;
        Object[] objArr = this.f16006b;
        int i11 = this.f16007c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final K i(int i10) {
        return this.f16006b[i10 << 1];
    }

    public final boolean isEmpty() {
        if (this.f16007c <= 0) {
            return true;
        }
        return false;
    }

    public void j(b bVar) {
        int i10 = bVar.f16007c;
        c(this.f16007c + i10);
        if (this.f16007c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(bVar.i(i11), bVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.f16005a, 0, this.f16005a, 0, i10);
            System.arraycopy(bVar.f16006b, 0, this.f16006b, 0, i10 << 1);
            this.f16007c = i10;
        }
    }

    public V k(int i10) {
        V[] vArr = this.f16006b;
        int i11 = i10 << 1;
        V v2 = vArr[i11 + 1];
        int i12 = this.f16007c;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f16005a, vArr, i12);
            this.f16005a = a.A;
            this.f16006b = a.C;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f16005a;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f16006b;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f16006b;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                b(i15);
                if (i12 == this.f16007c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f16005a, 0, i10);
                        System.arraycopy(vArr, 0, this.f16006b, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f16005a, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f16006b, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f16007c) {
            this.f16007c = i13;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i10, V v2) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f16006b;
        V v10 = vArr[i11];
        vArr[i11] = v2;
        return v10;
    }

    public final V m(int i10) {
        return this.f16006b[(i10 << 1) + 1];
    }

    public V put(K k10, V v2) {
        int i10;
        int i11;
        int i12 = this.f16007c;
        if (k10 == null) {
            i11 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = e(hashCode, k10);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f16006b;
            V v10 = vArr[i13];
            vArr[i13] = v2;
            return v10;
        }
        int i14 = ~i11;
        int[] iArr = this.f16005a;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f16006b;
            b(i15);
            if (i12 == this.f16007c) {
                int[] iArr2 = this.f16005a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f16006b, 0, objArr.length);
                }
                d(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f16005a;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f16006b;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f16007c - i14) << 1);
        }
        int i17 = this.f16007c;
        if (i12 == i17) {
            int[] iArr4 = this.f16005a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f16006b;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v2;
                this.f16007c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v2) {
        V orDefault = getOrDefault(k10, (Object) null);
        if (orDefault == null) {
            return put(k10, v2);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public final V replace(K k10, V v2) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v2);
        }
        return null;
    }

    public final int size() {
        return this.f16007c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f16007c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f16007c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (obj2 != m10 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        k(f10);
        return true;
    }

    public final boolean replace(K k10, V v2, V v10) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V m10 = m(f10);
        if (m10 != v2 && (v2 == null || !v2.equals(m10))) {
            return false;
        }
        l(f10, v10);
        return true;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f16005a = a.A;
            this.f16006b = a.C;
        } else {
            b(i10);
        }
        this.f16007c = 0;
    }
}
