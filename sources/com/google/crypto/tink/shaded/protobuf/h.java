package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j9.v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: DoubleArrayList */
public final class h extends c<Double> implements RandomAccess, v {

    /* renamed from: b  reason: collision with root package name */
    public double[] f7384b;

    /* renamed from: c  reason: collision with root package name */
    public int f7385c;

    static {
        new h(0, new double[0]).f7333a = false;
    }

    public h() {
        this(0, new double[10]);
    }

    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f7385c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7385c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        double[] dArr = this.f7384b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[b0.o(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f7384b, i10, dArr2, i10 + 1, this.f7385c - i10);
            this.f7384b = dArr2;
        }
        this.f7384b[i10] = doubleValue;
        this.f7385c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        g();
        Charset charset = p.f7415a;
        collection.getClass();
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i10 = hVar.f7385c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7385c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f7384b;
            if (i12 > dArr.length) {
                this.f7384b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(hVar.f7384b, 0, this.f7384b, this.f7385c, hVar.f7385c);
            this.f7385c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f7385c) {
            return new h(this.f7385c, Arrays.copyOf(this.f7384b, i10));
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
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f7385c != hVar.f7385c) {
            return false;
        }
        double[] dArr = hVar.f7384b;
        for (int i10 = 0; i10 < this.f7385c; i10++) {
            if (Double.doubleToLongBits(this.f7384b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Double.valueOf(this.f7384b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7385c; i11++) {
            i10 = (i10 * 31) + p.a(Double.doubleToLongBits(this.f7384b[i11]));
        }
        return i10;
    }

    public final void i(double d10) {
        g();
        int i10 = this.f7385c;
        double[] dArr = this.f7384b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[b0.o(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f7384b = dArr2;
        }
        double[] dArr3 = this.f7384b;
        int i11 = this.f7385c;
        this.f7385c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f7385c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7384b[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f7385c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7385c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        double[] dArr = this.f7384b;
        double d10 = dArr[i10];
        int i11 = this.f7385c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f7385c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            double[] dArr = this.f7384b;
            System.arraycopy(dArr, i11, dArr, i10, this.f7385c - i11);
            this.f7385c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        g();
        l(i10);
        double[] dArr = this.f7384b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f7385c;
    }

    public h(int i10, double[] dArr) {
        this.f7384b = dArr;
        this.f7385c = i10;
    }

    public final boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
