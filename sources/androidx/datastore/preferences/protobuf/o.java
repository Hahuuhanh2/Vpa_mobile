package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import f0.b0;
import j2.r;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: IntArrayList */
public final class o extends c<Integer> implements RandomAccess, r {

    /* renamed from: b  reason: collision with root package name */
    public int[] f2316b;

    /* renamed from: c  reason: collision with root package name */
    public int f2317c;

    static {
        new o(new int[0], 0).f2231a = false;
    }

    public o() {
        this(new int[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f2317c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2317c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        int[] iArr = this.f2316b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f2316b, i10, iArr2, i10 + 1, this.f2317c - i10);
            this.f2316b = iArr2;
        }
        this.f2316b[i10] = intValue;
        this.f2317c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        g();
        Charset charset = p.f2318a;
        collection.getClass();
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int i10 = oVar.f2317c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2317c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f2316b;
            if (i12 > iArr.length) {
                this.f2316b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(oVar.f2316b, 0, this.f2316b, this.f2317c, oVar.f2317c);
            this.f2317c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f2317c) {
            return new o(Arrays.copyOf(this.f2316b, i10), this.f2317c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.f2317c != oVar.f2317c) {
            return false;
        }
        int[] iArr = oVar.f2316b;
        for (int i10 = 0; i10 < this.f2317c; i10++) {
            if (this.f2316b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f2316b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2317c; i11++) {
            i10 = (i10 * 31) + this.f2316b[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        g();
        int i11 = this.f2317c;
        int[] iArr = this.f2316b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[b0.o(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f2316b = iArr2;
        }
        int[] iArr3 = this.f2316b;
        int i12 = this.f2317c;
        this.f2317c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f2317c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2317c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final boolean remove(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f2317c; i10++) {
            if (obj.equals(Integer.valueOf(this.f2316b[i10]))) {
                int[] iArr = this.f2316b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f2317c - i10) - 1);
                this.f2317c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            int[] iArr = this.f2316b;
            System.arraycopy(iArr, i11, iArr, i10, this.f2317c - i11);
            this.f2317c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        g();
        l(i10);
        int[] iArr = this.f2316b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f2317c;
    }

    public o(int[] iArr, int i10) {
        this.f2316b = iArr;
        this.f2317c = i10;
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        int[] iArr = this.f2316b;
        int i11 = iArr[i10];
        int i12 = this.f2317c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f2317c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
