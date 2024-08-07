package ja;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11798a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f11799b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f11800c;

    public b(int i10) {
        this.f11800c = i10;
    }

    public static String a(int i10, String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > i10) {
            return trim.substring(0, i10);
        }
        return trim;
    }

    public final synchronized boolean b(String str) {
        boolean z10;
        String a10 = a(this.f11800c, "com.crashlytics.version-control-info");
        if (this.f11798a.size() >= this.f11799b && !this.f11798a.containsKey(a10)) {
            return false;
        }
        String a11 = a(this.f11800c, str);
        String str2 = (String) this.f11798a.get(a10);
        if (str2 != null) {
            z10 = str2.equals(a11);
        } else if (a11 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        this.f11798a.put(a10, a11);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        String str;
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            if (str2 != null) {
                String a10 = a(this.f11800c, str2);
                if (this.f11798a.size() < this.f11799b || this.f11798a.containsKey(a10)) {
                    String str3 = (String) next.getValue();
                    HashMap hashMap = this.f11798a;
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = a(this.f11800c, str3);
                    }
                    hashMap.put(a10, str);
                }
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
    }
}
