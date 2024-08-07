package td;

import java.util.Map;
import uc.b;
import uc.g;
import uc.h;
import uc.j;
import z.d;

/* compiled from: QRCodeReader */
public final class a implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final j[] f15020b = new j[0];

    /* renamed from: a  reason: collision with root package name */
    public final d f15021a = new d(11);

    public final h a(vl.d dVar) {
        return b(dVar, (Map<b, ?>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h b(vl.d r33, java.util.Map<uc.b, ?> r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = 2
            r3 = 1
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r1 == 0) goto L_0x00de
            uc.b r6 = uc.b.PURE_BARCODE
            boolean r6 = r1.containsKey(r6)
            if (r6 == 0) goto L_0x00de
            cd.b r2 = r33.e()
            int[] r6 = r2.f()
            int[] r7 = r2.c()
            if (r6 == 0) goto L_0x00db
            if (r7 == 0) goto L_0x00db
            int r8 = r2.f4690b
            int r9 = r2.f4689a
            r10 = r6[r5]
            r11 = r6[r3]
            r12 = r3
            r13 = r5
        L_0x002d:
            if (r10 >= r9) goto L_0x0043
            if (r11 >= r8) goto L_0x0043
            boolean r14 = r2.b(r10, r11)
            if (r12 == r14) goto L_0x003e
            int r13 = r13 + 1
            r14 = 5
            if (r13 == r14) goto L_0x0043
            r12 = r12 ^ 1
        L_0x003e:
            int r10 = r10 + 1
            int r11 = r11 + 1
            goto L_0x002d
        L_0x0043:
            if (r10 == r9) goto L_0x00d8
            if (r11 == r8) goto L_0x00d8
            r8 = r6[r5]
            int r10 = r10 - r8
            float r9 = (float) r10
            r10 = 1088421888(0x40e00000, float:7.0)
            float r9 = r9 / r10
            r6 = r6[r3]
            r10 = r7[r3]
            r7 = r7[r5]
            if (r8 >= r7) goto L_0x00d5
            if (r6 >= r10) goto L_0x00d5
            int r11 = r10 - r6
            int r12 = r7 - r8
            if (r11 == r12) goto L_0x0068
            int r7 = r8 + r11
            int r12 = r2.f4689a
            if (r7 >= r12) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0068:
            int r12 = r7 - r8
            int r12 = r12 + r3
            float r12 = (float) r12
            float r12 = r12 / r9
            int r12 = java.lang.Math.round(r12)
            int r11 = r11 + r3
            float r11 = (float) r11
            float r11 = r11 / r9
            int r11 = java.lang.Math.round(r11)
            if (r12 <= 0) goto L_0x00d2
            if (r11 <= 0) goto L_0x00d2
            if (r11 != r12) goto L_0x00cf
            float r4 = r9 / r4
            int r4 = (int) r4
            int r6 = r6 + r4
            int r8 = r8 + r4
            int r13 = r12 + -1
            float r13 = (float) r13
            float r13 = r13 * r9
            int r13 = (int) r13
            int r13 = r13 + r8
            int r13 = r13 - r7
            if (r13 <= 0) goto L_0x0093
            if (r13 > r4) goto L_0x0090
            int r8 = r8 - r13
            goto L_0x0093
        L_0x0090:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0093:
            int r7 = r11 + -1
            float r7 = (float) r7
            float r7 = r7 * r9
            int r7 = (int) r7
            int r7 = r7 + r6
            int r7 = r7 - r10
            if (r7 <= 0) goto L_0x00a3
            if (r7 > r4) goto L_0x00a0
            int r6 = r6 - r7
            goto L_0x00a3
        L_0x00a0:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00a3:
            cd.b r4 = new cd.b
            r4.<init>(r12, r11)
            r7 = r5
        L_0x00a9:
            if (r7 >= r11) goto L_0x00c5
            float r10 = (float) r7
            float r10 = r10 * r9
            int r10 = (int) r10
            int r10 = r10 + r6
            r13 = r5
        L_0x00b0:
            if (r13 >= r12) goto L_0x00c2
            float r14 = (float) r13
            float r14 = r14 * r9
            int r14 = (int) r14
            int r14 = r14 + r8
            boolean r14 = r2.b(r14, r10)
            if (r14 == 0) goto L_0x00bf
            r4.g(r13, r7)
        L_0x00bf:
            int r13 = r13 + 1
            goto L_0x00b0
        L_0x00c2:
            int r7 = r7 + 1
            goto L_0x00a9
        L_0x00c5:
            z.d r2 = r0.f15021a
            cd.e r1 = r2.b(r4, r1)
            uc.j[] r2 = f15020b
            goto L_0x0210
        L_0x00cf:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00d2:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00d5:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00d8:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00db:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x00de:
            y0.h r6 = new y0.h
            cd.b r7 = r33.e()
            r8 = 7
            r6.<init>((cd.b) r7, (int) r8)
            if (r1 != 0) goto L_0x00ec
            r7 = 0
            goto L_0x00f4
        L_0x00ec:
            uc.b r7 = uc.b.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r7 = r1.get(r7)
            uc.k r7 = (uc.k) r7
        L_0x00f4:
            r6.f17387b = r7
            vd.d r9 = new vd.d
            java.lang.Object r10 = r6.f17386a
            cd.b r10 = (cd.b) r10
            r9.<init>(r10, r7)
            z.k r7 = r9.b(r1)
            java.lang.Object r9 = r7.f17755b
            vd.c r9 = (vd.c) r9
            java.lang.Object r10 = r7.f17756c
            vd.c r10 = (vd.c) r10
            java.lang.Object r7 = r7.f17754a
            vd.c r7 = (vd.c) r7
            float r11 = r6.b(r9, r10)
            float r12 = r6.b(r9, r7)
            float r12 = r12 + r11
            float r12 = r12 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x0277
            float r11 = uc.j.a(r9, r10)
            float r11 = r11 / r12
            int r11 = m9.b.S(r11)
            float r13 = uc.j.a(r9, r7)
            float r13 = r13 / r12
            int r13 = m9.b.S(r13)
            int r13 = r13 + r11
            int r13 = r13 / r2
            int r13 = r13 + r8
            r8 = r13 & 3
            if (r8 == 0) goto L_0x0144
            if (r8 == r2) goto L_0x0141
            r2 = 3
            if (r8 == r2) goto L_0x013e
            goto L_0x0146
        L_0x013e:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0141:
            int r13 = r13 + -1
            goto L_0x0146
        L_0x0144:
            int r13 = r13 + 1
        L_0x0146:
            int[] r2 = ud.h.f15515e
            int r2 = r13 % 4
            if (r2 != r3) goto L_0x0272
            int r2 = r13 + -17
            int r2 = r2 / 4
            ud.h r2 = ud.h.c(r2)     // Catch:{ IllegalArgumentException -> 0x026d }
            int r3 = r2.f15517a
            int r3 = r3 * 4
            int r3 = r3 + 17
            int r3 = r3 + -7
            int[] r2 = r2.f15518b
            int r2 = r2.length
            r8 = 1077936128(0x40400000, float:3.0)
            if (r2 <= 0) goto L_0x018f
            float r2 = r10.f15488a
            float r11 = r9.f15488a
            float r2 = r2 - r11
            float r14 = r7.f15488a
            float r2 = r2 + r14
            float r14 = r10.f15489b
            float r15 = r9.f15489b
            float r14 = r14 - r15
            float r5 = r7.f15489b
            float r14 = r14 + r5
            float r3 = (float) r3
            float r3 = r8 / r3
            float r4 = r4 - r3
            float r2 = android.support.v4.media.a.e(r2, r11, r4, r11)
            int r2 = (int) r2
            float r3 = android.support.v4.media.a.e(r14, r15, r4, r15)
            int r3 = (int) r3
            r4 = 4
        L_0x0182:
            r5 = 16
            if (r4 > r5) goto L_0x018f
            float r5 = (float) r4
            vd.a r2 = r6.d(r12, r5, r2, r3)     // Catch:{ NotFoundException -> 0x018c }
            goto L_0x0190
        L_0x018c:
            int r4 = r4 << 1
            goto L_0x0182
        L_0x018f:
            r2 = 0
        L_0x0190:
            float r3 = (float) r13
            r4 = 1080033280(0x40600000, float:3.5)
            float r23 = r3 - r4
            if (r2 == 0) goto L_0x01a4
            float r3 = r2.f15488a
            float r4 = r2.f15489b
            float r5 = r23 - r8
            r28 = r3
            r29 = r4
            r21 = r5
            goto L_0x01ba
        L_0x01a4:
            float r3 = r10.f15488a
            float r4 = r9.f15488a
            float r3 = r3 - r4
            float r4 = r7.f15488a
            float r3 = r3 + r4
            float r4 = r10.f15489b
            float r5 = r9.f15489b
            float r4 = r4 - r5
            float r5 = r7.f15489b
            float r4 = r4 + r5
            r28 = r3
            r29 = r4
            r21 = r23
        L_0x01ba:
            r16 = 1080033280(0x40600000, float:3.5)
            r17 = 1080033280(0x40600000, float:3.5)
            r19 = 1080033280(0x40600000, float:3.5)
            r22 = 1080033280(0x40600000, float:3.5)
            float r3 = r9.f15488a
            float r4 = r9.f15489b
            float r5 = r10.f15488a
            float r8 = r10.f15489b
            float r11 = r7.f15488a
            float r12 = r7.f15489b
            r18 = r23
            r20 = r21
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r8
            r30 = r11
            r31 = r12
            cd.g r3 = cd.g.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r4 = r6.f17386a
            cd.b r4 = (cd.b) r4
            cd.b r3 = p3.l0.E0(r4, r13, r13, r3)
            r4 = 3
            if (r2 != 0) goto L_0x01f9
            uc.j[] r2 = new uc.j[r4]
            r5 = 0
            r2[r5] = r7
            r4 = 1
            r2[r4] = r9
            r6 = 2
            r2[r6] = r10
            goto L_0x0209
        L_0x01f9:
            r5 = 0
            r6 = 4
            r8 = 1
            r11 = 2
            uc.j[] r6 = new uc.j[r6]
            r6[r5] = r7
            r6[r8] = r9
            r6[r11] = r10
            r6[r4] = r2
            r2 = r6
            r4 = r8
        L_0x0209:
            z.d r5 = r0.f15021a
            cd.e r1 = r5.b(r3, r1)
            r3 = r4
        L_0x0210:
            java.lang.Object r4 = r1.f4705e
            boolean r5 = r4 instanceof ud.g
            if (r5 == 0) goto L_0x022c
            ud.g r4 = (ud.g) r4
            boolean r4 = r4.f15514a
            if (r4 == 0) goto L_0x022c
            int r4 = r2.length
            r5 = 3
            if (r4 >= r5) goto L_0x0221
            goto L_0x022c
        L_0x0221:
            r4 = 0
            r5 = r2[r4]
            r6 = 2
            r7 = r2[r6]
            r2[r4] = r7
            r2[r6] = r5
            goto L_0x022d
        L_0x022c:
            r4 = 0
        L_0x022d:
            uc.h r5 = new uc.h
            java.lang.String r6 = r1.f4702b
            byte[] r7 = r1.f4701a
            uc.a r8 = uc.a.QR_CODE
            r5.<init>(r6, r7, r2, r8)
            java.util.List<byte[]> r2 = r1.f4703c
            if (r2 == 0) goto L_0x0241
            uc.i r6 = uc.i.BYTE_SEGMENTS
            r5.b(r6, r2)
        L_0x0241:
            java.lang.String r2 = r1.f4704d
            if (r2 == 0) goto L_0x024a
            uc.i r6 = uc.i.ERROR_CORRECTION_LEVEL
            r5.b(r6, r2)
        L_0x024a:
            int r2 = r1.f4706f
            if (r2 < 0) goto L_0x0253
            int r2 = r1.f4707g
            if (r2 < 0) goto L_0x0253
            goto L_0x0254
        L_0x0253:
            r3 = r4
        L_0x0254:
            if (r3 == 0) goto L_0x026c
            uc.i r2 = uc.i.STRUCTURED_APPEND_SEQUENCE
            int r3 = r1.f4707g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.b(r2, r3)
            uc.i r2 = uc.i.STRUCTURED_APPEND_PARITY
            int r1 = r1.f4706f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.b(r2, r1)
        L_0x026c:
            return r5
        L_0x026d:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x0272:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x0277:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: td.a.b(vl.d, java.util.Map):uc.h");
    }

    public final void reset() {
    }
}
