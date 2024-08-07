package y3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import o3.j;

/* compiled from: PackageManagerHelper */
public final class m {
    static {
        j.b("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z10) {
        int i10;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting == 1) {
                    z11 = true;
                }
            }
            if (z10 == z11) {
                j.a().getClass();
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            j.a().getClass();
        } catch (Exception unused) {
            j.a().getClass();
        }
    }
}
