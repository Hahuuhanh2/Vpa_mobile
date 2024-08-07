package fd;

import java.util.Map;
import k4.d;
import uc.b;
import uc.g;
import uc.h;
import uc.j;

/* compiled from: DataMatrixReader */
public final class a implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final j[] f10192b = new j[0];

    /* renamed from: a  reason: collision with root package name */
    public final d f10193a = new d(6);

    public final h a(vl.d dVar) {
        return b(dVar, (Map<b, ?>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0181, code lost:
        if ((r1.n(r10, r14) + r1.n(r11, r14)) > (r1.n(r10, r2) + r1.n(r11, r2))) goto L_0x0185;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h b(vl.d r33, java.util.Map<uc.b, ?> r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0082
            uc.b r4 = uc.b.PURE_BARCODE
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0082
            cd.b r1 = r33.e()
            int[] r4 = r1.f()
            int[] r5 = r1.c()
            if (r4 == 0) goto L_0x007f
            if (r5 == 0) goto L_0x007f
            int r6 = r1.f4689a
            r7 = r4[r2]
            r8 = r4[r3]
        L_0x0026:
            if (r7 >= r6) goto L_0x0031
            boolean r9 = r1.b(r7, r8)
            if (r9 == 0) goto L_0x0031
            int r7 = r7 + 1
            goto L_0x0026
        L_0x0031:
            if (r7 == r6) goto L_0x007c
            r6 = r4[r2]
            int r7 = r7 - r6
            if (r7 == 0) goto L_0x0079
            r4 = r4[r3]
            r8 = r5[r3]
            r5 = r5[r2]
            int r5 = r5 - r6
            int r5 = r5 + r3
            int r5 = r5 / r7
            int r8 = r8 - r4
            int r8 = r8 + r3
            int r8 = r8 / r7
            if (r5 <= 0) goto L_0x0076
            if (r8 <= 0) goto L_0x0076
            int r3 = r7 / 2
            int r4 = r4 + r3
            int r6 = r6 + r3
            cd.b r3 = new cd.b
            r3.<init>(r5, r8)
            r9 = r2
        L_0x0052:
            if (r9 >= r8) goto L_0x006c
            int r10 = r9 * r7
            int r10 = r10 + r4
            r11 = r2
        L_0x0058:
            if (r11 >= r5) goto L_0x0069
            int r12 = r11 * r7
            int r12 = r12 + r6
            boolean r12 = r1.b(r12, r10)
            if (r12 == 0) goto L_0x0066
            r3.g(r11, r9)
        L_0x0066:
            int r11 = r11 + 1
            goto L_0x0058
        L_0x0069:
            int r9 = r9 + 1
            goto L_0x0052
        L_0x006c:
            k4.d r1 = r0.f10193a
            cd.e r1 = r1.d(r3)
            uc.j[] r2 = f10192b
            goto L_0x0286
        L_0x0076:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0079:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x007c:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x007f:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0082:
            y0.h r1 = new y0.h
            cd.b r4 = r33.e()
            r5 = 6
            r1.<init>((cd.b) r4, (int) r5)
            java.lang.Object r4 = r1.f17387b
            dd.a r4 = (dd.a) r4
            uc.j[] r4 = r4.b()
            r5 = r4[r2]
            r6 = r4[r3]
            r7 = 3
            r8 = r4[r7]
            r9 = 2
            r4 = r4[r9]
            int r10 = r1.n(r5, r6)
            int r11 = r1.n(r6, r8)
            int r12 = r1.n(r8, r4)
            int r13 = r1.n(r4, r5)
            r14 = 4
            uc.j[] r15 = new uc.j[r14]
            r15[r2] = r4
            r15[r3] = r5
            r15[r9] = r6
            r15[r7] = r8
            if (r10 <= r11) goto L_0x00c4
            r15[r2] = r5
            r15[r3] = r6
            r15[r9] = r8
            r15[r7] = r4
            r10 = r11
        L_0x00c4:
            if (r10 <= r12) goto L_0x00cf
            r15[r2] = r6
            r15[r3] = r8
            r15[r9] = r4
            r15[r7] = r5
            goto L_0x00d0
        L_0x00cf:
            r12 = r10
        L_0x00d0:
            if (r12 <= r13) goto L_0x00da
            r15[r2] = r8
            r15[r3] = r4
            r15[r9] = r5
            r15[r7] = r6
        L_0x00da:
            r4 = r15[r2]
            r5 = r15[r3]
            r6 = r15[r9]
            r8 = r15[r7]
            int r10 = r1.n(r4, r8)
            int r10 = r10 + r3
            int r10 = r10 << r9
            uc.j r11 = y0.h.j(r5, r6, r10)
            uc.j r10 = y0.h.j(r6, r5, r10)
            int r11 = r1.n(r11, r4)
            int r10 = r1.n(r10, r8)
            if (r11 >= r10) goto L_0x0103
            r15[r2] = r4
            r15[r3] = r5
            r15[r9] = r6
            r15[r7] = r8
            goto L_0x010b
        L_0x0103:
            r15[r2] = r5
            r15[r3] = r6
            r15[r9] = r8
            r15[r7] = r4
        L_0x010b:
            r4 = r15[r2]
            r5 = r15[r3]
            r6 = r15[r9]
            r8 = r15[r7]
            int r10 = r1.n(r4, r8)
            int r11 = r1.n(r5, r8)
            int r11 = r11 + r3
            int r11 = r11 << r9
            uc.j r11 = y0.h.j(r4, r5, r11)
            int r10 = r10 + r3
            int r10 = r10 << r9
            uc.j r10 = y0.h.j(r6, r5, r10)
            int r12 = r1.n(r11, r8)
            int r13 = r1.n(r10, r8)
            uc.j r14 = new uc.j
            float r9 = r8.f15488a
            float r2 = r6.f15488a
            float r7 = r5.f15488a
            float r2 = r2 - r7
            int r12 = r12 + r3
            float r12 = (float) r12
            float r2 = r2 / r12
            float r2 = r2 + r9
            float r8 = r8.f15489b
            float r6 = r6.f15489b
            float r5 = r5.f15489b
            float r6 = r6 - r5
            float r6 = r6 / r12
            float r6 = r6 + r8
            r14.<init>(r2, r6)
            uc.j r2 = new uc.j
            float r6 = r4.f15488a
            float r6 = r6 - r7
            int r13 = r13 + r3
            float r7 = (float) r13
            float r6 = r6 / r7
            float r6 = r6 + r9
            float r4 = r4.f15489b
            float r4 = r4 - r5
            float r4 = r4 / r7
            float r4 = r4 + r8
            r2.<init>(r6, r4)
            boolean r4 = r1.f(r14)
            if (r4 != 0) goto L_0x0168
            boolean r4 = r1.f(r2)
            if (r4 == 0) goto L_0x0166
            goto L_0x0184
        L_0x0166:
            r14 = 0
            goto L_0x0185
        L_0x0168:
            boolean r4 = r1.f(r2)
            if (r4 != 0) goto L_0x016f
            goto L_0x0185
        L_0x016f:
            int r4 = r1.n(r11, r14)
            int r5 = r1.n(r10, r14)
            int r5 = r5 + r4
            int r4 = r1.n(r11, r2)
            int r6 = r1.n(r10, r2)
            int r6 = r6 + r4
            if (r5 <= r6) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r14 = r2
        L_0x0185:
            r2 = 3
            r15[r2] = r14
            if (r14 == 0) goto L_0x02a4
            r2 = 0
            r4 = r15[r2]
            r2 = r15[r3]
            r5 = 2
            r6 = r15[r5]
            int r7 = r1.n(r4, r14)
            int r7 = r7 + r3
            int r8 = r1.n(r6, r14)
            int r8 = r8 + r3
            int r8 = r8 << r5
            uc.j r8 = y0.h.j(r4, r2, r8)
            int r7 = r7 << r5
            uc.j r5 = y0.h.j(r6, r2, r7)
            int r7 = r1.n(r8, r14)
            int r7 = r7 + r3
            int r5 = r1.n(r5, r14)
            int r5 = r5 + r3
            r8 = r7 & 1
            if (r8 != r3) goto L_0x01b6
            int r7 = r7 + 1
        L_0x01b6:
            r8 = r5 & 1
            if (r8 != r3) goto L_0x01bc
            int r5 = r5 + 1
        L_0x01bc:
            float r8 = r4.f15488a
            float r9 = r2.f15488a
            float r8 = r8 + r9
            float r9 = r6.f15488a
            float r8 = r8 + r9
            float r9 = r14.f15488a
            float r8 = r8 + r9
            r9 = 1082130432(0x40800000, float:4.0)
            float r8 = r8 / r9
            float r10 = r4.f15489b
            float r11 = r2.f15489b
            float r10 = r10 + r11
            float r11 = r6.f15489b
            float r10 = r10 + r11
            float r11 = r14.f15489b
            float r10 = r10 + r11
            float r10 = r10 / r9
            uc.j r4 = y0.h.g(r4, r8, r10)
            uc.j r2 = y0.h.g(r2, r8, r10)
            uc.j r6 = y0.h.g(r6, r8, r10)
            uc.j r8 = y0.h.g(r14, r8, r10)
            r9 = 2
            int r5 = r5 << r9
            uc.j r10 = y0.h.j(r4, r2, r5)
            int r7 = r7 << r9
            uc.j r9 = y0.h.j(r10, r8, r7)
            uc.j r10 = y0.h.j(r2, r4, r5)
            uc.j r10 = y0.h.j(r10, r6, r7)
            uc.j r11 = y0.h.j(r6, r8, r5)
            uc.j r2 = y0.h.j(r11, r2, r7)
            uc.j r5 = y0.h.j(r8, r6, r5)
            uc.j r4 = y0.h.j(r5, r4, r7)
            int r5 = r1.n(r9, r4)
            int r5 = r5 + r3
            int r6 = r1.n(r2, r4)
            int r6 = r6 + r3
            r7 = r5 & 1
            if (r7 != r3) goto L_0x0219
            int r5 = r5 + 1
        L_0x0219:
            r7 = r6 & 1
            if (r7 != r3) goto L_0x021f
            int r6 = r6 + 1
        L_0x021f:
            int r7 = r5 * 4
            int r8 = r6 * 7
            if (r7 >= r8) goto L_0x0230
            int r7 = r6 * 4
            int r8 = r5 * 7
            if (r7 >= r8) goto L_0x0230
            int r5 = java.lang.Math.max(r5, r6)
            r6 = r5
        L_0x0230:
            java.lang.Object r1 = r1.f17386a
            cd.b r1 = (cd.b) r1
            float r7 = (float) r5
            r8 = 1056964608(0x3f000000, float:0.5)
            float r20 = r7 - r8
            float r7 = (float) r6
            float r23 = r7 - r8
            float r7 = r9.f15488a
            float r8 = r9.f15489b
            float r11 = r4.f15488a
            float r12 = r4.f15489b
            float r13 = r2.f15488a
            float r14 = r2.f15489b
            float r15 = r10.f15488a
            float r3 = r10.f15489b
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 1056964608(0x3f000000, float:0.5)
            r19 = 1056964608(0x3f000000, float:0.5)
            r22 = 1056964608(0x3f000000, float:0.5)
            r18 = r20
            r21 = r23
            r24 = r7
            r25 = r8
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r3
            cd.g r3 = cd.g.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            cd.b r1 = p3.l0.E0(r1, r5, r6, r3)
            r3 = 4
            uc.j[] r3 = new uc.j[r3]
            r5 = 0
            r3[r5] = r9
            r5 = 1
            r3[r5] = r10
            r5 = 2
            r3[r5] = r2
            r2 = 3
            r3[r2] = r4
            k4.d r2 = r0.f10193a
            cd.e r1 = r2.d(r1)
            r2 = r3
        L_0x0286:
            uc.h r3 = new uc.h
            java.lang.String r4 = r1.f4702b
            byte[] r5 = r1.f4701a
            uc.a r6 = uc.a.DATA_MATRIX
            r3.<init>(r4, r5, r2, r6)
            java.util.List<byte[]> r2 = r1.f4703c
            if (r2 == 0) goto L_0x029a
            uc.i r4 = uc.i.BYTE_SEGMENTS
            r3.b(r4, r2)
        L_0x029a:
            java.lang.String r1 = r1.f4704d
            if (r1 == 0) goto L_0x02a3
            uc.i r2 = uc.i.ERROR_CORRECTION_LEVEL
            r3.b(r2, r1)
        L_0x02a3:
            return r3
        L_0x02a4:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.a.b(vl.d, java.util.Map):uc.h");
    }

    public final void reset() {
    }
}
