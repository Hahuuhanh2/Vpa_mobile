package ed;

/* compiled from: GenericGF */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f9339h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f9340i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f9341j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f9342k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f9343l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f9344m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f9345n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f9346o;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f9347a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9348b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9349c;

    /* renamed from: d  reason: collision with root package name */
    public final b f9350d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9351e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9352f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9353g;

    static {
        a aVar = new a(67, 64, 1);
        f9341j = aVar;
        a aVar2 = new a(301, 256, 1);
        f9344m = aVar2;
        f9345n = aVar2;
        f9346o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f9352f = i10;
        this.f9351e = i11;
        this.f9353g = i12;
        this.f9347a = new int[i11];
        this.f9348b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f9347a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f9348b[this.f9347a[i15]] = i15;
        }
        this.f9349c = new b(this, new int[]{0});
        this.f9350d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f9349c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    public final int b(int i10) {
        if (i10 != 0) {
            return this.f9347a[(this.f9351e - this.f9348b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f9347a;
        int[] iArr2 = this.f9348b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f9351e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f9352f) + ',' + this.f9351e + ')';
    }
}
