package kd;

import com.google.zxing.ChecksumException;

/* compiled from: Code93Reader */
public final class g extends q {

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f12478c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12479d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12480e;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f12481a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12482b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f12479d = iArr;
        f12480e = iArr[47];
    }

    public static void h(StringBuilder sb2, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb2.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (sb2.charAt(i10) != f12478c[i12 % 47]) {
            throw ChecksumException.a();
        }
    }

    public static int i(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((((float) iArr[i13]) * 9.0f) / ((float) i10));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0197, code lost:
        throw com.google.zxing.NotFoundException.f7967c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r8 = f12478c[r9];
        r7.append(r8);
        r9 = r6.length;
        r10 = 0;
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r10 >= r9) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9 = r1.f(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r8 != '*') goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r7.deleteCharAt(r7.length() - 1);
        r8 = r6.length;
        r10 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r10 >= r8) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r12 = r12 + r6[r10];
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r9 == r5) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r1.e(r9) == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r7.length() < 2) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r1 = r7.length();
        h(r7, r1 - 2, 20);
        h(r7, r1 - 1, 15);
        r7.setLength(r7.length() - 2);
        r1 = r7.length();
        r5 = new java.lang.StringBuilder(r1);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (r6 >= r1) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r8 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        if (r8 < 'a') goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r8 > 'd') goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r6 >= (r1 - 1)) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r6 = r6 + 1;
        r9 = r7.charAt(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        switch(r8) {
            case 97: goto L_0x0148;
            case 98: goto L_0x00ff;
            case 99: goto L_0x00ed;
            case 100: goto L_0x00e0;
            default: goto L_0x00de;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (r9 < 'A') goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (r9 > 'Z') goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e4, code lost:
        r9 = r9 + ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        if (r9 < 'A') goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        if (r9 > 'O') goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r9 = r9 - ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r9 != 'Z') goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r8 = ':';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if (r9 < 'A') goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        if (r9 > 'E') goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r9 = r9 - '&';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010a, code lost:
        if (r9 < 'F') goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        if (r9 > 'J') goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
        r9 = r9 - 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0115, code lost:
        if (r9 < 'K') goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        if (r9 > 'O') goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        r9 = r9 + 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        if (r9 < 'P') goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (r9 > 'T') goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        r9 = r9 + '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        if (r9 != 'U') goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012e, code lost:
        if (r9 != 'V') goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        r8 = '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0135, code lost:
        if (r9 != 'W') goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0137, code lost:
        r8 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013c, code lost:
        if (r9 < 'X') goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        if (r9 > 'Z') goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0140, code lost:
        r8 = 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0147, code lost:
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0148, code lost:
        if (r9 < 'A') goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        if (r9 > 'Z') goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014c, code lost:
        r9 = r9 - '@';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014e, code lost:
        r8 = (char) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0154, code lost:
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0155, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0156, code lost:
        r5.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015e, code lost:
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015f, code lost:
        r5.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0162, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0165, code lost:
        r9 = (float) r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0191, code lost:
        return new uc.h(r5.toString(), (byte[]) null, new uc.j[]{new uc.j(((float) (r2[1] + r2[0])) / 2.0f, r9), new uc.j((((float) r12) / 2.0f) + ((float) r4), r9)}, uc.a.CODE_93);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0194, code lost:
        throw com.google.zxing.NotFoundException.f7967c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h c(int r17, cd.a r18, java.util.Map<uc.b, ?> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            int r2 = r1.f4688b
            r3 = 0
            int r4 = r1.f(r3)
            int[] r5 = r0.f12482b
            java.util.Arrays.fill(r5, r3)
            int[] r5 = r0.f12482b
            int r6 = r5.length
            r8 = r3
            r9 = r8
            r7 = r4
        L_0x0016:
            if (r4 >= r2) goto L_0x01c8
            boolean r10 = r1.e(r4)
            r11 = 1
            if (r10 == r8) goto L_0x0028
            r10 = r5[r9]
            int r10 = r10 + r11
            r5[r9] = r10
            r10 = r17
            goto L_0x01c4
        L_0x0028:
            int r10 = r6 + -1
            if (r9 != r10) goto L_0x01bc
            int r10 = i(r5)
            int r12 = f12480e
            r13 = 2
            if (r10 != r12) goto L_0x01a9
            int[] r2 = new int[r13]
            r2[r3] = r7
            r2[r11] = r4
            int r4 = r1.f(r4)
            int r5 = r1.f4688b
            int[] r6 = r0.f12482b
            java.util.Arrays.fill(r6, r3)
            java.lang.StringBuilder r7 = r0.f12481a
            r7.setLength(r3)
        L_0x004b:
            kd.q.f(r4, r1, r6)
            int r8 = i(r6)
            if (r8 < 0) goto L_0x01a6
            r9 = r3
        L_0x0055:
            int[] r10 = f12479d
            int r12 = r10.length
            if (r9 >= r12) goto L_0x01a3
            r10 = r10[r9]
            if (r10 != r8) goto L_0x019d
            char[] r8 = f12478c
            char r8 = r8[r9]
            r7.append(r8)
            int r9 = r6.length
            r10 = r3
            r12 = r4
        L_0x0068:
            if (r10 >= r9) goto L_0x0070
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x0068
        L_0x0070:
            int r9 = r1.f(r12)
            r10 = 42
            if (r8 != r10) goto L_0x0198
            int r8 = r7.length()
            int r8 = r8 - r11
            r7.deleteCharAt(r8)
            int r8 = r6.length
            r10 = r3
            r12 = r10
        L_0x0083:
            if (r10 >= r8) goto L_0x008b
            r14 = r6[r10]
            int r12 = r12 + r14
            int r10 = r10 + 1
            goto L_0x0083
        L_0x008b:
            if (r9 == r5) goto L_0x0195
            boolean r1 = r1.e(r9)
            if (r1 == 0) goto L_0x0195
            int r1 = r7.length()
            if (r1 < r13) goto L_0x0192
            int r1 = r7.length()
            int r5 = r1 + -2
            r6 = 20
            h(r7, r5, r6)
            int r1 = r1 + -1
            r5 = 15
            h(r7, r1, r5)
            int r1 = r7.length()
            int r1 = r1 - r13
            r7.setLength(r1)
            int r1 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r6 = r3
        L_0x00bd:
            if (r6 >= r1) goto L_0x0165
            char r8 = r7.charAt(r6)
            r9 = 97
            if (r8 < r9) goto L_0x015f
            r9 = 100
            if (r8 > r9) goto L_0x015f
            int r9 = r1 + -1
            if (r6 >= r9) goto L_0x015a
            int r6 = r6 + 1
            char r9 = r7.charAt(r6)
            r10 = 79
            r14 = 90
            r15 = 65
            switch(r8) {
                case 97: goto L_0x0148;
                case 98: goto L_0x00ff;
                case 99: goto L_0x00ed;
                case 100: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x0155
        L_0x00e0:
            if (r9 < r15) goto L_0x00e8
            if (r9 > r14) goto L_0x00e8
            int r9 = r9 + 32
            goto L_0x014e
        L_0x00e8:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x00ed:
            if (r9 < r15) goto L_0x00f4
            if (r9 > r10) goto L_0x00f4
            int r9 = r9 + -32
            goto L_0x014e
        L_0x00f4:
            if (r9 != r14) goto L_0x00fa
            r8 = 58
            goto L_0x0156
        L_0x00fa:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x00ff:
            if (r9 < r15) goto L_0x0108
            r8 = 69
            if (r9 > r8) goto L_0x0108
            int r9 = r9 + -38
            goto L_0x014e
        L_0x0108:
            r8 = 70
            if (r9 < r8) goto L_0x0113
            r8 = 74
            if (r9 > r8) goto L_0x0113
            int r9 = r9 + -11
            goto L_0x014e
        L_0x0113:
            r8 = 75
            if (r9 < r8) goto L_0x011c
            if (r9 > r10) goto L_0x011c
            int r9 = r9 + 16
            goto L_0x014e
        L_0x011c:
            r8 = 80
            if (r9 < r8) goto L_0x0127
            r8 = 84
            if (r9 > r8) goto L_0x0127
            int r9 = r9 + 43
            goto L_0x014e
        L_0x0127:
            r8 = 85
            if (r9 != r8) goto L_0x012c
            goto L_0x0155
        L_0x012c:
            r8 = 86
            if (r9 != r8) goto L_0x0133
            r8 = 64
            goto L_0x0156
        L_0x0133:
            r8 = 87
            if (r9 != r8) goto L_0x013a
            r8 = 96
            goto L_0x0156
        L_0x013a:
            r8 = 88
            if (r9 < r8) goto L_0x0143
            if (r9 > r14) goto L_0x0143
            r8 = 127(0x7f, float:1.78E-43)
            goto L_0x0156
        L_0x0143:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x0148:
            if (r9 < r15) goto L_0x0150
            if (r9 > r14) goto L_0x0150
            int r9 = r9 + -64
        L_0x014e:
            char r8 = (char) r9
            goto L_0x0156
        L_0x0150:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x0155:
            r8 = r3
        L_0x0156:
            r5.append(r8)
            goto L_0x0162
        L_0x015a:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x015f:
            r5.append(r8)
        L_0x0162:
            int r6 = r6 + r11
            goto L_0x00bd
        L_0x0165:
            java.lang.String r1 = r5.toString()
            r5 = r2[r11]
            r2 = r2[r3]
            int r5 = r5 + r2
            float r2 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            float r4 = (float) r4
            float r6 = (float) r12
            float r6 = r6 / r5
            float r6 = r6 + r4
            uc.h r4 = new uc.h
            r5 = 0
            uc.j[] r7 = new uc.j[r13]
            uc.j r8 = new uc.j
            r10 = r17
            float r9 = (float) r10
            r8.<init>(r2, r9)
            r7[r3] = r8
            uc.j r2 = new uc.j
            r2.<init>(r6, r9)
            r7[r11] = r2
            uc.a r2 = uc.a.CODE_93
            r4.<init>(r1, r5, r7, r2)
            return r4
        L_0x0192:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0195:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x0198:
            r10 = r17
            r4 = r9
            goto L_0x004b
        L_0x019d:
            r10 = r17
            int r9 = r9 + 1
            goto L_0x0055
        L_0x01a3:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x01a6:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        L_0x01a9:
            r10 = r17
            r12 = r5[r3]
            r14 = r5[r11]
            int r12 = r12 + r14
            int r7 = r7 + r12
            int r12 = r9 + -1
            java.lang.System.arraycopy(r5, r13, r5, r3, r12)
            r5[r12] = r3
            r5[r9] = r3
            r9 = r12
            goto L_0x01c0
        L_0x01bc:
            r10 = r17
            int r9 = r9 + 1
        L_0x01c0:
            r5[r9] = r11
            r8 = r8 ^ 1
        L_0x01c4:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x01c8:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.f7967c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.g.c(int, cd.a, java.util.Map):uc.h");
    }
}
