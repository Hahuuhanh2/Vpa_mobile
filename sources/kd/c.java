package kd;

/* compiled from: Code128Reader */
public final class c extends q {

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f12473a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019d, code lost:
        r3 = false;
        r9 = 'd';
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a2, code lost:
        r3 = false;
        r9 = 'd';
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a7, code lost:
        r3 = false;
        r9 = 'd';
        r15 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ae, code lost:
        r9 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b1, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b3, code lost:
        r3 = false;
        r9 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e3, code lost:
        r15 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ec, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ef, code lost:
        if (r20 == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f1, code lost:
        if (r15 != 'e') goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f3, code lost:
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f5, code lost:
        r10 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f6, code lost:
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f7, code lost:
        r20 = r3;
        r3 = r21;
        r6 = 6;
        r13 = 0.7f;
        r21 = r14;
        r14 = r7;
        r7 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0156, code lost:
        if (r12 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015c, code lost:
        r9 = 'd';
        r15 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0196, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019a, code lost:
        if (r12 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019c, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h c(int r27, cd.a r28, java.util.Map<uc.b, ?> r29) {
        /*
            r26 = this;
            r0 = r28
            r1 = r29
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0012
            uc.b r4 = uc.b.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = r3
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            int r4 = r0.f4688b
            int r5 = r0.f(r2)
            r6 = 6
            int[] r7 = new int[r6]
            r9 = r2
            r10 = r9
            r8 = r5
        L_0x001f:
            if (r5 >= r4) goto L_0x02ba
            boolean r11 = r0.e(r5)
            if (r11 == r9) goto L_0x0030
            r11 = r7[r10]
            int r11 = r11 + r3
            r7[r10] = r11
            r11 = r27
            goto L_0x02b5
        L_0x0030:
            r11 = 5
            if (r10 != r11) goto L_0x02ac
            r14 = 103(0x67, float:1.44E-43)
            r15 = -1
            r16 = 1048576000(0x3e800000, float:0.25)
        L_0x0038:
            r11 = 105(0x69, float:1.47E-43)
            r13 = 1060320051(0x3f333333, float:0.7)
            if (r14 > r11) goto L_0x0051
            int[][] r11 = f12473a
            r11 = r11[r14]
            float r11 = kd.q.e(r7, r11, r13)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x004e
            r16 = r11
            r15 = r14
        L_0x004e:
            int r14 = r14 + 1
            goto L_0x0038
        L_0x0051:
            r11 = 2
            if (r15 < 0) goto L_0x0297
            int r14 = r5 - r8
            int r14 = r14 / r11
            int r14 = r8 - r14
            int r14 = java.lang.Math.max(r2, r14)
            boolean r14 = r0.j(r14, r8)
            if (r14 == 0) goto L_0x0297
            r4 = 3
            int[] r4 = new int[r4]
            r4[r2] = r8
            r4[r3] = r5
            r4[r11] = r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 20
            r5.<init>(r7)
            byte r8 = (byte) r15
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            r5.add(r8)
            switch(r15) {
                case 103: goto L_0x0089;
                case 104: goto L_0x0086;
                case 105: goto L_0x0083;
                default: goto L_0x007e;
            }
        L_0x007e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0083:
            r14 = 99
            goto L_0x008b
        L_0x0086:
            r14 = 100
            goto L_0x008b
        L_0x0089:
            r14 = 101(0x65, float:1.42E-43)
        L_0x008b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r7 = r4[r2]
            r17 = r4[r3]
            int[] r2 = new int[r6]
            r22 = r3
            r3 = 0
            r11 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r25 = r14
            r14 = r7
            r7 = r17
            r17 = r15
            r15 = r25
        L_0x00ac:
            if (r18 != 0) goto L_0x0209
            kd.q.f(r7, r0, r2)
            r3 = 0
            r14 = -1
            r23 = 1048576000(0x3e800000, float:0.25)
        L_0x00b5:
            int[][] r24 = f12473a
            r9 = 107(0x6b, float:1.5E-43)
            if (r3 >= r9) goto L_0x00cb
            r9 = r24[r3]
            float r9 = kd.q.e(r2, r9, r13)
            int r24 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r24 >= 0) goto L_0x00c8
            r14 = r3
            r23 = r9
        L_0x00c8:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00cb:
            if (r14 < 0) goto L_0x0206
            byte r3 = (byte) r14
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r5.add(r3)
            r3 = 106(0x6a, float:1.49E-43)
            if (r14 == r3) goto L_0x00db
            r22 = 1
        L_0x00db:
            if (r14 == r3) goto L_0x00e5
            int r19 = r19 + 1
            int r9 = r19 * r14
            int r9 = r9 + r17
            r17 = r9
        L_0x00e5:
            r23 = r7
            r9 = 0
        L_0x00e8:
            if (r9 >= r6) goto L_0x00f1
            r24 = r2[r9]
            int r23 = r23 + r24
            int r9 = r9 + 1
            goto L_0x00e8
        L_0x00f1:
            switch(r14) {
                case 103: goto L_0x0101;
                case 104: goto L_0x0101;
                case 105: goto L_0x0101;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            r9 = 96
            java.lang.String r6 = "]C1"
            r13 = 29
            switch(r15) {
                case 99: goto L_0x01b7;
                case 100: goto L_0x0162;
                case 101: goto L_0x0106;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            r9 = 100
            goto L_0x01ec
        L_0x0101:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0106:
            r10 = 64
            if (r14 >= r10) goto L_0x011e
            if (r12 != r11) goto L_0x0114
            int r3 = r14 + 32
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x0114:
            int r3 = r14 + 32
            int r3 = r3 + 128
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x011e:
            if (r14 >= r9) goto L_0x0132
            if (r12 != r11) goto L_0x012a
            int r3 = r14 + -64
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x012a:
            int r3 = r14 + 64
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x0132:
            if (r14 == r3) goto L_0x0136
            r22 = 0
        L_0x0136:
            if (r14 == r3) goto L_0x01b1
            switch(r14) {
                case 98: goto L_0x015b;
                case 99: goto L_0x01a7;
                case 100: goto L_0x0159;
                case 101: goto L_0x014f;
                case 102: goto L_0x013d;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x01b3
        L_0x013d:
            if (r1 == 0) goto L_0x01b3
            int r3 = r8.length()
            if (r3 != 0) goto L_0x014a
            r8.append(r6)
            goto L_0x01b3
        L_0x014a:
            r8.append(r13)
            goto L_0x01b3
        L_0x014f:
            if (r11 != 0) goto L_0x0154
            if (r12 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            if (r11 == 0) goto L_0x01a2
            if (r12 == 0) goto L_0x01a2
            goto L_0x019c
        L_0x0159:
            r3 = 0
            goto L_0x015c
        L_0x015b:
            r3 = 1
        L_0x015c:
            r9 = 100
            r15 = 100
            goto L_0x01ed
        L_0x0162:
            if (r14 >= r9) goto L_0x0176
            if (r12 != r11) goto L_0x016d
            int r3 = r14 + 32
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x016d:
            int r3 = r14 + 32
            int r3 = r3 + 128
            char r3 = (char) r3
            r8.append(r3)
            goto L_0x019d
        L_0x0176:
            if (r14 == r3) goto L_0x017a
            r22 = 0
        L_0x017a:
            if (r14 == r3) goto L_0x01b1
            switch(r14) {
                case 98: goto L_0x01ad;
                case 99: goto L_0x01a7;
                case 100: goto L_0x0192;
                case 101: goto L_0x0190;
                case 102: goto L_0x0180;
                default: goto L_0x017f;
            }
        L_0x017f:
            goto L_0x01b3
        L_0x0180:
            if (r1 == 0) goto L_0x01b3
            int r3 = r8.length()
            if (r3 != 0) goto L_0x018c
            r8.append(r6)
            goto L_0x01b3
        L_0x018c:
            r8.append(r13)
            goto L_0x01b3
        L_0x0190:
            r3 = 0
            goto L_0x01ae
        L_0x0192:
            if (r11 != 0) goto L_0x0198
            if (r12 == 0) goto L_0x0198
        L_0x0196:
            r11 = 1
            goto L_0x019d
        L_0x0198:
            if (r11 == 0) goto L_0x01a2
            if (r12 == 0) goto L_0x01a2
        L_0x019c:
            r11 = 0
        L_0x019d:
            r3 = 0
            r9 = 100
            r12 = 0
            goto L_0x01ed
        L_0x01a2:
            r3 = 0
            r9 = 100
            r12 = 1
            goto L_0x01ed
        L_0x01a7:
            r3 = 0
            r9 = 100
            r15 = 99
            goto L_0x01ed
        L_0x01ad:
            r3 = 1
        L_0x01ae:
            r9 = 100
            goto L_0x01e3
        L_0x01b1:
            r18 = 1
        L_0x01b3:
            r3 = 0
            r9 = 100
            goto L_0x01ed
        L_0x01b7:
            r9 = 100
            if (r14 >= r9) goto L_0x01c8
            r3 = 10
            if (r14 >= r3) goto L_0x01c4
            r3 = 48
            r8.append(r3)
        L_0x01c4:
            r8.append(r14)
            goto L_0x01ec
        L_0x01c8:
            if (r14 == r3) goto L_0x01cc
            r22 = 0
        L_0x01cc:
            if (r14 == r3) goto L_0x01e8
            switch(r14) {
                case 100: goto L_0x01e6;
                case 101: goto L_0x01e2;
                case 102: goto L_0x01d2;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            goto L_0x01ec
        L_0x01d2:
            if (r1 == 0) goto L_0x01ec
            int r3 = r8.length()
            if (r3 != 0) goto L_0x01de
            r8.append(r6)
            goto L_0x01ec
        L_0x01de:
            r8.append(r13)
            goto L_0x01ec
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            r15 = 101(0x65, float:1.42E-43)
            goto L_0x01ed
        L_0x01e6:
            r15 = r9
            goto L_0x01ec
        L_0x01e8:
            r3 = 0
            r18 = 1
            goto L_0x01ed
        L_0x01ec:
            r3 = 0
        L_0x01ed:
            r6 = 101(0x65, float:1.42E-43)
            if (r20 == 0) goto L_0x01f7
            if (r15 != r6) goto L_0x01f5
            r10 = r9
            goto L_0x01f6
        L_0x01f5:
            r10 = r6
        L_0x01f6:
            r15 = r10
        L_0x01f7:
            r20 = r3
            r3 = r21
            r6 = 6
            r13 = 1060320051(0x3f333333, float:0.7)
            r21 = r14
            r14 = r7
            r7 = r23
            goto L_0x00ac
        L_0x0206:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x0209:
            int r1 = r7 - r14
            int r2 = r0.g(r7)
            int r6 = r0.f4688b
            int r7 = r2 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r2
            int r6 = java.lang.Math.min(r6, r7)
            boolean r0 = r0.j(r2, r6)
            if (r0 == 0) goto L_0x0294
            int r19 = r19 * r3
            int r17 = r17 - r19
            r0 = 103(0x67, float:1.44E-43)
            int r0 = r17 % 103
            if (r0 != r3) goto L_0x028f
            int r0 = r8.length()
            if (r0 == 0) goto L_0x028c
            if (r0 <= 0) goto L_0x0243
            if (r22 == 0) goto L_0x0243
            r2 = 99
            if (r15 != r2) goto L_0x023e
            int r2 = r0 + -2
            r8.delete(r2, r0)
            goto L_0x0243
        L_0x023e:
            int r2 = r0 + -1
            r8.delete(r2, r0)
        L_0x0243:
            r0 = 1
            r2 = r4[r0]
            r0 = 0
            r3 = r4[r0]
            int r2 = r2 + r3
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r14
            float r1 = (float) r1
            float r1 = r1 / r2
            float r1 = r1 + r3
            int r2 = r5.size()
            byte[] r3 = new byte[r2]
            r4 = 0
        L_0x0259:
            if (r4 >= r2) goto L_0x026a
            java.lang.Object r6 = r5.get(r4)
            java.lang.Byte r6 = (java.lang.Byte) r6
            byte r6 = r6.byteValue()
            r3[r4] = r6
            int r4 = r4 + 1
            goto L_0x0259
        L_0x026a:
            uc.h r2 = new uc.h
            java.lang.String r4 = r8.toString()
            r5 = 2
            uc.j[] r5 = new uc.j[r5]
            uc.j r6 = new uc.j
            r11 = r27
            float r7 = (float) r11
            r6.<init>(r0, r7)
            r0 = 0
            r5[r0] = r6
            uc.j r0 = new uc.j
            r0.<init>(r1, r7)
            r1 = 1
            r5[r1] = r0
            uc.a r0 = uc.a.CODE_128
            r2.<init>(r4, r3, r5, r0)
            return r2
        L_0x028c:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x028f:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x0294:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x0297:
            r11 = r27
            r3 = r7[r2]
            r6 = 1
            r12 = r7[r6]
            int r3 = r3 + r12
            int r8 = r8 + r3
            int r3 = r10 + -1
            r6 = 2
            java.lang.System.arraycopy(r7, r6, r7, r2, r3)
            r7[r3] = r2
            r7[r10] = r2
            r10 = r3
            goto L_0x02b0
        L_0x02ac:
            r11 = r27
            int r10 = r10 + 1
        L_0x02b0:
            r3 = 1
            r7[r10] = r3
            r9 = r9 ^ 1
        L_0x02b5:
            int r5 = r5 + 1
            r6 = 6
            goto L_0x001f
        L_0x02ba:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.c(int, cd.a, java.util.Map):uc.h");
    }
}
