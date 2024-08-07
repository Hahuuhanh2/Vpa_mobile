package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: DepthTransformation */
public final class i implements SliderPager.k {
    public final void a(View view, float f10) {
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f10 <= 1.0f) {
            view.setTranslationX((-f10) * ((float) view.getWidth()));
            view.setAlpha(1.0f - Math.abs(f10));
            view.setScaleX(1.0f - Math.abs(f10));
            view.setScaleY(1.0f - Math.abs(f10));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
