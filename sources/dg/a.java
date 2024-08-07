package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: AntiClockSpinTransformation */
public final class a implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (((double) Math.abs(f10)) < 0.5d) {
            view.setVisibility(0);
            view.setScaleX(1.0f - Math.abs(f10));
            view.setScaleY(1.0f - Math.abs(f10));
        } else if (((double) Math.abs(f10)) > 0.5d) {
            view.setVisibility(8);
        }
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setRotation((1.0f - Math.abs(f10)) * 360.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotation((1.0f - Math.abs(f10)) * -360.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
