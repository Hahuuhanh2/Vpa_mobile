package j8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import n1.d;

/* compiled from: RippleUtils */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11722a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11723b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11724c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11725d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11726e = {16842910, 16842919};

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f11723b;
        return new ColorStateList(new int[][]{f11725d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f11724c), b(colorStateList, iArr), b(colorStateList, f11722a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        return d.d(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f11726e, 0));
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
