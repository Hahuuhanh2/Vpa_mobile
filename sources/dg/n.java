package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: HingeTransformation */
public final class n implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setRotation(Math.abs(f10) * 90.0f);
            view.setAlpha(1.0f - Math.abs(f10));
        } else if (f10 <= 1.0f) {
            view.setRotation(0.0f);
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
