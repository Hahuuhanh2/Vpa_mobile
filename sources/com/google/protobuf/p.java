package com.google.protobuf;

import com.google.protobuf.k;
import f0.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;
import tc.u;

/* compiled from: LongArrayList */
public final class p extends c<Long> implements RandomAccess, u {

    /* renamed from: b  reason: collision with root package name */
    public long[] f7927b;

    /* renamed from: c  reason: collision with root package name */
    public int f7928c;

    static {
        new p(new long[0], 0).f7887a = false;
    }

    public p() {
        this(new long[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7928c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7928c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        long[] jArr = this.f7927b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[b0.o(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f7927b, i10, jArr2, i10 + 1, this.f7928c - i10);
            this.f7927b = jArr2;
        }
        this.f7927b[i10] = longValue;
        this.f7928c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        g();
        Charset charset = k.f7917a;
        collection.getClass();
        if (!(collection instanceof p)) {
            return super.addAll(collection);
        }
        p pVar = (p) collection;
        int i10 = pVar.f7928c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7928c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f7927b;
            if (i12 > jArr.length) {
                this.f7927b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(pVar.f7927b, 0, this.f7927b, this.f7928c, pVar.f7928c);
            this.f7928c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final k.c b(int i10) {
        if (i10 >= this.f7928c) {
            return new p(Arrays.copyOf(this.f7927b, i10), this.f7928c);
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
        if (!(obj instanceof p)) {
            return super.equals(obj);
        }
        p pVar = (p) obj;
        if (this.f7928c != pVar.f7928c) {
            return false;
        }
        long[] jArr = pVar.f7927b;
        for (int i10 = 0; i10 < this.f7928c; i10++) {
            if (this.f7927b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f7927b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7928c; i11++) {
            i10 = (i10 * 31) + k.a(this.f7927b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        g();
        int i10 = this.f7928c;
        long[] jArr = this.f7927b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[b0.o(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f7927b = jArr2;
        }
        long[] jArr3 = this.f7927b;
        int i11 = this.f7928c;
        this.f7928c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f7928c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7927b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7928c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7928c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        long[] jArr = this.f7927b;
        long j10 = jArr[i10];
        int i11 = this.f7928c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f7928c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            long[] jArr = this.f7927b;
            System.arraycopy(jArr, i11, jArr, i10, this.f7928c - i11);
            this.f7928c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        l(i10);
        long[] jArr = this.f7927b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f7928c;
    }

    public p(long[] jArr, int i10) {
        this.f7927b = jArr;
        this.f7928c = i10;
    }

    public final boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
