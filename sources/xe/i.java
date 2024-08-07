package xe;

import android.os.Build;

/* compiled from: SdkVersionUtils */
public final class i {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }
}
