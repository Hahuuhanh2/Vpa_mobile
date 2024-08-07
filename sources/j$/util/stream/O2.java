package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

abstract class O2 extends C0433e implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f18671e = newArray(16);

    /* renamed from: f  reason: collision with root package name */
    Object[] f18672f;

    O2() {
    }

    O2(int i10) {
        super(i10);
    }

    public Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void c(int i10, Object obj) {
        long j10 = (long) i10;
        long count = count() + j10;
        if (count > ((long) s(obj)) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f18777c == 0) {
            System.arraycopy(this.f18671e, 0, obj, i10, this.f18776b);
        } else {
            for (int i11 = 0; i11 < this.f18777c; i11++) {
                Object obj2 = this.f18672f[i11];
                System.arraycopy(obj2, 0, obj, i10, s(obj2));
                i10 += s(this.f18672f[i11]);
            }
            int i12 = this.f18776b;
            if (i12 > 0) {
                System.arraycopy(this.f18671e, 0, obj, i10, i12);
            }
        }
    }

    public final void clear() {
        Object[] objArr = this.f18672f;
        if (objArr != null) {
            this.f18671e = objArr[0];
            this.f18672f = null;
            this.f18778d = null;
        }
        this.f18776b = 0;
        this.f18777c = 0;
    }

    public void d(Object obj) {
        for (int i10 = 0; i10 < this.f18777c; i10++) {
            Object obj2 = this.f18672f[i10];
            r(obj2, 0, s(obj2), obj);
        }
        r(this.f18671e, 0, this.f18776b, obj);
    }

    public abstract Object newArray(int i10);

    /* access modifiers changed from: protected */
    public abstract void r(Object obj, int i10, int i11, Object obj2);

    /* access modifiers changed from: protected */
    public abstract int s(Object obj);

    public abstract Spliterator spliterator();

    /* access modifiers changed from: protected */
    public final int t(long j10) {
        if (this.f18777c == 0) {
            if (j10 < ((long) this.f18776b)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else if (j10 < count()) {
            for (int i10 = 0; i10 <= this.f18777c; i10++) {
                if (j10 < this.f18778d[i10] + ((long) s(this.f18672f[i10]))) {
                    return i10;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    /* access modifiers changed from: protected */
    public final void u(long j10) {
        int i10 = this.f18777c;
        long s10 = i10 == 0 ? (long) s(this.f18671e) : ((long) s(this.f18672f[i10])) + this.f18778d[i10];
        if (j10 > s10) {
            if (this.f18672f == null) {
                Object[] v2 = v();
                this.f18672f = v2;
                this.f18778d = new long[8];
                v2[0] = this.f18671e;
            }
            int i11 = this.f18777c;
            while (true) {
                i11++;
                if (j10 > s10) {
                    Object[] objArr = this.f18672f;
                    if (i11 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f18672f = Arrays.copyOf(objArr, length);
                        this.f18778d = Arrays.copyOf(this.f18778d, length);
                    }
                    int min = 1 << ((i11 == 0 || i11 == 1) ? this.f18775a : Math.min((this.f18775a + i11) - 1, 30));
                    this.f18672f[i11] = newArray(min);
                    long[] jArr = this.f18778d;
                    int i12 = i11 - 1;
                    jArr[i11] = jArr[i12] + ((long) s(this.f18672f[i12]));
                    s10 += (long) min;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object[] v();

    /* access modifiers changed from: protected */
    public final void w() {
        long j10;
        if (this.f18776b == s(this.f18671e)) {
            if (this.f18672f == null) {
                Object[] v2 = v();
                this.f18672f = v2;
                this.f18778d = new long[8];
                v2[0] = this.f18671e;
            }
            int i10 = this.f18777c;
            int i11 = i10 + 1;
            Object[] objArr = this.f18672f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    j10 = (long) s(this.f18671e);
                } else {
                    j10 = ((long) s(objArr[i10])) + this.f18778d[i10];
                }
                u(j10 + 1);
            }
            this.f18776b = 0;
            int i12 = this.f18777c + 1;
            this.f18777c = i12;
            this.f18671e = this.f18672f[i12];
        }
    }
}
