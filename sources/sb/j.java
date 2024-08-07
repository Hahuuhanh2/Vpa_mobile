package sb;

import android.content.Context;
import android.content.pm.PackageManager;
import lb.a;

/* compiled from: Utils */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f14725a;

    public static boolean a(Context context) {
        Boolean bool = f14725a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f14725a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            a d10 = a.d();
            e10.getMessage();
            d10.a();
            return false;
        }
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
