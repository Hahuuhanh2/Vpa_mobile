package g0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.a;
import android.util.Size;

/* compiled from: TransformUtils */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f10263a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(int i10, RectF rectF, RectF rectF2, boolean z10) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f10263a;
        matrix.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
        matrix.postRotate((float) i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(Rect rect, Size size) {
        if (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean c(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException(a.m("Invalid rotation degrees: ", i10));
    }

    public static boolean d(Size size, boolean z10, Size size2) {
        float f10;
        float f11;
        if (z10) {
            f10 = ((float) size.getWidth()) / ((float) size.getHeight());
            f11 = f10;
        } else {
            f10 = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f11 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        float width = (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f);
        if (f10 < (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) || width < f11) {
            return false;
        }
        return true;
    }

    public static Size e(int i10, Size size) {
        boolean z10;
        if (i10 % 90 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("Invalid rotation degrees: " + i10, z10);
        if (c(((i10 % 360) + 360) % 360)) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static RectF f(Size size) {
        float f10 = (float) 0;
        return new RectF(f10, f10, (float) (size.getWidth() + 0), (float) (size.getHeight() + 0));
    }
}
