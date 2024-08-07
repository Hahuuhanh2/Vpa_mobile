package t7;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty */
public final class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f14893a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final Object get(Object obj) {
        this.f14893a.set(((ImageView) obj).getImageMatrix());
        return this.f14893a;
    }

    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
