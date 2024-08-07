package kd;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: Code93Writer */
public final class h extends r {
    public static void g(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
    }

    public static int h(int i10, String str) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    public final boolean[] c(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == 0) {
                sb2.append("bU");
            } else if (charAt <= 26) {
                sb2.append('a');
                sb2.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb2.append('b');
                sb2.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb2.append(charAt);
            } else if (charAt <= ',') {
                sb2.append('c');
                sb2.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb2.append(charAt);
            } else if (charAt == ':') {
                sb2.append("cZ");
            } else if (charAt <= '?') {
                sb2.append('b');
                sb2.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb2.append("bV");
            } else if (charAt <= 'Z') {
                sb2.append(charAt);
            } else if (charAt <= '_') {
                sb2.append('b');
                sb2.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb2.append("bW");
            } else if (charAt <= 'z') {
                sb2.append('d');
                sb2.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb2.append('b');
                sb2.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        String sb3 = sb2.toString();
        int length2 = sb3.length();
        if (length2 <= 80) {
            boolean[] zArr = new boolean[(((sb3.length() + 2 + 2) * 9) + 1)];
            g(zArr, 0, g.f12480e);
            int i11 = 9;
            for (int i12 = 0; i12 < length2; i12++) {
                g(zArr, i11, g.f12479d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb3.charAt(i12))]);
                i11 += 9;
            }
            int h10 = h(20, sb3);
            int[] iArr = g.f12479d;
            g(zArr, i11, iArr[h10]);
            int i13 = i11 + 9;
            StringBuilder q10 = a.q(sb3);
            q10.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(h10));
            g(zArr, i13, iArr[h(15, q10.toString())]);
            int i14 = i13 + 9;
            g(zArr, i14, g.f12480e);
            zArr[i14 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length2)));
    }

    public final Set f() {
        return Collections.singleton(uc.a.CODE_93);
    }
}
