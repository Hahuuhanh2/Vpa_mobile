package d4;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.g0;
import e4.g;
import e4.p;
import v0.e;
import z.k;

/* compiled from: GradientStrokeContent */
public final class i extends a {
    public final g A;
    public p B;

    /* renamed from: r  reason: collision with root package name */
    public final String f8672r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8673s;

    /* renamed from: t  reason: collision with root package name */
    public final e<LinearGradient> f8674t;

    /* renamed from: u  reason: collision with root package name */
    public final e<RadialGradient> f8675u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f8676v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8677w;

    /* renamed from: x  reason: collision with root package name */
    public final int f8678x;

    /* renamed from: y  reason: collision with root package name */
    public final g f8679y;

    /* renamed from: z  reason: collision with root package name */
    public final g f8680z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(com.airbnb.lottie.c0 r14, j4.b r15, i4.e r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f11095h
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            int r0 = r0 + -1
            r2 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r2) goto L_0x0013
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0018
        L_0x0013:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x0018
        L_0x0016:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L_0x0018:
            r3 = r0
            int r0 = r12.f11096i
            if (r0 == 0) goto L_0x00a3
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x002e
            if (r0 == r2) goto L_0x002b
            r2 = 2
            if (r0 == r2) goto L_0x0028
            r4 = r1
            goto L_0x0031
        L_0x0028:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L_0x0030
        L_0x002b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0030
        L_0x002e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L_0x0030:
            r4 = r0
        L_0x0031:
            float r5 = r12.f11097j
            h4.d r6 = r12.f11091d
            h4.b r7 = r12.f11094g
            java.util.List<h4.b> r8 = r12.f11098k
            h4.b r9 = r12.f11099l
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            v0.e r0 = new v0.e
            r0.<init>()
            r10.f8674t = r0
            v0.e r0 = new v0.e
            r0.<init>()
            r10.f8675u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f8676v = r0
            java.lang.String r0 = r12.f11088a
            r10.f8672r = r0
            int r0 = r12.f11089b
            r10.f8677w = r0
            boolean r0 = r12.f11100m
            r10.f8673s = r0
            r0 = r14
            com.airbnb.lottie.i r0 = r0.f4772a
            float r0 = r0.b()
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.f8678x = r0
            h4.c r0 = r12.f11090c
            e4.a r0 = r0.a()
            r1 = r0
            e4.g r1 = (e4.g) r1
            r10.f8679y = r1
            r0.a(r13)
            r15.e(r0)
            h4.c r0 = r12.f11092e
            e4.a r0 = r0.a()
            r1 = r0
            e4.g r1 = (e4.g) r1
            r10.f8680z = r1
            r0.a(r13)
            r15.e(r0)
            h4.c r0 = r12.f11093f
            e4.a r0 = r0.a()
            r1 = r0
            e4.g r1 = (e4.g) r1
            r10.A = r1
            r0.a(r13)
            r15.e(r0)
            return
        L_0x00a3:
            throw r1
        L_0x00a4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.i.<init>(com.airbnb.lottie.c0, j4.b, i4.e):void");
    }

    public final int[] e(int[] iArr) {
        p pVar = this.B;
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

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f8673s
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f8676v
            r3 = 0
            r0.d(r2, r1, r3)
            int r2 = r0.f8677w
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x005c
            int r2 = r16.j()
            v0.e<android.graphics.LinearGradient> r3 = r0.f8674t
            long r5 = (long) r2
            java.lang.Object r2 = r3.f(r4, r5)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0026
            goto L_0x00aa
        L_0x0026:
            e4.g r2 = r0.f8680z
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            e4.g r3 = r0.A
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            e4.g r4 = r0.f8679y
            java.lang.Object r4 = r4.f()
            i4.c r4 = (i4.c) r4
            int[] r7 = r4.f11079b
            int[] r13 = r0.e(r7)
            float[] r14 = r4.f11078a
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            v0.e<android.graphics.LinearGradient> r3 = r0.f8674t
            r3.j(r2, r5)
            goto L_0x00aa
        L_0x005c:
            int r2 = r16.j()
            v0.e<android.graphics.RadialGradient> r3 = r0.f8675u
            long r5 = (long) r2
            java.lang.Object r2 = r3.f(r4, r5)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006c
            goto L_0x00aa
        L_0x006c:
            e4.g r2 = r0.f8680z
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            e4.g r3 = r0.A
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            e4.g r4 = r0.f8679y
            java.lang.Object r4 = r4.f()
            i4.c r4 = (i4.c) r4
            int[] r7 = r4.f11079b
            int[] r12 = r0.e(r7)
            float[] r13 = r4.f11078a
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            v0.e<android.graphics.RadialGradient> r3 = r0.f8675u
            r3.j(r2, r5)
        L_0x00aa:
            r2.setLocalMatrix(r1)
            c4.a r3 = r0.f8607i
            r3.setShader(r2)
            super.f(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.i.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f8672r;
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj == g0.L) {
            p pVar = this.B;
            if (pVar != null) {
                this.f8604f.q(pVar);
            }
            if (kVar == null) {
                this.B = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.B = pVar2;
            pVar2.a(this);
            this.f8604f.e(this.B);
        }
    }

    public final int j() {
        int i10;
        int round = Math.round(this.f8680z.f9097d * ((float) this.f8678x));
        int round2 = Math.round(this.A.f9097d * ((float) this.f8678x));
        int round3 = Math.round(this.f8679y.f9097d * ((float) this.f8678x));
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
