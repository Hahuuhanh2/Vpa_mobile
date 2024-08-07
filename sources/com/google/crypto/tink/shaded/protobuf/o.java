package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j9.v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: IntArrayList */
public final class o extends c<Integer> implements RandomAccess, v {

    /* renamed from: b  reason: collision with root package name */
    public int[] f7413b;

    /* renamed from: c  reason: collision with root package name */
    public int f7414c;

    static {
        new o(new int[0], 0).f7333a = false;
    }

    public o() {
        this(new int[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7414c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7414c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        int[] iArr = this.f7413b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7413b, i10, iArr2, i10 + 1, this.f7414c - i10);
            this.f7413b = iArr2;
        }
        this.f7413b[i10] = intValue;
        this.f7414c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        g();
        Charset charset = p.f7415a;
        collection.getClass();
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int i10 = oVar.f7414c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7414c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7413b;
            if (i12 > iArr.length) {
                this.f7413b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(oVar.f7413b, 0, this.f7413b, this.f7414c, oVar.f7414c);
            this.f7414c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f7414c) {
            return new o(Arrays.copyOf(this.f7413b, i10), this.f7414c);
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
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.f7414c != oVar.f7414c) {
            return false;
        }
        int[] iArr = oVar.f7413b;
        for (int i10 = 0; i10 < this.f7414c; i10++) {
            if (this.f7413b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f7413b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7414c; i11++) {
            i10 = (i10 * 31) + this.f7413b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        g();
        int i11 = this.f7414c;
        int[] iArr = this.f7413b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7413b = iArr2;
        }
        int[] iArr3 = this.f7413b;
        int i12 = this.f7414c;
        this.f7414c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7414c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7413b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7414c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7414c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        int[] iArr = this.f7413b;
        int i11 = iArr[i10];
        int i12 = this.f7414c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f7414c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            int[] iArr = this.f7413b;
            System.arraycopy(iArr, i11, iArr, i10, this.f7414c - i11);
            this.f7414c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        l(i10);
        int[] iArr = this.f7413b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f7414c;
    }

    public o(int[] iArr, int i10) {
        this.f7413b = iArr;
        this.f7414c = i10;
    }

    public final boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
