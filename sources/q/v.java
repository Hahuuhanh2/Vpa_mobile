package q;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: KeyguardUtils */
public final class v {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
