package f1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import b1.a;
import b1.b;
import b1.j;
import e1.b;
import e1.c;
import e1.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p3.l0;

/* compiled from: MotionController */
public final class n {
    public k[] A;
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    /* renamed from: a  reason: collision with root package name */
    public Rect f9729a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public View f9730b;

    /* renamed from: c  reason: collision with root package name */
    public int f9731c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9732d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f9733e = -1;

    /* renamed from: f  reason: collision with root package name */
    public p f9734f = new p();

    /* renamed from: g  reason: collision with root package name */
    public p f9735g = new p();

    /* renamed from: h  reason: collision with root package name */
    public l f9736h = new l();

    /* renamed from: i  reason: collision with root package name */
    public l f9737i = new l();

    /* renamed from: j  reason: collision with root package name */
    public b[] f9738j;

    /* renamed from: k  reason: collision with root package name */
    public a f9739k;

    /* renamed from: l  reason: collision with root package name */
    public float f9740l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f9741m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f9742n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    public int[] f9743o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f9744p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f9745q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f9746r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f9747s;

    /* renamed from: t  reason: collision with root package name */
    public float[] f9748t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<p> f9749u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public float[] f9750v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<d> f9751w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, d> f9752x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, c> f9753y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, e1.b> f9754z;

    public n(View view) {
        this.f9730b = view;
        this.f9731c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    public static void g(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i10 == 4) {
            int i16 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
            rect2.top = (i16 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
    }

    public final void a(d dVar) {
        this.f9751w.add(dVar);
    }

    public final float b(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f9742n;
            if (((double) f13) != 1.0d) {
                float f14 = this.f9741m;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        b1.c cVar = this.f9734f.f9756a;
        float f15 = Float.NaN;
        Iterator<p> it = this.f9749u.iterator();
        while (it.hasNext()) {
            p next = it.next();
            b1.c cVar2 = next.f9756a;
            if (cVar2 != null) {
                float f16 = next.f9758c;
                if (f16 < f10) {
                    cVar = cVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f9758c;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) cVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public final void c(double d10, float[] fArr, float[] fArr2) {
        double d11 = d10;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f9738j[0].c(d11, dArr);
        this.f9738j[0].f(d11, dArr2);
        float f10 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        p pVar = this.f9734f;
        int[] iArr = this.f9743o;
        float f11 = pVar.f9760e;
        float f12 = pVar.f9761f;
        float f13 = pVar.f9762n;
        float f14 = pVar.f9763o;
        float f15 = 0.0f;
        float f16 = 0.0f;
        int i10 = 0;
        float f17 = 0.0f;
        while (i10 < iArr.length) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f18;
                f10 = f19;
            } else if (i11 == 2) {
                f12 = f18;
                f17 = f19;
            } else if (i11 == 3) {
                f13 = f18;
                f15 = f19;
            } else if (i11 == 4) {
                f14 = f18;
                f16 = f19;
            }
            i10++;
            double d12 = d10;
            float[] fArr3 = fArr2;
        }
        float f20 = 2.0f;
        float f21 = (f15 / 2.0f) + f10;
        float f22 = (f16 / 2.0f) + f17;
        n nVar = pVar.f9768t;
        if (nVar != null) {
            float[] fArr4 = new float[2];
            float[] fArr5 = new float[2];
            nVar.c(d10, fArr4, fArr5);
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            float f25 = fArr5[0];
            float f26 = fArr5[1];
            double d13 = (double) f11;
            double d14 = (double) f12;
            float cos = (float) ((((double) f24) - (Math.cos(d14) * d13)) - ((double) (f14 / 2.0f)));
            double d15 = (double) f25;
            double d16 = (double) f10;
            double sin = (Math.sin(d14) * d16) + d15;
            double d17 = (double) f17;
            f22 = (float) ((Math.sin(d14) * d17) + (((double) f26) - (Math.cos(d14) * d16)));
            f12 = cos;
            f21 = (float) ((Math.cos(d14) * d17) + sin);
            f11 = (float) (((Math.sin(d14) * d13) + ((double) f23)) - ((double) (f13 / 2.0f)));
            f20 = 2.0f;
        }
        fArr[0] = (f13 / f20) + f11 + 0.0f;
        fArr[1] = (f14 / f20) + f12 + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = f22;
    }

    public final void d(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float b10 = b(f10, this.f9750v);
        b[] bVarArr = this.f9738j;
        int i10 = 0;
        if (bVarArr != null) {
            double d10 = (double) b10;
            bVarArr[0].f(d10, this.f9745q);
            this.f9738j[0].c(d10, this.f9744p);
            float f13 = this.f9750v[0];
            while (true) {
                dArr = this.f9745q;
                if (i10 >= dArr.length) {
                    break;
                }
                dArr[i10] = dArr[i10] * ((double) f13);
                i10++;
            }
            a aVar = this.f9739k;
            if (aVar != null) {
                double[] dArr2 = this.f9744p;
                if (dArr2.length > 0) {
                    aVar.c(d10, dArr2);
                    this.f9739k.f(d10, this.f9745q);
                    p pVar = this.f9734f;
                    int[] iArr = this.f9743o;
                    double[] dArr3 = this.f9745q;
                    double[] dArr4 = this.f9744p;
                    pVar.getClass();
                    p.k(f11, f12, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            p pVar2 = this.f9734f;
            int[] iArr2 = this.f9743o;
            double[] dArr5 = this.f9744p;
            pVar2.getClass();
            p.k(f11, f12, fArr, iArr2, dArr, dArr5);
            return;
        }
        p pVar3 = this.f9735g;
        float f14 = pVar3.f9760e;
        p pVar4 = this.f9734f;
        float f15 = f14 - pVar4.f9760e;
        float f16 = pVar3.f9761f - pVar4.f9761f;
        fArr[0] = (((pVar3.f9762n - pVar4.f9762n) + f15) * f11) + ((1.0f - f11) * f15);
        fArr[1] = (((pVar3.f9763o - pVar4.f9763o) + f16) * f12) + ((1.0f - f12) * f16);
    }

    public final boolean e(float f10, long j10, View view, lc.b bVar) {
        boolean z10;
        d.C0095d dVar;
        boolean z11;
        float f11;
        boolean z12;
        double d10;
        float f12;
        d.C0095d dVar2;
        float f13;
        float f14;
        boolean z13;
        boolean z14;
        View view2 = view;
        float b10 = b(f10, (float[]) null);
        int i10 = this.E;
        float f15 = 1.0f;
        if (i10 != -1) {
            float f16 = 1.0f / ((float) i10);
            float floor = ((float) Math.floor((double) (b10 / f16))) * f16;
            float f17 = (b10 % f16) / f16;
            if (!Float.isNaN(this.F)) {
                f17 = (f17 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                f15 = interpolator.getInterpolation(f17);
            } else if (((double) f17) <= 0.5d) {
                f15 = 0.0f;
            }
            b10 = (f15 * f16) + floor;
        }
        float f18 = b10;
        HashMap<String, c> hashMap = this.f9753y;
        if (hashMap != null) {
            for (c d11 : hashMap.values()) {
                d11.d(view2, f18);
            }
        }
        HashMap<String, d> hashMap2 = this.f9752x;
        if (hashMap2 != null) {
            dVar = null;
            z10 = false;
            for (d next : hashMap2.values()) {
                if (next instanceof d.C0095d) {
                    dVar = (d.C0095d) next;
                } else {
                    z10 |= next.e(f18, j10, view, bVar);
                }
            }
        } else {
            dVar = null;
            z10 = false;
        }
        b[] bVarArr = this.f9738j;
        if (bVarArr != null) {
            double d12 = (double) f18;
            bVarArr[0].c(d12, this.f9744p);
            this.f9738j[0].f(d12, this.f9745q);
            a aVar = this.f9739k;
            if (aVar != null) {
                double[] dArr = this.f9744p;
                if (dArr.length > 0) {
                    aVar.c(d12, dArr);
                    this.f9739k.f(d12, this.f9745q);
                }
            }
            if (!this.H) {
                p pVar = this.f9734f;
                int[] iArr = this.f9743o;
                double[] dArr2 = this.f9744p;
                double[] dArr3 = this.f9745q;
                boolean z15 = this.f9732d;
                float f19 = pVar.f9760e;
                float f20 = pVar.f9761f;
                float f21 = pVar.f9762n;
                float f22 = pVar.f9763o;
                float f23 = f19;
                if (iArr.length != 0) {
                    f14 = f20;
                    if (pVar.f9771w.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        pVar.f9771w = new double[i11];
                        pVar.f9772x = new double[i11];
                    }
                } else {
                    f14 = f20;
                }
                float f24 = f21;
                Arrays.fill(pVar.f9771w, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    double[] dArr4 = pVar.f9771w;
                    int i13 = iArr[i12];
                    dArr4[i13] = dArr2[i12];
                    pVar.f9772x[i13] = dArr3[i12];
                }
                float f25 = Float.NaN;
                float f26 = 0.0f;
                int i14 = 0;
                dVar2 = dVar;
                float f27 = f23;
                z12 = z10;
                float f28 = 0.0f;
                float f29 = f22;
                float f30 = 0.0f;
                float f31 = f14;
                float f32 = 0.0f;
                float f33 = f31;
                while (true) {
                    double[] dArr5 = pVar.f9771w;
                    f12 = f18;
                    if (i14 >= dArr5.length) {
                        break;
                    }
                    if (!Double.isNaN(dArr5[i14])) {
                        double d13 = 0.0d;
                        if (!Double.isNaN(pVar.f9771w[i14])) {
                            d13 = pVar.f9771w[i14] + 0.0d;
                        }
                        float f34 = (float) d13;
                        float f35 = (float) pVar.f9772x[i14];
                        if (i14 == 1) {
                            f26 = f35;
                            f27 = f34;
                        } else if (i14 == 2) {
                            f28 = f35;
                            f33 = f34;
                        } else if (i14 == 3) {
                            f30 = f35;
                            f24 = f34;
                        } else if (i14 == 4) {
                            f32 = f35;
                            f29 = f34;
                        } else if (i14 == 5) {
                            f25 = f34;
                        }
                    }
                    i14++;
                    View view3 = view;
                    f18 = f12;
                }
                n nVar = pVar.f9768t;
                if (nVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar.c(d12, fArr, fArr2);
                    float f36 = fArr[0];
                    float f37 = fArr[1];
                    float f38 = fArr2[0];
                    float f39 = fArr2[1];
                    d10 = d12;
                    double d14 = (double) f36;
                    double d15 = (double) f27;
                    double d16 = (double) f33;
                    double[] dArr6 = dArr3;
                    z13 = z15;
                    double d17 = (double) f38;
                    float cos = (float) ((((double) f37) - (Math.cos(d16) * d15)) - ((double) (f29 / 2.0f)));
                    double d18 = (double) f26;
                    double sin = (Math.sin(d16) * d18) + d17;
                    float sin2 = (float) (((Math.sin(d16) * d15) + d14) - ((double) (f24 / 2.0f)));
                    double d19 = (double) f28;
                    float cos2 = (float) ((Math.cos(d16) * d15 * d19) + sin);
                    float sin3 = (float) ((Math.sin(d16) * d15 * d19) + (((double) f39) - (Math.cos(d16) * d18)));
                    double[] dArr7 = dArr6;
                    if (dArr7.length >= 2) {
                        dArr7[0] = (double) cos2;
                        dArr7[1] = (double) sin3;
                    }
                    if (!Float.isNaN(f25)) {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) sin3, (double) cos2)) + ((double) f25)));
                    } else {
                        view2 = view;
                    }
                    f33 = cos;
                    f27 = sin2;
                } else {
                    view2 = view;
                    z13 = z15;
                    d10 = d12;
                    if (!Float.isNaN(f25)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) ((f32 / 2.0f) + f28), (double) ((f30 / 2.0f) + f26))) + ((double) f25) + ((double) 0.0f)));
                    }
                }
                if (view2 instanceof c) {
                    ((c) view2).a(f27, f33, f24 + f27, f33 + f29);
                } else {
                    float f40 = f27 + 0.5f;
                    int i15 = (int) f40;
                    float f41 = f33 + 0.5f;
                    int i16 = (int) f41;
                    int i17 = (int) (f40 + f24);
                    int i18 = (int) (f41 + f29);
                    int i19 = i17 - i15;
                    int i20 = i18 - i16;
                    if (i19 == view.getMeasuredWidth() && i20 == view.getMeasuredHeight()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14 || z13) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    view2.layout(i15, i16, i17, i18);
                }
                this.f9732d = false;
            } else {
                f12 = f18;
                dVar2 = dVar;
                z12 = z10;
                d10 = d12;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                View view4 = this.D;
                if (view4 != null) {
                    float bottom = ((float) (this.D.getBottom() + view4.getTop())) / 2.0f;
                    float right = ((float) (this.D.getRight() + this.D.getLeft())) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view2.setPivotX(right - ((float) view.getLeft()));
                        view2.setPivotY(bottom - ((float) view.getTop()));
                    }
                }
            }
            HashMap<String, c> hashMap3 = this.f9753y;
            if (hashMap3 != null) {
                for (j next2 : hashMap3.values()) {
                    if (next2 instanceof c.d) {
                        double[] dArr8 = this.f9745q;
                        if (dArr8.length > 1) {
                            f13 = f12;
                            view2.setRotation(((c.d) next2).a(f13) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                            f12 = f13;
                        }
                    }
                    f13 = f12;
                    f12 = f13;
                }
            }
            f11 = f12;
            if (dVar2 != null) {
                double[] dArr9 = this.f9745q;
                view2.setRotation(dVar2.d(f11, j10, view, bVar) + ((float) Math.toDegrees(Math.atan2(dArr9[1], dArr9[0]))));
                z11 = z12 | dVar2.f3974h;
            } else {
                z11 = z12;
            }
            int i21 = 1;
            while (true) {
                b[] bVarArr2 = this.f9738j;
                if (i21 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i21].d(d10, this.f9748t);
                l0.H0(this.f9734f.f9769u.get(this.f9746r[i21 - 1]), view2, this.f9748t);
                i21++;
            }
            l lVar = this.f9736h;
            if (lVar.f9712b == 0) {
                if (f11 <= 0.0f) {
                    view2.setVisibility(lVar.f9713c);
                } else if (f11 >= 1.0f) {
                    view2.setVisibility(this.f9737i.f9713c);
                } else if (this.f9737i.f9713c != lVar.f9713c) {
                    view2.setVisibility(0);
                }
            }
            if (this.A != null) {
                int i22 = 0;
                while (true) {
                    k[] kVarArr = this.A;
                    if (i22 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i22].h(view2, f11);
                    i22++;
                }
            }
        } else {
            f11 = f18;
            boolean z16 = z10;
            p pVar2 = this.f9734f;
            float f42 = pVar2.f9760e;
            p pVar3 = this.f9735g;
            float e10 = android.support.v4.media.a.e(pVar3.f9760e, f42, f11, f42);
            float f43 = pVar2.f9761f;
            float e11 = android.support.v4.media.a.e(pVar3.f9761f, f43, f11, f43);
            float f44 = pVar2.f9762n;
            float f45 = pVar3.f9762n;
            float e12 = android.support.v4.media.a.e(f45, f44, f11, f44);
            float f46 = pVar2.f9763o;
            float f47 = pVar3.f9763o;
            float f48 = e10 + 0.5f;
            int i23 = (int) f48;
            float f49 = e11 + 0.5f;
            int i24 = (int) f49;
            int i25 = (int) (f48 + e12);
            int e13 = (int) (f49 + android.support.v4.media.a.e(f47, f46, f11, f46));
            int i26 = i25 - i23;
            int i27 = e13 - i24;
            if (!(f45 == f44 && f47 == f46 && !this.f9732d)) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
                this.f9732d = false;
            }
            view2.layout(i23, i24, i25, e13);
            z11 = z16;
        }
        HashMap<String, e1.b> hashMap4 = this.f9754z;
        if (hashMap4 != null) {
            for (e1.b next3 : hashMap4.values()) {
                if (next3 instanceof b.d) {
                    double[] dArr10 = this.f9745q;
                    view2.setRotation(((b.d) next3).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr10[1], dArr10[0]))));
                } else {
                    next3.e(view2, f11);
                }
            }
        }
        return z11;
    }

    public final void f(p pVar) {
        pVar.j((float) ((int) this.f9730b.getX()), (float) ((int) this.f9730b.getY()), (float) this.f9730b.getWidth(), (float) this.f9730b.getHeight());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0267, code lost:
        r12 = r18;
        r5 = r19;
        r2 = r29;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026f, code lost:
        r19 = r13;
        r18 = r17;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0275, code lost:
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0277, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028e, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b1, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d6, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02db, code lost:
        r23 = r2;
        r12 = r18;
        r5 = r19;
        r2 = r29;
        r19 = r13;
        r18 = r17;
        r13 = r21;
        r21 = r14;
        r14 = r16;
        r16 = r3;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0336, code lost:
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0338, code lost:
        r14 = r16;
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a3, code lost:
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c4, code lost:
        r14 = r16;
        r16 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c8, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x040a, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x040c, code lost:
        switch(r16) {
            case 0: goto L_0x046d;
            case 1: goto L_0x0467;
            case 2: goto L_0x0461;
            case 3: goto L_0x045b;
            case 4: goto L_0x0455;
            case 5: goto L_0x044f;
            case 6: goto L_0x0449;
            case 7: goto L_0x0443;
            case 8: goto L_0x043d;
            case 9: goto L_0x0437;
            case 10: goto L_0x0431;
            case 11: goto L_0x042b;
            case 12: goto L_0x0425;
            case 13: goto L_0x041f;
            case 14: goto L_0x0419;
            case 15: goto L_0x0413;
            default: goto L_0x040f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x040f, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0413, code lost:
        r16 = new e1.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0419, code lost:
        r16 = new e1.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x041f, code lost:
        r16 = new e1.c.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0425, code lost:
        r16 = new e1.c.C0094c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x042b, code lost:
        r16 = new e1.c.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0431, code lost:
        r16 = new e1.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0437, code lost:
        r16 = new e1.c.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x043d, code lost:
        r16 = new e1.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0443, code lost:
        r16 = new e1.c.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0449, code lost:
        r16 = new e1.c.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x044f, code lost:
        r16 = new e1.c.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0455, code lost:
        r16 = new e1.c.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x045b, code lost:
        r16 = new e1.c.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0461, code lost:
        r16 = new e1.c.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0467, code lost:
        r16 = new e1.c.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x046d, code lost:
        r16 = new e1.c.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0472, code lost:
        r17 = r14;
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0514, code lost:
        r14 = (java.lang.Integer) r4.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05dd, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05df, code lost:
        r15 = r17;
        r14 = r18;
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x062b, code lost:
        r15 = r17;
        r14 = r18;
        r6 = r20;
        r41 = r16;
        r16 = r1;
        r1 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0663, code lost:
        r16 = r6;
        r15 = r17;
        r14 = r18;
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06aa, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06ac, code lost:
        switch(r16) {
            case 0: goto L_0x06fb;
            case 1: goto L_0x06f5;
            case 2: goto L_0x06ef;
            case 3: goto L_0x06e9;
            case 4: goto L_0x06e3;
            case 5: goto L_0x06dd;
            case 6: goto L_0x06d7;
            case 7: goto L_0x06d1;
            case 8: goto L_0x06cb;
            case 9: goto L_0x06c5;
            case 10: goto L_0x06bf;
            case 11: goto L_0x06b9;
            default: goto L_0x06af;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06af, code lost:
        r17 = r4;
        r18 = r14;
        r16 = r15;
        r14 = r45;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06b9, code lost:
        r16 = new e1.d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06bf, code lost:
        r16 = new e1.d.C0095d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06c5, code lost:
        r16 = new e1.d.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06cb, code lost:
        r16 = new e1.d.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06d1, code lost:
        r16 = new e1.d.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06d7, code lost:
        r16 = new e1.d.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06dd, code lost:
        r16 = new e1.d.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06e3, code lost:
        r16 = new e1.d.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06e9, code lost:
        r16 = new e1.d.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06ef, code lost:
        r16 = new e1.d.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06f5, code lost:
        r16 = new e1.d.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06fb, code lost:
        r16 = new e1.d.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0700, code lost:
        r17 = r4;
        r18 = r14;
        r4 = r16;
        r16 = r15;
        r4.f3975i = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07ea, code lost:
        r7 = r16;
        r6 = r18;
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x082b, code lost:
        r4 = r0;
        r7 = r16;
        r6 = r18;
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0882, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0883, code lost:
        switch(r4) {
            case 0: goto L_0x0a3f;
            case 1: goto L_0x0a19;
            case 2: goto L_0x09f3;
            case 3: goto L_0x09cc;
            case 4: goto L_0x09a5;
            case 5: goto L_0x097e;
            case 6: goto L_0x0957;
            case 7: goto L_0x0930;
            case 8: goto L_0x0909;
            case 9: goto L_0x08e2;
            case 10: goto L_0x08bb;
            case 11: goto L_0x088e;
            default: goto L_0x0886;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0886, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x088e, code lost:
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0896, code lost:
        if (java.lang.Float.isNaN(r4.f9674f) != false) goto L_0x08b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0898, code lost:
        r16 = r7;
        r18 = r6;
        r32.b(r4.f9674f, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08b5, code lost:
        r18 = r6;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08bb, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08c7, code lost:
        if (java.lang.Float.isNaN(r4.f9679k) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08c9, code lost:
        r32.b(r4.f9679k, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08e2, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08ee, code lost:
        if (java.lang.Float.isNaN(r4.f9675g) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08f0, code lost:
        r32.b(r4.f9675g, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0909, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0915, code lost:
        if (java.lang.Float.isNaN(r4.f9676h) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0917, code lost:
        r32.b(r4.f9676h, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0930, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x093c, code lost:
        if (java.lang.Float.isNaN(r4.f9681m) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x093e, code lost:
        r32.b(r4.f9681m, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0957, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0963, code lost:
        if (java.lang.Float.isNaN(r4.f9680l) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0965, code lost:
        r32.b(r4.f9680l, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x097e, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x098a, code lost:
        if (java.lang.Float.isNaN(r4.f9685q) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x098c, code lost:
        r32.b(r4.f9685q, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09a5, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x09b1, code lost:
        if (java.lang.Float.isNaN(r4.f9684p) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x09b3, code lost:
        r32.b(r4.f9684p, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09cc, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09d8, code lost:
        if (java.lang.Float.isNaN(r4.f9683o) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x09da, code lost:
        r32.b(r4.f9683o, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09f3, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09ff, code lost:
        if (java.lang.Float.isNaN(r4.f9682n) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0a01, code lost:
        r32.b(r4.f9682n, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0a19, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0a25, code lost:
        if (java.lang.Float.isNaN(r4.f9678j) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a27, code lost:
        r32.b(r4.f9678j, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a3f, code lost:
        r18 = r6;
        r16 = r7;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a4b, code lost:
        if (java.lang.Float.isNaN(r4.f9677i) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a4d, code lost:
        r32.b(r4.f9677i, r4.f9687s, r4.f9688t, r4.f9619a, r4.f9686r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0e75, code lost:
        r13 = r23;
        r15 = r29;
        r11 = r30;
        r10 = r31;
        r9 = r32;
        r7 = r33;
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0ec4, code lost:
        r45 = r0;
        r0 = r16;
        r14 = r17;
        r12 = r19;
        r13 = r23;
        r15 = r29;
        r11 = r30;
        r10 = r31;
        r9 = r32;
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0edc, code lost:
        r45 = r0;
        r0 = r16;
        r14 = r17;
        r12 = r19;
        r13 = r23;
        r15 = r29;
        r11 = r30;
        r10 = r31;
        r9 = r32;
        r16 = r7;
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0f46, code lost:
        r45 = r0;
        r0 = r16;
        r14 = r17;
        r12 = r19;
        r13 = r23;
        r15 = r29;
        r11 = r30;
        r10 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0f5a, code lost:
        r45 = r0;
        r0 = r16;
        r14 = r17;
        r12 = r19;
        r13 = r23;
        r15 = r29;
        r11 = r30;
        r16 = r10;
        r10 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0fa6, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0fce, code lost:
        r45 = r0;
        r0 = r16;
        r14 = r17;
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x101c, code lost:
        r15 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x1021, code lost:
        r45 = r0;
        r0 = r16;
        r16 = r15;
        r15 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x106d, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x1074, code lost:
        r0 = r16;
        r16 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x109d, code lost:
        switch(r16) {
            case 0: goto L_0x10f5;
            case 1: goto L_0x10ef;
            case 2: goto L_0x10e9;
            case 3: goto L_0x10e3;
            case 4: goto L_0x10dd;
            case 5: goto L_0x10d7;
            case 6: goto L_0x10d1;
            case 7: goto L_0x10cb;
            case 8: goto L_0x10c5;
            case 9: goto L_0x10bf;
            case 10: goto L_0x10b9;
            case 11: goto L_0x10b3;
            case 12: goto L_0x10ad;
            case 13: goto L_0x10a7;
            default: goto L_0x10a0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x10a0, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x10a2, code lost:
        r17 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x10a7, code lost:
        r16 = new e1.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x10ad, code lost:
        r16 = new e1.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x10b3, code lost:
        r16 = new e1.b.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x10b9, code lost:
        r16 = new e1.b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x10bf, code lost:
        r16 = new e1.b.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x10c5, code lost:
        r16 = new e1.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x10cb, code lost:
        r16 = new e1.b.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x10d1, code lost:
        r16 = new e1.b.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x10d7, code lost:
        r16 = new e1.b.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x10dd, code lost:
        r16 = new e1.b.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x10e3, code lost:
        r16 = new e1.b.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x10e9, code lost:
        r16 = new e1.b.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x10ef, code lost:
        r16 = new e1.b.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x10f5, code lost:
        r16 = new e1.b.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x132d, code lost:
        r6 = r46;
        r4 = r16;
        r15 = r17;
        r14 = r18;
        r10 = r19;
        r13 = r20;
        r12 = r21;
        r11 = r23;
        r2 = r35;
        r0 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x1362, code lost:
        r4 = r0;
        r2 = r35;
        r0 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x13ab, code lost:
        r6 = r46;
        r15 = r17;
        r14 = r18;
        r10 = r19;
        r13 = r20;
        r12 = r21;
        r11 = r23;
        r41 = r16;
        r16 = r4;
        r4 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x13cd, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x13f1, code lost:
        r15 = r17;
        r14 = r18;
        r10 = r19;
        r13 = r20;
        r12 = r21;
        r11 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x1443, code lost:
        r15 = r17;
        r14 = r18;
        r13 = r20;
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x14e5, code lost:
        switch(r16) {
            case 0: goto L_0x1533;
            case 1: goto L_0x152e;
            case 2: goto L_0x1529;
            case 3: goto L_0x1524;
            case 4: goto L_0x151f;
            case 5: goto L_0x151a;
            case 6: goto L_0x1515;
            case 7: goto L_0x1510;
            case 8: goto L_0x150b;
            case 9: goto L_0x1506;
            case 10: goto L_0x1501;
            case 11: goto L_0x14fc;
            case 12: goto L_0x14f7;
            case 13: goto L_0x14f2;
            default: goto L_0x14e8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x14e8, code lost:
        r40 = r0;
        r7.startsWith(r3);
        r0 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x14ef, code lost:
        r21 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x14f2, code lost:
        r40 = r0;
        r0 = r1.f9644j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x14f7, code lost:
        r40 = r0;
        r0 = r1.f9643i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x14fc, code lost:
        r40 = r0;
        r0 = r1.f9647m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x1501, code lost:
        r40 = r0;
        r0 = r1.f9650p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x1506, code lost:
        r40 = r0;
        r0 = r1.f9648n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x150b, code lost:
        r40 = r0;
        r0 = r1.f9649o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x1510, code lost:
        r40 = r0;
        r0 = r1.f9654t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x1515, code lost:
        r40 = r0;
        r0 = r1.f9653s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x151a, code lost:
        r40 = r0;
        r0 = r1.f9645k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x151f, code lost:
        r40 = r0;
        r0 = r1.f9657w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x1524, code lost:
        r40 = r0;
        r0 = r1.f9656v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x1529, code lost:
        r40 = r0;
        r0 = r1.f9655u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x152e, code lost:
        r40 = r0;
        r0 = r1.f9652r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x1533, code lost:
        r40 = r0;
        r0 = r1.f9651q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x153c, code lost:
        if (java.lang.Float.isNaN(r21) == false) goto L_0x1541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x153e, code lost:
        r0 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x1541, code lost:
        r0 = r36;
        r7 = r0.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x1549, code lost:
        if (r7 != null) goto L_0x1565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x1565, code lost:
        r36 = r0;
        r0 = r1.f9619a;
        r33 = r2;
        r2 = r1.f9640f;
        r23 = r3;
        r3 = r1.f9641g;
        r30 = r4;
        r4 = r1.f9646l;
        r28 = r5;
        r46 = r6;
        r29 = r8;
        r31 = r1;
        r32 = r9;
        r7.f3910f.add(new b1.e.b(r0, r1.f9642h, r1.f9643i, r1.f9644j, r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x159a, code lost:
        if (r4 == -1) goto L_0x159e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:0x159c, code lost:
        r7.f3909e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x159e, code lost:
        r7.f3907c = r2;
        r7.f3908d = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r43, int r44, long r45) {
        /*
            r42 = this;
            r0 = r42
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.B
            r6 = -1
            if (r5 == r6) goto L_0x0024
            f1.p r6 = r0.f9734f
            r6.f9765q = r5
        L_0x0024:
            f1.l r5 = r0.f9736h
            f1.l r6 = r0.f9737i
            float r7 = r5.f9711a
            float r8 = r6.f9711a
            boolean r7 = f1.l.i(r7, r8)
            java.lang.String r8 = "alpha"
            if (r7 == 0) goto L_0x0037
            r2.add(r8)
        L_0x0037:
            float r7 = r5.f9714d
            float r9 = r6.f9714d
            boolean r7 = f1.l.i(r7, r9)
            java.lang.String r9 = "elevation"
            if (r7 == 0) goto L_0x0046
            r2.add(r9)
        L_0x0046:
            int r7 = r5.f9713c
            int r10 = r6.f9713c
            if (r7 == r10) goto L_0x0057
            int r11 = r5.f9712b
            if (r11 != 0) goto L_0x0057
            if (r7 == 0) goto L_0x0054
            if (r10 != 0) goto L_0x0057
        L_0x0054:
            r2.add(r8)
        L_0x0057:
            float r7 = r5.f9715e
            float r10 = r6.f9715e
            boolean r7 = f1.l.i(r7, r10)
            java.lang.String r10 = "rotation"
            if (r7 == 0) goto L_0x0066
            r2.add(r10)
        L_0x0066:
            float r7 = r5.f9725v
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r11 = "transitionPathRotate"
            if (r7 == 0) goto L_0x0078
            float r7 = r6.f9725v
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x007b
        L_0x0078:
            r2.add(r11)
        L_0x007b:
            float r7 = r5.f9726w
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r12 = "progress"
            if (r7 == 0) goto L_0x008d
            float r7 = r6.f9726w
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x0090
        L_0x008d:
            r2.add(r12)
        L_0x0090:
            float r7 = r5.f9716f
            float r13 = r6.f9716f
            boolean r7 = f1.l.i(r7, r13)
            java.lang.String r13 = "rotationX"
            if (r7 == 0) goto L_0x009f
            r2.add(r13)
        L_0x009f:
            float r7 = r5.f9717n
            float r14 = r6.f9717n
            boolean r7 = f1.l.i(r7, r14)
            java.lang.String r14 = "rotationY"
            if (r7 == 0) goto L_0x00ae
            r2.add(r14)
        L_0x00ae:
            float r7 = r5.f9720q
            float r15 = r6.f9720q
            boolean r7 = f1.l.i(r7, r15)
            java.lang.String r15 = "transformPivotX"
            if (r7 == 0) goto L_0x00bd
            r2.add(r15)
        L_0x00bd:
            float r7 = r5.f9721r
            r16 = r13
            float r13 = r6.f9721r
            boolean r7 = f1.l.i(r7, r13)
            java.lang.String r13 = "transformPivotY"
            if (r7 == 0) goto L_0x00ce
            r2.add(r13)
        L_0x00ce:
            float r7 = r5.f9718o
            r17 = r14
            float r14 = r6.f9718o
            boolean r7 = f1.l.i(r7, r14)
            java.lang.String r14 = "scaleX"
            if (r7 == 0) goto L_0x00df
            r2.add(r14)
        L_0x00df:
            float r7 = r5.f9719p
            r18 = r12
            float r12 = r6.f9719p
            boolean r7 = f1.l.i(r7, r12)
            java.lang.String r12 = "scaleY"
            if (r7 == 0) goto L_0x00f0
            r2.add(r12)
        L_0x00f0:
            float r7 = r5.f9722s
            r19 = r14
            float r14 = r6.f9722s
            boolean r7 = f1.l.i(r7, r14)
            java.lang.String r14 = "translationX"
            if (r7 == 0) goto L_0x0101
            r2.add(r14)
        L_0x0101:
            float r7 = r5.f9723t
            r20 = r14
            float r14 = r6.f9723t
            boolean r7 = f1.l.i(r7, r14)
            java.lang.String r14 = "translationY"
            if (r7 == 0) goto L_0x0112
            r2.add(r14)
        L_0x0112:
            float r5 = r5.f9724u
            float r6 = r6.f9724u
            boolean r5 = f1.l.i(r5, r6)
            java.lang.String r6 = "translationZ"
            if (r5 == 0) goto L_0x0121
            r2.add(r6)
        L_0x0121:
            java.util.ArrayList<f1.d> r5 = r0.f9751w
            if (r5 == 0) goto L_0x01b3
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x012a:
            boolean r21 = r5.hasNext()
            if (r21 == 0) goto L_0x01aa
            java.lang.Object r21 = r5.next()
            r22 = r5
            r5 = r21
            f1.d r5 = (f1.d) r5
            r21 = r14
            boolean r14 = r5 instanceof f1.h
            if (r14 == 0) goto L_0x0172
            f1.h r5 = (f1.h) r5
            f1.p r14 = new f1.p
            r29 = r6
            f1.p r6 = r0.f9734f
            r30 = r12
            f1.p r12 = r0.f9735g
            r23 = r14
            r24 = r43
            r25 = r44
            r26 = r5
            r27 = r6
            r28 = r12
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.ArrayList<f1.p> r6 = r0.f9749u
            int r6 = java.util.Collections.binarySearch(r6, r14)
            java.util.ArrayList<f1.p> r12 = r0.f9749u
            int r6 = -r6
            r23 = r15
            r15 = -1
            int r6 = r6 + r15
            r12.add(r6, r14)
            int r5 = r5.f9672e
            if (r5 == r15) goto L_0x019f
            r0.f9733e = r5
            goto L_0x019f
        L_0x0172:
            r29 = r6
            r30 = r12
            r23 = r15
            boolean r6 = r5 instanceof f1.f
            if (r6 == 0) goto L_0x0180
            r5.d(r3)
            goto L_0x019f
        L_0x0180:
            boolean r6 = r5 instanceof f1.j
            if (r6 == 0) goto L_0x0188
            r5.d(r1)
            goto L_0x019f
        L_0x0188:
            boolean r6 = r5 instanceof f1.k
            if (r6 == 0) goto L_0x0199
            if (r7 != 0) goto L_0x0193
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0193:
            f1.k r5 = (f1.k) r5
            r7.add(r5)
            goto L_0x019f
        L_0x0199:
            r5.f(r4)
            r5.d(r2)
        L_0x019f:
            r14 = r21
            r5 = r22
            r15 = r23
            r6 = r29
            r12 = r30
            goto L_0x012a
        L_0x01aa:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            goto L_0x01bc
        L_0x01b3:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            r7 = 0
        L_0x01bc:
            r5 = 0
            if (r7 == 0) goto L_0x01c9
            f1.k[] r5 = new f1.k[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            f1.k[] r5 = (f1.k[]) r5
            r0.A = r5
        L_0x01c9:
            boolean r5 = r2.isEmpty()
            java.lang.String r6 = ","
            java.lang.String r14 = "waveOffset"
            java.lang.String r15 = "CUSTOM,"
            r22 = 11
            r24 = 10
            r25 = 9
            r26 = 8
            r27 = 5
            if (r5 != 0) goto L_0x0534
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f9753y = r5
            java.util.Iterator r5 = r2.iterator()
        L_0x01ea:
            boolean r28 = r5.hasNext()
            if (r28 == 0) goto L_0x04b5
            java.lang.Object r28 = r5.next()
            r7 = r28
            java.lang.String r7 = (java.lang.String) r7
            boolean r28 = r7.startsWith(r15)
            if (r28 == 0) goto L_0x025a
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r28 = r7.split(r6)
            r31 = 1
            r32 = r5
            r5 = r28[r31]
            r28 = r3
            java.util.ArrayList<f1.d> r3 = r0.f9751w
            java.util.Iterator r3 = r3.iterator()
        L_0x0215:
            boolean r31 = r3.hasNext()
            if (r31 == 0) goto L_0x023e
            java.lang.Object r31 = r3.next()
            r33 = r3
            r3 = r31
            f1.d r3 = (f1.d) r3
            r31 = r2
            java.util.HashMap<java.lang.String, g1.a> r2 = r3.f9622d
            if (r2 != 0) goto L_0x022c
            goto L_0x0239
        L_0x022c:
            java.lang.Object r2 = r2.get(r5)
            g1.a r2 = (g1.a) r2
            if (r2 == 0) goto L_0x0239
            int r3 = r3.f9619a
            r12.append(r3, r2)
        L_0x0239:
            r2 = r31
            r3 = r33
            goto L_0x0215
        L_0x023e:
            r31 = r2
            e1.c$b r2 = new e1.c$b
            r2.<init>(r7, r12)
            r12 = r18
            r5 = r19
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r14
            r17 = r16
            r14 = r2
            r2 = r29
            goto L_0x0476
        L_0x025a:
            r31 = r2
            r28 = r3
            r32 = r5
            int r2 = r7.hashCode()
            switch(r2) {
                case -1249320806: goto L_0x03ee;
                case -1249320805: goto L_0x03cb;
                case -1225497657: goto L_0x03a6;
                case -1225497656: goto L_0x038e;
                case -1225497655: goto L_0x0377;
                case -1001078227: goto L_0x0351;
                case -908189618: goto L_0x0320;
                case -908189617: goto L_0x02f3;
                case -797520672: goto L_0x02cc;
                case -760884510: goto L_0x02c0;
                case -760884509: goto L_0x02b4;
                case -40300674: goto L_0x02a8;
                case -4379043: goto L_0x029c;
                case 37232917: goto L_0x0290;
                case 92909918: goto L_0x0285;
                case 156108012: goto L_0x027b;
                default: goto L_0x0267;
            }
        L_0x0267:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
        L_0x026f:
            r19 = r13
            r18 = r17
            r13 = r21
        L_0x0275:
            r21 = r14
        L_0x0277:
            r14 = r16
            goto L_0x040a
        L_0x027b:
            boolean r2 = r7.equals(r14)
            if (r2 != 0) goto L_0x0282
            goto L_0x0267
        L_0x0282:
            r2 = 15
            goto L_0x028e
        L_0x0285:
            boolean r2 = r7.equals(r8)
            if (r2 != 0) goto L_0x028c
            goto L_0x0267
        L_0x028c:
            r2 = 14
        L_0x028e:
            r3 = r2
            goto L_0x02b1
        L_0x0290:
            boolean r2 = r7.equals(r11)
            if (r2 != 0) goto L_0x0297
            goto L_0x0267
        L_0x0297:
            r2 = r23
            r3 = 13
            goto L_0x02db
        L_0x029c:
            boolean r2 = r7.equals(r9)
            if (r2 != 0) goto L_0x02a3
            goto L_0x0267
        L_0x02a3:
            r2 = r23
            r3 = 12
            goto L_0x02db
        L_0x02a8:
            boolean r2 = r7.equals(r10)
            if (r2 != 0) goto L_0x02af
            goto L_0x0267
        L_0x02af:
            r3 = r22
        L_0x02b1:
            r2 = r23
            goto L_0x02db
        L_0x02b4:
            boolean r2 = r7.equals(r13)
            if (r2 != 0) goto L_0x02bb
            goto L_0x0267
        L_0x02bb:
            r2 = r23
            r3 = r24
            goto L_0x02db
        L_0x02c0:
            r2 = r23
            boolean r3 = r7.equals(r2)
            if (r3 != 0) goto L_0x02c9
            goto L_0x02d6
        L_0x02c9:
            r3 = r25
            goto L_0x02db
        L_0x02cc:
            r2 = r23
            java.lang.String r3 = "waveVariesBy"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x02d9
        L_0x02d6:
            r23 = r2
            goto L_0x0267
        L_0x02d9:
            r3 = r26
        L_0x02db:
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r14
            r14 = r16
            r16 = r3
            r3 = r30
            goto L_0x040c
        L_0x02f3:
            r2 = r23
            r3 = r30
            boolean r5 = r7.equals(r3)
            if (r5 != 0) goto L_0x0307
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            goto L_0x026f
        L_0x0307:
            r5 = 7
            r23 = r2
            r12 = r18
            r2 = r29
            r18 = r17
            r41 = r16
            r16 = r5
            r5 = r19
            r19 = r13
            r13 = r21
            r21 = r14
            r14 = r41
            goto L_0x040c
        L_0x0320:
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r12 = r7.equals(r5)
            if (r12 != 0) goto L_0x033e
            r23 = r2
            r19 = r13
            r12 = r18
            r13 = r21
            r2 = r29
        L_0x0336:
            r21 = r14
        L_0x0338:
            r14 = r16
            r18 = r17
            goto L_0x040a
        L_0x033e:
            r12 = 6
            r23 = r2
            r19 = r13
            r13 = r21
            r2 = r29
            r21 = r14
            r14 = r16
            r16 = r12
            r12 = r18
            goto L_0x03c8
        L_0x0351:
            r12 = r18
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r18 = r7.equals(r12)
            r19 = r13
            if (r18 != 0) goto L_0x0369
            r18 = r17
            r13 = r21
            r2 = r29
            goto L_0x0275
        L_0x0369:
            r18 = r17
            r13 = r21
            r2 = r29
            r21 = r14
            r14 = r16
            r16 = r27
            goto L_0x040c
        L_0x0377:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            boolean r18 = r7.equals(r2)
            if (r18 != 0) goto L_0x0387
            goto L_0x026f
        L_0x0387:
            r18 = 4
            r19 = r13
            r13 = r21
            goto L_0x03a3
        L_0x038e:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            boolean r18 = r7.equals(r13)
            if (r18 != 0) goto L_0x03a1
            goto L_0x0336
        L_0x03a1:
            r18 = 3
        L_0x03a3:
            r21 = r14
            goto L_0x03c4
        L_0x03a6:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r14
            r14 = r20
            boolean r18 = r7.equals(r14)
            if (r18 != 0) goto L_0x03c0
            r20 = r14
            goto L_0x0338
        L_0x03c0:
            r18 = 2
            r20 = r14
        L_0x03c4:
            r14 = r16
            r16 = r18
        L_0x03c8:
            r18 = r17
            goto L_0x040c
        L_0x03cb:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r14
            r14 = r17
            boolean r17 = r7.equals(r14)
            if (r17 != 0) goto L_0x03e5
            r18 = r14
            goto L_0x0277
        L_0x03e5:
            r17 = 1
            r18 = r14
            r14 = r16
            r16 = r17
            goto L_0x040c
        L_0x03ee:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r14
            r14 = r16
            boolean r16 = r7.equals(r14)
            if (r16 != 0) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            r16 = 0
            goto L_0x040c
        L_0x040a:
            r16 = -1
        L_0x040c:
            switch(r16) {
                case 0: goto L_0x046d;
                case 1: goto L_0x0467;
                case 2: goto L_0x0461;
                case 3: goto L_0x045b;
                case 4: goto L_0x0455;
                case 5: goto L_0x044f;
                case 6: goto L_0x0449;
                case 7: goto L_0x0443;
                case 8: goto L_0x043d;
                case 9: goto L_0x0437;
                case 10: goto L_0x0431;
                case 11: goto L_0x042b;
                case 12: goto L_0x0425;
                case 13: goto L_0x041f;
                case 14: goto L_0x0419;
                case 15: goto L_0x0413;
                default: goto L_0x040f;
            }
        L_0x040f:
            r16 = 0
            goto L_0x0472
        L_0x0413:
            e1.c$a r16 = new e1.c$a
            r16.<init>()
            goto L_0x0472
        L_0x0419:
            e1.c$a r16 = new e1.c$a
            r16.<init>()
            goto L_0x0472
        L_0x041f:
            e1.c$d r16 = new e1.c$d
            r16.<init>()
            goto L_0x0472
        L_0x0425:
            e1.c$c r16 = new e1.c$c
            r16.<init>()
            goto L_0x0472
        L_0x042b:
            e1.c$h r16 = new e1.c$h
            r16.<init>()
            goto L_0x0472
        L_0x0431:
            e1.c$f r16 = new e1.c$f
            r16.<init>()
            goto L_0x0472
        L_0x0437:
            e1.c$e r16 = new e1.c$e
            r16.<init>()
            goto L_0x0472
        L_0x043d:
            e1.c$a r16 = new e1.c$a
            r16.<init>()
            goto L_0x0472
        L_0x0443:
            e1.c$l r16 = new e1.c$l
            r16.<init>()
            goto L_0x0472
        L_0x0449:
            e1.c$k r16 = new e1.c$k
            r16.<init>()
            goto L_0x0472
        L_0x044f:
            e1.c$g r16 = new e1.c$g
            r16.<init>()
            goto L_0x0472
        L_0x0455:
            e1.c$o r16 = new e1.c$o
            r16.<init>()
            goto L_0x0472
        L_0x045b:
            e1.c$n r16 = new e1.c$n
            r16.<init>()
            goto L_0x0472
        L_0x0461:
            e1.c$m r16 = new e1.c$m
            r16.<init>()
            goto L_0x0472
        L_0x0467:
            e1.c$j r16 = new e1.c$j
            r16.<init>()
            goto L_0x0472
        L_0x046d:
            e1.c$i r16 = new e1.c$i
            r16.<init>()
        L_0x0472:
            r17 = r14
            r14 = r16
        L_0x0476:
            if (r14 != 0) goto L_0x0492
            r29 = r2
            r30 = r3
            r16 = r17
            r17 = r18
            r14 = r21
            r3 = r28
            r2 = r31
            r18 = r12
            r21 = r13
            r13 = r19
            r19 = r5
            r5 = r32
            goto L_0x01ea
        L_0x0492:
            r14.f3943e = r7
            r16 = r13
            java.util.HashMap<java.lang.String, e1.c> r13 = r0.f9753y
            r13.put(r7, r14)
            r29 = r2
            r30 = r3
            r13 = r19
            r14 = r21
            r3 = r28
            r2 = r31
            r19 = r5
            r21 = r16
            r16 = r17
            r17 = r18
            r5 = r32
            r18 = r12
            goto L_0x01ea
        L_0x04b5:
            r31 = r2
            r28 = r3
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r18 = r17
            r17 = r16
            r16 = r21
            r21 = r14
            java.util.ArrayList<f1.d> r7 = r0.f9751w
            if (r7 == 0) goto L_0x04e7
            java.util.Iterator r7 = r7.iterator()
        L_0x04d1:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x04e7
            java.lang.Object r13 = r7.next()
            f1.d r13 = (f1.d) r13
            boolean r14 = r13 instanceof f1.e
            if (r14 == 0) goto L_0x04d1
            java.util.HashMap<java.lang.String, e1.c> r14 = r0.f9753y
            r13.a(r14)
            goto L_0x04d1
        L_0x04e7:
            f1.l r7 = r0.f9736h
            java.util.HashMap<java.lang.String, e1.c> r13 = r0.f9753y
            r14 = 0
            r7.b(r13, r14)
            f1.l r7 = r0.f9737i
            java.util.HashMap<java.lang.String, e1.c> r13 = r0.f9753y
            r14 = 100
            r7.b(r13, r14)
            java.util.HashMap<java.lang.String, e1.c> r7 = r0.f9753y
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0502:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x0548
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r4.containsKey(r13)
            if (r14 == 0) goto L_0x0521
            java.lang.Object r14 = r4.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x0521
            int r14 = r14.intValue()
            goto L_0x0522
        L_0x0521:
            r14 = 0
        L_0x0522:
            r19 = r7
            java.util.HashMap<java.lang.String, e1.c> r7 = r0.f9753y
            java.lang.Object r7 = r7.get(r13)
            b1.j r7 = (b1.j) r7
            if (r7 == 0) goto L_0x0531
            r7.c(r14)
        L_0x0531:
            r7 = r19
            goto L_0x0502
        L_0x0534:
            r31 = r2
            r28 = r3
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r18 = r17
            r17 = r16
            r16 = r21
            r21 = r14
        L_0x0548:
            boolean r7 = r1.isEmpty()
            java.lang.String r13 = "CUSTOM"
            if (r7 != 0) goto L_0x0abd
            java.util.HashMap<java.lang.String, e1.d> r7 = r0.f9752x
            if (r7 != 0) goto L_0x055b
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.f9752x = r7
        L_0x055b:
            java.util.Iterator r1 = r1.iterator()
        L_0x055f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0726
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, e1.d> r14 = r0.f9752x
            boolean r14 = r14.containsKey(r7)
            if (r14 == 0) goto L_0x0574
            goto L_0x055f
        L_0x0574:
            boolean r14 = r7.startsWith(r15)
            if (r14 == 0) goto L_0x05d0
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.lang.String[] r19 = r7.split(r6)
            r23 = 1
            r29 = r1
            r1 = r19[r23]
            r19 = r6
            java.util.ArrayList<f1.d> r6 = r0.f9751w
            java.util.Iterator r6 = r6.iterator()
        L_0x0591:
            boolean r23 = r6.hasNext()
            if (r23 == 0) goto L_0x05ba
            java.lang.Object r23 = r6.next()
            r30 = r6
            r6 = r23
            f1.d r6 = (f1.d) r6
            r23 = r15
            java.util.HashMap<java.lang.String, g1.a> r15 = r6.f9622d
            if (r15 != 0) goto L_0x05a8
            goto L_0x05b5
        L_0x05a8:
            java.lang.Object r15 = r15.get(r1)
            g1.a r15 = (g1.a) r15
            if (r15 == 0) goto L_0x05b5
            int r6 = r6.f9619a
            r14.append(r6, r15)
        L_0x05b5:
            r15 = r23
            r6 = r30
            goto L_0x0591
        L_0x05ba:
            r23 = r15
            e1.d$b r1 = new e1.d$b
            r1.<init>(r7, r14)
            r14 = r45
            r6 = r20
            r41 = r4
            r4 = r1
            r1 = r16
            r16 = r17
            r17 = r41
            goto L_0x070c
        L_0x05d0:
            r29 = r1
            r19 = r6
            r23 = r15
            int r1 = r7.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x0698;
                case -1249320805: goto L_0x0683;
                case -1225497657: goto L_0x066c;
                case -1225497656: goto L_0x0658;
                case -1225497655: goto L_0x064c;
                case -1001078227: goto L_0x0639;
                case -908189618: goto L_0x0623;
                case -908189617: goto L_0x061a;
                case -40300674: goto L_0x060e;
                case -4379043: goto L_0x0601;
                case 37232917: goto L_0x05f4;
                case 92909918: goto L_0x05e7;
                default: goto L_0x05dd;
            }
        L_0x05dd:
            r1 = r16
        L_0x05df:
            r15 = r17
            r14 = r18
            r6 = r20
            goto L_0x06aa
        L_0x05e7:
            boolean r1 = r7.equals(r8)
            if (r1 != 0) goto L_0x05ee
            goto L_0x05dd
        L_0x05ee:
            r1 = r16
            r6 = r22
            goto L_0x0663
        L_0x05f4:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto L_0x05fb
            goto L_0x05dd
        L_0x05fb:
            r1 = r16
            r6 = r24
            goto L_0x0663
        L_0x0601:
            boolean r1 = r7.equals(r9)
            if (r1 != 0) goto L_0x0608
            goto L_0x05dd
        L_0x0608:
            r1 = r16
            r6 = r25
            goto L_0x0663
        L_0x060e:
            boolean r1 = r7.equals(r10)
            if (r1 != 0) goto L_0x0615
            goto L_0x05dd
        L_0x0615:
            r1 = r16
            r6 = r26
            goto L_0x0663
        L_0x061a:
            boolean r1 = r7.equals(r3)
            if (r1 != 0) goto L_0x0621
            goto L_0x05dd
        L_0x0621:
            r1 = 7
            goto L_0x062b
        L_0x0623:
            boolean r1 = r7.equals(r5)
            if (r1 != 0) goto L_0x062a
            goto L_0x05dd
        L_0x062a:
            r1 = 6
        L_0x062b:
            r15 = r17
            r14 = r18
            r6 = r20
            r41 = r16
            r16 = r1
            r1 = r41
            goto L_0x06ac
        L_0x0639:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L_0x0640
            goto L_0x05dd
        L_0x0640:
            r1 = r16
            r15 = r17
            r14 = r18
            r6 = r20
            r16 = r27
            goto L_0x06ac
        L_0x064c:
            boolean r1 = r7.equals(r2)
            if (r1 != 0) goto L_0x0653
            goto L_0x05dd
        L_0x0653:
            r1 = 4
            r6 = r1
            r1 = r16
            goto L_0x0663
        L_0x0658:
            r1 = r16
            boolean r6 = r7.equals(r1)
            if (r6 != 0) goto L_0x0662
            goto L_0x05df
        L_0x0662:
            r6 = 3
        L_0x0663:
            r16 = r6
            r15 = r17
            r14 = r18
            r6 = r20
            goto L_0x06ac
        L_0x066c:
            r1 = r16
            r6 = r20
            boolean r14 = r7.equals(r6)
            if (r14 != 0) goto L_0x067b
            r15 = r17
            r14 = r18
            goto L_0x06aa
        L_0x067b:
            r14 = 2
            r16 = r14
            r15 = r17
            r14 = r18
            goto L_0x06ac
        L_0x0683:
            r1 = r16
            r14 = r18
            r6 = r20
            boolean r15 = r7.equals(r14)
            if (r15 != 0) goto L_0x0692
            r15 = r17
            goto L_0x06aa
        L_0x0692:
            r15 = 1
            r16 = r15
            r15 = r17
            goto L_0x06ac
        L_0x0698:
            r1 = r16
            r15 = r17
            r14 = r18
            r6 = r20
            boolean r16 = r7.equals(r15)
            if (r16 != 0) goto L_0x06a7
            goto L_0x06aa
        L_0x06a7:
            r16 = 0
            goto L_0x06ac
        L_0x06aa:
            r16 = -1
        L_0x06ac:
            switch(r16) {
                case 0: goto L_0x06fb;
                case 1: goto L_0x06f5;
                case 2: goto L_0x06ef;
                case 3: goto L_0x06e9;
                case 4: goto L_0x06e3;
                case 5: goto L_0x06dd;
                case 6: goto L_0x06d7;
                case 7: goto L_0x06d1;
                case 8: goto L_0x06cb;
                case 9: goto L_0x06c5;
                case 10: goto L_0x06bf;
                case 11: goto L_0x06b9;
                default: goto L_0x06af;
            }
        L_0x06af:
            r17 = r4
            r18 = r14
            r16 = r15
            r14 = r45
            r4 = 0
            goto L_0x070c
        L_0x06b9:
            e1.d$a r16 = new e1.d$a
            r16.<init>()
            goto L_0x0700
        L_0x06bf:
            e1.d$d r16 = new e1.d$d
            r16.<init>()
            goto L_0x0700
        L_0x06c5:
            e1.d$c r16 = new e1.d$c
            r16.<init>()
            goto L_0x0700
        L_0x06cb:
            e1.d$f r16 = new e1.d$f
            r16.<init>()
            goto L_0x0700
        L_0x06d1:
            e1.d$j r16 = new e1.d$j
            r16.<init>()
            goto L_0x0700
        L_0x06d7:
            e1.d$i r16 = new e1.d$i
            r16.<init>()
            goto L_0x0700
        L_0x06dd:
            e1.d$e r16 = new e1.d$e
            r16.<init>()
            goto L_0x0700
        L_0x06e3:
            e1.d$m r16 = new e1.d$m
            r16.<init>()
            goto L_0x0700
        L_0x06e9:
            e1.d$l r16 = new e1.d$l
            r16.<init>()
            goto L_0x0700
        L_0x06ef:
            e1.d$k r16 = new e1.d$k
            r16.<init>()
            goto L_0x0700
        L_0x06f5:
            e1.d$h r16 = new e1.d$h
            r16.<init>()
            goto L_0x0700
        L_0x06fb:
            e1.d$g r16 = new e1.d$g
            r16.<init>()
        L_0x0700:
            r17 = r4
            r18 = r14
            r4 = r16
            r16 = r15
            r14 = r45
            r4.f3975i = r14
        L_0x070c:
            if (r4 != 0) goto L_0x070f
            goto L_0x0716
        L_0x070f:
            r4.f3972f = r7
            java.util.HashMap<java.lang.String, e1.d> r14 = r0.f9752x
            r14.put(r7, r4)
        L_0x0716:
            r20 = r6
            r4 = r17
            r6 = r19
            r15 = r23
            r17 = r16
            r16 = r1
            r1 = r29
            goto L_0x055f
        L_0x0726:
            r23 = r15
            r1 = r16
            r16 = r17
            r6 = r20
            r17 = r4
            java.util.ArrayList<f1.d> r4 = r0.f9751w
            if (r4 == 0) goto L_0x0a80
            java.util.Iterator r4 = r4.iterator()
        L_0x0738:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0a80
            java.lang.Object r7 = r4.next()
            f1.d r7 = (f1.d) r7
            boolean r14 = r7 instanceof f1.j
            if (r14 == 0) goto L_0x0a72
            f1.j r7 = (f1.j) r7
            java.util.HashMap<java.lang.String, e1.d> r14 = r0.f9752x
            r7.getClass()
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0757:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x0a72
            java.lang.Object r19 = r15.next()
            r45 = r4
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r19 = r14.get(r4)
            r32 = r19
            e1.d r32 = (e1.d) r32
            if (r32 != 0) goto L_0x077b
            r0 = r6
            r4 = r7
            r20 = r13
            r19 = r14
            r46 = r15
            goto L_0x0a64
        L_0x077b:
            boolean r19 = r4.startsWith(r13)
            if (r19 == 0) goto L_0x07d9
            r19 = r14
            r14 = 7
            java.lang.String r4 = r4.substring(r14)
            java.util.HashMap<java.lang.String, g1.a> r14 = r7.f9622d
            java.lang.Object r4 = r14.get(r4)
            g1.a r4 = (g1.a) r4
            if (r4 == 0) goto L_0x07d1
            r14 = r32
            e1.d$b r14 = (e1.d.b) r14
            r46 = r15
            int r15 = r7.f9619a
            r20 = r13
            float r13 = r7.f9687s
            int r0 = r7.f9686r
            r29 = r6
            float r6 = r7.f9688t
            r30 = r7
            android.util.SparseArray<g1.a> r7 = r14.f9082l
            r7.append(r15, r4)
            android.util.SparseArray<float[]> r4 = r14.f9083m
            r7 = 2
            float[] r7 = new float[r7]
            r32 = 0
            r7[r32] = r13
            r13 = 1
            r7[r13] = r6
            r4.append(r15, r7)
            int r4 = r14.f3968b
            int r0 = java.lang.Math.max(r4, r0)
            r14.f3968b = r0
            r0 = r42
            r4 = r45
            r15 = r46
            r14 = r19
            r13 = r20
            r6 = r29
            r7 = r30
            goto L_0x0757
        L_0x07d1:
            r0 = r42
            r4 = r45
            r14 = r19
            goto L_0x0757
        L_0x07d9:
            r29 = r6
            r30 = r7
            r20 = r13
            r19 = r14
            r46 = r15
            int r0 = r4.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0873;
                case -1249320805: goto L_0x0862;
                case -1225497657: goto L_0x084f;
                case -1225497656: goto L_0x0846;
                case -1225497655: goto L_0x083d;
                case -1001078227: goto L_0x0833;
                case -908189618: goto L_0x0823;
                case -908189617: goto L_0x081a;
                case -40300674: goto L_0x0810;
                case -4379043: goto L_0x0806;
                case 37232917: goto L_0x07fc;
                case 92909918: goto L_0x07f2;
                default: goto L_0x07ea;
            }
        L_0x07ea:
            r7 = r16
            r6 = r18
            r0 = r29
            goto L_0x0882
        L_0x07f2:
            boolean r0 = r4.equals(r8)
            if (r0 != 0) goto L_0x07f9
            goto L_0x07ea
        L_0x07f9:
            r0 = r22
            goto L_0x082b
        L_0x07fc:
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x0803
            goto L_0x07ea
        L_0x0803:
            r0 = r24
            goto L_0x082b
        L_0x0806:
            boolean r0 = r4.equals(r9)
            if (r0 != 0) goto L_0x080d
            goto L_0x07ea
        L_0x080d:
            r0 = r25
            goto L_0x082b
        L_0x0810:
            boolean r0 = r4.equals(r10)
            if (r0 != 0) goto L_0x0817
            goto L_0x07ea
        L_0x0817:
            r0 = r26
            goto L_0x082b
        L_0x081a:
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L_0x0821
            goto L_0x07ea
        L_0x0821:
            r0 = 7
            goto L_0x082b
        L_0x0823:
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x082a
            goto L_0x07ea
        L_0x082a:
            r0 = 6
        L_0x082b:
            r4 = r0
            r7 = r16
            r6 = r18
            r0 = r29
            goto L_0x0883
        L_0x0833:
            boolean r0 = r4.equals(r12)
            if (r0 != 0) goto L_0x083a
            goto L_0x084c
        L_0x083a:
            r0 = r27
            goto L_0x082b
        L_0x083d:
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L_0x0844
            goto L_0x084c
        L_0x0844:
            r0 = 4
            goto L_0x082b
        L_0x0846:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x084d
        L_0x084c:
            goto L_0x07ea
        L_0x084d:
            r0 = 3
            goto L_0x082b
        L_0x084f:
            r0 = r29
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x085c
            r7 = r16
            r6 = r18
            goto L_0x0882
        L_0x085c:
            r4 = 2
            r7 = r16
            r6 = r18
            goto L_0x0883
        L_0x0862:
            r6 = r18
            r0 = r29
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x086f
            r7 = r16
            goto L_0x0882
        L_0x086f:
            r4 = 1
            r7 = r16
            goto L_0x0883
        L_0x0873:
            r7 = r16
            r6 = r18
            r0 = r29
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0880
            goto L_0x0882
        L_0x0880:
            r4 = 0
            goto L_0x0883
        L_0x0882:
            r4 = -1
        L_0x0883:
            switch(r4) {
                case 0: goto L_0x0a3f;
                case 1: goto L_0x0a19;
                case 2: goto L_0x09f3;
                case 3: goto L_0x09cc;
                case 4: goto L_0x09a5;
                case 5: goto L_0x097e;
                case 6: goto L_0x0957;
                case 7: goto L_0x0930;
                case 8: goto L_0x0909;
                case 9: goto L_0x08e2;
                case 10: goto L_0x08bb;
                case 11: goto L_0x088e;
                default: goto L_0x0886;
            }
        L_0x0886:
            r18 = r6
            r16 = r7
            r4 = r30
            goto L_0x0a64
        L_0x088e:
            r4 = r30
            float r13 = r4.f9674f
            boolean r13 = java.lang.Float.isNaN(r13)
            if (r13 != 0) goto L_0x08b5
            int r13 = r4.f9619a
            float r14 = r4.f9674f
            float r15 = r4.f9687s
            r16 = r7
            int r7 = r4.f9686r
            r18 = r6
            float r6 = r4.f9688t
            r33 = r14
            r34 = r15
            r35 = r6
            r36 = r13
            r37 = r7
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x08b5:
            r18 = r6
            r16 = r7
            goto L_0x0a64
        L_0x08bb:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9679k
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9679k
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x08e2:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9675g
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9675g
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x0909:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9676h
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9676h
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x0930:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9681m
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9681m
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x0957:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9680l
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9680l
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x097e:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9685q
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9685q
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x09a5:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9684p
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9684p
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x09cc:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9683o
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9683o
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x09f3:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9682n
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9682n
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x0a19:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9678j
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9678j
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
            goto L_0x0a64
        L_0x0a3f:
            r18 = r6
            r16 = r7
            r4 = r30
            float r6 = r4.f9677i
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a64
            int r6 = r4.f9619a
            float r7 = r4.f9677i
            float r13 = r4.f9687s
            int r14 = r4.f9686r
            float r15 = r4.f9688t
            r33 = r7
            r34 = r13
            r35 = r15
            r36 = r6
            r37 = r14
            r32.b(r33, r34, r35, r36, r37)
        L_0x0a64:
            r15 = r46
            r6 = r0
            r7 = r4
            r14 = r19
            r13 = r20
            r0 = r42
            r4 = r45
            goto L_0x0757
        L_0x0a72:
            r45 = r4
            r0 = r6
            r20 = r13
            r4 = r45
            r6 = r0
            r13 = r20
            r0 = r42
            goto L_0x0738
        L_0x0a80:
            r0 = r6
            r20 = r13
            r4 = r42
            java.util.HashMap<java.lang.String, e1.d> r6 = r4.f9752x
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0a8f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0ac8
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r13 = r17
            boolean r14 = r13.containsKey(r7)
            if (r14 == 0) goto L_0x0aae
            java.lang.Object r14 = r13.get(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0aaf
        L_0x0aae:
            r14 = 0
        L_0x0aaf:
            java.util.HashMap<java.lang.String, e1.d> r15 = r4.f9752x
            java.lang.Object r7 = r15.get(r7)
            e1.d r7 = (e1.d) r7
            r7.c(r14)
            r17 = r13
            goto L_0x0a8f
        L_0x0abd:
            r4 = r0
            r23 = r15
            r1 = r16
            r16 = r17
            r0 = r20
            r20 = r13
        L_0x0ac8:
            java.util.ArrayList<f1.p> r6 = r4.f9749u
            int r6 = r6.size()
            int r6 = r6 + 2
            f1.p[] r7 = new f1.p[r6]
            f1.p r13 = r4.f9734f
            r14 = 0
            r7[r14] = r13
            int r13 = r6 + -1
            f1.p r15 = r4.f9735g
            r7[r13] = r15
            java.util.ArrayList<f1.p> r13 = r4.f9749u
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0aec
            int r13 = r4.f9733e
            r15 = -1
            if (r13 != r15) goto L_0x0aec
            r4.f9733e = r14
        L_0x0aec:
            java.util.ArrayList<f1.p> r13 = r4.f9749u
            java.util.Iterator r13 = r13.iterator()
            r14 = 1
        L_0x0af3:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0b06
            java.lang.Object r15 = r13.next()
            f1.p r15 = (f1.p) r15
            int r17 = r14 + 1
            r7[r14] = r15
            r14 = r17
            goto L_0x0af3
        L_0x0b06:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            f1.p r14 = r4.f9735g
            java.util.LinkedHashMap<java.lang.String, g1.a> r14 = r14.f9769u
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0b17:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0b59
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r45 = r14
            f1.p r14 = r4.f9734f
            java.util.LinkedHashMap<java.lang.String, g1.a> r14 = r14.f9769u
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x0b4e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r29 = r0
            r0 = r23
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r0 = r31
            boolean r14 = r0.contains(r14)
            if (r14 != 0) goto L_0x0b52
            r13.add(r15)
            goto L_0x0b52
        L_0x0b4e:
            r29 = r0
            r0 = r31
        L_0x0b52:
            r14 = r45
            r31 = r0
            r0 = r29
            goto L_0x0b17
        L_0x0b59:
            r29 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r13.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r4.f9746r = r0
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4.f9747s = r0
            r0 = 0
        L_0x0b6c:
            java.lang.String[] r13 = r4.f9746r
            int r14 = r13.length
            if (r0 >= r14) goto L_0x0ba3
            r13 = r13[r0]
            int[] r14 = r4.f9747s
            r15 = 0
            r14[r0] = r15
            r14 = 0
        L_0x0b79:
            if (r14 >= r6) goto L_0x0ba0
            r15 = r7[r14]
            java.util.LinkedHashMap<java.lang.String, g1.a> r15 = r15.f9769u
            boolean r15 = r15.containsKey(r13)
            if (r15 == 0) goto L_0x0b9d
            r15 = r7[r14]
            java.util.LinkedHashMap<java.lang.String, g1.a> r15 = r15.f9769u
            java.lang.Object r15 = r15.get(r13)
            g1.a r15 = (g1.a) r15
            if (r15 == 0) goto L_0x0b9d
            int[] r13 = r4.f9747s
            r14 = r13[r0]
            int r15 = r15.c()
            int r15 = r15 + r14
            r13[r0] = r15
            goto L_0x0ba0
        L_0x0b9d:
            int r14 = r14 + 1
            goto L_0x0b79
        L_0x0ba0:
            int r0 = r0 + 1
            goto L_0x0b6c
        L_0x0ba3:
            r0 = 0
            r0 = r7[r0]
            int r0 = r0.f9765q
            r14 = -1
            if (r0 == r14) goto L_0x0bad
            r0 = 1
            goto L_0x0bae
        L_0x0bad:
            r0 = 0
        L_0x0bae:
            int r13 = r13.length
            int r13 = r13 + 18
            boolean[] r14 = new boolean[r13]
            r15 = 1
        L_0x0bb4:
            if (r15 >= r6) goto L_0x0c25
            r17 = r1
            r1 = r7[r15]
            int r19 = r15 + -1
            r23 = r2
            r2 = r7[r19]
            r19 = r12
            float r12 = r1.f9760e
            r30 = r5
            float r5 = r2.f9760e
            boolean r5 = f1.p.c(r12, r5)
            float r12 = r1.f9761f
            r31 = r3
            float r3 = r2.f9761f
            boolean r3 = f1.p.c(r12, r3)
            r12 = 0
            boolean r12 = r14[r12]
            r32 = r10
            float r10 = r1.f9759d
            r33 = r9
            float r9 = r2.f9759d
            boolean r9 = f1.p.c(r10, r9)
            r9 = r9 | r12
            r10 = 0
            r14[r10] = r9
            r9 = 1
            boolean r10 = r14[r9]
            r3 = r3 | r5
            r3 = r3 | r0
            r5 = r10 | r3
            r14[r9] = r5
            r5 = 2
            boolean r9 = r14[r5]
            r3 = r3 | r9
            r14[r5] = r3
            r3 = 3
            boolean r5 = r14[r3]
            float r9 = r1.f9762n
            float r10 = r2.f9762n
            boolean r9 = f1.p.c(r9, r10)
            r5 = r5 | r9
            r14[r3] = r5
            r3 = 4
            boolean r5 = r14[r3]
            float r1 = r1.f9763o
            float r2 = r2.f9763o
            boolean r1 = f1.p.c(r1, r2)
            r1 = r1 | r5
            r14[r3] = r1
            int r15 = r15 + 1
            r1 = r17
            r12 = r19
            r2 = r23
            r5 = r30
            r3 = r31
            r10 = r32
            r9 = r33
            goto L_0x0bb4
        L_0x0c25:
            r17 = r1
            r23 = r2
            r31 = r3
            r30 = r5
            r33 = r9
            r32 = r10
            r19 = r12
            r0 = 0
            r1 = 1
        L_0x0c35:
            if (r1 >= r13) goto L_0x0c40
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0c3d
            int r0 = r0 + 1
        L_0x0c3d:
            int r1 = r1 + 1
            goto L_0x0c35
        L_0x0c40:
            int[] r1 = new int[r0]
            r4.f9743o = r1
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            double[] r1 = new double[r0]
            r4.f9744p = r1
            double[] r0 = new double[r0]
            r4.f9745q = r0
            r0 = 0
            r1 = 1
        L_0x0c53:
            if (r1 >= r13) goto L_0x0c63
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0c60
            int[] r2 = r4.f9743o
            int r3 = r0 + 1
            r2[r0] = r1
            r0 = r3
        L_0x0c60:
            int r1 = r1 + 1
            goto L_0x0c53
        L_0x0c63:
            int[] r0 = r4.f9743o
            int r0 = r0.length
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r1[r2] = r0
            r0 = 0
            r1[r0] = r6
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            double[][] r0 = (double[][]) r0
            double[] r1 = new double[r6]
            r2 = 0
        L_0x0c7a:
            if (r2 >= r6) goto L_0x0ccb
            r3 = r7[r2]
            r5 = r0[r2]
            int[] r9 = r4.f9743o
            r10 = 6
            float[] r10 = new float[r10]
            float r12 = r3.f9759d
            r13 = 0
            r10[r13] = r12
            float r12 = r3.f9760e
            r13 = 1
            r10[r13] = r12
            float r12 = r3.f9761f
            r13 = 2
            r10[r13] = r12
            float r12 = r3.f9762n
            r13 = 3
            r10[r13] = r12
            float r12 = r3.f9763o
            r13 = 4
            r10[r13] = r12
            float r3 = r3.f9764p
            r10[r27] = r3
            r3 = 0
            r12 = 0
        L_0x0ca4:
            int r13 = r9.length
            if (r3 >= r13) goto L_0x0cc1
            r13 = r9[r3]
            r14 = 6
            if (r13 >= r14) goto L_0x0cb8
            int r14 = r12 + 1
            r13 = r10[r13]
            r15 = r9
            r34 = r10
            double r9 = (double) r13
            r5[r12] = r9
            r12 = r14
            goto L_0x0cbb
        L_0x0cb8:
            r15 = r9
            r34 = r10
        L_0x0cbb:
            int r3 = r3 + 1
            r9 = r15
            r10 = r34
            goto L_0x0ca4
        L_0x0cc1:
            r3 = r7[r2]
            float r3 = r3.f9758c
            double r9 = (double) r3
            r1[r2] = r9
            int r2 = r2 + 1
            goto L_0x0c7a
        L_0x0ccb:
            r2 = 0
        L_0x0ccc:
            int[] r3 = r4.f9743o
            int r5 = r3.length
            if (r2 >= r5) goto L_0x0d01
            r3 = r3[r2]
            java.lang.String[] r5 = f1.p.f9755y
            r9 = 6
            if (r3 >= r9) goto L_0x0cfe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int[] r9 = r4.f9743o
            r9 = r9[r2]
            r5 = r5[r9]
            java.lang.String r9 = " ["
            java.lang.String r3 = android.support.v4.media.a.o(r3, r5, r9)
            r5 = 0
        L_0x0cea:
            if (r5 >= r6) goto L_0x0cfe
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
            r9 = r0[r5]
            r12 = r9[r2]
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            int r5 = r5 + 1
            goto L_0x0cea
        L_0x0cfe:
            int r2 = r2 + 1
            goto L_0x0ccc
        L_0x0d01:
            java.lang.String[] r2 = r4.f9746r
            int r2 = r2.length
            int r2 = r2 + 1
            b1.b[] r2 = new b1.b[r2]
            r4.f9738j = r2
            r2 = 0
        L_0x0d0b:
            java.lang.String[] r3 = r4.f9746r
            int r5 = r3.length
            if (r2 >= r5) goto L_0x0dd1
            r3 = r3[r2]
            r5 = 0
            r9 = 0
            r10 = 0
            r12 = 0
        L_0x0d16:
            if (r5 >= r6) goto L_0x0db7
            r13 = r7[r5]
            java.util.LinkedHashMap<java.lang.String, g1.a> r13 = r13.f9769u
            boolean r13 = r13.containsKey(r3)
            if (r13 == 0) goto L_0x0dab
            if (r12 != 0) goto L_0x0d49
            double[] r10 = new double[r6]
            r12 = r7[r5]
            java.util.LinkedHashMap<java.lang.String, g1.a> r12 = r12.f9769u
            java.lang.Object r12 = r12.get(r3)
            g1.a r12 = (g1.a) r12
            if (r12 != 0) goto L_0x0d34
            r12 = 0
            goto L_0x0d38
        L_0x0d34:
            int r12 = r12.c()
        L_0x0d38:
            r13 = 2
            int[] r13 = new int[r13]
            r14 = 1
            r13[r14] = r12
            r12 = 0
            r13[r12] = r6
            java.lang.Class r12 = java.lang.Double.TYPE
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r13)
            double[][] r12 = (double[][]) r12
        L_0x0d49:
            r13 = r7[r5]
            float r14 = r13.f9758c
            double r14 = (double) r14
            r10[r9] = r14
            r14 = r12[r9]
            java.util.LinkedHashMap<java.lang.String, g1.a> r13 = r13.f9769u
            java.lang.Object r13 = r13.get(r3)
            g1.a r13 = (g1.a) r13
            if (r13 != 0) goto L_0x0d65
            r45 = r3
            r37 = r10
            r36 = r11
            r46 = r12
            goto L_0x0da4
        L_0x0d65:
            int r15 = r13.c()
            r45 = r3
            r3 = 1
            if (r15 != r3) goto L_0x0d7d
            float r3 = r13.a()
            r46 = r12
            double r12 = (double) r3
            r3 = 0
            r14[r3] = r12
        L_0x0d78:
            r37 = r10
            r36 = r11
            goto L_0x0da4
        L_0x0d7d:
            r46 = r12
            int r3 = r13.c()
            float[] r12 = new float[r3]
            r13.b(r12)
            r13 = 0
            r15 = 0
        L_0x0d8a:
            if (r13 >= r3) goto L_0x0d78
            int r34 = r15 + 1
            r35 = r3
            r3 = r12[r13]
            r37 = r10
            r36 = r11
            double r10 = (double) r3
            r14[r15] = r10
            int r13 = r13 + 1
            r15 = r34
            r3 = r35
            r11 = r36
            r10 = r37
            goto L_0x0d8a
        L_0x0da4:
            int r9 = r9 + 1
            r12 = r46
            r10 = r37
            goto L_0x0daf
        L_0x0dab:
            r45 = r3
            r36 = r11
        L_0x0daf:
            int r5 = r5 + 1
            r3 = r45
            r11 = r36
            goto L_0x0d16
        L_0x0db7:
            r36 = r11
            double[] r3 = java.util.Arrays.copyOf(r10, r9)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r12, r9)
            double[][] r5 = (double[][]) r5
            b1.b[] r9 = r4.f9738j
            int r2 = r2 + 1
            int r10 = r4.f9733e
            b1.b r3 = b1.b.a(r10, r3, r5)
            r9[r2] = r3
            goto L_0x0d0b
        L_0x0dd1:
            r36 = r11
            b1.b[] r2 = r4.f9738j
            int r3 = r4.f9733e
            b1.b r0 = b1.b.a(r3, r1, r0)
            r1 = 0
            r2[r1] = r0
            r0 = r7[r1]
            int r0 = r0.f9765q
            r2 = -1
            if (r0 == r2) goto L_0x0e1f
            int[] r0 = new int[r6]
            double[] r2 = new double[r6]
            r3 = 2
            int[] r5 = new int[r3]
            r9 = 1
            r5[r9] = r3
            r5[r1] = r6
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r3 = 0
        L_0x0dfa:
            if (r3 >= r6) goto L_0x0e18
            r5 = r7[r3]
            int r9 = r5.f9765q
            r0[r3] = r9
            float r9 = r5.f9758c
            double r9 = (double) r9
            r2[r3] = r9
            r9 = r1[r3]
            float r10 = r5.f9760e
            double r10 = (double) r10
            r12 = 0
            r9[r12] = r10
            float r5 = r5.f9761f
            double r10 = (double) r5
            r5 = 1
            r9[r5] = r10
            int r3 = r3 + 1
            goto L_0x0dfa
        L_0x0e18:
            b1.a r3 = new b1.a
            r3.<init>(r0, r2, r1)
            r4.f9739k = r3
        L_0x0e1f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f9754z = r0
            java.util.ArrayList<f1.d> r0 = r4.f9751w
            if (r0 == 0) goto L_0x1619
            java.util.Iterator r0 = r28.iterator()
            r1 = 2143289344(0x7fc00000, float:NaN)
        L_0x0e30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x123f
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r20
            boolean r5 = r2.startsWith(r3)
            if (r5 == 0) goto L_0x0e64
            e1.b$b r5 = new e1.b$b
            r5.<init>()
            r45 = r0
            r0 = r5
            r14 = r17
            r12 = r19
            r5 = r21
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            r17 = r16
            goto L_0x10fb
        L_0x0e64:
            int r5 = r2.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x1079;
                case -1249320805: goto L_0x104d;
                case -1225497657: goto L_0x102b;
                case -1225497656: goto L_0x1000;
                case -1225497655: goto L_0x0fde;
                case -1001078227: goto L_0x0fba;
                case -908189618: goto L_0x0f94;
                case -908189617: goto L_0x0f6e;
                case -797520672: goto L_0x0f36;
                case -40300674: goto L_0x0f24;
                case -4379043: goto L_0x0ef4;
                case 37232917: goto L_0x0eba;
                case 92909918: goto L_0x0eaa;
                case 156108012: goto L_0x0e85;
                default: goto L_0x0e6b;
            }
        L_0x0e6b:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r5 = r21
        L_0x0e75:
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            goto L_0x109b
        L_0x0e85:
            r5 = r21
            boolean r6 = r2.equals(r5)
            if (r6 != 0) goto L_0x0e96
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            goto L_0x0e75
        L_0x0e96:
            r14 = r17
            r12 = r19
            r13 = r23
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            r15 = 13
            goto L_0x1021
        L_0x0eaa:
            r5 = r21
            boolean r6 = r2.equals(r8)
            if (r6 != 0) goto L_0x0eb5
            r6 = r36
            goto L_0x0ec4
        L_0x0eb5:
            r6 = r36
            r7 = 12
            goto L_0x0edc
        L_0x0eba:
            r5 = r21
            r6 = r36
            boolean r7 = r2.equals(r6)
            if (r7 != 0) goto L_0x0eda
        L_0x0ec4:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            goto L_0x109b
        L_0x0eda:
            r7 = r22
        L_0x0edc:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r16 = r7
            r7 = r33
            goto L_0x109d
        L_0x0ef4:
            r5 = r21
            r7 = r33
            r6 = r36
            boolean r9 = r2.equals(r7)
            if (r9 != 0) goto L_0x0f14
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            goto L_0x109b
        L_0x0f14:
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r24
            r11 = r30
            r10 = r31
            r9 = r32
            goto L_0x1021
        L_0x0f24:
            r5 = r21
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r10 = r2.equals(r9)
            if (r10 != 0) goto L_0x0f33
            goto L_0x0f46
        L_0x0f33:
            r10 = r25
            goto L_0x0f5a
        L_0x0f36:
            r5 = r21
            r9 = r32
            r7 = r33
            r6 = r36
            java.lang.String r10 = "waveVariesBy"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0f58
        L_0x0f46:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            goto L_0x109b
        L_0x0f58:
            r10 = r26
        L_0x0f5a:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r11 = r30
            r16 = r10
            r10 = r31
            goto L_0x109d
        L_0x0f6e:
            r5 = r21
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r11 = r2.equals(r10)
            if (r11 != 0) goto L_0x0f81
            r11 = r30
            goto L_0x0fa6
        L_0x0f81:
            r11 = 7
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r13 = r23
            r15 = r29
            r16 = r11
            r11 = r30
            goto L_0x109d
        L_0x0f94:
            r5 = r21
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r12 = r2.equals(r11)
            if (r12 != 0) goto L_0x0fa9
        L_0x0fa6:
            r12 = r19
            goto L_0x0fce
        L_0x0fa9:
            r12 = 6
            r45 = r0
            r0 = r16
            r14 = r17
            r13 = r23
            r15 = r29
            r16 = r12
            r12 = r19
            goto L_0x109d
        L_0x0fba:
            r12 = r19
            r5 = r21
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r13 = r2.equals(r12)
            if (r13 != 0) goto L_0x0fd7
        L_0x0fce:
            r45 = r0
            r0 = r16
            r14 = r17
            r13 = r23
            goto L_0x101c
        L_0x0fd7:
            r14 = r17
            r13 = r23
            r15 = r27
            goto L_0x1021
        L_0x0fde:
            r12 = r19
            r5 = r21
            r13 = r23
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r14 = r2.equals(r13)
            if (r14 != 0) goto L_0x0ffb
            r45 = r0
            r0 = r16
            r14 = r17
            goto L_0x101c
        L_0x0ffb:
            r14 = 4
            r15 = r14
            r14 = r17
            goto L_0x1021
        L_0x1000:
            r14 = r17
            r12 = r19
            r5 = r21
            r13 = r23
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r15 = r2.equals(r14)
            if (r15 != 0) goto L_0x1020
            r45 = r0
            r0 = r16
        L_0x101c:
            r15 = r29
            goto L_0x109b
        L_0x1020:
            r15 = 3
        L_0x1021:
            r45 = r0
            r0 = r16
            r16 = r15
            r15 = r29
            goto L_0x109d
        L_0x102b:
            r14 = r17
            r12 = r19
            r5 = r21
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r17 = r2.equals(r15)
            if (r17 != 0) goto L_0x1048
            r45 = r0
            goto L_0x106d
        L_0x1048:
            r17 = 2
            r45 = r0
            goto L_0x1074
        L_0x104d:
            r45 = r0
            r14 = r17
            r0 = r18
            r12 = r19
            r5 = r21
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r17 = r2.equals(r0)
            if (r17 != 0) goto L_0x1070
            r18 = r0
        L_0x106d:
            r0 = r16
            goto L_0x109b
        L_0x1070:
            r17 = 1
            r18 = r0
        L_0x1074:
            r0 = r16
            r16 = r17
            goto L_0x109d
        L_0x1079:
            r45 = r0
            r0 = r16
            r14 = r17
            r12 = r19
            r5 = r21
            r13 = r23
            r15 = r29
            r11 = r30
            r10 = r31
            r9 = r32
            r7 = r33
            r6 = r36
            boolean r16 = r2.equals(r0)
            if (r16 != 0) goto L_0x1098
            goto L_0x109b
        L_0x1098:
            r16 = 0
            goto L_0x109d
        L_0x109b:
            r16 = -1
        L_0x109d:
            switch(r16) {
                case 0: goto L_0x10f5;
                case 1: goto L_0x10ef;
                case 2: goto L_0x10e9;
                case 3: goto L_0x10e3;
                case 4: goto L_0x10dd;
                case 5: goto L_0x10d7;
                case 6: goto L_0x10d1;
                case 7: goto L_0x10cb;
                case 8: goto L_0x10c5;
                case 9: goto L_0x10bf;
                case 10: goto L_0x10b9;
                case 11: goto L_0x10b3;
                case 12: goto L_0x10ad;
                case 13: goto L_0x10a7;
                default: goto L_0x10a0;
            }
        L_0x10a0:
            r16 = 0
        L_0x10a2:
            r17 = r0
            r0 = r16
            goto L_0x10fb
        L_0x10a7:
            e1.b$a r16 = new e1.b$a
            r16.<init>()
            goto L_0x10a2
        L_0x10ad:
            e1.b$a r16 = new e1.b$a
            r16.<init>()
            goto L_0x10a2
        L_0x10b3:
            e1.b$d r16 = new e1.b$d
            r16.<init>()
            goto L_0x10a2
        L_0x10b9:
            e1.b$c r16 = new e1.b$c
            r16.<init>()
            goto L_0x10a2
        L_0x10bf:
            e1.b$f r16 = new e1.b$f
            r16.<init>()
            goto L_0x10a2
        L_0x10c5:
            e1.b$a r16 = new e1.b$a
            r16.<init>()
            goto L_0x10a2
        L_0x10cb:
            e1.b$j r16 = new e1.b$j
            r16.<init>()
            goto L_0x10a2
        L_0x10d1:
            e1.b$i r16 = new e1.b$i
            r16.<init>()
            goto L_0x10a2
        L_0x10d7:
            e1.b$e r16 = new e1.b$e
            r16.<init>()
            goto L_0x10a2
        L_0x10dd:
            e1.b$m r16 = new e1.b$m
            r16.<init>()
            goto L_0x10a2
        L_0x10e3:
            e1.b$l r16 = new e1.b$l
            r16.<init>()
            goto L_0x10a2
        L_0x10e9:
            e1.b$k r16 = new e1.b$k
            r16.<init>()
            goto L_0x10a2
        L_0x10ef:
            e1.b$h r16 = new e1.b$h
            r16.<init>()
            goto L_0x10a2
        L_0x10f5:
            e1.b$g r16 = new e1.b$g
            r16.<init>()
            goto L_0x10a2
        L_0x10fb:
            if (r0 != 0) goto L_0x1119
            r0 = r45
            r20 = r3
            r21 = r5
            r36 = r6
            r33 = r7
            r32 = r9
            r31 = r10
            r30 = r11
            r19 = r12
            r23 = r13
            r29 = r15
            r16 = r17
            r17 = r14
            goto L_0x0e30
        L_0x1119:
            r20 = r15
            int r15 = r0.f3909e
            r21 = r14
            r14 = 1
            if (r15 != r14) goto L_0x1124
            r14 = 1
            goto L_0x1125
        L_0x1124:
            r14 = 0
        L_0x1125:
            if (r14 == 0) goto L_0x1215
            boolean r14 = java.lang.Float.isNaN(r1)
            if (r14 == 0) goto L_0x1215
            r1 = 2
            float[] r1 = new float[r1]
            r14 = 99
            float r14 = (float) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 / r14
            r28 = 0
            r14 = 0
            r16 = 100
            r19 = 0
            r23 = r13
            r13 = r16
            r35 = r28
            r37 = r35
            r41 = r19
            r19 = r12
            r12 = r41
        L_0x114b:
            if (r12 >= r13) goto L_0x120c
            float r13 = (float) r12
            float r13 = r13 * r15
            r16 = r10
            r46 = r11
            double r10 = (double) r13
            r28 = r10
            f1.p r10 = r4.f9734f
            b1.c r10 = r10.f9756a
            java.util.ArrayList<f1.p> r11 = r4.f9749u
            java.util.Iterator r11 = r11.iterator()
            r30 = 0
            r31 = 2143289344(0x7fc00000, float:NaN)
        L_0x1164:
            boolean r32 = r11.hasNext()
            if (r32 == 0) goto L_0x1196
            java.lang.Object r32 = r11.next()
            r33 = r11
            r11 = r32
            f1.p r11 = (f1.p) r11
            r39 = r15
            b1.c r15 = r11.f9756a
            if (r15 == 0) goto L_0x1191
            r32 = r15
            float r15 = r11.f9758c
            int r34 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r34 >= 0) goto L_0x1187
            r30 = r15
            r10 = r32
            goto L_0x1191
        L_0x1187:
            boolean r15 = java.lang.Float.isNaN(r31)
            if (r15 == 0) goto L_0x1191
            float r11 = r11.f9758c
            r31 = r11
        L_0x1191:
            r11 = r33
            r15 = r39
            goto L_0x1164
        L_0x1196:
            r39 = r15
            if (r10 == 0) goto L_0x11b6
            boolean r11 = java.lang.Float.isNaN(r31)
            if (r11 == 0) goto L_0x11a2
            r31 = 1065353216(0x3f800000, float:1.0)
        L_0x11a2:
            float r13 = r13 - r30
            float r31 = r31 - r30
            float r13 = r13 / r31
            r11 = r6
            r15 = r7
            double r6 = (double) r13
            double r6 = r10.a(r6)
            float r6 = (float) r6
            float r6 = r6 * r31
            float r6 = r6 + r30
            double r6 = (double) r6
            goto L_0x11ba
        L_0x11b6:
            r11 = r6
            r15 = r7
            r6 = r28
        L_0x11ba:
            b1.b[] r10 = r4.f9738j
            r13 = 0
            r10 = r10[r13]
            double[] r13 = r4.f9744p
            r10.c(r6, r13)
            f1.p r10 = r4.f9734f
            int[] r13 = r4.f9743o
            r40 = r11
            double[] r11 = r4.f9744p
            r34 = 0
            r28 = r10
            r29 = r6
            r31 = r13
            r32 = r11
            r33 = r1
            r28.i(r29, r31, r32, r33, r34)
            if (r12 <= 0) goto L_0x11f1
            double r6 = (double) r14
            r10 = 1
            r10 = r1[r10]
            double r10 = (double) r10
            double r10 = r35 - r10
            r13 = 0
            r14 = r1[r13]
            double r13 = (double) r14
            double r13 = r37 - r13
            double r10 = java.lang.Math.hypot(r10, r13)
            double r10 = r10 + r6
            float r6 = (float) r10
            r14 = r6
        L_0x11f1:
            r13 = 0
            r6 = r1[r13]
            double r6 = (double) r6
            r10 = 1
            r10 = r1[r10]
            double r10 = (double) r10
            int r12 = r12 + 1
            r13 = 100
            r37 = r6
            r35 = r10
            r7 = r15
            r10 = r16
            r15 = r39
            r6 = r40
            r11 = r46
            goto L_0x114b
        L_0x120c:
            r40 = r6
            r15 = r7
            r16 = r10
            r46 = r11
            r1 = r14
            goto L_0x1220
        L_0x1215:
            r40 = r6
            r15 = r7
            r16 = r10
            r46 = r11
            r19 = r12
            r23 = r13
        L_0x1220:
            r0.f3906b = r2
            java.util.HashMap<java.lang.String, e1.b> r6 = r4.f9754z
            r6.put(r2, r0)
            r0 = r45
            r30 = r46
            r32 = r9
            r33 = r15
            r31 = r16
            r16 = r17
            r29 = r20
            r17 = r21
            r36 = r40
            r20 = r3
            r21 = r5
            goto L_0x0e30
        L_0x123f:
            r3 = r20
            r5 = r21
            r20 = r29
            r46 = r30
            r9 = r32
            r15 = r33
            r40 = r36
            r21 = r17
            r17 = r16
            r16 = r31
            java.util.ArrayList<f1.d> r0 = r4.f9751w
            java.util.Iterator r0 = r0.iterator()
        L_0x1259:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x15fe
            java.lang.Object r1 = r0.next()
            f1.d r1 = (f1.d) r1
            boolean r2 = r1 instanceof f1.f
            if (r2 == 0) goto L_0x15c6
            f1.f r1 = (f1.f) r1
            java.util.HashMap<java.lang.String, e1.b> r2 = r4.f9754z
            r1.getClass()
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x1278:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x15c6
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r10 = r7.startsWith(r3)
            if (r10 == 0) goto L_0x131e
            r10 = 7
            java.lang.String r10 = r7.substring(r10)
            java.util.HashMap<java.lang.String, g1.a> r11 = r1.f9622d
            java.lang.Object r10 = r11.get(r10)
            g1.a r10 = (g1.a) r10
            if (r10 == 0) goto L_0x1306
            int r11 = r10.f10266c
            r12 = 2
            if (r11 == r12) goto L_0x129f
            goto L_0x12a7
        L_0x129f:
            java.lang.Object r7 = r2.get(r7)
            e1.b r7 = (e1.b) r7
            if (r7 != 0) goto L_0x12b0
        L_0x12a7:
            r45 = r0
            r36 = r2
            r34 = r6
            r35 = r15
            goto L_0x12ea
        L_0x12b0:
            int r11 = r1.f9619a
            int r12 = r1.f9640f
            java.lang.String r13 = r1.f9641g
            int r14 = r1.f9646l
            r45 = r0
            float r0 = r1.f9642h
            r34 = r6
            float r6 = r1.f9643i
            r35 = r15
            float r15 = r1.f9644j
            float r33 = r10.a()
            java.util.ArrayList<b1.e$b> r4 = r7.f3910f
            r36 = r2
            b1.e$b r2 = new b1.e$b
            r28 = r2
            r29 = r11
            r30 = r0
            r31 = r6
            r32 = r15
            r28.<init>(r29, r30, r31, r32, r33)
            r4.add(r2)
            r0 = -1
            if (r14 == r0) goto L_0x12e3
            r7.f3909e = r14
        L_0x12e3:
            r7.f3907c = r12
            r7.c(r10)
            r7.f3908d = r13
        L_0x12ea:
            r31 = r1
            r28 = r5
            r29 = r8
            r32 = r9
            r30 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r33 = r35
            r23 = r3
            goto L_0x15a2
        L_0x1306:
            r45 = r0
            r34 = r6
            r6 = r46
            r0 = r2
            r2 = r15
            r4 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            goto L_0x154b
        L_0x131e:
            r45 = r0
            r36 = r2
            r34 = r6
            r35 = r15
            int r0 = r7.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x14c5;
                case -1249320805: goto L_0x14a4;
                case -1225497657: goto L_0x1481;
                case -1225497656: goto L_0x145a;
                case -1225497655: goto L_0x1431;
                case -1001078227: goto L_0x1410;
                case -908189618: goto L_0x13e3;
                case -908189617: goto L_0x13c1;
                case -40300674: goto L_0x139c;
                case -4379043: goto L_0x1389;
                case 37232917: goto L_0x1368;
                case 92909918: goto L_0x1359;
                case 156108012: goto L_0x134f;
                case 1530034690: goto L_0x1343;
                default: goto L_0x132d;
            }
        L_0x132d:
            r6 = r46
            r4 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r2 = r35
            r0 = r40
            goto L_0x14e3
        L_0x1343:
            java.lang.String r0 = "wavePhase"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x134c
            goto L_0x132d
        L_0x134c:
            r0 = 13
            goto L_0x1362
        L_0x134f:
            boolean r0 = r7.equals(r5)
            if (r0 != 0) goto L_0x1356
            goto L_0x132d
        L_0x1356:
            r0 = 12
            goto L_0x1362
        L_0x1359:
            boolean r0 = r7.equals(r8)
            if (r0 != 0) goto L_0x1360
            goto L_0x132d
        L_0x1360:
            r0 = r22
        L_0x1362:
            r4 = r0
            r2 = r35
            r0 = r40
            goto L_0x13ab
        L_0x1368:
            r0 = r40
            boolean r2 = r7.equals(r0)
            if (r2 != 0) goto L_0x1384
            r6 = r46
            r4 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r2 = r35
            goto L_0x14e3
        L_0x1384:
            r4 = r24
            r2 = r35
            goto L_0x13ab
        L_0x1389:
            r2 = r35
            r0 = r40
            boolean r4 = r7.equals(r2)
            if (r4 != 0) goto L_0x1399
            r6 = r46
            r4 = r16
            goto L_0x13f1
        L_0x1399:
            r4 = r25
            goto L_0x13ab
        L_0x139c:
            r2 = r35
            r0 = r40
            boolean r4 = r7.equals(r9)
            if (r4 != 0) goto L_0x13a9
            r4 = r16
            goto L_0x13cd
        L_0x13a9:
            r4 = r26
        L_0x13ab:
            r6 = r46
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r41 = r16
            r16 = r4
            r4 = r41
            goto L_0x14e5
        L_0x13c1:
            r4 = r16
            r2 = r35
            r0 = r40
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L_0x13d0
        L_0x13cd:
            r6 = r46
            goto L_0x13f1
        L_0x13d0:
            r6 = 7
            r16 = r6
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r6 = r46
            goto L_0x14e5
        L_0x13e3:
            r6 = r46
            r4 = r16
            r2 = r35
            r0 = r40
            boolean r10 = r7.equals(r6)
            if (r10 != 0) goto L_0x13ff
        L_0x13f1:
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            goto L_0x14e3
        L_0x13ff:
            r10 = 6
            r16 = r10
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            goto L_0x14e5
        L_0x1410:
            r6 = r46
            r4 = r16
            r10 = r19
            r2 = r35
            r0 = r40
            boolean r11 = r7.equals(r10)
            if (r11 != 0) goto L_0x1423
            r11 = r23
            goto L_0x1443
        L_0x1423:
            r15 = r17
            r14 = r18
            r13 = r20
            r12 = r21
            r11 = r23
            r16 = r27
            goto L_0x14e5
        L_0x1431:
            r6 = r46
            r4 = r16
            r10 = r19
            r11 = r23
            r2 = r35
            r0 = r40
            boolean r12 = r7.equals(r11)
            if (r12 != 0) goto L_0x144d
        L_0x1443:
            r15 = r17
            r14 = r18
            r13 = r20
            r12 = r21
            goto L_0x14e3
        L_0x144d:
            r12 = 4
            r16 = r12
            r15 = r17
            r14 = r18
            r13 = r20
            r12 = r21
            goto L_0x14e5
        L_0x145a:
            r6 = r46
            r4 = r16
            r10 = r19
            r12 = r21
            r11 = r23
            r2 = r35
            r0 = r40
            boolean r13 = r7.equals(r12)
            if (r13 != 0) goto L_0x1476
            r15 = r17
            r14 = r18
            r13 = r20
            goto L_0x14e3
        L_0x1476:
            r13 = 3
            r16 = r13
            r15 = r17
            r14 = r18
            r13 = r20
            goto L_0x14e5
        L_0x1481:
            r6 = r46
            r4 = r16
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r2 = r35
            r0 = r40
            boolean r14 = r7.equals(r13)
            if (r14 != 0) goto L_0x149c
            r15 = r17
            r14 = r18
            goto L_0x14e3
        L_0x149c:
            r14 = 2
            r16 = r14
            r15 = r17
            r14 = r18
            goto L_0x14e5
        L_0x14a4:
            r6 = r46
            r4 = r16
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r2 = r35
            r0 = r40
            boolean r15 = r7.equals(r14)
            if (r15 != 0) goto L_0x14bf
            r15 = r17
            goto L_0x14e3
        L_0x14bf:
            r15 = 1
            r16 = r15
            r15 = r17
            goto L_0x14e5
        L_0x14c5:
            r6 = r46
            r4 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r2 = r35
            r0 = r40
            boolean r16 = r7.equals(r15)
            if (r16 != 0) goto L_0x14e0
            goto L_0x14e3
        L_0x14e0:
            r16 = 0
            goto L_0x14e5
        L_0x14e3:
            r16 = -1
        L_0x14e5:
            switch(r16) {
                case 0: goto L_0x1533;
                case 1: goto L_0x152e;
                case 2: goto L_0x1529;
                case 3: goto L_0x1524;
                case 4: goto L_0x151f;
                case 5: goto L_0x151a;
                case 6: goto L_0x1515;
                case 7: goto L_0x1510;
                case 8: goto L_0x150b;
                case 9: goto L_0x1506;
                case 10: goto L_0x1501;
                case 11: goto L_0x14fc;
                case 12: goto L_0x14f7;
                case 13: goto L_0x14f2;
                default: goto L_0x14e8;
            }
        L_0x14e8:
            r40 = r0
            r7.startsWith(r3)
            r0 = 2143289344(0x7fc00000, float:NaN)
        L_0x14ef:
            r21 = r0
            goto L_0x1538
        L_0x14f2:
            r40 = r0
            float r0 = r1.f9644j
            goto L_0x14ef
        L_0x14f7:
            r40 = r0
            float r0 = r1.f9643i
            goto L_0x14ef
        L_0x14fc:
            r40 = r0
            float r0 = r1.f9647m
            goto L_0x14ef
        L_0x1501:
            r40 = r0
            float r0 = r1.f9650p
            goto L_0x14ef
        L_0x1506:
            r40 = r0
            float r0 = r1.f9648n
            goto L_0x14ef
        L_0x150b:
            r40 = r0
            float r0 = r1.f9649o
            goto L_0x14ef
        L_0x1510:
            r40 = r0
            float r0 = r1.f9654t
            goto L_0x14ef
        L_0x1515:
            r40 = r0
            float r0 = r1.f9653s
            goto L_0x14ef
        L_0x151a:
            r40 = r0
            float r0 = r1.f9645k
            goto L_0x14ef
        L_0x151f:
            r40 = r0
            float r0 = r1.f9657w
            goto L_0x14ef
        L_0x1524:
            r40 = r0
            float r0 = r1.f9656v
            goto L_0x14ef
        L_0x1529:
            r40 = r0
            float r0 = r1.f9655u
            goto L_0x14ef
        L_0x152e:
            r40 = r0
            float r0 = r1.f9652r
            goto L_0x14ef
        L_0x1533:
            r40 = r0
            float r0 = r1.f9651q
            goto L_0x14ef
        L_0x1538:
            boolean r0 = java.lang.Float.isNaN(r21)
            if (r0 == 0) goto L_0x1541
            r0 = r36
            goto L_0x154b
        L_0x1541:
            r0 = r36
            java.lang.Object r7 = r0.get(r7)
            e1.b r7 = (e1.b) r7
            if (r7 != 0) goto L_0x1565
        L_0x154b:
            r16 = r4
            r46 = r6
            r19 = r10
            r23 = r11
            r21 = r12
            r20 = r13
            r18 = r14
            r17 = r15
            r6 = r34
            r4 = r42
            r15 = r2
            r2 = r0
            r0 = r45
            goto L_0x1278
        L_0x1565:
            r36 = r0
            int r0 = r1.f9619a
            r33 = r2
            int r2 = r1.f9640f
            r23 = r3
            java.lang.String r3 = r1.f9641g
            r30 = r4
            int r4 = r1.f9646l
            r28 = r5
            float r5 = r1.f9642h
            r46 = r6
            float r6 = r1.f9643i
            r29 = r8
            float r8 = r1.f9644j
            r31 = r1
            java.util.ArrayList<b1.e$b> r1 = r7.f3910f
            r32 = r9
            b1.e$b r9 = new b1.e$b
            r16 = r9
            r17 = r0
            r18 = r5
            r19 = r6
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r1.add(r9)
            r0 = -1
            if (r4 == r0) goto L_0x159e
            r7.f3909e = r4
        L_0x159e:
            r7.f3907c = r2
            r7.f3908d = r3
        L_0x15a2:
            r4 = r42
            r0 = r45
            r19 = r10
            r21 = r12
            r20 = r13
            r18 = r14
            r17 = r15
            r3 = r23
            r5 = r28
            r8 = r29
            r16 = r30
            r1 = r31
            r9 = r32
            r15 = r33
            r6 = r34
            r2 = r36
            r23 = r11
            goto L_0x1278
        L_0x15c6:
            r45 = r0
            r28 = r5
            r29 = r8
            r32 = r9
            r33 = r15
            r30 = r16
            r15 = r17
            r14 = r18
            r10 = r19
            r13 = r20
            r12 = r21
            r11 = r23
            r23 = r3
            r4 = r42
            r0 = r45
            r19 = r10
            r21 = r12
            r20 = r13
            r18 = r14
            r17 = r15
            r3 = r23
            r5 = r28
            r8 = r29
            r16 = r30
            r9 = r32
            r15 = r33
            r23 = r11
            goto L_0x1259
        L_0x15fe:
            r0 = r4
            java.util.HashMap<java.lang.String, e1.b> r1 = r0.f9754z
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x1609:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x161a
            java.lang.Object r2 = r1.next()
            e1.b r2 = (e1.b) r2
            r2.d()
            goto L_0x1609
        L_0x1619:
            r0 = r4
        L_0x161a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.n.h(int, int, long):void");
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q(" start: x: ");
        q10.append(this.f9734f.f9760e);
        q10.append(" y: ");
        q10.append(this.f9734f.f9761f);
        q10.append(" end: x: ");
        q10.append(this.f9735g.f9760e);
        q10.append(" y: ");
        q10.append(this.f9735g.f9761f);
        return q10.toString();
    }
}
