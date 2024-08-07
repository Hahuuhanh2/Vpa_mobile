package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import f0.b0;
import j2.r;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: BooleanArrayList */
public final class d extends c<Boolean> implements RandomAccess, r {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f2236b;

    /* renamed from: c  reason: collision with root package name */
    public int f2237c;

    static {
        new d(new boolean[0], 0).f2231a = false;
    }

    public d() {
        this(new boolean[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f2237c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2237c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        boolean[] zArr = this.f2236b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[b0.o(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2236b, i10, zArr2, i10 + 1, this.f2237c - i10);
            this.f2236b = zArr2;
        }
        this.f2236b[i10] = booleanValue;
        this.f2237c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        g();
        Charset charset = p.f2318a;
        collection.getClass();
        if (!(collection instanceof d)) {
            return super.addAll(collection);
        }
        d dVar = (d) collection;
        int i10 = dVar.f2237c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2237c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f2236b;
            if (i12 > zArr.length) {
                this.f2236b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(dVar.f2236b, 0, this.f2236b, this.f2237c, dVar.f2237c);
            this.f2237c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f2237c) {
            return new d(Arrays.copyOf(this.f2236b, i10), this.f2237c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        if (this.f2237c != dVar.f2237c) {
            return false;
        }
        boolean[] zArr = dVar.f2236b;
        for (int i10 = 0; i10 < this.f2237c; i10++) {
            if (this.f2236b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Boolean.valueOf(this.f2236b[i10]);
    }

    public final int hashCode() {
        int i10;
        int i11 = 1;
        for (int i12 = 0; i12 < this.f2237c; i12++) {
            int i13 = i11 * 31;
            boolean z10 = this.f2236b[i12];
            Charset charset = p.f2318a;
            if (z10) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            i11 = i13 + i10;
        }
        return i11;
    }

    public final void i(boolean z10) {
        g();
        int i10 = this.f2237c;
        boolean[] zArr = this.f2236b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[b0.o(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2236b = zArr2;
        }
        boolean[] zArr3 = this.f2236b;
        int i11 = this.f2237c;
        this.f2237c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f2237c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2237c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final boolean remove(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f2237c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f2236b[i10]))) {
                boolean[] zArr = this.f2236b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f2237c - i10) - 1);
                this.f2237c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            boolean[] zArr = this.f2236b;
            System.arraycopy(zArr, i11, zArr, i10, this.f2237c - i11);
            this.f2237c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        l(i10);
        boolean[] zArr = this.f2236b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f2237c;
    }

    public d(boolean[] zArr, int i10) {
        this.f2236b = zArr;
        this.f2237c = i10;
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        boolean[] zArr = this.f2236b;
        boolean z10 = zArr[i10];
        int i11 = this.f2237c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f2237c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
