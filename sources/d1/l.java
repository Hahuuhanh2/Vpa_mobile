package d1;

import android.support.v4.media.a;
import c1.e;

/* compiled from: HorizontalWidgetRun */
public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f8517k = new int[2];

    public l(e eVar) {
        super(eVar);
        this.f8535h.f8507e = 4;
        this.f8536i.f8507e = 5;
        this.f8533f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0273, code lost:
        if (r13 != 1) goto L_0x02d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d1.d r21) {
        /*
            r20 = this;
            r0 = r20
            c1.e$a r1 = c1.e.a.MATCH_CONSTRAINT
            int r2 = r0.f8537j
            int r2 = v.v.g(r2)
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L_0x03ea
            d1.g r2 = r0.f8532e
            boolean r5 = r2.f8512j
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            if (r5 != 0) goto L_0x02d2
            c1.e$a r5 = r0.f8531d
            if (r5 != r1) goto L_0x02d2
            c1.e r5 = r0.f8529b
            int r8 = r5.f4455s
            r9 = 2
            if (r8 == r9) goto L_0x02bb
            if (r8 == r3) goto L_0x0026
            goto L_0x02d2
        L_0x0026:
            int r8 = r5.f4457t
            r9 = -1
            if (r8 == 0) goto L_0x005e
            if (r8 != r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r3 = r5.f4420a0
            if (r3 == r9) goto L_0x004d
            if (r3 == 0) goto L_0x0042
            if (r3 == r7) goto L_0x0038
            r3 = r4
            goto L_0x0059
        L_0x0038:
            d1.n r3 = r5.f4427e
            d1.g r3 = r3.f8532e
            int r3 = r3.f8509g
            float r3 = (float) r3
            float r5 = r5.Z
            goto L_0x0056
        L_0x0042:
            d1.n r3 = r5.f4427e
            d1.g r3 = r3.f8532e
            int r3 = r3.f8509g
            float r3 = (float) r3
            float r5 = r5.Z
            float r3 = r3 / r5
            goto L_0x0057
        L_0x004d:
            d1.n r3 = r5.f4427e
            d1.g r3 = r3.f8532e
            int r3 = r3.f8509g
            float r3 = (float) r3
            float r5 = r5.Z
        L_0x0056:
            float r3 = r3 * r5
        L_0x0057:
            float r3 = r3 + r6
            int r3 = (int) r3
        L_0x0059:
            r2.d(r3)
            goto L_0x02d2
        L_0x005e:
            d1.n r2 = r5.f4427e
            d1.f r3 = r2.f8535h
            d1.f r2 = r2.f8536i
            c1.d r8 = r5.K
            c1.d r8 = r8.f4406f
            if (r8 == 0) goto L_0x006c
            r8 = r7
            goto L_0x006d
        L_0x006c:
            r8 = r4
        L_0x006d:
            c1.d r10 = r5.L
            c1.d r10 = r10.f4406f
            if (r10 == 0) goto L_0x0075
            r10 = r7
            goto L_0x0076
        L_0x0075:
            r10 = r4
        L_0x0076:
            c1.d r11 = r5.M
            c1.d r11 = r11.f4406f
            if (r11 == 0) goto L_0x007e
            r11 = r7
            goto L_0x007f
        L_0x007e:
            r11 = r4
        L_0x007f:
            c1.d r12 = r5.N
            c1.d r12 = r12.f4406f
            if (r12 == 0) goto L_0x0087
            r12 = r7
            goto L_0x0088
        L_0x0087:
            r12 = r4
        L_0x0088:
            int r15 = r5.f4420a0
            if (r8 == 0) goto L_0x01c3
            if (r10 == 0) goto L_0x01c3
            if (r11 == 0) goto L_0x01c3
            if (r12 == 0) goto L_0x01c3
            float r5 = r5.Z
            boolean r8 = r3.f8512j
            if (r8 == 0) goto L_0x00f5
            boolean r8 = r2.f8512j
            if (r8 == 0) goto L_0x00f5
            d1.f r1 = r0.f8535h
            boolean r6 = r1.f8505c
            if (r6 == 0) goto L_0x00f4
            d1.f r6 = r0.f8536i
            boolean r6 = r6.f8505c
            if (r6 != 0) goto L_0x00a9
            goto L_0x00f4
        L_0x00a9:
            java.util.ArrayList r1 = r1.f8514l
            java.lang.Object r1 = r1.get(r4)
            d1.f r1 = (d1.f) r1
            int r1 = r1.f8509g
            d1.f r6 = r0.f8535h
            int r6 = r6.f8508f
            int r14 = r1 + r6
            d1.f r1 = r0.f8536i
            java.util.ArrayList r1 = r1.f8514l
            java.lang.Object r1 = r1.get(r4)
            d1.f r1 = (d1.f) r1
            int r1 = r1.f8509g
            d1.f r6 = r0.f8536i
            int r6 = r6.f8508f
            int r1 = r1 - r6
            int r6 = r3.f8509g
            int r3 = r3.f8508f
            int r16 = r6 + r3
            int r3 = r2.f8509g
            int r2 = r2.f8508f
            int r17 = r3 - r2
            int[] r2 = f8517k
            r13 = r2
            r8 = r15
            r15 = r1
            r18 = r5
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            d1.g r1 = r0.f8532e
            r3 = r2[r4]
            r1.d(r3)
            c1.e r1 = r0.f8529b
            d1.n r1 = r1.f4427e
            d1.g r1 = r1.f8532e
            r2 = r2[r7]
            r1.d(r2)
        L_0x00f4:
            return
        L_0x00f5:
            r8 = r15
            d1.f r9 = r0.f8535h
            boolean r10 = r9.f8512j
            if (r10 == 0) goto L_0x0151
            d1.f r10 = r0.f8536i
            boolean r11 = r10.f8512j
            if (r11 == 0) goto L_0x0151
            boolean r11 = r3.f8505c
            if (r11 == 0) goto L_0x0150
            boolean r11 = r2.f8505c
            if (r11 != 0) goto L_0x010b
            goto L_0x0150
        L_0x010b:
            int r11 = r9.f8509g
            int r9 = r9.f8508f
            int r14 = r11 + r9
            int r9 = r10.f8509g
            int r10 = r10.f8508f
            int r15 = r9 - r10
            java.util.ArrayList r9 = r3.f8514l
            java.lang.Object r9 = r9.get(r4)
            d1.f r9 = (d1.f) r9
            int r9 = r9.f8509g
            int r10 = r3.f8508f
            int r16 = r9 + r10
            java.util.ArrayList r9 = r2.f8514l
            java.lang.Object r9 = r9.get(r4)
            d1.f r9 = (d1.f) r9
            int r9 = r9.f8509g
            int r10 = r2.f8508f
            int r17 = r9 - r10
            int[] r9 = f8517k
            r13 = r9
            r18 = r5
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            d1.g r10 = r0.f8532e
            r11 = r9[r4]
            r10.d(r11)
            c1.e r10 = r0.f8529b
            d1.n r10 = r10.f4427e
            d1.g r10 = r10.f8532e
            r9 = r9[r7]
            r10.d(r9)
            goto L_0x0151
        L_0x0150:
            return
        L_0x0151:
            d1.f r9 = r0.f8535h
            boolean r10 = r9.f8505c
            if (r10 == 0) goto L_0x01c2
            d1.f r10 = r0.f8536i
            boolean r10 = r10.f8505c
            if (r10 == 0) goto L_0x01c2
            boolean r10 = r3.f8505c
            if (r10 == 0) goto L_0x01c2
            boolean r10 = r2.f8505c
            if (r10 != 0) goto L_0x0166
            goto L_0x01c2
        L_0x0166:
            java.util.ArrayList r9 = r9.f8514l
            java.lang.Object r9 = r9.get(r4)
            d1.f r9 = (d1.f) r9
            int r9 = r9.f8509g
            d1.f r10 = r0.f8535h
            int r10 = r10.f8508f
            int r14 = r9 + r10
            d1.f r9 = r0.f8536i
            java.util.ArrayList r9 = r9.f8514l
            java.lang.Object r9 = r9.get(r4)
            d1.f r9 = (d1.f) r9
            int r9 = r9.f8509g
            d1.f r10 = r0.f8536i
            int r10 = r10.f8508f
            int r15 = r9 - r10
            java.util.ArrayList r9 = r3.f8514l
            java.lang.Object r9 = r9.get(r4)
            d1.f r9 = (d1.f) r9
            int r9 = r9.f8509g
            int r3 = r3.f8508f
            int r16 = r9 + r3
            java.util.ArrayList r3 = r2.f8514l
            java.lang.Object r3 = r3.get(r4)
            d1.f r3 = (d1.f) r3
            int r3 = r3.f8509g
            int r2 = r2.f8508f
            int r17 = r3 - r2
            int[] r2 = f8517k
            r13 = r2
            r18 = r5
            r19 = r8
            m(r13, r14, r15, r16, r17, r18, r19)
            d1.g r3 = r0.f8532e
            r5 = r2[r4]
            r3.d(r5)
            c1.e r3 = r0.f8529b
            d1.n r3 = r3.f4427e
            d1.g r3 = r3.f8532e
            r2 = r2[r7]
            r3.d(r2)
            goto L_0x02d2
        L_0x01c2:
            return
        L_0x01c3:
            r13 = r15
            if (r8 == 0) goto L_0x0246
            if (r11 == 0) goto L_0x0246
            d1.f r2 = r0.f8535h
            boolean r3 = r2.f8505c
            if (r3 == 0) goto L_0x0245
            d1.f r3 = r0.f8536i
            boolean r3 = r3.f8505c
            if (r3 != 0) goto L_0x01d5
            goto L_0x0245
        L_0x01d5:
            float r3 = r5.Z
            java.util.ArrayList r2 = r2.f8514l
            java.lang.Object r2 = r2.get(r4)
            d1.f r2 = (d1.f) r2
            int r2 = r2.f8509g
            d1.f r5 = r0.f8535h
            int r5 = r5.f8508f
            int r2 = r2 + r5
            d1.f r5 = r0.f8536i
            java.util.ArrayList r5 = r5.f8514l
            java.lang.Object r5 = r5.get(r4)
            d1.f r5 = (d1.f) r5
            int r5 = r5.f8509g
            d1.f r8 = r0.f8536i
            int r8 = r8.f8508f
            int r5 = r5 - r8
            if (r13 == r9) goto L_0x0222
            if (r13 == 0) goto L_0x0222
            if (r13 == r7) goto L_0x01ff
            goto L_0x02d2
        L_0x01ff:
            int r5 = r5 - r2
            int r2 = r0.g(r5, r4)
            float r5 = (float) r2
            float r5 = r5 / r3
            float r5 = r5 + r6
            int r5 = (int) r5
            int r8 = r0.g(r5, r7)
            if (r5 == r8) goto L_0x0212
            float r2 = (float) r8
            float r2 = r2 * r3
            float r2 = r2 + r6
            int r2 = (int) r2
        L_0x0212:
            d1.g r3 = r0.f8532e
            r3.d(r2)
            c1.e r2 = r0.f8529b
            d1.n r2 = r2.f4427e
            d1.g r2 = r2.f8532e
            r2.d(r8)
            goto L_0x02d2
        L_0x0222:
            int r5 = r5 - r2
            int r2 = r0.g(r5, r4)
            float r5 = (float) r2
            float r5 = r5 * r3
            float r5 = r5 + r6
            int r5 = (int) r5
            int r8 = r0.g(r5, r7)
            if (r5 == r8) goto L_0x0235
            float r2 = (float) r8
            float r2 = r2 / r3
            float r2 = r2 + r6
            int r2 = (int) r2
        L_0x0235:
            d1.g r3 = r0.f8532e
            r3.d(r2)
            c1.e r2 = r0.f8529b
            d1.n r2 = r2.f4427e
            d1.g r2 = r2.f8532e
            r2.d(r8)
            goto L_0x02d2
        L_0x0245:
            return
        L_0x0246:
            if (r10 == 0) goto L_0x02d2
            if (r12 == 0) goto L_0x02d2
            boolean r8 = r3.f8505c
            if (r8 == 0) goto L_0x02ba
            boolean r8 = r2.f8505c
            if (r8 != 0) goto L_0x0253
            goto L_0x02ba
        L_0x0253:
            float r5 = r5.Z
            java.util.ArrayList r8 = r3.f8514l
            java.lang.Object r8 = r8.get(r4)
            d1.f r8 = (d1.f) r8
            int r8 = r8.f8509g
            int r3 = r3.f8508f
            int r8 = r8 + r3
            java.util.ArrayList r3 = r2.f8514l
            java.lang.Object r3 = r3.get(r4)
            d1.f r3 = (d1.f) r3
            int r3 = r3.f8509g
            int r2 = r2.f8508f
            int r3 = r3 - r2
            if (r13 == r9) goto L_0x0298
            if (r13 == 0) goto L_0x0276
            if (r13 == r7) goto L_0x0298
            goto L_0x02d2
        L_0x0276:
            int r3 = r3 - r8
            int r2 = r0.g(r3, r7)
            float r3 = (float) r2
            float r3 = r3 * r5
            float r3 = r3 + r6
            int r3 = (int) r3
            int r8 = r0.g(r3, r4)
            if (r3 == r8) goto L_0x0289
            float r2 = (float) r8
            float r2 = r2 / r5
            float r2 = r2 + r6
            int r2 = (int) r2
        L_0x0289:
            d1.g r3 = r0.f8532e
            r3.d(r8)
            c1.e r3 = r0.f8529b
            d1.n r3 = r3.f4427e
            d1.g r3 = r3.f8532e
            r3.d(r2)
            goto L_0x02d2
        L_0x0298:
            int r3 = r3 - r8
            int r2 = r0.g(r3, r7)
            float r3 = (float) r2
            float r3 = r3 / r5
            float r3 = r3 + r6
            int r3 = (int) r3
            int r8 = r0.g(r3, r4)
            if (r3 == r8) goto L_0x02ab
            float r2 = (float) r8
            float r2 = r2 * r5
            float r2 = r2 + r6
            int r2 = (int) r2
        L_0x02ab:
            d1.g r3 = r0.f8532e
            r3.d(r8)
            c1.e r3 = r0.f8529b
            d1.n r3 = r3.f4427e
            d1.g r3 = r3.f8532e
            r3.d(r2)
            goto L_0x02d2
        L_0x02ba:
            return
        L_0x02bb:
            c1.e r3 = r5.W
            if (r3 == 0) goto L_0x02d2
            d1.l r3 = r3.f4425d
            d1.g r3 = r3.f8532e
            boolean r8 = r3.f8512j
            if (r8 == 0) goto L_0x02d2
            float r5 = r5.f4464x
            int r3 = r3.f8509g
            float r3 = (float) r3
            float r3 = r3 * r5
            float r3 = r3 + r6
            int r3 = (int) r3
            r2.d(r3)
        L_0x02d2:
            d1.f r2 = r0.f8535h
            boolean r3 = r2.f8505c
            if (r3 == 0) goto L_0x03e9
            d1.f r3 = r0.f8536i
            boolean r5 = r3.f8505c
            if (r5 != 0) goto L_0x02e0
            goto L_0x03e9
        L_0x02e0:
            boolean r2 = r2.f8512j
            if (r2 == 0) goto L_0x02ef
            boolean r2 = r3.f8512j
            if (r2 == 0) goto L_0x02ef
            d1.g r2 = r0.f8532e
            boolean r2 = r2.f8512j
            if (r2 == 0) goto L_0x02ef
            return
        L_0x02ef:
            d1.g r2 = r0.f8532e
            boolean r2 = r2.f8512j
            if (r2 != 0) goto L_0x0337
            c1.e$a r2 = r0.f8531d
            if (r2 != r1) goto L_0x0337
            c1.e r2 = r0.f8529b
            int r3 = r2.f4455s
            if (r3 != 0) goto L_0x0337
            boolean r2 = r2.B()
            if (r2 != 0) goto L_0x0337
            d1.f r1 = r0.f8535h
            java.util.ArrayList r1 = r1.f8514l
            java.lang.Object r1 = r1.get(r4)
            d1.f r1 = (d1.f) r1
            d1.f r2 = r0.f8536i
            java.util.ArrayList r2 = r2.f8514l
            java.lang.Object r2 = r2.get(r4)
            d1.f r2 = (d1.f) r2
            int r1 = r1.f8509g
            d1.f r3 = r0.f8535h
            int r4 = r3.f8508f
            int r1 = r1 + r4
            int r2 = r2.f8509g
            d1.f r4 = r0.f8536i
            int r4 = r4.f8508f
            int r2 = r2 + r4
            int r4 = r2 - r1
            r3.d(r1)
            d1.f r1 = r0.f8536i
            r1.d(r2)
            d1.g r1 = r0.f8532e
            r1.d(r4)
            return
        L_0x0337:
            d1.g r2 = r0.f8532e
            boolean r2 = r2.f8512j
            if (r2 != 0) goto L_0x0399
            c1.e$a r2 = r0.f8531d
            if (r2 != r1) goto L_0x0399
            int r1 = r0.f8528a
            if (r1 != r7) goto L_0x0399
            d1.f r1 = r0.f8535h
            java.util.ArrayList r1 = r1.f8514l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0399
            d1.f r1 = r0.f8536i
            java.util.ArrayList r1 = r1.f8514l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0399
            d1.f r1 = r0.f8535h
            java.util.ArrayList r1 = r1.f8514l
            java.lang.Object r1 = r1.get(r4)
            d1.f r1 = (d1.f) r1
            d1.f r2 = r0.f8536i
            java.util.ArrayList r2 = r2.f8514l
            java.lang.Object r2 = r2.get(r4)
            d1.f r2 = (d1.f) r2
            int r1 = r1.f8509g
            d1.f r3 = r0.f8535h
            int r3 = r3.f8508f
            int r1 = r1 + r3
            int r2 = r2.f8509g
            d1.f r3 = r0.f8536i
            int r3 = r3.f8508f
            int r2 = r2 + r3
            int r2 = r2 - r1
            d1.g r1 = r0.f8532e
            int r1 = r1.f8515m
            int r1 = java.lang.Math.min(r2, r1)
            c1.e r2 = r0.f8529b
            int r3 = r2.f4463w
            int r2 = r2.f4461v
            int r1 = java.lang.Math.max(r2, r1)
            if (r3 <= 0) goto L_0x0394
            int r1 = java.lang.Math.min(r3, r1)
        L_0x0394:
            d1.g r2 = r0.f8532e
            r2.d(r1)
        L_0x0399:
            d1.g r1 = r0.f8532e
            boolean r1 = r1.f8512j
            if (r1 != 0) goto L_0x03a0
            return
        L_0x03a0:
            d1.f r1 = r0.f8535h
            java.util.ArrayList r1 = r1.f8514l
            java.lang.Object r1 = r1.get(r4)
            d1.f r1 = (d1.f) r1
            d1.f r2 = r0.f8536i
            java.util.ArrayList r2 = r2.f8514l
            java.lang.Object r2 = r2.get(r4)
            d1.f r2 = (d1.f) r2
            int r3 = r1.f8509g
            d1.f r4 = r0.f8535h
            int r5 = r4.f8508f
            int r5 = r5 + r3
            int r7 = r2.f8509g
            d1.f r8 = r0.f8536i
            int r8 = r8.f8508f
            int r8 = r8 + r7
            c1.e r9 = r0.f8529b
            float r9 = r9.f4432g0
            if (r1 != r2) goto L_0x03ca
            r9 = r6
            goto L_0x03cc
        L_0x03ca:
            r3 = r5
            r7 = r8
        L_0x03cc:
            int r7 = r7 - r3
            d1.g r1 = r0.f8532e
            int r1 = r1.f8509g
            int r7 = r7 - r1
            float r1 = (float) r3
            float r1 = r1 + r6
            float r2 = (float) r7
            float r2 = r2 * r9
            float r2 = r2 + r1
            int r1 = (int) r2
            r4.d(r1)
            d1.f r1 = r0.f8536i
            d1.f r2 = r0.f8535h
            int r2 = r2.f8509g
            d1.g r3 = r0.f8532e
            int r3 = r3.f8509g
            int r2 = r2 + r3
            r1.d(r2)
        L_0x03e9:
            return
        L_0x03ea:
            c1.e r1 = r0.f8529b
            c1.d r2 = r1.K
            c1.d r1 = r1.M
            r0.l(r2, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.l.a(d1.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r3 = r9.f8529b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            c1.e$a r0 = c1.e.a.MATCH_CONSTRAINT
            c1.e$a r1 = c1.e.a.MATCH_PARENT
            c1.e$a r2 = c1.e.a.FIXED
            c1.e r3 = r9.f8529b
            boolean r4 = r3.f4419a
            if (r4 == 0) goto L_0x0015
            d1.g r4 = r9.f8532e
            int r3 = r3.u()
            r4.d(r3)
        L_0x0015:
            d1.g r3 = r9.f8532e
            boolean r4 = r3.f8512j
            r5 = 0
            if (r4 != 0) goto L_0x007d
            c1.e r4 = r9.f8529b
            c1.e$a[] r6 = r4.V
            r6 = r6[r5]
            r9.f8531d = r6
            if (r6 == r0) goto L_0x00b1
            if (r6 != r1) goto L_0x0073
            c1.e r7 = r4.W
            if (r7 == 0) goto L_0x0073
            c1.e$a[] r8 = r7.V
            r8 = r8[r5]
            if (r8 == r2) goto L_0x0034
            if (r8 != r1) goto L_0x0073
        L_0x0034:
            int r0 = r7.u()
            c1.e r1 = r9.f8529b
            c1.d r1 = r1.K
            int r1 = r1.e()
            int r0 = r0 - r1
            c1.e r1 = r9.f8529b
            c1.d r1 = r1.M
            int r1 = r1.e()
            int r0 = r0 - r1
            d1.f r1 = r9.f8535h
            d1.l r2 = r7.f4425d
            d1.f r2 = r2.f8535h
            c1.e r3 = r9.f8529b
            c1.d r3 = r3.K
            int r3 = r3.e()
            d1.p.b(r1, r2, r3)
            d1.f r1 = r9.f8536i
            d1.l r2 = r7.f4425d
            d1.f r2 = r2.f8536i
            c1.e r3 = r9.f8529b
            c1.d r3 = r3.M
            int r3 = r3.e()
            int r3 = -r3
            d1.p.b(r1, r2, r3)
            d1.g r1 = r9.f8532e
            r1.d(r0)
            return
        L_0x0073:
            if (r6 != r2) goto L_0x00b1
            int r1 = r4.u()
            r3.d(r1)
            goto L_0x00b1
        L_0x007d:
            c1.e$a r3 = r9.f8531d
            if (r3 != r1) goto L_0x00b1
            c1.e r3 = r9.f8529b
            c1.e r4 = r3.W
            if (r4 == 0) goto L_0x00b1
            c1.e$a[] r6 = r4.V
            r6 = r6[r5]
            if (r6 == r2) goto L_0x008f
            if (r6 != r1) goto L_0x00b1
        L_0x008f:
            d1.f r0 = r9.f8535h
            d1.l r1 = r4.f4425d
            d1.f r1 = r1.f8535h
            c1.d r2 = r3.K
            int r2 = r2.e()
            d1.p.b(r0, r1, r2)
            d1.f r0 = r9.f8536i
            d1.l r1 = r4.f4425d
            d1.f r1 = r1.f8536i
            c1.e r2 = r9.f8529b
            c1.d r2 = r2.M
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r0, r1, r2)
            return
        L_0x00b1:
            d1.g r1 = r9.f8532e
            boolean r2 = r1.f8512j
            r3 = 1
            if (r2 == 0) goto L_0x01b0
            c1.e r2 = r9.f8529b
            boolean r4 = r2.f4419a
            if (r4 == 0) goto L_0x01b0
            c1.d[] r0 = r2.S
            r1 = r0[r5]
            c1.d r4 = r1.f4406f
            if (r4 == 0) goto L_0x0132
            r6 = r0[r3]
            c1.d r6 = r6.f4406f
            if (r6 == 0) goto L_0x0132
            boolean r0 = r2.B()
            if (r0 == 0) goto L_0x00f1
            d1.f r0 = r9.f8535h
            c1.e r1 = r9.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r5]
            int r1 = r1.e()
            r0.f8508f = r1
            d1.f r0 = r9.f8536i
            c1.e r1 = r9.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r3]
            int r1 = r1.e()
            int r1 = -r1
            r0.f8508f = r1
            goto L_0x039c
        L_0x00f1:
            c1.e r0 = r9.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r5]
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x010c
            d1.f r1 = r9.f8535h
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r5]
            int r2 = r2.e()
            d1.p.b(r1, r0, r2)
        L_0x010c:
            c1.e r0 = r9.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r3]
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x0128
            d1.f r1 = r9.f8536i
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
        L_0x0128:
            d1.f r0 = r9.f8535h
            r0.f8504b = r3
            d1.f r0 = r9.f8536i
            r0.f8504b = r3
            goto L_0x039c
        L_0x0132:
            if (r4 == 0) goto L_0x0156
            d1.f r0 = d1.p.h(r1)
            if (r0 == 0) goto L_0x039c
            d1.f r1 = r9.f8535h
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r5]
            int r2 = r2.e()
            d1.p.b(r1, r0, r2)
            d1.f r0 = r9.f8536i
            d1.f r1 = r9.f8535h
            d1.g r2 = r9.f8532e
            int r2 = r2.f8509g
            d1.p.b(r0, r1, r2)
            goto L_0x039c
        L_0x0156:
            r0 = r0[r3]
            c1.d r1 = r0.f4406f
            if (r1 == 0) goto L_0x0180
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x039c
            d1.f r1 = r9.f8536i
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
            d1.f r0 = r9.f8535h
            d1.f r1 = r9.f8536i
            d1.g r2 = r9.f8532e
            int r2 = r2.f8509g
            int r2 = -r2
            d1.p.b(r0, r1, r2)
            goto L_0x039c
        L_0x0180:
            boolean r0 = r2 instanceof c1.i
            if (r0 != 0) goto L_0x039c
            c1.e r0 = r2.W
            if (r0 == 0) goto L_0x039c
            c1.d$a r0 = c1.d.a.CENTER
            c1.d r0 = r2.m(r0)
            c1.d r0 = r0.f4406f
            if (r0 != 0) goto L_0x039c
            c1.e r0 = r9.f8529b
            c1.e r1 = r0.W
            d1.l r1 = r1.f4425d
            d1.f r1 = r1.f8535h
            d1.f r2 = r9.f8535h
            int r0 = r0.v()
            d1.p.b(r2, r1, r0)
            d1.f r0 = r9.f8536i
            d1.f r1 = r9.f8535h
            d1.g r2 = r9.f8532e
            int r2 = r2.f8509g
            d1.p.b(r0, r1, r2)
            goto L_0x039c
        L_0x01b0:
            c1.e$a r2 = r9.f8531d
            if (r2 != r0) goto L_0x02df
            c1.e r0 = r9.f8529b
            int r2 = r0.f4455s
            r4 = 2
            if (r2 == r4) goto L_0x02b6
            r4 = 3
            if (r2 == r4) goto L_0x01c0
            goto L_0x02df
        L_0x01c0:
            int r2 = r0.f4457t
            if (r2 != r4) goto L_0x0265
            d1.f r2 = r9.f8535h
            r2.f8503a = r9
            d1.f r2 = r9.f8536i
            r2.f8503a = r9
            d1.n r2 = r0.f4427e
            d1.f r4 = r2.f8535h
            r4.f8503a = r9
            d1.f r2 = r2.f8536i
            r2.f8503a = r9
            r1.f8503a = r9
            boolean r0 = r0.C()
            if (r0 == 0) goto L_0x0232
            d1.g r0 = r9.f8532e
            java.util.ArrayList r0 = r0.f8514l
            c1.e r1 = r9.f8529b
            d1.n r1 = r1.f4427e
            d1.g r1 = r1.f8532e
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.g r1 = r0.f8532e
            r1.f8503a = r9
            d1.g r1 = r9.f8532e
            java.util.ArrayList r1 = r1.f8514l
            d1.f r0 = r0.f8535h
            r1.add(r0)
            d1.g r0 = r9.f8532e
            java.util.ArrayList r0 = r0.f8514l
            c1.e r1 = r9.f8529b
            d1.n r1 = r1.f4427e
            d1.f r1 = r1.f8536i
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8535h
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8536i
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            goto L_0x02df
        L_0x0232:
            c1.e r0 = r9.f8529b
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x0256
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r0 = r0.f8514l
            d1.g r1 = r9.f8532e
            r0.add(r1)
            d1.g r0 = r9.f8532e
            java.util.ArrayList r0 = r0.f8513k
            c1.e r1 = r9.f8529b
            d1.n r1 = r1.f4427e
            d1.g r1 = r1.f8532e
            r0.add(r1)
            goto L_0x02df
        L_0x0256:
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r0 = r0.f8514l
            d1.g r1 = r9.f8532e
            r0.add(r1)
            goto L_0x02df
        L_0x0265:
            d1.n r0 = r0.f4427e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r1 = r1.f8514l
            r1.add(r0)
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8535h
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            c1.e r0 = r9.f8529b
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8536i
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            d1.g r0 = r9.f8532e
            r0.f8504b = r3
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r9.f8535h
            r0.add(r1)
            d1.g r0 = r9.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r9.f8536i
            r0.add(r1)
            d1.f r0 = r9.f8535h
            java.util.ArrayList r0 = r0.f8514l
            d1.g r1 = r9.f8532e
            r0.add(r1)
            d1.f r0 = r9.f8536i
            java.util.ArrayList r0 = r0.f8514l
            d1.g r1 = r9.f8532e
            r0.add(r1)
            goto L_0x02df
        L_0x02b6:
            c1.e r0 = r0.W
            if (r0 != 0) goto L_0x02bb
            goto L_0x02df
        L_0x02bb:
            d1.n r0 = r0.f4427e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r1 = r1.f8514l
            r1.add(r0)
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r9.f8532e
            r0.add(r1)
            d1.g r0 = r9.f8532e
            r0.f8504b = r3
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r9.f8535h
            r0.add(r1)
            d1.g r0 = r9.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r9.f8536i
            r0.add(r1)
        L_0x02df:
            c1.e r0 = r9.f8529b
            c1.d[] r1 = r0.S
            r2 = r1[r5]
            c1.d r4 = r2.f4406f
            if (r4 == 0) goto L_0x0336
            r6 = r1[r3]
            c1.d r6 = r6.f4406f
            if (r6 == 0) goto L_0x0336
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x0314
            d1.f r0 = r9.f8535h
            c1.e r1 = r9.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r5]
            int r1 = r1.e()
            r0.f8508f = r1
            d1.f r0 = r9.f8536i
            c1.e r1 = r9.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r3]
            int r1 = r1.e()
            int r1 = -r1
            r0.f8508f = r1
            goto L_0x039c
        L_0x0314:
            c1.e r0 = r9.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r5]
            d1.f r0 = d1.p.h(r0)
            c1.e r1 = r9.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r3]
            d1.f r1 = d1.p.h(r1)
            if (r0 == 0) goto L_0x032d
            r0.b(r9)
        L_0x032d:
            if (r1 == 0) goto L_0x0332
            r1.b(r9)
        L_0x0332:
            r0 = 4
            r9.f8537j = r0
            goto L_0x039c
        L_0x0336:
            if (r4 == 0) goto L_0x0357
            d1.f r0 = d1.p.h(r2)
            if (r0 == 0) goto L_0x039c
            d1.f r1 = r9.f8535h
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r5]
            int r2 = r2.e()
            d1.p.b(r1, r0, r2)
            d1.f r0 = r9.f8536i
            d1.f r1 = r9.f8535h
            d1.g r2 = r9.f8532e
            r9.c(r0, r1, r3, r2)
            goto L_0x039c
        L_0x0357:
            r1 = r1[r3]
            c1.d r2 = r1.f4406f
            if (r2 == 0) goto L_0x037e
            d1.f r0 = d1.p.h(r1)
            if (r0 == 0) goto L_0x039c
            d1.f r1 = r9.f8536i
            c1.e r2 = r9.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
            d1.f r0 = r9.f8535h
            d1.f r1 = r9.f8536i
            r2 = -1
            d1.g r3 = r9.f8532e
            r9.c(r0, r1, r2, r3)
            goto L_0x039c
        L_0x037e:
            boolean r1 = r0 instanceof c1.i
            if (r1 != 0) goto L_0x039c
            c1.e r1 = r0.W
            if (r1 == 0) goto L_0x039c
            d1.l r1 = r1.f4425d
            d1.f r1 = r1.f8535h
            d1.f r2 = r9.f8535h
            int r0 = r0.v()
            d1.p.b(r2, r1, r0)
            d1.f r0 = r9.f8536i
            d1.f r1 = r9.f8535h
            d1.g r2 = r9.f8532e
            r9.c(r0, r1, r3, r2)
        L_0x039c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.l.d():void");
    }

    public final void e() {
        f fVar = this.f8535h;
        if (fVar.f8512j) {
            this.f8529b.f4422b0 = fVar.f8509g;
        }
    }

    public final void f() {
        this.f8530c = null;
        this.f8535h.c();
        this.f8536i.c();
        this.f8532e.c();
        this.f8534g = false;
    }

    public final boolean k() {
        if (this.f8531d != e.a.MATCH_CONSTRAINT || this.f8529b.f4455s == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f8534g = false;
        this.f8535h.c();
        this.f8535h.f8512j = false;
        this.f8536i.c();
        this.f8536i.f8512j = false;
        this.f8532e.f8512j = false;
    }

    public final String toString() {
        StringBuilder q10 = a.q("HorizontalRun ");
        q10.append(this.f8529b.f4442l0);
        return q10.toString();
    }
}
