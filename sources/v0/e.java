package v0;

import j7.a;

/* compiled from: LongSparseArray */
public final class e<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f15981e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f15982a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f15983b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f15984c;

    /* renamed from: d  reason: collision with root package name */
    public int f15985d;

    public e() {
        this(10);
    }

    public final void a(Long l10, long j10) {
        int i10 = this.f15985d;
        if (i10 == 0 || j10 > this.f15983b[i10 - 1]) {
            if (this.f15982a && i10 >= this.f15983b.length) {
                e();
            }
            int i11 = this.f15985d;
            if (i11 >= this.f15983b.length) {
                int i12 = (i11 + 1) * 8;
                int i13 = 4;
                while (true) {
                    if (i13 >= 32) {
                        break;
                    }
                    int i14 = (1 << i13) - 12;
                    if (i12 <= i14) {
                        i12 = i14;
                        break;
                    }
                    i13++;
                }
                int i15 = i12 / 8;
                long[] jArr = new long[i15];
                Object[] objArr = new Object[i15];
                long[] jArr2 = this.f15983b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f15984c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f15983b = jArr;
                this.f15984c = objArr;
            }
            this.f15983b[i11] = j10;
            this.f15984c[i11] = l10;
            this.f15985d = i11 + 1;
            return;
        }
        j(l10, j10);
    }

    public final void b() {
        int i10 = this.f15985d;
        Object[] objArr = this.f15984c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f15985d = 0;
        this.f15982a = false;
    }

    /* renamed from: c */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f15983b = (long[]) this.f15983b.clone();
            eVar.f15984c = (Object[]) this.f15984c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void e() {
        int i10 = this.f15985d;
        long[] jArr = this.f15983b;
        Object[] objArr = this.f15984c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f15981e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f15982a = false;
        this.f15985d = i11;
    }

    public final Object f(Long l10, long j10) {
        Object obj;
        int h10 = a.h(this.f15983b, this.f15985d, j10);
        if (h10 < 0 || (obj = this.f15984c[h10]) == f15981e) {
            return l10;
        }
        return obj;
    }

    public final long g(int i10) {
        if (this.f15982a) {
            e();
        }
        return this.f15983b[i10];
    }

    public final void j(Object obj, long j10) {
        int h10 = a.h(this.f15983b, this.f15985d, j10);
        if (h10 >= 0) {
            this.f15984c[h10] = obj;
            return;
        }
        int i10 = ~h10;
        int i11 = this.f15985d;
        if (i10 < i11) {
            Object[] objArr = this.f15984c;
            if (objArr[i10] == f15981e) {
                this.f15983b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f15982a && i11 >= this.f15983b.length) {
            e();
            i10 = ~a.h(this.f15983b, this.f15985d, j10);
        }
        int i12 = this.f15985d;
        if (i12 >= this.f15983b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f15983b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f15984c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f15983b = jArr;
            this.f15984c = objArr2;
        }
        int i17 = this.f15985d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f15983b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f15984c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f15985d - i10);
        }
        this.f15983b[i10] = j10;
        this.f15984c[i10] = obj;
        this.f15985d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f15984c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f15983b
            int r1 = r2.f15985d
            int r3 = j7.a.h(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f15984c
            r0 = r4[r3]
            java.lang.Object r1 = f15981e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f15982a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.k(long):void");
    }

    public final int l() {
        if (this.f15982a) {
            e();
        }
        return this.f15985d;
    }

    public final E m(int i10) {
        if (this.f15982a) {
            e();
        }
        return this.f15984c[i10];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15985d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f15985d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            Object m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i10) {
        this.f15982a = false;
        if (i10 == 0) {
            this.f15983b = a.B;
            this.f15984c = a.C;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f15983b = new long[i14];
        this.f15984c = new Object[i14];
    }
}
