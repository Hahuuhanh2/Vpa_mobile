package com.google.android.gms.internal.base;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zan {
    public static boolean zaa() {
        if (Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T') {
            return true;
        }
        return false;
    }
}
