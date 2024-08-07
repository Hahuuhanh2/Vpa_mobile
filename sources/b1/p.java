package b1;

import android.graphics.Color;
import m1.j;
import n1.d;
import p3.l0;

/* compiled from: VelocityMatrix */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public float f3977a;

    /* renamed from: b  reason: collision with root package name */
    public float f3978b;

    /* renamed from: c  reason: collision with root package name */
    public float f3979c;

    /* renamed from: d  reason: collision with root package name */
    public float f3980d;

    /* renamed from: e  reason: collision with root package name */
    public float f3981e;

    /* renamed from: f  reason: collision with root package name */
    public float f3982f;

    public /* synthetic */ p() {
    }

    public /* synthetic */ p(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3977a = f10;
        this.f3978b = f11;
        this.f3979c = f12;
        this.f3980d = f13;
        this.f3981e = f14;
        this.f3982f = f15;
    }

    public static p b(int i10) {
        float f10;
        j jVar = j.f13075k;
        float k02 = l0.k0(Color.red(i10));
        float k03 = l0.k0(Color.green(i10));
        float k04 = l0.k0(Color.blue(i10));
        float[][] fArr = l0.f13960r;
        float[] fArr2 = fArr[0];
        float f11 = fArr2[1] * k03;
        float f12 = (fArr2[2] * k04) + f11 + (fArr2[0] * k02);
        float[] fArr3 = fArr[1];
        float f13 = fArr3[1] * k03;
        float f14 = (fArr3[2] * k04) + f13 + (fArr3[0] * k02);
        float[] fArr4 = fArr[2];
        float f15 = (k04 * fArr4[2]) + (k03 * fArr4[1]) + (k02 * fArr4[0]);
        float[][] fArr5 = l0.f13957o;
        float[] fArr6 = fArr5[0];
        float f16 = fArr6[1] * f14;
        float f17 = (fArr6[2] * f15) + f16 + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f18 = fArr7[1] * f14;
        float f19 = fArr7[2] * f15;
        float[] fArr8 = fArr5[2];
        float f20 = f12 * fArr8[0];
        float f21 = f15 * fArr8[2];
        float[] fArr9 = jVar.f13082g;
        float f22 = fArr9[0] * f17;
        float f23 = fArr9[1] * (f19 + f18 + (fArr7[0] * f12));
        float f24 = fArr9[2] * (f21 + (f14 * fArr8[1]) + f20);
        float pow = (float) Math.pow(((double) (Math.abs(f22) * jVar.f13083h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f23) * jVar.f13083h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f24) * jVar.f13083h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f22) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f25 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d10)) / 11.0f;
        float f26 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f27 = signum2 * 20.0f;
        float f28 = ((21.0f * signum3) + ((signum * 20.0f) + f27)) / 20.0f;
        float f29 = (((signum * 40.0f) + f27) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f26, (double) f25)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f30 = atan2;
        float f31 = (3.1415927f * f30) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f29 * jVar.f13077b) / jVar.f13076a), (double) (jVar.f13079d * jVar.f13085j))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        if (((double) f30) < 20.14d) {
            f10 = 360.0f + f30;
        } else {
            f10 = f30;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) jVar.f13081f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f10) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.f13080e) * jVar.f13078c) * ((float) Math.sqrt((double) ((f26 * f26) + (f25 * f25))))) / (f28 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        Math.sqrt((double) ((pow5 * jVar.f13079d) / (jVar.f13076a + 4.0f)));
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((jVar.f13084i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d11 = (double) f31;
        return new p(f30, sqrt, pow4, f32, ((float) Math.cos(d11)) * log, log * ((float) Math.sin(d11)));
    }

    public static p c(float f10, float f11, float f12) {
        j jVar = j.f13075k;
        float f13 = jVar.f13079d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * jVar.f13079d) / (jVar.f13076a + 4.0f)));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((((double) (jVar.f13084i * f11)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (double) ((3.1415927f * f12) / 180.0f);
        return new p(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        int i12 = i10;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f3979c;
        float f17 = f13 + this.f3980d;
        float f18 = (this.f3977a * f14) + f16;
        float f19 = (this.f3978b * f15) + f17;
        float radians = (float) Math.toRadians((double) this.f3982f);
        float radians2 = (float) Math.toRadians((double) this.f3981e);
        double d10 = (double) radians;
        double sin = Math.sin(d10);
        double d11 = (double) (((float) i11) * f15);
        double cos = Math.cos(d10);
        fArr[0] = (((float) ((sin * ((double) (((float) (-i12)) * f14))) - (Math.cos(d10) * d11))) * radians2) + f18;
        fArr[1] = (radians2 * ((float) ((cos * ((double) (((float) i12) * f14))) - (Math.sin(d10) * d11)))) + f19;
    }

    public int d(j jVar) {
        float f10;
        j jVar2 = jVar;
        float f11 = this.f3978b;
        if (((double) f11) != 0.0d) {
            double d10 = (double) this.f3979c;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) jVar2.f13081f), 0.73d), 1.1111111111111112d);
                double d11 = (double) ((this.f3977a * 3.1415927f) / 180.0f);
                float pow2 = jVar2.f13076a * ((float) Math.pow(((double) this.f3979c) / 100.0d, (1.0d / ((double) jVar2.f13079d)) / ((double) jVar2.f13085j)));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * jVar2.f13080e * jVar2.f13078c;
                float f12 = pow2 / jVar2.f13077b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = 11.0f * pow * cos2;
                float f14 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f13 + (cos * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f12 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
                float signum = (100.0f / jVar2.f13083h) * Math.signum(f18) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / jVar2.f13083h) * Math.signum(f19) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))))), 2.380952380952381d));
                float signum3 = Math.signum(f20);
                float[] fArr = jVar2.f13082g;
                float f21 = signum / fArr[0];
                float f22 = signum2 / fArr[1];
                float pow3 = (((100.0f / jVar2.f13083h) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = l0.f13958p;
                float[] fArr3 = fArr2[0];
                float f23 = fArr3[1] * f22;
                float f24 = (fArr3[2] * pow3) + f23 + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = fArr4[1] * f22;
                float f26 = fArr4[2] * pow3;
                float[] fArr5 = fArr2[2];
                float f27 = f21 * fArr5[0];
                return d.a((double) f24, (double) (f26 + f25 + (fArr4[0] * f21)), (double) ((pow3 * fArr5[2]) + (f22 * fArr5[1]) + f27));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) jVar2.f13081f), 0.73d), 1.1111111111111112d);
        double d112 = (double) ((this.f3977a * 3.1415927f) / 180.0f);
        float pow22 = jVar2.f13076a * ((float) Math.pow(((double) this.f3979c) / 100.0d, (1.0d / ((double) jVar2.f13079d)) / ((double) jVar2.f13085j)));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * jVar2.f13080e * jVar2.f13078c;
        float f122 = pow22 / jVar2.f13077b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = 11.0f * pow4 * cos22;
        float f142 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f132 + (cos3 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f122 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f182)) * 27.13d) / (400.0d - ((double) Math.abs(f182))));
        float signum4 = (100.0f / jVar2.f13083h) * Math.signum(f182) * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = (100.0f / jVar2.f13083h) * Math.signum(f192) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))))), 2.380952380952381d));
        float signum32 = Math.signum(f202);
        float[] fArr6 = jVar2.f13082g;
        float f212 = signum4 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float pow32 = (((100.0f / jVar2.f13083h) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f202)) * 27.13d) / (400.0d - ((double) Math.abs(f202))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = l0.f13958p;
        float[] fArr32 = fArr22[0];
        float f232 = fArr32[1] * f222;
        float f242 = (fArr32[2] * pow32) + f232 + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = fArr42[1] * f222;
        float f262 = fArr42[2] * pow32;
        float[] fArr52 = fArr22[2];
        float f272 = f212 * fArr52[0];
        return d.a((double) f242, (double) (f262 + f252 + (fArr42[0] * f212)), (double) ((pow32 * fArr52[2]) + (f222 * fArr52[1]) + f272));
    }
}
