package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.p;
import c0.p0;
import f0.s;

public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(IllegalArgumentException illegalArgumentException) {
            super("Expected camera missing from device.", illegalArgumentException);
        }
    }

    public static void a(Context context, s sVar, p pVar) {
        Integer num;
        if (pVar != null) {
            try {
                num = pVar.c();
                if (num == null) {
                    p0.g("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                p0.c("CameraValidator");
                return;
            }
        } else {
            num = null;
        }
        String str = Build.DEVICE;
        p0.a("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (pVar == null || num.intValue() == 1)) {
                p.f4312c.d(sVar.a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (pVar == null || num.intValue() == 0) {
                p.f4311b.d(sVar.a());
            }
        } catch (IllegalArgumentException e10) {
            sVar.a().toString();
            p0.b("CameraValidator");
            throw new CameraIdListIncorrectException(e10);
        }
    }
}
