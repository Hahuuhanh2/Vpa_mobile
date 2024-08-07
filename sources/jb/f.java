package jb;

import androidx.fragment.app.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ConfigurationConstants */
public final class f extends o {

    /* renamed from: b  reason: collision with root package name */
    public static f f11846b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Long, String> f11847c = Collections.unmodifiableMap(new a());

    /* compiled from: ConfigurationConstants */
    public class a extends HashMap<Long, String> {
        public a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    public final String f() {
        return "com.google.firebase.perf.LogSourceName";
    }

    public final String s() {
        return "fpr_log_source";
    }
}
