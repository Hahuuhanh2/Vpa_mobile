package kd;

import android.support.v4.media.a;
import com.google.zxing.FormatException;
import java.util.Collections;
import java.util.Set;

/* compiled from: EAN8Writer */
public final class l extends v {
    public final boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = a.m(str, u.q(str));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!u.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        r.b(str);
        boolean[] zArr = new boolean[67];
        int a10 = r.a(zArr, 0, u.f12506d, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            a10 += r.a(zArr, a10, u.f12509g[Character.digit(str.charAt(i10), 10)], false);
        }
        int a11 = r.a(zArr, a10, u.f12507e, false) + a10;
        for (int i11 = 4; i11 <= 7; i11++) {
            a11 += r.a(zArr, a11, u.f12509g[Character.digit(str.charAt(i11), 10)], true);
        }
        r.a(zArr, a11, u.f12506d, true);
        return zArr;
    }

    public final Set f() {
        return Collections.singleton(uc.a.EAN_8);
    }
}
