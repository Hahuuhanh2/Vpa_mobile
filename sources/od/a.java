package od;

import java.util.Map;
import uc.b;
import uc.g;
import uc.h;
import uc.j;
import vl.d;

/* compiled from: PDF417Reader */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final h[] f13863a = new h[0];

    public static int c(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return 0;
        }
        return (int) Math.abs(jVar.f15488a - jVar2.f15488a);
    }

    public static int d(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(jVar.f15488a - jVar2.f15488a);
    }

    public final h a(d dVar) {
        return b(dVar, (Map<b, ?>) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: pd.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0155, code lost:
        if (r13.f14144e != r8.f14144e) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06c2, code lost:
        r4 = new uc.h(r2.f4702b, (byte[]) null, r3, uc.a.PDF_417);
        r4.b(uc.i.ERROR_CORRECTION_LEVEL, r2.f4704d);
        r2 = (od.b) r2.f4705e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06d7, code lost:
        if (r2 == null) goto L_0x06de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06d9, code lost:
        r4.b(uc.i.PDF417_EXTRA_METADATA, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06de, code lost:
        r0.add(r4);
        r4 = r8;
        r7 = 1;
        r2 = r26;
        r5 = -1;
        r6 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x071e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h b(vl.d r34, java.util.Map<uc.b, ?> r35) {
        /*
            r33 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cd.b r1 = r34.e()
            java.util.ArrayList r2 = p3.l0.D(r1)
            boolean r3 = r2.isEmpty()
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x006c
            cd.b r2 = new cd.b
            int r3 = r1.f4689a
            int r8 = r1.f4690b
            int r9 = r1.f4691c
            int[] r1 = r1.f4692d
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r2.<init>(r3, r8, r9, r1)
            cd.a r1 = new cd.a
            r1.<init>(r3)
            cd.a r9 = new cd.a
            r9.<init>(r3)
            int r8 = r8 + r7
            int r8 = r8 / r4
            r3 = r6
        L_0x0037:
            if (r3 >= r8) goto L_0x0063
            cd.a r1 = r2.e(r3, r1)
            int r10 = r2.f4690b
            int r10 = r10 + r5
            int r10 = r10 - r3
            cd.a r9 = r2.e(r10, r9)
            r1.k()
            r9.k()
            int[] r11 = r9.f4687a
            int[] r12 = r2.f4692d
            int r13 = r2.f4691c
            int r14 = r3 * r13
            java.lang.System.arraycopy(r11, r6, r12, r14, r13)
            int[] r11 = r1.f4687a
            int[] r12 = r2.f4692d
            int r13 = r2.f4691c
            int r10 = r10 * r13
            java.lang.System.arraycopy(r11, r6, r12, r10, r13)
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0063:
            java.util.ArrayList r1 = p3.l0.D(r2)
            r32 = r2
            r2 = r1
            r1 = r32
        L_0x006c:
            java.util.Iterator r2 = r2.iterator()
        L_0x0070:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0721
            java.lang.Object r3 = r2.next()
            uc.j[] r3 = (uc.j[]) r3
            r16 = 4
            r14 = r3[r16]
            r17 = 5
            r11 = r3[r17]
            r18 = 6
            r15 = r3[r18]
            r19 = 7
            r13 = r3[r19]
            r8 = r3[r6]
            int r8 = d(r8, r14)
            r9 = r3[r18]
            r10 = r3[r4]
            int r9 = d(r9, r10)
            int r9 = r9 * 17
            int r9 = r9 / 18
            int r8 = java.lang.Math.min(r8, r9)
            r9 = r3[r7]
            r10 = r3[r17]
            int r9 = d(r9, r10)
            r10 = r3[r19]
            r20 = 3
            r12 = r3[r20]
            int r10 = d(r10, r12)
            int r10 = r10 * 17
            int r10 = r10 / 18
            int r9 = java.lang.Math.min(r9, r10)
            int r21 = java.lang.Math.min(r8, r9)
            r8 = r3[r6]
            r9 = r3[r16]
            int r8 = c(r8, r9)
            r9 = r3[r18]
            r10 = r3[r4]
            int r9 = c(r9, r10)
            int r9 = r9 * 17
            int r9 = r9 / 18
            int r8 = java.lang.Math.max(r8, r9)
            r9 = r3[r7]
            r10 = r3[r17]
            int r9 = c(r9, r10)
            r10 = r3[r19]
            r12 = r3[r20]
            int r10 = c(r10, r12)
            int r10 = r10 * 17
            int r10 = r10 / 18
            int r9 = java.lang.Math.max(r9, r10)
            int r22 = java.lang.Math.max(r8, r9)
            z.j r8 = pd.i.f14170a
            pd.c r23 = new pd.c
            r8 = r23
            r9 = r1
            r10 = r14
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r13 = 0
            r24 = r7
            r8 = r13
            r12 = r23
            r23 = r8
        L_0x0108:
            if (r14 == 0) goto L_0x0119
            r11 = 1
            r8 = r1
            r9 = r12
            r10 = r14
            r34 = r12
            r12 = r21
            r13 = r22
            pd.g r8 = pd.i.d(r8, r9, r10, r11, r12, r13)
            goto L_0x011b
        L_0x0119:
            r34 = r12
        L_0x011b:
            r25 = r8
            if (r15 == 0) goto L_0x012e
            r11 = 0
            r8 = r1
            r9 = r34
            r10 = r15
            r12 = r21
            r13 = r22
            pd.g r8 = pd.i.d(r8, r9, r10, r11, r12, r13)
            r23 = r8
        L_0x012e:
            if (r25 != 0) goto L_0x0133
            if (r23 != 0) goto L_0x0133
            goto L_0x0162
        L_0x0133:
            if (r25 == 0) goto L_0x0158
            pd.a r13 = r25.f()
            if (r13 != 0) goto L_0x013c
            goto L_0x0158
        L_0x013c:
            if (r23 == 0) goto L_0x0160
            pd.a r8 = r23.f()
            if (r8 != 0) goto L_0x0145
            goto L_0x0160
        L_0x0145:
            int r9 = r13.f14140a
            int r10 = r8.f14140a
            if (r9 == r10) goto L_0x0160
            int r9 = r13.f14141b
            int r10 = r8.f14141b
            if (r9 == r10) goto L_0x0160
            int r9 = r13.f14144e
            int r8 = r8.f14144e
            if (r9 == r8) goto L_0x0160
            goto L_0x015a
        L_0x0158:
            if (r23 != 0) goto L_0x015c
        L_0x015a:
            r13 = 0
            goto L_0x0160
        L_0x015c:
            pd.a r13 = r23.f()
        L_0x0160:
            if (r13 != 0) goto L_0x0164
        L_0x0162:
            r4 = 0
            goto L_0x0194
        L_0x0164:
            pd.c r8 = pd.i.a(r25)
            pd.c r9 = pd.i.a(r23)
            if (r8 != 0) goto L_0x0170
            r8 = r9
            goto L_0x018f
        L_0x0170:
            if (r9 != 0) goto L_0x0173
            goto L_0x018f
        L_0x0173:
            pd.c r10 = new pd.c
            cd.b r11 = r8.f14146a
            uc.j r12 = r8.f14147b
            uc.j r8 = r8.f14148c
            uc.j r4 = r9.f14149d
            uc.j r9 = r9.f14150e
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r8
            r30 = r4
            r31 = r9
            r26.<init>(r27, r28, r29, r30, r31)
            r8 = r10
        L_0x018f:
            pd.f r4 = new pd.f
            r4.<init>(r13, r8)
        L_0x0194:
            if (r4 == 0) goto L_0x071e
            java.lang.Object r8 = r4.f14167e
            r12 = r8
            pd.c r12 = (pd.c) r12
            if (r24 == 0) goto L_0x01b5
            if (r12 == 0) goto L_0x01b5
            int r8 = r12.f14153h
            r13 = r34
            int r9 = r13.f14153h
            if (r8 < r9) goto L_0x01ad
            int r8 = r12.f14154i
            int r9 = r13.f14154i
            if (r8 <= r9) goto L_0x01b7
        L_0x01ad:
            r24 = r6
            r8 = r25
            r4 = 2
            r13 = 0
            goto L_0x0108
        L_0x01b5:
            r13 = r34
        L_0x01b7:
            r4.f14167e = r13
            int r8 = r4.f14164b
            int r15 = r8 + 1
            java.lang.Object r8 = r4.f14166d
            r9 = r8
            x2.g[] r9 = (x2.g[]) r9
            r9[r6] = r25
            x2.g[] r8 = (x2.g[]) r8
            r8[r15] = r23
            if (r25 == 0) goto L_0x01cd
            r23 = r7
            goto L_0x01cf
        L_0x01cd:
            r23 = r6
        L_0x01cf:
            r14 = r7
        L_0x01d0:
            if (r14 > r15) goto L_0x036d
            if (r23 == 0) goto L_0x01d6
            r12 = r14
            goto L_0x01d9
        L_0x01d6:
            int r8 = r15 - r14
            r12 = r8
        L_0x01d9:
            java.lang.Object r8 = r4.f14166d
            x2.g[] r8 = (x2.g[]) r8
            r8 = r8[r12]
            if (r8 != 0) goto L_0x0358
            if (r12 == 0) goto L_0x01ed
            if (r12 != r15) goto L_0x01e6
            goto L_0x01ed
        L_0x01e6:
            x2.g r8 = new x2.g
            r8.<init>((pd.c) r13)
        L_0x01eb:
            r11 = r8
            goto L_0x01f8
        L_0x01ed:
            pd.g r8 = new pd.g
            if (r12 != 0) goto L_0x01f3
            r9 = r7
            goto L_0x01f4
        L_0x01f3:
            r9 = r6
        L_0x01f4:
            r8.<init>(r13, r9)
            goto L_0x01eb
        L_0x01f8:
            java.lang.Object r8 = r4.f14166d
            x2.g[] r8 = (x2.g[]) r8
            r8[r12] = r11
            int r8 = r13.f14153h
            r6 = r5
            r10 = r8
            r9 = r21
            r8 = r22
        L_0x0206:
            int r5 = r13.f14154i
            if (r10 > r5) goto L_0x0349
            if (r23 == 0) goto L_0x020e
            r5 = r7
            goto L_0x020f
        L_0x020e:
            r5 = -1
        L_0x020f:
            int r7 = r12 - r5
            r26 = r2
            if (r7 < 0) goto L_0x021f
            int r2 = r4.f14164b
            r21 = 1
            int r2 = r2 + 1
            if (r7 > r2) goto L_0x021f
            r2 = 1
            goto L_0x0220
        L_0x021f:
            r2 = 0
        L_0x0220:
            if (r2 == 0) goto L_0x0235
            java.lang.Object r2 = r4.f14166d
            x2.g[] r2 = (x2.g[]) r2
            r2 = r2[r7]
            r21 = r8
            java.lang.Object r8 = r2.f16905c
            pd.d[] r8 = (pd.d[]) r8
            int r2 = r2.d(r10)
            r2 = r8[r2]
            goto L_0x0238
        L_0x0235:
            r21 = r8
            r2 = 0
        L_0x0238:
            if (r2 == 0) goto L_0x0242
            if (r23 == 0) goto L_0x023f
            int r2 = r2.f14156b
            goto L_0x0278
        L_0x023f:
            int r2 = r2.f14155a
            goto L_0x0278
        L_0x0242:
            java.lang.Object r2 = r4.f14166d
            x2.g[] r2 = (x2.g[]) r2
            r2 = r2[r12]
            pd.d r2 = r2.c(r10)
            if (r2 == 0) goto L_0x0256
            if (r23 == 0) goto L_0x0253
            int r2 = r2.f14155a
            goto L_0x0278
        L_0x0253:
            int r2 = r2.f14156b
            goto L_0x0278
        L_0x0256:
            if (r7 < 0) goto L_0x0262
            int r8 = r4.f14164b
            r22 = 1
            int r8 = r8 + 1
            if (r7 > r8) goto L_0x0262
            r8 = 1
            goto L_0x0263
        L_0x0262:
            r8 = 0
        L_0x0263:
            if (r8 == 0) goto L_0x026f
            java.lang.Object r2 = r4.f14166d
            x2.g[] r2 = (x2.g[]) r2
            r2 = r2[r7]
            pd.d r2 = r2.c(r10)
        L_0x026f:
            if (r2 == 0) goto L_0x027b
            if (r23 == 0) goto L_0x0276
            int r2 = r2.f14156b
            goto L_0x0278
        L_0x0276:
            int r2 = r2.f14155a
        L_0x0278:
            r27 = r9
            goto L_0x02d2
        L_0x027b:
            r7 = r12
            r2 = 0
        L_0x027d:
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x028a
            int r8 = r4.f14164b
            r22 = 1
            int r8 = r8 + 1
            if (r7 > r8) goto L_0x028a
            r8 = 1
            goto L_0x028b
        L_0x028a:
            r8 = 0
        L_0x028b:
            if (r8 == 0) goto L_0x02c1
            java.lang.Object r8 = r4.f14166d
            x2.g[] r8 = (x2.g[]) r8
            r8 = r8[r7]
            java.lang.Object r8 = r8.f16905c
            pd.d[] r8 = (pd.d[]) r8
            r22 = r7
            int r7 = r8.length
            r27 = r9
            r9 = 0
        L_0x029d:
            if (r9 >= r7) goto L_0x02ba
            r28 = r7
            r7 = r8[r9]
            if (r7 == 0) goto L_0x02b5
            if (r23 == 0) goto L_0x02aa
            int r8 = r7.f14156b
            goto L_0x02ac
        L_0x02aa:
            int r8 = r7.f14155a
        L_0x02ac:
            int r5 = r5 * r2
            int r2 = r7.f14156b
            int r7 = r7.f14155a
            int r2 = r2 - r7
            int r2 = r2 * r5
            int r2 = r2 + r8
            goto L_0x02d2
        L_0x02b5:
            int r9 = r9 + 1
            r7 = r28
            goto L_0x029d
        L_0x02ba:
            int r2 = r2 + 1
            r7 = r22
            r9 = r27
            goto L_0x027d
        L_0x02c1:
            r27 = r9
            if (r23 == 0) goto L_0x02cc
            java.lang.Object r2 = r4.f14167e
            pd.c r2 = (pd.c) r2
            int r2 = r2.f14151f
            goto L_0x02d2
        L_0x02cc:
            java.lang.Object r2 = r4.f14167e
            pd.c r2 = (pd.c) r2
            int r2 = r2.f14152g
        L_0x02d2:
            if (r2 < 0) goto L_0x02d8
            int r5 = r13.f14152g
            if (r2 <= r5) goto L_0x02dc
        L_0x02d8:
            r2 = -1
            if (r6 == r2) goto L_0x0328
            r2 = r6
        L_0x02dc:
            int r9 = r13.f14151f
            int r5 = r13.f14152g
            r7 = r21
            r8 = r1
            r21 = r27
            r22 = r10
            r10 = r5
            r5 = r11
            r11 = r23
            r27 = r12
            r12 = r2
            r28 = r13
            r13 = r22
            r29 = r14
            r14 = r21
            r30 = r15
            r15 = r7
            pd.d r8 = pd.i.c(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x0323
            java.lang.Object r6 = r5.f16905c
            pd.d[] r6 = (pd.d[]) r6
            r9 = r22
            int r10 = r5.d(r9)
            r6[r10] = r8
            int r6 = r8.f14156b
            int r10 = r8.f14155a
            int r6 = r6 - r10
            r10 = r21
            int r6 = java.lang.Math.min(r10, r6)
            int r10 = r8.f14156b
            int r8 = r8.f14155a
            int r10 = r10 - r8
            int r7 = java.lang.Math.max(r7, r10)
            r10 = r6
            r8 = r7
            r6 = r2
            goto L_0x0337
        L_0x0323:
            r10 = r21
            r9 = r22
            goto L_0x0336
        L_0x0328:
            r9 = r10
            r5 = r11
            r28 = r13
            r29 = r14
            r30 = r15
            r7 = r21
            r10 = r27
            r27 = r12
        L_0x0336:
            r8 = r7
        L_0x0337:
            int r2 = r9 + 1
            r11 = r5
            r9 = r10
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r7 = 1
            r10 = r2
            r2 = r26
            goto L_0x0206
        L_0x0349:
            r26 = r2
            r7 = r8
            r10 = r9
            r28 = r13
            r29 = r14
            r30 = r15
            r22 = r7
            r21 = r10
            goto L_0x0360
        L_0x0358:
            r26 = r2
            r28 = r13
            r29 = r14
            r30 = r15
        L_0x0360:
            int r14 = r29 + 1
            r2 = r26
            r13 = r28
            r15 = r30
            r5 = -1
            r6 = 0
            r7 = 1
            goto L_0x01d0
        L_0x036d:
            r26 = r2
            java.lang.Object r2 = r4.f14165c
            pd.a r2 = (pd.a) r2
            int r2 = r2.f14144e
            int r5 = r4.f14164b
            r6 = 2
            int r5 = r5 + r6
            int[] r7 = new int[r6]
            r6 = 1
            r7[r6] = r5
            r5 = 0
            r7[r5] = r2
            java.lang.Class<pd.b> r2 = pd.b.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r7)
            pd.b[][] r2 = (pd.b[][]) r2
            r5 = 0
        L_0x038a:
            int r6 = r2.length
            if (r5 >= r6) goto L_0x03a0
            r6 = 0
        L_0x038e:
            r7 = r2[r5]
            int r8 = r7.length
            if (r6 >= r8) goto L_0x039d
            pd.b r8 = new pd.b
            r8.<init>()
            r7[r6] = r8
            int r6 = r6 + 1
            goto L_0x038e
        L_0x039d:
            int r5 = r5 + 1
            goto L_0x038a
        L_0x03a0:
            java.lang.Object r5 = r4.f14166d
            x2.g[] r5 = (x2.g[]) r5
            r6 = 0
            r5 = r5[r6]
            r4.a(r5)
            java.lang.Object r5 = r4.f14166d
            x2.g[] r5 = (x2.g[]) r5
            int r6 = r4.f14164b
            r7 = 1
            int r6 = r6 + r7
            r5 = r5[r6]
            r4.a(r5)
            r6 = 928(0x3a0, float:1.3E-42)
        L_0x03b9:
            java.lang.Object r8 = r4.f14166d
            x2.g[] r8 = (x2.g[]) r8
            r9 = 0
            r10 = r8[r9]
            if (r10 == 0) goto L_0x0419
            int r9 = r4.f14164b
            int r9 = r9 + r7
            r7 = r8[r9]
            if (r7 != 0) goto L_0x03ca
            goto L_0x0419
        L_0x03ca:
            java.lang.Object r8 = r10.f16905c
            pd.d[] r8 = (pd.d[]) r8
            java.lang.Object r7 = r7.f16905c
            pd.d[] r7 = (pd.d[]) r7
            r9 = 0
        L_0x03d3:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x0419
            r10 = r8[r9]
            if (r10 == 0) goto L_0x0415
            r11 = r7[r9]
            if (r11 == 0) goto L_0x0415
            int r10 = r10.f14159e
            int r11 = r11.f14159e
            if (r10 != r11) goto L_0x0415
            r10 = 1
        L_0x03e5:
            int r11 = r4.f14164b
            if (r10 > r11) goto L_0x0415
            java.lang.Object r11 = r4.f14166d
            x2.g[] r11 = (x2.g[]) r11
            r11 = r11[r10]
            java.lang.Object r11 = r11.f16905c
            pd.d[] r11 = (pd.d[]) r11
            r11 = r11[r9]
            if (r11 == 0) goto L_0x0411
            r12 = r8[r9]
            int r12 = r12.f14159e
            r11.f14159e = r12
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0411
            java.lang.Object r11 = r4.f14166d
            x2.g[] r11 = (x2.g[]) r11
            r11 = r11[r10]
            java.lang.Object r11 = r11.f16905c
            pd.d[] r11 = (pd.d[]) r11
            r12 = 0
            r11[r9] = r12
            goto L_0x0412
        L_0x0411:
            r12 = 0
        L_0x0412:
            int r10 = r10 + 1
            goto L_0x03e5
        L_0x0415:
            r12 = 0
            int r9 = r9 + 1
            goto L_0x03d3
        L_0x0419:
            r12 = 0
            java.lang.Object r7 = r4.f14166d
            x2.g[] r7 = (x2.g[]) r7
            r8 = 0
            r7 = r7[r8]
            if (r7 != 0) goto L_0x0425
            r9 = 0
            goto L_0x047b
        L_0x0425:
            java.lang.Object r7 = r7.f16905c
            pd.d[] r7 = (pd.d[]) r7
            r8 = 0
            r9 = 0
        L_0x042b:
            int r10 = r7.length
            if (r8 >= r10) goto L_0x047b
            r10 = r7[r8]
            if (r10 == 0) goto L_0x0477
            int r10 = r10.f14159e
            r11 = r9
            r9 = 0
            r13 = 1
        L_0x0437:
            int r14 = r4.f14164b
            r15 = 1
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x0476
            r14 = 2
            if (r9 >= r14) goto L_0x0476
            java.lang.Object r14 = r4.f14166d
            x2.g[] r14 = (x2.g[]) r14
            r14 = r14[r13]
            java.lang.Object r14 = r14.f16905c
            pd.d[] r14 = (pd.d[]) r14
            r14 = r14[r8]
            if (r14 == 0) goto L_0x0472
            boolean r15 = r14.a()
            if (r15 != 0) goto L_0x046a
            r15 = -1
            if (r10 == r15) goto L_0x0461
            int r15 = r14.f14157c
            int r21 = r10 % 3
            int r12 = r21 * 3
            if (r15 != r12) goto L_0x0461
            r12 = 1
            goto L_0x0462
        L_0x0461:
            r12 = 0
        L_0x0462:
            if (r12 == 0) goto L_0x0468
            r14.f14159e = r10
            r9 = 0
            goto L_0x046a
        L_0x0468:
            int r9 = r9 + 1
        L_0x046a:
            boolean r12 = r14.a()
            if (r12 != 0) goto L_0x0472
            int r11 = r11 + 1
        L_0x0472:
            int r13 = r13 + 1
            r12 = 0
            goto L_0x0437
        L_0x0476:
            r9 = r11
        L_0x0477:
            int r8 = r8 + 1
            r12 = 0
            goto L_0x042b
        L_0x047b:
            java.lang.Object r7 = r4.f14166d
            x2.g[] r7 = (x2.g[]) r7
            int r8 = r4.f14164b
            r10 = 1
            int r8 = r8 + r10
            r7 = r7[r8]
            if (r7 != 0) goto L_0x0489
            r10 = 0
            goto L_0x04e0
        L_0x0489:
            java.lang.Object r7 = r7.f16905c
            pd.d[] r7 = (pd.d[]) r7
            r8 = 0
            r10 = 0
        L_0x048f:
            int r11 = r7.length
            if (r8 >= r11) goto L_0x04e0
            r11 = r7[r8]
            if (r11 == 0) goto L_0x04dd
            int r11 = r11.f14159e
            int r12 = r4.f14164b
            r13 = 1
            int r12 = r12 + r13
            r13 = r12
            r12 = r10
            r10 = 0
        L_0x049f:
            if (r13 <= 0) goto L_0x04dc
            r14 = 2
            if (r10 >= r14) goto L_0x04dc
            java.lang.Object r14 = r4.f14166d
            x2.g[] r14 = (x2.g[]) r14
            r14 = r14[r13]
            java.lang.Object r14 = r14.f16905c
            pd.d[] r14 = (pd.d[]) r14
            r14 = r14[r8]
            if (r14 == 0) goto L_0x04d9
            boolean r15 = r14.a()
            if (r15 != 0) goto L_0x04cf
            r15 = -1
            if (r11 == r15) goto L_0x04c5
            int r15 = r14.f14157c
            int r21 = r11 % 3
            int r5 = r21 * 3
            if (r15 != r5) goto L_0x04c5
            r5 = 1
            goto L_0x04c6
        L_0x04c5:
            r5 = 0
        L_0x04c6:
            if (r5 == 0) goto L_0x04cc
            r14.f14159e = r11
            r5 = 0
            goto L_0x04d0
        L_0x04cc:
            int r5 = r10 + 1
            goto L_0x04d0
        L_0x04cf:
            r5 = r10
        L_0x04d0:
            boolean r10 = r14.a()
            if (r10 != 0) goto L_0x04d8
            int r12 = r12 + 1
        L_0x04d8:
            r10 = r5
        L_0x04d9:
            int r13 = r13 + -1
            goto L_0x049f
        L_0x04dc:
            r10 = r12
        L_0x04dd:
            int r8 = r8 + 1
            goto L_0x048f
        L_0x04e0:
            int r5 = r9 + r10
            if (r5 != 0) goto L_0x04e7
            r5 = 0
            goto L_0x05b2
        L_0x04e7:
            r7 = 1
        L_0x04e8:
            int r8 = r4.f14164b
            r9 = 1
            int r8 = r8 + r9
            if (r7 >= r8) goto L_0x05b2
            java.lang.Object r8 = r4.f14166d
            x2.g[] r8 = (x2.g[]) r8
            r8 = r8[r7]
            java.lang.Object r8 = r8.f16905c
            pd.d[] r8 = (pd.d[]) r8
            r9 = 0
        L_0x04f9:
            int r10 = r8.length
            if (r9 >= r10) goto L_0x05ae
            r10 = r8[r9]
            if (r10 == 0) goto L_0x05aa
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x05aa
            r10 = r8[r9]
            java.lang.Object r11 = r4.f14166d
            x2.g[] r11 = (x2.g[]) r11
            int r12 = r7 + -1
            r12 = r11[r12]
            java.lang.Object r12 = r12.f16905c
            pd.d[] r12 = (pd.d[]) r12
            int r13 = r7 + 1
            r11 = r11[r13]
            if (r11 == 0) goto L_0x051f
            java.lang.Object r11 = r11.f16905c
            pd.d[] r11 = (pd.d[]) r11
            goto L_0x0520
        L_0x051f:
            r11 = r12
        L_0x0520:
            r13 = 14
            pd.d[] r14 = new pd.d[r13]
            r15 = r12[r9]
            r21 = 2
            r14[r21] = r15
            r15 = r11[r9]
            r14[r20] = r15
            if (r9 <= 0) goto L_0x0540
            int r15 = r9 + -1
            r21 = r8[r15]
            r23 = 0
            r14[r23] = r21
            r21 = r12[r15]
            r14[r16] = r21
            r15 = r11[r15]
            r14[r17] = r15
        L_0x0540:
            r15 = 1
            if (r9 <= r15) goto L_0x0557
            r15 = 8
            int r21 = r9 + -2
            r23 = r8[r21]
            r14[r15] = r23
            r15 = r12[r21]
            r23 = 10
            r14[r23] = r15
            r15 = 11
            r21 = r11[r21]
            r14[r15] = r21
        L_0x0557:
            int r15 = r8.length
            r21 = -1
            int r15 = r15 + -1
            if (r9 >= r15) goto L_0x056e
            int r15 = r9 + 1
            r21 = r8[r15]
            r23 = 1
            r14[r23] = r21
            r21 = r12[r15]
            r14[r18] = r21
            r15 = r11[r15]
            r14[r19] = r15
        L_0x056e:
            int r15 = r8.length
            int r15 = r15 + -2
            if (r9 >= r15) goto L_0x0587
            r15 = 9
            int r21 = r9 + 2
            r23 = r8[r21]
            r14[r15] = r23
            r15 = 12
            r12 = r12[r21]
            r14[r15] = r12
            r12 = 13
            r11 = r11[r21]
            r14[r12] = r11
        L_0x0587:
            r11 = 0
        L_0x0588:
            if (r11 >= r13) goto L_0x05aa
            r12 = r14[r11]
            if (r12 != 0) goto L_0x058f
            goto L_0x05a1
        L_0x058f:
            boolean r15 = r12.a()
            if (r15 == 0) goto L_0x05a1
            int r15 = r12.f14157c
            int r13 = r10.f14157c
            if (r15 != r13) goto L_0x05a1
            int r12 = r12.f14159e
            r10.f14159e = r12
            r12 = 1
            goto L_0x05a2
        L_0x05a1:
            r12 = 0
        L_0x05a2:
            if (r12 == 0) goto L_0x05a5
            goto L_0x05aa
        L_0x05a5:
            int r11 = r11 + 1
            r13 = 14
            goto L_0x0588
        L_0x05aa:
            int r9 = r9 + 1
            goto L_0x04f9
        L_0x05ae:
            int r7 = r7 + 1
            goto L_0x04e8
        L_0x05b2:
            if (r5 <= 0) goto L_0x05bb
            if (r5 < r6) goto L_0x05b7
            goto L_0x05bb
        L_0x05b7:
            r6 = r5
            r7 = 1
            goto L_0x03b9
        L_0x05bb:
            java.lang.Object r5 = r4.f14166d
            x2.g[] r5 = (x2.g[]) r5
            int r6 = r5.length
            r7 = 0
            r8 = 0
        L_0x05c2:
            if (r7 >= r6) goto L_0x05ec
            r9 = r5[r7]
            if (r9 == 0) goto L_0x05e7
            java.lang.Object r9 = r9.f16905c
            pd.d[] r9 = (pd.d[]) r9
            int r10 = r9.length
            r11 = 0
        L_0x05ce:
            if (r11 >= r10) goto L_0x05e7
            r12 = r9[r11]
            if (r12 == 0) goto L_0x05e4
            int r13 = r12.f14159e
            if (r13 < 0) goto L_0x05e4
            int r14 = r2.length
            if (r13 >= r14) goto L_0x05e4
            r13 = r2[r13]
            r13 = r13[r8]
            int r12 = r12.f14158d
            r13.b(r12)
        L_0x05e4:
            int r11 = r11 + 1
            goto L_0x05ce
        L_0x05e7:
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L_0x05c2
        L_0x05ec:
            r7 = 0
            r5 = r2[r7]
            r6 = 1
            r5 = r5[r6]
            int[] r6 = r5.a()
            int r7 = r4.f14164b
            java.lang.Object r8 = r4.f14165c
            r9 = r8
            pd.a r9 = (pd.a) r9
            int r9 = r9.f14144e
            int r9 = r9 * r7
            pd.a r8 = (pd.a) r8
            int r7 = r8.f14141b
            r8 = 2
            int r7 = r8 << r7
            int r9 = r9 - r7
            int r7 = r6.length
            if (r7 != 0) goto L_0x0618
            if (r9 <= 0) goto L_0x0615
            r7 = 928(0x3a0, float:1.3E-42)
            if (r9 > r7) goto L_0x0615
            r5.b(r9)
            goto L_0x0626
        L_0x0615:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x0618:
            r7 = 928(0x3a0, float:1.3E-42)
            r10 = 0
            r6 = r6[r10]
            if (r6 == r9) goto L_0x0626
            if (r9 <= 0) goto L_0x0626
            if (r9 > r7) goto L_0x0626
            r5.b(r9)
        L_0x0626:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = r4.f14165c
            pd.a r6 = (pd.a) r6
            int r6 = r6.f14144e
            int r7 = r4.f14164b
            int r6 = r6 * r7
            int[] r6 = new int[r6]
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
        L_0x0641:
            java.lang.Object r11 = r4.f14165c
            pd.a r11 = (pd.a) r11
            int r11 = r11.f14144e
            if (r10 >= r11) goto L_0x0682
            r11 = 0
        L_0x064a:
            int r12 = r4.f14164b
            if (r11 >= r12) goto L_0x067e
            r12 = r2[r10]
            int r13 = r11 + 1
            r12 = r12[r13]
            int[] r12 = r12.a()
            int r14 = r4.f14164b
            int r14 = r14 * r10
            int r14 = r14 + r11
            int r11 = r12.length
            if (r11 != 0) goto L_0x0668
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r5.add(r11)
            r15 = 1
            goto L_0x067c
        L_0x0668:
            int r11 = r12.length
            r15 = 1
            if (r11 != r15) goto L_0x0672
            r11 = 0
            r12 = r12[r11]
            r6[r14] = r12
            goto L_0x067c
        L_0x0672:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r9.add(r11)
            r7.add(r12)
        L_0x067c:
            r11 = r13
            goto L_0x064a
        L_0x067e:
            r15 = 1
            int r10 = r10 + 1
            goto L_0x0641
        L_0x0682:
            r15 = 1
            int r2 = r7.size()
            int[][] r10 = new int[r2][]
            r11 = 0
        L_0x068a:
            if (r11 >= r2) goto L_0x0697
            java.lang.Object r12 = r7.get(r11)
            int[] r12 = (int[]) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x068a
        L_0x0697:
            java.lang.Object r2 = r4.f14165c
            pd.a r2 = (pd.a) r2
            int r2 = r2.f14141b
            int[] r4 = m9.b.c0(r5)
            int[] r5 = m9.b.c0(r9)
            int r7 = r5.length
            int[] r9 = new int[r7]
            r11 = 100
        L_0x06aa:
            int r12 = r11 + -1
            if (r11 <= 0) goto L_0x0719
            r11 = 0
        L_0x06af:
            if (r11 >= r7) goto L_0x06be
            r13 = r5[r11]
            r14 = r10[r11]
            r16 = r9[r11]
            r14 = r14[r16]
            r6[r13] = r14
            int r11 = r11 + 1
            goto L_0x06af
        L_0x06be:
            cd.e r2 = pd.i.b(r2, r6, r4)     // Catch:{ ChecksumException -> 0x06e9 }
            uc.h r4 = new uc.h
            java.lang.String r5 = r2.f4702b
            uc.a r6 = uc.a.PDF_417
            r11 = 0
            r4.<init>(r5, r11, r3, r6)
            uc.i r3 = uc.i.ERROR_CORRECTION_LEVEL
            java.lang.String r5 = r2.f4704d
            r4.b(r3, r5)
            java.lang.Object r2 = r2.f4705e
            od.b r2 = (od.b) r2
            if (r2 == 0) goto L_0x06de
            uc.i r3 = uc.i.PDF417_EXTRA_METADATA
            r4.b(r3, r2)
        L_0x06de:
            r0.add(r4)
            r4 = r8
            r7 = r15
            r2 = r26
            r5 = -1
            r6 = 0
            goto L_0x0070
        L_0x06e9:
            r11 = 0
            if (r7 == 0) goto L_0x0714
            r13 = 0
        L_0x06ed:
            if (r13 >= r7) goto L_0x070f
            r14 = r9[r13]
            r8 = r10[r13]
            int r8 = r8.length
            r16 = -1
            int r8 = r8 + -1
            if (r14 >= r8) goto L_0x06ff
            int r14 = r14 + 1
            r9[r13] = r14
            goto L_0x0711
        L_0x06ff:
            r8 = 0
            r9[r13] = r8
            int r8 = r7 + -1
            if (r13 == r8) goto L_0x070a
            int r13 = r13 + 1
            r8 = 2
            goto L_0x06ed
        L_0x070a:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x070f:
            r16 = -1
        L_0x0711:
            r11 = r12
            r8 = 2
            goto L_0x06aa
        L_0x0714:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x0719:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x071e:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x0721:
            uc.h[] r1 = f13863a
            java.lang.Object[] r0 = r0.toArray(r1)
            uc.h[] r0 = (uc.h[]) r0
            int r1 = r0.length
            if (r1 == 0) goto L_0x0732
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0732
            return r0
        L_0x0732:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od.a.b(vl.d, java.util.Map):uc.h");
    }

    public final void reset() {
    }
}
