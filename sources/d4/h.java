package d4;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.c;
import e4.g;
import e4.p;
import i4.d;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import n4.f;
import v0.e;
import z.k;

/* compiled from: GradientFillContent */
public final class h implements e, a.C0097a, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f8651a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8652b;

    /* renamed from: c  reason: collision with root package name */
    public final b f8653c;

    /* renamed from: d  reason: collision with root package name */
    public final e<LinearGradient> f8654d = new e<>();

    /* renamed from: e  reason: collision with root package name */
    public final e<RadialGradient> f8655e = new e<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f8656f;

    /* renamed from: g  reason: collision with root package name */
    public final c4.a f8657g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f8658h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f8659i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8660j;

    /* renamed from: k  reason: collision with root package name */
    public final g f8661k;

    /* renamed from: l  reason: collision with root package name */
    public final g f8662l;

    /* renamed from: m  reason: collision with root package name */
    public final g f8663m;

    /* renamed from: n  reason: collision with root package name */
    public final g f8664n;

    /* renamed from: o  reason: collision with root package name */
    public p f8665o;

    /* renamed from: p  reason: collision with root package name */
    public p f8666p;

    /* renamed from: q  reason: collision with root package name */
    public final c0 f8667q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8668r;

    /* renamed from: s  reason: collision with root package name */
    public a<Float, Float> f8669s;

    /* renamed from: t  reason: collision with root package name */
    public float f8670t;

    /* renamed from: u  reason: collision with root package name */
    public c f8671u;

    public h(c0 c0Var, b bVar, d dVar) {
        Path path = new Path();
        this.f8656f = path;
        this.f8657g = new c4.a(1);
        this.f8658h = new RectF();
        this.f8659i = new ArrayList();
        this.f8670t = 0.0f;
        this.f8653c = bVar;
        this.f8651a = dVar.f11086g;
        this.f8652b = dVar.f11087h;
        this.f8667q = c0Var;
        this.f8660j = dVar.f11080a;
        path.setFillType(dVar.f11081b);
        this.f8668r = (int) (c0Var.f4772a.b() / 32.0f);
        a a10 = dVar.f11082c.a();
        this.f8661k = (g) a10;
        a10.a(this);
        bVar.e(a10);
        a a11 = dVar.f11083d.a();
        this.f8662l = (g) a11;
        a11.a(this);
        bVar.e(a11);
        a a12 = dVar.f11084e.a();
        this.f8663m = (g) a12;
        a12.a(this);
        bVar.e(a12);
        a a13 = dVar.f11085f.a();
        this.f8664n = (g) a13;
        a13.a(this);
        bVar.e(a13);
        if (bVar.m() != null) {
            a<Float, Float> a14 = ((h4.b) bVar.m().f12907b).a();
            this.f8669s = a14;
            a14.a(this);
            bVar.e(this.f8669s);
        }
        if (bVar.n() != null) {
            this.f8671u = new c(this, bVar, bVar.n());
        }
    }

    public final void a() {
        this.f8667q.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f8659i.add((m) cVar);
            }
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8656f.reset();
        for (int i10 = 0; i10 < this.f8659i.size(); i10++) {
            this.f8656f.addPath(((m) this.f8659i.get(i10)).g(), matrix);
        }
        this.f8656f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final int[] e(int[] iArr) {
        p pVar = this.f8666p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r3v29, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r0.f8652b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f8656f
            r2.reset()
            r2 = 0
            r3 = r2
        L_0x0010:
            java.util.ArrayList r4 = r0.f8659i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f8656f
            java.util.ArrayList r5 = r0.f8659i
            java.lang.Object r5 = r5.get(r3)
            d4.m r5 = (d4.m) r5
            android.graphics.Path r5 = r5.g()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f8656f
            android.graphics.RectF r4 = r0.f8658h
            r3.computeBounds(r4, r2)
            int r3 = r0.f8660j
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 != r6) goto L_0x0084
            int r3 = r19.j()
            v0.e<android.graphics.LinearGradient> r6 = r0.f8654d
            long r7 = (long) r3
            java.lang.Object r3 = r6.f(r5, r7)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x004b
            goto L_0x00dc
        L_0x004b:
            e4.g r3 = r0.f8663m
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            e4.g r6 = r0.f8664n
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            e4.g r9 = r0.f8661k
            java.lang.Object r9 = r9.f()
            i4.c r9 = (i4.c) r9
            int[] r10 = r9.f11079b
            int[] r16 = r0.e(r10)
            float[] r9 = r9.f11078a
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            float r12 = r3.x
            float r13 = r3.y
            float r14 = r6.x
            float r15 = r6.y
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r11 = r10
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            v0.e<android.graphics.LinearGradient> r3 = r0.f8654d
            r3.j(r10, r7)
            r3 = r10
            goto L_0x00dc
        L_0x0084:
            int r3 = r19.j()
            v0.e<android.graphics.RadialGradient> r6 = r0.f8655e
            long r7 = (long) r3
            java.lang.Object r3 = r6.f(r5, r7)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x0094
            goto L_0x00dc
        L_0x0094:
            e4.g r3 = r0.f8663m
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            e4.g r6 = r0.f8664n
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            e4.g r9 = r0.f8661k
            java.lang.Object r9 = r9.f()
            i4.c r9 = (i4.c) r9
            int[] r10 = r9.f11079b
            int[] r15 = r0.e(r10)
            float[] r9 = r9.f11078a
            float r12 = r3.x
            float r13 = r3.y
            float r3 = r6.x
            float r6 = r6.y
            float r3 = r3 - r12
            double r10 = (double) r3
            float r6 = r6 - r13
            double r2 = (double) r6
            double r2 = java.lang.Math.hypot(r10, r2)
            float r2 = (float) r2
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x00cc
            r2 = 981668463(0x3a83126f, float:0.001)
        L_0x00cc:
            r14 = r2
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            r11 = r3
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            v0.e<android.graphics.RadialGradient> r2 = r0.f8655e
            r2.j(r3, r7)
        L_0x00dc:
            r3.setLocalMatrix(r1)
            c4.a r1 = r0.f8657g
            r1.setShader(r3)
            e4.p r1 = r0.f8665o
            if (r1 == 0) goto L_0x00f3
            c4.a r2 = r0.f8657g
            java.lang.Object r1 = r1.f()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r2.setColorFilter(r1)
        L_0x00f3:
            e4.a<java.lang.Float, java.lang.Float> r1 = r0.f8669s
            if (r1 == 0) goto L_0x011f
            java.lang.Object r1 = r1.f()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x010b
            c4.a r2 = r0.f8657g
            r2.setMaskFilter(r5)
            goto L_0x011d
        L_0x010b:
            float r2 = r0.f8670t
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x011d
            android.graphics.BlurMaskFilter r2 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r3 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r2.<init>(r1, r3)
            c4.a r3 = r0.f8657g
            r3.setMaskFilter(r2)
        L_0x011d:
            r0.f8670t = r1
        L_0x011f:
            e4.c r1 = r0.f8671u
            if (r1 == 0) goto L_0x0128
            c4.a r2 = r0.f8657g
            r1.b(r2)
        L_0x0128:
            r1 = r22
            float r1 = (float) r1
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            e4.g r3 = r0.f8662l
            java.lang.Object r3 = r3.f()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r1 = r1 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = (int) r1
            c4.a r2 = r0.f8657g
            android.graphics.PointF r3 = n4.f.f13512a
            r3 = 255(0xff, float:3.57E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            r2.setAlpha(r1)
            android.graphics.Path r1 = r0.f8656f
            c4.a r2 = r0.f8657g
            r3 = r20
            r3.drawPath(r1, r2)
            m9.b.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.h.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f8651a;
    }

    public final void h(k kVar, Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (obj == g0.f4804d) {
            this.f8662l.k(kVar);
        } else if (obj == g0.K) {
            p pVar = this.f8665o;
            if (pVar != null) {
                this.f8653c.q(pVar);
            }
            if (kVar == null) {
                this.f8665o = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.f8665o = pVar2;
            pVar2.a(this);
            this.f8653c.e(this.f8665o);
        } else if (obj == g0.L) {
            p pVar3 = this.f8666p;
            if (pVar3 != null) {
                this.f8653c.q(pVar3);
            }
            if (kVar == null) {
                this.f8666p = null;
                return;
            }
            this.f8654d.b();
            this.f8655e.b();
            p pVar4 = new p(kVar, null);
            this.f8666p = pVar4;
            pVar4.a(this);
            this.f8653c.e(this.f8666p);
        } else if (obj == g0.f4810j) {
            a<Float, Float> aVar = this.f8669s;
            if (aVar != null) {
                aVar.k(kVar);
                return;
            }
            p pVar5 = new p(kVar, null);
            this.f8669s = pVar5;
            pVar5.a(this);
            this.f8653c.e(this.f8669s);
        } else if (obj == g0.f4805e && (cVar5 = this.f8671u) != null) {
            cVar5.f9109b.k(kVar);
        } else if (obj == g0.G && (cVar4 = this.f8671u) != null) {
            cVar4.c(kVar);
        } else if (obj == g0.H && (cVar3 = this.f8671u) != null) {
            cVar3.f9111d.k(kVar);
        } else if (obj == g0.I && (cVar2 = this.f8671u) != null) {
            cVar2.f9112e.k(kVar);
        } else if (obj == g0.J && (cVar = this.f8671u) != null) {
            cVar.f9113f.k(kVar);
        }
    }

    public final void i(g4.e eVar, int i10, ArrayList arrayList, g4.e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final int j() {
        int i10;
        int round = Math.round(this.f8663m.f9097d * ((float) this.f8668r));
        int round2 = Math.round(this.f8664n.f9097d * ((float) this.f8668r));
        int round3 = Math.round(this.f8661k.f9097d * ((float) this.f8668r));
        if (round != 0) {
            i10 = round * 527;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
