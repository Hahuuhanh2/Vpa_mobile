package l4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import m4.c;
import n4.f;
import n4.g;
import v0.i;
import y1.a;

/* compiled from: KeyframeParser */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f12679a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static i<WeakReference<Interpolator>> f12680b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f12681c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    public static c.a f12682d = c.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        int i10;
        Interpolator interpolator;
        WeakReference weakReference;
        Interpolator interpolator2;
        Class<n> cls = n.class;
        pointF.x = f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = f.b(pointF2.x, -1.0f, 1.0f);
        float b10 = f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        g.a aVar = g.f13513a;
        if (f10 != 0.0f) {
            i10 = (int) (((float) 527) * f10);
        } else {
            i10 = 17;
        }
        if (f11 != 0.0f) {
            i10 = (int) (((float) (i10 * 31)) * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (((float) (i10 * 31)) * f12);
        }
        if (b10 != 0.0f) {
            i10 = (int) (((float) (i10 * 31)) * b10);
        }
        synchronized (cls) {
            if (f12680b == null) {
                f12680b = new i<>();
            }
            interpolator = null;
            weakReference = (WeakReference) f12680b.c(i10, (Integer) null);
        }
        if (weakReference != null) {
            interpolator = (Interpolator) weakReference.get();
        }
        if (weakReference == null || interpolator == null) {
            try {
                interpolator2 = a.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    interpolator2 = a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator2 = new LinearInterpolator();
                }
            }
            interpolator = interpolator2;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (cls) {
                    f12680b.e(i10, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a0, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        r9 = r21;
        r3 = 1;
        r7 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> o4.a<T> b(m4.c r23, com.airbnb.lottie.i r24, float r25, l4.c0<T> r26, boolean r27, boolean r28) {
        /*
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = 1
            if (r27 == 0) goto L_0x0201
            if (r28 == 0) goto L_0x0201
            r7 = 3
            r23.h()
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
        L_0x001d:
            boolean r20 = r23.v()
            if (r20 == 0) goto L_0x01a7
            m4.c$a r8 = f12681c
            int r8 = r0.N(r8)
            switch(r8) {
                case 0: goto L_0x0195;
                case 1: goto L_0x018b;
                case 2: goto L_0x0182;
                case 3: goto L_0x00ea;
                case 4: goto L_0x004f;
                case 5: goto L_0x003f;
                case 6: goto L_0x003a;
                case 7: goto L_0x0035;
                default: goto L_0x002c;
            }
        L_0x002c:
            r21 = r9
            r3 = r10
            r7 = 7
            r23.S()
            goto L_0x01a0
        L_0x0035:
            android.graphics.PointF r9 = l4.m.b(r0, r1)
            goto L_0x001d
        L_0x003a:
            android.graphics.PointF r6 = l4.m.b(r0, r1)
            goto L_0x0046
        L_0x003f:
            int r8 = r23.B()
            if (r8 != r3) goto L_0x004a
            r10 = r3
        L_0x0046:
            r21 = r9
            goto L_0x00e7
        L_0x004a:
            r21 = r9
            r10 = 0
            goto L_0x00e7
        L_0x004f:
            int r8 = r23.K()
            if (r8 != r7) goto L_0x00e0
            r23.h()
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x005c:
            boolean r20 = r23.v()
            if (r20 == 0) goto L_0x00cc
            m4.c$a r3 = f12682d
            int r3 = r0.N(r3)
            if (r3 == 0) goto L_0x009e
            r21 = r9
            r9 = 1
            if (r3 == r9) goto L_0x0074
            r23.S()
            r3 = r10
            goto L_0x00c7
        L_0x0074:
            int r3 = r23.K()
            r9 = 7
            if (r3 != r9) goto L_0x0083
            r3 = r10
            double r9 = r23.z()
            float r5 = (float) r9
            r7 = r5
            goto L_0x00c7
        L_0x0083:
            r3 = r10
            r23.d()
            double r9 = r23.z()
            float r5 = (float) r9
            int r7 = r23.K()
            r9 = 7
            if (r7 != r9) goto L_0x0099
            double r9 = r23.z()
            float r7 = (float) r9
            goto L_0x009a
        L_0x0099:
            r7 = r5
        L_0x009a:
            r23.i()
            goto L_0x00c7
        L_0x009e:
            r21 = r9
            r3 = r10
            int r4 = r23.K()
            r8 = 7
            if (r4 != r8) goto L_0x00af
            double r9 = r23.z()
            float r4 = (float) r9
            r8 = r4
            goto L_0x00c7
        L_0x00af:
            r23.d()
            double r9 = r23.z()
            float r4 = (float) r9
            int r9 = r23.K()
            if (r9 != r8) goto L_0x00c3
            double r8 = r23.z()
            float r8 = (float) r8
            goto L_0x00c4
        L_0x00c3:
            r8 = r4
        L_0x00c4:
            r23.i()
        L_0x00c7:
            r10 = r3
            r9 = r21
            r3 = 1
            goto L_0x005c
        L_0x00cc:
            r21 = r9
            r3 = r10
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r4, r5)
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r8, r7)
            r23.q()
            r4 = r9
            r7 = 7
            goto L_0x01a0
        L_0x00e0:
            r21 = r9
            r3 = r10
            android.graphics.PointF r12 = l4.m.b(r0, r1)
        L_0x00e7:
            r7 = 7
            goto L_0x01a1
        L_0x00ea:
            r21 = r9
            r3 = r10
            int r7 = r23.K()
            r8 = 3
            if (r7 != r8) goto L_0x017c
            r23.h()
            r7 = 0
            r9 = 0
            r10 = 0
            r13 = 0
        L_0x00fb:
            boolean r15 = r23.v()
            if (r15 == 0) goto L_0x016a
            m4.c$a r15 = f12682d
            int r15 = r0.N(r15)
            if (r15 == 0) goto L_0x013c
            r8 = 1
            if (r15 == r8) goto L_0x0111
            r23.S()
            r15 = 7
            goto L_0x0168
        L_0x0111:
            int r8 = r23.K()
            r15 = 7
            if (r8 != r15) goto L_0x011f
            double r8 = r23.z()
            float r9 = (float) r8
            r13 = r9
            goto L_0x0168
        L_0x011f:
            r23.d()
            double r8 = r23.z()
            float r9 = (float) r8
            int r8 = r23.K()
            if (r8 != r15) goto L_0x0134
            r13 = r9
            double r8 = r23.z()
            float r8 = (float) r8
            goto L_0x0136
        L_0x0134:
            r13 = r9
            r8 = r13
        L_0x0136:
            r23.i()
            r9 = r13
            r13 = r8
            goto L_0x0168
        L_0x013c:
            r15 = 7
            int r7 = r23.K()
            if (r7 != r15) goto L_0x014a
            double r7 = r23.z()
            float r7 = (float) r7
            r10 = r7
            goto L_0x0168
        L_0x014a:
            r23.d()
            double r7 = r23.z()
            float r7 = (float) r7
            int r8 = r23.K()
            if (r8 != r15) goto L_0x015f
            r10 = r7
            double r7 = r23.z()
            float r7 = (float) r7
            goto L_0x0160
        L_0x015f:
            r10 = r7
        L_0x0160:
            r23.i()
            r22 = r10
            r10 = r7
            r7 = r22
        L_0x0168:
            r8 = 3
            goto L_0x00fb
        L_0x016a:
            r15 = 7
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r7, r9)
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r10, r13)
            r23.q()
            r13 = r7
            r7 = r15
            r15 = r8
            goto L_0x01a0
        L_0x017c:
            r7 = 7
            android.graphics.PointF r11 = l4.m.b(r0, r1)
            goto L_0x01a0
        L_0x0182:
            r21 = r9
            r3 = r10
            r7 = 7
            java.lang.Object r16 = r2.b(r0, r1)
            goto L_0x01a0
        L_0x018b:
            r21 = r9
            r3 = r10
            r7 = 7
            java.lang.Object r8 = r2.b(r0, r1)
            r14 = r8
            goto L_0x01a0
        L_0x0195:
            r21 = r9
            r3 = r10
            r7 = 7
            double r8 = r23.z()
            float r8 = (float) r8
            r18 = r8
        L_0x01a0:
            r10 = r3
        L_0x01a1:
            r9 = r21
            r3 = 1
            r7 = 3
            goto L_0x001d
        L_0x01a7:
            r21 = r9
            r3 = r10
            r23.q()
            if (r3 == 0) goto L_0x01b4
            android.view.animation.LinearInterpolator r0 = f12679a
            r16 = r14
            goto L_0x01d7
        L_0x01b4:
            if (r11 == 0) goto L_0x01bd
            if (r12 == 0) goto L_0x01bd
            android.view.animation.Interpolator r0 = a(r11, r12)
            goto L_0x01d7
        L_0x01bd:
            if (r15 == 0) goto L_0x01d5
            if (r13 == 0) goto L_0x01d5
            if (r4 == 0) goto L_0x01d5
            if (r5 == 0) goto L_0x01d5
            android.view.animation.Interpolator r0 = a(r15, r4)
            android.view.animation.Interpolator r1 = a(r13, r5)
            r17 = r1
            r15 = r16
            r16 = r0
            r0 = 0
            goto L_0x01dd
        L_0x01d5:
            android.view.animation.LinearInterpolator r0 = f12679a
        L_0x01d7:
            r15 = r16
            r16 = 0
            r17 = 0
        L_0x01dd:
            if (r16 == 0) goto L_0x01ea
            if (r17 == 0) goto L_0x01ea
            o4.a r0 = new o4.a
            r12 = r0
            r13 = r24
            r12.<init>((com.airbnb.lottie.i) r13, (java.lang.Object) r14, (java.lang.Object) r15, (android.view.animation.Interpolator) r16, (android.view.animation.Interpolator) r17, (float) r18)
            goto L_0x01fa
        L_0x01ea:
            o4.a r1 = new o4.a
            r2 = 0
            r12 = r1
            r13 = r24
            r16 = r0
            r17 = r18
            r18 = r2
            r12.<init>((com.airbnb.lottie.i) r13, r14, r15, (android.view.animation.Interpolator) r16, (float) r17, (java.lang.Float) r18)
            r0 = r1
        L_0x01fa:
            r0.f13717o = r6
            r6 = r21
            r0.f13718p = r6
            return r0
        L_0x0201:
            if (r27 == 0) goto L_0x0281
            r23.h()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r19 = 0
        L_0x020f:
            boolean r7 = r23.v()
            if (r7 == 0) goto L_0x0259
            m4.c$a r7 = f12681c
            int r7 = r0.N(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            switch(r7) {
                case 0: goto L_0x0252;
                case 1: goto L_0x024c;
                case 2: goto L_0x0246;
                case 3: goto L_0x0240;
                case 4: goto L_0x023a;
                case 5: goto L_0x022f;
                case 6: goto L_0x022a;
                case 7: goto L_0x0225;
                default: goto L_0x0220;
            }
        L_0x0220:
            r11 = 1
            r23.S()
            goto L_0x020f
        L_0x0225:
            android.graphics.PointF r5 = l4.m.b(r0, r1)
            goto L_0x020f
        L_0x022a:
            android.graphics.PointF r4 = l4.m.b(r0, r1)
            goto L_0x020f
        L_0x022f:
            int r7 = r23.B()
            r11 = 1
            if (r7 != r11) goto L_0x0238
            r9 = r11
            goto L_0x020f
        L_0x0238:
            r9 = 0
            goto L_0x020f
        L_0x023a:
            r11 = 1
            android.graphics.PointF r3 = l4.m.b(r0, r8)
            goto L_0x020f
        L_0x0240:
            r11 = 1
            android.graphics.PointF r6 = l4.m.b(r0, r8)
            goto L_0x020f
        L_0x0246:
            r11 = 1
            java.lang.Object r19 = r2.b(r0, r1)
            goto L_0x020f
        L_0x024c:
            r11 = 1
            java.lang.Object r10 = r2.b(r0, r1)
            goto L_0x020f
        L_0x0252:
            r11 = 1
            double r7 = r23.z()
            float r12 = (float) r7
            goto L_0x020f
        L_0x0259:
            r23.q()
            if (r9 == 0) goto L_0x0264
            android.view.animation.LinearInterpolator r0 = f12679a
            r11 = r0
            r19 = r10
            goto L_0x0270
        L_0x0264:
            if (r6 == 0) goto L_0x026d
            if (r3 == 0) goto L_0x026d
            android.view.animation.Interpolator r0 = a(r6, r3)
            goto L_0x026f
        L_0x026d:
            android.view.animation.LinearInterpolator r0 = f12679a
        L_0x026f:
            r11 = r0
        L_0x0270:
            o4.a r0 = new o4.a
            r13 = 0
            r7 = r0
            r8 = r24
            r9 = r10
            r10 = r19
            r7.<init>((com.airbnb.lottie.i) r8, r9, r10, (android.view.animation.Interpolator) r11, (float) r12, (java.lang.Float) r13)
            r0.f13717o = r4
            r0.f13718p = r5
            return r0
        L_0x0281:
            java.lang.Object r0 = r2.b(r0, r1)
            o4.a r1 = new o4.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.n.b(m4.c, com.airbnb.lottie.i, float, l4.c0, boolean, boolean):o4.a");
    }
}
