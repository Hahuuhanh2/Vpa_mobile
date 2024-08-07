package d4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.g0;
import e4.a;
import e4.p;
import j4.b;
import z.k;

/* compiled from: StrokeContent */
public final class t extends a {

    /* renamed from: r  reason: collision with root package name */
    public final b f8731r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8732s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8733t;

    /* renamed from: u  reason: collision with root package name */
    public final a<Integer, Integer> f8734u;

    /* renamed from: v  reason: collision with root package name */
    public p f8735v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(com.airbnb.lottie.c0 r14, j4.b r15, i4.p r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f11151g
            r1 = 0
            if (r0 == 0) goto L_0x005b
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
            int r0 = r12.f11152h
            if (r0 == 0) goto L_0x005a
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
            float r5 = r12.f11153i
            h4.d r6 = r12.f11149e
            h4.b r7 = r12.f11150f
            java.util.List<h4.b> r8 = r12.f11147c
            h4.b r9 = r12.f11146b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f8731r = r11
            java.lang.String r0 = r12.f11145a
            r10.f8732s = r0
            boolean r0 = r12.f11154j
            r10.f8733t = r0
            h4.a r0 = r12.f11148d
            e4.a r0 = r0.a()
            r10.f8734u = r0
            r0.a(r13)
            r15.e(r0)
            return
        L_0x005a:
            throw r1
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.t.<init>(com.airbnb.lottie.c0, j4.b, i4.p):void");
    }

    public final void f(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f8733t) {
            c4.a aVar = this.f8607i;
            e4.b bVar = (e4.b) this.f8734u;
            aVar.setColor(bVar.l(bVar.b(), bVar.d()));
            p pVar = this.f8735v;
            if (pVar != null) {
                this.f8607i.setColorFilter((ColorFilter) pVar.f());
            }
            super.f(canvas, matrix, i10);
        }
    }

    public final String getName() {
        return this.f8732s;
    }

    public final void h(k kVar, Object obj) {
        super.h(kVar, obj);
        if (obj == g0.f4802b) {
            this.f8734u.k(kVar);
        } else if (obj == g0.K) {
            p pVar = this.f8735v;
            if (pVar != null) {
                this.f8731r.q(pVar);
            }
            if (kVar == null) {
                this.f8735v = null;
                return;
            }
            p pVar2 = new p(kVar, null);
            this.f8735v = pVar2;
            pVar2.a(this);
            this.f8731r.e(this.f8734u);
        }
    }
}
