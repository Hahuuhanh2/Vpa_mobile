package q;

import android.content.pm.PackageManager;

/* compiled from: PackageUtils */
public final class w {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
