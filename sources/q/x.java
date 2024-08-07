package q;

import android.content.pm.PackageManager;

/* compiled from: PackageUtils */
public final class x {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
