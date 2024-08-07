package i3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
public class w extends v {
    public static boolean K = true;

    @SuppressLint({"NewApi"})
    public void t0(int i10, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.t0(i10, view);
        } else if (K) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                K = false;
            }
        }
    }
}
