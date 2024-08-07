package fk;

import f0.b0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import n0.l;
import sk.j;

/* compiled from: SlidingWindow.kt */
public final class a0<T> extends c<T> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f20174a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20175b;

    /* renamed from: c  reason: collision with root package name */
    public int f20176c;

    /* renamed from: d  reason: collision with root package name */
    public int f20177d;

    /* compiled from: SlidingWindow.kt */
    public static final class a extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        public int f20178c;

        /* renamed from: d  reason: collision with root package name */
        public int f20179d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a0<T> f20180e;

        public a(a0<T> a0Var) {
            this.f20180e = a0Var;
            this.f20178c = a0Var.g();
            this.f20179d = a0Var.f20176c;
        }
    }

    public a0(Object[] objArr, int i10) {
        boolean z10;
        this.f20174a = objArr;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > objArr.length ? false : z11) {
                this.f20175b = objArr.length;
                this.f20177d = i10;
                return;
            }
            StringBuilder l10 = l.l("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            l10.append(objArr.length);
            throw new IllegalArgumentException(l10.toString().toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("ring buffer filled size should not be negative but it is ", i10).toString());
    }

    public final int g() {
        return this.f20177d;
    }

    public final T get(int i10) {
        int g2 = g();
        if (i10 >= 0 && i10 < g2) {
            return this.f20174a[(this.f20176c + i10) % this.f20175b];
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", g2));
    }

    public final void i(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > this.f20177d) {
                z11 = false;
            }
            if (!z11) {
                StringBuilder l10 = l.l("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
                l10.append(this.f20177d);
                throw new IllegalArgumentException(l10.toString().toString());
            } else if (i10 > 0) {
                int i11 = this.f20176c;
                int i12 = this.f20175b;
                int i13 = (i11 + i10) % i12;
                if (i11 > i13) {
                    h.p0(this.f20174a, i11, i12);
                    h.p0(this.f20174a, 0, i13);
                } else {
                    h.p0(this.f20174a, i11, i13);
                }
                this.f20176c = i13;
                this.f20177d -= i10;
            }
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("n shouldn't be negative but it is ", i10).toString());
        }
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }

    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        if (tArr.length < g()) {
            tArr = Arrays.copyOf(tArr, g());
            j.e(tArr, "copyOf(this, newSize)");
        }
        int g2 = g();
        int i10 = this.f20176c;
        int i11 = 0;
        int i12 = 0;
        while (i12 < g2 && i10 < this.f20175b) {
            tArr[i12] = this.f20174a[i10];
            i12++;
            i10++;
        }
        while (i12 < g2) {
            tArr[i12] = this.f20174a[i11];
            i12++;
            i11++;
        }
        if (tArr.length > g()) {
            tArr[g()] = null;
        }
        return tArr;
    }
}
