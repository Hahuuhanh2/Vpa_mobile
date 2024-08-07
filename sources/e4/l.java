package e4;

import android.graphics.PointF;
import e4.a;
import java.util.Collections;
import o4.a;
import z.k;

/* compiled from: SplitDimensionPathKeyframeAnimation */
public final class l extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f9128i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final PointF f9129j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f9130k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Float, Float> f9131l;

    /* renamed from: m  reason: collision with root package name */
    public k f9132m;

    /* renamed from: n  reason: collision with root package name */
    public k f9133n;

    public l(d dVar, d dVar2) {
        super(Collections.emptyList());
        this.f9130k = dVar;
        this.f9131l = dVar2;
        j(this.f9097d);
    }

    public final Object f() {
        return l(0.0f);
    }

    public final /* bridge */ /* synthetic */ Object g(a aVar, float f10) {
        return l(f10);
    }

    public final void j(float f10) {
        this.f9130k.j(f10);
        this.f9131l.j(f10);
        this.f9128i.set(this.f9130k.f().floatValue(), this.f9131l.f().floatValue());
        for (int i10 = 0; i10 < this.f9094a.size(); i10++) {
            ((a.C0097a) this.f9094a.get(i10)).a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Float} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF l(float r12) {
        /*
            r11 = this;
            z.k r0 = r11.f9132m
            r1 = 0
            if (r0 == 0) goto L_0x0035
            e4.a<java.lang.Float, java.lang.Float> r0 = r11.f9130k
            o4.a r0 = r0.b()
            if (r0 == 0) goto L_0x0035
            e4.a<java.lang.Float, java.lang.Float> r2 = r11.f9130k
            float r10 = r2.d()
            java.lang.Float r2 = r0.f13710h
            z.k r3 = r11.f9132m
            float r4 = r0.f13709g
            if (r2 != 0) goto L_0x001d
            r5 = r4
            goto L_0x0022
        L_0x001d:
            float r2 = r2.floatValue()
            r5 = r2
        L_0x0022:
            T r2 = r0.f13704b
            r6 = r2
            java.lang.Float r6 = (java.lang.Float) r6
            T r0 = r0.f13705c
            r7 = r0
            java.lang.Float r7 = (java.lang.Float) r7
            r8 = r12
            r9 = r12
            java.lang.Object r0 = r3.c(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            z.k r2 = r11.f9133n
            if (r2 == 0) goto L_0x006a
            e4.a<java.lang.Float, java.lang.Float> r2 = r11.f9131l
            o4.a r2 = r2.b()
            if (r2 == 0) goto L_0x006a
            e4.a<java.lang.Float, java.lang.Float> r1 = r11.f9131l
            float r10 = r1.d()
            java.lang.Float r1 = r2.f13710h
            z.k r3 = r11.f9133n
            float r4 = r2.f13709g
            if (r1 != 0) goto L_0x0052
            r5 = r4
            goto L_0x0057
        L_0x0052:
            float r1 = r1.floatValue()
            r5 = r1
        L_0x0057:
            T r1 = r2.f13704b
            r6 = r1
            java.lang.Float r6 = (java.lang.Float) r6
            T r1 = r2.f13705c
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            r8 = r12
            r9 = r12
            java.lang.Object r12 = r3.c(r4, r5, r6, r7, r8, r9, r10)
            r1 = r12
            java.lang.Float r1 = (java.lang.Float) r1
        L_0x006a:
            r12 = 0
            if (r0 != 0) goto L_0x0077
            android.graphics.PointF r0 = r11.f9129j
            android.graphics.PointF r2 = r11.f9128i
            float r2 = r2.x
            r0.set(r2, r12)
            goto L_0x0080
        L_0x0077:
            android.graphics.PointF r2 = r11.f9129j
            float r0 = r0.floatValue()
            r2.set(r0, r12)
        L_0x0080:
            if (r1 != 0) goto L_0x008e
            android.graphics.PointF r12 = r11.f9129j
            float r0 = r12.x
            android.graphics.PointF r1 = r11.f9128i
            float r1 = r1.y
            r12.set(r0, r1)
            goto L_0x0099
        L_0x008e:
            android.graphics.PointF r12 = r11.f9129j
            float r0 = r12.x
            float r1 = r1.floatValue()
            r12.set(r0, r1)
        L_0x0099:
            android.graphics.PointF r12 = r11.f9129j
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.l.l(float):android.graphics.PointF");
    }
}
