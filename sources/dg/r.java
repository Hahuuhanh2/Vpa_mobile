package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: SpinnerTransformation */
public final class r implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setCameraDistance(12000.0f);
        double d10 = (double) f10;
        if (d10 >= 0.5d || d10 <= -0.5d) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * 900.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * -900.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
