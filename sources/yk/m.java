package yk;

import sk.j;
import v.v;

/* compiled from: _Strings.kt */
public class m extends l {
    public static final String l1(int i10, String str) {
        boolean z10;
        j.f(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(0, i10);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(v.d("Requested character count ", i10, " is less than zero.").toString());
    }
}
