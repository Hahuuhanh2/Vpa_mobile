package j4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.viewpager2.widget.d;
import c7.j;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.j0;
import d4.c;
import d4.e;
import e4.a;
import e4.o;
import g4.f;
import h4.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v0.g;
import z.k;

/* compiled from: BaseLayer */
public abstract class b implements e, a.C0097a, f {
    public float A;
    public BlurMaskFilter B;

    /* renamed from: a  reason: collision with root package name */
    public final Path f11636a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f11637b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f11638c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public final c4.a f11639d;

    /* renamed from: e  reason: collision with root package name */
    public final c4.a f11640e;

    /* renamed from: f  reason: collision with root package name */
    public final c4.a f11641f;

    /* renamed from: g  reason: collision with root package name */
    public final c4.a f11642g;

    /* renamed from: h  reason: collision with root package name */
    public final c4.a f11643h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f11644i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f11645j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f11646k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f11647l;

    /* renamed from: m  reason: collision with root package name */
    public final RectF f11648m;

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f11649n;

    /* renamed from: o  reason: collision with root package name */
    public final c0 f11650o;

    /* renamed from: p  reason: collision with root package name */
    public final e f11651p;

    /* renamed from: q  reason: collision with root package name */
    public d f11652q;

    /* renamed from: r  reason: collision with root package name */
    public e4.d f11653r;

    /* renamed from: s  reason: collision with root package name */
    public b f11654s;

    /* renamed from: t  reason: collision with root package name */
    public b f11655t;

    /* renamed from: u  reason: collision with root package name */
    public List<b> f11656u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f11657v;

    /* renamed from: w  reason: collision with root package name */
    public final o f11658w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11659x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11660y;

    /* renamed from: z  reason: collision with root package name */
    public c4.a f11661z;

    public b(c0 c0Var, e eVar) {
        boolean z10 = true;
        this.f11639d = new c4.a(1);
        this.f11640e = new c4.a(PorterDuff.Mode.DST_IN, 0);
        this.f11641f = new c4.a(PorterDuff.Mode.DST_OUT, 0);
        c4.a aVar = new c4.a(1);
        this.f11642g = aVar;
        this.f11643h = new c4.a(PorterDuff.Mode.CLEAR);
        this.f11644i = new RectF();
        this.f11645j = new RectF();
        this.f11646k = new RectF();
        this.f11647l = new RectF();
        this.f11648m = new RectF();
        this.f11649n = new Matrix();
        this.f11657v = new ArrayList();
        this.f11659x = true;
        this.A = 0.0f;
        this.f11650o = c0Var;
        this.f11651p = eVar;
        android.support.v4.media.a.o(new StringBuilder(), eVar.f11664c, "#draw");
        if (eVar.f11682u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        g gVar = eVar.f11670i;
        gVar.getClass();
        o oVar = new o(gVar);
        this.f11658w = oVar;
        oVar.b(this);
        List<i4.f> list = eVar.f11669h;
        if (list != null && !list.isEmpty()) {
            d dVar = new d((List) eVar.f11669h);
            this.f11652q = dVar;
            for (a a10 : (List) dVar.f3628a) {
                a10.a(this);
            }
            for (a aVar2 : (List) this.f11652q.f3629b) {
                e(aVar2);
                aVar2.a(this);
            }
        }
        if (!this.f11651p.f11681t.isEmpty()) {
            e4.d dVar2 = new e4.d(this.f11651p.f11681t);
            this.f11653r = dVar2;
            dVar2.f9095b = true;
            dVar2.a(new a(this));
            z10 = ((Float) this.f11653r.f()).floatValue() != 1.0f ? false : z10;
            if (z10 != this.f11659x) {
                this.f11659x = z10;
                this.f11650o.invalidateSelf();
            }
            e(this.f11653r);
        } else if (true != this.f11659x) {
            this.f11659x = true;
            this.f11650o.invalidateSelf();
        }
    }

    public final void a() {
        this.f11650o.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
    }

    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f11644i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.f11649n.set(matrix);
        if (z10) {
            List<b> list = this.f11656u;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f11649n.preConcat(this.f11656u.get(size).f11658w.d());
                }
            } else {
                b bVar = this.f11655t;
                if (bVar != null) {
                    this.f11649n.preConcat(bVar.f11658w.d());
                }
            }
        }
        this.f11649n.preConcat(this.f11658w.d());
    }

    public final void e(a<?, ?> aVar) {
        if (aVar != null) {
            this.f11657v.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f11659x
            if (r3 == 0) goto L_0x046d
            j4.e r3 = r0.f11651p
            boolean r3 = r3.f11683v
            if (r3 == 0) goto L_0x0012
            goto L_0x046d
        L_0x0012:
            r16.j()
            android.graphics.Matrix r3 = r0.f11637b
            r3.reset()
            android.graphics.Matrix r3 = r0.f11637b
            r3.set(r2)
            java.util.List<j4.b> r3 = r0.f11656u
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
        L_0x0027:
            if (r3 < 0) goto L_0x003f
            android.graphics.Matrix r5 = r0.f11637b
            java.util.List<j4.b> r6 = r0.f11656u
            java.lang.Object r6 = r6.get(r3)
            j4.b r6 = (j4.b) r6
            e4.o r6 = r6.f11658w
            android.graphics.Matrix r6 = r6.d()
            r5.preConcat(r6)
            int r3 = r3 + -1
            goto L_0x0027
        L_0x003f:
            m9.b.v()
            e4.o r3 = r0.f11658w
            e4.a<java.lang.Integer, java.lang.Integer> r3 = r3.f9146j
            if (r3 != 0) goto L_0x004b
            r3 = 100
            goto L_0x0055
        L_0x004b:
            java.lang.Object r3 = r3.f()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L_0x0055:
            r5 = r19
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            float r3 = (float) r3
            float r5 = r5 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r3
            float r5 = r5 * r6
            int r3 = (int) r5
            j4.b r5 = r0.f11654s
            r6 = 0
            if (r5 == 0) goto L_0x0069
            r5 = r4
            goto L_0x006a
        L_0x0069:
            r5 = r6
        L_0x006a:
            if (r5 != 0) goto L_0x008c
            boolean r5 = r16.o()
            if (r5 != 0) goto L_0x008c
            android.graphics.Matrix r2 = r0.f11637b
            e4.o r4 = r0.f11658w
            android.graphics.Matrix r4 = r4.d()
            r2.preConcat(r4)
            android.graphics.Matrix r2 = r0.f11637b
            r0.l(r1, r2, r3)
            m9.b.v()
            m9.b.v()
            r16.p()
            return
        L_0x008c:
            android.graphics.RectF r5 = r0.f11644i
            android.graphics.Matrix r7 = r0.f11637b
            r0.d(r5, r7, r6)
            android.graphics.RectF r5 = r0.f11644i
            j4.b r7 = r0.f11654s
            if (r7 == 0) goto L_0x009b
            r7 = r4
            goto L_0x009c
        L_0x009b:
            r7 = r6
        L_0x009c:
            r8 = 3
            r9 = 0
            if (r7 != 0) goto L_0x00a1
            goto L_0x00bf
        L_0x00a1:
            j4.e r7 = r0.f11651p
            int r7 = r7.f11682u
            if (r7 != r8) goto L_0x00a8
            goto L_0x00bf
        L_0x00a8:
            android.graphics.RectF r7 = r0.f11647l
            r7.set(r9, r9, r9, r9)
            j4.b r7 = r0.f11654s
            android.graphics.RectF r10 = r0.f11647l
            r7.d(r10, r2, r4)
            android.graphics.RectF r7 = r0.f11647l
            boolean r7 = r5.intersect(r7)
            if (r7 != 0) goto L_0x00bf
            r5.set(r9, r9, r9, r9)
        L_0x00bf:
            android.graphics.Matrix r5 = r0.f11637b
            e4.o r7 = r0.f11658w
            android.graphics.Matrix r7 = r7.d()
            r5.preConcat(r7)
            android.graphics.RectF r5 = r0.f11644i
            android.graphics.Matrix r7 = r0.f11637b
            android.graphics.RectF r10 = r0.f11646k
            r10.set(r9, r9, r9, r9)
            boolean r10 = r16.o()
            r11 = 2
            if (r10 != 0) goto L_0x00dc
            goto L_0x017e
        L_0x00dc:
            androidx.viewpager2.widget.d r10 = r0.f11652q
            java.lang.Object r10 = r10.f3630c
            java.util.List r10 = (java.util.List) r10
            int r10 = r10.size()
            r12 = r6
        L_0x00e7:
            if (r12 >= r10) goto L_0x0173
            androidx.viewpager2.widget.d r13 = r0.f11652q
            java.lang.Object r13 = r13.f3630c
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r13.get(r12)
            i4.f r13 = (i4.f) r13
            androidx.viewpager2.widget.d r14 = r0.f11652q
            java.lang.Object r14 = r14.f3628a
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r14.get(r12)
            e4.a r14 = (e4.a) r14
            java.lang.Object r14 = r14.f()
            android.graphics.Path r14 = (android.graphics.Path) r14
            if (r14 != 0) goto L_0x010a
            goto L_0x016c
        L_0x010a:
            android.graphics.Path r15 = r0.f11636a
            r15.set(r14)
            android.graphics.Path r14 = r0.f11636a
            r14.transform(r7)
            int r14 = r13.f11101a
            int r14 = v.v.g(r14)
            if (r14 == 0) goto L_0x0123
            if (r14 == r4) goto L_0x017e
            if (r14 == r11) goto L_0x0123
            if (r14 == r8) goto L_0x017e
            goto L_0x0128
        L_0x0123:
            boolean r13 = r13.f11104d
            if (r13 == 0) goto L_0x0128
            goto L_0x017e
        L_0x0128:
            android.graphics.Path r13 = r0.f11636a
            android.graphics.RectF r14 = r0.f11648m
            r13.computeBounds(r14, r6)
            if (r12 != 0) goto L_0x0139
            android.graphics.RectF r13 = r0.f11646k
            android.graphics.RectF r14 = r0.f11648m
            r13.set(r14)
            goto L_0x016c
        L_0x0139:
            android.graphics.RectF r13 = r0.f11646k
            float r14 = r13.left
            android.graphics.RectF r15 = r0.f11648m
            float r15 = r15.left
            float r14 = java.lang.Math.min(r14, r15)
            android.graphics.RectF r15 = r0.f11646k
            float r15 = r15.top
            android.graphics.RectF r6 = r0.f11648m
            float r6 = r6.top
            float r6 = java.lang.Math.min(r15, r6)
            android.graphics.RectF r15 = r0.f11646k
            float r15 = r15.right
            android.graphics.RectF r8 = r0.f11648m
            float r8 = r8.right
            float r8 = java.lang.Math.max(r15, r8)
            android.graphics.RectF r15 = r0.f11646k
            float r15 = r15.bottom
            android.graphics.RectF r11 = r0.f11648m
            float r11 = r11.bottom
            float r11 = java.lang.Math.max(r15, r11)
            r13.set(r14, r6, r8, r11)
        L_0x016c:
            int r12 = r12 + 1
            r6 = 0
            r8 = 3
            r11 = 2
            goto L_0x00e7
        L_0x0173:
            android.graphics.RectF r6 = r0.f11646k
            boolean r6 = r5.intersect(r6)
            if (r6 != 0) goto L_0x017e
            r5.set(r9, r9, r9, r9)
        L_0x017e:
            android.graphics.RectF r5 = r0.f11645j
            int r6 = r17.getWidth()
            float r6 = (float) r6
            int r7 = r17.getHeight()
            float r7 = (float) r7
            r5.set(r9, r9, r6, r7)
            android.graphics.Matrix r5 = r0.f11638c
            r1.getMatrix(r5)
            android.graphics.Matrix r5 = r0.f11638c
            boolean r5 = r5.isIdentity()
            if (r5 != 0) goto L_0x01a6
            android.graphics.Matrix r5 = r0.f11638c
            r5.invert(r5)
            android.graphics.Matrix r5 = r0.f11638c
            android.graphics.RectF r6 = r0.f11645j
            r5.mapRect(r6)
        L_0x01a6:
            android.graphics.RectF r5 = r0.f11644i
            android.graphics.RectF r6 = r0.f11645j
            boolean r5 = r5.intersect(r6)
            if (r5 != 0) goto L_0x01b5
            android.graphics.RectF r5 = r0.f11644i
            r5.set(r9, r9, r9, r9)
        L_0x01b5:
            m9.b.v()
            android.graphics.RectF r5 = r0.f11644i
            float r5 = r5.width()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x042d
            android.graphics.RectF r5 = r0.f11644i
            float r5 = r5.height()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x042d
            c4.a r5 = r0.f11639d
            r6 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r6)
            android.graphics.RectF r5 = r0.f11644i
            c4.a r7 = r0.f11639d
            n4.g$a r8 = n4.g.f13513a
            r1.saveLayer(r5, r7)
            m9.b.v()
            m9.b.v()
            r16.k(r17)
            android.graphics.Matrix r5 = r0.f11637b
            r0.l(r1, r5, r3)
            m9.b.v()
            boolean r5 = r16.o()
            if (r5 == 0) goto L_0x0401
            android.graphics.Matrix r5 = r0.f11637b
            android.graphics.RectF r7 = r0.f11644i
            c4.a r8 = r0.f11640e
            r1.saveLayer(r7, r8)
            m9.b.v()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 >= r8) goto L_0x020a
            r16.k(r17)
        L_0x020a:
            m9.b.v()
            r7 = 0
        L_0x020e:
            androidx.viewpager2.widget.d r8 = r0.f11652q
            java.lang.Object r8 = r8.f3630c
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x03fb
            androidx.viewpager2.widget.d r8 = r0.f11652q
            java.lang.Object r8 = r8.f3630c
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r7)
            i4.f r8 = (i4.f) r8
            androidx.viewpager2.widget.d r9 = r0.f11652q
            java.lang.Object r9 = r9.f3628a
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r9.get(r7)
            e4.a r9 = (e4.a) r9
            androidx.viewpager2.widget.d r10 = r0.f11652q
            java.lang.Object r10 = r10.f3629b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r10.get(r7)
            e4.a r10 = (e4.a) r10
            int r11 = r8.f11101a
            int r11 = v.v.g(r11)
            r12 = 1076048691(0x40233333, float:2.55)
            if (r11 == 0) goto L_0x0388
            if (r11 == r4) goto L_0x0314
            r13 = 2
            if (r11 == r13) goto L_0x0294
            r14 = 3
            if (r11 == r14) goto L_0x0253
            goto L_0x03f7
        L_0x0253:
            androidx.viewpager2.widget.d r8 = r0.f11652q
            java.lang.Object r8 = r8.f3628a
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0260
            goto L_0x027e
        L_0x0260:
            r8 = 0
        L_0x0261:
            androidx.viewpager2.widget.d r9 = r0.f11652q
            java.lang.Object r9 = r9.f3630c
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0283
            androidx.viewpager2.widget.d r9 = r0.f11652q
            java.lang.Object r9 = r9.f3630c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r9.get(r8)
            i4.f r9 = (i4.f) r9
            int r9 = r9.f11101a
            r10 = 4
            if (r9 == r10) goto L_0x0280
        L_0x027e:
            r8 = 0
            goto L_0x0284
        L_0x0280:
            int r8 = r8 + 1
            goto L_0x0261
        L_0x0283:
            r8 = r4
        L_0x0284:
            if (r8 == 0) goto L_0x03f7
            c4.a r8 = r0.f11639d
            r8.setAlpha(r6)
            android.graphics.RectF r8 = r0.f11644i
            c4.a r9 = r0.f11639d
            r1.drawRect(r8, r9)
            goto L_0x03f7
        L_0x0294:
            r14 = 3
            boolean r8 = r8.f11104d
            if (r8 == 0) goto L_0x02da
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11640e
            n4.g$a r15 = n4.g.f13513a
            r1.saveLayer(r8, r11)
            m9.b.v()
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11639d
            r1.drawRect(r8, r11)
            c4.a r8 = r0.f11641f
            java.lang.Object r10 = r10.f()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r12
            int r10 = (int) r10
            r8.setAlpha(r10)
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11641f
            r1.drawPath(r8, r9)
            r17.restore()
            goto L_0x03f7
        L_0x02da:
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11640e
            n4.g$a r15 = n4.g.f13513a
            r1.saveLayer(r8, r11)
            m9.b.v()
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            c4.a r8 = r0.f11639d
            java.lang.Object r9 = r10.f()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r12
            int r9 = (int) r9
            r8.setAlpha(r9)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11639d
            r1.drawPath(r8, r9)
            r17.restore()
            goto L_0x03f7
        L_0x0314:
            r13 = 2
            r14 = 3
            if (r7 != 0) goto L_0x032b
            c4.a r11 = r0.f11639d
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11.setColor(r15)
            c4.a r11 = r0.f11639d
            r11.setAlpha(r6)
            android.graphics.RectF r11 = r0.f11644i
            c4.a r15 = r0.f11639d
            r1.drawRect(r11, r15)
        L_0x032b:
            boolean r8 = r8.f11104d
            if (r8 == 0) goto L_0x0370
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11641f
            n4.g$a r15 = n4.g.f13513a
            r1.saveLayer(r8, r11)
            m9.b.v()
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11639d
            r1.drawRect(r8, r11)
            c4.a r8 = r0.f11641f
            java.lang.Object r10 = r10.f()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r12
            int r10 = (int) r10
            r8.setAlpha(r10)
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11641f
            r1.drawPath(r8, r9)
            r17.restore()
            goto L_0x03f7
        L_0x0370:
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11641f
            r1.drawPath(r8, r9)
            goto L_0x03f7
        L_0x0388:
            r13 = 2
            r14 = 3
            boolean r8 = r8.f11104d
            if (r8 == 0) goto L_0x03ce
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11639d
            n4.g$a r15 = n4.g.f13513a
            r1.saveLayer(r8, r11)
            m9.b.v()
            android.graphics.RectF r8 = r0.f11644i
            c4.a r11 = r0.f11639d
            r1.drawRect(r8, r11)
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            c4.a r8 = r0.f11639d
            java.lang.Object r9 = r10.f()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r12
            int r9 = (int) r9
            r8.setAlpha(r9)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11641f
            r1.drawPath(r8, r9)
            r17.restore()
            goto L_0x03f7
        L_0x03ce:
            java.lang.Object r8 = r9.f()
            android.graphics.Path r8 = (android.graphics.Path) r8
            android.graphics.Path r9 = r0.f11636a
            r9.set(r8)
            android.graphics.Path r8 = r0.f11636a
            r8.transform(r5)
            c4.a r8 = r0.f11639d
            java.lang.Object r9 = r10.f()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r12
            int r9 = (int) r9
            r8.setAlpha(r9)
            android.graphics.Path r8 = r0.f11636a
            c4.a r9 = r0.f11639d
            r1.drawPath(r8, r9)
        L_0x03f7:
            int r7 = r7 + 1
            goto L_0x020e
        L_0x03fb:
            r17.restore()
            m9.b.v()
        L_0x0401:
            j4.b r5 = r0.f11654s
            if (r5 == 0) goto L_0x0406
            goto L_0x0407
        L_0x0406:
            r4 = 0
        L_0x0407:
            if (r4 == 0) goto L_0x0427
            android.graphics.RectF r4 = r0.f11644i
            c4.a r5 = r0.f11642g
            r1.saveLayer(r4, r5)
            m9.b.v()
            m9.b.v()
            r16.k(r17)
            j4.b r4 = r0.f11654s
            r4.f(r1, r2, r3)
            r17.restore()
            m9.b.v()
            m9.b.v()
        L_0x0427:
            r17.restore()
            m9.b.v()
        L_0x042d:
            boolean r2 = r0.f11660y
            if (r2 == 0) goto L_0x0466
            c4.a r2 = r0.f11661z
            if (r2 == 0) goto L_0x0466
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            c4.a r2 = r0.f11661z
            r3 = -251901(0xfffffffffffc2803, float:NaN)
            r2.setColor(r3)
            c4.a r2 = r0.f11661z
            r3 = 1082130432(0x40800000, float:4.0)
            r2.setStrokeWidth(r3)
            android.graphics.RectF r2 = r0.f11644i
            c4.a r3 = r0.f11661z
            r1.drawRect(r2, r3)
            c4.a r2 = r0.f11661z
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            c4.a r2 = r0.f11661z
            r3 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r2.setColor(r3)
            android.graphics.RectF r2 = r0.f11644i
            c4.a r3 = r0.f11661z
            r1.drawRect(r2, r3)
        L_0x0466:
            m9.b.v()
            r16.p()
            return
        L_0x046d:
            m9.b.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f11651p.f11664c;
    }

    public void h(k kVar, Object obj) {
        this.f11658w.c(kVar, obj);
    }

    public final void i(g4.e eVar, int i10, ArrayList arrayList, g4.e eVar2) {
        b bVar = this.f11654s;
        if (bVar != null) {
            String str = bVar.f11651p.f11664c;
            eVar2.getClass();
            g4.e eVar3 = new g4.e(eVar2);
            eVar3.f10360a.add(str);
            if (eVar.a(i10, this.f11654s.f11651p.f11664c)) {
                b bVar2 = this.f11654s;
                g4.e eVar4 = new g4.e(eVar3);
                eVar4.f10361b = bVar2;
                arrayList.add(eVar4);
            }
            if (eVar.d(i10, this.f11651p.f11664c)) {
                this.f11654s.r(eVar, eVar.b(i10, this.f11654s.f11651p.f11664c) + i10, arrayList, eVar3);
            }
        }
        if (eVar.c(i10, this.f11651p.f11664c)) {
            if (!"__container".equals(this.f11651p.f11664c)) {
                String str2 = this.f11651p.f11664c;
                eVar2.getClass();
                g4.e eVar5 = new g4.e(eVar2);
                eVar5.f10360a.add(str2);
                if (eVar.a(i10, this.f11651p.f11664c)) {
                    g4.e eVar6 = new g4.e(eVar5);
                    eVar6.f10361b = this;
                    arrayList.add(eVar6);
                }
                eVar2 = eVar5;
            }
            if (eVar.d(i10, this.f11651p.f11664c)) {
                r(eVar, eVar.b(i10, this.f11651p.f11664c) + i10, arrayList, eVar2);
            }
        }
    }

    public final void j() {
        if (this.f11656u == null) {
            if (this.f11655t == null) {
                this.f11656u = Collections.emptyList();
                return;
            }
            this.f11656u = new ArrayList();
            for (b bVar = this.f11655t; bVar != null; bVar = bVar.f11655t) {
                this.f11656u.add(bVar);
            }
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.f11644i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11643h);
        m9.b.v();
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i10);

    public lc.b m() {
        return this.f11651p.f11684w;
    }

    public j n() {
        return this.f11651p.f11685x;
    }

    public final boolean o() {
        d dVar = this.f11652q;
        if (dVar == null || ((List) dVar.f3628a).isEmpty()) {
            return false;
        }
        return true;
    }

    public final void p() {
        j0 j0Var = this.f11650o.f4772a.f4832a;
        String str = this.f11651p.f11664c;
        if (j0Var.f4856a) {
            n4.e eVar = (n4.e) j0Var.f4858c.get(str);
            if (eVar == null) {
                eVar = new n4.e();
                j0Var.f4858c.put(str, eVar);
            }
            int i10 = eVar.f13511a + 1;
            eVar.f13511a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f13511a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = j0Var.f4857b.iterator();
                while (true) {
                    g.a aVar = (g.a) it;
                    if (aVar.hasNext()) {
                        ((j0.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void q(a<?, ?> aVar) {
        this.f11657v.remove(aVar);
    }

    public void r(g4.e eVar, int i10, ArrayList arrayList, g4.e eVar2) {
    }

    public void s(boolean z10) {
        if (z10 && this.f11661z == null) {
            this.f11661z = new c4.a();
        }
        this.f11660y = z10;
    }

    public void t(float f10) {
        o oVar = this.f11658w;
        a<Integer, Integer> aVar = oVar.f9146j;
        if (aVar != null) {
            aVar.j(f10);
        }
        a<?, Float> aVar2 = oVar.f9149m;
        if (aVar2 != null) {
            aVar2.j(f10);
        }
        a<?, Float> aVar3 = oVar.f9150n;
        if (aVar3 != null) {
            aVar3.j(f10);
        }
        a<PointF, PointF> aVar4 = oVar.f9142f;
        if (aVar4 != null) {
            aVar4.j(f10);
        }
        a<?, PointF> aVar5 = oVar.f9143g;
        if (aVar5 != null) {
            aVar5.j(f10);
        }
        a<o4.c, o4.c> aVar6 = oVar.f9144h;
        if (aVar6 != null) {
            aVar6.j(f10);
        }
        a<Float, Float> aVar7 = oVar.f9145i;
        if (aVar7 != null) {
            aVar7.j(f10);
        }
        e4.d dVar = oVar.f9147k;
        if (dVar != null) {
            dVar.j(f10);
        }
        e4.d dVar2 = oVar.f9148l;
        if (dVar2 != null) {
            dVar2.j(f10);
        }
        if (this.f11652q != null) {
            for (int i10 = 0; i10 < ((List) this.f11652q.f3628a).size(); i10++) {
                ((a) ((List) this.f11652q.f3628a).get(i10)).j(f10);
            }
        }
        e4.d dVar3 = this.f11653r;
        if (dVar3 != null) {
            dVar3.j(f10);
        }
        b bVar = this.f11654s;
        if (bVar != null) {
            bVar.t(f10);
        }
        for (int i11 = 0; i11 < this.f11657v.size(); i11++) {
            ((a) this.f11657v.get(i11)).j(f10);
        }
    }
}
