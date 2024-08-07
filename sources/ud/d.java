package ud;

import cd.c;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;

/* compiled from: DecodedBitStreamParser */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f15497a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(c cVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (cVar.a() >= 11) {
                int b10 = cVar.b(11);
                sb2.append(f(b10 / 45));
                sb2.append(f(b10 % 45));
                i10 -= 2;
            } else {
                throw FormatException.a();
            }
        }
        if (i10 == 1) {
            if (cVar.a() >= 6) {
                sb2.append(f(cVar.b(6)));
            } else {
                throw FormatException.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0143, code lost:
        if (r1 == 2) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0147, code lost:
        if ((r17 * 10) >= r0) goto L_0x0151;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(cd.c r21, java.lang.StringBuilder r22, int r23, cd.d r24, java.util.ArrayList r25, java.util.Map r26) {
        /*
            r0 = r23
            r1 = r26
            int r2 = r0 << 3
            int r3 = r21.a()
            if (r2 > r3) goto L_0x0179
            byte[] r2 = new byte[r0]
            r3 = 0
            r4 = r3
        L_0x0010:
            if (r4 >= r0) goto L_0x0020
            r5 = 8
            r6 = r21
            int r5 = r6.b(r5)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0020:
            if (r24 != 0) goto L_0x015c
            java.lang.String r4 = cd.h.f4721a
            if (r1 == 0) goto L_0x003a
            uc.b r4 = uc.b.CHARACTER_SET
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = r0.toString()
            r20 = r2
            goto L_0x0162
        L_0x003a:
            r1 = 2
            r4 = 3
            r5 = 1
            if (r0 <= r4) goto L_0x0053
            byte r6 = r2[r3]
            r7 = -17
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r5]
            r7 = -69
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r1]
            r7 = -65
            if (r6 != r7) goto L_0x0053
            r6 = r5
            goto L_0x0054
        L_0x0053:
            r6 = r3
        L_0x0054:
            r1 = r3
            r9 = r1
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r7 = r5
            r8 = r7
        L_0x0064:
            if (r9 >= r0) goto L_0x0117
            if (r5 != 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            if (r8 == 0) goto L_0x0117
        L_0x006c:
            byte r4 = r2[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r8 == 0) goto L_0x00a4
            if (r10 <= 0) goto L_0x007d
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a2
            int r10 = r10 + -1
            goto L_0x00a6
        L_0x007d:
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a6
            r2 = r4 & 64
            if (r2 == 0) goto L_0x00a2
            int r10 = r10 + 1
            r2 = r4 & 32
            if (r2 != 0) goto L_0x0090
            int r12 = r12 + 1
            goto L_0x00a6
        L_0x0090:
            int r10 = r10 + 1
            r2 = r4 & 16
            if (r2 != 0) goto L_0x0099
            int r13 = r13 + 1
            goto L_0x00a6
        L_0x0099:
            int r10 = r10 + 1
            r2 = r4 & 8
            if (r2 != 0) goto L_0x00a2
            int r14 = r14 + 1
            goto L_0x00a6
        L_0x00a2:
            r8 = 0
            goto L_0x00a6
        L_0x00a4:
            r20 = r2
        L_0x00a6:
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 == 0) goto L_0x00c4
            if (r4 <= r2) goto L_0x00b2
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 >= r2) goto L_0x00b2
            r5 = 0
            goto L_0x00c4
        L_0x00b2:
            r2 = 159(0x9f, float:2.23E-43)
            if (r4 <= r2) goto L_0x00c4
            r2 = 192(0xc0, float:2.69E-43)
            if (r4 < r2) goto L_0x00c2
            r2 = 215(0xd7, float:3.01E-43)
            if (r4 == r2) goto L_0x00c2
            r2 = 247(0xf7, float:3.46E-43)
            if (r4 != r2) goto L_0x00c4
        L_0x00c2:
            int r17 = r17 + 1
        L_0x00c4:
            if (r7 == 0) goto L_0x0110
            if (r11 <= 0) goto L_0x00d8
            r2 = 64
            if (r4 < r2) goto L_0x010f
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 <= r2) goto L_0x00d5
            goto L_0x010f
        L_0x00d5:
            int r11 = r11 + -1
            goto L_0x0110
        L_0x00d8:
            r2 = 128(0x80, float:1.794E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 == r2) goto L_0x010f
            r2 = 239(0xef, float:3.35E-43)
            if (r4 <= r2) goto L_0x00e5
            goto L_0x010f
        L_0x00e5:
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 <= r2) goto L_0x00f9
            r2 = 224(0xe0, float:3.14E-43)
            if (r4 >= r2) goto L_0x00f9
            int r1 = r1 + 1
            int r2 = r19 + 1
            if (r2 <= r15) goto L_0x00f4
            r15 = r2
        L_0x00f4:
            r19 = r2
            r18 = 0
            goto L_0x0110
        L_0x00f9:
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 <= r2) goto L_0x010a
            int r11 = r11 + 1
            int r2 = r18 + 1
            if (r2 <= r3) goto L_0x0107
            r3 = r2
            r18 = r3
            goto L_0x010c
        L_0x0107:
            r18 = r2
            goto L_0x010c
        L_0x010a:
            r18 = 0
        L_0x010c:
            r19 = 0
            goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            int r9 = r9 + 1
            r2 = r20
            r4 = 3
            goto L_0x0064
        L_0x0117:
            r20 = r2
            if (r8 == 0) goto L_0x011e
            if (r10 <= 0) goto L_0x011e
            r8 = 0
        L_0x011e:
            if (r7 == 0) goto L_0x0125
            if (r11 <= 0) goto L_0x0125
            r16 = 0
            goto L_0x0127
        L_0x0125:
            r16 = r7
        L_0x0127:
            if (r8 == 0) goto L_0x0130
            if (r6 != 0) goto L_0x0156
            int r12 = r12 + r13
            int r12 = r12 + r14
            if (r12 <= 0) goto L_0x0130
            goto L_0x0156
        L_0x0130:
            if (r16 == 0) goto L_0x013c
            boolean r2 = cd.h.f4722b
            if (r2 != 0) goto L_0x0151
            r2 = 3
            if (r15 >= r2) goto L_0x0151
            if (r3 < r2) goto L_0x013c
            goto L_0x0151
        L_0x013c:
            if (r5 == 0) goto L_0x014a
            if (r16 == 0) goto L_0x014a
            r2 = 2
            if (r15 != r2) goto L_0x0145
            if (r1 == r2) goto L_0x0151
        L_0x0145:
            int r1 = r17 * 10
            if (r1 < r0) goto L_0x014c
            goto L_0x0151
        L_0x014a:
            if (r5 == 0) goto L_0x014f
        L_0x014c:
            java.lang.String r0 = "ISO8859_1"
            goto L_0x0162
        L_0x014f:
            if (r16 == 0) goto L_0x0154
        L_0x0151:
            java.lang.String r0 = "SJIS"
            goto L_0x0162
        L_0x0154:
            if (r8 == 0) goto L_0x0159
        L_0x0156:
            java.lang.String r0 = "UTF8"
            goto L_0x0162
        L_0x0159:
            java.lang.String r0 = cd.h.f4721a
            goto L_0x0162
        L_0x015c:
            r20 = r2
            java.lang.String r0 = r24.name()
        L_0x0162:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r2 = r20
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r0 = r22
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0174 }
            r0 = r25
            r0.add(r2)
            return
        L_0x0174:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0179:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.d.b(cd.c, java.lang.StringBuilder, int, cd.d, java.util.ArrayList, java.util.Map):void");
    }

    public static void c(c cVar, StringBuilder sb2, int i10) {
        int i11;
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i12 = 0;
            while (i10 > 0) {
                int b10 = cVar.b(13);
                int i13 = (b10 % 96) | ((b10 / 96) << 8);
                if (i13 < 2560) {
                    i11 = 41377;
                } else {
                    i11 = 42657;
                }
                int i14 = i13 + i11;
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    public static void d(c cVar, StringBuilder sb2, int i10) {
        int i11;
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i12 = 0;
            while (i10 > 0) {
                int b10 = cVar.b(13);
                int i13 = (b10 % 192) | ((b10 / 192) << 8);
                if (i13 < 7936) {
                    i11 = 33088;
                } else {
                    i11 = 49472;
                }
                int i14 = i13 + i11;
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    public static void e(c cVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (cVar.a() >= 10) {
                int b10 = cVar.b(10);
                if (b10 < 1000) {
                    sb2.append(f(b10 / 100));
                    sb2.append(f((b10 / 10) % 10));
                    sb2.append(f(b10 % 10));
                    i10 -= 3;
                } else {
                    throw FormatException.a();
                }
            } else {
                throw FormatException.a();
            }
        }
        if (i10 == 2) {
            if (cVar.a() >= 7) {
                int b11 = cVar.b(7);
                if (b11 < 100) {
                    sb2.append(f(b11 / 10));
                    sb2.append(f(b11 % 10));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        } else if (i10 != 1) {
        } else {
            if (cVar.a() >= 4) {
                int b12 = cVar.b(4);
                if (b12 < 10) {
                    sb2.append(f(b12));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f15497a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw FormatException.a();
    }
}
