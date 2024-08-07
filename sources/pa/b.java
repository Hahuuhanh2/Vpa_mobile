package pa;

import a.a;
import android.text.TextUtils;
import ia.c;
import ia.k0;
import java.util.HashMap;

/* compiled from: DefaultSettingsSpiCall */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final String f14109a;

    /* renamed from: b  reason: collision with root package name */
    public final a f14110b;

    public b(String str, a aVar) {
        if (str != null) {
            this.f14110b = aVar;
            this.f14109a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public static void a(ma.a aVar, h hVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", hVar.f14131a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.4.3");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", hVar.f14132b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", hVar.f14133c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", hVar.f14134d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((c) ((k0) hVar.f14135e).b()).f11277a);
    }

    public static void b(ma.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f13240c.put(str, str2);
        }
    }

    public static HashMap c(h hVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", hVar.f14138h);
        hashMap.put("display_version", hVar.f14137g);
        hashMap.put("source", Integer.toString(hVar.f14139i));
        String str = hVar.f14136f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }
}
