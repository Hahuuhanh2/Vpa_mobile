package sd;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PDF417HighLevelEncoder */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14743a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14744b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f14745c;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f14746d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f14747e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f14745c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f14743a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f14745c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f14746d, (byte) -1);
        while (true) {
            byte[] bArr3 = f14744b;
            if (i10 < bArr3.length) {
                byte b11 = bArr3[i10];
                if (b11 > 0) {
                    f14746d[b11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void a(byte[] bArr, int i10, int i11, StringBuilder sb2) {
        int i12;
        if (i10 == 1 && i11 == 0) {
            sb2.append(913);
        } else if (i10 % 6 == 0) {
            sb2.append(924);
        } else {
            sb2.append(901);
        }
        if (i10 >= 6) {
            char[] cArr = new char[5];
            i12 = 0;
            while ((0 + i10) - i12 >= 6) {
                long j10 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j10 = (j10 << 8) + ((long) (bArr[i12 + i13] & 255));
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) ((int) (j10 % 900));
                    j10 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb2.append(cArr[i15]);
                }
                i12 += 6;
            }
        } else {
            i12 = 0;
        }
        while (i12 < 0 + i10) {
            sb2.append((char) (bArr[i12] & 255));
            i12++;
        }
    }

    public static void b(int i10, int i11, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb3.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0109 A[EDGE_INSN: B:83:0x0109->B:68:0x0109 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0010:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            r5 = -1
            if (r7 == 0) goto L_0x00ca
            if (r7 == r6) goto L_0x008a
            if (r7 == r4) goto L_0x003c
            byte[] r9 = f14746d
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x002f
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0038
            char r5 = (char) r9
            r3.append(r5)
            goto L_0x0105
        L_0x0038:
            r3.append(r15)
            goto L_0x0056
        L_0x003c:
            byte[] r11 = f14745c
            byte r11 = r11[r10]
            if (r11 == r5) goto L_0x0044
            r12 = r6
            goto L_0x0045
        L_0x0044:
            r12 = 0
        L_0x0045:
            if (r12 == 0) goto L_0x004d
            char r5 = (char) r11
            r3.append(r5)
            goto L_0x0105
        L_0x004d:
            boolean r11 = e(r10)
            if (r11 == 0) goto L_0x0058
            r3.append(r13)
        L_0x0056:
            r7 = 0
            goto L_0x0010
        L_0x0058:
            boolean r11 = d(r10)
            if (r11 == 0) goto L_0x0063
            r3.append(r14)
            goto L_0x00e6
        L_0x0063:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x007d
            char r9 = r0.charAt(r9)
            byte[] r11 = f14746d
            byte r9 = r11[r9]
            if (r9 == r5) goto L_0x0073
            r5 = r6
            goto L_0x0074
        L_0x0073:
            r5 = 0
        L_0x0074:
            if (r5 == 0) goto L_0x007d
            r7 = 3
            r5 = 25
            r3.append(r5)
            goto L_0x0010
        L_0x007d:
            r3.append(r15)
            byte[] r5 = f14746d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0105
        L_0x008a:
            boolean r9 = d(r10)
            if (r9 == 0) goto L_0x009f
            if (r10 != r12) goto L_0x0097
            r3.append(r11)
            goto L_0x0105
        L_0x0097:
            int r10 = r10 + -97
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x009f:
            boolean r9 = e(r10)
            if (r9 == 0) goto L_0x00af
            r3.append(r14)
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x00af:
            byte[] r9 = f14745c
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x00b7
            r5 = r6
            goto L_0x00b8
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            if (r5 == 0) goto L_0x00be
            r3.append(r13)
            goto L_0x00f7
        L_0x00be:
            r3.append(r15)
            byte[] r5 = f14746d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
            goto L_0x0105
        L_0x00ca:
            boolean r9 = e(r10)
            if (r9 == 0) goto L_0x00dd
            if (r10 != r12) goto L_0x00d6
            r3.append(r11)
            goto L_0x0105
        L_0x00d6:
            int r10 = r10 + -65
            char r5 = (char) r10
            r3.append(r5)
            goto L_0x0105
        L_0x00dd:
            boolean r9 = d(r10)
            if (r9 == 0) goto L_0x00e9
            r3.append(r14)
        L_0x00e6:
            r7 = r6
            goto L_0x0010
        L_0x00e9:
            byte[] r9 = f14745c
            byte r9 = r9[r10]
            if (r9 == r5) goto L_0x00f1
            r5 = r6
            goto L_0x00f2
        L_0x00f1:
            r5 = 0
        L_0x00f2:
            if (r5 == 0) goto L_0x00fa
            r3.append(r13)
        L_0x00f7:
            r7 = r4
            goto L_0x0010
        L_0x00fa:
            r3.append(r15)
            byte[] r5 = f14746d
            byte r5 = r5[r10]
            char r5 = (char) r5
            r3.append(r5)
        L_0x0105:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0010
            int r0 = r3.length()
            r1 = 0
            r5 = 0
        L_0x010f:
            if (r1 >= r0) goto L_0x012d
            int r8 = r1 % 2
            if (r8 == 0) goto L_0x0117
            r8 = r6
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 == 0) goto L_0x0126
            int r5 = r5 * 30
            char r8 = r3.charAt(r1)
            int r8 = r8 + r5
            char r5 = (char) r8
            r2.append(r5)
            goto L_0x012a
        L_0x0126:
            char r5 = r3.charAt(r1)
        L_0x012a:
            int r1 = r1 + 1
            goto L_0x010f
        L_0x012d:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0137
            int r5 = r5 * 30
            int r5 = r5 + r15
            char r0 = (char) r5
            r2.append(r0)
        L_0x0137:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean e(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }
}
