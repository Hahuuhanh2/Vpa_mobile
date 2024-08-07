package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j9.v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: BooleanArrayList */
public final class e extends c<Boolean> implements RandomAccess, v {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f7342b;

    /* renamed from: c  reason: collision with root package name */
    public int f7343c;

    static {
        new e(new boolean[0], 0).f7333a = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7343c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7343c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        boolean[] zArr = this.f7342b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[b0.o(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f7342b, i10, zArr2, i10 + 1, this.f7343c - i10);
            this.f7342b = zArr2;
        }
        this.f7342b[i10] = booleanValue;
        this.f7343c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        g();
        Charset charset = p.f7415a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f7343c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7343c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f7342b;
            if (i12 > zArr.length) {
                this.f7342b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(eVar.f7342b, 0, this.f7342b, this.f7343c, eVar.f7343c);
            this.f7343c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f7343c) {
            return new e(Arrays.copyOf(this.f7342b, i10), this.f7343c);
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
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f7343c != eVar.f7343c) {
            return false;
        }
        boolean[] zArr = eVar.f7342b;
        for (int i10 = 0; i10 < this.f7343c; i10++) {
            if (this.f7342b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Boolean.valueOf(this.f7342b[i10]);
    }

    public final int hashCode() {
        int i10;
        int i11 = 1;
        for (int i12 = 0; i12 < this.f7343c; i12++) {
            int i13 = i11 * 31;
            boolean z10 = this.f7342b[i12];
            Charset charset = p.f7415a;
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
        int i10 = this.f7343c;
        boolean[] zArr = this.f7342b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[b0.o(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f7342b = zArr2;
        }
        boolean[] zArr3 = this.f7342b;
        int i11 = this.f7343c;
        this.f7343c = i11 + 1;
        zArr3[i11] = z10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f7343c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7342b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7343c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7343c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        boolean[] zArr = this.f7342b;
        boolean z10 = zArr[i10];
        int i11 = this.f7343c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f7343c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            boolean[] zArr = this.f7342b;
            System.arraycopy(zArr, i11, zArr, i10, this.f7343c - i11);
            this.f7343c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g();
        l(i10);
        boolean[] zArr = this.f7342b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f7343c;
    }

    public e(boolean[] zArr, int i10) {
        this.f7342b = zArr;
        this.f7343c = i10;
    }

    public final boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
