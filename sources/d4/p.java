package d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.g0;
import e4.a;
import e4.d;
import e4.o;
import g4.e;
import h4.g;
import i4.j;
import j4.b;
import java.util.ArrayList;
import java.util.List;
import n4.f;
import z.k;

/* compiled from: RepeaterContent */
public final class p implements e, m, j, a.C0097a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f8712a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8713b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8714c;

    /* renamed from: d  reason: collision with root package name */
    public final b f8715d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8716e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8717f;

    /* renamed from: g  reason: collision with root package name */
    public final d f8718g;

    /* renamed from: h  reason: collision with root package name */
    public final d f8719h;

    /* renamed from: i  reason: collision with root package name */
    public final o f8720i;

    /* renamed from: j  reason: collision with root package name */
    public d f8721j;

    public p(c0 c0Var, b bVar, j jVar) {
        this.f8714c = c0Var;
        this.f8715d = bVar;
        this.f8716e = jVar.f11123a;
        this.f8717f = jVar.f11127e;
        a<Float, Float> a10 = jVar.f11124b.a();
        this.f8718g = (d) a10;
        bVar.e(a10);
        a10.a(this);
        a<Float, Float> a11 = jVar.f11125c.a();
        this.f8719h = (d) a11;
        bVar.e(a11);
        a11.a(this);
        g gVar = jVar.f11126d;
        gVar.getClass();
        o oVar = new o(gVar);
        this.f8720i = oVar;
        oVar.a(bVar);
        oVar.b(this);
    }

    public final void a() {
        this.f8714c.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        this.f8721j.b(list, list2);
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8721j.d(rectF, matrix, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.ListIterator<d4.c> r9) {
        /*
            r8 = this;
            d4.d r0 = r8.f8721j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r9.previous()
            d4.c r0 = (d4.c) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x002a:
            java.util.Collections.reverse(r6)
            d4.d r9 = new d4.d
            com.airbnb.lottie.c0 r2 = r8.f8714c
            j4.b r3 = r8.f8715d
            boolean r5 = r8.f8717f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f8721j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.p.e(java.util.ListIterator):void");
    }

    public final void f(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f8718g.f()).floatValue();
        float floatValue2 = ((Float) this.f8719h.f()).floatValue();
        float floatValue3 = this.f8720i.f9149m.f().floatValue() / 100.0f;
        float floatValue4 = this.f8720i.f9150n.f().floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                this.f8712a.set(matrix);
                float f10 = (float) i11;
                this.f8712a.preConcat(this.f8720i.e(f10 + floatValue2));
                PointF pointF = f.f13512a;
                this.f8721j.f(canvas, this.f8712a, (int) ((((floatValue4 - floatValue3) * (f10 / floatValue)) + floatValue3) * ((float) i10)));
            } else {
                return;
            }
        }
    }

    public final Path g() {
        Path g2 = this.f8721j.g();
        this.f8713b.reset();
        float floatValue = ((Float) this.f8718g.f()).floatValue();
        float floatValue2 = ((Float) this.f8719h.f()).floatValue();
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 < 0) {
                return this.f8713b;
            }
            this.f8712a.set(this.f8720i.e(((float) i10) + floatValue2));
            this.f8713b.addPath(g2, this.f8712a);
        }
    }

    public final String getName() {
        return this.f8716e;
    }

    public final void h(k kVar, Object obj) {
        if (!this.f8720i.c(kVar, obj)) {
            if (obj == g0.f4821u) {
                this.f8718g.k(kVar);
            } else if (obj == g0.f4822v) {
                this.f8719h.k(kVar);
            }
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        f.d(eVar, i10, arrayList, eVar2, this);
    }
}
