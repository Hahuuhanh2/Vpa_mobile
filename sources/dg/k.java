package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: FanTransformation */
public final class k implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setPivotX(0.0f);
        view.setPivotY((float) (view.getHeight() / 2));
        view.setCameraDistance(20000.0f);
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setRotationY(Math.abs(f10) * -120.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotationY(Math.abs(f10) * 120.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
