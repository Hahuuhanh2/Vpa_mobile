package c1;

/* compiled from: Chain */
public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0194, code lost:
        if (r5 == r9) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a9, code lost:
        if (r5 == 2) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b1, code lost:
        r25 = r23;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0280, code lost:
        if (r3.f4404d == r9) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (r4.f4404d == r5) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x044c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06ea  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0703  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(c1.f r37, a1.d r38, java.util.ArrayList<c1.e> r39, int r40) {
        /*
            r0 = r37
            r10 = r38
            r11 = r39
            c1.e$a r12 = c1.e.a.MATCH_CONSTRAINT
            r13 = 2
            if (r40 != 0) goto L_0x0015
            int r1 = r0.F0
            c1.c[] r2 = r0.I0
            r15 = r1
            r16 = r2
            r17 = 0
            goto L_0x001e
        L_0x0015:
            int r1 = r0.G0
            c1.c[] r2 = r0.H0
            r15 = r1
            r16 = r2
            r17 = r13
        L_0x001e:
            r9 = 0
        L_0x001f:
            if (r9 >= r15) goto L_0x0732
            r1 = r16[r9]
            boolean r2 = r1.f4400q
            r18 = 0
            r8 = 8
            r4 = 1
            if (r2 != 0) goto L_0x0146
            int r2 = r1.f4395l
            int r2 = r2 * r13
            c1.e r5 = r1.f4384a
            r6 = r5
            r7 = 0
        L_0x0033:
            if (r7 != 0) goto L_0x010e
            int r14 = r1.f4392i
            int r14 = r14 + r4
            r1.f4392i = r14
            c1.e[] r14 = r5.f4454r0
            int r3 = r1.f4395l
            r14[r3] = r18
            c1.e[] r14 = r5.f4452q0
            r14[r3] = r18
            int r14 = r5.f4438j0
            if (r14 == r8) goto L_0x00df
            c1.e$a r3 = r5.n(r3)
            if (r3 == r12) goto L_0x0050
            int r3 = r1.f4395l
        L_0x0050:
            c1.d[] r3 = r5.S
            r3 = r3[r2]
            r3.e()
            c1.d[] r3 = r5.S
            int r14 = r2 + 1
            r3 = r3[r14]
            r3.e()
            c1.d[] r3 = r5.S
            r3 = r3[r2]
            r3.e()
            c1.d[] r3 = r5.S
            r3 = r3[r14]
            r3.e()
            c1.e r3 = r1.f4385b
            if (r3 != 0) goto L_0x0074
            r1.f4385b = r5
        L_0x0074:
            r1.f4387d = r5
            c1.e$a[] r3 = r5.V
            int r14 = r1.f4395l
            r3 = r3[r14]
            if (r3 != r12) goto L_0x00df
            int[] r8 = r5.f4459u
            r8 = r8[r14]
            r4 = 3
            if (r8 == 0) goto L_0x0089
            if (r8 == r4) goto L_0x0089
            if (r8 != r13) goto L_0x00df
        L_0x0089:
            int r13 = r1.f4393j
            r22 = 1
            int r13 = r13 + 1
            r1.f4393j = r13
            float[] r13 = r5.f4450p0
            r13 = r13[r14]
            r14 = 0
            int r24 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r24 <= 0) goto L_0x009f
            float r14 = r1.f4394k
            float r14 = r14 + r13
            r1.f4394k = r14
        L_0x009f:
            int r14 = r5.f4438j0
            r4 = 8
            if (r14 == r4) goto L_0x00ae
            if (r3 != r12) goto L_0x00ae
            if (r8 == 0) goto L_0x00ac
            r3 = 3
            if (r8 != r3) goto L_0x00ae
        L_0x00ac:
            r3 = 1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 == 0) goto L_0x00cd
            r3 = 0
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ba
            r3 = 1
            r1.f4397n = r3
            goto L_0x00bd
        L_0x00ba:
            r3 = 1
            r1.f4398o = r3
        L_0x00bd:
            java.util.ArrayList<c1.e> r3 = r1.f4391h
            if (r3 != 0) goto L_0x00c8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f4391h = r3
        L_0x00c8:
            java.util.ArrayList<c1.e> r3 = r1.f4391h
            r3.add(r5)
        L_0x00cd:
            c1.e r3 = r1.f4389f
            if (r3 != 0) goto L_0x00d3
            r1.f4389f = r5
        L_0x00d3:
            c1.e r3 = r1.f4390g
            if (r3 == 0) goto L_0x00dd
            c1.e[] r3 = r3.f4452q0
            int r4 = r1.f4395l
            r3[r4] = r5
        L_0x00dd:
            r1.f4390g = r5
        L_0x00df:
            if (r6 == r5) goto L_0x00e7
            c1.e[] r3 = r6.f4454r0
            int r4 = r1.f4395l
            r3[r4] = r5
        L_0x00e7:
            c1.d[] r3 = r5.S
            int r4 = r2 + 1
            r3 = r3[r4]
            c1.d r3 = r3.f4406f
            if (r3 == 0) goto L_0x00ff
            c1.e r3 = r3.f4404d
            c1.d[] r4 = r3.S
            r4 = r4[r2]
            c1.d r4 = r4.f4406f
            if (r4 == 0) goto L_0x00ff
            c1.e r4 = r4.f4404d
            if (r4 == r5) goto L_0x0101
        L_0x00ff:
            r3 = r18
        L_0x0101:
            if (r3 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r3 = r5
            r7 = 1
        L_0x0106:
            r6 = r5
            r4 = 1
            r8 = 8
            r13 = 2
            r5 = r3
            goto L_0x0033
        L_0x010e:
            c1.e r3 = r1.f4385b
            if (r3 == 0) goto L_0x0119
            c1.d[] r3 = r3.S
            r3 = r3[r2]
            r3.e()
        L_0x0119:
            c1.e r3 = r1.f4387d
            if (r3 == 0) goto L_0x0126
            c1.d[] r3 = r3.S
            int r2 = r2 + 1
            r2 = r3[r2]
            r2.e()
        L_0x0126:
            r1.f4386c = r5
            int r2 = r1.f4395l
            if (r2 != 0) goto L_0x0133
            boolean r2 = r1.f4396m
            if (r2 == 0) goto L_0x0133
            r1.f4388e = r5
            goto L_0x0137
        L_0x0133:
            c1.e r2 = r1.f4384a
            r1.f4388e = r2
        L_0x0137:
            boolean r2 = r1.f4398o
            if (r2 == 0) goto L_0x0141
            boolean r2 = r1.f4397n
            if (r2 == 0) goto L_0x0141
            r2 = 1
            goto L_0x0142
        L_0x0141:
            r2 = 0
        L_0x0142:
            r1.f4399p = r2
            r2 = 1
            goto L_0x0147
        L_0x0146:
            r2 = r4
        L_0x0147:
            r1.f4400q = r2
            if (r11 == 0) goto L_0x0160
            c1.e r2 = r1.f4384a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x0154
            goto L_0x0160
        L_0x0154:
            r29 = r9
            r35 = r12
            r30 = r15
            r19 = 0
            r20 = 2
            goto L_0x0724
        L_0x0160:
            c1.e r13 = r1.f4384a
            c1.e r14 = r1.f4386c
            c1.e r8 = r1.f4385b
            c1.e r7 = r1.f4387d
            c1.e r2 = r1.f4388e
            float r3 = r1.f4394k
            c1.e$a[] r4 = r0.V
            r4 = r4[r40]
            c1.e$a r5 = c1.e.a.WRAP_CONTENT
            if (r4 != r5) goto L_0x0176
            r4 = 1
            goto L_0x0177
        L_0x0176:
            r4 = 0
        L_0x0177:
            if (r40 != 0) goto L_0x0197
            int r5 = r2.f4446n0
            r6 = 1
            if (r5 != 0) goto L_0x0181
            r22 = 1
            goto L_0x0183
        L_0x0181:
            r22 = 0
        L_0x0183:
            if (r5 != r6) goto L_0x018b
            r23 = r6
            r24 = r9
            r9 = 2
            goto L_0x0190
        L_0x018b:
            r24 = r9
            r9 = 2
            r23 = 0
        L_0x0190:
            r6 = r23
            r23 = r22
            if (r5 != r9) goto L_0x01b1
            goto L_0x01ab
        L_0x0197:
            r24 = r9
            r6 = 1
            r9 = 2
            int r5 = r2.f4448o0
            if (r5 != 0) goto L_0x01a2
            r23 = r6
            goto L_0x01a4
        L_0x01a2:
            r23 = 0
        L_0x01a4:
            if (r5 != r6) goto L_0x01a8
            r6 = 1
            goto L_0x01a9
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            if (r5 != r9) goto L_0x01b1
        L_0x01ab:
            r25 = r23
            r5 = 1
        L_0x01ae:
            r23 = r6
            goto L_0x01b5
        L_0x01b1:
            r25 = r23
            r5 = 0
            goto L_0x01ae
        L_0x01b5:
            r27 = r3
            r9 = r13
            r6 = 0
        L_0x01b9:
            if (r6 != 0) goto L_0x0295
            c1.d[] r3 = r9.S
            r3 = r3[r17]
            if (r5 == 0) goto L_0x01c4
            r29 = 1
            goto L_0x01c6
        L_0x01c4:
            r29 = 4
        L_0x01c6:
            int r30 = r3.e()
            r31 = r6
            c1.e$a[] r6 = r9.V
            r6 = r6[r40]
            if (r6 != r12) goto L_0x01da
            int[] r6 = r9.f4459u
            r6 = r6[r40]
            if (r6 != 0) goto L_0x01da
            r6 = 1
            goto L_0x01db
        L_0x01da:
            r6 = 0
        L_0x01db:
            c1.d r11 = r3.f4406f
            if (r11 == 0) goto L_0x01e7
            if (r9 == r13) goto L_0x01e7
            int r11 = r11.e()
            int r30 = r11 + r30
        L_0x01e7:
            r11 = r30
            if (r5 == 0) goto L_0x01f4
            if (r9 == r13) goto L_0x01f4
            if (r9 == r8) goto L_0x01f4
            r30 = r15
            r29 = 8
            goto L_0x01f6
        L_0x01f4:
            r30 = r15
        L_0x01f6:
            c1.d r15 = r3.f4406f
            if (r15 == 0) goto L_0x0234
            if (r9 != r8) goto L_0x0209
            r32 = r2
            a1.g r2 = r3.f4409i
            a1.g r15 = r15.f4409i
            r33 = r13
            r13 = 6
            r10.f(r2, r15, r11, r13)
            goto L_0x0216
        L_0x0209:
            r32 = r2
            r33 = r13
            a1.g r2 = r3.f4409i
            a1.g r13 = r15.f4409i
            r15 = 8
            r10.f(r2, r13, r11, r15)
        L_0x0216:
            if (r6 == 0) goto L_0x021c
            if (r5 != 0) goto L_0x021c
            r29 = 5
        L_0x021c:
            if (r9 != r8) goto L_0x0228
            if (r5 == 0) goto L_0x0228
            boolean[] r2 = r9.U
            boolean r2 = r2[r40]
            if (r2 == 0) goto L_0x0228
            r2 = 5
            goto L_0x022a
        L_0x0228:
            r2 = r29
        L_0x022a:
            a1.g r6 = r3.f4409i
            c1.d r3 = r3.f4406f
            a1.g r3 = r3.f4409i
            r10.e(r6, r3, r11, r2)
            goto L_0x0238
        L_0x0234:
            r32 = r2
            r33 = r13
        L_0x0238:
            if (r4 == 0) goto L_0x026a
            int r2 = r9.f4438j0
            r3 = 8
            if (r2 == r3) goto L_0x0258
            c1.e$a[] r2 = r9.V
            r2 = r2[r40]
            if (r2 != r12) goto L_0x0258
            c1.d[] r2 = r9.S
            int r3 = r17 + 1
            r3 = r2[r3]
            a1.g r3 = r3.f4409i
            r2 = r2[r17]
            a1.g r2 = r2.f4409i
            r6 = 5
            r11 = 0
            r10.f(r3, r2, r11, r6)
            goto L_0x0259
        L_0x0258:
            r11 = 0
        L_0x0259:
            c1.d[] r2 = r9.S
            r2 = r2[r17]
            a1.g r2 = r2.f4409i
            c1.d[] r3 = r0.S
            r3 = r3[r17]
            a1.g r3 = r3.f4409i
            r6 = 8
            r10.f(r2, r3, r11, r6)
        L_0x026a:
            c1.d[] r2 = r9.S
            int r3 = r17 + 1
            r2 = r2[r3]
            c1.d r2 = r2.f4406f
            if (r2 == 0) goto L_0x0282
            c1.e r2 = r2.f4404d
            c1.d[] r3 = r2.S
            r3 = r3[r17]
            c1.d r3 = r3.f4406f
            if (r3 == 0) goto L_0x0282
            c1.e r3 = r3.f4404d
            if (r3 == r9) goto L_0x0284
        L_0x0282:
            r2 = r18
        L_0x0284:
            if (r2 == 0) goto L_0x028a
            r9 = r2
            r6 = r31
            goto L_0x028b
        L_0x028a:
            r6 = 1
        L_0x028b:
            r11 = r39
            r15 = r30
            r2 = r32
            r13 = r33
            goto L_0x01b9
        L_0x0295:
            r32 = r2
            r33 = r13
            r30 = r15
            if (r7 == 0) goto L_0x02fc
            c1.d[] r2 = r14.S
            int r3 = r17 + 1
            r2 = r2[r3]
            c1.d r2 = r2.f4406f
            if (r2 == 0) goto L_0x02fc
            c1.d[] r2 = r7.S
            r2 = r2[r3]
            c1.e$a[] r6 = r7.V
            r6 = r6[r40]
            if (r6 != r12) goto L_0x02b9
            int[] r6 = r7.f4459u
            r6 = r6[r40]
            if (r6 != 0) goto L_0x02b9
            r6 = 1
            goto L_0x02ba
        L_0x02b9:
            r6 = 0
        L_0x02ba:
            if (r6 == 0) goto L_0x02d2
            if (r5 != 0) goto L_0x02d2
            c1.d r6 = r2.f4406f
            c1.e r9 = r6.f4404d
            if (r9 != r0) goto L_0x02d2
            a1.g r9 = r2.f4409i
            a1.g r6 = r6.f4409i
            int r11 = r2.e()
            int r11 = -r11
            r13 = 5
            r10.e(r9, r6, r11, r13)
            goto L_0x02e8
        L_0x02d2:
            r13 = 5
            if (r5 == 0) goto L_0x02e8
            c1.d r6 = r2.f4406f
            c1.e r9 = r6.f4404d
            if (r9 != r0) goto L_0x02e8
            a1.g r9 = r2.f4409i
            a1.g r6 = r6.f4409i
            int r11 = r2.e()
            int r11 = -r11
            r15 = 4
            r10.e(r9, r6, r11, r15)
        L_0x02e8:
            a1.g r6 = r2.f4409i
            c1.d[] r9 = r14.S
            r3 = r9[r3]
            c1.d r3 = r3.f4406f
            a1.g r3 = r3.f4409i
            int r2 = r2.e()
            int r2 = -r2
            r9 = 6
            r10.g(r6, r3, r2, r9)
            goto L_0x02fd
        L_0x02fc:
            r13 = 5
        L_0x02fd:
            if (r4 == 0) goto L_0x0316
            c1.d[] r2 = r0.S
            int r3 = r17 + 1
            r2 = r2[r3]
            a1.g r2 = r2.f4409i
            c1.d[] r4 = r14.S
            r3 = r4[r3]
            a1.g r4 = r3.f4409i
            int r3 = r3.e()
            r6 = 8
            r10.f(r2, r4, r3, r6)
        L_0x0316:
            java.util.ArrayList<c1.e> r2 = r1.f4391h
            if (r2 == 0) goto L_0x0444
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0444
            boolean r6 = r1.f4397n
            if (r6 == 0) goto L_0x032d
            boolean r6 = r1.f4399p
            if (r6 != 0) goto L_0x032d
            int r6 = r1.f4393j
            float r6 = (float) r6
            goto L_0x032f
        L_0x032d:
            r6 = r27
        L_0x032f:
            r15 = r18
            r9 = 0
            r11 = 0
        L_0x0333:
            if (r11 >= r3) goto L_0x0444
            java.lang.Object r22 = r2.get(r11)
            r4 = r22
            c1.e r4 = (c1.e) r4
            float[] r13 = r4.f4450p0
            r13 = r13[r40]
            r20 = 0
            int r22 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r22 >= 0) goto L_0x036a
            boolean r13 = r1.f4399p
            if (r13 == 0) goto L_0x0362
            c1.d[] r0 = r4.S
            int r4 = r17 + 1
            r4 = r0[r4]
            a1.g r4 = r4.f4409i
            r0 = r0[r17]
            a1.g r0 = r0.f4409i
            r22 = r2
            r2 = 0
            r13 = 4
            r10.e(r4, r0, r2, r13)
            r28 = r13
            r13 = r2
            goto L_0x0385
        L_0x0362:
            r22 = r2
            r2 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r28 = 4
            goto L_0x036f
        L_0x036a:
            r22 = r2
            r28 = 4
            r2 = 0
        L_0x036f:
            int r29 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r29 != 0) goto L_0x0391
            c1.d[] r0 = r4.S
            int r2 = r17 + 1
            r2 = r0[r2]
            a1.g r2 = r2.f4409i
            r0 = r0[r17]
            a1.g r0 = r0.f4409i
            r4 = 8
            r13 = 0
            r10.e(r2, r0, r13, r4)
        L_0x0385:
            r34 = r3
            r29 = r6
            r35 = r12
            r19 = r13
            r20 = 0
            goto L_0x0434
        L_0x0391:
            r19 = 0
            if (r15 == 0) goto L_0x0427
            c1.d[] r2 = r15.S
            r15 = r2[r17]
            a1.g r15 = r15.f4409i
            int r31 = r17 + 1
            r2 = r2[r31]
            a1.g r2 = r2.f4409i
            c1.d[] r0 = r4.S
            r34 = r3
            r3 = r0[r17]
            a1.g r3 = r3.f4409i
            r0 = r0[r31]
            a1.g r0 = r0.f4409i
            r31 = r4
            a1.b r4 = r38.l()
            r35 = r12
            r12 = 0
            r4.f20b = r12
            int r20 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r20 == 0) goto L_0x0408
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 != 0) goto L_0x03c3
            goto L_0x0408
        L_0x03c3:
            r20 = 0
            int r36 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r36 != 0) goto L_0x03d6
            a1.b$a r0 = r4.f22d
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.j(r15, r3)
            a1.b$a r0 = r4.f22d
            r0.j(r2, r12)
            goto L_0x03e6
        L_0x03d6:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r29 != 0) goto L_0x03e9
            a1.b$a r2 = r4.f22d
            r2.j(r3, r12)
            a1.b$a r2 = r4.f22d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.j(r0, r3)
        L_0x03e6:
            r29 = r6
            goto L_0x0423
        L_0x03e9:
            float r9 = r9 / r6
            float r29 = r13 / r6
            float r9 = r9 / r29
            r29 = r6
            a1.b$a r6 = r4.f22d
            r6.j(r15, r12)
            a1.b$a r6 = r4.f22d
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.j(r2, r12)
            a1.b$a r2 = r4.f22d
            r2.j(r0, r9)
            a1.b$a r0 = r4.f22d
            float r2 = -r9
            r0.j(r3, r2)
            goto L_0x0423
        L_0x0408:
            r29 = r6
            r6 = r12
            r12 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            a1.b$a r9 = r4.f22d
            r9.j(r15, r12)
            a1.b$a r9 = r4.f22d
            r9.j(r2, r6)
            a1.b$a r2 = r4.f22d
            r2.j(r0, r12)
            a1.b$a r0 = r4.f22d
            r0.j(r3, r6)
        L_0x0423:
            r10.c(r4)
            goto L_0x0431
        L_0x0427:
            r34 = r3
            r31 = r4
            r29 = r6
            r35 = r12
            r20 = 0
        L_0x0431:
            r9 = r13
            r15 = r31
        L_0x0434:
            int r11 = r11 + 1
            r4 = 1
            r13 = 5
            r0 = r37
            r2 = r22
            r6 = r29
            r3 = r34
            r12 = r35
            goto L_0x0333
        L_0x0444:
            r35 = r12
            r19 = 0
            r28 = 4
            if (r8 == 0) goto L_0x04b0
            if (r8 == r7) goto L_0x0450
            if (r5 == 0) goto L_0x04b0
        L_0x0450:
            r0 = r33
            c1.d[] r0 = r0.S
            r0 = r0[r17]
            c1.d[] r1 = r14.S
            int r2 = r17 + 1
            r1 = r1[r2]
            c1.d r0 = r0.f4406f
            if (r0 == 0) goto L_0x0464
            a1.g r0 = r0.f4409i
            r3 = r0
            goto L_0x0466
        L_0x0464:
            r3 = r18
        L_0x0466:
            c1.d r0 = r1.f4406f
            if (r0 == 0) goto L_0x046e
            a1.g r0 = r0.f4409i
            r6 = r0
            goto L_0x0470
        L_0x046e:
            r6 = r18
        L_0x0470:
            c1.d[] r0 = r8.S
            r0 = r0[r17]
            if (r7 == 0) goto L_0x047a
            c1.d[] r1 = r7.S
            r1 = r1[r2]
        L_0x047a:
            if (r3 == 0) goto L_0x04a6
            if (r6 == 0) goto L_0x04a6
            if (r40 != 0) goto L_0x0485
            r2 = r32
            float r2 = r2.f4432g0
            goto L_0x0489
        L_0x0485:
            r2 = r32
            float r2 = r2.f4434h0
        L_0x0489:
            r5 = r2
            int r4 = r0.e()
            int r9 = r1.e()
            a1.g r2 = r0.f4409i
            a1.g r0 = r1.f4409i
            r11 = 7
            r1 = r38
            r12 = r7
            r7 = r0
            r13 = r8
            r8 = r9
            r15 = r24
            r20 = 2
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04ac
        L_0x04a6:
            r12 = r7
            r13 = r8
            r15 = r24
            r20 = 2
        L_0x04ac:
            r29 = r15
            goto L_0x06c6
        L_0x04b0:
            r12 = r7
            r13 = r8
            r15 = r24
            r0 = r33
            r20 = 2
            if (r25 == 0) goto L_0x05b0
            if (r13 == 0) goto L_0x05b0
            int r2 = r1.f4393j
            if (r2 <= 0) goto L_0x04c7
            int r1 = r1.f4392i
            if (r1 != r2) goto L_0x04c7
            r27 = 1
            goto L_0x04c9
        L_0x04c7:
            r27 = r19
        L_0x04c9:
            r9 = r13
            r11 = r9
        L_0x04cb:
            if (r11 == 0) goto L_0x04ac
            c1.e[] r1 = r11.f4454r0
            r1 = r1[r40]
            r8 = r1
        L_0x04d2:
            if (r8 == 0) goto L_0x04df
            int r1 = r8.f4438j0
            r7 = 8
            if (r1 != r7) goto L_0x04e1
            c1.e[] r1 = r8.f4454r0
            r8 = r1[r40]
            goto L_0x04d2
        L_0x04df:
            r7 = 8
        L_0x04e1:
            if (r8 != 0) goto L_0x04ef
            if (r11 != r12) goto L_0x04e6
            goto L_0x04ef
        L_0x04e6:
            r21 = r8
            r22 = r9
            r29 = r15
            r15 = r7
            goto L_0x05a2
        L_0x04ef:
            c1.d[] r1 = r11.S
            r1 = r1[r17]
            a1.g r2 = r1.f4409i
            c1.d r3 = r1.f4406f
            if (r3 == 0) goto L_0x04fc
            a1.g r3 = r3.f4409i
            goto L_0x04fe
        L_0x04fc:
            r3 = r18
        L_0x04fe:
            if (r9 == r11) goto L_0x0509
            c1.d[] r3 = r9.S
            int r4 = r17 + 1
            r3 = r3[r4]
            a1.g r3 = r3.f4409i
            goto L_0x0518
        L_0x0509:
            if (r11 != r13) goto L_0x0518
            c1.d[] r3 = r0.S
            r3 = r3[r17]
            c1.d r3 = r3.f4406f
            if (r3 == 0) goto L_0x0516
            a1.g r3 = r3.f4409i
            goto L_0x0518
        L_0x0516:
            r3 = r18
        L_0x0518:
            int r1 = r1.e()
            c1.d[] r4 = r11.S
            int r5 = r17 + 1
            r4 = r4[r5]
            int r4 = r4.e()
            if (r8 == 0) goto L_0x052f
            c1.d[] r6 = r8.S
            r6 = r6[r17]
            a1.g r7 = r6.f4409i
            goto L_0x0539
        L_0x052f:
            c1.d[] r6 = r14.S
            r6 = r6[r5]
            c1.d r6 = r6.f4406f
            if (r6 == 0) goto L_0x053c
            a1.g r7 = r6.f4409i
        L_0x0539:
            r22 = r8
            goto L_0x0540
        L_0x053c:
            r22 = r8
            r7 = r18
        L_0x0540:
            c1.d[] r8 = r11.S
            r8 = r8[r5]
            a1.g r8 = r8.f4409i
            if (r6 == 0) goto L_0x054d
            int r6 = r6.e()
            int r4 = r4 + r6
        L_0x054d:
            c1.d[] r6 = r9.S
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x059a
            if (r3 == 0) goto L_0x059a
            if (r7 == 0) goto L_0x059a
            if (r8 == 0) goto L_0x059a
            if (r11 != r13) goto L_0x0569
            c1.d[] r1 = r13.S
            r1 = r1[r17]
            int r1 = r1.e()
            r6 = r1
        L_0x0569:
            if (r11 != r12) goto L_0x0576
            c1.d[] r1 = r12.S
            r1 = r1[r5]
            int r1 = r1.e()
            r24 = r1
            goto L_0x0578
        L_0x0576:
            r24 = r4
        L_0x0578:
            if (r27 == 0) goto L_0x057d
            r26 = 8
            goto L_0x057f
        L_0x057d:
            r26 = 5
        L_0x057f:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r4 = 5
            r29 = r15
            r15 = r4
            r4 = r6
            r6 = r7
            r21 = 8
            r7 = r8
            r15 = r21
            r21 = r22
            r8 = r24
            r22 = r9
            r9 = r26
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05a2
        L_0x059a:
            r29 = r15
            r21 = r22
            r15 = 8
            r22 = r9
        L_0x05a2:
            int r1 = r11.f4438j0
            if (r1 == r15) goto L_0x05a8
            r9 = r11
            goto L_0x05aa
        L_0x05a8:
            r9 = r22
        L_0x05aa:
            r11 = r21
            r15 = r29
            goto L_0x04cb
        L_0x05b0:
            r29 = r15
            r15 = 8
            if (r23 == 0) goto L_0x06c6
            if (r13 == 0) goto L_0x06c6
            int r2 = r1.f4393j
            if (r2 <= 0) goto L_0x05c3
            int r1 = r1.f4392i
            if (r1 != r2) goto L_0x05c3
            r27 = 1
            goto L_0x05c5
        L_0x05c3:
            r27 = r19
        L_0x05c5:
            r9 = r13
            r11 = r9
        L_0x05c7:
            if (r11 == 0) goto L_0x0674
            c1.e[] r1 = r11.f4454r0
            r1 = r1[r40]
        L_0x05cd:
            if (r1 == 0) goto L_0x05d8
            int r2 = r1.f4438j0
            if (r2 != r15) goto L_0x05d8
            c1.e[] r1 = r1.f4454r0
            r1 = r1[r40]
            goto L_0x05cd
        L_0x05d8:
            if (r11 == r13) goto L_0x065f
            if (r11 == r12) goto L_0x065f
            if (r1 == 0) goto L_0x065f
            if (r1 != r12) goto L_0x05e3
            r8 = r18
            goto L_0x05e4
        L_0x05e3:
            r8 = r1
        L_0x05e4:
            c1.d[] r1 = r11.S
            r1 = r1[r17]
            a1.g r2 = r1.f4409i
            c1.d[] r3 = r9.S
            int r4 = r17 + 1
            r3 = r3[r4]
            a1.g r3 = r3.f4409i
            int r1 = r1.e()
            c1.d[] r5 = r11.S
            r5 = r5[r4]
            int r5 = r5.e()
            if (r8 == 0) goto L_0x0610
            c1.d[] r6 = r8.S
            r6 = r6[r17]
            a1.g r7 = r6.f4409i
            c1.d r15 = r6.f4406f
            if (r15 == 0) goto L_0x060d
            a1.g r15 = r15.f4409i
            goto L_0x0621
        L_0x060d:
            r15 = r18
            goto L_0x0621
        L_0x0610:
            c1.d[] r6 = r12.S
            r6 = r6[r17]
            if (r6 == 0) goto L_0x0619
            a1.g r7 = r6.f4409i
            goto L_0x061b
        L_0x0619:
            r7 = r18
        L_0x061b:
            c1.d[] r15 = r11.S
            r15 = r15[r4]
            a1.g r15 = r15.f4409i
        L_0x0621:
            if (r6 == 0) goto L_0x062b
            int r6 = r6.e()
            int r6 = r6 + r5
            r22 = r6
            goto L_0x062d
        L_0x062b:
            r22 = r5
        L_0x062d:
            c1.d[] r5 = r9.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = r4 + r1
            if (r27 == 0) goto L_0x063b
            r24 = 8
            goto L_0x063d
        L_0x063b:
            r24 = r28
        L_0x063d:
            if (r2 == 0) goto L_0x0658
            if (r3 == 0) goto L_0x0658
            if (r7 == 0) goto L_0x0658
            if (r15 == 0) goto L_0x0658
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r26 = r28
            r6 = r7
            r7 = r15
            r15 = r8
            r8 = r22
            r22 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x065d
        L_0x0658:
            r15 = r8
            r22 = r9
            r26 = r28
        L_0x065d:
            r8 = r15
            goto L_0x0664
        L_0x065f:
            r22 = r9
            r26 = r28
            r8 = r1
        L_0x0664:
            int r1 = r11.f4438j0
            r2 = 8
            if (r1 == r2) goto L_0x066c
            r9 = r11
            goto L_0x066e
        L_0x066c:
            r9 = r22
        L_0x066e:
            r15 = r2
            r11 = r8
            r28 = r26
            goto L_0x05c7
        L_0x0674:
            c1.d[] r1 = r13.S
            r1 = r1[r17]
            c1.d[] r0 = r0.S
            r0 = r0[r17]
            c1.d r0 = r0.f4406f
            c1.d[] r2 = r12.S
            int r3 = r17 + 1
            r11 = r2[r3]
            c1.d[] r2 = r14.S
            r2 = r2[r3]
            c1.d r15 = r2.f4406f
            if (r0 == 0) goto L_0x06b5
            if (r13 == r12) goto L_0x069b
            a1.g r2 = r1.f4409i
            a1.g r0 = r0.f4409i
            int r1 = r1.e()
            r3 = 5
            r10.e(r2, r0, r1, r3)
            goto L_0x06b5
        L_0x069b:
            if (r15 == 0) goto L_0x06b5
            a1.g r2 = r1.f4409i
            a1.g r3 = r0.f4409i
            int r4 = r1.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            a1.g r6 = r11.f4409i
            a1.g r7 = r15.f4409i
            int r8 = r11.e()
            r9 = 5
            r1 = r38
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06b5:
            if (r15 == 0) goto L_0x06c6
            if (r13 == r12) goto L_0x06c6
            a1.g r0 = r11.f4409i
            a1.g r1 = r15.f4409i
            int r2 = r11.e()
            int r2 = -r2
            r3 = 5
            r10.e(r0, r1, r2, r3)
        L_0x06c6:
            if (r25 != 0) goto L_0x06ca
            if (r23 == 0) goto L_0x0724
        L_0x06ca:
            if (r13 == 0) goto L_0x0724
            if (r13 == r12) goto L_0x0724
            c1.d[] r0 = r13.S
            r1 = r0[r17]
            if (r12 != 0) goto L_0x06d6
            r8 = r13
            goto L_0x06d7
        L_0x06d6:
            r8 = r12
        L_0x06d7:
            c1.d[] r2 = r8.S
            int r3 = r17 + 1
            r2 = r2[r3]
            c1.d r4 = r1.f4406f
            if (r4 == 0) goto L_0x06e4
            a1.g r4 = r4.f4409i
            goto L_0x06e6
        L_0x06e4:
            r4 = r18
        L_0x06e6:
            c1.d r5 = r2.f4406f
            if (r5 == 0) goto L_0x06ed
            a1.g r5 = r5.f4409i
            goto L_0x06ef
        L_0x06ed:
            r5 = r18
        L_0x06ef:
            if (r14 == r8) goto L_0x0700
            c1.d[] r5 = r14.S
            r5 = r5[r3]
            c1.d r5 = r5.f4406f
            if (r5 == 0) goto L_0x06fd
            a1.g r5 = r5.f4409i
            r18 = r5
        L_0x06fd:
            r6 = r18
            goto L_0x0701
        L_0x0700:
            r6 = r5
        L_0x0701:
            if (r13 != r8) goto L_0x0705
            r2 = r0[r3]
        L_0x0705:
            if (r4 == 0) goto L_0x0724
            if (r6 == 0) goto L_0x0724
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.e()
            c1.d[] r7 = r8.S
            r3 = r7[r3]
            int r8 = r3.e()
            a1.g r3 = r1.f4409i
            a1.g r7 = r2.f4409i
            r9 = 5
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0724:
            int r9 = r29 + 1
            r0 = r37
            r11 = r39
            r13 = r20
            r15 = r30
            r12 = r35
            goto L_0x001f
        L_0x0732:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.b.a(c1.f, a1.d, java.util.ArrayList, int):void");
    }
}
