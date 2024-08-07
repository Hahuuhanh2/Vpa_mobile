package ze;

import android.os.Build;
import java.util.HashMap;
import lg.b;
import sk.j;

/* compiled from: ApiUtil.kt */
public final class a {
    public static HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("Platform", "ANDROID");
        hashMap.put("Device-Id", j7.a.f11711s);
        hashMap.put("Device-Info", Build.MANUFACTURER + " - " + Build.MODEL + " - " + Build.VERSION.RELEASE);
        hashMap.put("App-Version", "0.1.0");
        hashMap.put("Demo-Header", j7.a.f11712t);
        hashMap.put("App", "Mobile");
        hashMap.put("Csrf", "MTcwOTEwMzU4NzI4MQ==");
        return hashMap;
    }

    public static HashMap b(b bVar, boolean z10) {
        boolean z11;
        j.f(bVar, "sharedPrefs");
        String a10 = bVar.a();
        HashMap a11 = a();
        a11.put("Content-Type", "application/json");
        if (a10.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && z10) {
            a11.put("Authorization", "Bearer " + a10);
        }
        return a11;
    }

    public static HashMap c(b bVar) {
        j.f(bVar, "sharedPrefs");
        String d10 = bVar.d("PREF_KEY_AUCTION_ACCESS_TOKEN");
        HashMap a10 = a();
        a10.put("Content-Type", "application/json");
        a10.put("Authorization", "Bearer " + d10);
        return a10;
    }

    public static HashMap d(b bVar) {
        j.f(bVar, "sharedPrefs");
        String a10 = bVar.a();
        HashMap a11 = a();
        a11.put("Authorization", "Bearer " + a10);
        return a11;
    }
}
