package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: FadeTransformation */
public final class j implements SliderPager.k {
    public final void a(View view, float f10) {
        float f11;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 <= 0 || f10 <= 1.0f) {
            if (i10 <= 0) {
                f11 = f10 + 1.0f;
            } else {
                f11 = 1.0f - f10;
            }
            view.setAlpha(f11);
        } else if (f10 == 0.0f) {
            view.setAlpha(1.0f);
        }
    }
}
