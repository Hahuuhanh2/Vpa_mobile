package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: VerticalShutTransformation */
public final class u implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setCameraDistance(1.0E9f);
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
            view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 180.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * -180.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
