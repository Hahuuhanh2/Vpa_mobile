package pd;

import com.google.zxing.FormatException;
import java.math.BigInteger;

/* compiled from: DecodedBitStreamParser */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f14160a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f14161b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger[] f14162c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f14162c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f14162c;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f14162c[(i10 - i11) - 1].multiply(BigInteger.valueOf((long) iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.a();
    }

    public static int b(int[] iArr, int i10, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 >= i12 || z10) {
                return i10;
            }
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i13 == i12) {
                z10 = true;
            }
            if (i14 < 900) {
                iArr2[i11] = i14;
                i11++;
            } else {
                if (!(i14 == 900 || i14 == 901 || i14 == 928)) {
                    switch (i14) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i13--;
                z10 = true;
            }
            if ((i11 % 15 == 0 || i14 == 902 || z10) && i11 > 0) {
                sb2.append(a(iArr2, i11));
                i11 = 0;
            }
            i10 = i13;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r13 != 900) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e5, code lost:
        r12 = r11;
        r1 = 913;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0110, code lost:
        r11 = 6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int[] r16, int r17, java.lang.StringBuilder r18) {
        /*
            r0 = r18
            r1 = 0
            r2 = r16[r1]
            int r2 = r2 - r17
            r3 = 1
            int r2 = r2 << r3
            int[] r4 = new int[r2]
            int[] r2 = new int[r2]
            r5 = r17
            r6 = r1
            r7 = r6
        L_0x0011:
            r8 = r16[r1]
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            if (r5 >= r8) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            int r8 = r5 + 1
            r5 = r16[r5]
            if (r5 >= r10) goto L_0x002f
            int r9 = r5 / 30
            r4[r7] = r9
            int r9 = r7 + 1
            int r5 = r5 % 30
            r4[r9] = r5
            int r7 = r7 + 2
        L_0x002d:
            r5 = r8
            goto L_0x0011
        L_0x002f:
            if (r5 == r9) goto L_0x0046
            r9 = 928(0x3a0, float:1.3E-42)
            if (r5 == r9) goto L_0x0042
            switch(r5) {
                case 900: goto L_0x003c;
                case 901: goto L_0x0042;
                case 902: goto L_0x0042;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r5) {
                case 922: goto L_0x0042;
                case 923: goto L_0x0042;
                case 924: goto L_0x0042;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x002d
        L_0x003c:
            int r5 = r7 + 1
            r4[r7] = r10
            r7 = r5
            goto L_0x002d
        L_0x0042:
            int r5 = r8 + -1
            r6 = r3
            goto L_0x0011
        L_0x0046:
            r4[r7] = r9
            int r5 = r8 + 1
            r8 = r16[r8]
            r2[r7] = r8
            int r7 = r7 + 1
            goto L_0x0011
        L_0x0051:
            r8 = r1
            r11 = r3
            r12 = r11
        L_0x0054:
            if (r8 >= r7) goto L_0x012f
            r13 = r4[r8]
            int r14 = v.v.g(r11)
            r1 = 5
            r6 = 4
            r15 = 3
            r9 = 2
            if (r14 == 0) goto L_0x00fb
            if (r14 == r3) goto L_0x00d4
            if (r14 == r9) goto L_0x00b4
            r9 = 29
            if (r14 == r15) goto L_0x009b
            if (r14 == r6) goto L_0x0089
            if (r14 == r1) goto L_0x0070
        L_0x006e:
            goto L_0x00f8
        L_0x0070:
            if (r13 >= r9) goto L_0x0077
            char[] r1 = f14160a
            char r15 = r1[r13]
            goto L_0x0090
        L_0x0077:
            if (r13 == r9) goto L_0x00d2
            if (r13 == r10) goto L_0x00d2
            r1 = 913(0x391, float:1.28E-42)
            if (r13 == r1) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            r1 = r2[r8]
            char r1 = (char) r1
            r0.append(r1)
        L_0x0086:
            r11 = r12
            goto L_0x00f8
        L_0x0089:
            r1 = 26
            if (r13 >= r1) goto L_0x0093
            int r13 = r13 + 65
            char r15 = (char) r13
        L_0x0090:
            r11 = r12
            goto L_0x0102
        L_0x0093:
            if (r13 == r1) goto L_0x0098
            if (r13 == r10) goto L_0x00d2
            goto L_0x0086
        L_0x0098:
            r11 = r12
            goto L_0x00ef
        L_0x009b:
            if (r13 >= r9) goto L_0x00a3
            char[] r1 = f14160a
            char r15 = r1[r13]
            goto L_0x0102
        L_0x00a3:
            if (r13 == r9) goto L_0x00d2
            if (r13 == r10) goto L_0x00d2
            r1 = 913(0x391, float:1.28E-42)
            if (r13 == r1) goto L_0x00ad
            goto L_0x0123
        L_0x00ad:
            r1 = r2[r8]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x00f8
        L_0x00b4:
            r1 = 25
            if (r13 >= r1) goto L_0x00bd
            char[] r1 = f14161b
            char r15 = r1[r13]
            goto L_0x0102
        L_0x00bd:
            if (r13 == r10) goto L_0x00d2
            r1 = 913(0x391, float:1.28E-42)
            if (r13 == r1) goto L_0x00cb
            switch(r13) {
                case 25: goto L_0x00c9;
                case 26: goto L_0x00ef;
                case 27: goto L_0x00c7;
                case 28: goto L_0x00d2;
                case 29: goto L_0x00e5;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x006e
        L_0x00c7:
            r11 = r9
            goto L_0x00f8
        L_0x00c9:
            r11 = r6
            goto L_0x00f8
        L_0x00cb:
            r1 = r2[r8]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x00f8
        L_0x00d2:
            r11 = r3
            goto L_0x00f8
        L_0x00d4:
            r6 = 26
            if (r13 >= r6) goto L_0x00db
            int r13 = r13 + 97
            goto L_0x0101
        L_0x00db:
            if (r13 == r10) goto L_0x00d2
            r6 = 913(0x391, float:1.28E-42)
            if (r13 == r6) goto L_0x00f2
            switch(r13) {
                case 26: goto L_0x00ef;
                case 27: goto L_0x00eb;
                case 28: goto L_0x00e9;
                case 29: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x00f8
        L_0x00e5:
            r12 = r11
            r1 = 913(0x391, float:1.28E-42)
            goto L_0x0110
        L_0x00e9:
            r11 = r15
            goto L_0x00f8
        L_0x00eb:
            r12 = r11
            r15 = 0
            r11 = r1
            goto L_0x0102
        L_0x00ef:
            r1 = 913(0x391, float:1.28E-42)
            goto L_0x0116
        L_0x00f2:
            r1 = r2[r8]
            char r1 = (char) r1
            r0.append(r1)
        L_0x00f8:
            r1 = 913(0x391, float:1.28E-42)
            goto L_0x0123
        L_0x00fb:
            r1 = 26
            if (r13 >= r1) goto L_0x0105
            int r13 = r13 + 65
        L_0x0101:
            char r15 = (char) r13
        L_0x0102:
            r1 = 913(0x391, float:1.28E-42)
            goto L_0x0124
        L_0x0105:
            if (r13 == r10) goto L_0x0120
            r1 = 913(0x391, float:1.28E-42)
            if (r13 == r1) goto L_0x0119
            switch(r13) {
                case 26: goto L_0x0116;
                case 27: goto L_0x0114;
                case 28: goto L_0x0112;
                case 29: goto L_0x010f;
                default: goto L_0x010e;
            }
        L_0x010e:
            goto L_0x0123
        L_0x010f:
            r12 = r11
        L_0x0110:
            r11 = 6
            goto L_0x0123
        L_0x0112:
            r11 = r15
            goto L_0x0123
        L_0x0114:
            r11 = r9
            goto L_0x0123
        L_0x0116:
            r15 = 32
            goto L_0x0124
        L_0x0119:
            r6 = r2[r8]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x0123
        L_0x0120:
            r1 = 913(0x391, float:1.28E-42)
            r11 = r3
        L_0x0123:
            r15 = 0
        L_0x0124:
            if (r15 == 0) goto L_0x0129
            r0.append(r15)
        L_0x0129:
            int r8 = r8 + 1
            r9 = r1
            r1 = 0
            goto L_0x0054
        L_0x012f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.e.c(int[], int, java.lang.StringBuilder):int");
    }
}
