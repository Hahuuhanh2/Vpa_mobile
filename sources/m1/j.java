package m1;

import p3.l0;

/* compiled from: ViewingConditions */
public final class j {

    /* renamed from: k  reason: collision with root package name */
    public static final j f13075k;

    /* renamed from: a  reason: collision with root package name */
    public final float f13076a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13077b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13078c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13079d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13080e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13081f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f13082g;

    /* renamed from: h  reason: collision with root package name */
    public final float f13083h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13084i;

    /* renamed from: j  reason: collision with root package name */
    public final float f13085j;

    static {
        float f10;
        float[] fArr = l0.f13959q;
        float m12 = (float) ((((double) l0.m1()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = l0.f13957o;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr3[1] * f12;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13 + (fArr3[0] * f11);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f11 * fArr5[0]);
        if (((double) 1.0f) >= 0.9d) {
            f10 = 0.69f;
        } else {
            f10 = 0.655f;
        }
        float f18 = f10;
        float exp = (1.0f - (((float) Math.exp((double) (((-m12) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d10 = (double) exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * m12) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(((double) m12) * 5.0d))) + (f20 * m12);
        float m13 = l0.m1() / fArr[1];
        double d11 = (double) m13;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f17)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f16)) / 100.0d, 0.42d), pow2};
        float f22 = fArr7[0];
        float f23 = fArr7[1];
        f13075k = new j(m13, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f22 * 400.0f) / (f22 + 27.13f)) * 2.0f) + ((f23 * 400.0f) / (f23 + 27.13f))) * pow, pow, pow, f18, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f13081f = f10;
        this.f13076a = f11;
        this.f13077b = f12;
        this.f13078c = f13;
        this.f13079d = f14;
        this.f13080e = f15;
        this.f13082g = fArr;
        this.f13083h = f16;
        this.f13084i = f17;
        this.f13085j = f18;
    }
}