package v0;

import j7.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import v0.g;

/* compiled from: ArraySet */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f15971e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f15972f = new Object[0];

    /* renamed from: n  reason: collision with root package name */
    public static Object[] f15973n;

    /* renamed from: o  reason: collision with root package name */
    public static int f15974o;

    /* renamed from: p  reason: collision with root package name */
    public static Object[] f15975p;

    /* renamed from: q  reason: collision with root package name */
    public static int f15976q;

    /* renamed from: a  reason: collision with root package name */
    public int[] f15977a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15978b;

    /* renamed from: c  reason: collision with root package name */
    public int f15979c;

    /* renamed from: d  reason: collision with root package name */
    public c f15980d;

    public d() {
        this(0);
    }

    public static void i(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f15976q < 10) {
                    objArr[0] = f15975p;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f15975p = objArr;
                    f15976q++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f15974o < 10) {
                    objArr[0] = f15973n;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f15973n = objArr;
                    f15974o++;
                }
            }
        }
    }

    public final boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = m();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = l(hashCode, e10);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f15979c;
        int[] iArr = this.f15977a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f15978b;
            g(i14);
            int[] iArr2 = this.f15977a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f15978b, 0, objArr.length);
            }
            i(iArr, objArr, this.f15979c);
        }
        int i15 = this.f15979c;
        if (i12 < i15) {
            int[] iArr3 = this.f15977a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f15978b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f15979c - i12);
        }
        this.f15977a[i12] = i10;
        this.f15978b[i12] = e10;
        this.f15979c++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f15979c;
        int[] iArr = this.f15977a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15978b;
            g(size);
            int i10 = this.f15979c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f15977a, 0, i10);
                System.arraycopy(objArr, 0, this.f15978b, 0, this.f15979c);
            }
            i(iArr, objArr, this.f15979c);
        }
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public final void clear() {
        int i10 = this.f15979c;
        if (i10 != 0) {
            i(this.f15977a, this.f15978b, i10);
            this.f15977a = f15971e;
            this.f15978b = f15972f;
            this.f15979c = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f15979c != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f15979c) {
                try {
                    if (!set.contains(this.f15978b[i10])) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f15975p;
                if (objArr != null) {
                    this.f15978b = objArr;
                    f15975p = (Object[]) objArr[0];
                    this.f15977a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f15976q--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f15973n;
                if (objArr2 != null) {
                    this.f15978b = objArr2;
                    f15973n = (Object[]) objArr2[0];
                    this.f15977a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f15974o--;
                    return;
                }
            }
        }
        this.f15977a = new int[i10];
        this.f15978b = new Object[i10];
    }

    public final int hashCode() {
        int[] iArr = this.f15977a;
        int i10 = this.f15979c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return m();
        }
        return l(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        if (this.f15979c <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator<E> iterator() {
        if (this.f15980d == null) {
            this.f15980d = new c(this);
        }
        c cVar = this.f15980d;
        if (cVar.f15987b == null) {
            cVar.f15987b = new g.c();
        }
        return cVar.f15987b.iterator();
    }

    public final int l(int i10, Object obj) {
        int i11 = this.f15979c;
        if (i11 == 0) {
            return -1;
        }
        int g2 = a.g(i11, i10, this.f15977a);
        if (g2 < 0 || obj.equals(this.f15978b[g2])) {
            return g2;
        }
        int i12 = g2 + 1;
        while (i12 < i11 && this.f15977a[i12] == i10) {
            if (obj.equals(this.f15978b[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = g2 - 1;
        while (i13 >= 0 && this.f15977a[i13] == i10) {
            if (obj.equals(this.f15978b[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public final int m() {
        int i10 = this.f15979c;
        if (i10 == 0) {
            return -1;
        }
        int g2 = a.g(i10, 0, this.f15977a);
        if (g2 < 0 || this.f15978b[g2] == null) {
            return g2;
        }
        int i11 = g2 + 1;
        while (i11 < i10 && this.f15977a[i11] == 0) {
            if (this.f15978b[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = g2 - 1;
        while (i12 >= 0 && this.f15977a[i12] == 0) {
            if (this.f15978b[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final void n(int i10) {
        Object[] objArr = this.f15978b;
        Object obj = objArr[i10];
        int i11 = this.f15979c;
        if (i11 <= 1) {
            i(this.f15977a, objArr, i11);
            this.f15977a = f15971e;
            this.f15978b = f15972f;
            this.f15979c = 0;
            return;
        }
        int[] iArr = this.f15977a;
        int i12 = 8;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i13 = i11 - 1;
            this.f15979c = i13;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                Object[] objArr2 = this.f15978b;
                System.arraycopy(objArr2, i14, objArr2, i10, this.f15979c - i10);
            }
            this.f15978b[this.f15979c] = null;
            return;
        }
        if (i11 > 8) {
            i12 = i11 + (i11 >> 1);
        }
        g(i12);
        this.f15979c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f15977a, 0, i10);
            System.arraycopy(objArr, 0, this.f15978b, 0, i10);
        }
        int i15 = this.f15979c;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, this.f15977a, i10, i15 - i10);
            System.arraycopy(objArr, i16, this.f15978b, i10, this.f15979c - i10);
        }
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f15979c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f15978b[i10])) {
                n(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final int size() {
        return this.f15979c;
    }

    public final Object[] toArray() {
        int i10 = this.f15979c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f15978b, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15979c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15979c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f15978b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f15977a = f15971e;
            this.f15978b = f15972f;
        } else {
            g(i10);
        }
        this.f15979c = 0;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f15979c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f15979c);
        }
        System.arraycopy(this.f15978b, 0, tArr, 0, this.f15979c);
        int length = tArr.length;
        int i10 = this.f15979c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
