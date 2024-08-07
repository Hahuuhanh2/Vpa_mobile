package kd;

import java.util.Collections;
import java.util.Set;
import uc.a;

/* compiled from: CodaBarWriter */
public final class b extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f12469b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f12470c = {'T', 'N', '*', 'E'};

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f12471d = {'/', ':', '+', '.'};

    /* renamed from: e  reason: collision with root package name */
    public static final char f12472e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f12469b = cArr;
        f12472e = cArr[0];
    }

    public final boolean[] c(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c10 = f12472e;
            sb2.append(c10);
            sb2.append(str);
            sb2.append(c10);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f12469b;
            boolean h10 = a.h(cArr, upperCase);
            boolean h11 = a.h(cArr, upperCase2);
            char[] cArr2 = f12470c;
            boolean h12 = a.h(cArr2, upperCase);
            boolean h13 = a.h(cArr2, upperCase2);
            if (h10) {
                if (!h11) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (h12) {
                if (!h13) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (h11 || h13) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb3 = new StringBuilder();
                char c11 = f12472e;
                sb3.append(c11);
                sb3.append(str);
                sb3.append(c11);
                str = sb3.toString();
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else if (a.h(f12471d, str.charAt(i12))) {
                i11 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
            }
        }
        boolean[] zArr = new boolean[((str.length() - 1) + i11)];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = a.f12463d;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                } else if (upperCase3 == cArr3[i15]) {
                    i10 = a.f12464e[i15];
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }

    public final Set f() {
        return Collections.singleton(a.CODABAR);
    }
}
