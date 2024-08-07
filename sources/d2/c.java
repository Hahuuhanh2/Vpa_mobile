package d2;

import d2.k;
import java.util.ArrayList;

/* compiled from: CallbackRegistry */
public class c<C, T, A> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f8539a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f8540b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long[] f8541c;

    /* renamed from: d  reason: collision with root package name */
    public int f8542d;

    /* renamed from: e  reason: collision with root package name */
    public final a<C, T, A> f8543e;

    /* compiled from: CallbackRegistry */
    public static abstract class a<C, T, A> {
        public abstract void a(int i10, Object obj, a aVar);
    }

    public c() {
        k.a aVar = k.f8546f;
        this.f8543e = aVar;
    }

    public final boolean a(int i10) {
        int i11;
        if (i10 >= 64) {
            long[] jArr = this.f8541c;
            if (jArr == null || (i11 = (i10 / 64) - 1) >= jArr.length) {
                return false;
            }
            if (((1 << (i10 % 64)) & jArr[i11]) != 0) {
                return true;
            }
            return false;
        } else if (((1 << i10) & this.f8540b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final synchronized void b(int i10, a aVar) {
        int i11;
        this.f8542d++;
        int size = this.f8539a.size();
        long[] jArr = this.f8541c;
        if (jArr == null) {
            i11 = -1;
        } else {
            i11 = jArr.length - 1;
        }
        e(aVar, i10, i11);
        c(aVar, i10, (i11 + 2) * 64, size, 0);
        int i12 = this.f8542d - 1;
        this.f8542d = i12;
        if (i12 == 0) {
            long[] jArr2 = this.f8541c;
            long j10 = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length = jArr2.length - 1; length >= 0; length--) {
                    long j11 = this.f8541c[length];
                    if (j11 != 0) {
                        int i13 = (length + 1) * 64;
                        long j12 = Long.MIN_VALUE;
                        for (int i14 = (i13 + 64) - 1; i14 >= i13; i14--) {
                            if ((j11 & j12) != 0) {
                                this.f8539a.remove(i14);
                            }
                            j12 >>>= 1;
                        }
                        this.f8541c[length] = 0;
                    }
                }
            }
            long j13 = this.f8540b;
            if (j13 != 0) {
                for (int i15 = 63; i15 >= 0; i15--) {
                    if ((j13 & j10) != 0) {
                        this.f8539a.remove(i15);
                    }
                    j10 >>>= 1;
                }
                this.f8540b = 0;
            }
        }
    }

    public final void c(a aVar, int i10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f8543e.a(i10, this.f8539a.get(i11), aVar);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final Object clone() {
        c cVar;
        CloneNotSupportedException e10;
        synchronized (this) {
            try {
                cVar = (c) super.clone();
                try {
                    cVar.f8540b = 0;
                    cVar.f8541c = null;
                    cVar.f8542d = 0;
                    cVar.f8539a = new ArrayList();
                    int size = this.f8539a.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!a(i10)) {
                            cVar.f8539a.add(this.f8539a.get(i10));
                        }
                    }
                } catch (CloneNotSupportedException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    return cVar;
                }
            } catch (CloneNotSupportedException e12) {
                CloneNotSupportedException cloneNotSupportedException = e12;
                cVar = null;
                e10 = cloneNotSupportedException;
                e10.printStackTrace();
                return cVar;
            }
        }
        return cVar;
    }

    public final void e(a aVar, int i10, int i11) {
        if (i11 < 0) {
            c(aVar, i10, 0, Math.min(64, this.f8539a.size()), this.f8540b);
            return;
        }
        long j10 = this.f8541c[i11];
        int i12 = (i11 + 1) * 64;
        int min = Math.min(this.f8539a.size(), i12 + 64);
        e(aVar, i10, i11 - 1);
        c(aVar, i10, i12, min, j10);
    }

    public final void f(int i10) {
        if (i10 < 64) {
            this.f8540b = (1 << i10) | this.f8540b;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f8541c;
        if (jArr == null) {
            this.f8541c = new long[(this.f8539a.size() / 64)];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[(this.f8539a.size() / 64)];
            long[] jArr3 = this.f8541c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f8541c = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f8541c;
        jArr4[i11] = j10 | jArr4[i11];
    }
}
