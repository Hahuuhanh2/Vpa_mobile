package dg;

import android.view.View;
import com.smarteist.autoimageslider.SliderPager;

/* compiled from: CubeInRotationTransformation */
public final class d implements SliderPager.k {
    public final void a(View view, float f10) {
        view.setCameraDistance(20000.0f);
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f10 <= 0.0f) {
            view.setAlpha(1.0f);
            view.setPivotX((float) view.getWidth());
            view.setRotationY(Math.abs(f10) * 90.0f);
        } else if (f10 <= 1.0f) {
            view.setAlpha(1.0f);
            view.setPivotX(0.0f);
            view.setRotationY(Math.abs(f10) * -90.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
