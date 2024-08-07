package z;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import c0.p0;
import java.nio.BufferUnderflowException;
import y.k;
import y.p;

/* compiled from: FlashAvailabilityChecker */
public final class e {
    public static boolean a(c cVar) {
        Boolean bool;
        try {
            bool = (Boolean) cVar.d(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (k.a(p.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
                p0.a("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
                p0.c("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            p0.g("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
