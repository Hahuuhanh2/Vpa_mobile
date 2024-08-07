package k1;

import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: IntentCompat */
public final class b {

    /* compiled from: IntentCompat */
    public static class a {
        public static <T> T[] a(Intent intent, String str, Class<T> cls) {
            return intent.getParcelableArrayExtra(str, cls);
        }

        public static <T> ArrayList<T> b(Intent intent, String str, Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        public static <T> T c(Intent intent, String str, Class<T> cls) {
            return intent.getParcelableExtra(str, cls);
        }
    }

    public static <T> T a(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(intent, str, cls);
        }
        T parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
