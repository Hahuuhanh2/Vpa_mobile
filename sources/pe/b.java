package pe;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Window;

/* compiled from: LightStatusBarUtils */
public final class b {
    public static void a(Activity activity, boolean z10, boolean z11) {
        if (z10 && z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
        } else if (!z10 && !z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else if (!z10 && z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @TargetApi(11)
    public static void b(Activity activity, boolean z10, boolean z11, boolean z12) {
        if (z12) {
            try {
                Window window = activity.getWindow();
                if (z10 && z11) {
                    window.getDecorView().setSystemUiVisibility(256);
                } else if (!z10 && !z11) {
                    window.getDecorView().setSystemUiVisibility(1280);
                } else if (!z10 && z11) {
                    window.getDecorView().setSystemUiVisibility(1280);
                }
            } catch (Exception unused) {
            }
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
    }
}
