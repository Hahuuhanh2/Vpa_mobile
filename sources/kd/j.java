package kd;

import android.support.v4.media.a;
import com.google.zxing.FormatException;
import java.util.Collections;
import java.util.Set;

/* compiled from: EAN13Writer */
public final class j extends v {
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = a.m(str, u.q(str));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 13) {
            try {
                if (!u.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        r.b(str);
        int i10 = i.f12483j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a10 = r.a(zArr, 0, u.f12506d, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            a10 += r.a(zArr, a10, u.f12510h[digit], false);
        }
        int a11 = r.a(zArr, a10, u.f12507e, false) + a10;
        for (int i12 = 7; i12 <= 12; i12++) {
            a11 += r.a(zArr, a11, u.f12509g[Character.digit(str.charAt(i12), 10)], true);
        }
        r.a(zArr, a11, u.f12506d, true);
        return zArr;
    }

    public final Set f() {
        return Collections.singleton(uc.a.EAN_13);
    }
}
