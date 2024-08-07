package x7;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselOrientationHelper */
public final class e extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f17083b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f17083b = carouselLayoutManager;
    }

    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f10 = rectF2.left;
        float f11 = rectF3.left;
        if (f10 < f11 && rectF2.right > f11) {
            float f12 = f11 - f10;
            rectF.left += f12;
            rectF2.left += f12;
        }
        float f13 = rectF2.right;
        float f14 = rectF3.right;
        if (f13 > f14 && rectF2.left < f14) {
            float f15 = f13 - f14;
            rectF.right = Math.max(rectF.right - f15, rectF.left);
            rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
        }
    }

    public final float b(RecyclerView.LayoutParams layoutParams) {
        return (float) (layoutParams.rightMargin + layoutParams.leftMargin);
    }

    public final RectF c(float f10, float f11, float f12, float f13) {
        return new RectF(f13, 0.0f, f11 - f13, f10);
    }

    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f17083b;
        return carouselLayoutManager.f3061w - carouselLayoutManager.getPaddingBottom();
    }

    public final int e() {
        if (this.f17083b.d1()) {
            return 0;
        }
        return this.f17083b.f3060v;
    }

    public final int f() {
        return 0;
    }

    public final int g() {
        return this.f17083b.f3060v;
    }

    public final int h() {
        if (this.f17083b.d1()) {
            return this.f17083b.f3060v;
        }
        return 0;
    }

    public final int i() {
        return this.f17083b.getPaddingTop();
    }

    public final void j(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f17083b;
        int i12 = i();
        int d10 = d();
        carouselLayoutManager.getClass();
        RecyclerView.m.W(view, i10, i12, i11, d10);
    }

    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float floor = ((float) Math.floor((double) rectF.right)) - 1.0f;
            rectF.right = floor;
            rectF.left = Math.min(rectF.left, floor);
        }
        if (rectF2.left >= rectF3.right) {
            float ceil = ((float) Math.ceil((double) rectF.left)) + 1.0f;
            rectF.left = ceil;
            rectF.right = Math.max(ceil, rectF.right);
        }
    }

    public final void l(float f10, float f11, Rect rect, View view) {
        view.offsetLeftAndRight((int) (f11 - (((float) rect.left) + f10)));
    }
}
