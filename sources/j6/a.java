package j6;

import android.os.Build;
import android.util.Log;
import f0.b0;

/* compiled from: Logging */
public final class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(b(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    public static String b(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b0.r("TRuntime.", str);
        }
        String r10 = b0.r("TRuntime.", str);
        if (r10.length() > 23) {
            return r10.substring(0, 23);
        }
        return r10;
    }
}
