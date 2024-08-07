package j4;

import a1.c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.d;
import e4.m;
import e4.n;
import e4.p;
import java.util.HashMap;
import java.util.List;
import v0.e;
import z.k;

/* compiled from: TextLayer */
public final class i extends b {
    public final StringBuilder C = new StringBuilder(2);
    public final RectF D = new RectF();
    public final Matrix E = new Matrix();
    public final a F = new a();
    public final b G = new b();
    public final HashMap H = new HashMap();
    public final e<String> I = new e<>();
    public final n J;
    public final c0 K;
    public final com.airbnb.lottie.i L;
    public e4.a<Integer, Integer> M;
    public p N;
    public e4.a<Integer, Integer> O;
    public p P;
    public d Q;
    public p R;
    public d S;
    public p T;
    public p U;
    public p V;

    /* compiled from: TextLayer */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public i(c0 c0Var, e eVar) {
        super(c0Var, eVar);
        h4.b bVar;
        h4.b bVar2;
        h4.a aVar;
        h4.a aVar2;
        this.K = c0Var;
        this.L = eVar.f11663b;
        n nVar = new n((List) eVar.f11678q.f10560b);
        this.J = nVar;
        nVar.a(this);
        e(nVar);
        c cVar = eVar.f11679r;
        if (!(cVar == null || (aVar2 = (h4.a) cVar.f24a) == null)) {
            e4.a<Integer, Integer> a10 = aVar2.a();
            this.M = a10;
            a10.a(this);
            e(this.M);
        }
        if (!(cVar == null || (aVar = (h4.a) cVar.f25b) == null)) {
            e4.a<Integer, Integer> a11 = aVar.a();
            this.O = a11;
            a11.a(this);
            e(this.O);
        }
        if (!(cVar == null || (bVar2 = (h4.b) cVar.f26c) == null)) {
            e4.a<Float, Float> a12 = bVar2.a();
            this.Q = (d) a12;
            a12.a(this);
            e(this.Q);
        }
        if (cVar != null && (bVar = (h4.b) cVar.f27d) != null) {
            e4.a<Float, Float> a13 = bVar.a();
            this.S = (d) a13;
            a13.a(this);
            e(this.S);
        }
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, (float) this.L.f4841j.width(), (float) this.L.f4841j.height());
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj == g0.f4801a) {
            p pVar = this.N;
            if (pVar != null) {
                q(pVar);
            }
            if (kVar == null) {
                this.N = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.N = pVar2;
            pVar2.a(this);
            e(this.N);
        } else if (obj == g0.f4802b) {
            p pVar3 = this.P;
            if (pVar3 != null) {
                q(pVar3);
            }
            if (kVar == null) {
                this.P = null;
                return;
            }
            p pVar4 = new p(kVar, null);
            this.P = pVar4;
            pVar4.a(this);
            e(this.P);
        } else if (obj == g0.f4819s) {
            p pVar5 = this.R;
            if (pVar5 != null) {
                q(pVar5);
            }
            if (kVar == null) {
                this.R = null;
                return;
            }
            p pVar6 = new p(kVar, null);
            this.R = pVar6;
            pVar6.a(this);
            e(this.R);
        } else if (obj == g0.f4820t) {
            p pVar7 = this.T;
            if (pVar7 != null) {
                q(pVar7);
            }
            if (kVar == null) {
                this.T = null;
                return;
            }
            p pVar8 = new p(kVar, null);
            this.T = pVar8;
            pVar8.a(this);
            e(this.T);
        } else if (obj == g0.F) {
            p pVar9 = this.U;
            if (pVar9 != null) {
                q(pVar9);
            }
            if (kVar == null) {
                this.U = null;
                return;
            }
            p pVar10 = new p(kVar, null);
            this.U = pVar10;
            pVar10.a(this);
            e(this.U);
        } else if (obj == g0.M) {
            p pVar11 = this.V;
            if (pVar11 != null) {
                q(pVar11);
            }
            if (kVar == null) {
                this.V = null;
                return;
            }
            p pVar12 = new p(kVar, null);
            this.V = pVar12;
            pVar12.a(this);
            e(this.V);
        } else if (obj == g0.O) {
            n nVar = this.J;
            nVar.getClass();
            nVar.k(new m(new o4.b(), kVar, new g4.b()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x03e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r20.save()
            com.airbnb.lottie.c0 r2 = r0.K
            com.airbnb.lottie.i r2 = r2.f4772a
            v0.i<g4.d> r2 = r2.f4838g
            int r2 = r2.f()
            if (r2 <= 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 != 0) goto L_0x001b
            r20.concat(r21)
        L_0x001b:
            e4.n r2 = r0.J
            java.lang.Object r2 = r2.f()
            g4.b r2 = (g4.b) r2
            com.airbnb.lottie.i r3 = r0.L
            java.util.Map<java.lang.String, g4.c> r3 = r3.f4836e
            java.lang.String r4 = r2.f10342b
            java.lang.Object r3 = r3.get(r4)
            g4.c r3 = (g4.c) r3
            if (r3 != 0) goto L_0x0035
            r20.restore()
            return
        L_0x0035:
            e4.p r4 = r0.N
            if (r4 == 0) goto L_0x0049
            j4.i$a r5 = r0.F
            java.lang.Object r4 = r4.f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0064
        L_0x0049:
            e4.a<java.lang.Integer, java.lang.Integer> r4 = r0.M
            if (r4 == 0) goto L_0x005d
            j4.i$a r5 = r0.F
            java.lang.Object r4 = r4.f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0064
        L_0x005d:
            j4.i$a r4 = r0.F
            int r5 = r2.f10348h
            r4.setColor(r5)
        L_0x0064:
            e4.p r4 = r0.P
            if (r4 == 0) goto L_0x0078
            j4.i$b r5 = r0.G
            java.lang.Object r4 = r4.f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0093
        L_0x0078:
            e4.a<java.lang.Integer, java.lang.Integer> r4 = r0.O
            if (r4 == 0) goto L_0x008c
            j4.i$b r5 = r0.G
            java.lang.Object r4 = r4.f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setColor(r4)
            goto L_0x0093
        L_0x008c:
            j4.i$b r4 = r0.G
            int r5 = r2.f10349i
            r4.setColor(r5)
        L_0x0093:
            e4.o r4 = r0.f11658w
            e4.a<java.lang.Integer, java.lang.Integer> r4 = r4.f9146j
            r5 = 100
            if (r4 != 0) goto L_0x009d
            r4 = r5
            goto L_0x00a7
        L_0x009d:
            java.lang.Object r4 = r4.f()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x00a7:
            int r4 = r4 * 255
            int r4 = r4 / r5
            j4.i$a r5 = r0.F
            r5.setAlpha(r4)
            j4.i$b r5 = r0.G
            r5.setAlpha(r4)
            e4.p r4 = r0.R
            if (r4 == 0) goto L_0x00c8
            j4.i$b r5 = r0.G
            java.lang.Object r4 = r4.f()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5.setStrokeWidth(r4)
            goto L_0x00ed
        L_0x00c8:
            e4.d r4 = r0.Q
            if (r4 == 0) goto L_0x00dc
            j4.i$b r5 = r0.G
            java.lang.Object r4 = r4.f()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5.setStrokeWidth(r4)
            goto L_0x00ed
        L_0x00dc:
            float r4 = n4.g.d(r21)
            j4.i$b r5 = r0.G
            float r6 = r2.f10350j
            float r7 = n4.g.c()
            float r7 = r7 * r6
            float r7 = r7 * r4
            r5.setStrokeWidth(r7)
        L_0x00ed:
            com.airbnb.lottie.c0 r4 = r0.K
            com.airbnb.lottie.i r4 = r4.f4772a
            v0.i<g4.d> r4 = r4.f4838g
            int r4 = r4.f()
            if (r4 <= 0) goto L_0x00fb
            r4 = 1
            goto L_0x00fc
        L_0x00fb:
            r4 = 0
        L_0x00fc:
            r5 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r6 = "\n"
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\r\n"
            r9 = 0
            if (r4 == 0) goto L_0x02c4
            e4.p r4 = r0.U
            if (r4 == 0) goto L_0x0116
            java.lang.Object r4 = r4.f()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0118
        L_0x0116:
            float r4 = r2.f10343c
        L_0x0118:
            float r4 = r4 / r5
            float r5 = n4.g.d(r21)
            java.lang.String r10 = r2.f10341a
            float r11 = r2.f10346f
            float r12 = n4.g.c()
            float r12 = r12 * r11
            java.lang.String r8 = r10.replaceAll(r8, r7)
            java.lang.String r6 = r8.replaceAll(r6, r7)
            java.lang.String[] r6 = r6.split(r7)
            java.util.List r6 = java.util.Arrays.asList(r6)
            int r7 = r6.size()
            r8 = 0
        L_0x013b:
            if (r8 >= r7) goto L_0x04fb
            java.lang.Object r10 = r6.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r13 = 0
        L_0x0145:
            int r14 = r10.length()
            if (r11 >= r14) goto L_0x0185
            char r14 = r10.charAt(r11)
            java.lang.String r15 = r3.f10352a
            r22 = r6
            java.lang.String r6 = r3.f10353b
            int r6 = g4.d.a(r14, r15, r6)
            com.airbnb.lottie.i r14 = r0.L
            v0.i<g4.d> r14 = r14.f4838g
            java.lang.Object r6 = r14.c(r6, r9)
            g4.d r6 = (g4.d) r6
            if (r6 != 0) goto L_0x0169
            r16 = r7
            r15 = r10
            goto L_0x017c
        L_0x0169:
            double r13 = (double) r13
            r15 = r10
            double r9 = r6.f10356c
            r16 = r7
            double r6 = (double) r4
            double r9 = r9 * r6
            float r6 = n4.g.c()
            double r6 = (double) r6
            double r9 = r9 * r6
            double r6 = (double) r5
            double r9 = r9 * r6
            double r9 = r9 + r13
            float r6 = (float) r9
            r13 = r6
        L_0x017c:
            int r11 = r11 + 1
            r9 = 0
            r6 = r22
            r10 = r15
            r7 = r16
            goto L_0x0145
        L_0x0185:
            r22 = r6
            r16 = r7
            r15 = r10
            r20.save()
            int r6 = r2.f10344d
            if (r6 == 0) goto L_0x02c2
            int r6 = r6 + -1
            r7 = 1
            if (r6 == r7) goto L_0x01a3
            r7 = 2
            if (r6 == r7) goto L_0x019a
            goto L_0x01a8
        L_0x019a:
            float r6 = -r13
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            r7 = 0
            r1.translate(r6, r7)
            goto L_0x01a8
        L_0x01a3:
            r6 = 0
            float r7 = -r13
            r1.translate(r7, r6)
        L_0x01a8:
            int r7 = r16 + -1
            float r6 = (float) r7
            float r6 = r6 * r12
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r7 = (float) r8
            float r7 = r7 * r12
            float r7 = r7 - r6
            r6 = 0
            r1.translate(r6, r7)
            r6 = 0
        L_0x01b7:
            int r7 = r15.length()
            if (r6 >= r7) goto L_0x02b4
            r10 = r15
            char r7 = r10.charAt(r6)
            java.lang.String r9 = r3.f10352a
            java.lang.String r11 = r3.f10353b
            int r7 = g4.d.a(r7, r9, r11)
            com.airbnb.lottie.i r9 = r0.L
            v0.i<g4.d> r9 = r9.f4838g
            r11 = 0
            java.lang.Object r7 = r9.c(r7, r11)
            g4.d r7 = (g4.d) r7
            if (r7 != 0) goto L_0x01dd
            r14 = r21
            r18 = r10
            goto L_0x02ae
        L_0x01dd:
            java.util.HashMap r9 = r0.H
            boolean r9 = r9.containsKey(r7)
            if (r9 == 0) goto L_0x01f0
            java.util.HashMap r9 = r0.H
            java.lang.Object r9 = r9.get(r7)
            java.util.List r9 = (java.util.List) r9
            r18 = r10
            goto L_0x0221
        L_0x01f0:
            java.util.List<i4.n> r9 = r7.f10354a
            int r11 = r9.size()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r11)
            r14 = 0
        L_0x01fc:
            if (r14 >= r11) goto L_0x0219
            java.lang.Object r15 = r9.get(r14)
            i4.n r15 = (i4.n) r15
            r17 = r9
            d4.d r9 = new d4.d
            r18 = r10
            com.airbnb.lottie.c0 r10 = r0.K
            r9.<init>(r10, r0, r15)
            r13.add(r9)
            int r14 = r14 + 1
            r9 = r17
            r10 = r18
            goto L_0x01fc
        L_0x0219:
            r18 = r10
            java.util.HashMap r9 = r0.H
            r9.put(r7, r13)
            r9 = r13
        L_0x0221:
            r10 = 0
        L_0x0222:
            int r11 = r9.size()
            if (r10 >= r11) goto L_0x0278
            java.lang.Object r11 = r9.get(r10)
            d4.d r11 = (d4.d) r11
            android.graphics.Path r11 = r11.g()
            android.graphics.RectF r13 = r0.D
            r14 = 0
            r11.computeBounds(r13, r14)
            android.graphics.Matrix r13 = r0.E
            r14 = r21
            r13.set(r14)
            android.graphics.Matrix r13 = r0.E
            float r15 = r2.f10347g
            float r15 = -r15
            float r17 = n4.g.c()
            float r15 = r15 * r17
            r17 = r9
            r9 = 0
            r13.preTranslate(r9, r15)
            android.graphics.Matrix r9 = r0.E
            r9.preScale(r4, r4)
            android.graphics.Matrix r9 = r0.E
            r11.transform(r9)
            boolean r9 = r2.f10351k
            if (r9 == 0) goto L_0x0269
            j4.i$a r9 = r0.F
            v(r11, r9, r1)
            j4.i$b r9 = r0.G
            v(r11, r9, r1)
            goto L_0x0273
        L_0x0269:
            j4.i$b r9 = r0.G
            v(r11, r9, r1)
            j4.i$a r9 = r0.F
            v(r11, r9, r1)
        L_0x0273:
            int r10 = r10 + 1
            r9 = r17
            goto L_0x0222
        L_0x0278:
            r14 = r21
            double r9 = r7.f10356c
            float r7 = (float) r9
            float r7 = r7 * r4
            float r9 = n4.g.c()
            float r9 = r9 * r7
            float r9 = r9 * r5
            int r7 = r2.f10345e
            float r7 = (float) r7
            r10 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 / r10
            e4.p r10 = r0.T
            if (r10 == 0) goto L_0x0299
            java.lang.Object r10 = r10.f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x02a7
        L_0x0299:
            e4.d r10 = r0.S
            if (r10 == 0) goto L_0x02a8
            java.lang.Object r10 = r10.f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
        L_0x02a7:
            float r7 = r7 + r10
        L_0x02a8:
            float r7 = r7 * r5
            float r7 = r7 + r9
            r9 = 0
            r1.translate(r7, r9)
        L_0x02ae:
            int r6 = r6 + 1
            r15 = r18
            goto L_0x01b7
        L_0x02b4:
            r14 = r21
            r20.restore()
            int r8 = r8 + 1
            r9 = 0
            r6 = r22
            r7 = r16
            goto L_0x013b
        L_0x02c2:
            r1 = 0
            throw r1
        L_0x02c4:
            e4.p r4 = r0.V
            if (r4 == 0) goto L_0x02d2
            java.lang.Object r4 = r4.f()
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            if (r4 == 0) goto L_0x02d2
            goto L_0x035e
        L_0x02d2:
            com.airbnb.lottie.c0 r4 = r0.K
            java.lang.String r9 = r3.f10352a
            java.lang.String r3 = r3.f10353b
            android.graphics.drawable.Drawable$Callback r10 = r4.getCallback()
            if (r10 != 0) goto L_0x02e0
            r4 = 0
            goto L_0x02f1
        L_0x02e0:
            f4.a r10 = r4.f4781q
            if (r10 != 0) goto L_0x02ef
            f4.a r10 = new f4.a
            android.graphics.drawable.Drawable$Callback r11 = r4.getCallback()
            r10.<init>(r11)
            r4.f4781q = r10
        L_0x02ef:
            f4.a r4 = r4.f4781q
        L_0x02f1:
            if (r4 == 0) goto L_0x0358
            vl.d r10 = r4.f9906a
            r10.f23362b = r9
            r10.f23363c = r3
            java.util.HashMap r11 = r4.f9907b
            java.lang.Object r10 = r11.get(r10)
            android.graphics.Typeface r10 = (android.graphics.Typeface) r10
            if (r10 == 0) goto L_0x0305
        L_0x0303:
            r4 = r10
            goto L_0x035a
        L_0x0305:
            java.util.HashMap r10 = r4.f9908c
            java.lang.Object r10 = r10.get(r9)
            android.graphics.Typeface r10 = (android.graphics.Typeface) r10
            if (r10 == 0) goto L_0x0310
            goto L_0x032a
        L_0x0310:
            java.lang.String r10 = "fonts/"
            java.lang.StringBuilder r10 = f0.b0.v(r10, r9)
            java.lang.String r11 = r4.f9910e
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.content.res.AssetManager r11 = r4.f9909d
            android.graphics.Typeface r10 = android.graphics.Typeface.createFromAsset(r11, r10)
            java.util.HashMap r11 = r4.f9908c
            r11.put(r9, r10)
        L_0x032a:
            java.lang.String r9 = "Italic"
            boolean r9 = r3.contains(r9)
            java.lang.String r11 = "Bold"
            boolean r3 = r3.contains(r11)
            if (r9 == 0) goto L_0x033c
            if (r3 == 0) goto L_0x033c
            r3 = 3
            goto L_0x0345
        L_0x033c:
            if (r9 == 0) goto L_0x0340
            r3 = 2
            goto L_0x0345
        L_0x0340:
            if (r3 == 0) goto L_0x0344
            r3 = 1
            goto L_0x0345
        L_0x0344:
            r3 = 0
        L_0x0345:
            int r9 = r10.getStyle()
            if (r9 != r3) goto L_0x034c
            goto L_0x0350
        L_0x034c:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r3)
        L_0x0350:
            java.util.HashMap r3 = r4.f9907b
            vl.d r4 = r4.f9906a
            r3.put(r4, r10)
            goto L_0x0303
        L_0x0358:
            r3 = 0
            r4 = r3
        L_0x035a:
            if (r4 == 0) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r4 = 0
        L_0x035e:
            if (r4 != 0) goto L_0x0362
            goto L_0x04fb
        L_0x0362:
            java.lang.String r3 = r2.f10341a
            com.airbnb.lottie.c0 r9 = r0.K
            r9.getClass()
            j4.i$a r9 = r0.F
            r9.setTypeface(r4)
            e4.p r4 = r0.U
            if (r4 == 0) goto L_0x037d
            java.lang.Object r4 = r4.f()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x037f
        L_0x037d:
            float r4 = r2.f10343c
        L_0x037f:
            j4.i$a r9 = r0.F
            float r10 = n4.g.c()
            float r10 = r10 * r4
            r9.setTextSize(r10)
            j4.i$b r9 = r0.G
            j4.i$a r10 = r0.F
            android.graphics.Typeface r10 = r10.getTypeface()
            r9.setTypeface(r10)
            j4.i$b r9 = r0.G
            j4.i$a r10 = r0.F
            float r10 = r10.getTextSize()
            r9.setTextSize(r10)
            float r9 = r2.f10346f
            float r10 = n4.g.c()
            float r10 = r10 * r9
            int r9 = r2.f10345e
            float r9 = (float) r9
            r11 = 1092616192(0x41200000, float:10.0)
            float r9 = r9 / r11
            e4.p r11 = r0.T
            if (r11 == 0) goto L_0x03bb
            java.lang.Object r11 = r11.f()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            goto L_0x03c9
        L_0x03bb:
            e4.d r11 = r0.S
            if (r11 == 0) goto L_0x03ca
            java.lang.Object r11 = r11.f()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
        L_0x03c9:
            float r9 = r9 + r11
        L_0x03ca:
            float r11 = n4.g.c()
            float r11 = r11 * r9
            float r11 = r11 * r4
            float r11 = r11 / r5
            java.lang.String r3 = r3.replaceAll(r8, r7)
            java.lang.String r3 = r3.replaceAll(r6, r7)
            java.lang.String[] r3 = r3.split(r7)
            java.util.List r3 = java.util.Arrays.asList(r3)
            int r4 = r3.size()
            r5 = 0
        L_0x03e6:
            if (r5 >= r4) goto L_0x04fb
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            j4.i$b r7 = r0.G
            float r7 = r7.measureText(r6)
            int r8 = r6.length()
            r9 = 1
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r11
            float r8 = r8 + r7
            r20.save()
            int r7 = r2.f10344d
            if (r7 == 0) goto L_0x04f9
            int r7 = r7 + -1
            if (r7 == r9) goto L_0x0415
            r9 = 2
            if (r7 == r9) goto L_0x040c
            goto L_0x041a
        L_0x040c:
            float r7 = -r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            r8 = 0
            r1.translate(r7, r8)
            goto L_0x041a
        L_0x0415:
            r7 = 0
            float r8 = -r8
            r1.translate(r8, r7)
        L_0x041a:
            int r7 = r4 + -1
            float r7 = (float) r7
            float r7 = r7 * r10
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            float r8 = (float) r5
            float r8 = r8 * r10
            float r8 = r8 - r7
            r7 = 0
            r1.translate(r7, r8)
            r7 = 0
        L_0x0429:
            int r8 = r6.length()
            if (r7 >= r8) goto L_0x04f2
            int r8 = r6.codePointAt(r7)
            int r9 = java.lang.Character.charCount(r8)
            int r9 = r9 + r7
        L_0x0438:
            int r12 = r6.length()
            if (r9 >= r12) goto L_0x0481
            int r12 = r6.codePointAt(r9)
            int r13 = java.lang.Character.getType(r12)
            r14 = 16
            if (r13 == r14) goto L_0x0474
            int r13 = java.lang.Character.getType(r12)
            r14 = 27
            if (r13 == r14) goto L_0x0474
            int r13 = java.lang.Character.getType(r12)
            r14 = 6
            if (r13 == r14) goto L_0x0474
            int r13 = java.lang.Character.getType(r12)
            r14 = 28
            if (r13 == r14) goto L_0x0474
            int r13 = java.lang.Character.getType(r12)
            r14 = 8
            if (r13 == r14) goto L_0x0474
            int r13 = java.lang.Character.getType(r12)
            r14 = 19
            if (r13 != r14) goto L_0x0472
            goto L_0x0474
        L_0x0472:
            r13 = 0
            goto L_0x0475
        L_0x0474:
            r13 = 1
        L_0x0475:
            if (r13 != 0) goto L_0x0478
            goto L_0x0481
        L_0x0478:
            int r13 = java.lang.Character.charCount(r12)
            int r9 = r9 + r13
            int r8 = r8 * 31
            int r8 = r8 + r12
            goto L_0x0438
        L_0x0481:
            v0.e<java.lang.String> r12 = r0.I
            long r13 = (long) r8
            boolean r8 = r12.f15982a
            if (r8 == 0) goto L_0x048b
            r12.e()
        L_0x048b:
            long[] r8 = r12.f15983b
            int r12 = r12.f15985d
            int r8 = j7.a.h(r8, r12, r13)
            if (r8 < 0) goto L_0x0497
            r8 = 1
            goto L_0x0498
        L_0x0497:
            r8 = 0
        L_0x0498:
            if (r8 == 0) goto L_0x04a4
            v0.e<java.lang.String> r8 = r0.I
            r9 = 0
            java.lang.Object r8 = r8.f(r9, r13)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x04c7
        L_0x04a4:
            java.lang.StringBuilder r8 = r0.C
            r12 = 0
            r8.setLength(r12)
            r8 = r7
        L_0x04ab:
            if (r8 >= r9) goto L_0x04bc
            int r12 = r6.codePointAt(r8)
            java.lang.StringBuilder r15 = r0.C
            r15.appendCodePoint(r12)
            int r12 = java.lang.Character.charCount(r12)
            int r8 = r8 + r12
            goto L_0x04ab
        L_0x04bc:
            java.lang.StringBuilder r8 = r0.C
            java.lang.String r8 = r8.toString()
            v0.e<java.lang.String> r9 = r0.I
            r9.j(r8, r13)
        L_0x04c7:
            int r9 = r8.length()
            int r7 = r7 + r9
            boolean r9 = r2.f10351k
            if (r9 == 0) goto L_0x04db
            j4.i$a r9 = r0.F
            u(r8, r9, r1)
            j4.i$b r9 = r0.G
            u(r8, r9, r1)
            goto L_0x04e5
        L_0x04db:
            j4.i$b r9 = r0.G
            u(r8, r9, r1)
            j4.i$a r9 = r0.F
            u(r8, r9, r1)
        L_0x04e5:
            j4.i$a r9 = r0.F
            float r8 = r9.measureText(r8)
            float r8 = r8 + r11
            r9 = 0
            r1.translate(r8, r9)
            goto L_0x0429
        L_0x04f2:
            r20.restore()
            int r5 = r5 + 1
            goto L_0x03e6
        L_0x04f9:
            r1 = 0
            throw r1
        L_0x04fb:
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.i.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
