package i3;

import android.annotation.SuppressLint;
import android.view.View;
import j7.a;

/* compiled from: ViewUtilsApi19 */
public class s extends a {
    public static boolean F = true;

    @SuppressLint({"NewApi"})
    public float H0(View view) {
        if (F) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void I0(View view, float f10) {
        if (F) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        view.setAlpha(f10);
    }
}
