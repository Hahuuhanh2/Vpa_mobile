package q;

import android.os.Build;

/* compiled from: AuthenticatorUtils */
public final class c {
    public static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 != 32768) {
            if (i10 == 32783) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 28 || i11 > 29) {
                    return true;
                }
                return false;
            } else if (i10 == 33023 || i10 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            return true;
        } else {
            return false;
        }
    }
}
