package kd;

import java.util.Collections;
import java.util.Set;
import uc.a;

/* compiled from: Code39Writer */
public final class f extends r {
    public static void g(int[] iArr, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    public final boolean[] c(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < length2; i11++) {
                        char charAt = str.charAt(i11);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    sb2.append("%V");
                                } else if (charAt == '`') {
                                    sb2.append("%W");
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt <= 26) {
                                        sb2.append('$');
                                        sb2.append((char) ((charAt - 1) + 65));
                                    } else if (charAt < ' ') {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - 27) + 65));
                                    } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                        sb2.append('/');
                                        sb2.append((char) ((charAt - '!') + 65));
                                    } else if (charAt <= '9') {
                                        sb2.append((char) ((charAt - '0') + 48));
                                    } else if (charAt <= '?') {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - ';') + 70));
                                    } else if (charAt <= 'Z') {
                                        sb2.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt <= '_') {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - '[') + 75));
                                    } else if (charAt <= 'z') {
                                        sb2.append('+');
                                        sb2.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 127) {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                                    }
                                }
                            }
                            sb2.append(charAt);
                        } else {
                            sb2.append("%U");
                        }
                    }
                    str = sb2.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i10++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            g(iArr, 148);
            int a10 = r.a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a11 = r.a(zArr, a10, iArr2, false) + a10;
            for (int i12 = 0; i12 < length; i12++) {
                g(iArr, e.f12474d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12))]);
                int a12 = r.a(zArr, a11, iArr, true) + a11;
                a11 = r.a(zArr, a12, iArr2, false) + a12;
            }
            g(iArr, 148);
            r.a(zArr, a11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    public final Set f() {
        return Collections.singleton(a.CODE_39);
    }
}
