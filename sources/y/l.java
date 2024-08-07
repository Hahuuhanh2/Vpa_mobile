package y;

import android.os.Build;
import f0.m0;

/* compiled from: ExcludedSupportedSizesQuirk */
public class l implements m0 {
    public static boolean a() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.BRAND) || !"J7XELTE".equalsIgnoreCase(Build.DEVICE) || Build.VERSION.SDK_INT < 27) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.BRAND) || !"ON7XELTE".equalsIgnoreCase(Build.DEVICE) || Build.VERSION.SDK_INT < 27) {
            return false;
        }
        return true;
    }
}
