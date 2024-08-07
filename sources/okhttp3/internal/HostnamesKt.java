package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import ll.f;
import sk.j;
import yk.h;
import yk.l;

/* compiled from: hostnames.kt */
public final class HostnamesKt {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00de
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = yk.h.K0(r6, r1, r14, r5)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00df
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = yk.h.K0(r6, r1, r11, r5)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = yk.h.K0(r6, r1, r11, r5)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r0) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r5
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r1.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r0) goto L_0x008b
            char r5 = r1.charAt(r14)
            r2 = 48
            int r16 = sk.j.h(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = sk.j.h(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00df
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r0) goto L_0x00c1
            char r4 = r1.charAt(r6)
            int r4 = okhttp3.internal.Util.q(r4)
            r5 = -1
            if (r4 == r5) goto L_0x00c1
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c1:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00dd
            if (r4 <= r13) goto L_0x00c8
            goto L_0x00dd
        L_0x00c8:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00dd:
            return r10
        L_0x00de:
            r0 = r2
        L_0x00df:
            if (r7 == r0) goto L_0x00f3
            r1 = -1
            if (r8 != r1) goto L_0x00e5
            return r10
        L_0x00e5:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f3:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String b(String str) {
        boolean z10;
        InetAddress inetAddress;
        j.f(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (l.N0(str, ":")) {
            if (!h.L0(str, "[", false) || !h.F0(str, "]")) {
                inetAddress = a(0, str.length(), str);
            } else {
                inetAddress = a(1, str.length() - 1, str);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                f fVar = new f();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        fVar.g0(58);
                        i10 += i13;
                        if (i10 == 16) {
                            fVar.g0(58);
                        }
                    } else {
                        if (i10 > 0) {
                            fVar.g0(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = Util.f22171a;
                        fVar.l0((long) (((b10 & 255) << 8) | (address[i10 + 1] & 255)));
                        i10 += 2;
                    }
                }
                return fVar.U();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                j.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                j.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return null;
                }
                int length = lowerCase.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i16);
                    if (j.h(charAt, 31) <= 0) {
                        break;
                    } else if (j.h(charAt, 127) >= 0) {
                        break;
                    } else if (l.R0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i16++;
                    }
                }
                i10 = 1;
                if (i10 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
