package i3;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29 */
public final class x extends w {
    public final float H0(View view) {
        return view.getTransitionAlpha();
    }

    public final void I0(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public final void J0(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public final void K0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void L0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void M0(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public final void t0(int i10, View view) {
        view.setTransitionVisibility(i10);
    }
}
