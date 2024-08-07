package qd;

import vl.d;

/* compiled from: ModulusGF */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14444e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f14445a = new int[929];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14446b = new int[929];

    /* renamed from: c  reason: collision with root package name */
    public final d f14447c;

    /* renamed from: d  reason: collision with root package name */
    public final d f14448d;

    public a() {
        int i10 = 1;
        for (int i11 = 0; i11 < 929; i11++) {
            this.f14445a[i11] = i10;
            i10 = (i10 * 3) % 929;
        }
        for (int i12 = 0; i12 < 928; i12++) {
            this.f14446b[this.f14445a[i12]] = i12;
        }
        this.f14447c = new d(this, new int[]{0});
        this.f14448d = new d(this, new int[]{1});
    }

    public final int a(int i10) {
        if (i10 != 0) {
            return this.f14445a[(929 - this.f14446b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int b(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f14445a;
        int[] iArr2 = this.f14446b;
        return iArr[(iArr2[i10] + iArr2[i11]) % 928];
    }
}
