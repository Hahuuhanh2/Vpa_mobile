package q2;

import android.support.v4.media.a;
import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f14288a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14289b;

    public d(float[] fArr) {
        this.f14288a = fArr;
        this.f14289b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f14288a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f14289b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f14288a;
        float f13 = fArr2[min];
        return a.e(fArr2[min + 1], f13, f12, f13);
    }
}
