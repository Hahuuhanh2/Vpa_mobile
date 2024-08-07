package i3;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22 */
public class v extends u {
    public static boolean J = true;

    @SuppressLint({"NewApi"})
    public void M0(View view, int i10, int i11, int i12, int i13) {
        if (J) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                J = false;
            }
        }
    }
}
