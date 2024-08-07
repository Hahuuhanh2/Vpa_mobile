package g9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MonitoringAnnotations */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f10398b = new a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f10399a;

    public a() {
        throw null;
    }

    public a(Map map) {
        this.f10399a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f10399a.equals(((a) obj).f10399a);
    }

    public final int hashCode() {
        return this.f10399a.hashCode();
    }

    public final String toString() {
        return this.f10399a.toString();
    }
}
