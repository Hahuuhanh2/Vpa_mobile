package fb;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f10163a;

    public r(Bundle bundle) {
        if (bundle != null) {
            this.f10163a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static boolean k(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static void m(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public final boolean a(String str) {
        String i10 = i(str);
        if ("1".equals(i10) || Boolean.parseBoolean(i10)) {
            return true;
        }
        return false;
    }

    public final Integer b(String str) {
        String i10 = i(str);
        if (TextUtils.isEmpty(i10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(i10));
        } catch (NumberFormatException unused) {
            m(str);
            return null;
        }
    }

    public final JSONArray c(String str) {
        String i10 = i(str);
        if (TextUtils.isEmpty(i10)) {
            return null;
        }
        try {
            return new JSONArray(i10);
        } catch (JSONException unused) {
            m(str);
            return null;
        }
    }

    public final int[] d() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() == 3) {
                int parseColor = Color.parseColor(c10.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c10.optInt(1);
                    iArr[2] = c10.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            c10.toString();
            return null;
        } catch (IllegalArgumentException e10) {
            c10.toString();
            e10.getMessage();
            return null;
        }
    }

    public final Uri e() {
        String i10 = i("gcm.n.link_android");
        if (TextUtils.isEmpty(i10)) {
            i10 = i("gcm.n.link");
        }
        if (!TextUtils.isEmpty(i10)) {
            return Uri.parse(i10);
        }
        return null;
    }

    public final Object[] f(String str) {
        JSONArray c10 = c(str + "_loc_args");
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public final String g(String str) {
        return i(str + "_loc_key");
    }

    public final String h(Resources resources, String str, String str2) {
        String i10 = i(str2);
        if (!TextUtils.isEmpty(i10)) {
            return i10;
        }
        String g2 = g(str2);
        if (TextUtils.isEmpty(g2)) {
            return null;
        }
        int identifier = resources.getIdentifier(g2, "string", str);
        if (identifier == 0) {
            m(str2 + "_loc_key");
            return null;
        }
        Object[] f10 = f(str2);
        if (f10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f10);
        } catch (MissingFormatArgumentException unused) {
            m(str2);
            Arrays.toString(f10);
            return null;
        }
    }

    public final String i(String str) {
        String str2;
        Bundle bundle = this.f10163a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.f10163a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public final long[] j() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() > 1) {
                int length = c10.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = c10.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            c10.toString();
            return null;
        }
    }

    public final Bundle l() {
        boolean z10;
        Bundle bundle = new Bundle(this.f10163a);
        for (String next : this.f10163a.keySet()) {
            if (next.startsWith("google.c.a.") || next.equals("from")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
