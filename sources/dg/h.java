package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: CubeOutScalingTransformation */
public final class h implements SliderPager.k {
    public final void a(View view, float f10) {
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setPivotX((float) view.getWidth());
            view.setRotationY(Math.abs(f10) * -90.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setPivotX(0.0f);
            view.setRotationY(Math.abs(f10) * 90.0f);
        } else {
            view.setAlpha(0.0f);
        }
        if (((double) Math.abs(f10)) <= 0.5d) {
            view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
        } else if (Math.abs(f10) <= 1.0f) {
            view.setScaleY(Math.max(0.4f, Math.abs(f10)));
        }
    }
}
