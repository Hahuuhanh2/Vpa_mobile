package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: ZoomOutTransformation */
public final class v implements SliderPager.k {
    public final void a(View view, float f10) {
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 1.0f) {
            view.setScaleX(Math.max(0.65f, 1.0f - Math.abs(f10)));
            view.setScaleY(Math.max(0.65f, 1.0f - Math.abs(f10)));
            view.setAlpha(Math.max(0.3f, 1.0f - Math.abs(f10)));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
