package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.material.R$dimen;
import d.b;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: MaterialSideContainerBackHelper */
public final class i extends a<View> {

    /* renamed from: g  reason: collision with root package name */
    public final float f10065g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10066h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10067i;

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f10065g = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f10066h = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f10067i = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        b bVar = this.f10045f;
        this.f10045f = null;
        if (bVar != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f10041b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f10041b, View.SCALE_Y, new float[]{1.0f})});
            V v2 = this.f10041b;
            if (v2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v2;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
                }
            }
            animatorSet.setDuration((long) this.f10044e);
            animatorSet.start();
        }
    }

    public final void b(b bVar, int i10, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10;
        boolean z11;
        int i11;
        if (bVar.f8421d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        V v2 = this.f10041b;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if ((Gravity.getAbsoluteGravity(i10, d0.e.d(v2)) & 3) == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        float scaleX = this.f10041b.getScaleX() * ((float) this.f10041b.getWidth());
        ViewGroup.LayoutParams layoutParams = this.f10041b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z11) {
                i11 = marginLayoutParams.leftMargin;
            } else {
                i11 = marginLayoutParams.rightMargin;
            }
        } else {
            i11 = 0;
        }
        float f10 = scaleX + ((float) i11);
        V v10 = this.f10041b;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z11) {
            f10 = -f10;
        }
        fArr[0] = f10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v10, property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new q2.b());
        ofFloat.setDuration((long) t7.b.b(bVar.f8420c, this.f10042c, this.f10043d));
        ofFloat.addListener(new h(this, z10, i10));
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    public final void c(int i10, float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        float interpolation = this.f10040a.getInterpolation(f10);
        V v2 = this.f10041b;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean z12 = true;
        if ((Gravity.getAbsoluteGravity(i10, d0.e.d(v2)) & 3) == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = false;
        }
        int width = this.f10041b.getWidth();
        int height = this.f10041b.getHeight();
        float f14 = (float) width;
        if (f14 > 0.0f) {
            float f15 = (float) height;
            if (f15 > 0.0f) {
                float f16 = this.f10065g / f14;
                float f17 = this.f10066h / f14;
                float f18 = this.f10067i / f15;
                V v10 = this.f10041b;
                if (z11) {
                    f14 = 0.0f;
                }
                v10.setPivotX(f14);
                if (!z12) {
                    f17 = -f16;
                }
                LinearInterpolator linearInterpolator = t7.b.f14885a;
                float e10 = a.e(f17, 0.0f, interpolation, 0.0f);
                float f19 = e10 + 1.0f;
                this.f10041b.setScaleX(f19);
                float f20 = 1.0f - (((f18 - 0.0f) * interpolation) + 0.0f);
                this.f10041b.setScaleY(f20);
                V v11 = this.f10041b;
                if (v11 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) v11;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (z11) {
                            f11 = (float) (childAt.getWidth() + (width - childAt.getRight()));
                        } else {
                            f11 = (float) (-childAt.getLeft());
                        }
                        childAt.setPivotX(f11);
                        childAt.setPivotY((float) (-childAt.getTop()));
                        if (z12) {
                            f12 = 1.0f - e10;
                        } else {
                            f12 = 1.0f;
                        }
                        if (f20 != 0.0f) {
                            f13 = (f19 / f20) * f12;
                        } else {
                            f13 = 1.0f;
                        }
                        childAt.setScaleX(f12);
                        childAt.setScaleY(f13);
                    }
                }
            }
        }
    }
}
