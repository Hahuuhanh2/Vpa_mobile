package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j9.v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: LongArrayList */
public final class u extends c<Long> implements RandomAccess, v {

    /* renamed from: b  reason: collision with root package name */
    public long[] f7425b;

    /* renamed from: c  reason: collision with root package name */
    public int f7426c;

    static {
        new u(new long[0], 0).f7333a = false;
    }

    public u() {
        this(new long[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7426c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7426c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        long[] jArr = this.f7425b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[b0.o(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f7425b, i10, jArr2, i10 + 1, this.f7426c - i10);
            this.f7425b = jArr2;
        }
        this.f7425b[i10] = longValue;
        this.f7426c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        g();
        Charset charset = p.f7415a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f7426c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7426c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f7425b;
            if (i12 > jArr.length) {
                this.f7425b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(uVar.f7425b, 0, this.f7425b, this.f7426c, uVar.f7426c);
            this.f7426c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f7426c) {
            return new u(Arrays.copyOf(this.f7425b, i10), this.f7426c);
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
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f7426c != uVar.f7426c) {
            return false;
        }
        long[] jArr = uVar.f7425b;
        for (int i10 = 0; i10 < this.f7426c; i10++) {
            if (this.f7425b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f7425b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7426c; i11++) {
            i10 = (i10 * 31) + p.a(this.f7425b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        g();
        int i10 = this.f7426c;
        long[] jArr = this.f7425b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[b0.o(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f7425b = jArr2;
        }
        long[] jArr3 = this.f7425b;
        int i11 = this.f7426c;
        this.f7426c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f7426c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7425b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7426c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7426c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        long[] jArr = this.f7425b;
        long j10 = jArr[i10];
        int i11 = this.f7426c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f7426c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            long[] jArr = this.f7425b;
            System.arraycopy(jArr, i11, jArr, i10, this.f7426c - i11);
            this.f7426c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        l(i10);
        long[] jArr = this.f7425b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f7426c;
    }

    public u(long[] jArr, int i10) {
        this.f7425b = jArr;
        this.f7426c = i10;
    }

    public final boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
