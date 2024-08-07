package ld;

import kd.q;

/* compiled from: AbstractRSSReader */
public abstract class a extends q {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f12953a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12954b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f12955c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f12956d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f12957e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f12958f;

    public a() {
        int[] iArr = new int[8];
        this.f12954b = iArr;
        this.f12955c = new float[4];
        this.f12956d = new float[4];
        this.f12957e = new int[(iArr.length / 2)];
        this.f12958f = new int[(iArr.length / 2)];
    }

    public static void h(float[] fArr, int[] iArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void i(float[] fArr, int[] iArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean j(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = ((float) i10) / ((float) ((iArr[2] + i10) + iArr[3]));
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }
}
