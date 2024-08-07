package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import n0.l;
import sk.j;

/* compiled from: Challenge.kt */
public final class Challenge {

    /* renamed from: a  reason: collision with root package name */
    public final String f21930a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f21931b;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        this.f21930a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                j.e(locale, "US");
                str2 = str3.toLowerCase(locale);
                j.e(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j.e(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f21931b = unmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (!j.a(challenge.f21930a, this.f21930a) || !j.a(challenge.f21931b, this.f21931b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21931b.hashCode() + l.f(this.f21930a, 899, 31);
    }

    public final String toString() {
        return this.f21930a + " authParams=" + this.f21931b;
    }
}
