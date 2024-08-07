package lc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import y6.e;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12908a = new e("CommonUtils", "");

    public static String a(Context context) {
        String str;
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            e eVar = f12908a;
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            if (Log.isLoggable(eVar.f17554a, 6) && (str = eVar.f17555b) != null) {
                str.concat(concat);
            }
            return "";
        }
    }
}
