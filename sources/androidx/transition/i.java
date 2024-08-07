package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* compiled from: TransitionUtils */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3497a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3498b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3499c;

    /* compiled from: TransitionUtils */
    public static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a  reason: collision with root package name */
        public final float[] f3500a = new float[9];

        /* renamed from: b  reason: collision with root package name */
        public final float[] f3501b = new float[9];

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f3502c = new Matrix();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            ((Matrix) obj).getValues(this.f3500a);
            ((Matrix) obj2).getValues(this.f3501b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f3501b;
                float f11 = fArr[i10];
                float f12 = this.f3500a[i10];
                fArr[i10] = android.support.v4.media.a.e(f11, f12, f10, f12);
            }
            this.f3502c.setValues(this.f3501b);
            return this.f3502c;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 28) {
            z10 = false;
        }
        f3499c = z10;
    }
}
