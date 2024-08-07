package x7;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper */
public final class d extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f17082b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f17082b = carouselLayoutManager;
    }

    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.top;
        float f11 = rectF3.top;
        if (f10 < f11 && rectF2.bottom > f11) {
            float f12 = f11 - f10;
            rectF.top += f12;
            rectF3.top += f12;
        }
        float f13 = rectF2.bottom;
        float f14 = rectF3.bottom;
        if (f13 > f14 && rectF2.top < f14) {
            float f15 = f13 - f14;
            rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
        }
    }

    public final float b(RecyclerView.LayoutParams layoutParams) {
        return (float) (layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(0.0f, f12, f11, f10 - f12);
    }

    public final int d() {
        return this.f17082b.f3061w;
    }

    public final int e() {
        return this.f17082b.f3061w;
    }

    public final int f() {
        return this.f17082b.getPaddingLeft();
    }

    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f17082b;
        return carouselLayoutManager.f3060v - carouselLayoutManager.getPaddingRight();
    }

    public final int h() {
        return 0;
    }

    public final int i() {
        return 0;
    }

    public final void j(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f17082b;
        int f10 = f();
        int g2 = g();
        carouselLayoutManager.getClass();
        RecyclerView.m.W(view, f10, i10, g2, i11);
    }

    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float floor = ((float) Math.floor((double) rectF.bottom)) - 1.0f;
            rectF.bottom = floor;
            rectF.top = Math.min(rectF.top, floor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float ceil = ((float) Math.ceil((double) rectF.top)) + 1.0f;
            rectF.top = ceil;
            rectF.bottom = Math.max(ceil, rectF.bottom);
        }
    }

    public final void l(float f10, float f11, Rect rect, View view) {
        view.offsetTopAndBottom((int) (f11 - (((float) rect.top) + f10)));
    }
}
