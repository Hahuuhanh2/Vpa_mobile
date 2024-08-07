package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import f0.b0;
import j2.r;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: LongArrayList */
public final class u extends c<Long> implements RandomAccess, r {

    /* renamed from: b  reason: collision with root package name */
    public long[] f2328b;

    /* renamed from: c  reason: collision with root package name */
    public int f2329c;

    static {
        new u(new long[0], 0).f2231a = false;
    }

    public u() {
        this(new long[10], 0);
    }

    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f2329c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2329c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        long[] jArr = this.f2328b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[b0.o(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2328b, i10, jArr2, i10 + 1, this.f2329c - i10);
            this.f2328b = jArr2;
        }
        this.f2328b[i10] = longValue;
        this.f2329c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        g();
        Charset charset = p.f2318a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f2329c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2329c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f2328b;
            if (i12 > jArr.length) {
                this.f2328b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(uVar.f2328b, 0, this.f2328b, this.f2329c, uVar.f2329c);
            this.f2329c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f2329c) {
            return new u(Arrays.copyOf(this.f2328b, i10), this.f2329c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f2329c != uVar.f2329c) {
            return false;
        }
        long[] jArr = uVar.f2328b;
        for (int i10 = 0; i10 < this.f2329c; i10++) {
            if (this.f2328b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f2328b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2329c; i11++) {
            i10 = (i10 * 31) + p.a(this.f2328b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        g();
        int i10 = this.f2329c;
        long[] jArr = this.f2328b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[b0.o(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2328b = jArr2;
        }
        long[] jArr3 = this.f2328b;
        int i11 = this.f2329c;
        this.f2329c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f2329c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2329c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final boolean remove(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f2329c; i10++) {
            if (obj.equals(Long.valueOf(this.f2328b[i10]))) {
                long[] jArr = this.f2328b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f2329c - i10) - 1);
                this.f2329c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            long[] jArr = this.f2328b;
            System.arraycopy(jArr, i11, jArr, i10, this.f2329c - i11);
            this.f2329c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        g();
        l(i10);
        long[] jArr = this.f2328b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f2329c;
    }

    public u(long[] jArr, int i10) {
        this.f2328b = jArr;
        this.f2329c = i10;
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        long[] jArr = this.f2328b;
        long j10 = jArr[i10];
        int i11 = this.f2329c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f2329c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
