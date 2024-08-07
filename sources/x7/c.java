package x7;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import d.i;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f17081a;

    public /* synthetic */ c(CarouselLayoutManager carouselLayoutManager) {
        this.f17081a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CarouselLayoutManager carouselLayoutManager = this.f17081a;
        carouselLayoutManager.getClass();
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            view.post(new i(carouselLayoutManager, 14));
        }
    }
}
