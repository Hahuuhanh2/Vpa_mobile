package f8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.material.R$dimen;
import q2.b;

/* compiled from: MaterialBottomContainerBackHelper */
public final class e extends a<View> {

    /* renamed from: g  reason: collision with root package name */
    public final float f10053g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10054h;

    public e(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f10053g = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f10054h = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f10041b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f10041b, View.SCALE_Y, new float[]{1.0f})});
        V v2 = this.f10041b;
        if (v2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public final void b(float f10) {
        float f11;
        float interpolation = this.f10040a.getInterpolation(f10);
        float width = (float) this.f10041b.getWidth();
        float height = (float) this.f10041b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f12 = this.f10053g / width;
            LinearInterpolator linearInterpolator = t7.b.f14885a;
            float e10 = 1.0f - a.e(f12, 0.0f, interpolation, 0.0f);
            float e11 = 1.0f - a.e(this.f10054h / height, 0.0f, interpolation, 0.0f);
            this.f10041b.setScaleX(e10);
            this.f10041b.setPivotY(height);
            this.f10041b.setScaleY(e11);
            V v2 = this.f10041b;
            if (v2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v2;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY((float) (-childAt.getTop()));
                    if (e11 != 0.0f) {
                        f11 = e10 / e11;
                    } else {
                        f11 = 1.0f;
                    }
                    childAt.setScaleY(f11);
                }
            }
        }
    }
}
