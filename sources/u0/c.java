package u0;

import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow */
public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f15037a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f15038b = 0;

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f15037a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
