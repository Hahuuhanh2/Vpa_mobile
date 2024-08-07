package i3;

import android.animation.TypeEvaluator;
import android.support.v4.media.a;

/* compiled from: FloatArrayEvaluator */
public final class c implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f11033a;

    public c(float[] fArr) {
        this.f11033a = fArr;
    }

    public final Object evaluate(float f10, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.f11033a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i10 = 0; i10 < fArr3.length; i10++) {
            float f11 = fArr[i10];
            fArr3[i10] = a.e(fArr2[i10], f11, f10, f11);
        }
        return fArr3;
    }
}
