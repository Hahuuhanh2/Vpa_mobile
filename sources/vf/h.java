package vf;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import sf.b;

/* compiled from: ScaleDownAnimation */
public final class h extends g {
    public h(b.a aVar) {
        super(aVar);
    }

    public final PropertyValuesHolder g(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f23289g;
            i11 = (int) (((float) i10) * this.f23290h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i11 = this.f23289g;
            i10 = (int) (((float) i11) * this.f23290h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i11, i10});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
