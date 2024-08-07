package i1;

import android.app.LocaleManager;
import android.os.LocaleList;

/* compiled from: LocaleManagerCompat */
public final class j {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
