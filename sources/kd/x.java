package kd;

import android.support.v4.media.a;
import com.google.zxing.FormatException;
import java.util.Collections;
import java.util.Set;

/* compiled from: UPCEWriter */
public final class x extends v {
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = a.m(str, u.q(w.r(str)));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!u.i(w.r(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        r.b(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i10 = w.f12515k[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int a10 = r.a(zArr, 0, u.f12506d, true);
            for (int i11 = 1; i11 <= 6; i11++) {
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (((i10 >> (6 - i11)) & 1) == 1) {
                    digit2 += 10;
                }
                a10 += r.a(zArr, a10, u.f12510h[digit2], false);
            }
            r.a(zArr, a10, u.f12508f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    public final Set f() {
        return Collections.singleton(uc.a.UPC_E);
    }
}
