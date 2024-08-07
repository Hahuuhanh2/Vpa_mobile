package w7;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: MaterialCardViewHelper */
public final class b extends InsetDrawable {
    public b(Drawable drawable, int i10, int i11, int i12, int i13) {
        super(drawable, i10, i11, i12, i13);
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
