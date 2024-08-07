package c0;

import android.os.Build;
import android.util.Log;

/* compiled from: Logger */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static int f4314a = 3;

    public static void a(String str) {
        e(3, f(str));
    }

    public static void b(String str) {
        e(6, f(str));
    }

    public static void c(String str) {
        e(6, f(str));
    }

    public static boolean d(String str) {
        return e(3, f(str));
    }

    public static boolean e(int i10, String str) {
        if (f4314a <= i10 || Log.isLoggable(str, i10)) {
            return true;
        }
        return false;
    }

    public static String f(String str) {
        if (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) {
            return str;
        }
        return str.substring(0, 23);
    }

    public static void g(String str) {
        e(5, f(str));
    }

    public static void h(String str) {
        e(5, f(str));
    }
}
