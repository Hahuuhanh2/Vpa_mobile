package l4;

import m4.c;

/* compiled from: AnimatableTransformParser */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f12655a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f12656b = c.a.a("k");

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r5 = j7.a.i0(r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (((java.util.List) r5.f10560b).isEmpty() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r16 = java.lang.Float.valueOf(0.0f);
        r17 = java.lang.Float.valueOf(0.0f);
        r12 = r1;
        r9 = (java.util.List) r5.f10560b;
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
        r1 = new o4.a(r28, r16, r17, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f4843l));
        r9.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (((o4.a) ((java.util.List) r10.f10560b).get(0)).f13704b != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        ((java.util.List) r10.f10560b).set(0, new o4.a(r28, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f4843l)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e0, code lost:
        r1 = r10;
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0128, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0129, code lost:
        r13 = r18;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0229, code lost:
        if (((java.lang.Float) ((o4.a) ((java.util.List) r12.f10560b).get(0)).f13704b).floatValue() == 0.0f) goto L_0x0231;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h4.g a(m4.d r27, com.airbnb.lottie.i r28) {
        /*
            r0 = r27
            r8 = r28
            int r1 = r27.K()
            r10 = 0
            r2 = 3
            if (r1 != r2) goto L_0x000e
            r11 = 1
            goto L_0x000f
        L_0x000e:
            r11 = r10
        L_0x000f:
            if (r11 == 0) goto L_0x0014
            r27.h()
        L_0x0014:
            r1 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0020:
            boolean r2 = r27.v()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x012e
            m4.c$a r2 = f12655a
            int r2 = r0.N(r2)
            switch(r2) {
                case 0: goto L_0x0100;
                case 1: goto L_0x00f6;
                case 2: goto L_0x00e5;
                case 3: goto L_0x0059;
                case 4: goto L_0x005e;
                case 5: goto L_0x0054;
                case 6: goto L_0x004f;
                case 7: goto L_0x004a;
                case 8: goto L_0x0045;
                case 9: goto L_0x0040;
                default: goto L_0x0032;
            }
        L_0x0032:
            r26 = r6
            r18 = r13
            r2 = 1
            r13 = r7
            r27.R()
            r27.S()
            goto L_0x0129
        L_0x0040:
            h4.b r13 = j7.a.i0(r0, r8, r10)
            goto L_0x0020
        L_0x0045:
            h4.b r14 = j7.a.i0(r0, r8, r10)
            goto L_0x0020
        L_0x004a:
            h4.b r23 = j7.a.i0(r0, r8, r10)
            goto L_0x0020
        L_0x004f:
            h4.b r22 = j7.a.i0(r0, r8, r10)
            goto L_0x0020
        L_0x0054:
            h4.d r21 = j7.a.j0(r27, r28)
            goto L_0x0020
        L_0x0059:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.a(r1)
        L_0x005e:
            h4.b r5 = j7.a.i0(r0, r8, r10)
            java.lang.Object r1 = r5.f10560b
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r5.f10560b
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            o4.a r2 = new o4.a
            java.lang.Float r16 = java.lang.Float.valueOf(r3)
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
            r18 = 0
            r19 = 0
            float r1 = r8.f4843l
            java.lang.Float r20 = java.lang.Float.valueOf(r1)
            r1 = r2
            r3 = r2
            r2 = r28
            r12 = r3
            r3 = r16
            r9 = r4
            r4 = r17
            r10 = r5
            r5 = r18
            r26 = r6
            r6 = r19
            r18 = r13
            r13 = r7
            r7 = r20
            r1.<init>((com.airbnb.lottie.i) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r9.add(r12)
            goto L_0x00df
        L_0x00a2:
            r10 = r5
            r26 = r6
            r18 = r13
            r13 = r7
            java.lang.Object r1 = r10.f10560b
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            o4.a r1 = (o4.a) r1
            T r1 = r1.f13704b
            if (r1 != 0) goto L_0x00df
            java.lang.Object r1 = r10.f10560b
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            o4.a r12 = new o4.a
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r6 = 0
            r7 = 0
            float r1 = r8.f4843l
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            r1 = r12
            r2 = r28
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r19
            r1.<init>((com.airbnb.lottie.i) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r2 = 0
            r9.set(r2, r12)
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            r1 = r10
            r6 = r26
            r2 = 1
            goto L_0x0128
        L_0x00e5:
            r2 = r10
            r18 = r13
            r13 = r7
            h4.d r6 = new h4.d
            dc.d r3 = dc.d.f8894b
            java.util.ArrayList r3 = l4.o.a(r0, r8, r4, r3, r2)
            r2 = 1
            r6.<init>(r2, r3)
            goto L_0x0128
        L_0x00f6:
            r26 = r6
            r18 = r13
            r2 = 1
            h4.h r7 = l4.a.b(r27, r28)
            goto L_0x0129
        L_0x0100:
            r26 = r6
            r18 = r13
            r2 = 1
            r13 = r7
            r27.h()
        L_0x0109:
            boolean r3 = r27.v()
            if (r3 == 0) goto L_0x0123
            m4.c$a r3 = f12656b
            int r3 = r0.N(r3)
            if (r3 == 0) goto L_0x011e
            r27.R()
            r27.S()
            goto L_0x0109
        L_0x011e:
            h4.e r15 = l4.a.a(r27, r28)
            goto L_0x0109
        L_0x0123:
            r27.q()
            r6 = r26
        L_0x0128:
            r7 = r13
        L_0x0129:
            r13 = r18
            r10 = 0
            goto L_0x0020
        L_0x012e:
            r26 = r6
            r18 = r13
            r2 = 1
            r13 = r7
            if (r11 == 0) goto L_0x0139
            r27.q()
        L_0x0139:
            if (r15 == 0) goto L_0x0157
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0155
            java.util.List r0 = r15.f10547a
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r0 = 0
            goto L_0x0158
        L_0x0157:
            r0 = r2
        L_0x0158:
            if (r0 == 0) goto L_0x015b
            r15 = 0
        L_0x015b:
            if (r13 == 0) goto L_0x017f
            boolean r0 = r13 instanceof h4.f
            if (r0 != 0) goto L_0x017d
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x017d
            java.util.List r0 = r13.b()
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r0 = 0
            goto L_0x0180
        L_0x017f:
            r0 = r2
        L_0x0180:
            if (r0 == 0) goto L_0x0183
            r13 = 0
        L_0x0183:
            if (r1 == 0) goto L_0x01a5
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r0 = r1.f10560b
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r0 = 0
            goto L_0x01a6
        L_0x01a5:
            r0 = r2
        L_0x01a6:
            if (r0 == 0) goto L_0x01ad
            r6 = r26
            r20 = 0
            goto L_0x01b1
        L_0x01ad:
            r20 = r1
            r6 = r26
        L_0x01b1:
            if (r6 == 0) goto L_0x01dc
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r0 = r6.f10560b
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            o4.c r0 = (o4.c) r0
            float r1 = r0.f13726a
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01d6
            float r0 = r0.f13727b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01d6
            r0 = r2
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r0 = 0
            goto L_0x01dd
        L_0x01dc:
            r0 = r2
        L_0x01dd:
            if (r0 == 0) goto L_0x01e2
            r19 = 0
            goto L_0x01e4
        L_0x01e2:
            r19 = r6
        L_0x01e4:
            if (r14 == 0) goto L_0x0206
            boolean r0 = r14.c()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r0 = r14.f10560b
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0204
            goto L_0x0206
        L_0x0204:
            r0 = 0
            goto L_0x0207
        L_0x0206:
            r0 = r2
        L_0x0207:
            if (r0 == 0) goto L_0x020a
            r14 = 0
        L_0x020a:
            if (r18 == 0) goto L_0x022f
            boolean r0 = r18.c()
            r12 = r18
            if (r0 == 0) goto L_0x022c
            java.lang.Object r0 = r12.f10560b
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o4.a r0 = (o4.a) r0
            T r0 = r0.f13704b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x022d
            goto L_0x0231
        L_0x022c:
            r1 = 0
        L_0x022d:
            r9 = r1
            goto L_0x0232
        L_0x022f:
            r12 = r18
        L_0x0231:
            r9 = r2
        L_0x0232:
            if (r9 == 0) goto L_0x0237
            r25 = 0
            goto L_0x0239
        L_0x0237:
            r25 = r12
        L_0x0239:
            h4.g r0 = new h4.g
            r16 = r0
            r17 = r15
            r18 = r13
            r24 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.c.a(m4.d, com.airbnb.lottie.i):h4.g");
    }
}
