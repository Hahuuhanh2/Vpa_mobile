package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: TossTransformation */
public final class s implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setCameraDistance(20000.0f);
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
            view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
            view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
            view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 1080.0f);
            view.setTranslationY(Math.abs(f10) * -1000.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
            view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
            view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * -1080.0f);
            view.setTranslationY(Math.abs(f10) * -1000.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
