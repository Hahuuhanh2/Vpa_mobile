package y6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R$string;
import h7.d;
import j7.c;
import java.util.Locale;
import s1.f;
import v0.h;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final h f17582a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f17583b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = c.a(context).f11719a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, new Object[]{a10});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(R$string.common_google_play_services_enable_text, new Object[]{a10});
            } else if (i10 == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i10 == 7) {
                    return d(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(R$string.common_google_play_services_unsupported_text, new Object[]{a10});
                } else if (i10 == 20) {
                    return d(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i10) {
                        case 16:
                            return d(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return d(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(R$string.common_google_play_services_updating_text, new Object[]{a10});
                        default:
                            return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, new Object[]{a10});
                    }
                }
            }
        } else if (d.c(context)) {
            return resources.getString(R$string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R$string.common_google_play_services_update_text, new Object[]{a10});
        }
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                return e(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                return null;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        Resources resources;
        h hVar = f17582a;
        synchronized (hVar) {
            Locale c10 = f.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f17583b)) {
                hVar.clear();
                f17583b = c10;
            }
            String str2 = (String) hVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            int i10 = u6.c.f15291c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            f17582a.put(str, string);
            return string;
        }
    }
}
