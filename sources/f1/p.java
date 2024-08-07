package f1;

import androidx.constraintlayout.widget.a;
import b1.c;
import g1.a;
import java.util.LinkedHashMap;
import v.v;

/* compiled from: MotionPaths */
public final class p implements Comparable<p> {

    /* renamed from: y  reason: collision with root package name */
    public static String[] f9755y = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    public c f9756a;

    /* renamed from: b  reason: collision with root package name */
    public int f9757b = 0;

    /* renamed from: c  reason: collision with root package name */
    public float f9758c;

    /* renamed from: d  reason: collision with root package name */
    public float f9759d;

    /* renamed from: e  reason: collision with root package name */
    public float f9760e;

    /* renamed from: f  reason: collision with root package name */
    public float f9761f;

    /* renamed from: n  reason: collision with root package name */
    public float f9762n;

    /* renamed from: o  reason: collision with root package name */
    public float f9763o;

    /* renamed from: p  reason: collision with root package name */
    public float f9764p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public int f9765q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f9766r = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f9767s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public n f9768t = null;

    /* renamed from: u  reason: collision with root package name */
    public LinkedHashMap<String, a> f9769u = new LinkedHashMap<>();

    /* renamed from: v  reason: collision with root package name */
    public int f9770v = 0;

    /* renamed from: w  reason: collision with root package name */
    public double[] f9771w = new double[18];

    /* renamed from: x  reason: collision with root package name */
    public double[] f9772x = new double[18];

    public p() {
    }

    public static boolean c(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            if (Float.isNaN(f10) != Float.isNaN(f11)) {
                return true;
            }
            return false;
        } else if (Math.abs(f10 - f11) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public static void k(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f13 = f16;
            } else if (i11 == 2) {
                f15 = f16;
            } else if (i11 == 3) {
                f12 = f16;
            } else if (i11 == 4) {
                f14 = f16;
            }
        }
        float f17 = f13 - ((0.0f * f12) / 2.0f);
        float f18 = f15 - ((0.0f * f14) / 2.0f);
        fArr[0] = (((f12 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f14 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public final void b(a.C0016a aVar) {
        boolean z10;
        this.f9756a = c.c(aVar.f1950d.f2014d);
        a.c cVar = aVar.f1950d;
        this.f9765q = cVar.f2015e;
        this.f9766r = cVar.f2012b;
        this.f9764p = cVar.f2018h;
        this.f9757b = cVar.f2016f;
        float f10 = aVar.f1949c.f2028e;
        this.f9767s = aVar.f1951e.C;
        for (String next : aVar.f1953g.keySet()) {
            g1.a aVar2 = aVar.f1953g.get(next);
            if (aVar2 != null) {
                int g2 = v.g(aVar2.f10266c);
                if (g2 == 4 || g2 == 5 || g2 == 7) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    this.f9769u.put(next, aVar2);
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        return Float.compare(this.f9759d, ((p) obj).f9759d);
    }

    public final void i(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        int[] iArr2 = iArr;
        float f10 = this.f9760e;
        float f11 = this.f9761f;
        float f12 = this.f9762n;
        float f13 = this.f9763o;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr2[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        n nVar = this.f9768t;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.c(d10, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d11 = (double) f15;
            double d12 = (double) f10;
            double d13 = (double) f11;
            f10 = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f12 / 2.0f)));
            f11 = (float) ((((double) f16) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
        }
        fArr[i10] = (f12 / 2.0f) + f10 + 0.0f;
        fArr[i10 + 1] = (f13 / 2.0f) + f11 + 0.0f;
    }

    public final void j(float f10, float f11, float f12, float f13) {
        this.f9760e = f10;
        this.f9761f = f11;
        this.f9762n = f12;
        this.f9763o = f13;
    }

    public final void m(n nVar, p pVar) {
        double d10 = (double) ((((this.f9762n / 2.0f) + this.f9760e) - pVar.f9760e) - (pVar.f9762n / 2.0f));
        double d11 = (double) ((((this.f9763o / 2.0f) + this.f9761f) - pVar.f9761f) - (pVar.f9763o / 2.0f));
        this.f9768t = nVar;
        this.f9760e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f9767s)) {
            this.f9761f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f9761f = (float) Math.toRadians((double) this.f9767s);
        }
    }

    public p(int i10, int i11, h hVar, p pVar, p pVar2) {
        float f10;
        int i12;
        float f11;
        float f12;
        h hVar2 = hVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        if (pVar3.f9766r != -1) {
            float f13 = ((float) hVar2.f9619a) / 100.0f;
            this.f9758c = f13;
            this.f9757b = hVar2.f9663h;
            this.f9770v = hVar2.f9670o;
            float f14 = Float.isNaN(hVar2.f9664i) ? f13 : hVar2.f9664i;
            float f15 = Float.isNaN(hVar2.f9665j) ? f13 : hVar2.f9665j;
            float f16 = pVar4.f9762n;
            float f17 = pVar3.f9762n;
            float f18 = pVar4.f9763o;
            float f19 = pVar3.f9763o;
            this.f9759d = this.f9758c;
            this.f9762n = (float) ((int) (((f16 - f17) * f14) + f17));
            this.f9763o = (float) ((int) (((f18 - f19) * f15) + f19));
            int i13 = hVar2.f9670o;
            if (i13 == 1) {
                float f20 = Float.isNaN(hVar2.f9666k) ? f13 : hVar2.f9666k;
                float f21 = pVar4.f9760e;
                float f22 = pVar3.f9760e;
                this.f9760e = android.support.v4.media.a.e(f21, f22, f20, f22);
                f13 = !Float.isNaN(hVar2.f9667l) ? hVar2.f9667l : f13;
                float f23 = pVar4.f9761f;
                float f24 = pVar3.f9761f;
                this.f9761f = android.support.v4.media.a.e(f23, f24, f13, f24);
            } else if (i13 != 2) {
                float f25 = Float.isNaN(hVar2.f9666k) ? f13 : hVar2.f9666k;
                float f26 = pVar4.f9760e;
                float f27 = pVar3.f9760e;
                this.f9760e = android.support.v4.media.a.e(f26, f27, f25, f27);
                f13 = !Float.isNaN(hVar2.f9667l) ? hVar2.f9667l : f13;
                float f28 = pVar4.f9761f;
                float f29 = pVar3.f9761f;
                this.f9761f = android.support.v4.media.a.e(f28, f29, f13, f29);
            } else {
                if (Float.isNaN(hVar2.f9666k)) {
                    float f30 = pVar4.f9760e;
                    float f31 = pVar3.f9760e;
                    f11 = android.support.v4.media.a.e(f30, f31, f13, f31);
                } else {
                    f11 = hVar2.f9666k * Math.min(f15, f14);
                }
                this.f9760e = f11;
                if (Float.isNaN(hVar2.f9667l)) {
                    float f32 = pVar4.f9761f;
                    float f33 = pVar3.f9761f;
                    f12 = android.support.v4.media.a.e(f32, f33, f13, f33);
                } else {
                    f12 = hVar2.f9667l;
                }
                this.f9761f = f12;
            }
            this.f9766r = pVar3.f9766r;
            this.f9756a = c.c(hVar2.f9661f);
            this.f9765q = hVar2.f9662g;
            return;
        }
        int i14 = hVar2.f9670o;
        if (i14 == 1) {
            p pVar5 = pVar3;
            float f34 = ((float) hVar2.f9619a) / 100.0f;
            this.f9758c = f34;
            this.f9757b = hVar2.f9663h;
            float f35 = Float.isNaN(hVar2.f9664i) ? f34 : hVar2.f9664i;
            float f36 = Float.isNaN(hVar2.f9665j) ? f34 : hVar2.f9665j;
            float f37 = pVar4.f9762n - pVar5.f9762n;
            float f38 = pVar4.f9763o - pVar5.f9763o;
            this.f9759d = this.f9758c;
            f34 = !Float.isNaN(hVar2.f9666k) ? hVar2.f9666k : f34;
            float f39 = pVar5.f9760e;
            float f40 = pVar5.f9762n;
            float f41 = pVar5.f9761f;
            float f42 = pVar5.f9763o;
            float f43 = ((pVar4.f9762n / 2.0f) + pVar4.f9760e) - ((f40 / 2.0f) + f39);
            float f44 = ((pVar4.f9763o / 2.0f) + pVar4.f9761f) - ((f42 / 2.0f) + f41);
            float f45 = f43 * f34;
            float f46 = f37 * f35;
            float f47 = f46 / 2.0f;
            this.f9760e = (float) ((int) ((f39 + f45) - f47));
            float f48 = f34 * f44;
            float f49 = f38 * f36;
            float f50 = f49 / 2.0f;
            this.f9761f = (float) ((int) ((f41 + f48) - f50));
            this.f9762n = (float) ((int) (f40 + f46));
            this.f9763o = (float) ((int) (f42 + f49));
            h hVar3 = hVar;
            float f51 = Float.isNaN(hVar3.f9667l) ? 0.0f : hVar3.f9667l;
            float f52 = (-f44) * f51;
            float f53 = f43 * f51;
            this.f9770v = 1;
            p pVar6 = pVar;
            this.f9760e = ((float) ((int) ((pVar6.f9760e + f45) - f47))) + f52;
            this.f9761f = ((float) ((int) ((pVar6.f9761f + f48) - f50))) + f53;
            this.f9766r = this.f9766r;
            this.f9756a = c.c(hVar3.f9661f);
            this.f9765q = hVar3.f9662g;
        } else if (i14 != 2) {
            float f54 = ((float) hVar2.f9619a) / 100.0f;
            this.f9758c = f54;
            this.f9757b = hVar2.f9663h;
            float f55 = Float.isNaN(hVar2.f9664i) ? f54 : hVar2.f9664i;
            float f56 = Float.isNaN(hVar2.f9665j) ? f54 : hVar2.f9665j;
            float f57 = pVar4.f9762n;
            float f58 = pVar3.f9762n;
            float f59 = f57 - f58;
            float f60 = pVar4.f9763o;
            float f61 = pVar3.f9763o;
            float f62 = f60 - f61;
            this.f9759d = this.f9758c;
            float f63 = pVar3.f9760e;
            float f64 = pVar3.f9761f;
            float f65 = ((f57 / 2.0f) + pVar4.f9760e) - ((f58 / 2.0f) + f63);
            float f66 = ((f60 / 2.0f) + pVar4.f9761f) - ((f61 / 2.0f) + f64);
            float f67 = f59 * f55;
            float f68 = f67 / 2.0f;
            this.f9760e = (float) ((int) (((f65 * f54) + f63) - f68));
            float f69 = (f66 * f54) + f64;
            float f70 = f62 * f56;
            float f71 = f70 / 2.0f;
            this.f9761f = (float) ((int) (f69 - f71));
            this.f9762n = (float) ((int) (f58 + f67));
            this.f9763o = (float) ((int) (f61 + f70));
            h hVar4 = hVar;
            float f72 = Float.isNaN(hVar4.f9666k) ? f54 : hVar4.f9666k;
            float f73 = Float.isNaN(hVar4.f9669n) ? 0.0f : hVar4.f9669n;
            f54 = !Float.isNaN(hVar4.f9667l) ? hVar4.f9667l : f54;
            if (Float.isNaN(hVar4.f9668m)) {
                i12 = 0;
                f10 = 0.0f;
            } else {
                f10 = hVar4.f9668m;
                i12 = 0;
            }
            this.f9770v = i12;
            p pVar7 = pVar;
            this.f9760e = (float) ((int) (((f10 * f66) + ((f72 * f65) + pVar7.f9760e)) - f68));
            this.f9761f = (float) ((int) (((f66 * f54) + ((f65 * f73) + pVar7.f9761f)) - f71));
            this.f9756a = c.c(hVar4.f9661f);
            this.f9765q = hVar4.f9662g;
        } else {
            p pVar8 = pVar3;
            h hVar5 = hVar2;
            float f74 = ((float) hVar5.f9619a) / 100.0f;
            this.f9758c = f74;
            this.f9757b = hVar5.f9663h;
            float f75 = Float.isNaN(hVar5.f9664i) ? f74 : hVar5.f9664i;
            float f76 = Float.isNaN(hVar5.f9665j) ? f74 : hVar5.f9665j;
            float f77 = pVar4.f9762n;
            float f78 = pVar8.f9762n;
            float f79 = f77 - f78;
            float f80 = pVar4.f9763o;
            float f81 = pVar8.f9763o;
            float f82 = f80 - f81;
            this.f9759d = this.f9758c;
            float f83 = pVar8.f9760e;
            float f84 = pVar8.f9761f;
            float f85 = (f77 / 2.0f) + pVar4.f9760e;
            float f86 = (f80 / 2.0f) + pVar4.f9761f;
            float f87 = f79 * f75;
            this.f9760e = (float) ((int) ((((f85 - ((f78 / 2.0f) + f83)) * f74) + f83) - (f87 / 2.0f)));
            float f88 = f82 * f76;
            this.f9761f = (float) ((int) ((((f86 - ((f81 / 2.0f) + f84)) * f74) + f84) - (f88 / 2.0f)));
            this.f9762n = (float) ((int) (f78 + f87));
            this.f9763o = (float) ((int) (f81 + f88));
            this.f9770v = 2;
            h hVar6 = hVar;
            if (!Float.isNaN(hVar6.f9666k)) {
                this.f9760e = (float) ((int) (hVar6.f9666k * ((float) ((int) (((float) i10) - this.f9762n)))));
            }
            if (!Float.isNaN(hVar6.f9667l)) {
                this.f9761f = (float) ((int) (hVar6.f9667l * ((float) ((int) (((float) i11) - this.f9763o)))));
            }
            this.f9766r = this.f9766r;
            this.f9756a = c.c(hVar6.f9661f);
            this.f9765q = hVar6.f9662g;
        }
    }
}
