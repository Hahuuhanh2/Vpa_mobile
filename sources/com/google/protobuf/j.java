package com.google.protobuf;

import com.google.protobuf.k;
import f0.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;
import tc.u;

/* compiled from: IntArrayList */
public final class j extends c<Integer> implements k.b, RandomAccess, u {

    /* renamed from: d  reason: collision with root package name */
    public static final j f7914d;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7915b;

    /* renamed from: c  reason: collision with root package name */
    public int f7916c;

    static {
        j jVar = new j(new int[0], 0);
        f7914d = jVar;
        jVar.f7887a = false;
    }

    public j() {
        this(new int[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7916c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7916c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        int[] iArr = this.f7915b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7915b, i10, iArr2, i10 + 1, this.f7916c - i10);
            this.f7915b = iArr2;
        }
        this.f7915b[i10] = intValue;
        this.f7916c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        g();
        Charset charset = k.f7917a;
        collection.getClass();
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f7916c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7916c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7915b;
            if (i12 > iArr.length) {
                this.f7915b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(jVar.f7915b, 0, this.f7915b, this.f7916c, jVar.f7916c);
            this.f7916c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final k.c b(int i10) {
        if (i10 >= this.f7916c) {
            return new j(Arrays.copyOf(this.f7915b, i10), this.f7916c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f7916c != jVar.f7916c) {
            return false;
        }
        int[] iArr = jVar.f7915b;
        for (int i10 = 0; i10 < this.f7916c; i10++) {
            if (this.f7915b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        return Integer.valueOf(m(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7916c; i11++) {
            i10 = (i10 * 31) + this.f7915b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        g();
        int i11 = this.f7916c;
        int[] iArr = this.f7915b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7915b = iArr2;
        }
        int[] iArr3 = this.f7915b;
        int i12 = this.f7916c;
        this.f7916c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7916c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7915b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7916c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7916c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final int m(int i10) {
        l(i10);
        return this.f7915b[i10];
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        int[] iArr = this.f7915b;
        int i11 = iArr[i10];
        int i12 = this.f7916c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f7916c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            int[] iArr = this.f7915b;
            System.arraycopy(iArr, i11, iArr, i10, this.f7916c - i11);
            this.f7916c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        l(i10);
        int[] iArr = this.f7915b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f7916c;
    }

    public j(int[] iArr, int i10) {
        this.f7915b = iArr;
        this.f7916c = i10;
    }

    public final boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
