package i8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.n0;
import k1.a;

/* compiled from: MaterialResources */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = a.getColorStateList(context, resourceId)) == null) {
            return typedArray.getColorStateList(i10);
        }
        return colorStateList;
    }

    public static ColorStateList b(Context context, n0 n0Var, int i10) {
        int i11;
        ColorStateList colorStateList;
        if (!n0Var.l(i10) || (i11 = n0Var.i(i10, 0)) == 0 || (colorStateList = a.getColorStateList(context, i11)) == null) {
            return n0Var.b(i10);
        }
        return colorStateList;
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable a10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = h.a.a(context, resourceId)) == null) {
            return typedArray.getDrawable(i10);
        }
        return a10;
    }

    public static boolean e(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
