package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: PopTransformation */
public final class p implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (((double) Math.abs(f10)) < 0.5d) {
            view.setVisibility(0);
            view.setScaleX(1.0f - Math.abs(f10));
            view.setScaleY(1.0f - Math.abs(f10));
        } else if (((double) Math.abs(f10)) > 0.5d) {
            view.setVisibility(8);
        }
    }
}
