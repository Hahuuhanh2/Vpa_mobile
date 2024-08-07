package s1;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat */
public final class f {

    /* compiled from: ConfigurationCompat */
    public static class a {
        public static void a(Configuration configuration, j jVar) {
            if (!jVar.d()) {
                configuration.setLocale(jVar.c(0));
            }
        }
    }

    /* compiled from: ConfigurationCompat */
    public static class b {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, j jVar) {
            configuration.setLocales((LocaleList) jVar.f14594a.b());
        }
    }

    public static j a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new j(new m(b.a(configuration)));
        }
        return j.a(configuration.locale);
    }
}
