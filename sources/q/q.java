package q;

import android.content.Context;

/* compiled from: DeviceUtils */
public final class q {
    public static boolean a(int i10, Context context, String str) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i10)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i10, Context context, String str) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i10)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i10, Context context, String str) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }
}
