package i3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
public class u extends s {
    public static boolean G = true;
    public static boolean H = true;
    public static boolean I = true;

    @SuppressLint({"NewApi"})
    public void J0(View view, Matrix matrix) {
        if (G) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                G = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void K0(View view, Matrix matrix) {
        if (H) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                H = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void L0(View view, Matrix matrix) {
        if (I) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                I = false;
            }
        }
    }
}
