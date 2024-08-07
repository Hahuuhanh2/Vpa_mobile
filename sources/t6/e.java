package t6;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class e extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z10) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z10);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT != 23) {
            return zzd.class;
        }
        boolean isLoggable = Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
