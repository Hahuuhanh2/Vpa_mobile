package r0;

import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;
import d.i;
import g0.m;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14460b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f14459a = i10;
        this.f14460b = obj;
    }

    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f14459a) {
            case 0:
                PreviewView previewView = (PreviewView) this.f14460b;
                int i18 = PreviewView.f1453t;
                previewView.getClass();
                int i19 = i12 - i10;
                boolean z10 = true;
                if (i19 == i16 - i14 && i13 - i11 == i17 - i15) {
                    z10 = false;
                }
                if (z10) {
                    previewView.a();
                    m.a();
                    previewView.getViewPort();
                    return;
                }
                return;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f14460b;
                carouselLayoutManager.getClass();
                if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
                    view.post(new i(carouselLayoutManager, 14));
                    return;
                }
                return;
        }
    }
}
