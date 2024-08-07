package l4;

import m4.c;

/* compiled from: LayerParser */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f12684a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f12685b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f12686c = c.a.a("ty", "nm");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: h4.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: h4.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: h4.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: h4.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: h4.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: h4.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: h4.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: h4.d} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x033a, code lost:
        r3 = false;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0533, code lost:
        r6 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x054c, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x056c, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x056d, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0470  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j4.e a(m4.d r49, com.airbnb.lottie.i r50) {
        /*
            r0 = r49
            r7 = r50
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r49.h()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r3 = 0
            r4 = 1
            java.lang.String r6 = "UNSET"
            r13 = 0
            r15 = -1
            r25 = r1
            r17 = r3
            r22 = r17
            r23 = r22
            r24 = r23
            r27 = r24
            r28 = r27
            r33 = r28
            r31 = r4
            r26 = r11
            r36 = r26
            r18 = r15
            r20 = 0
            r21 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r16 = r36
            r14 = r13
            r13 = r6
            r6 = 0
        L_0x004f:
            boolean r37 = r49.v()
            if (r37 == 0) goto L_0x0573
            m4.c$a r11 = f12684a
            int r11 = r0.N(r11)
            r2 = 4
            r42 = -1
            switch(r11) {
                case 0: goto L_0x0563;
                case 1: goto L_0x0558;
                case 2: goto L_0x054e;
                case 3: goto L_0x0536;
                case 4: goto L_0x0528;
                case 5: goto L_0x0516;
                case 6: goto L_0x0503;
                case 7: goto L_0x04f5;
                case 8: goto L_0x04eb;
                case 9: goto L_0x049f;
                case 10: goto L_0x035e;
                case 11: goto L_0x033e;
                case 12: goto L_0x027b;
                case 13: goto L_0x00bc;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00a9;
                case 16: goto L_0x009b;
                case 17: goto L_0x008d;
                case 18: goto L_0x0085;
                case 19: goto L_0x007d;
                case 20: goto L_0x0078;
                case 21: goto L_0x0073;
                case 22: goto L_0x006e;
                default: goto L_0x0061;
            }
        L_0x0061:
            r2 = r4
            r43 = r6
            r4 = r3
            r3 = 7
            r49.R()
            r49.S()
            goto L_0x054c
        L_0x006e:
            boolean r33 = r49.x()
            goto L_0x00b8
        L_0x0073:
            java.lang.String r6 = r49.E()
            goto L_0x00b8
        L_0x0078:
            h4.b r32 = j7.a.i0(r0, r7, r3)
            goto L_0x00b8
        L_0x007d:
            double r1 = r49.z()
            float r1 = (float) r1
            r36 = r1
            goto L_0x00b8
        L_0x0085:
            double r1 = r49.z()
            float r1 = (float) r1
            r16 = r1
            goto L_0x00b8
        L_0x008d:
            int r1 = r49.B()
            float r1 = (float) r1
            float r2 = n4.g.c()
            float r2 = r2 * r1
            int r1 = (int) r2
            r28 = r1
            goto L_0x00b8
        L_0x009b:
            int r1 = r49.B()
            float r1 = (float) r1
            float r2 = n4.g.c()
            float r2 = r2 * r1
            int r1 = (int) r2
            r27 = r1
            goto L_0x00b8
        L_0x00a9:
            double r1 = r49.z()
            float r1 = (float) r1
            r26 = r1
            goto L_0x00b8
        L_0x00b1:
            double r1 = r49.z()
            float r1 = (float) r1
            r25 = r1
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x00ba:
            r11 = 0
            goto L_0x004f
        L_0x00bc:
            r49.d()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x00c4:
            boolean r39 = r49.v()
            if (r39 == 0) goto L_0x0260
            r49.h()
        L_0x00cd:
            boolean r39 = r49.v()
            if (r39 == 0) goto L_0x0258
            m4.c$a r3 = f12686c
            int r3 = r0.N(r3)
            if (r3 == 0) goto L_0x00ee
            if (r3 == r4) goto L_0x00e5
            r49.R()
            r49.S()
            goto L_0x0253
        L_0x00e5:
            java.lang.String r3 = r49.E()
            r11.add(r3)
            goto L_0x0253
        L_0x00ee:
            int r3 = r49.B()
            r5 = 29
            if (r3 != r5) goto L_0x015b
            m4.c$a r3 = l4.d.f12657a
            r34 = 0
        L_0x00fa:
            boolean r3 = r49.v()
            if (r3 == 0) goto L_0x0158
            m4.c$a r3 = l4.d.f12657a
            int r3 = r0.N(r3)
            if (r3 == 0) goto L_0x010f
            r49.R()
            r49.S()
            goto L_0x00fa
        L_0x010f:
            r49.d()
        L_0x0112:
            boolean r3 = r49.v()
            if (r3 == 0) goto L_0x0154
            r49.h()
            r3 = 0
        L_0x011c:
            r5 = 0
        L_0x011d:
            boolean r39 = r49.v()
            if (r39 == 0) goto L_0x014c
            m4.c$a r1 = l4.d.f12658b
            int r1 = r0.N(r1)
            if (r1 == 0) goto L_0x0144
            if (r1 == r4) goto L_0x0134
            r49.R()
            r49.S()
            goto L_0x011d
        L_0x0134:
            if (r5 == 0) goto L_0x0140
            lc.b r3 = new lc.b
            h4.b r1 = j7.a.i0(r0, r7, r4)
            r3.<init>((java.lang.Object) r1, (int) r2)
            goto L_0x011d
        L_0x0140:
            r49.S()
            goto L_0x011d
        L_0x0144:
            int r1 = r49.B()
            if (r1 != 0) goto L_0x011c
            r5 = r4
            goto L_0x011d
        L_0x014c:
            r49.q()
            if (r3 == 0) goto L_0x0112
            r34 = r3
            goto L_0x0112
        L_0x0154:
            r49.i()
            goto L_0x00fa
        L_0x0158:
            r3 = 0
            goto L_0x00cd
        L_0x015b:
            r1 = 25
            if (r3 != r1) goto L_0x0253
            l4.h r1 = new l4.h
            r1.<init>()
        L_0x0164:
            boolean r3 = r49.v()
            if (r3 == 0) goto L_0x022b
            m4.c$a r3 = l4.h.f12663f
            int r3 = r0.N(r3)
            if (r3 == 0) goto L_0x0179
            r49.R()
            r49.S()
            goto L_0x0164
        L_0x0179:
            r49.d()
        L_0x017c:
            boolean r3 = r49.v()
            if (r3 == 0) goto L_0x0225
            r49.h()
            java.lang.String r3 = ""
        L_0x0187:
            boolean r5 = r49.v()
            if (r5 == 0) goto L_0x021f
            m4.c$a r5 = l4.h.f12664g
            int r5 = r0.N(r5)
            if (r5 == 0) goto L_0x0218
            if (r5 == r4) goto L_0x019f
            r49.R()
            r49.S()
            goto L_0x021c
        L_0x019f:
            r3.getClass()
            int r5 = r3.hashCode()
            switch(r5) {
                case 353103893: goto L_0x01d8;
                case 397447147: goto L_0x01cd;
                case 1041377119: goto L_0x01c2;
                case 1379387491: goto L_0x01b7;
                case 1383710113: goto L_0x01ac;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            r5 = r42
            goto L_0x01e2
        L_0x01ac:
            java.lang.String r5 = "Softness"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01b5
            goto L_0x01a9
        L_0x01b5:
            r5 = r2
            goto L_0x01e2
        L_0x01b7:
            java.lang.String r5 = "Shadow Color"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01c0
            goto L_0x01a9
        L_0x01c0:
            r5 = 3
            goto L_0x01e2
        L_0x01c2:
            java.lang.String r5 = "Direction"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01cb
            goto L_0x01a9
        L_0x01cb:
            r5 = 2
            goto L_0x01e2
        L_0x01cd:
            java.lang.String r5 = "Opacity"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01d6
            goto L_0x01a9
        L_0x01d6:
            r5 = r4
            goto L_0x01e2
        L_0x01d8:
            java.lang.String r5 = "Distance"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01e1
            goto L_0x01a9
        L_0x01e1:
            r5 = 0
        L_0x01e2:
            if (r5 == 0) goto L_0x0211
            if (r5 == r4) goto L_0x0209
            r4 = 2
            if (r5 == r4) goto L_0x0201
            r4 = 3
            if (r5 == r4) goto L_0x01fa
            if (r5 == r2) goto L_0x01f2
            r49.S()
            goto L_0x021c
        L_0x01f2:
            r4 = 1
            h4.b r5 = j7.a.i0(r0, r7, r4)
            r1.f12669e = r5
            goto L_0x021c
        L_0x01fa:
            h4.a r4 = j7.a.h0(r49, r50)
            r1.f12665a = r4
            goto L_0x021c
        L_0x0201:
            r4 = 0
            h4.b r5 = j7.a.i0(r0, r7, r4)
            r1.f12667c = r5
            goto L_0x021c
        L_0x0209:
            r4 = 0
            h4.b r5 = j7.a.i0(r0, r7, r4)
            r1.f12666b = r5
            goto L_0x021c
        L_0x0211:
            h4.b r5 = j7.a.i0(r0, r7, r4)
            r1.f12668d = r5
            goto L_0x021c
        L_0x0218:
            java.lang.String r3 = r49.E()
        L_0x021c:
            r4 = 1
            goto L_0x0187
        L_0x021f:
            r49.q()
            r4 = 1
            goto L_0x017c
        L_0x0225:
            r49.i()
            r4 = 1
            goto L_0x0164
        L_0x022b:
            h4.a r3 = r1.f12665a
            if (r3 == 0) goto L_0x0251
            h4.b r4 = r1.f12666b
            if (r4 == 0) goto L_0x0251
            h4.b r5 = r1.f12667c
            if (r5 == 0) goto L_0x0251
            h4.b r2 = r1.f12668d
            if (r2 == 0) goto L_0x0251
            h4.b r1 = r1.f12669e
            if (r1 == 0) goto L_0x0251
            c7.j r35 = new c7.j
            r43 = r35
            r44 = r3
            r45 = r4
            r46 = r5
            r47 = r2
            r48 = r1
            r43.<init>(r44, r45, r46, r47, r48)
            goto L_0x0253
        L_0x0251:
            r35 = 0
        L_0x0253:
            r2 = 4
            r3 = 0
            r4 = 1
            goto L_0x00cd
        L_0x0258:
            r49.q()
            r2 = 4
            r3 = 0
            r4 = 1
            goto L_0x00c4
        L_0x0260:
            r49.i()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r7.a(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x033a
        L_0x027b:
            r49.h()
        L_0x027e:
            boolean r1 = r49.v()
            if (r1 == 0) goto L_0x0333
            m4.c$a r1 = f12685b
            int r1 = r0.N(r1)
            if (r1 == 0) goto L_0x031f
            r2 = 1
            if (r1 == r2) goto L_0x0296
            r49.R()
            r49.S()
            goto L_0x027e
        L_0x0296:
            r49.d()
            boolean r1 = r49.v()
            if (r1 == 0) goto L_0x030f
            m4.c$a r1 = l4.b.f12652a
            r49.h()
            r1 = 0
        L_0x02a5:
            boolean r2 = r49.v()
            if (r2 == 0) goto L_0x02ff
            m4.c$a r2 = l4.b.f12652a
            int r2 = r0.N(r2)
            if (r2 == 0) goto L_0x02ba
            r49.R()
            r49.S()
            goto L_0x02a5
        L_0x02ba:
            r49.h()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x02c1:
            boolean r5 = r49.v()
            if (r5 == 0) goto L_0x02f5
            m4.c$a r5 = l4.b.f12653b
            int r5 = r0.N(r5)
            if (r5 == 0) goto L_0x02f0
            r11 = 1
            if (r5 == r11) goto L_0x02eb
            r11 = 2
            if (r5 == r11) goto L_0x02e5
            r11 = 3
            if (r5 == r11) goto L_0x02df
            r49.R()
            r49.S()
            goto L_0x02c1
        L_0x02df:
            r5 = 1
            h4.b r4 = j7.a.i0(r0, r7, r5)
            goto L_0x02c1
        L_0x02e5:
            r5 = 1
            h4.b r3 = j7.a.i0(r0, r7, r5)
            goto L_0x02c1
        L_0x02eb:
            h4.a r2 = j7.a.h0(r49, r50)
            goto L_0x02c1
        L_0x02f0:
            h4.a r1 = j7.a.h0(r49, r50)
            goto L_0x02c1
        L_0x02f5:
            r49.q()
            a1.c r5 = new a1.c
            r5.<init>(r1, r2, r3, r4)
            r1 = r5
            goto L_0x02a5
        L_0x02ff:
            r49.q()
            if (r1 != 0) goto L_0x030b
            a1.c r1 = new a1.c
            r2 = 0
            r1.<init>(r2, r2, r2, r2)
            goto L_0x030c
        L_0x030b:
            r2 = 0
        L_0x030c:
            r30 = r1
            goto L_0x0310
        L_0x030f:
            r2 = 0
        L_0x0310:
            boolean r1 = r49.v()
            if (r1 == 0) goto L_0x031a
            r49.S()
            goto L_0x0310
        L_0x031a:
            r49.i()
            goto L_0x027e
        L_0x031f:
            r2 = 0
            h4.c r1 = new h4.c
            l4.g r3 = l4.g.f12661a
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.util.ArrayList r3 = l4.o.a(r0, r7, r4, r3, r5)
            r5 = 2
            r1.<init>(r5, r3)
            r29 = r1
            goto L_0x027e
        L_0x0333:
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r49.q()
            r1 = r4
        L_0x033a:
            r3 = 0
            r4 = 1
            goto L_0x00ba
        L_0x033e:
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r49.d()
        L_0x0344:
            boolean r1 = r49.v()
            if (r1 == 0) goto L_0x0354
            i4.b r1 = l4.f.a(r49, r50)
            if (r1 == 0) goto L_0x0344
            r8.add(r1)
            goto L_0x0344
        L_0x0354:
            r49.i()
            r43 = r6
            r2 = 1
            r3 = 7
            r4 = 0
            goto L_0x054c
        L_0x035e:
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r49.d()
        L_0x0364:
            boolean r1 = r49.v()
            if (r1 == 0) goto L_0x048f
            r49.h()
            r5 = r2
            r11 = r5
            r1 = 0
            r3 = 0
        L_0x0371:
            boolean r39 = r49.v()
            if (r39 == 0) goto L_0x047c
            java.lang.String r2 = r49.e0()
            r2.getClass()
            int r4 = r2.hashCode()
            r43 = r6
            r6 = 111(0x6f, float:1.56E-43)
            if (r4 == r6) goto L_0x03ba
            r6 = 3588(0xe04, float:5.028E-42)
            if (r4 == r6) goto L_0x03af
            r6 = 104433(0x197f1, float:1.46342E-40)
            if (r4 == r6) goto L_0x03a4
            r6 = 3357091(0x3339a3, float:4.704286E-39)
            if (r4 == r6) goto L_0x0399
        L_0x0396:
            r4 = r42
            goto L_0x03c4
        L_0x0399:
            java.lang.String r4 = "mode"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x03a2
            goto L_0x0396
        L_0x03a2:
            r4 = 3
            goto L_0x03c4
        L_0x03a4:
            java.lang.String r4 = "inv"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x03ad
            goto L_0x0396
        L_0x03ad:
            r4 = 2
            goto L_0x03c4
        L_0x03af:
            java.lang.String r4 = "pt"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x03b8
            goto L_0x0396
        L_0x03b8:
            r4 = 1
            goto L_0x03c4
        L_0x03ba:
            java.lang.String r4 = "o"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x03c3
            goto L_0x0396
        L_0x03c3:
            r4 = 0
        L_0x03c4:
            if (r4 == 0) goto L_0x0470
            r6 = 1
            if (r4 == r6) goto L_0x045d
            r6 = 2
            if (r4 == r6) goto L_0x0457
            r6 = 3
            if (r4 == r6) goto L_0x03d4
            r49.S()
            goto L_0x0475
        L_0x03d4:
            java.lang.String r1 = r49.E()
            r1.getClass()
            int r4 = r1.hashCode()
            r6 = 97
            if (r4 == r6) goto L_0x0413
            r6 = 105(0x69, float:1.47E-43)
            if (r4 == r6) goto L_0x0408
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 == r6) goto L_0x03fd
            r6 = 115(0x73, float:1.61E-43)
            if (r4 == r6) goto L_0x03f2
        L_0x03ef:
            r1 = r42
            goto L_0x041d
        L_0x03f2:
            java.lang.String r4 = "s"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03fb
            goto L_0x03ef
        L_0x03fb:
            r1 = 3
            goto L_0x041d
        L_0x03fd:
            java.lang.String r4 = "n"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0406
            goto L_0x03ef
        L_0x0406:
            r1 = 2
            goto L_0x041d
        L_0x0408:
            java.lang.String r4 = "i"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0411
            goto L_0x03ef
        L_0x0411:
            r1 = 1
            goto L_0x041d
        L_0x0413:
            java.lang.String r4 = "a"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x041c
            goto L_0x03ef
        L_0x041c:
            r1 = 0
        L_0x041d:
            if (r1 == 0) goto L_0x0452
            r4 = 1
            if (r1 == r4) goto L_0x0448
            r4 = 2
            if (r1 == r4) goto L_0x0444
            r6 = 3
            if (r1 == r6) goto L_0x0442
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r2 = ". Defaulting to Add."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            n4.c.b(r1)
            goto L_0x0453
        L_0x0442:
            r1 = r4
            goto L_0x0475
        L_0x0444:
            r6 = r43
            r1 = 4
            goto L_0x0477
        L_0x0448:
            r4 = 2
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r7.a(r1)
            r6 = r43
            r1 = 3
            goto L_0x0477
        L_0x0452:
            r4 = 2
        L_0x0453:
            r6 = r43
            r1 = 1
            goto L_0x0477
        L_0x0457:
            r4 = r6
            boolean r3 = r49.x()
            goto L_0x0475
        L_0x045d:
            r4 = 2
            h4.a r5 = new h4.a
            float r2 = n4.g.c()
            l4.w r6 = l4.w.f12696a
            r4 = 0
            java.util.ArrayList r2 = l4.o.a(r0, r7, r2, r6, r4)
            r6 = 1
            r5.<init>(r6, r2)
            goto L_0x0475
        L_0x0470:
            r4 = 0
            h4.d r11 = j7.a.j0(r49, r50)
        L_0x0475:
            r6 = r43
        L_0x0477:
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0371
        L_0x047c:
            r43 = r6
            r4 = 0
            r49.q()
            i4.f r2 = new i4.f
            r2.<init>(r1, r5, r11, r3)
            r10.add(r2)
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0364
        L_0x048f:
            r43 = r6
            r4 = 0
            int r1 = r10.size()
            int r2 = r7.f4846o
            int r2 = r2 + r1
            r7.f4846o = r2
            r49.i()
            goto L_0x04c2
        L_0x049f:
            r4 = r3
            r43 = r6
            int r1 = r49.B()
            r2 = 6
            int[] r3 = v.v.k(r2)
            int r2 = r3.length
            if (r1 < r2) goto L_0x04c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported matte type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r7.a(r1)
        L_0x04c2:
            r2 = 1
            r3 = 7
            goto L_0x054c
        L_0x04c6:
            r2 = 6
            int[] r2 = v.v.k(r2)
            r31 = r2[r1]
            int r1 = v.v.g(r31)
            r2 = 3
            if (r1 == r2) goto L_0x04de
            r2 = 4
            if (r1 == r2) goto L_0x04d8
            goto L_0x04e3
        L_0x04d8:
            java.lang.String r1 = "Unsupported matte type: Luma Inverted"
            r7.a(r1)
            goto L_0x04e3
        L_0x04de:
            java.lang.String r1 = "Unsupported matte type: Luma"
            r7.a(r1)
        L_0x04e3:
            int r1 = r7.f4846o
            r2 = 1
            int r1 = r1 + r2
            r7.f4846o = r1
            goto L_0x054c
        L_0x04eb:
            r2 = r4
            r43 = r6
            r4 = r3
            h4.g r21 = l4.c.a(r49, r50)
            goto L_0x056d
        L_0x04f5:
            r2 = r4
            r43 = r6
            r4 = r3
            java.lang.String r1 = r49.E()
            int r24 = android.graphics.Color.parseColor(r1)
            goto L_0x056d
        L_0x0503:
            r2 = r4
            r43 = r6
            r4 = r3
            int r1 = r49.B()
            float r1 = (float) r1
            float r3 = n4.g.c()
            float r3 = r3 * r1
            int r1 = (int) r3
            r23 = r1
            goto L_0x056c
        L_0x0516:
            r2 = r4
            r43 = r6
            r4 = r3
            int r1 = r49.B()
            float r1 = (float) r1
            float r3 = n4.g.c()
            float r3 = r3 * r1
            int r1 = (int) r3
            r22 = r1
            goto L_0x056c
        L_0x0528:
            r2 = r4
            r43 = r6
            r4 = r3
            int r1 = r49.B()
            long r5 = (long) r1
            r18 = r5
        L_0x0533:
            r6 = r43
            goto L_0x056d
        L_0x0536:
            r2 = r4
            r43 = r6
            r4 = r3
            int r1 = r49.B()
            r3 = 6
            if (r1 >= r3) goto L_0x0549
            r3 = 7
            int[] r5 = v.v.k(r3)
            r17 = r5[r1]
            goto L_0x054c
        L_0x0549:
            r3 = 7
            r17 = r3
        L_0x054c:
            r3 = r4
            goto L_0x0533
        L_0x054e:
            r2 = r4
            r43 = r6
            r4 = r3
            r3 = 7
            java.lang.String r20 = r49.E()
            goto L_0x056c
        L_0x0558:
            r2 = r4
            r43 = r6
            r4 = r3
            r3 = 7
            int r1 = r49.B()
            long r14 = (long) r1
            goto L_0x056c
        L_0x0563:
            r2 = r4
            r43 = r6
            r4 = r3
            r3 = 7
            java.lang.String r13 = r49.E()
        L_0x056c:
            r3 = r4
        L_0x056d:
            r1 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r4 = r2
            goto L_0x004f
        L_0x0573:
            r43 = r6
            r49.q()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = 0
            int r1 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x059f
            o4.a r6 = new o4.a
            r4 = 0
            r5 = 0
            java.lang.Float r38 = java.lang.Float.valueOf(r16)
            r0 = r6
            r1 = r50
            r2 = r12
            r3 = r12
            r39 = r10
            r40 = r14
            r10 = r43
            r14 = r6
            r6 = r38
            r0.<init>((com.airbnb.lottie.i) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r11.add(r14)
            goto L_0x05a5
        L_0x059f:
            r39 = r10
            r40 = r14
            r10 = r43
        L_0x05a5:
            r0 = 0
            int r0 = (r36 > r0 ? 1 : (r36 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ab
            goto L_0x05af
        L_0x05ab:
            float r0 = r7.f4843l
            r36 = r0
        L_0x05af:
            o4.a r14 = new o4.a
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r36)
            r0 = r14
            r1 = r50
            r2 = r9
            r3 = r9
            r5 = r16
            r0.<init>((com.airbnb.lottie.i) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r11.add(r14)
            o4.a r9 = new o4.a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r2 = r12
            r3 = r12
            r5 = r36
            r0.<init>((com.airbnb.lottie.i) r1, r2, r3, (android.view.animation.Interpolator) r4, (float) r5, (java.lang.Float) r6)
            r11.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x05e7
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x05ec
        L_0x05e7:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.a(r0)
        L_0x05ec:
            j4.e r36 = new j4.e
            r0 = r36
            r1 = r8
            r2 = r50
            r3 = r13
            r4 = r40
            r6 = r17
            r7 = r18
            r9 = r20
            r10 = r39
            r37 = r11
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r25
            r16 = r26
            r17 = r27
            r18 = r28
            r19 = r29
            r20 = r30
            r21 = r37
            r22 = r31
            r23 = r32
            r24 = r33
            r25 = r34
            r26 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.p.a(m4.d, com.airbnb.lottie.i):j4.e");
    }
}
